package bz;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import t6.f1;

/* JADX INFO: loaded from: classes2.dex */
class sflfametgt extends metgxyhuhe implements t6.agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17622eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17623gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final LocationManager f17624lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final kc2.wkgbmnqykc f17625nufgyqmvbu;

    sflfametgt(Context context, t6.zdlpuopuiu zdlpuopuiuVar, LocationManager locationManager, kc2.wkgbmnqykc wkgbmnqykcVar) {
        super(kc2.lqeggnwhkg.Timestamp);
        this.f17622eablkybsjg = context;
        this.f17623gxszxtbevo = zdlpuopuiuVar;
        this.f17624lqeggnwhkg = locationManager;
        this.f17625nufgyqmvbu = wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        LocationManager locationManager;
        String str = (String) yggfygwlhe(this.f17625nufgyqmvbu.iobyxmoadg());
        if (str != null && ((locationManager = this.f17624lqeggnwhkg) == null || !f1.iobyxmoadg(locationManager))) {
            return str;
        }
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17622eablkybsjg, t6.ppxfxbqfkf.ACCESS_FINE_LOCATION.iobyxmoadg())) {
            throw new jhduphickx("permission ACCESS_FINE_LOCATION was not granted");
        }
        LocationManager locationManager2 = this.f17624lqeggnwhkg;
        if (locationManager2 == null) {
            throw new jhduphickx("mLocationManager == null");
        }
        Location locationZoijcleaow = f1.zoijcleaow(locationManager2);
        if (locationZoijcleaow == null) {
            throw new jhduphickx("bestLocation == null");
        }
        String strValueOf = String.valueOf(locationZoijcleaow.getTime());
        btonecajqb(strValueOf);
        return strValueOf;
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17623gxszxtbevo;
    }
}
