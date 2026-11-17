package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
class GplLocationCallback extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f45403a;

    GplLocationCallback(LocationListener locationListener) {
        this.f45403a = locationListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.f45403a.onLocationChanged(locationResult.getLastLocation());
    }
}
