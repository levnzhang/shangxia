package com.baizhi.service;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminDao ad;

    @Override
    public Map<String,String> login(String name, String password) {
        Admin admin = ad.selectByPrimaryKey(name);
        Map<String,String> map=new HashMap<>();
        if(admin==null){
            map.put("zhuangtai","400");
        }else if(!admin.getPassword().equals(password)){
            map.put("zhuangtai","300");
        }else{
            map.put("zhuangtai","200");
        }
        return map;
    }
}
