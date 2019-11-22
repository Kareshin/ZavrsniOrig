package com.example.zavrsniorig;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        LatLng Sevilla = new LatLng(37.396820, -5.999085);
        mMap.addMarker(new MarkerOptions().position(Sevilla).title("Sevilla"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sevilla));

        LatLng Skofja_Loka = new LatLng(46.189838, 14.301005);
        mMap.addMarker(new MarkerOptions().position(Skofja_Loka).title("Skofja_Loka"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Skofja_Loka));

        LatLng Villach = new LatLng(46.613016, 13.840051);
        mMap.addMarker(new MarkerOptions().position(Villach).title("Villach"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Villach));

        LatLng Ubeda = new LatLng(38.015216, -3.373063);
        mMap.addMarker(new MarkerOptions().position(Ubeda).title("Ubeda"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ubeda));

        LatLng Dublin = new LatLng(53.340756, -6.267234);
        mMap.addMarker(new MarkerOptions().position(Dublin).title("Dublin"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Dublin));

        LatLng Groabkarolinenfeld = new LatLng(47.890569, 12.081201);
        mMap.addMarker(new MarkerOptions().position(Groabkarolinenfeld).title("Groabkarolinenfeld"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Groabkarolinenfeld));

        LatLng Ljubljana = new LatLng(46.074369, 14.504893);
        mMap.addMarker(new MarkerOptions().position(Ljubljana).title("Ljubljana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ljubljana));

        LatLng Kouvola = new LatLng(60.867767, 26.704151);
        mMap.addMarker(new MarkerOptions().position(Kouvola).title("Kouvola"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kouvola));

        LatLng Skofja_Loka2 = new LatLng(46.189838, 14.301005);
        mMap.addMarker(new MarkerOptions().position(Skofja_Loka2).title("Skofja_Loka2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Skofja_Loka2));

        LatLng Valleta = new LatLng(35.899630, 14.514770);
        mMap.addMarker(new MarkerOptions().position(Valleta).title("Valleta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Valleta));

        InfoWndowAdapter markerInfoWindowAdapter = new InfoWndowAdapter(getApplicationContext());
        googleMap.setInfoWindowAdapter((markerInfoWindowAdapter));

        googleMap.setOnInfoWindowClickListener(this);

    }

    @Override
    public void onInfoWindowClick(Marker marker) {

    }
}
