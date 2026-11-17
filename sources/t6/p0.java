package t6;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p0 {
    public static boolean iobyxmoadg(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (displayManager != null && keyguardManager != null) {
            for (Display display : displayManager.getDisplays()) {
                if (display.getState() != 1) {
                    return !keyguardManager.isKeyguardLocked();
                }
            }
        }
        return false;
    }
}
