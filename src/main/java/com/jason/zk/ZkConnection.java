package com.jason.zk;

import org.I0Itec.zkclient.ZkClient;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class ZkConnection {

    private static Deque<ZkClient> deque = new LinkedBlockingDeque<>();

    public static ZkClient create(){
            ZkClient zkClient = new ZkClient("127.0.0.1:2181", 5000);
            System.out.println("create zk connection");
            deque.offer(zkClient);
            return zkClient;
    }

    public static ZkClient  getConn(){
        if (deque.isEmpty())
            return create();
        return deque.poll();
    }

    private ZkConnection(){}

    public void close(ZkClient zkClient){
        deque.offer(zkClient);
    }
}
