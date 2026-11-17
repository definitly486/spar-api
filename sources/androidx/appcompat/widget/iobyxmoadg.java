package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import v1.jhduphickx;
import v1.ydmasvzmpa;
import v1.yfnezrywwk;

/* JADX INFO: loaded from: classes.dex */
abstract class iobyxmoadg extends ViewGroup {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    protected int f3312cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    protected yfnezrywwk f3313esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    protected ActionMenuPresenter f3314iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    protected ActionMenuView f3315jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f3316lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f3317pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    protected final Context f3318yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected final C0069iobyxmoadg f3319zdlpuopuiu;

    /* JADX INFO: renamed from: androidx.appcompat.widget.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    protected class C0069iobyxmoadg implements ydmasvzmpa {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f3320iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f3322zoijcleaow;

        protected C0069iobyxmoadg() {
        }

        @Override // v1.ydmasvzmpa
        public void iobyxmoadg(View view) {
            this.f3320iobyxmoadg = true;
        }

        @Override // v1.ydmasvzmpa
        public void ppxfxbqfkf(View view) {
            iobyxmoadg.super.setVisibility(0);
            this.f3320iobyxmoadg = false;
        }

        public C0069iobyxmoadg wkgbmnqykc(yfnezrywwk yfnezrywwkVar, int i13) {
            iobyxmoadg.this.f3313esjtqupxsv = yfnezrywwkVar;
            this.f3322zoijcleaow = i13;
            return this;
        }

        @Override // v1.ydmasvzmpa
        public void zoijcleaow(View view) {
            if (this.f3320iobyxmoadg) {
                return;
            }
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            iobyxmoadgVar.f3313esjtqupxsv = null;
            iobyxmoadg.super.setVisibility(this.f3322zoijcleaow);
        }
    }

    iobyxmoadg(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f3319zdlpuopuiu = new C0069iobyxmoadg();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3318yggfygwlhe = context;
        } else {
            this.f3318yggfygwlhe = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int wkgbmnqykc(int i13, int i14, boolean z13) {
        return z13 ? i13 - i14 : i13 + i14;
    }

    protected int eablkybsjg(View view, int i13, int i14, int i15, boolean z13) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i16 = i14 + ((i15 - measuredHeight) / 2);
        if (z13) {
            view.layout(i13 - measuredWidth, i16, i13, measuredHeight + i16);
        } else {
            view.layout(i13, i16, i13 + measuredWidth, measuredHeight + i16);
        }
        return z13 ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return this.f3313esjtqupxsv != null ? this.f3319zdlpuopuiu.f3322zoijcleaow : getVisibility();
    }

    public int getContentHeight() {
        return this.f3312cqumvgiudr;
    }

    public yfnezrywwk gxszxtbevo(int i13, long j13) {
        yfnezrywwk yfnezrywwkVar = this.f3313esjtqupxsv;
        if (yfnezrywwkVar != null) {
            yfnezrywwkVar.ppxfxbqfkf();
        }
        if (i13 != 0) {
            yfnezrywwk yfnezrywwkVarZoijcleaow = jhduphickx.eablkybsjg(this).zoijcleaow(0.0f);
            yfnezrywwkVarZoijcleaow.gxszxtbevo(j13);
            yfnezrywwkVarZoijcleaow.nufgyqmvbu(this.f3319zdlpuopuiu.wkgbmnqykc(yfnezrywwkVarZoijcleaow, i13));
            return yfnezrywwkVarZoijcleaow;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        yfnezrywwk yfnezrywwkVarZoijcleaow2 = jhduphickx.eablkybsjg(this).zoijcleaow(1.0f);
        yfnezrywwkVarZoijcleaow2.gxszxtbevo(j13);
        yfnezrywwkVarZoijcleaow2.nufgyqmvbu(this.f3319zdlpuopuiu.wkgbmnqykc(yfnezrywwkVarZoijcleaow2, i13));
        return yfnezrywwkVarZoijcleaow2;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, lqeggnwhkg.btonecajqb.ActionBar, lqeggnwhkg.iobyxmoadg.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(lqeggnwhkg.btonecajqb.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f3314iwizpuwonk;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.iozdgvuglv(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3317pmvmpeiblj = false;
        }
        if (!this.f3317pmvmpeiblj) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3317pmvmpeiblj = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3317pmvmpeiblj = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3316lereixgezr = false;
        }
        if (!this.f3316lereixgezr) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3316lereixgezr = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3316lereixgezr = false;
        }
        return true;
    }

    protected int ppxfxbqfkf(View view, int i13, int i14, int i15) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), i14);
        return Math.max(0, (i13 - view.getMeasuredWidth()) - i15);
    }

    public abstract void setContentHeight(int i13);

    @Override // android.view.View
    public void setVisibility(int i13) {
        if (i13 != getVisibility()) {
            yfnezrywwk yfnezrywwkVar = this.f3313esjtqupxsv;
            if (yfnezrywwkVar != null) {
                yfnezrywwkVar.ppxfxbqfkf();
            }
            super.setVisibility(i13);
        }
    }
}
