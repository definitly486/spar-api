package bz;

import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    static List iobyxmoadg(PackageManager packageManager, String str) {
        return Arrays.asList(packageManager.getPackageInfo(str, 4).services);
    }

    static List zoijcleaow(PackageManager packageManager, String str) {
        return Arrays.asList(packageManager.getPackageInfo(str, 4096).requestedPermissions);
    }
}
