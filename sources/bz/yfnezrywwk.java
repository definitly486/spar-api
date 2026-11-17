package bz;

import android.content.Context;
import android.location.LocationManager;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes2.dex */
class yfnezrywwk extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17681eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final LocationManager f17682gxszxtbevo;

    yfnezrywwk(Context context, LocationManager locationManager) {
        super(kc2.lqeggnwhkg.Status);
        this.f17681eablkybsjg = context;
        this.f17682gxszxtbevo = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17681eablkybsjg, t6.ppxfxbqfkf.ACCESS_FINE_LOCATION.iobyxmoadg()) && !t6.skhdrjzrfn.iobyxmoadg(this.f17681eablkybsjg, t6.ppxfxbqfkf.ACCESS_COARSE_LOCATION.iobyxmoadg())) {
            return "1";
        }
        LocationManager locationManager = this.f17682gxszxtbevo;
        if (locationManager == null) {
            return "4";
        }
        try {
            locationManager.isProviderEnabled("gps");
            return this.f17682gxszxtbevo.getProvider("gps") != null ? CommonUrlParts.Values.FALSE_INTEGER : "4";
        } catch (Exception unused) {
        }
    }
}
