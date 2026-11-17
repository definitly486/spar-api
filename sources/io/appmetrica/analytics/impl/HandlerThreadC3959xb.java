package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerThreadC3959xb extends HandlerThread implements IInterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f48418a;

    public HandlerThreadC3959xb(String str) {
        super(str);
        this.f48418a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f48418a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f48418a = false;
        interrupt();
    }
}
