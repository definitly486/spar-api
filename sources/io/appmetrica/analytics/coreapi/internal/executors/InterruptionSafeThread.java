package io.appmetrica.analytics.coreapi.internal.executors;

/* JADX INFO: loaded from: classes3.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f45225a;

    public InterruptionSafeThread() {
        this.f45225a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f45225a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f45225a = false;
        interrupt();
    }

    public InterruptionSafeThread(Runnable runnable, String str) {
        super(runnable, str);
        this.f45225a = true;
    }

    public InterruptionSafeThread(String str) {
        super(str);
        this.f45225a = true;
    }

    public InterruptionSafeThread(Runnable runnable) {
        super(runnable);
        this.f45225a = true;
    }
}
