package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3447d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f47055a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3472e f47056b;

    public C3447d(C3472e c3472e) {
        this.f47056b = c3472e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f47055a.get()) {
            this.f47056b.f47142e.set(false);
            C3472e c3472e = this.f47056b;
            c3472e.f47140c.postAtFrontOfQueue(c3472e.f47143f);
            int i13 = this.f47056b.f47139b.get();
            while (i13 > 0) {
                try {
                    Thread.sleep(C3472e.f47136g);
                    if (this.f47056b.f47142e.get()) {
                        break;
                    } else {
                        i13--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i13 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f47056b.f47138a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3421c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f47056b.f47142e.get()) {
                try {
                    Thread.sleep(C3472e.f47136g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
