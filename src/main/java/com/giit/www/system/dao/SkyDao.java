package com.giit.www.system.dao;

import com.giit.www.entity.Sky;

import java.util.List;

public interface SkyDao {

    public List<Sky> getGameList();

    public void add(Sky sky);

    public void delete(String game_id);
}
