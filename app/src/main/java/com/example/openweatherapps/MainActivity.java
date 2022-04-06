package com.example.openweatherapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.openweatherapps.adapter.OneCallAdapter;
import com.example.openweatherapps.adapter.WeatherAdapter;
import com.example.openweatherapps.model.Mantap;
import com.example.openweatherapps.model.onecall.OneCall;
import com.example.openweatherapps.service.WeatherApiClient;
import com.example.openweatherapps.service.WeatherApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvWeather;
    EditText editSearch;
    Button btnCari;
    final String ApiKey="caadcf08bda325f870e17d08cf7ec231";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvWeather=findViewById(R.id.rvWeather);
        editSearch=findViewById(R.id.editSearch);
        btnCari=findViewById(R.id.btnCari);

        WeatherApiInterface weatherApiInterface = WeatherApiClient.getRetrofit().create(WeatherApiInterface.class);
        Call<OneCall> call = weatherApiInterface.getOneCallWeather("33.44","94.04","minutely",ApiKey);

        call.enqueue(new Callback<OneCall>() {
            @Override
            public void onResponse(Call<OneCall> call, Response<OneCall> response) {
                OneCallAdapter adapter = new OneCallAdapter(MainActivity.this, response.body().getHourly());
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
                rvWeather.setLayoutManager(layoutManager);
                rvWeather.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<OneCall> call, Throwable t) {

            }
        });

        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cari = editSearch.getText().toString();
                if (cari.isEmpty()){

                    Call<Mantap> call1 = weatherApiInterface.getWeatherCurrentWithCity("Jakarta",ApiKey);

                    call1.enqueue(new Callback<Mantap>() {
                        @Override
                        public void onResponse(Call<Mantap> call1, Response<Mantap> response) {
                            WeatherAdapter adapter = new WeatherAdapter(MainActivity.this, response.body());
                            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
                            rvWeather.setLayoutManager(layoutManager);
                            rvWeather.setAdapter(adapter);
                        }

                        @Override
                        public void onFailure(Call<Mantap> call1, Throwable t) {

                        }
                    });
                }else{
                    Call<Mantap> call2 = weatherApiInterface.getWeatherCurrentWithCity(cari,ApiKey);

                    call2.enqueue(new Callback<Mantap>() {
                        @Override
                        public void onResponse(Call<Mantap> call2, Response<Mantap> response) {
                            WeatherAdapter adapter = new WeatherAdapter(MainActivity.this, response.body());
                            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
                            rvWeather.setLayoutManager(layoutManager);
                            rvWeather.setAdapter(adapter);
                        }

                        @Override
                        public void onFailure(Call<Mantap> call2, Throwable t) {

                        }
                    });
                }

            }
        });
    }
}