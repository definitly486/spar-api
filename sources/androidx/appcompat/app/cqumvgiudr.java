package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class cqumvgiudr {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static cqumvgiudr f2588wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f2589iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f2590ppxfxbqfkf = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LocationManager f2591zoijcleaow;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f2592iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        long f2593zoijcleaow;

        iobyxmoadg() {
        }
    }

    cqumvgiudr(Context context, LocationManager locationManager) {
        this.f2589iobyxmoadg = context;
        this.f2591zoijcleaow = locationManager;
    }

    private boolean eablkybsjg() {
        return this.f2590ppxfxbqfkf.f2593zoijcleaow > System.currentTimeMillis();
    }

    private void gxszxtbevo(Location location) {
        long j13;
        iobyxmoadg iobyxmoadgVar = this.f2590ppxfxbqfkf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        iwizpuwonk iwizpuwonkVarZoijcleaow = iwizpuwonk.zoijcleaow();
        iwizpuwonkVarZoijcleaow.iobyxmoadg(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        iwizpuwonkVarZoijcleaow.iobyxmoadg(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z13 = iwizpuwonkVarZoijcleaow.f2637ppxfxbqfkf == 1;
        long j14 = iwizpuwonkVarZoijcleaow.f2638zoijcleaow;
        long j15 = iwizpuwonkVarZoijcleaow.f2636iobyxmoadg;
        iwizpuwonkVarZoijcleaow.iobyxmoadg(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j16 = iwizpuwonkVarZoijcleaow.f2638zoijcleaow;
        if (j14 == -1 || j15 == -1) {
            j13 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j15) {
                j16 = jCurrentTimeMillis > j14 ? j15 : j14;
            }
            j13 = j16 + 60000;
        }
        iobyxmoadgVar.f2592iobyxmoadg = z13;
        iobyxmoadgVar.f2593zoijcleaow = j13;
    }

    static cqumvgiudr iobyxmoadg(Context context) {
        if (f2588wkgbmnqykc == null) {
            Context applicationContext = context.getApplicationContext();
            f2588wkgbmnqykc = new cqumvgiudr(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2588wkgbmnqykc;
    }

    private Location ppxfxbqfkf(String str) {
        try {
            if (this.f2591zoijcleaow.isProviderEnabled(str)) {
                return this.f2591zoijcleaow.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e13) {
            Log.d("TwilightManager", "Failed to get last known location", e13);
            return null;
        }
    }

    private Location zoijcleaow() {
        Location locationPpxfxbqfkf = androidx.core.content.wkgbmnqykc.zoijcleaow(this.f2589iobyxmoadg, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? ppxfxbqfkf("network") : null;
        Location locationPpxfxbqfkf2 = androidx.core.content.wkgbmnqykc.zoijcleaow(this.f2589iobyxmoadg, "android.permission.ACCESS_FINE_LOCATION") == 0 ? ppxfxbqfkf("gps") : null;
        if (locationPpxfxbqfkf2 == null || locationPpxfxbqfkf == null) {
            return locationPpxfxbqfkf2 != null ? locationPpxfxbqfkf2 : locationPpxfxbqfkf;
        }
        return locationPpxfxbqfkf2.getTime() > locationPpxfxbqfkf.getTime() ? locationPpxfxbqfkf2 : locationPpxfxbqfkf;
    }

    boolean wkgbmnqykc() {
        iobyxmoadg iobyxmoadgVar = this.f2590ppxfxbqfkf;
        if (eablkybsjg()) {
            return iobyxmoadgVar.f2592iobyxmoadg;
        }
        Location locationZoijcleaow = zoijcleaow();
        if (locationZoijcleaow != null) {
            gxszxtbevo(locationZoijcleaow);
            return iobyxmoadgVar.f2592iobyxmoadg;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i13 = Calendar.getInstance().get(11);
        return i13 < 6 || i13 >= 22;
    }
}
