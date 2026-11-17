package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes3.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f45404a;

    GplOnSuccessListener(LocationListener locationListener) {
        this.f45404a = locationListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.f45404a.onLocationChanged(location);
    }
}
