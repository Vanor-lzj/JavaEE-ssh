package cn.edu.zjut.dao;

import cn.edu.zjut.po.BuildingEntity;

import java.util.List;

public interface IBuildingDAO {
    void save(BuildingEntity transientInstance);
    List findByBuilding(BuildingEntity building);
    List findAll();
    boolean delete(BuildingEntity building);
}
