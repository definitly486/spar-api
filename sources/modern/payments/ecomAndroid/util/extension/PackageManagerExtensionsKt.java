package modern.payments.ecomAndroid.util.extension;

import android.content.Context;
import android.content.pm.PackageManager;
import gg.kcexrzcfyt;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"isAppInstalled", "", "", "context", "Landroid/content/Context;", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PackageManagerExtensionsKt {
    public static final boolean isAppInstalled(String str, Context context) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(str, "<this>");
        zdlpuopuiu.btonecajqb(context, "context");
        PackageManager packageManager = context.getPackageManager();
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            packageManager.getPackageInfo(str, 1);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(Boolean.TRUE);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        Boolean bool = Boolean.FALSE;
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = bool;
        }
        return ((Boolean) objWkgbmnqykc).booleanValue();
    }
}
