package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    Drawable f2961cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    Drawable f2962esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f2963istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private View f2964iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private View f2965jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    Drawable f2966lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    boolean f2967pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private View f2968yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f2969zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    boolean f2970zynmafqrjb;

    private static class iobyxmoadg {
        public static void iobyxmoadg(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new zoijcleaow(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.ActionBar);
        this.f2961cqumvgiudr = typedArrayObtainStyledAttributes.getDrawable(lqeggnwhkg.btonecajqb.ActionBar_background);
        this.f2962esjtqupxsv = typedArrayObtainStyledAttributes.getDrawable(lqeggnwhkg.btonecajqb.ActionBar_backgroundStacked);
        this.f2963istkbnxepw = typedArrayObtainStyledAttributes.getDimensionPixelSize(lqeggnwhkg.btonecajqb.ActionBar_height, -1);
        boolean z13 = true;
        if (getId() == lqeggnwhkg.gxszxtbevo.split_action_bar) {
            this.f2967pmvmpeiblj = true;
            this.f2966lereixgezr = typedArrayObtainStyledAttributes.getDrawable(lqeggnwhkg.btonecajqb.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f2967pmvmpeiblj ? this.f2961cqumvgiudr != null || this.f2962esjtqupxsv != null : this.f2966lereixgezr != null) {
            z13 = false;
        }
        setWillNotDraw(z13);
    }

    private int iobyxmoadg(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean zoijcleaow(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2961cqumvgiudr;
        if (drawable != null && drawable.isStateful()) {
            this.f2961cqumvgiudr.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2962esjtqupxsv;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2962esjtqupxsv.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2966lereixgezr;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2966lereixgezr.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2968yggfygwlhe;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2961cqumvgiudr;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2962esjtqupxsv;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2966lereixgezr;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2965jyumaefscl = findViewById(lqeggnwhkg.gxszxtbevo.action_bar);
        this.f2964iwizpuwonk = findViewById(lqeggnwhkg.gxszxtbevo.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2969zdlpuopuiu || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        Drawable drawable;
        super.onLayout(z13, i13, i14, i15, i16);
        View view = this.f2968yggfygwlhe;
        boolean z14 = true;
        boolean z15 = false;
        boolean z16 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i17 = layoutParams.bottomMargin;
            view.layout(i13, measuredHeight2 - i17, i15, measuredHeight - i17);
        }
        if (this.f2967pmvmpeiblj) {
            Drawable drawable2 = this.f2966lereixgezr;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z14 = z15;
            }
        } else {
            if (this.f2961cqumvgiudr != null) {
                if (this.f2965jyumaefscl.getVisibility() == 0) {
                    this.f2961cqumvgiudr.setBounds(this.f2965jyumaefscl.getLeft(), this.f2965jyumaefscl.getTop(), this.f2965jyumaefscl.getRight(), this.f2965jyumaefscl.getBottom());
                } else {
                    View view2 = this.f2964iwizpuwonk;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f2961cqumvgiudr.setBounds(0, 0, 0, 0);
                    } else {
                        this.f2961cqumvgiudr.setBounds(this.f2964iwizpuwonk.getLeft(), this.f2964iwizpuwonk.getTop(), this.f2964iwizpuwonk.getRight(), this.f2964iwizpuwonk.getBottom());
                    }
                }
                z15 = true;
            }
            this.f2970zynmafqrjb = z16;
            if (!z16 || (drawable = this.f2962esjtqupxsv) == null) {
                z14 = z15;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z14) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        int iIobyxmoadg;
        int i15;
        if (this.f2965jyumaefscl == null && View.MeasureSpec.getMode(i14) == Integer.MIN_VALUE && (i15 = this.f2963istkbnxepw) >= 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(Math.min(i15, View.MeasureSpec.getSize(i14)), Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
        if (this.f2965jyumaefscl == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i14);
        View view = this.f2968yggfygwlhe;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (zoijcleaow(this.f2965jyumaefscl)) {
            iIobyxmoadg = !zoijcleaow(this.f2964iwizpuwonk) ? iobyxmoadg(this.f2964iwizpuwonk) : 0;
        } else {
            iIobyxmoadg = iobyxmoadg(this.f2965jyumaefscl);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iIobyxmoadg + iobyxmoadg(this.f2968yggfygwlhe), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i14) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2961cqumvgiudr;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2961cqumvgiudr);
        }
        this.f2961cqumvgiudr = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2965jyumaefscl;
            if (view != null) {
                this.f2961cqumvgiudr.setBounds(view.getLeft(), this.f2965jyumaefscl.getTop(), this.f2965jyumaefscl.getRight(), this.f2965jyumaefscl.getBottom());
            }
        }
        boolean z13 = false;
        if (!this.f2967pmvmpeiblj ? !(this.f2961cqumvgiudr != null || this.f2962esjtqupxsv != null) : this.f2966lereixgezr == null) {
            z13 = true;
        }
        setWillNotDraw(z13);
        invalidate();
        iobyxmoadg.iobyxmoadg(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2966lereixgezr;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2966lereixgezr);
        }
        this.f2966lereixgezr = drawable;
        boolean z13 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2967pmvmpeiblj && (drawable2 = this.f2966lereixgezr) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2967pmvmpeiblj ? !(this.f2961cqumvgiudr != null || this.f2962esjtqupxsv != null) : this.f2966lereixgezr == null) {
            z13 = true;
        }
        setWillNotDraw(z13);
        invalidate();
        iobyxmoadg.iobyxmoadg(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2962esjtqupxsv;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2962esjtqupxsv);
        }
        this.f2962esjtqupxsv = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2970zynmafqrjb && (drawable2 = this.f2962esjtqupxsv) != null) {
                drawable2.setBounds(this.f2968yggfygwlhe.getLeft(), this.f2968yggfygwlhe.getTop(), this.f2968yggfygwlhe.getRight(), this.f2968yggfygwlhe.getBottom());
            }
        }
        boolean z13 = false;
        if (!this.f2967pmvmpeiblj ? !(this.f2961cqumvgiudr != null || this.f2962esjtqupxsv != null) : this.f2966lereixgezr == null) {
            z13 = true;
        }
        setWillNotDraw(z13);
        invalidate();
        iobyxmoadg.iobyxmoadg(this);
    }

    public void setTabContainer(dsvhmnatus dsvhmnatusVar) {
        View view = this.f2968yggfygwlhe;
        if (view != null) {
            removeView(view);
        }
        this.f2968yggfygwlhe = dsvhmnatusVar;
    }

    public void setTransitioning(boolean z13) {
        this.f2969zdlpuopuiu = z13;
        setDescendantFocusability(z13 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z13 = i13 == 0;
        Drawable drawable = this.f2961cqumvgiudr;
        if (drawable != null) {
            drawable.setVisible(z13, false);
        }
        Drawable drawable2 = this.f2962esjtqupxsv;
        if (drawable2 != null) {
            drawable2.setVisible(z13, false);
        }
        Drawable drawable3 = this.f2966lereixgezr;
        if (drawable3 != null) {
            drawable3.setVisible(z13, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2961cqumvgiudr && !this.f2967pmvmpeiblj) || (drawable == this.f2962esjtqupxsv && this.f2970zynmafqrjb) || ((drawable == this.f2966lereixgezr && this.f2967pmvmpeiblj) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i13) {
        if (i13 != 0) {
            return super.startActionModeForChild(view, callback, i13);
        }
        return null;
    }
}
