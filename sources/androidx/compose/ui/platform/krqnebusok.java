package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
final class krqnebusok {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final krqnebusok f7000iobyxmoadg = new krqnebusok();

    private krqnebusok() {
    }

    public final boolean iobyxmoadg(MotionEvent motionEvent, int i13) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i13)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i13)) & Integer.MAX_VALUE) < 2139095040;
    }
}
