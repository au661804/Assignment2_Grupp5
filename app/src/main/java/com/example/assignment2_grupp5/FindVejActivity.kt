package com.example.assignment2_grupp5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.assignment2_grupp5.databinding.ActivityFindVejBinding
import com.example.assignment2_grupp5.ui.theme.Assignment2_Grupp5Theme
import com.google.android.gms.maps.CameraUpdate

class FindVejActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityFindVejBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFindVejBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap


        // Add a marker in Katrines kælder and move the camera
        val katrinesLatLng = LatLng(56.1720064, 10.1912768)
        mMap.addMarker(MarkerOptions().position(katrinesLatLng).title("Katrines Kælder"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(katrinesLatLng))
        val cameraUpdate = CameraUpdateFactory.newLatLngZoom(katrinesLatLng, 13F)
        googleMap.moveCamera(cameraUpdate)



        //Add fredagsbar markers
        val haddokks = LatLng(56.15883144363669, 10.21561737093552)
        mMap.addMarker(MarkerOptions().position(haddokks).title("Haddokks"))


        val approks = LatLng(56.16761166627294, 10.193029958070378)
        mMap.addMarker(MarkerOptions().position(approks).title("Approksimérbar"))

        val umbi = LatLng(56.168340288576836, 10.201952581203939)
        mMap.addMarker(MarkerOptions().position(umbi).title("Medicinsk fredagsbar"))

        val fysisk = LatLng(56.16798188711438, 10.198519353618819)
        mMap.addMarker(MarkerOptions().position(fysisk).title("Fysisk fredagsbar"))

        val alkymia = LatLng(56.16872257978334, 10.199034337756585)
        mMap.addMarker(MarkerOptions().position(alkymia).title("Alkymia Kemisk fredagsbar"))

        val biologisk = LatLng(56.16764737606492, 10.203454618272426)
        mMap.addMarker(MarkerOptions().position(biologisk).title("Biologisk fredagsbar"))

        val BM = LatLng(56.143323722847924, 10.19903868998674)
        mMap.addMarker(MarkerOptions().position(BM).title("Idræt fredagsbar"))










    }


}