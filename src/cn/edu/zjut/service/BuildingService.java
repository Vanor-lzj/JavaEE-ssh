package cn.edu.zjut.service;

import cn.edu.zjut.dao.IBuildingDAO;
import cn.edu.zjut.po.BuildingEntity;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;
import java.util.Map;

public class BuildingService implements IBuildingService {

    private IBuildingDAO buildingDAO = null;
    private Map<String, Object> request, session;

    public BuildingService() {
        System.out.println("create BuildingService.");
    }

    public IBuildingDAO getBuildingDAO() {
        return buildingDAO;
    }

    public void setBuildingDAO(IBuildingDAO buildingDAO) {
        this.buildingDAO = buildingDAO;
    }

    /**
     *
     * @param selectMethod 搜索模式
     * @param building 要搜索的building
     * @return 搜索结果
     */

    public List<BuildingEntity> search(String selectMethod, BuildingEntity building) {
        List list = null;
        System.out.println("execute --search()-- method.");
        if(selectMethod.equals("all")){
            list=(List<BuildingEntity>) buildingDAO.findAll();

        }
        else if(selectMethod.equals("id")){
            list=(List<BuildingEntity>)buildingDAO.findByBuilding(building);
        }
        return list;
    }
}
