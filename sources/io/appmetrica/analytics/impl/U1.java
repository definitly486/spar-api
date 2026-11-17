package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class U1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f46594e = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3381ab f46595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M6 f46596b = C3952x4.l().n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K6 f46597c = new K6();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final An f46598d = new An();

    public U1(G6 g13) {
        this.f46595a = g13;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        StackTraceElement[] stackTraceElementArrB;
        try {
            f46594e.set(true);
            InterfaceC3381ab interfaceC3381ab = this.f46595a;
            C3871tn c3871tnApply = this.f46597c.apply(thread);
            An an2 = this.f46598d;
            Thread threadA = an2.f45477a.a();
            ArrayList arrayListA = an2.a(threadA, thread);
            if (thread != threadA) {
                try {
                    stackTraceElementArrB = an2.f45477a.b();
                    if (stackTraceElementArrB == null) {
                        try {
                            stackTraceElementArrB = threadA.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArrB = null;
                }
                arrayListA.add(0, (C3871tn) an2.f45478b.apply(threadA, stackTraceElementArrB));
            }
            interfaceC3381ab.a(th2, new U(c3871tnApply, arrayListA, this.f46596b.b()));
        } catch (Throwable th3) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th3, th3.getMessage(), new Object[0]);
        }
    }
}
