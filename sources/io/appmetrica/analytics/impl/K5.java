package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes3.dex */
public final class K5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L5 f46128b = new L5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumSet f46129c = EnumSet.of(Te.OFFLINE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46130d = "connection based";

    public K5(Context context) {
        this.f46127a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        L5 l13 = this.f46128b;
        Context context = this.f46127a;
        l13.getClass();
        SafePackageManager safePackageManager = Ue.f46612a;
        return !this.f46129c.contains((Te) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Te.UNDEFINED, new Se()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f46130d;
    }
}
