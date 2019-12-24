package cn.edu.zjut.dao;

import cn.edu.zjut.po.BuildingEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BuildingDAO extends BaseHibernateDAO implements IBuildingDAO {
    private Log log = LogFactory.getLog(AccountDAO.class);

    /**
     * insert building表
     *
     * @param transientInstance 要insert的building
     */
    public void save(BuildingEntity transientInstance) {
        Transaction tran = null;
        try (Session session = getSession()) {
            tran = session.beginTransaction();
            session.save(transientInstance);
            tran.commit();
        }
    }

    /**
     * select building表，用于登录
     *
     * @param building 要select的account，通过BuildingId
     * @return 查询结果
     */
    public List findByBuilding(BuildingEntity building) {
        log.debug("finding BuildingEntity instance by BuildingEntity");
        try {
            String hql = "from BuildingEntity where buildingId='" + building.getBuildingId() + "'";
            Query queryObject = getSession().createQuery(hql);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by BuildingEntity failed", re);
            throw re;
        }
    }

    /**
     * 查询building表中所有字段
     *
     * @return 查询结果
     */
    public List findAll() {
        log.debug("finding BuildingEntity instance by BuildingEntity");
        try {
            String hql = "from BuildingEntity";
            Query queryObject = getSession().createQuery(hql);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by BuildingEntity failed", re);
            throw re;
        }
    }

    /***
     * 删除building
     * @param building 要删除的对象
     * @return delete方法执行结果
     */
    public boolean delete(BuildingEntity building) {
        log.debug("deleting BuildingEntity instance by BuildingEntity");
        Transaction tran = null;
        try (Session session = getSession()) {
            tran = session.beginTransaction();
            session.delete(building);
            tran.commit();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
