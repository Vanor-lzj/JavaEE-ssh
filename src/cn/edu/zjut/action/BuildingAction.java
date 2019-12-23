package cn.edu.zjut.action;


import cn.edu.zjut.po.BuildingEntity;
import cn.edu.zjut.service.IBuildingService;

public class BuildingAction {
    private BuildingEntity building;
    private IBuildingService buildingService = null;

    public BuildingEntity getBuilding() {
        return building;
    }

    public void setBuilding(BuildingEntity building) {
        this.building = building;
    }

    public IBuildingService getBuildingService() {
        return buildingService;
    }

    public void setBuildingService(IBuildingService buildingService) {
        this.buildingService = buildingService;
    }

    /**
     * 注册
     * @return result
     */
    public String search() {
        if(buildingService.search(building)){
            return "success";
        }
        return "fail";
    }
}
