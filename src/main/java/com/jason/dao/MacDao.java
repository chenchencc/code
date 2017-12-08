package com.jason.dao;

import com.jason.domain.BlackMacinfo;

import java.util.List;
import java.util.Map;

public interface MacDao {

    List<BlackMacinfo> getAll();

    void insert(BlackMacinfo blackMacinfo);

    String findByMac(Map<String,Object> map);
}
