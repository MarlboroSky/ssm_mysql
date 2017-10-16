package com.giit.www.system.service.impl;

import com.giit.www.entity.Sky;
import com.giit.www.system.dao.SkyDao;
import com.giit.www.system.service.SkyBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class SkyBizImpl implements SkyBiz {
    @Resource
    private SkyDao skyDao;

    @Override
    public List<Sky> gameList() {
        List<Sky> gameList = skyDao.getGameList();
        return gameList;
    }

    public void add(Sky sky){
        String guid = UUID.randomUUID().toString().replace("-","");//用来生成数据库的主键id非常不错
        sky.setGame_id(guid);
        skyDao.add(sky);
    }

    public void delete(String game_id){
        skyDao.delete(game_id);
    }

}
