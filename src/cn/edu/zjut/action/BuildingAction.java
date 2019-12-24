package cn.edu.zjut.action;


import cn.edu.zjut.po.BuildingEntity;
import cn.edu.zjut.service.IBuildingService;

import java.util.List;

public class BuildingAction {
    private String selectMethod;
    private BuildingEntity building;
    private IBuildingService buildingService = null;
    private List<BuildingEntity> list;

    /**
     * 搜索
     * @return result
     */
    public String search() {
        list=buildingService.search(selectMethod,building);
        return "success";
    }

    /**
     * 删除
     * @return result
     */
    public String delete(){
        buildingService.delete(building);
        return  "success";
    }

    /**
     * 添加
     * @return result
     */
    public String add(){
        buildingService.add(building);
        return "success";
    }

    public List<BuildingEntity> getList() {
        return list;
    }

    public void setList(List<BuildingEntity> list) {
        this.list = list;
    }

    public String getSelectMethod() {
        return selectMethod;
    }

    public void setSelectMethod(String selectMethod) {
        this.selectMethod = selectMethod;
    }

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


}
