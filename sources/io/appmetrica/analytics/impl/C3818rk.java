package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3818rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3794qk f48009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile U9 f48010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile U9 f48011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile U9 f48012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile U9 f48013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile U9 f48014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile U9 f48015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ExecutorC3769pk f48016h;

    public C3818rk() {
        this(new C3794qk());
    }

    public final IHandlerExecutor a() {
        if (this.f48015g == null) {
            synchronized (this) {
                try {
                    if (this.f48015g == null) {
                        this.f48009a.getClass();
                        HandlerThreadC3959xb handlerThreadC3959xbA = U9.a("IAA-SDE");
                        this.f48015g = new U9(handlerThreadC3959xbA, handlerThreadC3959xbA.getLooper(), new Handler(handlerThreadC3959xbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f48015g;
    }

    public final IHandlerExecutor b() {
        if (this.f48010b == null) {
            synchronized (this) {
                try {
                    if (this.f48010b == null) {
                        this.f48009a.getClass();
                        HandlerThreadC3959xb handlerThreadC3959xbA = U9.a("IAA-SC");
                        this.f48010b = new U9(handlerThreadC3959xbA, handlerThreadC3959xbA.getLooper(), new Handler(handlerThreadC3959xbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f48010b;
    }

    public final IHandlerExecutor c() {
        if (this.f48012d == null) {
            synchronized (this) {
                try {
                    if (this.f48012d == null) {
                        this.f48009a.getClass();
                        HandlerThreadC3959xb handlerThreadC3959xbA = U9.a("IAA-SMH-1");
                        this.f48012d = new U9(handlerThreadC3959xbA, handlerThreadC3959xbA.getLooper(), new Handler(handlerThreadC3959xbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f48012d;
    }

    public final IHandlerExecutor d() {
        if (this.f48013e == null) {
            synchronized (this) {
                try {
                    if (this.f48013e == null) {
                        this.f48009a.getClass();
                        HandlerThreadC3959xb handlerThreadC3959xbA = U9.a("IAA-SNTPE");
                        this.f48013e = new U9(handlerThreadC3959xbA, handlerThreadC3959xbA.getLooper(), new Handler(handlerThreadC3959xbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f48013e;
    }

    public final IHandlerExecutor e() {
        if (this.f48011c == null) {
            synchronized (this) {
                try {
                    if (this.f48011c == null) {
                        this.f48009a.getClass();
                        HandlerThreadC3959xb handlerThreadC3959xbA = U9.a("IAA-STE");
                        this.f48011c = new U9(handlerThreadC3959xbA, handlerThreadC3959xbA.getLooper(), new Handler(handlerThreadC3959xbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f48011c;
    }

    public final Executor f() {
        if (this.f48016h == null) {
            synchronized (this) {
                try {
                    if (this.f48016h == null) {
                        this.f48009a.getClass();
                        this.f48016h = new ExecutorC3769pk(new Handler(Looper.getMainLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f48016h;
    }

    public C3818rk(C3794qk c3794qk) {
        new HashMap();
        this.f48009a = c3794qk;
    }
}
