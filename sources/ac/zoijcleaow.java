package ac;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final String f1485eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final String f1486gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f1487iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final String f1488lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final xb.gxszxtbevo f1489nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final List f1490ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f1491wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f1492zoijcleaow;

    public zoijcleaow(String str, String str2, List list, String str3, String str4, String str5, String str6, xb.gxszxtbevo gxszxtbevoVar) {
        this.f1487iobyxmoadg = str;
        this.f1492zoijcleaow = str2;
        this.f1490ppxfxbqfkf = list;
        this.f1491wkgbmnqykc = str3;
        this.f1485eablkybsjg = str4;
        this.f1486gxszxtbevo = str5;
        this.f1488lqeggnwhkg = str6;
        this.f1489nufgyqmvbu = gxszxtbevoVar;
    }

    public static zoijcleaow iobyxmoadg(Context context, pkzmftpjix pkzmftpjixVar, String str, String str2, List list, xb.gxszxtbevo gxszxtbevoVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strLqeggnwhkg = pkzmftpjixVar.lqeggnwhkg();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strZoijcleaow = zoijcleaow(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new zoijcleaow(str, str2, list, strLqeggnwhkg, packageName, strZoijcleaow, str3, gxszxtbevoVar);
    }

    private static String zoijcleaow(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
