package org.uzxteam.util.log;

import android.content.Context;

import com.topjohnwu.superuser.Shell;

import org.uzxteam.BuildConfig;
import org.uzxteam.helper.PreferenceHelper;

import timber.log.Timber;

/**
 * This class is an utility class that configures the application log.
 *
 * @author Bruce BUJON (bruce.bujon(at)gmail(dot)com)
 */
public final class ApplicationLog {
    /**
     * Private constructor.
     */
    private ApplicationLog() {

    }

    /**
     * Initialize application logging.
     *
     * @param context The application context.
     */
    public static void init(Context context) {
        if (BuildConfig.DEBUG || PreferenceHelper.getDebugEnabled(context)) {
            Shell.enableVerboseLogging = true;
            Timber.plant(new Timber.DebugTree());
        } else {
            Shell.enableVerboseLogging = false;
            SentryLog.init(context);
            Timber.plant(new SentryLog.SentryTree());
        }
    }
}
