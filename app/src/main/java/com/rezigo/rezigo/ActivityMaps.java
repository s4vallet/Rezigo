package com.rezigo.rezigo;

import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ActivityMaps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Points GPS
        LatLng Rezid = new LatLng(48.363416, -4.566971);
        mMap.addMarker(new MarkerOptions().position(Rezid).title("Rezid").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        LatLng CarrefourPlouz = new LatLng(48.373172, -4.587265);
        mMap.addMarker(new MarkerOptions().position(CarrefourPlouz).title("Carrefour Plouzané"));
        LatLng IKEA  = new LatLng(48.417857, -4.441834);
        mMap.addMarker(new MarkerOptions().position(IKEA).title("IKEA"));
        LatLng liberte  = new LatLng(48.390781, -4.485713);
        mMap.addMarker(new MarkerOptions().position(liberte).title("Place de la liberté"));
        LatLng intermarcherPlouz  = new LatLng(48.379001, -4.601233);
        mMap.addMarker(new MarkerOptions().position(intermarcherPlouz).title("Intermarché Super Plouzané"));
        //Zoom
        float zoomLevel = 12.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Rezid, zoomLevel));
    }
}
