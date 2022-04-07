
package com.example.openweatherapps.model.onecall;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Minutely implements Parcelable
{

    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("precipitation")
    @Expose
    private Integer precipitation;
    public final static Creator<Minutely> CREATOR = new Creator<Minutely>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Minutely createFromParcel(android.os.Parcel in) {
            return new Minutely(in);
        }

        public Minutely[] newArray(int size) {
            return (new Minutely[size]);
        }

    }
    ;

    protected Minutely(android.os.Parcel in) {
        this.dt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.precipitation = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Minutely() {
    }

    /**
     * 
     * @param dt
     * @param precipitation
     */
    public Minutely(Integer dt, Integer precipitation) {
        super();
        this.dt = dt;
        this.precipitation = precipitation;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Integer getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Integer precipitation) {
        this.precipitation = precipitation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Minutely.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dt");
        sb.append('=');
        sb.append(((this.dt == null)?"<null>":this.dt));
        sb.append(',');
        sb.append("precipitation");
        sb.append('=');
        sb.append(((this.precipitation == null)?"<null>":this.precipitation));
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
        dest.writeValue(precipitation);
    }

    public int describeContents() {
        return  0;
    }

}
