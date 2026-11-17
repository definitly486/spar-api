package h1;

import android.content.pm.PackageInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: h1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C0895iobyxmoadg {
        static long iobyxmoadg(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long iobyxmoadg(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0895iobyxmoadg.iobyxmoadg(packageInfo) : packageInfo.versionCode;
    }
}
