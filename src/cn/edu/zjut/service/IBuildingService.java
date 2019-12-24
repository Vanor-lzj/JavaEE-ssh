package cn.edu.zjut.service;

import cn.edu.zjut.po.BuildingEntity;

import java.util.List;

public interface IBuildingService {
    void search(String selectMethod, BuildingEntity building);

    void delete(BuildingEntity building);

    void add(BuildingEntity building);
}
