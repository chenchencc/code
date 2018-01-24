package com.jason.zk;

import org.I0Itec.zkclient.ZkClient;

import java.io.IOException;

public class ZkCreateZNode {
    public static void main(String[] args) throws IOException {
        Thread t1 = new Thread(new Create());
        Thread t2 = new Thread(new Create());
        t1.setName("ffffffffffffffffffffffff");
        t2.setName("eeeeeeeeeeeeeeeeeeeeeeeeeeee");
        t1.start();
        t2.start();
        System.in.read();
    }
}

class Create implements Runnable{

    @Override
    public void run() {
        ZkClient zkClient = ZkConnection.getConn();
        if (zkClient!=null){
            try {
                zkClient.createEphemeral("/jason/x-lock");
            }catch (Exception e){}
        }
    }
}
