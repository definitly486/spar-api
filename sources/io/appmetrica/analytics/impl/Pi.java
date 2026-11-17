package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f46393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46395c;

    public Pi(Context context, String str, String str2) {
        this.f46393a = context;
        this.f46394b = str;
        this.f46395c = str2;
    }

    public final Object a() {
        int identifier = this.f46393a.getResources().getIdentifier(this.f46394b, this.f46395c, this.f46393a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i13);
}
