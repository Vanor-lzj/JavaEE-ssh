package cn.edu.zjut.dao;

import cn.edu.zjut.po.DormEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

public class DormDAO extends BaseHibernateDAO implements IDormDAO {
    private Log log = LogFactory.getLog(DormDAO.class);

    @Override
    public boolean save(DormEntity transientInstance) {
        return false;
    }

    @Override
    public List findByDorm(DormEntity dorm) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public boolean delete(DormEntity dorm) {
        return false;
    }
}
