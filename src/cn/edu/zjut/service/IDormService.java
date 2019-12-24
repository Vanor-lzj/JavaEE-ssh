package cn.edu.zjut.service;

import cn.edu.zjut.po.DormEntity;

public interface IDormService {
    void search(String selectMethod, DormEntity dorm);

    void delete(DormEntity dorm);

    void add(DormEntity dorm);
}
