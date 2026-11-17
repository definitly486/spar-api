package bz;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class s extends metgxyhuhe {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final HashMap f17619lqeggnwhkg = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final PackageManager f17620eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cqumvgiudr f17621gxszxtbevo;

    /* JADX INFO: Access modifiers changed from: private */
    interface iobyxmoadg {
        List get();
    }

    s(Context context) {
        super(kc2.lqeggnwhkg.UnsafeInstall);
        this.f17620eablkybsjg = context.getPackageManager();
        this.f17621gxszxtbevo = new cqumvgiudr();
        new wkgbmnqykc();
        new dvvnrvtcbc();
        HashMap map = f17619lqeggnwhkg;
        map.put("com.sec.android.app.samsungapps", "Samsung GalaxyStore");
        map.put("com.android.vending", "Google Play");
        map.put("com.huawei.appmarket", "Huawei AppGallery");
        map.put("com.amazon.venezia", "Amazon Appstore");
    }

    private static oc2.zoijcleaow cllcsxoeiz(iobyxmoadg iobyxmoadgVar) {
        oc2.zoijcleaow zoijcleaowVar = new oc2.zoijcleaow();
        try {
            Iterator it = iobyxmoadgVar.get().iterator();
            while (it.hasNext()) {
                zoijcleaowVar.add(((PackageItemInfo) it.next()).name);
            }
        } catch (Throwable unused) {
        }
        return zoijcleaowVar;
    }

    private int hkdspvbjdz(String str) {
        try {
            return (int) TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - this.f17620eablkybsjg.getPackageInfo(str, 4096).firstInstallTime);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private oc2.zoijcleaow iozdgvuglv(String str) {
        oc2.zoijcleaow zoijcleaowVar = new oc2.zoijcleaow();
        try {
            oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
            List listZoijcleaow = ppxfxbqfkf.zoijcleaow(this.f17620eablkybsjg, str);
            Integer numValueOf = Integer.valueOf(this.f17621gxszxtbevo.wkgbmnqykc().size());
            iobyxmoadgVar.put("d", this.f17621gxszxtbevo.ppxfxbqfkf(listZoijcleaow));
            iobyxmoadgVar.put("s", numValueOf);
            zoijcleaowVar.add(iobyxmoadgVar);
        } catch (Throwable unused) {
        }
        return zoijcleaowVar;
    }

    private oc2.zoijcleaow lmojexxdyd(final String str) {
        return cllcsxoeiz(new iobyxmoadg() { // from class: bz.r
            @Override // bz.s.iobyxmoadg
            public final List get() {
                return this.f17578iobyxmoadg.pkzmftpjix(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List pkzmftpjix(String str) {
        return ppxfxbqfkf.iobyxmoadg(this.f17620eablkybsjg, str);
    }

    private String wwaezpbzkn(String str) {
        String installerPackageName;
        try {
            installerPackageName = this.f17620eablkybsjg.getInstallerPackageName(str);
        } catch (Throwable unused) {
            installerPackageName = null;
        }
        if (installerPackageName == null) {
            installerPackageName = "null";
        }
        String str2 = (String) f17619lqeggnwhkg.get(installerPackageName);
        return str2 == null ? installerPackageName : str2;
    }

    private List yadqdtsiqt() {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        return Build.VERSION.SDK_INT >= 33 ? this.f17620eablkybsjg.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : this.f17620eablkybsjg.queryIntentActivities(intent, 0);
    }

    private Signature[] ylkuphrtab(String str) {
        int i13 = Build.VERSION.SDK_INT;
        int i14 = i13 >= 28 ? 134217728 : 64;
        PackageInfo packageInfo = i13 >= 33 ? this.f17620eablkybsjg.getPackageInfo(str, PackageManager.PackageInfoFlags.of(i14)) : this.f17620eablkybsjg.getPackageInfo(str, i14);
        if (i13 >= 28) {
            return packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory();
        }
        return packageInfo.signatures;
    }

    oc2.ppxfxbqfkf hcddaimhww() {
        oc2.ppxfxbqfkf ppxfxbqfkfVar = new oc2.ppxfxbqfkf();
        Iterator it = yadqdtsiqt().iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.packageName;
            try {
                ApplicationInfo applicationInfo = this.f17620eablkybsjg.getApplicationInfo(str, 0);
                if ((applicationInfo.flags & 1) == 0) {
                    String string = this.f17620eablkybsjg.getApplicationLabel(applicationInfo).toString();
                    String strWwaezpbzkn = wwaezpbzkn(str);
                    int iHkdspvbjdz = hkdspvbjdz(str);
                    oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
                    iobyxmoadgVar.put("permissions", iozdgvuglv(str));
                    iobyxmoadgVar.put("services", lmojexxdyd(str));
                    iobyxmoadgVar.put(ExternalMetricsManagerImpl.NAME, string);
                    iobyxmoadgVar.put("package", str);
                    iobyxmoadgVar.put("installer", strWwaezpbzkn);
                    iobyxmoadgVar.put("time", Integer.valueOf(iHkdspvbjdz));
                    try {
                        if (ylkuphrtab(str)[0].hashCode() != 0 && !f17619lqeggnwhkg.containsValue(strWwaezpbzkn)) {
                            ppxfxbqfkfVar.add(iobyxmoadgVar);
                        }
                    } catch (Throwable unused) {
                        ppxfxbqfkfVar.add(iobyxmoadgVar);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: jpowsppfya, reason: merged with bridge method [inline-methods] */
    public oc2.ppxfxbqfkf lereixgezr() {
        try {
            return hcddaimhww();
        } catch (Throwable unused) {
            return new oc2.ppxfxbqfkf();
        }
    }
}
