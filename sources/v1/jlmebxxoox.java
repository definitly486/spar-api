package v1;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class jlmebxxoox {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static Map f115157iobyxmoadg = Collections.synchronizedMap(new WeakHashMap());

    private static class iobyxmoadg {
        static float iobyxmoadg(VelocityTracker velocityTracker, int i13) {
            return velocityTracker.getAxisVelocity(i13);
        }
    }

    private static ribwqtqdhb eablkybsjg(VelocityTracker velocityTracker) {
        return (ribwqtqdhb) f115157iobyxmoadg.get(velocityTracker);
    }

    public static void iobyxmoadg(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f115157iobyxmoadg.containsKey(velocityTracker)) {
                f115157iobyxmoadg.put(velocityTracker, new ribwqtqdhb());
            }
            ((ribwqtqdhb) f115157iobyxmoadg.get(velocityTracker)).iobyxmoadg(motionEvent);
        }
    }

    public static void ppxfxbqfkf(VelocityTracker velocityTracker, int i13, float f13) {
        velocityTracker.computeCurrentVelocity(i13, f13);
        ribwqtqdhb ribwqtqdhbVarEablkybsjg = eablkybsjg(velocityTracker);
        if (ribwqtqdhbVarEablkybsjg != null) {
            ribwqtqdhbVarEablkybsjg.ppxfxbqfkf(i13, f13);
        }
    }

    public static float wkgbmnqykc(VelocityTracker velocityTracker, int i13) {
        if (Build.VERSION.SDK_INT >= 34) {
            return iobyxmoadg.iobyxmoadg(velocityTracker, i13);
        }
        if (i13 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i13 == 1) {
            return velocityTracker.getYVelocity();
        }
        ribwqtqdhb ribwqtqdhbVarEablkybsjg = eablkybsjg(velocityTracker);
        if (ribwqtqdhbVarEablkybsjg != null) {
            return ribwqtqdhbVarEablkybsjg.wkgbmnqykc(i13);
        }
        return 0.0f;
    }

    public static void zoijcleaow(VelocityTracker velocityTracker, int i13) {
        ppxfxbqfkf(velocityTracker, i13, Float.MAX_VALUE);
    }
}
