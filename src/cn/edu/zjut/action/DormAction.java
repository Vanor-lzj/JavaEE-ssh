package cn.edu.zjut.action;

import cn.edu.zjut.po.DormEntity;
import cn.edu.zjut.service.IDormService;

public class DormAction {
    private String selectMethod;
    private DormEntity dorm;
    private IDormService dormService = null;

    public String getSelectMethod() {
        return selectMethod;
    }

    public void setSelectMethod(String selectMethod) {
        this.selectMethod = selectMethod;
    }

    public DormEntity getDorm() {
        return dorm;
    }

    public void setDorm(DormEntity dorm) {
        this.dorm = dorm;
    }

    public IDormService getDormService() {
        return dormService;
    }

    public void setDormService(IDormService dormService) {
        this.dormService = dormService;
    }
}
