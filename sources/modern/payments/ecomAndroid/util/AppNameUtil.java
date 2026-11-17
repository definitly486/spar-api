package modern.payments.ecomAndroid.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/util/AppNameUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAppNameFromPackageName", "", "packageName", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppNameUtil {
    private final Context context;

    public AppNameUtil(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.context = context;
    }

    public final String getAppNameFromPackageName(String packageName) {
        zdlpuopuiu.btonecajqb(packageName, "packageName");
        try {
            PackageManager packageManager = this.context.getPackageManager();
            zdlpuopuiu.dxjokdxxww(packageManager, "getPackageManager(...)");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, UserVerificationMethods.USER_VERIFY_PATTERN);
            zdlpuopuiu.dxjokdxxww(applicationInfo, "getApplicationInfo(...)");
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            zdlpuopuiu.nufgyqmvbu(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            return (String) applicationLabel;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
