package com.industrial.subway.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by sorlti6952 on 16. 11. 1..
 */
public interface RequestService {
    @GET("/api/subway/{key}/json/shortestRoute/0/5/{src}/{dst}")
    Call<RootClass> getRequest(
            @Path("key") String key,
            @Path("src") String src,
            @Path("dst") String dst
    );
}
