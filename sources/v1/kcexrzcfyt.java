package v1;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final GestureDetector f115158iobyxmoadg;

    public kcexrzcfyt(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean iobyxmoadg(MotionEvent motionEvent) {
        return this.f115158iobyxmoadg.onTouchEvent(motionEvent);
    }

    public kcexrzcfyt(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f115158iobyxmoadg = new GestureDetector(context, onGestureListener, handler);
    }
}
