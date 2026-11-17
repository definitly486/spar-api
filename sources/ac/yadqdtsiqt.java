package ac;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public class yadqdtsiqt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    boolean f1470eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f1471gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f1472iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Boolean f1473lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final TaskCompletionSource f1474nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f1475ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    TaskCompletionSource f1476wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f1477zoijcleaow;

    public yadqdtsiqt(com.google.firebase.gxszxtbevo gxszxtbevoVar) {
        Object obj = new Object();
        this.f1475ppxfxbqfkf = obj;
        this.f1476wkgbmnqykc = new TaskCompletionSource();
        this.f1470eablkybsjg = false;
        this.f1471gxszxtbevo = false;
        this.f1474nufgyqmvbu = new TaskCompletionSource();
        Context contextGtknphoqwx = gxszxtbevoVar.gtknphoqwx();
        this.f1477zoijcleaow = gxszxtbevoVar;
        this.f1472iobyxmoadg = btonecajqb.vdvldrhtss(contextGtknphoqwx);
        Boolean boolZoijcleaow = zoijcleaow();
        this.f1473lqeggnwhkg = boolZoijcleaow == null ? iobyxmoadg(contextGtknphoqwx) : boolZoijcleaow;
        synchronized (obj) {
            try {
                if (wkgbmnqykc()) {
                    this.f1476wkgbmnqykc.trySetResult(null);
                    this.f1470eablkybsjg = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean eablkybsjg() {
        try {
            return this.f1477zoijcleaow.zdlpuopuiu();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void gxszxtbevo(boolean z13) {
        String str;
        String str2 = z13 ? "ENABLED" : "DISABLED";
        if (this.f1473lqeggnwhkg == null) {
            str = "global Firebase setting";
        } else {
            str = this.f1471gxszxtbevo ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private Boolean iobyxmoadg(Context context) {
        Boolean boolLqeggnwhkg = lqeggnwhkg(context);
        if (boolLqeggnwhkg == null) {
            this.f1471gxszxtbevo = false;
            return null;
        }
        this.f1471gxszxtbevo = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolLqeggnwhkg));
    }

    private static Boolean lqeggnwhkg(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e13) {
            xb.lqeggnwhkg.gxszxtbevo().eablkybsjg("Could not read data collection permission from manifest", e13);
            return null;
        }
    }

    private Boolean zoijcleaow() {
        if (!this.f1472iobyxmoadg.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f1471gxszxtbevo = false;
        return Boolean.valueOf(this.f1472iobyxmoadg.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public Task dxjokdxxww() {
        return bc.zoijcleaow.ppxfxbqfkf(this.f1474nufgyqmvbu.getTask(), nufgyqmvbu());
    }

    public Task nufgyqmvbu() {
        Task task;
        synchronized (this.f1475ppxfxbqfkf) {
            task = this.f1476wkgbmnqykc.getTask();
        }
        return task;
    }

    public void ppxfxbqfkf(boolean z13) {
        if (!z13) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f1474nufgyqmvbu.trySetResult(null);
    }

    public synchronized boolean wkgbmnqykc() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f1473lqeggnwhkg;
            zBooleanValue = bool != null ? bool.booleanValue() : eablkybsjg();
            gxszxtbevo(zBooleanValue);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }
}
