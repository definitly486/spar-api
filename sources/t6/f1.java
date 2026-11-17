package t6;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f1 {
    public static boolean iobyxmoadg(LocationManager locationManager) {
        if (!locationManager.isProviderEnabled("gps")) {
            return false;
        }
        try {
            return locationManager.getProvider("gps") != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean ppxfxbqfkf(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((LocationManager) context.getSystemService("location")).isLocationEnabled();
        }
        return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
    }

    public static Location zoijcleaow(LocationManager locationManager) {
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && (location == null || lastKnownLocation.getAccuracy() < location.getAccuracy())) {
                location = lastKnownLocation;
            }
        }
        return location;
    }
}
