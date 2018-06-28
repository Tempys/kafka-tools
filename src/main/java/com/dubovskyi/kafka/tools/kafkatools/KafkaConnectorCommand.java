package com.dubovskyi.kafka.tools.kafkatools;

import okhttp3.*;

import java.io.IOException;

public class KafkaConnectorCommand {


    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    String sendKafkaConnectorCommand(String url, String command) throws IOException {
        RequestBody body = RequestBody.create(null, new byte[]{});

        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }


    String deleteKafkaConnector(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .delete()
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    String getKafkaConnectorStatus(String url) throws IOException {

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
