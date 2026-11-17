package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3703n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3678m4 f47743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile U9 f47744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile U9 f47745c;

    public C3703n4() {
        this(new C3678m4());
    }

    public final IHandlerExecutor a() {
        if (this.f47744b == null) {
            synchronized (this) {
                try {
                    if (this.f47744b == null) {
                        this.f47743a.getClass();
                        HandlerThreadC3959xb handlerThreadC3959xbA = U9.a("IAA-CDE");
                        this.f47744b = new U9(handlerThreadC3959xbA, handlerThreadC3959xbA.getLooper(), new Handler(handlerThreadC3959xbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f47744b;
    }

    public final ICommonExecutor b() {
        if (this.f47745c == null) {
            synchronized (this) {
                try {
                    if (this.f47745c == null) {
                        this.f47743a.getClass();
                        HandlerThreadC3959xb handlerThreadC3959xbA = U9.a("IAA-CRS");
                        this.f47745c = new U9(handlerThreadC3959xbA, handlerThreadC3959xbA.getLooper(), new Handler(handlerThreadC3959xbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f47745c;
    }

    public C3703n4(C3678m4 c3678m4) {
        this.f47743a = c3678m4;
    }
}
