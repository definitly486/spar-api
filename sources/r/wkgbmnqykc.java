package r;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static final boolean eablkybsjg(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean gxszxtbevo(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static final long iobyxmoadg(KeyEvent keyEvent) {
        return gxszxtbevo.iobyxmoadg(keyEvent.getKeyCode());
    }

    public static final int ppxfxbqfkf(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean wkgbmnqykc(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final int zoijcleaow(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? ppxfxbqfkf.f81321iobyxmoadg.ppxfxbqfkf() : ppxfxbqfkf.f81321iobyxmoadg.zoijcleaow();
        }
        return ppxfxbqfkf.f81321iobyxmoadg.iobyxmoadg();
    }
}
