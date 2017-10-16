package com.giit.www.system.service;

import com.giit.www.entity.Sky;

import java.util.List;

/**
 * author sky
 */
public interface SkyBiz {
    public List<Sky> gameList();

    public void add(Sky sky);
    public void delete(String game_id);
}
