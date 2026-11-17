package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import com.yandex.runtime.Runtime;
import g6.cllcsxoeiz;
import g6.cqumvgiudr;
import g6.dxjokdxxww;
import g6.jyumaefscl;
import g6.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public class BackgroundDownloadManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static BackgroundDownloadInitializer initializer;
    private static BackgroundDownloadManager instance;
    private int activeDownloads = 0;
    private boolean allowCellular = false;
    private cllcsxoeiz workManager;

    private BackgroundDownloadManager(BackgroundDownloadInitializer backgroundDownloadInitializer, Context context) {
        this.workManager = null;
        initializer = backgroundDownloadInitializer;
        this.workManager = cllcsxoeiz.nufgyqmvbu(context);
    }

    private void disableBackgroundDownloading() {
        this.workManager.zoijcleaow("mapkit_background_download");
    }

    private void enableBackgroundDownloading() {
        this.workManager.gxszxtbevo("mapkit_background_download", dxjokdxxww.REPLACE, (cqumvgiudr) ((cqumvgiudr.iobyxmoadg) new cqumvgiudr.iobyxmoadg(BackgroundDownloadJob.class).dxjokdxxww(new wkgbmnqykc.iobyxmoadg().zoijcleaow(this.allowCellular ? jyumaefscl.CONNECTED : jyumaefscl.UNMETERED).iobyxmoadg())).zoijcleaow());
    }

    protected static synchronized BackgroundDownloadInitializer getInitializer() {
        return initializer;
    }

    public static BackgroundDownloadManager getInstance() {
        initialize(null, Runtime.getApplicationContext());
        return instance;
    }

    public static void initialize(BackgroundDownloadInitializer backgroundDownloadInitializer, Context context) {
        if (instance == null) {
            instance = new BackgroundDownloadManager(backgroundDownloadInitializer, context);
        } else if (backgroundDownloadInitializer != null) {
            throw new RuntimeException("BackgroundDownloadManager reinitialization");
        }
    }

    protected void decrementActiveDownloads() {
        int i13 = this.activeDownloads - 1;
        this.activeDownloads = i13;
        if (i13 == 0) {
            disableBackgroundDownloading();
        }
    }

    protected void incrementActiveDownloads() {
        int i13 = this.activeDownloads + 1;
        this.activeDownloads = i13;
        if (i13 == 1) {
            enableBackgroundDownloading();
        }
    }

    protected void updateBackgroundDownloading(boolean z13) {
        this.allowCellular = z13;
        if (this.activeDownloads > 0) {
            enableBackgroundDownloading();
        }
    }
}
