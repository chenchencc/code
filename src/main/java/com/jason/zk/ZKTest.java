package com.jason.zk;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;

import java.util.List;

public class ZKTest {

    public void test() throws InterruptedException {
        ZkClient zkClient = new ZkClient("127.0.0.1:2181", 5000);
        String path = "/zk-book";





        //监测子节点变化
        zkClient.subscribeChildChanges(path, new IZkChildListener() {
            @Override
            public void handleChildChange(String parentPath, List<String> currentChild)
                    throws Exception {
                System.out.println(parentPath + " 's child changed ,currentChilds: " + currentChild);
            }
        });


        //创建节点
        zkClient.createPersistent(path);
        Thread.sleep(1000);
        System.out.println(zkClient.getChildren(path));
        Thread.sleep(1000);
        zkClient.createPersistent(path + "/c1");
        Thread.sleep(1000);
        System.out.println(zkClient.getChildren(path));
        Thread.sleep(1000);
        zkClient.createPersistent(path + "/c2","123");
        Thread.sleep(1000);
        System.out.println(zkClient.getChildren(path));

        //删除节点
        Thread.sleep(1000);
        zkClient.delete(path + "/c1");
        Thread.sleep(1000);
        System.out.println(zkClient.getChildren(path));
        zkClient.delete(path + "/c2");
        System.out.println(zkClient.getChildren(path));
        Thread.sleep(1000);
    }
}
