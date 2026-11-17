package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.iobyxmoadg;
import com.google.firebase.perf.application.zoijcleaow;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import nd.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class SessionManager extends zoijcleaow {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final iobyxmoadg appStateMonitor;
    private final Set<WeakReference<kd.iobyxmoadg>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.eablkybsjg(UUID.randomUUID().toString()), iobyxmoadg.zoijcleaow());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.lqeggnwhkg()) {
            this.gaugeManager.logGaugeMetadata(perfSession.btonecajqb(), wkgbmnqykc.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(wkgbmnqykc wkgbmnqykcVar) {
        if (this.perfSession.lqeggnwhkg()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.btonecajqb(), wkgbmnqykcVar);
        }
    }

    private void startOrStopCollectingGauges(wkgbmnqykc wkgbmnqykcVar) {
        if (this.perfSession.lqeggnwhkg()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, wkgbmnqykcVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        wkgbmnqykc wkgbmnqykcVar = wkgbmnqykc.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(wkgbmnqykcVar);
        startOrStopCollectingGauges(wkgbmnqykcVar);
    }

    @Override // com.google.firebase.perf.application.zoijcleaow, com.google.firebase.perf.application.iobyxmoadg.zoijcleaow
    public void onUpdateAppState(wkgbmnqykc wkgbmnqykcVar) {
        super.onUpdateAppState(wkgbmnqykcVar);
        if (this.appStateMonitor.gxszxtbevo()) {
            return;
        }
        if (wkgbmnqykcVar == wkgbmnqykc.FOREGROUND) {
            updatePerfSession(PerfSession.eablkybsjg(UUID.randomUUID().toString()));
        } else if (this.perfSession.nufgyqmvbu()) {
            updatePerfSession(PerfSession.eablkybsjg(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(wkgbmnqykcVar);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<kd.iobyxmoadg> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final PerfSession perfSession = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: kd.zoijcleaow
            @Override // java.lang.Runnable
            public final void run() {
                this.f55120zdlpuopuiu.lambda$setApplicationContext$0(context, perfSession);
            }
        });
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.nufgyqmvbu()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<kd.iobyxmoadg> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.btonecajqb() == this.perfSession.btonecajqb()) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<kd.iobyxmoadg>> it = this.clients.iterator();
                while (it.hasNext()) {
                    kd.iobyxmoadg iobyxmoadgVar = it.next().get();
                    if (iobyxmoadgVar != null) {
                        iobyxmoadgVar.zoijcleaow(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.iobyxmoadg());
        startOrStopCollectingGauges(this.appStateMonitor.iobyxmoadg());
    }

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, iobyxmoadg iobyxmoadgVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = iobyxmoadgVar;
        registerForAppState();
    }
}
