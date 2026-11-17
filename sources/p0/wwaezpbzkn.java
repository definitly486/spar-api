package p0;

import android.os.Build;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
public abstract class wwaezpbzkn {
    public static final pmvmpeiblj iobyxmoadg(InputConnection inputConnection, tg.draadjrbmk draadjrbmkVar) {
        return Build.VERSION.SDK_INT >= 34 ? new lmojexxdyd(inputConnection, draadjrbmkVar) : new cdpycssgdh(inputConnection, draadjrbmkVar);
    }
}
