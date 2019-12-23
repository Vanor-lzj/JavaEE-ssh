package cn.edu.zjut.service;

import cn.edu.zjut.po.BuildingEntity;

import java.util.List;

public interface IBuildingService {
    List<BuildingEntity> search(String selectMethod, BuildingEntity building);
}
