package shiriyazdanov_marat.openweathermapapp.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Created by Marat_2 on 28.07.2017.
 */
public class CurrentWeather {

    @SerializedName("main")
    private Main mainData;
    @SerializedName("wind")
    private Wind windData;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentWeather that = (CurrentWeather) o;
        return Objects.equals(mainData, that.mainData) &&
                Objects.equals(windData, that.windData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainData, windData);
    }

    @Override
    public String toString() {
        return "CurrentWeather{" +
                "mainData=" + mainData +
                ", windData=" + windData +
                '}';
    }
}
