package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.yggfygwlhe;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.ojitshcjhn;
import da.draadjrbmk;
import da.wkgbmnqykc;
import ra.gtknphoqwx;
import ra.lqeggnwhkg;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final TimeInterpolator f23069iobyxmoadg = ea.iobyxmoadg.f31023zoijcleaow;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final TimeInterpolator f23073zoijcleaow = ea.iobyxmoadg.f31020iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final TimeInterpolator f23071ppxfxbqfkf = ea.iobyxmoadg.f31022wkgbmnqykc;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final boolean f23067eablkybsjg = false;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int[] f23068gxszxtbevo = {da.zoijcleaow.snackbarStyle};

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String f23070lqeggnwhkg = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final Handler f23072wkgbmnqykc = new Handler(Looper.getMainLooper(), new iobyxmoadg());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private final zoijcleaow f23074cdpycssgdh = new zoijcleaow(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public boolean ojitshcjhn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f23074cdpycssgdh.zoijcleaow(coordinatorLayout, view, motionEvent);
            return super.ojitshcjhn(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean pkzmftpjix(View view) {
            return this.f23074cdpycssgdh.iobyxmoadg(view);
        }
    }

    class iobyxmoadg implements Handler.Callback {
        iobyxmoadg() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i13 = message.what;
            if (i13 == 0) {
                yggfygwlhe.iobyxmoadg(message.obj);
                throw null;
            }
            if (i13 != 1) {
                return false;
            }
            yggfygwlhe.iobyxmoadg(message.obj);
            throw null;
        }
    }

    protected static class ppxfxbqfkf extends FrameLayout {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private static final View.OnTouchListener f23075cdpycssgdh = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final int f23076cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final int f23077esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private boolean f23078istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final float f23079iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final float f23080jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private ColorStateList f23081lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private PorterDuff.Mode f23082pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f23083yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        gtknphoqwx f23084zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private Rect f23085zynmafqrjb;

        class iobyxmoadg implements View.OnTouchListener {
            iobyxmoadg() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected ppxfxbqfkf(Context context, AttributeSet attributeSet) {
            super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, draadjrbmk.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.SnackbarLayout_elevation)) {
                jhduphickx.tbqsvytpvh(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(draadjrbmk.SnackbarLayout_elevation, 0));
            }
            this.f23083yggfygwlhe = typedArrayObtainStyledAttributes.getInt(draadjrbmk.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(draadjrbmk.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(draadjrbmk.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f23084zdlpuopuiu = gtknphoqwx.eablkybsjg(context2, attributeSet, 0, 0).wflxmlrfwp();
            }
            this.f23080jyumaefscl = typedArrayObtainStyledAttributes.getFloat(draadjrbmk.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayObtainStyledAttributes, draadjrbmk.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(ojitshcjhn.btonecajqb(typedArrayObtainStyledAttributes.getInt(draadjrbmk.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f23079iwizpuwonk = typedArrayObtainStyledAttributes.getFloat(draadjrbmk.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f23076cqumvgiudr = typedArrayObtainStyledAttributes.getDimensionPixelSize(draadjrbmk.SnackbarLayout_android_maxWidth, -1);
            this.f23077esjtqupxsv = typedArrayObtainStyledAttributes.getDimensionPixelSize(draadjrbmk.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f23075cdpycssgdh);
            setFocusable(true);
            if (getBackground() == null) {
                jhduphickx.weqkydbzbr(this, iobyxmoadg());
            }
        }

        private Drawable iobyxmoadg() {
            int iGtknphoqwx = ia.iobyxmoadg.gtknphoqwx(this, da.zoijcleaow.colorSurface, da.zoijcleaow.colorOnSurface, getBackgroundOverlayColorAlpha());
            gtknphoqwx gtknphoqwxVar = this.f23084zdlpuopuiu;
            Drawable drawableWkgbmnqykc = gtknphoqwxVar != null ? BaseTransientBottomBar.wkgbmnqykc(iGtknphoqwx, gtknphoqwxVar) : BaseTransientBottomBar.ppxfxbqfkf(iGtknphoqwx, getResources());
            if (this.f23081lereixgezr == null) {
                return k1.iobyxmoadg.oxmwwwfdhm(drawableWkgbmnqykc);
            }
            Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(drawableWkgbmnqykc);
            k1.iobyxmoadg.ojitshcjhn(drawableOxmwwwfdhm, this.f23081lereixgezr);
            return drawableOxmwwwfdhm;
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        private void zoijcleaow(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f23085zynmafqrjb = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        float getActionTextColorAlpha() {
            return this.f23079iwizpuwonk;
        }

        int getAnimationMode() {
            return this.f23083yggfygwlhe;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f23080jyumaefscl;
        }

        int getMaxInlineActionWidth() {
            return this.f23077esjtqupxsv;
        }

        int getMaxWidth() {
            return this.f23076cqumvgiudr;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            jhduphickx.ydmasvzmpa(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
            super.onLayout(z13, i13, i14, i15, i16);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i13, int i14) {
            super.onMeasure(i13, i14);
            if (this.f23076cqumvgiudr > 0) {
                int measuredWidth = getMeasuredWidth();
                int i15 = this.f23076cqumvgiudr;
                if (measuredWidth > i15) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), i14);
                }
            }
        }

        void setAnimationMode(int i13) {
            this.f23083yggfygwlhe = i13;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f23081lereixgezr != null) {
                drawable = k1.iobyxmoadg.oxmwwwfdhm(drawable.mutate());
                k1.iobyxmoadg.ojitshcjhn(drawable, this.f23081lereixgezr);
                k1.iobyxmoadg.rgvfuqvkyq(drawable, this.f23082pmvmpeiblj);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f23081lereixgezr = colorStateList;
            if (getBackground() != null) {
                Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(getBackground().mutate());
                k1.iobyxmoadg.ojitshcjhn(drawableOxmwwwfdhm, colorStateList);
                k1.iobyxmoadg.rgvfuqvkyq(drawableOxmwwwfdhm, this.f23082pmvmpeiblj);
                if (drawableOxmwwwfdhm != getBackground()) {
                    super.setBackgroundDrawable(drawableOxmwwwfdhm);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f23082pmvmpeiblj = mode;
            if (getBackground() != null) {
                Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(getBackground().mutate());
                k1.iobyxmoadg.rgvfuqvkyq(drawableOxmwwwfdhm, mode);
                if (drawableOxmwwwfdhm != getBackground()) {
                    super.setBackgroundDrawable(drawableOxmwwwfdhm);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f23078istkbnxepw || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            zoijcleaow((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f23075cdpycssgdh);
            super.setOnClickListener(onClickListener);
        }
    }

    public static class zoijcleaow {
        public zoijcleaow(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.wypolnanlu(0.1f);
            swipeDismissBehavior.dsvhmnatus(0.6f);
            swipeDismissBehavior.stevsuqkhv(0);
        }

        public boolean iobyxmoadg(View view) {
            return view instanceof ppxfxbqfkf;
        }

        public void zoijcleaow(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.zynmafqrjb(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.iobyxmoadg.zoijcleaow().eablkybsjg(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.iobyxmoadg.zoijcleaow().gxszxtbevo(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable ppxfxbqfkf(int i13, Resources resources) {
        float dimension = resources.getDimension(wkgbmnqykc.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i13);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static lqeggnwhkg wkgbmnqykc(int i13, gtknphoqwx gtknphoqwxVar) {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(gtknphoqwxVar);
        lqeggnwhkgVar.crxdokpmqz(ColorStateList.valueOf(i13));
        return lqeggnwhkgVar;
    }
}
