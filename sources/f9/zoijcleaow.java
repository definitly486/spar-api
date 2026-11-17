package f9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import l8.eablkybsjg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ConcurrentMap f33333iobyxmoadg = new ConcurrentHashMap();

    private static PackageInfo iobyxmoadg(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e13) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e13);
            return null;
        }
    }

    public static eablkybsjg ppxfxbqfkf(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f33333iobyxmoadg;
        eablkybsjg eablkybsjgVar = (eablkybsjg) concurrentMap.get(packageName);
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        eablkybsjg eablkybsjgVarWkgbmnqykc = wkgbmnqykc(context);
        eablkybsjg eablkybsjgVar2 = (eablkybsjg) concurrentMap.putIfAbsent(packageName, eablkybsjgVarWkgbmnqykc);
        return eablkybsjgVar2 == null ? eablkybsjgVarWkgbmnqykc : eablkybsjgVar2;
    }

    private static eablkybsjg wkgbmnqykc(Context context) {
        return new wkgbmnqykc(zoijcleaow(iobyxmoadg(context)));
    }

    private static String zoijcleaow(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }
}
