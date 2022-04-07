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
import com.example.openweatherapps.model.onecall.OneCall;

public class OneCallAdapter extends RecyclerView.Adapter<OneCallAdapter.OneCallViewHolder>{
    private Context context;
    private OneCall onecall;

    public OneCallAdapter(Context context, OneCall  onecall) {
        this.context = context;
        this.onecall = onecall;
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

        holder.txtDescription.setText(onecall.getCurrent().getWeather().get(0).getDescription());
        holder.txtMain.setText(onecall.getTimezone());
        holder.txtTemp.setText(String.valueOf(onecall.getLat()));
        holder.txtHumidity.setText(String.valueOf(onecall.getLon()));

        Glide.with(context).load("http://openweathermap.org/img/wn/"+
                onecall.getCurrent().getWeather().get(0).getIcon()+".png")
                .into(holder.iconWeather);
    }

    @Override
    public int getItemCount() {
        return 1;
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
