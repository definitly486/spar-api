package t;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gtknphoqwx f109078iobyxmoadg = new gtknphoqwx();

    private gtknphoqwx() {
    }

    public final long iobyxmoadg(MotionEvent motionEvent, int i13) {
        float rawX = motionEvent.getRawX(i13);
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(motionEvent.getRawY(i13))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
