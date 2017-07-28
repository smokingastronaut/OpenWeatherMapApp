package shiriyazdanov_marat.openweathermapapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Marat_2 on 28.07.2017.
 */

public class CurrentWeather {
    public class MainData{
        Double temp;
    }
    @SerializedName("main")
    private MainData mainData;
}
