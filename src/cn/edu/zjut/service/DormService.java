package cn.edu.zjut.service;

import cn.edu.zjut.dao.IDormDAO;
import cn.edu.zjut.po.DormEntity;

import java.util.Map;

public class DormService implements IDormService {
    private IDormDAO dormDAO = null;
    private Map<String, Object> request, session;

    public DormService() {
        System.out.println("create DormService.");
    }

    public IDormDAO getDormDAO() {
        return dormDAO;
    }

    public void setDormDAO(IDormDAO dormDAO) {
        this.dormDAO = dormDAO;
    }

    @Override
    public void search(String selectMethod, DormEntity dorm) {

    }

    @Override
    public void delete(DormEntity dorm) {

    }

    @Override
    public void add(DormEntity dorm) {

    }
}
