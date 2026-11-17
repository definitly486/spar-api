package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3665lg implements InterfaceC3615jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3814rg f47660a;

    public C3665lg(C3814rg c3814rg) {
        this.f47660a = c3814rg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3615jg
    public final void a() {
        C3814rg c3814rg = this.f47660a;
        Ua ua3 = c3814rg.f47992b;
        C3640kg c3640kg = new C3640kg(c3814rg);
        ua3.getClass();
        try {
            FutureTask futureTask = new FutureTask(new Ta(ua3));
            Ia.F.f46007d.f48009a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Od.f46334a.incrementAndGet()).start();
            Ag ag2 = (Ag) futureTask.get(5L, TimeUnit.SECONDS);
            io.a(ua3.f46609b);
            C3814rg.a(c3814rg, ag2, C3814rg.a(c3814rg));
        } catch (Throwable th2) {
            try {
                c3640kg.a(th2);
            } finally {
                io.a(ua3.f46609b);
            }
        }
    }
}
