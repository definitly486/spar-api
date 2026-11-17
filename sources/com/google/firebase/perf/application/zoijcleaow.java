package com.google.firebase.perf.application;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow implements iobyxmoadg.zoijcleaow {
    private final WeakReference<iobyxmoadg.zoijcleaow> appStateCallback;
    private final iobyxmoadg appStateMonitor;
    private nd.wkgbmnqykc currentAppState;
    private boolean isRegisteredForAppState;

    protected zoijcleaow() {
        this(iobyxmoadg.zoijcleaow());
    }

    public nd.wkgbmnqykc getAppState() {
        return this.currentAppState;
    }

    public WeakReference<iobyxmoadg.zoijcleaow> getAppStateCallback() {
        return this.appStateCallback;
    }

    protected void incrementTsnsCount(int i13) {
        this.appStateMonitor.eablkybsjg(i13);
    }

    @Override // com.google.firebase.perf.application.iobyxmoadg.zoijcleaow
    public void onUpdateAppState(nd.wkgbmnqykc wkgbmnqykcVar) {
        nd.wkgbmnqykc wkgbmnqykcVar2 = this.currentAppState;
        nd.wkgbmnqykc wkgbmnqykcVar3 = nd.wkgbmnqykc.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (wkgbmnqykcVar2 == wkgbmnqykcVar3) {
            this.currentAppState = wkgbmnqykcVar;
        } else {
            if (wkgbmnqykcVar2 == wkgbmnqykcVar || wkgbmnqykcVar == wkgbmnqykcVar3) {
                return;
            }
            this.currentAppState = nd.wkgbmnqykc.FOREGROUND_BACKGROUND;
        }
    }

    protected void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.iobyxmoadg();
        this.appStateMonitor.gtknphoqwx(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    protected void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.rgvfuqvkyq(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    protected zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = nd.wkgbmnqykc.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = iobyxmoadgVar;
        this.appStateCallback = new WeakReference<>(this);
    }
}
