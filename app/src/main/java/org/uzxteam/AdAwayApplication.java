package org.uzxteam;

import android.app.Application;

import org.uzxteam.helper.NotificationHelper;
import org.uzxteam.helper.PreferenceHelper;
import org.uzxteam.model.adblocking.AdBlockMethod;
import org.uzxteam.model.adblocking.AdBlockModel;
import org.uzxteam.model.source.SourceModel;
import org.uzxteam.model.update.UpdateModel;
import org.uzxteam.util.log.ApplicationLog;

/**
 * This class is a custom {@link Application} for AdAway app.
 *
 * @author Bruce BUJON (bruce.bujon(at)gmail(dot)com)
 */
public class AdAwayApplication extends Application {
    /**
     * The common source model for the whole application.
     */
    private SourceModel sourceModel;
    /**
     * The common ad block model for the whole application.
     */
    private AdBlockModel adBlockModel;
    /**
     * The common update model for the whole application.
     */
    private UpdateModel updateModel;

    @Override
    public void onCreate() {
        // Delegate application creation
        super.onCreate();
        // Initialize logging
        ApplicationLog.init(this);
        // Create notification channels
        NotificationHelper.createNotificationChannels(this);
        // Create models
        this.sourceModel = new SourceModel(this);
        this.updateModel = new UpdateModel(this);
    }

    /**
     * Get the source model.
     *
     * @return The common source model for the whole application.
     */
    public SourceModel getSourceModel() {
        return this.sourceModel;
    }

    /**
     * Get the ad block model.
     *
     * @return The common ad block model for the whole application.
     */
    public AdBlockModel getAdBlockModel() {
        // Check cached model
        AdBlockMethod method = PreferenceHelper.getAdBlockMethod(this);
        if (this.adBlockModel == null || this.adBlockModel.getMethod() != method) {
            this.adBlockModel = AdBlockModel.build(this, method);
        }
        return this.adBlockModel;
    }

    /**
     * Get the update model.
     *
     * @return Teh common update model for the whole application.
     */
    public UpdateModel getUpdateModel() {
        return this.updateModel;
    }
}
