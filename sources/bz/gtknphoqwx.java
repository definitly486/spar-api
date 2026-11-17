package bz;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import t6.f1;

/* JADX INFO: loaded from: classes2.dex */
class gtknphoqwx extends metgxyhuhe implements t6.agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17424eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17425gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final LocationManager f17426lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final kc2.wkgbmnqykc f17427nufgyqmvbu;

    gtknphoqwx(Context context, t6.zdlpuopuiu zdlpuopuiuVar, LocationManager locationManager, kc2.wkgbmnqykc wkgbmnqykcVar) {
        super(kc2.lqeggnwhkg.AltitudeAccuracy);
        this.f17424eablkybsjg = context;
        this.f17425gxszxtbevo = zdlpuopuiuVar;
        this.f17426lqeggnwhkg = locationManager;
        this.f17427nufgyqmvbu = wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        LocationManager locationManager;
        String str = (String) yggfygwlhe(this.f17427nufgyqmvbu.iobyxmoadg());
        if (str != null && ((locationManager = this.f17426lqeggnwhkg) == null || !f1.iobyxmoadg(locationManager))) {
            return str;
        }
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17424eablkybsjg, t6.ppxfxbqfkf.ACCESS_FINE_LOCATION.iobyxmoadg())) {
            throw new jhduphickx("permission ACCESS_FINE_LOCATION was not granted");
        }
        LocationManager locationManager2 = this.f17426lqeggnwhkg;
        if (locationManager2 == null) {
            throw new jhduphickx("mLocationManager == null");
        }
        Location locationZoijcleaow = f1.zoijcleaow(locationManager2);
        if (locationZoijcleaow == null) {
            throw new jhduphickx("bestLocation == null");
        }
        String strValueOf = String.valueOf(Math.round(locationZoijcleaow.getVerticalAccuracyMeters()));
        btonecajqb(strValueOf);
        return strValueOf;
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17425gxszxtbevo;
    }
}
