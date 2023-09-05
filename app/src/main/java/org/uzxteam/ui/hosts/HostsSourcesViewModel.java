package org.uzxteam.ui.hosts;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.uzxteam.db.AppDatabase;
import org.uzxteam.db.dao.HostsSourceDao;
import org.uzxteam.db.entity.HostsSource;
import org.uzxteam.util.AppExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * This class is an {@link AndroidViewModel} for the {@link HostsSourcesFragment}.
 *
 * @author Bruce BUJON (bruce.bujon(at)gmail(dot)com)
 */
public class HostsSourcesViewModel extends AndroidViewModel {
    private static final Executor EXECUTOR = AppExecutors.getInstance().diskIO();
    private final HostsSourceDao hostsSourceDao;

    public HostsSourcesViewModel(@NonNull Application application) {
        super(application);
        this.hostsSourceDao = AppDatabase.getInstance(application).hostsSourceDao();
    }

    public LiveData<List<HostsSource>> getHostsSources() {
        return this.hostsSourceDao.loadAll();
    }

    public void toggleSourceEnabled(HostsSource source) {
        EXECUTOR.execute(() -> this.hostsSourceDao.toggleEnabled(source));
    }
}
