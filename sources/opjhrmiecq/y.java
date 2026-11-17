package opjhrmiecq;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final boolean iobyxmoadg(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
