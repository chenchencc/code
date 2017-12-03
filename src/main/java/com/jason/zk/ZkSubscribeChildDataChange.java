package com.jason.zk;

import org.I0Itec.zkclient.IZkDataListener;

/**
 * 用于订阅子节点上的数据信息发生变更的情况如：删除数据、创建数据
 */
public class ZkSubscribeChildDataChange implements IZkDataListener {
    @Override
    public void handleDataChange(String s, Object o) throws Exception {

    }

    @Override
    public void handleDataDeleted(String s) throws Exception {

    }
}
