package com.rullywjntk.attendanceapp.views.attendance

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.rullywjntk.attendanceapp.R

class AttendanceFragment : Fragment(), OnMapReadyCallback {

    private var mapAttendanceFragment: SupportMapFragment? = null
    private var map: GoogleMap? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_attendance, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupMaps()
    }

    private fun setupMaps() {
        mapAttendanceFragment = childFragmentManager.findFragmentById(R.id.map_attendance) as SupportMapFragment
        mapAttendanceFragment?.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap) {
        map = p0
        // coordinate bisa disesuaikan
        val sydney = LatLng(-33.852, 151.211)
        map?.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("Marker in Sydney")
        )
        map?.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        map?.animateCamera(CameraUpdateFactory.zoomTo(20f))
    }
}