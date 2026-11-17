package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f3128jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f3129yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f3130zdlpuopuiu;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3128jyumaefscl = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.ButtonBarLayout);
        jhduphickx.sflfametgt(this, context, lqeggnwhkg.btonecajqb.ButtonBarLayout, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f3130zdlpuopuiu = typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f3130zdlpuopuiu);
        }
    }

    private int iobyxmoadg(int i13) {
        int childCount = getChildCount();
        while (i13 < childCount) {
            if (getChildAt(i13).getVisibility() == 0) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    private void setStacked(boolean z13) {
        if (this.f3129yggfygwlhe != z13) {
            if (!z13 || this.f3130zdlpuopuiu) {
                this.f3129yggfygwlhe = z13;
                setOrientation(z13 ? 1 : 0);
                setGravity(z13 ? 8388613 : 80);
                View viewFindViewById = findViewById(lqeggnwhkg.gxszxtbevo.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z13 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    private boolean zoijcleaow() {
        return this.f3129yggfygwlhe;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        int iMakeMeasureSpec;
        boolean z13;
        int size = View.MeasureSpec.getSize(i13);
        int paddingBottom = 0;
        if (this.f3130zdlpuopuiu) {
            if (size > this.f3128jyumaefscl && zoijcleaow()) {
                setStacked(false);
            }
            this.f3128jyumaefscl = size;
        }
        if (zoijcleaow() || View.MeasureSpec.getMode(i13) != 1073741824) {
            iMakeMeasureSpec = i13;
            z13 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z13 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i14);
        if (this.f3130zdlpuopuiu && !zoijcleaow() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z13 = true;
        }
        if (z13) {
            super.onMeasure(i13, i14);
        }
        int iIobyxmoadg = iobyxmoadg(0);
        if (iIobyxmoadg >= 0) {
            View childAt = getChildAt(iIobyxmoadg);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (zoijcleaow()) {
                int iIobyxmoadg2 = iobyxmoadg(iIobyxmoadg + 1);
                if (iIobyxmoadg2 >= 0) {
                    paddingTop += getChildAt(iIobyxmoadg2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (jhduphickx.pmvmpeiblj(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i14 == 0) {
                super.onMeasure(i13, i14);
            }
        }
    }

    public void setAllowStacking(boolean z13) {
        if (this.f3130zdlpuopuiu != z13) {
            this.f3130zdlpuopuiu = z13;
            if (!z13 && zoijcleaow()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
