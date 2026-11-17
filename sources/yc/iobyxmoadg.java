package yc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import qc.ppxfxbqfkf;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f124342iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f124343ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f124344wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SharedPreferences f124345zoijcleaow;

    public iobyxmoadg(Context context, String str, ppxfxbqfkf ppxfxbqfkfVar) {
        Context contextIobyxmoadg = iobyxmoadg(context);
        this.f124342iobyxmoadg = contextIobyxmoadg;
        this.f124345zoijcleaow = contextIobyxmoadg.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f124343ppxfxbqfkf = ppxfxbqfkfVar;
        this.f124344wkgbmnqykc = ppxfxbqfkf();
    }

    private static Context iobyxmoadg(Context context) {
        return androidx.core.content.iobyxmoadg.createDeviceProtectedStorageContext(context);
    }

    private boolean ppxfxbqfkf() {
        return this.f124345zoijcleaow.contains("firebase_data_collection_default_enabled") ? this.f124345zoijcleaow.getBoolean("firebase_data_collection_default_enabled", true) : wkgbmnqykc();
    }

    private boolean wkgbmnqykc() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f124342iobyxmoadg.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f124342iobyxmoadg.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean zoijcleaow() {
        return this.f124344wkgbmnqykc;
    }
}
