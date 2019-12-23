package cn.edu.zjut.service;

import cn.edu.zjut.dao.IBuildingDAO;
import cn.edu.zjut.po.BuildingEntity;

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

    public boolean search(BuildingEntity building) {

        return false;
    }
}
