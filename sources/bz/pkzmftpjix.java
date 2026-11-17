package bz;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import t6.f1;

/* JADX INFO: loaded from: classes2.dex */
class pkzmftpjix extends metgxyhuhe implements t6.agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17555eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t6.zdlpuopuiu f17556gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final LocationManager f17557lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final kc2.wkgbmnqykc f17558nufgyqmvbu;

    pkzmftpjix(Context context, t6.zdlpuopuiu zdlpuopuiuVar, LocationManager locationManager, kc2.wkgbmnqykc wkgbmnqykcVar) {
        super(kc2.lqeggnwhkg.Altitude);
        this.f17555eablkybsjg = context;
        this.f17556gxszxtbevo = zdlpuopuiuVar;
        this.f17557lqeggnwhkg = locationManager;
        this.f17558nufgyqmvbu = wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() throws jhduphickx {
        LocationManager locationManager;
        String str = (String) yggfygwlhe(this.f17558nufgyqmvbu.iobyxmoadg());
        if (str != null && ((locationManager = this.f17557lqeggnwhkg) == null || !f1.iobyxmoadg(locationManager))) {
            return str;
        }
        if (!t6.skhdrjzrfn.iobyxmoadg(this.f17555eablkybsjg, t6.ppxfxbqfkf.ACCESS_FINE_LOCATION.iobyxmoadg())) {
            throw new jhduphickx("permission ACCESS_FINE_LOCATION was not granted");
        }
        LocationManager locationManager2 = this.f17557lqeggnwhkg;
        if (locationManager2 == null) {
            throw new jhduphickx("mLocationManager == null");
        }
        Location locationZoijcleaow = f1.zoijcleaow(locationManager2);
        if (locationZoijcleaow == null) {
            throw new jhduphickx("bestLocation == null");
        }
        String string = Double.toString(locationZoijcleaow.getAltitude());
        String strSubstring = (string.isEmpty() || !string.contains(".")) ? "" : string.substring(0, string.indexOf(46));
        btonecajqb(strSubstring);
        return strSubstring;
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17556gxszxtbevo;
    }
}
