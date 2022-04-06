
package com.example.openweatherapps.model.onecall;

import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Hourly implements Parcelable
{

    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("feels_like")
    @Expose
    private Double feelsLike;
    @SerializedName("pressure")
    @Expose
    private Integer pressure;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("dew_point")
    @Expose
    private Double dewPoint;
    @SerializedName("uvi")
    @Expose
    private Integer uvi;
    @SerializedName("clouds")
    @Expose
    private Integer clouds;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
    @SerializedName("wind_speed")
    @Expose
    private Double windSpeed;
    @SerializedName("wind_deg")
    @Expose
    private Integer windDeg;
    @SerializedName("wind_gust")
    @Expose
    private Double windGust;
    @SerializedName("weather")
    @Expose
    private List<Weather__1> weather = null;
    @SerializedName("pop")
    @Expose
    private Integer pop;
    @SerializedName("rain")
    @Expose
    private Rain rain;
    public final static Creator<Hourly> CREATOR = new Creator<Hourly>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Hourly createFromParcel(android.os.Parcel in) {
            return new Hourly(in);
        }

        public Hourly[] newArray(int size) {
            return (new Hourly[size]);
        }

    }
    ;

    protected Hourly(android.os.Parcel in) {
        this.dt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.temp = ((Double) in.readValue((Double.class.getClassLoader())));
        this.feelsLike = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pressure = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.humidity = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dewPoint = ((Double) in.readValue((Double.class.getClassLoader())));
        this.uvi = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.clouds = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.visibility = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.windSpeed = ((Double) in.readValue((Double.class.getClassLoader())));
        this.windDeg = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.windGust = ((Double) in.readValue((Double.class.getClassLoader())));
        in.readList(this.weather, (com.example.openweatherapps.model.onecall.Weather__1.class.getClassLoader()));
        this.pop = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.rain = ((Rain) in.readValue((Rain.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hourly() {
    }

    /**
     * 
     * @param rain
     * @param temp
     * @param visibility
     * @param windGust
     * @param uvi
     * @param pressure
     * @param clouds
     * @param dewPoint
     * @param dt
     * @param feelsLike
     * @param windDeg
     * @param pop
     * @param weather
     * @param humidity
     * @param windSpeed
     */
    public Hourly(Integer dt, Double temp, Double feelsLike, Integer pressure, Integer humidity, Double dewPoint, Integer uvi, Integer clouds, Integer visibility, Double windSpeed, Integer windDeg, Double windGust, List<Weather__1> weather, Integer pop, Rain rain) {
        super();
        this.dt = dt;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.uvi = uvi;
        this.clouds = clouds;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windGust = windGust;
        this.weather = weather;
        this.pop = pop;
        this.rain = rain;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Integer getUvi() {
        return uvi;
    }

    public void setUvi(Integer uvi) {
        this.uvi = uvi;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(Integer windDeg) {
        this.windDeg = windDeg;
    }

    public Double getWindGust() {
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

    public List<Weather__1> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather__1> weather) {
        this.weather = weather;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hourly.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dt");
        sb.append('=');
        sb.append(((this.dt == null)?"<null>":this.dt));
        sb.append(',');
        sb.append("temp");
        sb.append('=');
        sb.append(((this.temp == null)?"<null>":this.temp));
        sb.append(',');
        sb.append("feelsLike");
        sb.append('=');
        sb.append(((this.feelsLike == null)?"<null>":this.feelsLike));
        sb.append(',');
        sb.append("pressure");
        sb.append('=');
        sb.append(((this.pressure == null)?"<null>":this.pressure));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');
        sb.append("dewPoint");
        sb.append('=');
        sb.append(((this.dewPoint == null)?"<null>":this.dewPoint));
        sb.append(',');
        sb.append("uvi");
        sb.append('=');
        sb.append(((this.uvi == null)?"<null>":this.uvi));
        sb.append(',');
        sb.append("clouds");
        sb.append('=');
        sb.append(((this.clouds == null)?"<null>":this.clouds));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("windDeg");
        sb.append('=');
        sb.append(((this.windDeg == null)?"<null>":this.windDeg));
        sb.append(',');
        sb.append("windGust");
        sb.append('=');
        sb.append(((this.windGust == null)?"<null>":this.windGust));
        sb.append(',');
        sb.append("weather");
        sb.append('=');
        sb.append(((this.weather == null)?"<null>":this.weather));
        sb.append(',');
        sb.append("pop");
        sb.append('=');
        sb.append(((this.pop == null)?"<null>":this.pop));
        sb.append(',');
        sb.append("rain");
        sb.append('=');
        sb.append(((this.rain == null)?"<null>":this.rain));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(dt);
        dest.writeValue(temp);
        dest.writeValue(feelsLike);
        dest.writeValue(pressure);
        dest.writeValue(humidity);
        dest.writeValue(dewPoint);
        dest.writeValue(uvi);
        dest.writeValue(clouds);
        dest.writeValue(visibility);
        dest.writeValue(windSpeed);
        dest.writeValue(windDeg);
        dest.writeValue(windGust);
        dest.writeList(weather);
        dest.writeValue(pop);
        dest.writeValue(rain);
    }

    public int describeContents() {
        return  0;
    }

}
