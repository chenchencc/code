package com.jason.zk;

import org.I0Itec.zkclient.IZkChildListener;

import java.util.List;

public class ZkSubscribeChildChange implements IZkChildListener {
    /**
     * 用于订阅节点的信息改变(创建节点、删除节点、添加节点)
     * @param s
     * @param list
     * @throws Exception
     */
    @Override
    public void handleChildChange(String s, List<String> list) throws Exception {

    }
}
