package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3369a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46895a;

    public C3369a(Context context) {
        this.f46895a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC3867tj.a(new StringBuilder(this.f46895a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC3867tj.a(this.f46895a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
