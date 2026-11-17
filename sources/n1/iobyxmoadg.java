package n1;

import android.location.Location;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: n1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C1472iobyxmoadg {
        static boolean eablkybsjg(Location location) {
            return location.hasSpeedAccuracy();
        }

        static boolean gxszxtbevo(Location location) {
            return location.hasVerticalAccuracy();
        }

        static float iobyxmoadg(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static float ppxfxbqfkf(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static boolean wkgbmnqykc(Location location) {
            return location.hasBearingAccuracy();
        }

        static float zoijcleaow(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }
    }

    static class zoijcleaow {
        static boolean iobyxmoadg(Location location) {
            return location.isMock();
        }
    }

    public static boolean eablkybsjg(Location location) {
        return C1472iobyxmoadg.wkgbmnqykc(location);
    }

    public static boolean gxszxtbevo(Location location) {
        return C1472iobyxmoadg.eablkybsjg(location);
    }

    public static float iobyxmoadg(Location location) {
        return C1472iobyxmoadg.iobyxmoadg(location);
    }

    public static boolean lqeggnwhkg(Location location) {
        return C1472iobyxmoadg.gxszxtbevo(location);
    }

    public static boolean nufgyqmvbu(Location location) {
        return Build.VERSION.SDK_INT >= 31 ? zoijcleaow.iobyxmoadg(location) : location.isFromMockProvider();
    }

    public static float ppxfxbqfkf(Location location) {
        return C1472iobyxmoadg.zoijcleaow(location);
    }

    public static float wkgbmnqykc(Location location) {
        return C1472iobyxmoadg.ppxfxbqfkf(location);
    }

    public static long zoijcleaow(Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }
}
