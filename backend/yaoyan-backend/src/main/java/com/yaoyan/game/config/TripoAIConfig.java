package com.yaoyan.game.config;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class TripoAIConfig {

    @Value("${trioai.api-key}")
    private String apiKey;

    @Value("${trioai.base-url}")
    private String baseUrl;

    @Bean
    public OkHttpClient tripokhttpClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder()
                            .addHeader("Authorization", "Bearer " + apiKey)
                            .build();
                    return chain.proceed(request);
                })
                .build();
    }
}
