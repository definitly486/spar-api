package ac;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
class jpowsppfya {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private String f1373iobyxmoadg;

    jpowsppfya() {
    }

    private static String zoijcleaow(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String iobyxmoadg(Context context) {
        try {
            if (this.f1373iobyxmoadg == null) {
                this.f1373iobyxmoadg = zoijcleaow(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return "".equals(this.f1373iobyxmoadg) ? null : this.f1373iobyxmoadg;
    }
}
