package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Mb extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Nb f46232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mb(Nb nb3, String str) {
        super(str);
        this.f46232a = nb3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f46232a.f46257a) {
            Nb.a(this.f46232a);
            this.f46232a.f46261e = true;
            this.f46232a.f46257a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f46232a.f46258b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f46232a.f46258b);
                this.f46232a.f46258b.clear();
            }
            if (map.size() > 0) {
                Nb.a(this.f46232a, map);
                map.clear();
            }
        }
    }
}
