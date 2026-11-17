package xb2;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu implements lqeggnwhkg {
    private final Location zoijcleaow(LocationManager locationManager, String str) {
        if (locationManager.isProviderEnabled(str)) {
            return locationManager.getLastKnownLocation(str);
        }
        return null;
    }

    @Override // xb2.lqeggnwhkg
    public Location iobyxmoadg(Context context) {
        LocationManager locationManager;
        zdlpuopuiu.btonecajqb(context, "context");
        try {
            if ((!bc2.iobyxmoadg.iobyxmoadg(context, "android.permission.ACCESS_FINE_LOCATION") && !bc2.iobyxmoadg.iobyxmoadg(context, "android.permission.ACCESS_COARSE_LOCATION")) || (locationManager = (LocationManager) context.getSystemService("location")) == null) {
                return null;
            }
            Location locationZoijcleaow = zoijcleaow(locationManager, "gps");
            if (locationZoijcleaow != null) {
                return locationZoijcleaow;
            }
            Location locationZoijcleaow2 = zoijcleaow(locationManager, "network");
            if (locationZoijcleaow2 != null) {
                return locationZoijcleaow2;
            }
            Location locationZoijcleaow3 = zoijcleaow(locationManager, "passive");
            if (locationZoijcleaow3 != null) {
                return locationZoijcleaow3;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
