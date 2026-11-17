package t6;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public abstract class skhdrjzrfn {
    public static boolean iobyxmoadg(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
