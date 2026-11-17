package s3;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class wflxmlrfwp extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, wkgbmnqykc.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final GestureDetector f105336cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final float f105338iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iobyxmoadg f105339jyumaefscl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final PointF f105341zdlpuopuiu = new PointF();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final PointF f105340yggfygwlhe = new PointF();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private volatile float f105337esjtqupxsv = 3.1415927f;

    public interface iobyxmoadg {
        boolean onSingleTapUp(MotionEvent motionEvent);

        void zoijcleaow(PointF pointF);
    }

    public wflxmlrfwp(Context context, iobyxmoadg iobyxmoadgVar, float f13) {
        this.f105339jyumaefscl = iobyxmoadgVar;
        this.f105338iwizpuwonk = f13;
        this.f105336cqumvgiudr = new GestureDetector(context, this);
    }

    @Override // s3.wkgbmnqykc.iobyxmoadg
    public void iobyxmoadg(float[] fArr, float f13) {
        this.f105337esjtqupxsv = -f13;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f105341zdlpuopuiu.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        float x13 = (motionEvent2.getX() - this.f105341zdlpuopuiu.x) / this.f105338iwizpuwonk;
        float y13 = motionEvent2.getY();
        PointF pointF = this.f105341zdlpuopuiu;
        float f15 = (y13 - pointF.y) / this.f105338iwizpuwonk;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d13 = this.f105337esjtqupxsv;
        float fCos = (float) Math.cos(d13);
        float fSin = (float) Math.sin(d13);
        PointF pointF2 = this.f105340yggfygwlhe;
        pointF2.x -= (fCos * x13) - (fSin * f15);
        float f16 = pointF2.y + (fSin * x13) + (fCos * f15);
        pointF2.y = f16;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f16));
        this.f105339jyumaefscl.zoijcleaow(this.f105340yggfygwlhe);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f105339jyumaefscl.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f105336cqumvgiudr.onTouchEvent(motionEvent);
    }
}
