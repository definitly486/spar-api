package nb2;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hcddaimhww {
    public static final PackageInfo iobyxmoadg(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String str2;
        if (Build.VERSION.SDK_INT >= 33) {
            packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            str2 = "{\n        getPackageInfo…ageInfoFlags.of(0))\n    }";
        } else {
            packageInfo = packageManager.getPackageInfo(str, 0);
            str2 = "getPackageInfo";
        }
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(packageInfo, str2);
        return packageInfo;
    }
}
