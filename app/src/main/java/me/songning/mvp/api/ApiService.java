package me.songning.mvp.api;

import java.util.Map;

import me.songning.mvp.bean.Gank;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Nicholas on 2016/10/30.
 */

public interface ApiService {

    String BASE_URL="http://gank.io/";

    /**
     * 代表一个具体的请求接口 GET表示get请求，POST注解表示post请求，括号里的值代表请求的具体指向，和BASE_URL拼接一起组成完整的请求地址
     * @param page
     * @return
     */
    @GET("api/data/Android/10/{page}")
    Observable<Gank> getGank(@Path("page") String page);



    @FormUrlEncoded
    @POST("")
    Observable<Gank> getGank(@FieldMap Map<String,String> map);

}
