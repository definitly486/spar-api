package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.gxszxtbevo;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static int iobyxmoadg(Context context, String str, int i13, int i14, String str2) {
        if (context.checkPermission(str, i13, i14) == -1) {
            return -1;
        }
        String strPpxfxbqfkf = gxszxtbevo.ppxfxbqfkf(str);
        if (strPpxfxbqfkf == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i14);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i14 || !u1.zoijcleaow.iobyxmoadg(context.getPackageName(), str2)) ? gxszxtbevo.zoijcleaow(context, strPpxfxbqfkf, str2) : gxszxtbevo.iobyxmoadg(context, i14, strPpxfxbqfkf, str2)) == 0 ? 0 : -2;
    }

    public static int zoijcleaow(Context context, String str) {
        return iobyxmoadg(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
