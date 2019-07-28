package com.czjk.api.db;

import com.czjk.api.time.DateUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;
import java.util.LinkedList;

public class HbaseUtils {
    private static LinkedList<Connection> pool = new LinkedList<>();

    static {
        Configuration conf = HBaseConfiguration.create();
        for(int i=0;i<10;i++){
            try {
                pool.push(ConnectionFactory.createConnection(conf));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static  Connection getHbaseConnection(){
        while(pool.isEmpty()){
            DateUtils.sleep(10000);
        }
        return pool.poll();
    }

    public static void release(Connection connection){
        pool.push(connection);
    }
}
