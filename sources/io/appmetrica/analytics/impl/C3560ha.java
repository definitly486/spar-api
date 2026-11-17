package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3560ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vm f47382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3826s3 f47383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f47384d;

    public C3560ha(Context context, Vm vm2, C3826s3 c3826s3, SafePackageManager safePackageManager) {
        this.f47381a = context;
        this.f47382b = vm2;
        this.f47383c = c3826s3;
        this.f47384d = safePackageManager;
    }

    public C3560ha(Context context) {
        this(context, new Vm(context, "io.appmetrica.analytics.build_id"), new C3826s3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
