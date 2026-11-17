package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class iobyxmoadg extends ImageView {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f13378jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f13379yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Animation.AnimationListener f13380zdlpuopuiu;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C0198iobyxmoadg extends OvalShape {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private iobyxmoadg f13381jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f13382yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Paint f13383zdlpuopuiu = new Paint();

        C0198iobyxmoadg(iobyxmoadg iobyxmoadgVar, int i13) {
            this.f13381jyumaefscl = iobyxmoadgVar;
            this.f13382yggfygwlhe = i13;
            iobyxmoadg((int) rect().width());
        }

        private void iobyxmoadg(int i13) {
            float f13 = i13 / 2;
            this.f13383zdlpuopuiu.setShader(new RadialGradient(f13, f13, this.f13382yggfygwlhe, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.f13381jyumaefscl.getWidth() / 2;
            float f13 = width;
            float height = this.f13381jyumaefscl.getHeight() / 2;
            canvas.drawCircle(f13, height, f13, this.f13383zdlpuopuiu);
            canvas.drawCircle(f13, height, width - this.f13382yggfygwlhe, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f13, float f14) {
            super.onResize(f13, f14);
            iobyxmoadg((int) f13);
        }
    }

    iobyxmoadg(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f13 = getContext().getResources().getDisplayMetrics().density;
        int i13 = (int) (1.75f * f13);
        int i14 = (int) (0.0f * f13);
        this.f13379yggfygwlhe = (int) (3.5f * f13);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(x5.iobyxmoadg.SwipeRefreshLayout);
        this.f13378jyumaefscl = typedArrayObtainStyledAttributes.getColor(x5.iobyxmoadg.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (iobyxmoadg()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            jhduphickx.tbqsvytpvh(this, f13 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0198iobyxmoadg(this, this.f13379yggfygwlhe));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f13379yggfygwlhe, i14, i13, 503316480);
            int i15 = this.f13379yggfygwlhe;
            setPadding(i15, i15, i15, i15);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f13378jyumaefscl);
        jhduphickx.weqkydbzbr(this, shapeDrawable);
    }

    private boolean iobyxmoadg() {
        return true;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f13380zdlpuopuiu;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f13380zdlpuopuiu;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (iobyxmoadg()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f13379yggfygwlhe * 2), getMeasuredHeight() + (this.f13379yggfygwlhe * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i13);
            this.f13378jyumaefscl = i13;
        }
    }

    public void zoijcleaow(Animation.AnimationListener animationListener) {
        this.f13380zdlpuopuiu = animationListener;
    }
}
