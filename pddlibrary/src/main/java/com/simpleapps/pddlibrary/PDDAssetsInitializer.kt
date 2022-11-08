package com.simpleapps.pddlibrary

import android.content.Context
import android.content.res.AssetManager
import android.util.Log
import androidx.startup.Initializer
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class PDDAssetsInitializer : Initializer<PDDAssetsInitializer.PDDTextProvider> {

    override fun create(context: Context): PDDTextProvider {
        Log.d(TAG, "PDDAssetsInitializer#create()")
        return PDDTextProvider(context)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }

    companion object {
        private const val TAG = "PDDAssetsInitializer"
    }

    class PDDTextProvider(context: Context) {
        init {
            isInitialized = true
            assets = context.assets
        }

        companion object {
            var isInitialized = false
            var assets: AssetManager? = null

            fun getAssetsByChapterNumber(num: String): PDDDto? {
                assets?.let {
                    val jsonString: String =
                        it.open("2022/$num.json", AssetManager.ACCESS_STREAMING)
                            .bufferedReader()
                            .use { it.readText() }
                    return Json.decodeFromString<PDDDto>(jsonString)
                }
                return null
            }
        }
    }
}

