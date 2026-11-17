package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3522fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3873u0 f47254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Do f47255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3698n f47256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xk f47257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3376a6 f47258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3958xa f47259f;

    public C3522fn(C3873u0 c3873u0, Do r13, C3698n c3698n, Xk xk2, C3376a6 c3376a6, C3958xa c3958xa) {
        this.f47254a = c3873u0;
        this.f47255b = r13;
        this.f47256c = c3698n;
        this.f47257d = xk2;
        this.f47258e = c3376a6;
        this.f47259f = c3958xa;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.cdpycssgdh
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C3522fn.b((Activity) obj);
            }
        });
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C3522fn(C3873u0 c3873u0, Do r13) {
        this(c3873u0, r13, C3952x4.l().a(), C3952x4.l().o(), C3952x4.l().h(), C3952x4.l().k());
    }
}
