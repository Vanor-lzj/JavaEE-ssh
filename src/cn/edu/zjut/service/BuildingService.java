package cn.edu.zjut.service;

import cn.edu.zjut.dao.IBuildingDAO;
import cn.edu.zjut.po.BuildingEntity;
import com.opensymphony.xwork2.ActionContext;

import java.util.List;
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

    /**
     *
     * @param selectMethod 搜索模式
     * @param building 要搜索的building
     * @return 搜索结果
     */

    public List<BuildingEntity> search(String selectMethod, BuildingEntity building) {
        List list = null;
        System.out.println("execute --search()-- method.");
        if(selectMethod.equals("all")){
            list=(List<BuildingEntity>) buildingDAO.findAll();

        }
        else if(selectMethod.equals("id")){
            list=(List<BuildingEntity>)buildingDAO.findByBuilding(building);
        }
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");
        if (list.isEmpty()) {
         request.put("tip","无对应记录，请检查输入！");
        }
        return list;
    }

    /***
     * 删除楼宇
     * @param building 要删除的building
     */
    public void delete(BuildingEntity building){
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");
        System.out.println("execute --delete()-- method.");
        if(buildingDAO.delete(building)){
            request.put("tip","删除楼宇成功！");
        }else {
            request.put("tip","删除楼宇失败！！");
        }
    }
}
