package q1;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {

    static class iobyxmoadg {
        static boolean iobyxmoadg(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    public static boolean iobyxmoadg(Context context) {
        return iobyxmoadg.iobyxmoadg(context);
    }
}
