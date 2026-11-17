package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f11714jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f11715yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f11716zdlpuopuiu;

    private final class ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private boolean f11718iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f11719jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private float f11720yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private float f11721zdlpuopuiu;

        private ppxfxbqfkf() {
        }

        public void iobyxmoadg(float f13, float f14, boolean z13) {
            this.f11721zdlpuopuiu = f13;
            this.f11720yggfygwlhe = f14;
            this.f11719jyumaefscl = z13;
            if (this.f11718iwizpuwonk) {
                return;
            }
            this.f11718iwizpuwonk = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11718iwizpuwonk = false;
            AspectRatioFrameLayout.iobyxmoadg(AspectRatioFrameLayout.this);
        }
    }

    public interface zoijcleaow {
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11714jyumaefscl = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d5.cdpycssgdh.AspectRatioFrameLayout, 0, 0);
            try {
                this.f11714jyumaefscl = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f11716zdlpuopuiu = new ppxfxbqfkf();
    }

    static /* synthetic */ zoijcleaow iobyxmoadg(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f11714jyumaefscl;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        float f13;
        float f14;
        super.onMeasure(i13, i14);
        if (this.f11715yggfygwlhe <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        float f17 = f15 / f16;
        float f18 = (this.f11715yggfygwlhe / f17) - 1.0f;
        if (Math.abs(f18) <= 0.01f) {
            this.f11716zdlpuopuiu.iobyxmoadg(this.f11715yggfygwlhe, f17, false);
            return;
        }
        int i15 = this.f11714jyumaefscl;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    f13 = this.f11715yggfygwlhe;
                } else if (i15 == 4) {
                    if (f18 > 0.0f) {
                        f13 = this.f11715yggfygwlhe;
                    } else {
                        f14 = this.f11715yggfygwlhe;
                    }
                }
                measuredWidth = (int) (f16 * f13);
            } else {
                f14 = this.f11715yggfygwlhe;
            }
            measuredHeight = (int) (f15 / f14);
        } else if (f18 > 0.0f) {
            f14 = this.f11715yggfygwlhe;
            measuredHeight = (int) (f15 / f14);
        } else {
            f13 = this.f11715yggfygwlhe;
            measuredWidth = (int) (f16 * f13);
        }
        this.f11716zdlpuopuiu.iobyxmoadg(this.f11715yggfygwlhe, f17, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f13) {
        if (this.f11715yggfygwlhe != f13) {
            this.f11715yggfygwlhe = f13;
            requestLayout();
        }
    }

    public void setAspectRatioListener(zoijcleaow zoijcleaowVar) {
    }

    public void setResizeMode(int i13) {
        if (this.f11714jyumaefscl != i13) {
            this.f11714jyumaefscl = i13;
            requestLayout();
        }
    }
}
