package com.example.tambalbanonline

import android.app.Application
import org.osmdroid.config.Configuration
import java.io.File

class TambalBanOnlineApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Configuration.getInstance().load(
            this,
            getSharedPreferences("osm", MODE_PRIVATE)
        )
        Configuration.getInstance().userAgentValue = BuildConfig.APPLICATION_ID
        Configuration.getInstance().osmdroidBasePath = getExternalFilesDir(null)
        Configuration.getInstance().osmdroidTileCache = File(Configuration.getInstance().osmdroidBasePath, "tiles")
    }
} 