package com.example.openweatherapps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.openweatherapps.R;
import com.example.openweatherapps.model.Mantap;

public class WeatherAdapter  extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>{
    private Context context;
    private Mantap weather;

    public WeatherAdapter(Context context, Mantap weather) {
        this.context = context;
        this.weather = weather;
    }

    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.weather_item,parent,false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
        holder.txtDescription.setText(weather.getWeather().get(position).getDescription());
        holder.txtMain.setText(weather.getWeather().get(position).getMain());
        holder.txtTemp.setText(String.valueOf(weather.getMain().getTemp()));
        holder.txtHumidity.setText(String.valueOf(weather.getMain().getHumidity()));

        Glide.with(context).load("http://openweathermap.org/img/wn/"+
                weather.getWeather().get(position).getIcon()+".png")
        .into(holder.iconWeather);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {
        ImageView iconWeather;
        TextView txtMain,txtDescription,txtTemp,txtHumidity;

        public WeatherViewHolder(@NonNull View itemView) {
            super(itemView);
            iconWeather=itemView.findViewById(R.id.iconWeather);
            txtMain=itemView.findViewById(R.id.txtMain);
            txtDescription=itemView.findViewById(R.id.txtDescription);
            txtTemp=itemView.findViewById(R.id.txtTemp);
            txtHumidity=itemView.findViewById(R.id.txtHumidity);
        }
    }
}
