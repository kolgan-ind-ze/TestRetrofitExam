package com.example.testretrofitexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        public interface WeatherService {
//            @GET("locations/v1/cities")
//            Call<List<City>> searchCities(@Query("apikey") String apiKey, @Query("q") String cityName);
//
//            @GET("currentconditions/v1/{cityCode}")
//            Call<List<Weather>> getCurrent(@Path("cityCode") String cityCode, @Query("apikey") String apiKey);
//        }
//
//        public class City {
//            private String Key;
//            // Другие поля описывающие город, которые могут быть вам необходимы
//        }
//
//        public class Weather {
//            private String WeatherText;
//            private int Temperature;
//            // Другие поля, описывающие погодные условия
//        }
//
//// В вашем Activity или Fragment
//        private void getWeatherData(String cityName) {
//            Retrofit retrofit = new Retrofit.Builder()
//                    .baseUrl("http://dataservice.accuweather.com/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//
//            WeatherService service = retrofit.create(WeatherService.class);
//
//            service.searchCities("your_api_key", cityName).enqueue(new Callback<List<City>>() {
//                @Override
//                public void onResponse(Call<List<City>> call, Response<List<City>> response) {
//                    if (response.isSuccessful() && response.body() != null && !response.body().isEmpty()) {
//                        String cityCode = response.body().get(0).getKey();
//                        service.getCurrent(cityCode, "your_api_key").enqueue(new Callback<List<Weather>>() {
//                            @Override
//                            public void onResponse(Call<List<Weather>> call, Response<List<Weather>> response) {
//                                if (response.isSuccessful() && response.body() != null && !response.body().isEmpty()) {
//                                    Weather weather = response.body().get(0);
//                                    // Здесь вы можете использовать полученные данные о погоде для отображения в вашем приложении
//                                } else {
//                                    // Обработка ошибки получения погоды
//                                }
//                            }
//
//                            @Override
//                            public void onFailure(Call<List<Weather>> call, Throwable t) {
//                                // Обработка ошибки сети
//                            }
//                        });
//                    } else {
//                        // Обработка ошибки получения кода города
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<List<City>> call, Throwable t) {
//                    // Обработка ошибки сети
//                }
//            });
//        }

        // Предположим, что у вас есть TextView с идентификатором weatherTextView

//        private void displayWeatherData(String weatherText, int temperature) {
//            String displayText = "Погода: " + weatherText + ", Температура: " + temperature + "°C";
//            weatherTextView.setText(displayText);
//        }

//        @Override
//        public void onResponse(Call<List<Weather>> call, Response<List<Weather>> response) {
//            if (response.isSuccessful() && response.body() != null && !response.body().isEmpty()) {
//                Weather weather = response.body().get(0);
//                displayWeatherData(weather.getWeatherText(), weather.getTemperature());
//            } else {
//                // Обработка ошибки получения погоды
//            }
//        }


//        private void displayWeatherData(String weatherText, int temperature) {
//            String displayText = "Погода: " + weatherText + ", Температура: " + temperature + "°C";
//            weatherTextView.setText(displayText);
//        }

//        @Override
//        public void onResponse(Call<List<Weather>> call, Response<List<Weather>> response) {
//            if (response.isSuccessful() && response.body() != null && !response.body().isEmpty()) {
//                Weather weather = response.body().get(0);
//                displayWeatherData(weather.getWeatherText(), weather.getTemperature());
//            } else {
//                // Обработка ошибки получения погоды
//            }
//        }

    }
}