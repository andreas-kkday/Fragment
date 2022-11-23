package com.example.myapplication

import android.app.Application
import androidx.fragment.app.strictmode.FragmentStrictMode

class DemoApp: Application() {
    override fun onCreate() {
        super.onCreate()

        FragmentStrictMode.defaultPolicy =
            FragmentStrictMode.Policy.Builder()
                .detectFragmentReuse()
                .detectFragmentTagUsage()
                .detectRetainInstanceUsage()
                .detectSetUserVisibleHint()
                .detectTargetFragmentUsage()
                .detectWrongFragmentContainer()
                .apply {
                    if (BuildConfig.DEBUG) {
                        // Fail early on DEBUG builds
                        penaltyDeath()
                    } else {
                        // Log to Crashlytics on RELEASE builds
//                        penaltyListener {
//                            FirebaseCrashlytics.getInstance().recordException(it)
//                        }
                    }
                }
                .build()

    }
}