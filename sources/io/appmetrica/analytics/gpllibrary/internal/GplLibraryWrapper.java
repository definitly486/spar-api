package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f45394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationListener f45395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LocationCallback f45396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Looper f45397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f45398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f45399f;

    /* JADX INFO: renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45400a;

        static {
            int[] iArr = new int[Priority.values().length];
            f45400a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45400a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45400a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f45401a;

        ClientProvider(Context context) {
            this.f45401a = context;
        }

        final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient(this.f45401a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j13) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j13);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(Priority priority) throws Throwable {
        int i13;
        FusedLocationProviderClient fusedLocationProviderClient = this.f45394a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f45399f);
        int i14 = AnonymousClass1.f45400a[priority.ordinal()];
        if (i14 == 1) {
            i13 = 104;
        } else if (i14 != 2) {
            i13 = i14 != 3 ? 105 : 100;
        } else {
            i13 = 102;
        }
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i13), this.f45396c, this.f45397d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f45394a.removeLocationUpdates(this.f45396c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.f45394a.getLastLocation().addOnSuccessListener(this.f45398e, new GplOnSuccessListener(this.f45395b));
    }

    GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j13) {
        this.f45394a = clientProvider.a();
        this.f45395b = locationListener;
        this.f45397d = looper;
        this.f45398e = executor;
        this.f45399f = j13;
        this.f45396c = new GplLocationCallback(locationListener);
    }
}
