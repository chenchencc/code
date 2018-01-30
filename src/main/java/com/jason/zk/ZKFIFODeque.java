package com.jason.zk;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.ZkConnection;
import org.apache.zookeeper.CreateMode;

public class ZKFIFODeque {

    public static void add(String data){
        ZkClient zkConnection = com.jason.zk.ZkConnection.getConn();
        if (!zkConnection.exists("/jason/d-queue")){
            zkConnection.create("/jason/d-queue",null, CreateMode.PERSISTENT);
        }
        zkConnection.createEphemeralSequential("/jason/d-queue/demo",data);
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++)
            add(i+"jason");

        for (String s:com.jason.zk.ZkConnection.getConn().getChildren("/jason/d-queue"))
            System.out.println(s);
    }
}
