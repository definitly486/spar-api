package bz;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Locale;
import t6.f1;

/* JADX INFO: loaded from: classes2.dex */
class tbqsvytpvh extends metgxyhuhe implements t6.agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17638eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17639gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final LocationManager f17640lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final kc2.wkgbmnqykc f17641nufgyqmvbu;

    tbqsvytpvh(Context context, t6.zdlpuopuiu zdlpuopuiuVar, LocationManager locationManager, kc2.wkgbmnqykc wkgbmnqykcVar) {
        super(kc2.lqeggnwhkg.Heading);
        this.f17638eablkybsjg = context;
        this.f17639gxszxtbevo = zdlpuopuiuVar;
        this.f17640lqeggnwhkg = locationManager;
        this.f17641nufgyqmvbu = wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        LocationManager locationManager;
        String str = (String) yggfygwlhe(this.f17641nufgyqmvbu.iobyxmoadg());
        if (str != null && ((locationManager = this.f17640lqeggnwhkg) == null || !f1.iobyxmoadg(locationManager))) {
            return str;
        }
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17638eablkybsjg, t6.ppxfxbqfkf.ACCESS_FINE_LOCATION.iobyxmoadg())) {
            throw new jhduphickx("permission ACCESS_FINE_LOCATION was not granted");
        }
        LocationManager locationManager2 = this.f17640lqeggnwhkg;
        if (locationManager2 == null) {
            throw new jhduphickx("mLocationManager == null");
        }
        Location locationZoijcleaow = f1.zoijcleaow(locationManager2);
        if (locationZoijcleaow == null) {
            throw new jhduphickx("bestLocation == null");
        }
        String str2 = String.format(Locale.US, "%.1f", Float.valueOf(locationZoijcleaow.getBearing()));
        btonecajqb(str2);
        return str2;
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17639gxszxtbevo;
    }
}
