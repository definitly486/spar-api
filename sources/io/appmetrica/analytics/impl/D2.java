package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes3.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f45618a;

    public D2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public D2(LocationManager locationManager) {
        this.f45618a = locationManager;
    }
}
