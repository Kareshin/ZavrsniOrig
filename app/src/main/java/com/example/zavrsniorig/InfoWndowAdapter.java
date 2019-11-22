package com.example.zavrsniorig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.zavrsniorig.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class InfoWndowAdapter implements GoogleMap.InfoWindowAdapter {

    private Context context;

    public InfoWndowAdapter(Context context){
        this.context = context.getApplicationContext();
    }

    @Override
    public View getInfoWindow(Marker marker){
        return null;
    }

    @Override
    public  View getInfoContents(Marker marker){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.sevilla_info, null);

        TextView tvSev = (TextView) v.findViewById(R.id.tvSev);
        TextView tvSev2 = (TextView) v.findViewById(R.id.tvSev2);

        tvSev.setText("Sevilla, Španjolska " +
                "IT mobile application (Mobilne aplikacije) 10 sudionika/3 tjedna\n" +
                "Zanimanja: tehničar za računalstvo, tehničar za elektroniku, elektrotehničar (" +
                "Tehnička škola Slavonski Brod, Elektrotehnička i ekonomska škola Nova Gradiška, )");
        tvSev2.setText("Ishodi: instalirati i konfigurirati razvojnu okolinu Elipse, osmišljavati modele za Android,\n" +
                "dizajnirati grafičke komponente, osmišljavati višejezične aplikacije, dizajnirati i upravljati\n" +
                "relacijskim bazama podataka, koristiti bazu podataka REST API, reklamirati u mobilnoj\n" +
                "aplikaciji.");

        return v;
    }
}
