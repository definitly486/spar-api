package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
abstract class iobyxmoadg {

    /* JADX INFO: renamed from: androidx.profileinstaller.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C0180iobyxmoadg {
        static File iobyxmoadg(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class zoijcleaow {
        static Context iobyxmoadg(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static boolean iobyxmoadg(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z13 = true;
        for (File file2 : fileArrListFiles) {
            z13 = iobyxmoadg(file2) && z13;
        }
        return z13;
    }

    static void zoijcleaow(Context context, ProfileInstallReceiver.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadg(Build.VERSION.SDK_INT >= 34 ? zoijcleaow.iobyxmoadg(context).getCacheDir() : C0180iobyxmoadg.iobyxmoadg(zoijcleaow.iobyxmoadg(context)))) {
            iobyxmoadgVar.iobyxmoadg(14, null);
        } else {
            iobyxmoadgVar.iobyxmoadg(15, null);
        }
    }
}
