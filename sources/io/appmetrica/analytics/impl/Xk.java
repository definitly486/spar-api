package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: loaded from: classes3.dex */
public final class Xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3698n f46779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H5 f46780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f46781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f46782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3748p f46783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3648l f46784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46785g;

    public Xk(C3698n c3698n, C3648l c3648l) {
        this(c3698n, c3648l, new H5(), new C3748p());
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f46785g) {
                    H5 h13 = this.f46780b;
                    InterfaceC3763pe interfaceC3763pe = new InterfaceC3763pe() { // from class: io.appmetrica.analytics.impl.jyumaefscl
                        @Override // io.appmetrica.analytics.impl.InterfaceC3763pe
                        public final void consume(Object obj) {
                            this.f47573iobyxmoadg.a(activity, (Cc) obj);
                        }
                    };
                    h13.getClass();
                    C3952x4.l().f48373c.a().execute(new G5(h13, interfaceC3763pe));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            try {
                if (this.f46785g) {
                    H5 h13 = this.f46780b;
                    InterfaceC3763pe interfaceC3763pe = new InterfaceC3763pe() { // from class: io.appmetrica.analytics.impl.kcexrzcfyt
                        @Override // io.appmetrica.analytics.impl.InterfaceC3763pe
                        public final void consume(Object obj) {
                            this.f47585iobyxmoadg.b(activity, (Cc) obj);
                        }
                    };
                    h13.getClass();
                    C3952x4.l().f48373c.a().execute(new G5(h13, interfaceC3763pe));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Xk(C3698n c3698n, C3648l c3648l, H5 h13, C3748p c3748p) {
        this.f46785g = false;
        this.f46779a = c3698n;
        this.f46784f = c3648l;
        this.f46780b = h13;
        this.f46783e = c3748p;
        this.f46781c = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.zdlpuopuiu
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f48604iobyxmoadg.a(activity, activityEvent);
            }
        };
        this.f46782d = new ActivityLifecycleListener() { // from class: io.appmetrica.analytics.impl.yggfygwlhe
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f48531iobyxmoadg.b(activity, activityEvent);
            }
        };
    }

    public final synchronized EnumC3673m a() {
        try {
            if (!this.f46785g) {
                this.f46779a.registerListener(this.f46781c, ActivityEvent.RESUMED);
                this.f46779a.registerListener(this.f46782d, ActivityEvent.PAUSED);
                this.f46785g = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f46779a.f47720b;
    }

    public final void b(Activity activity, Cc cc3) {
        if (this.f46783e.a(activity, EnumC3723o.PAUSED)) {
            cc3.b(activity);
        }
    }

    public final void a(Activity activity, Cc cc3) {
        if (this.f46783e.a(activity, EnumC3723o.RESUMED)) {
            cc3.a(activity);
        }
    }
}
