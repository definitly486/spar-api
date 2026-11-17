package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.ppxfxbqfkf;
import g6.btonecajqb;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class BackgroundDownloadJob extends Worker implements BackgroundWorkerListener {
    private static Logger LOGGER = Logger.getLogger(BackgroundDownloadJob.class.getCanonicalName());
    protected static final String TAG = "mapkit_background_download";

    protected BackgroundDownloadJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doWork$0(BackgroundDownloadInitializer backgroundDownloadInitializer) {
        backgroundDownloadInitializer.setListener(this);
        backgroundDownloadInitializer.initializeMapkit();
    }

    @Override // androidx.work.Worker
    public synchronized ppxfxbqfkf.iobyxmoadg doWork() {
        LOGGER.info("Start background download job");
        final BackgroundDownloadInitializer initializer = BackgroundDownloadManager.getInitializer();
        if (initializer != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.mapkit.offline_cache.internal.iobyxmoadg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25454zdlpuopuiu.lambda$doWork$0(initializer);
                }
            });
        }
        try {
            try {
                wait();
                if (initializer != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.mapkit.offline_cache.internal.zoijcleaow
                        @Override // java.lang.Runnable
                        public final void run() {
                            initializer.setListener(null);
                        }
                    });
                }
                LOGGER.info("Stop background download job");
            } catch (Throwable th2) {
                if (initializer != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.mapkit.offline_cache.internal.zoijcleaow
                        @Override // java.lang.Runnable
                        public final void run() {
                            initializer.setListener(null);
                        }
                    });
                }
                throw th2;
            }
        } catch (InterruptedException unused) {
            LOGGER.info("Background download job interrupted");
            ppxfxbqfkf.iobyxmoadg iobyxmoadgVarZoijcleaow = ppxfxbqfkf.iobyxmoadg.zoijcleaow();
            if (initializer != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.mapkit.offline_cache.internal.zoijcleaow
                    @Override // java.lang.Runnable
                    public final void run() {
                        initializer.setListener(null);
                    }
                });
            }
            return iobyxmoadgVarZoijcleaow;
        }
        return ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf();
    }

    @Override // androidx.work.ppxfxbqfkf
    public synchronized void onStopped() {
        notifyAll();
    }

    @Override // com.yandex.mapkit.offline_cache.internal.BackgroundWorkerListener
    public void updateForegroundInfo(btonecajqb btonecajqbVar) {
        setForegroundAsync(btonecajqbVar);
    }
}
