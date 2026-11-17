package kk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes3.dex */
public final class wy {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f59215iobyxmoadg;

    public wy(Context context) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f59215iobyxmoadg = context;
    }

    public final String iobyxmoadg(String packageName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageName, "packageName");
        try {
            PackageManager packageManager = this.f59215iobyxmoadg.getPackageManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(packageManager, "context.packageManager");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, UserVerificationMethods.USER_VERIFY_PATTERN);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            return (String) applicationLabel;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
