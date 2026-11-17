package lb2;

import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {
    public static final boolean iobyxmoadg(Context context, String packageName) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        zdlpuopuiu.btonecajqb(packageName, "packageName");
        try {
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final void zoijcleaow(Context context, ServiceConnection serviceConnection) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable th2) {
                Log.e("ServiceExt", "unbindServiceSafely", th2);
            }
        }
    }
}
