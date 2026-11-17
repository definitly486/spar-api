package t;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class jpowsppfya {
    public static final void iobyxmoadg(long j13, tg.draadjrbmk draadjrbmkVar) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j13, j13, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        draadjrbmkVar.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, long j13, tg.draadjrbmk draadjrbmkVar) {
        wkgbmnqykc(rgvfuqvkyqVar, j13, draadjrbmkVar, false);
    }

    private static final void wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar, long j13, tg.draadjrbmk draadjrbmkVar, boolean z13) {
        MotionEvent motionEventGxszxtbevo = rgvfuqvkyqVar.gxszxtbevo();
        if (motionEventGxszxtbevo == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventGxszxtbevo.getAction();
        if (z13) {
            motionEventGxszxtbevo.setAction(3);
        }
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        motionEventGxszxtbevo.offsetLocation(-Float.intBitsToFloat(i13), -Float.intBitsToFloat(i14));
        draadjrbmkVar.invoke(motionEventGxszxtbevo);
        motionEventGxszxtbevo.offsetLocation(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
        motionEventGxszxtbevo.setAction(action);
    }

    public static final void zoijcleaow(rgvfuqvkyq rgvfuqvkyqVar, long j13, tg.draadjrbmk draadjrbmkVar) {
        wkgbmnqykc(rgvfuqvkyqVar, j13, draadjrbmkVar, true);
    }
}
