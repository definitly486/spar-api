package w1;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    static class iobyxmoadg {
        static boolean iobyxmoadg(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* JADX INFO: renamed from: w1.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static final class AccessibilityManagerTouchExplorationStateChangeListenerC2946ppxfxbqfkf implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final zoijcleaow f118502iobyxmoadg;

        AccessibilityManagerTouchExplorationStateChangeListenerC2946ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
            this.f118502iobyxmoadg = zoijcleaowVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC2946ppxfxbqfkf) {
                return this.f118502iobyxmoadg.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC2946ppxfxbqfkf) obj).f118502iobyxmoadg);
            }
            return false;
        }

        public int hashCode() {
            return this.f118502iobyxmoadg.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z13) {
            this.f118502iobyxmoadg.onTouchExplorationStateChanged(z13);
        }
    }

    public interface zoijcleaow {
        void onTouchExplorationStateChanged(boolean z13);
    }

    public static boolean iobyxmoadg(AccessibilityManager accessibilityManager, zoijcleaow zoijcleaowVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2946ppxfxbqfkf(zoijcleaowVar));
    }

    public static boolean ppxfxbqfkf(AccessibilityManager accessibilityManager, zoijcleaow zoijcleaowVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2946ppxfxbqfkf(zoijcleaowVar));
    }

    public static boolean zoijcleaow(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return iobyxmoadg.iobyxmoadg(accessibilityManager);
        }
        return true;
    }
}
