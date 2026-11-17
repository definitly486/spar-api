package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3376a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3698n f46904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f46905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f46906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z5 f46907d;

    public C3376a6(C3698n c3698n) {
        this(c3698n, 0);
    }

    public final synchronized void a(Context context) {
        if (this.f46906c == null) {
            Context applicationContext = context.getApplicationContext();
            this.f46904a.a(applicationContext);
            this.f46904a.registerListener(this.f46907d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.f46906c = applicationContext;
        }
    }

    public C3376a6(C3698n c3698n, IReporter iReporter) {
        this.f46904a = c3698n;
        this.f46905b = iReporter;
        this.f46907d = new Z5(this);
    }

    public /* synthetic */ C3376a6(C3698n c3698n, int i13) {
        this(c3698n, AbstractC3849t1.a());
    }

    public final synchronized Context a() {
        return this.f46906c;
    }
}
