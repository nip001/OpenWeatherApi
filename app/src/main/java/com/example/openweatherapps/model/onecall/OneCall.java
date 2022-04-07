
package com.example.openweatherapps.model.onecall;

import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class OneCall implements Parcelable
{

    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("timezone_offset")
    @Expose
    private Integer timezoneOffset;
    @SerializedName("current")
    @Expose
    private Current current;
    @SerializedName("minutely")
    @Expose
    private List<Minutely> minutely = null;
    @SerializedName("hourly")
    @Expose
    private List<Hourly> hourly = null;
    @SerializedName("daily")
    @Expose
    private List<Daily> daily = null;
    public final static Creator<OneCall> CREATOR = new Creator<OneCall>() {


        @SuppressWarnings({
            "unchecked"
        })
        public OneCall createFromParcel(android.os.Parcel in) {
            return new OneCall(in);
        }

        public OneCall[] newArray(int size) {
            return (new OneCall[size]);
        }

    }
    ;

    protected OneCall(android.os.Parcel in) {
        this.lat = ((Double) in.readValue((Double.class.getClassLoader())));
        this.lon = ((Double) in.readValue((Double.class.getClassLoader())));
        this.timezone = ((String) in.readValue((String.class.getClassLoader())));
        this.timezoneOffset = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.current = ((Current) in.readValue((Current.class.getClassLoader())));
        in.readList(this.minutely, (com.example.openweatherapps.model.onecall.Minutely.class.getClassLoader()));
        in.readList(this.hourly, (com.example.openweatherapps.model.onecall.Hourly.class.getClassLoader()));
        in.readList(this.daily, (com.example.openweatherapps.model.onecall.Daily.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public OneCall() {
    }

    /**
     * 
     * @param current
     * @param timezoneOffset
     * @param timezone
     * @param daily
     * @param lon
     * @param hourly
     * @param minutely
     * @param lat
     */
    public OneCall(Double lat, Double lon, String timezone, Integer timezoneOffset, Current current, List<Minutely> minutely, List<Hourly> hourly, List<Daily> daily) {
        super();
        this.lat = lat;
        this.lon = lon;
        this.timezone = timezone;
        this.timezoneOffset = timezoneOffset;
        this.current = current;
        this.minutely = minutely;
        this.hourly = hourly;
        this.daily = daily;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public List<Minutely> getMinutely() {
        return minutely;
    }

    public void setMinutely(List<Minutely> minutely) {
        this.minutely = minutely;
    }

    public List<Hourly> getHourly() {
        return hourly;
    }

    public void setHourly(List<Hourly> hourly) {
        this.hourly = hourly;
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public void setDaily(List<Daily> daily) {
        this.daily = daily;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OneCall.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');
        sb.append("lon");
        sb.append('=');
        sb.append(((this.lon == null)?"<null>":this.lon));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("timezoneOffset");
        sb.append('=');
        sb.append(((this.timezoneOffset == null)?"<null>":this.timezoneOffset));
        sb.append(',');
        sb.append("current");
        sb.append('=');
        sb.append(((this.current == null)?"<null>":this.current));
        sb.append(',');
        sb.append("minutely");
        sb.append('=');
        sb.append(((this.minutely == null)?"<null>":this.minutely));
        sb.append(',');
        sb.append("hourly");
        sb.append('=');
        sb.append(((this.hourly == null)?"<null>":this.hourly));
        sb.append(',');
        sb.append("daily");
        sb.append('=');
        sb.append(((this.daily == null)?"<null>":this.daily));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(lat);
        dest.writeValue(lon);
        dest.writeValue(timezone);
        dest.writeValue(timezoneOffset);
        dest.writeValue(current);
        dest.writeList(minutely);
        dest.writeList(hourly);
        dest.writeList(daily);
    }

    public int describeContents() {
        return  0;
    }

}
