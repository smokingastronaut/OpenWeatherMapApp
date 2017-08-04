package shiriyazdanov_marat.openweathermapapp;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import shiriyazdanov_marat.openweathermapapp.api.WeatherApi;

/**
 * Created by Ayrat on 04.08.2017.
 */

public class WeatherApp extends Application {

    private static WeatherApi mWeatherApi;

    @Override
    public void onCreate() {
        super.onCreate();
        initApi();
    }

    private void initApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WeatherApi.WEATHER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mWeatherApi = retrofit.create(WeatherApi.class);
    }

    public static WeatherApi getWeatherApi() {
        return mWeatherApi;
    }
}
