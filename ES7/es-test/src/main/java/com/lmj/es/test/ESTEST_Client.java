package com.lmj.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

/**
 * @projectName: es-test
 * @package: com.lmj.es.test
 * @className: ESTEST_Client
 * @author: lmj
 * @description: TODO
 * @date: 2023/9/11 15:22
 * @version: 1.0
 */
public class ESTEST_Client {
    public static void main(String[] args) throws IOException {
        
        // 创建ES客户端
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );
        System.out.println(esClient);
        // 关闭ES客户端
        esClient.close();

    }

}
