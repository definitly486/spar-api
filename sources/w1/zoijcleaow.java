package w1;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    static class iobyxmoadg {
        static void iobyxmoadg(AccessibilityEvent accessibilityEvent, boolean z13) {
            accessibilityEvent.setAccessibilityDataSensitive(z13);
        }
    }

    public static int iobyxmoadg(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void ppxfxbqfkf(AccessibilityEvent accessibilityEvent, int i13) {
        accessibilityEvent.setContentChangeTypes(i13);
    }

    public static void zoijcleaow(AccessibilityEvent accessibilityEvent, boolean z13) {
        if (Build.VERSION.SDK_INT >= 34) {
            iobyxmoadg.iobyxmoadg(accessibilityEvent, z13);
        }
    }
}
