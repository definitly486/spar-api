package ud;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pmvmpeiblj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final pmvmpeiblj f113406iobyxmoadg = new pmvmpeiblj();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final mc.iobyxmoadg f113407zoijcleaow;

    static {
        mc.iobyxmoadg iobyxmoadgVarNufgyqmvbu = new oc.wkgbmnqykc().dxjokdxxww(ppxfxbqfkf.f113408iobyxmoadg).btonecajqb(true).nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iobyxmoadgVarNufgyqmvbu, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f113407zoijcleaow = iobyxmoadgVarNufgyqmvbu;
    }

    private pmvmpeiblj() {
    }

    private final wkgbmnqykc wkgbmnqykc(vd.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar == null) {
            return wkgbmnqykc.COLLECTION_SDK_NOT_INSTALLED;
        }
        return zoijcleaowVar.iobyxmoadg() ? wkgbmnqykc.COLLECTION_ENABLED : wkgbmnqykc.COLLECTION_DISABLED;
    }

    public final lereixgezr iobyxmoadg(com.google.firebase.gxszxtbevo firebaseApp, esjtqupxsv sessionDetails, wd.gxszxtbevo sessionsSettings, Map subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribers, "subscribers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new lereixgezr(dxjokdxxww.SESSION_START, new istkbnxepw(sessionDetails.zoijcleaow(), sessionDetails.iobyxmoadg(), sessionDetails.ppxfxbqfkf(), sessionDetails.wkgbmnqykc(), new eablkybsjg(wkgbmnqykc((vd.zoijcleaow) subscribers.get(vd.zoijcleaow.iobyxmoadg.PERFORMANCE)), wkgbmnqykc((vd.zoijcleaow) subscribers.get(vd.zoijcleaow.iobyxmoadg.CRASHLYTICS)), sessionsSettings.zoijcleaow()), firebaseInstallationId, firebaseAuthenticationToken), zoijcleaow(firebaseApp));
    }

    public final mc.iobyxmoadg ppxfxbqfkf() {
        return f113407zoijcleaow;
    }

    public final zoijcleaow zoijcleaow(com.google.firebase.gxszxtbevo firebaseApp) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseApp, "firebaseApp");
        Context contextGtknphoqwx = firebaseApp.gtknphoqwx();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextGtknphoqwx, "firebaseApp.applicationContext");
        String packageName = contextGtknphoqwx.getPackageName();
        PackageInfo packageInfo = contextGtknphoqwx.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strPpxfxbqfkf = firebaseApp.agtfadlqog().ppxfxbqfkf();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strPpxfxbqfkf, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(RELEASE, "RELEASE");
        zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(packageName, "packageName");
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(MANUFACTURER, "MANUFACTURER");
        jyumaefscl jyumaefsclVar = jyumaefscl.f113390iobyxmoadg;
        Context contextGtknphoqwx2 = firebaseApp.gtknphoqwx();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextGtknphoqwx2, "firebaseApp.applicationContext");
        yggfygwlhe yggfygwlheVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc(contextGtknphoqwx2);
        Context contextGtknphoqwx3 = firebaseApp.gtknphoqwx();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextGtknphoqwx3, "firebaseApp.applicationContext");
        return new zoijcleaow(strPpxfxbqfkf, MODEL, "2.0.6", RELEASE, zdlpuopuiuVar, new iobyxmoadg(packageName, str2, strValueOf, MANUFACTURER, yggfygwlheVarWkgbmnqykc, jyumaefsclVar.ppxfxbqfkf(contextGtknphoqwx3)));
    }
}
