package ja;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements View.OnTouchListener {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f50918iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f50919jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f50920yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Dialog f50921zdlpuopuiu;

    public iobyxmoadg(Dialog dialog, Rect rect) {
        this.f50921zdlpuopuiu = dialog;
        this.f50920yggfygwlhe = rect.left;
        this.f50919jyumaefscl = rect.top;
        this.f50918iwizpuwonk = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f50920yggfygwlhe + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f50919jyumaefscl + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i13 = this.f50918iwizpuwonk;
            motionEventObtain.setLocation((-i13) - 1, (-i13) - 1);
        }
        view.performClick();
        return this.f50921zdlpuopuiu.onTouchEvent(motionEventObtain);
    }
}
