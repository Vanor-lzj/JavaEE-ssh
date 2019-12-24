package cn.edu.zjut.dao;

import cn.edu.zjut.po.DormEntity;

import java.util.List;

public interface IDormDAO {
    boolean save(DormEntity transientInstance);
    List findByDorm(DormEntity dorm);
    List findAll();
    boolean delete(DormEntity dorm);
}
