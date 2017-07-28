package shiriyazdanov_marat.openweathermapapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Marat_2 on 28.07.2017.
 */

public interface WeatherApi {
    @GET("weather")
    Call<CurrentWeather> getData(@Query("id") String cityId);
}