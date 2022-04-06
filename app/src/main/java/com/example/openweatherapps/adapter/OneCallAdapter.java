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
import com.example.openweatherapps.model.onecall.Hourly;

import java.util.List;

public class OneCallAdapter extends RecyclerView.Adapter<OneCallAdapter.OneCallViewHolder>{
    private Context context;
    private List<Hourly> hourly;

    public OneCallAdapter(Context context, List<Hourly>  hourly) {
        this.context = context;
        this.hourly = hourly;
    }

    @NonNull
    @Override
    public OneCallViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.weather_item,parent,false);
        return new OneCallViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OneCallViewHolder holder, int position) {

        holder.txtDescription.setText(hourly.get(position).getWeather().get(0).getDescription());
        holder.txtMain.setText(hourly.get(position).getWeather().get(0).getMain());
        holder.txtTemp.setText(String.valueOf(hourly.get(position).getTemp()));
        holder.txtHumidity.setText(String.valueOf(hourly.get(position).getHumidity()));

        Glide.with(context).load("http://openweathermap.org/img/wn/"+
                hourly.get(position).getWeather().get(0).getIcon()+".png")
                .into(holder.iconWeather);
    }

    @Override
    public int getItemCount() {
        return hourly.size();
    }

    public class OneCallViewHolder extends RecyclerView.ViewHolder {
        ImageView iconWeather;
        TextView txtMain,txtDescription,txtTemp,txtHumidity;

        public OneCallViewHolder(@NonNull View itemView) {
            super(itemView);
            iconWeather=itemView.findViewById(R.id.iconWeather);
            txtMain=itemView.findViewById(R.id.txtMain);
            txtDescription=itemView.findViewById(R.id.txtDescription);
            txtTemp=itemView.findViewById(R.id.txtTemp);
            txtHumidity=itemView.findViewById(R.id.txtHumidity);
        }
    }
}
