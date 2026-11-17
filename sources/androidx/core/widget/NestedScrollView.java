package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import v1.cdpycssgdh;
import v1.iozdgvuglv;
import v1.jhduphickx;
import v1.ojitshcjhn;
import v1.rgvfuqvkyq;
import v1.wwaezpbzkn;
import v1.yadqdtsiqt;
import v1.ylkuphrtab;
import w1.jyumaefscl;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements wwaezpbzkn, yadqdtsiqt {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f8508cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f8509cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public EdgeEffect f8510cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f8511dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public EdgeEffect f8512esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f8513hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final int[] f8514hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f8515iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private View f8516istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private OverScroller f8517iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final int[] f8518jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Rect f8519jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final iozdgvuglv f8520kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f8521lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f8522lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private eablkybsjg f8523mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    final wkgbmnqykc f8524ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f8525pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f8526pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final ylkuphrtab f8527stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private float f8528tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    ojitshcjhn f8529ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f8530wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private SavedState f8531wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private VelocityTracker f8532yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f8533yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f8534ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f8535zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f8536zynmafqrjb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private static final float f8507sopmlzcsov = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private static final iobyxmoadg f8505crxdokpmqz = new iobyxmoadg();

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private static final int[] f8506jlmebxxoox = {R.attr.fillViewport};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public int f8537zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f8537zdlpuopuiu + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f8537zdlpuopuiu);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f8537zdlpuopuiu = parcel.readInt();
        }
    }

    public interface eablkybsjg {
        void iobyxmoadg(NestedScrollView nestedScrollView, int i13, int i14, int i15, int i16);
    }

    static class iobyxmoadg extends v1.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // v1.iobyxmoadg
        public boolean btonecajqb(View view, int i13, Bundle bundle) {
            if (super.btonecajqb(view, i13, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i13 != 4096) {
                if (i13 == 8192 || i13 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.sopmlzcsov(0, iMax, true);
                    return true;
                }
                if (i13 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.sopmlzcsov(0, iMin, true);
            return true;
        }

        @Override // v1.iobyxmoadg
        public void gxszxtbevo(View view, AccessibilityEvent accessibilityEvent) {
            super.gxszxtbevo(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            jyumaefscl.iobyxmoadg(accessibilityEvent, nestedScrollView.getScrollX());
            jyumaefscl.zoijcleaow(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            int scrollRange;
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            zdlpuopuiuVar.uwvvkdfqfp(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            zdlpuopuiuVar.mhtqkkgtqm(true);
            if (nestedScrollView.getScrollY() > 0) {
                zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118538oxmwwwfdhm);
                zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118525istkbnxepw);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118545vdvldrhtss);
                zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118549yadqdtsiqt);
            }
        }
    }

    private static final class ppxfxbqfkf {
        public static void iobyxmoadg(View view, float f13) {
            try {
                view.setFrameContentVelocity(f13);
            } catch (LinkageError unused) {
            }
        }
    }

    class wkgbmnqykc implements rgvfuqvkyq {
        wkgbmnqykc() {
        }

        @Override // v1.rgvfuqvkyq
        public boolean iobyxmoadg(float f13) {
            if (f13 == 0.0f) {
                return false;
            }
            ppxfxbqfkf();
            NestedScrollView.this.jyumaefscl((int) f13);
            return true;
        }

        @Override // v1.rgvfuqvkyq
        public void ppxfxbqfkf() {
            NestedScrollView.this.f8517iwizpuwonk.abortAnimation();
        }

        @Override // v1.rgvfuqvkyq
        public float zoijcleaow() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }
    }

    static class zoijcleaow {
        static boolean iobyxmoadg(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g1.iobyxmoadg.nestedScrollViewStyle);
    }

    private void cdpycssgdh(int i13, int i14) {
        this.f8521lereixgezr = i13;
        this.f8513hcddaimhww = i14;
        crxdokpmqz(2, 0);
    }

    private void cllcsxoeiz(boolean z13) {
        if (z13) {
            crxdokpmqz(2, 1);
        } else {
            ribwqtqdhb(1);
        }
        this.f8511dsvhmnatus = getScrollY();
        postInvalidateOnAnimation();
    }

    private float cqumvgiudr(int i13) {
        double dLog = Math.log((Math.abs(i13) * 0.35f) / (this.f8535zdlpuopuiu * 0.015f));
        float f13 = f8507sopmlzcsov;
        return (float) (((double) (this.f8535zdlpuopuiu * 0.015f)) * Math.exp((((double) f13) / (((double) f13) - 1.0d)) * dLog));
    }

    private boolean dsvhmnatus(int i13, int i14, int i15) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i16 = height + scrollY;
        boolean z13 = false;
        boolean z14 = i13 == 33;
        View viewYggfygwlhe = yggfygwlhe(z14, i14, i15);
        if (viewYggfygwlhe == null) {
            viewYggfygwlhe = this;
        }
        if (i14 < scrollY || i15 > i16) {
            wypolnanlu(z14 ? i14 - scrollY : i15 - i16, 0, 1, true);
            z13 = true;
        }
        if (viewYggfygwlhe != findFocus()) {
            viewYggfygwlhe.requestFocus(i13);
        }
        return z13;
    }

    private boolean eablkybsjg() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int gxszxtbevo(int i13, int i14, int i15) {
        if (i14 >= i15 || i13 < 0) {
            return 0;
        }
        return i14 + i13 > i15 ? i15 - i14 : i13;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    private int hkdspvbjdz(int i13, float f13) {
        float fWkgbmnqykc;
        int iRound;
        float width = f13 / getWidth();
        float height = i13 / getHeight();
        float f14 = 0.0f;
        if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8510cqumvgiudr) == 0.0f) {
            if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8512esjtqupxsv) != 0.0f) {
                fWkgbmnqykc = androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f8512esjtqupxsv, height, 1.0f - width);
                if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8512esjtqupxsv) == 0.0f) {
                    this.f8512esjtqupxsv.onRelease();
                }
            }
            iRound = Math.round(f14 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fWkgbmnqykc = -androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f8510cqumvgiudr, -height, width);
        if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8510cqumvgiudr) == 0.0f) {
            this.f8510cqumvgiudr.onRelease();
        }
        f14 = fWkgbmnqykc;
        iRound = Math.round(f14 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void iobyxmoadg() {
        this.f8517iwizpuwonk.abortAnimation();
        ribwqtqdhb(1);
    }

    private static boolean iozdgvuglv(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && iozdgvuglv((View) parent, view2);
    }

    private void istkbnxepw() {
        if (this.f8532yadqdtsiqt == null) {
            this.f8532yadqdtsiqt = VelocityTracker.obtain();
        }
    }

    private boolean jlmebxxoox(MotionEvent motionEvent) {
        boolean z13;
        if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8510cqumvgiudr) != 0.0f) {
            androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f8510cqumvgiudr, 0.0f, motionEvent.getX() / getWidth());
            z13 = true;
        } else {
            z13 = false;
        }
        if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8512esjtqupxsv) == 0.0f) {
            return z13;
        }
        androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f8512esjtqupxsv, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void jpowsppfya() {
        VelocityTracker velocityTracker = this.f8532yadqdtsiqt;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8532yadqdtsiqt = null;
        }
    }

    private void kcexrzcfyt() {
        this.f8513hcddaimhww = -1;
        this.f8508cdpycssgdh = false;
        jpowsppfya();
        ribwqtqdhb(0);
        this.f8510cqumvgiudr.onRelease();
        this.f8512esjtqupxsv.onRelease();
    }

    private boolean kegysxyocb(Rect rect, boolean z13) {
        int iLqeggnwhkg = lqeggnwhkg(rect);
        boolean z14 = iLqeggnwhkg != 0;
        if (z14) {
            if (z13) {
                scrollBy(0, iLqeggnwhkg);
            } else {
                mbcevpiqjq(0, iLqeggnwhkg);
            }
        }
        return z14;
    }

    private boolean lereixgezr(int i13, int i14) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i14 >= childAt.getTop() - scrollY && i14 < childAt.getBottom() - scrollY && i13 >= childAt.getLeft() && i13 < childAt.getRight();
    }

    private boolean lmojexxdyd(View view, int i13, int i14) {
        view.getDrawingRect(this.f8519jyumaefscl);
        offsetDescendantRectToMyCoords(view, this.f8519jyumaefscl);
        return this.f8519jyumaefscl.bottom + i13 >= getScrollY() && this.f8519jyumaefscl.top - i13 <= getScrollY() + i14;
    }

    private void ntlheqmsrt(int i13, int i14, int i15, boolean z13) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f8533yggfygwlhe > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f8517iwizpuwonk.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i14 + scrollY, Math.max(0, height - height2))) - scrollY, i15);
            cllcsxoeiz(z13);
        } else {
            if (!this.f8517iwizpuwonk.isFinished()) {
                iobyxmoadg();
            }
            scrollBy(i13, i14);
        }
        this.f8533yggfygwlhe = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean oxmwwwfdhm(int i13) {
        if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8510cqumvgiudr) != 0.0f) {
            if (tzroggbefp(this.f8510cqumvgiudr, i13)) {
                this.f8510cqumvgiudr.onAbsorb(i13);
            } else {
                jyumaefscl(-i13);
            }
        } else {
            if (androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8512esjtqupxsv) == 0.0f) {
                return false;
            }
            int i14 = -i13;
            if (tzroggbefp(this.f8512esjtqupxsv, i14)) {
                this.f8512esjtqupxsv.onAbsorb(i14);
            } else {
                jyumaefscl(i14);
            }
        }
        return true;
    }

    private void pmvmpeiblj() {
        VelocityTracker velocityTracker = this.f8532yadqdtsiqt;
        if (velocityTracker == null) {
            this.f8532yadqdtsiqt = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void stevsuqkhv(View view) {
        view.getDrawingRect(this.f8519jyumaefscl);
        offsetDescendantRectToMyCoords(view, this.f8519jyumaefscl);
        int iLqeggnwhkg = lqeggnwhkg(this.f8519jyumaefscl);
        if (iLqeggnwhkg != 0) {
            scrollBy(0, iLqeggnwhkg);
        }
    }

    private boolean tzroggbefp(EdgeEffect edgeEffect, int i13) {
        if (i13 > 0) {
            return true;
        }
        return cqumvgiudr(-i13) < androidx.core.widget.wkgbmnqykc.zoijcleaow(edgeEffect) * ((float) getHeight());
    }

    private void vdvldrhtss(int i13) {
        if (i13 != 0) {
            if (this.f8522lmojexxdyd) {
                mbcevpiqjq(0, i13);
            } else {
                scrollBy(0, i13);
            }
        }
    }

    private boolean wkgbmnqykc() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private void wwaezpbzkn(int i13, int i14, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i13);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f8520kegysxyocb.eablkybsjg(0, scrollY2, 0, i13 - scrollY2, null, i14, iArr);
    }

    private int wypolnanlu(int i13, int i14, int i15, boolean z13) {
        int i16;
        int i17;
        VelocityTracker velocityTracker;
        if (i15 == 1) {
            crxdokpmqz(2, i15);
        }
        boolean z14 = false;
        if (draadjrbmk(0, i13, this.f8514hkdspvbjdz, this.f8518jpowsppfya, i15)) {
            i16 = i13 - this.f8514hkdspvbjdz[1];
            i17 = this.f8518jpowsppfya[1];
        } else {
            i16 = i13;
            i17 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z15 = wkgbmnqykc() && !z13;
        boolean z16 = pkzmftpjix(0, i16, 0, scrollY, 0, scrollRange, 0, 0, true) && !esjtqupxsv(i15);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f8514hkdspvbjdz;
        iArr[1] = 0;
        ojitshcjhn(0, scrollY2, 0, i16 - scrollY2, this.f8518jpowsppfya, i15, iArr);
        int i18 = i17 + this.f8518jpowsppfya[1];
        int i19 = i16 - this.f8514hkdspvbjdz[1];
        int i23 = scrollY + i19;
        if (i23 < 0) {
            if (z15) {
                androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f8510cqumvgiudr, (-i19) / getHeight(), i14 / getWidth());
                if (!this.f8512esjtqupxsv.isFinished()) {
                    this.f8512esjtqupxsv.onRelease();
                }
            }
        } else if (i23 > scrollRange && z15) {
            androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f8512esjtqupxsv, i19 / getHeight(), 1.0f - (i14 / getWidth()));
            if (!this.f8510cqumvgiudr.isFinished()) {
                this.f8510cqumvgiudr.onRelease();
            }
        }
        if (this.f8510cqumvgiudr.isFinished() && this.f8512esjtqupxsv.isFinished()) {
            z14 = z16;
        } else {
            postInvalidateOnAnimation();
        }
        if (z14 && i15 == 0 && (velocityTracker = this.f8532yadqdtsiqt) != null) {
            velocityTracker.clear();
        }
        if (i15 == 1) {
            ribwqtqdhb(i15);
            this.f8510cqumvgiudr.onRelease();
            this.f8512esjtqupxsv.onRelease();
        }
        return i18;
    }

    private boolean yadqdtsiqt(View view) {
        return !lmojexxdyd(view, 0, getHeight());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private View yggfygwlhe(boolean z13, int i13, int i14) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i13 < bottom && top < i14) {
                boolean z15 = i13 < top && bottom < i14;
                if (view == null) {
                    view = view2;
                    z14 = z15;
                } else {
                    boolean z16 = (z13 && top < view.getTop()) || (!z13 && bottom > view.getBottom());
                    if (z14) {
                        if (z15 && z16) {
                            view = view2;
                        }
                    } else if (z15) {
                        view = view2;
                        z14 = true;
                    } else if (z16) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private void ylkuphrtab(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8513hcddaimhww) {
            int i13 = actionIndex == 0 ? 1 : 0;
            this.f8521lereixgezr = (int) motionEvent.getY(i13);
            this.f8513hcddaimhww = motionEvent.getPointerId(i13);
            VelocityTracker velocityTracker = this.f8532yadqdtsiqt;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void zynmafqrjb() {
        this.f8517iwizpuwonk = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f8530wwaezpbzkn = viewConfiguration.getScaledTouchSlop();
        this.f8534ylkuphrtab = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8525pkzmftpjix = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // v1.lmojexxdyd
    public void agtfadlqog(View view, int i13, int i14, int i15, int i16, int i17) {
        wwaezpbzkn(i16, i17, null);
    }

    @Override // v1.lmojexxdyd
    public void btonecajqb(View view, int i13) {
        this.f8527stevsuqkhv.eablkybsjg(view, i13);
        ribwqtqdhb(i13);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f8517iwizpuwonk.isFinished()) {
            return;
        }
        this.f8517iwizpuwonk.computeScrollOffset();
        int currY = this.f8517iwizpuwonk.getCurrY();
        int iNufgyqmvbu = nufgyqmvbu(currY - this.f8511dsvhmnatus);
        this.f8511dsvhmnatus = currY;
        int[] iArr = this.f8514hkdspvbjdz;
        iArr[1] = 0;
        draadjrbmk(0, iNufgyqmvbu, iArr, null, 1);
        int i13 = iNufgyqmvbu - this.f8514hkdspvbjdz[1];
        int scrollRange = getScrollRange();
        if (q1.iobyxmoadg.ppxfxbqfkf()) {
            ppxfxbqfkf.iobyxmoadg(this, Math.abs(this.f8517iwizpuwonk.getCurrVelocity()));
        }
        if (i13 != 0) {
            int scrollY = getScrollY();
            pkzmftpjix(0, i13, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i14 = i13 - scrollY2;
            int[] iArr2 = this.f8514hkdspvbjdz;
            iArr2[1] = 0;
            ojitshcjhn(0, scrollY2, 0, i14, this.f8518jpowsppfya, 1, iArr2);
            i13 = i14 - this.f8514hkdspvbjdz[1];
        }
        if (i13 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i13 < 0) {
                    if (this.f8510cqumvgiudr.isFinished()) {
                        this.f8510cqumvgiudr.onAbsorb((int) this.f8517iwizpuwonk.getCurrVelocity());
                    }
                } else if (this.f8512esjtqupxsv.isFinished()) {
                    this.f8512esjtqupxsv.onAbsorb((int) this.f8517iwizpuwonk.getCurrVelocity());
                }
            }
            iobyxmoadg();
        }
        if (this.f8517iwizpuwonk.isFinished()) {
            ribwqtqdhb(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public boolean crxdokpmqz(int i13, int i14) {
        return this.f8520kegysxyocb.rgvfuqvkyq(i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || zdlpuopuiu(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f13, float f14, boolean z13) {
        return this.f8520kegysxyocb.iobyxmoadg(f13, f14, z13);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f13, float f14) {
        return this.f8520kegysxyocb.zoijcleaow(f13, f14);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return draadjrbmk(i13, i14, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return this.f8520kegysxyocb.gxszxtbevo(i13, i14, i15, i16, iArr);
    }

    public boolean draadjrbmk(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        return this.f8520kegysxyocb.wkgbmnqykc(i13, i14, iArr, iArr2, i15);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f8510cqumvgiudr.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (zoijcleaow.iobyxmoadg(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (zoijcleaow.iobyxmoadg(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f8510cqumvgiudr.setSize(width, height);
            if (this.f8510cqumvgiudr.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f8512esjtqupxsv.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (zoijcleaow.iobyxmoadg(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (zoijcleaow.iobyxmoadg(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f8512esjtqupxsv.setSize(width2, height2);
        if (this.f8512esjtqupxsv.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // v1.lmojexxdyd
    public void dxjokdxxww(View view, View view2, int i13, int i14) {
        this.f8527stevsuqkhv.ppxfxbqfkf(view, view2, i13, i14);
        crxdokpmqz(2, i14);
    }

    public boolean esjtqupxsv(int i13) {
        return this.f8520kegysxyocb.gtknphoqwx(i13);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f8527stevsuqkhv.iobyxmoadg();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f8528tzroggbefp == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f8528tzroggbefp = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f8528tzroggbefp;
    }

    @Override // v1.lmojexxdyd
    public void gtknphoqwx(View view, int i13, int i14, int[] iArr, int i15) {
        draadjrbmk(i13, i14, iArr, null, i15);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return esjtqupxsv(0);
    }

    public boolean hcddaimhww(int i13) {
        boolean z13 = i13 == 130;
        int height = getHeight();
        if (z13) {
            this.f8519jyumaefscl.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f8519jyumaefscl;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f8519jyumaefscl.top = getScrollY() - height;
            Rect rect2 = this.f8519jyumaefscl;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f8519jyumaefscl;
        int i14 = rect3.top;
        int i15 = height + i14;
        rect3.bottom = i15;
        return dsvhmnatus(i13, i14, i15);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f8520kegysxyocb.draadjrbmk();
    }

    public boolean iwizpuwonk(int i13) {
        int childCount;
        boolean z13 = i13 == 130;
        int height = getHeight();
        Rect rect = this.f8519jyumaefscl;
        rect.top = 0;
        rect.bottom = height;
        if (z13 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f8519jyumaefscl.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f8519jyumaefscl;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f8519jyumaefscl;
        return dsvhmnatus(i13, rect3.top, rect3.bottom);
    }

    public void jyumaefscl(int i13) {
        if (getChildCount() > 0) {
            this.f8517iwizpuwonk.fling(getScrollX(), getScrollY(), 0, i13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            cllcsxoeiz(true);
            if (q1.iobyxmoadg.ppxfxbqfkf()) {
                ppxfxbqfkf.iobyxmoadg(this, Math.abs(this.f8517iwizpuwonk.getCurrVelocity()));
            }
        }
    }

    protected int lqeggnwhkg(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i14 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i13 - verticalFadingEdgeLength : i13;
        int i15 = rect.bottom;
        if (i15 > i14 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i14, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i15 >= i14) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i14 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void mbcevpiqjq(int i13, int i14) {
        ntlheqmsrt(i13, i14, 250, false);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i13, int i14) {
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    int nufgyqmvbu(int i13) {
        int height = getHeight();
        if (i13 > 0 && androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8510cqumvgiudr) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f8510cqumvgiudr, ((-i13) * 4.0f) / height, 0.5f));
            if (iRound != i13) {
                this.f8510cqumvgiudr.finish();
            }
            return i13 - iRound;
        }
        if (i13 >= 0 || androidx.core.widget.wkgbmnqykc.zoijcleaow(this.f8512esjtqupxsv) == 0.0f) {
            return i13;
        }
        float f13 = height;
        int iRound2 = Math.round((f13 / 4.0f) * androidx.core.widget.wkgbmnqykc.wkgbmnqykc(this.f8512esjtqupxsv, (i13 * 4.0f) / f13, 0.5f));
        if (iRound2 != i13) {
            this.f8512esjtqupxsv.finish();
        }
        return i13 - iRound2;
    }

    public void ojitshcjhn(int i13, int i14, int i15, int i16, int[] iArr, int i17, int[] iArr2) {
        this.f8520kegysxyocb.eablkybsjg(i13, i14, i15, i16, iArr, i17, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8536zynmafqrjb = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i13;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f8508cdpycssgdh) {
            if (cdpycssgdh.iobyxmoadg(motionEvent, 2)) {
                i13 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (cdpycssgdh.iobyxmoadg(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i13 = 26;
                axisValue = axisValue2;
            } else {
                i13 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                wypolnanlu(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, cdpycssgdh.iobyxmoadg(motionEvent, 8194));
                if (i13 != 0) {
                    this.f8529ulzqkzuiru.lqeggnwhkg(motionEvent, i13);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z13 = true;
        if (action == 2 && this.f8508cdpycssgdh) {
            return true;
        }
        int i13 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i13 == 0) {
            int y13 = (int) motionEvent.getY();
            if (lereixgezr((int) motionEvent.getX(), y13)) {
                this.f8521lereixgezr = y13;
                this.f8513hcddaimhww = motionEvent.getPointerId(0);
                pmvmpeiblj();
                this.f8532yadqdtsiqt.addMovement(motionEvent);
                this.f8517iwizpuwonk.computeScrollOffset();
                if (!jlmebxxoox(motionEvent) && this.f8517iwizpuwonk.isFinished()) {
                    z13 = false;
                }
                this.f8508cdpycssgdh = z13;
                crxdokpmqz(2, 0);
            } else {
                if (!jlmebxxoox(motionEvent) && this.f8517iwizpuwonk.isFinished()) {
                    z13 = false;
                }
                this.f8508cdpycssgdh = z13;
                jpowsppfya();
            }
        } else if (i13 == 1) {
            this.f8508cdpycssgdh = false;
            this.f8513hcddaimhww = -1;
            jpowsppfya();
            if (this.f8517iwizpuwonk.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            ribwqtqdhb(0);
        } else if (i13 == 2) {
            int i14 = this.f8513hcddaimhww;
            if (i14 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i14);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i14 + " in onInterceptTouchEvent");
                } else {
                    int y14 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y14 - this.f8521lereixgezr) > this.f8530wwaezpbzkn && (2 & getNestedScrollAxes()) == 0) {
                        this.f8508cdpycssgdh = true;
                        this.f8521lereixgezr = y14;
                        istkbnxepw();
                        this.f8532yadqdtsiqt.addMovement(motionEvent);
                        this.f8509cllcsxoeiz = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i13 == 3) {
            this.f8508cdpycssgdh = false;
            this.f8513hcddaimhww = -1;
            jpowsppfya();
            if (this.f8517iwizpuwonk.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            ribwqtqdhb(0);
        } else if (i13 == 6) {
            ylkuphrtab(motionEvent);
        }
        return this.f8508cdpycssgdh;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        int measuredHeight = 0;
        this.f8526pmvmpeiblj = false;
        View view = this.f8516istkbnxepw;
        if (view != null && iozdgvuglv(view, this)) {
            stevsuqkhv(this.f8516istkbnxepw);
        }
        this.f8516istkbnxepw = null;
        if (!this.f8536zynmafqrjb) {
            if (this.f8531wypolnanlu != null) {
                scrollTo(getScrollX(), this.f8531wypolnanlu.f8537zdlpuopuiu);
                this.f8531wypolnanlu = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i16 - i14) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iGxszxtbevo = gxszxtbevo(scrollY, paddingTop, measuredHeight);
            if (iGxszxtbevo != scrollY) {
                scrollTo(getScrollX(), iGxszxtbevo);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f8536zynmafqrjb = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f8515iozdgvuglv && View.MeasureSpec.getMode(i14) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        if (z13) {
            return false;
        }
        dispatchNestedFling(0.0f, f14, true);
        jyumaefscl((int) f14);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f13, float f14) {
        return dispatchNestedPreFling(f13, f14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        gtknphoqwx(view, i13, i14, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        wwaezpbzkn(i16, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i13) {
        dxjokdxxww(view, view2, i13, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i13, int i14, boolean z13, boolean z14) {
        super.scrollTo(i13, i14);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i13, Rect rect) {
        if (i13 == 2) {
            i13 = 130;
        } else if (i13 == 1) {
            i13 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i13) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i13);
        if (viewFindNextFocus == null || yadqdtsiqt(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i13, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f8531wypolnanlu = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8537zdlpuopuiu = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i13, int i14, int i15, int i16) {
        super.onScrollChanged(i13, i14, i15, i16);
        eablkybsjg eablkybsjgVar = this.f8523mbcevpiqjq;
        if (eablkybsjgVar != null) {
            eablkybsjgVar.iobyxmoadg(this, i13, i14, i15, i16);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !lmojexxdyd(viewFindFocus, 0, i16)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f8519jyumaefscl);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f8519jyumaefscl);
        vdvldrhtss(lqeggnwhkg(this.f8519jyumaefscl));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i13) {
        return rgvfuqvkyq(view, view2, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        btonecajqb(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        istkbnxepw();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8509cllcsxoeiz = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f8509cllcsxoeiz);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f8532yadqdtsiqt;
                velocityTracker.computeCurrentVelocity(1000, this.f8525pkzmftpjix);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f8513hcddaimhww);
                if (Math.abs(yVelocity) >= this.f8534ylkuphrtab) {
                    if (!oxmwwwfdhm(yVelocity)) {
                        int i13 = -yVelocity;
                        float f13 = i13;
                        if (!dispatchNestedPreFling(0.0f, f13)) {
                            dispatchNestedFling(0.0f, f13, true);
                            jyumaefscl(i13);
                        }
                    }
                } else if (this.f8517iwizpuwonk.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                kcexrzcfyt();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f8513hcddaimhww);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f8513hcddaimhww + " in onTouchEvent");
                } else {
                    int y13 = (int) motionEvent.getY(iFindPointerIndex);
                    int i14 = this.f8521lereixgezr - y13;
                    int iHkdspvbjdz = i14 - hkdspvbjdz(i14, motionEvent.getX(iFindPointerIndex));
                    if (!this.f8508cdpycssgdh && Math.abs(iHkdspvbjdz) > this.f8530wwaezpbzkn) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f8508cdpycssgdh = true;
                        iHkdspvbjdz = iHkdspvbjdz > 0 ? iHkdspvbjdz - this.f8530wwaezpbzkn : iHkdspvbjdz + this.f8530wwaezpbzkn;
                    }
                    if (this.f8508cdpycssgdh) {
                        int iWypolnanlu = wypolnanlu(iHkdspvbjdz, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f8521lereixgezr = y13 - iWypolnanlu;
                        this.f8509cllcsxoeiz += iWypolnanlu;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f8508cdpycssgdh && getChildCount() > 0 && this.f8517iwizpuwonk.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                kcexrzcfyt();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f8521lereixgezr = (int) motionEvent.getY(actionIndex);
                this.f8513hcddaimhww = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                ylkuphrtab(motionEvent);
                this.f8521lereixgezr = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f8513hcddaimhww));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f8508cdpycssgdh && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f8517iwizpuwonk.isFinished()) {
                iobyxmoadg();
            }
            cdpycssgdh((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f8532yadqdtsiqt;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    boolean pkzmftpjix(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, boolean z13) {
        boolean z14;
        boolean z15;
        int overScrollMode = getOverScrollMode();
        boolean z16 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z17 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z18 = overScrollMode == 0 || (overScrollMode == 1 && z16);
        boolean z19 = overScrollMode == 0 || (overScrollMode == 1 && z17);
        int i24 = i15 + i13;
        int i25 = !z18 ? 0 : i19;
        int i26 = i16 + i14;
        int i27 = !z19 ? 0 : i23;
        int i28 = -i25;
        int i29 = i25 + i17;
        int i33 = -i27;
        int i34 = i27 + i18;
        if (i24 > i29) {
            i24 = i29;
            z14 = true;
        } else if (i24 < i28) {
            z14 = true;
            i24 = i28;
        } else {
            z14 = false;
        }
        if (i26 > i34) {
            i26 = i34;
            z15 = true;
        } else if (i26 < i33) {
            z15 = true;
            i26 = i33;
        } else {
            z15 = false;
        }
        if (z15 && !esjtqupxsv(1)) {
            this.f8517iwizpuwonk.springBack(i24, i26, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i24, i26, z14, z15);
        return z14 || z15;
    }

    public boolean ppxfxbqfkf(int i13) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i13);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !lmojexxdyd(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i13 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i13 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i13 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            wypolnanlu(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f8519jyumaefscl);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f8519jyumaefscl);
            wypolnanlu(lqeggnwhkg(this.f8519jyumaefscl), 0, 1, true);
            viewFindNextFocus.requestFocus(i13);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && yadqdtsiqt(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f8526pmvmpeiblj) {
            this.f8516istkbnxepw = view2;
        } else {
            stevsuqkhv(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z13) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return kegysxyocb(rect, z13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z13) {
        if (z13) {
            jpowsppfya();
        }
        super.requestDisallowInterceptTouchEvent(z13);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f8526pmvmpeiblj = true;
        super.requestLayout();
    }

    @Override // v1.lmojexxdyd
    public boolean rgvfuqvkyq(View view, View view2, int i13, int i14) {
        return (i13 & 2) != 0;
    }

    public void ribwqtqdhb(int i13) {
        this.f8520kegysxyocb.oxmwwwfdhm(i13);
    }

    @Override // android.view.View
    public void scrollTo(int i13, int i14) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iGxszxtbevo = gxszxtbevo(i13, width, width2);
            int iGxszxtbevo2 = gxszxtbevo(i14, height, height2);
            if (iGxszxtbevo == getScrollX() && iGxszxtbevo2 == getScrollY()) {
                return;
            }
            super.scrollTo(iGxszxtbevo, iGxszxtbevo2);
        }
    }

    public void setFillViewport(boolean z13) {
        if (z13 != this.f8515iozdgvuglv) {
            this.f8515iozdgvuglv = z13;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z13) {
        this.f8520kegysxyocb.wflxmlrfwp(z13);
    }

    public void setOnScrollChangeListener(eablkybsjg eablkybsjgVar) {
        this.f8523mbcevpiqjq = eablkybsjgVar;
    }

    public void setSmoothScrollingEnabled(boolean z13) {
        this.f8522lmojexxdyd = z13;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    void sopmlzcsov(int i13, int i14, boolean z13) {
        ulzqkzuiru(i13, i14, 250, z13);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i13) {
        return crxdokpmqz(i13, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        ribwqtqdhb(0);
    }

    void ulzqkzuiru(int i13, int i14, int i15, boolean z13) {
        ntlheqmsrt(i13 - getScrollX(), i14 - getScrollY(), i15, z13);
    }

    @Override // v1.wwaezpbzkn
    public void wflxmlrfwp(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        wwaezpbzkn(i16, i17, iArr);
    }

    public boolean zdlpuopuiu(KeyEvent keyEvent) {
        this.f8519jyumaefscl.setEmpty();
        if (!eablkybsjg()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? iwizpuwonk(33) : ppxfxbqfkf(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? iwizpuwonk(130) : ppxfxbqfkf(130);
        }
        if (keyCode == 62) {
            hcddaimhww(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return iwizpuwonk(33);
        }
        if (keyCode == 93) {
            return iwizpuwonk(130);
        }
        if (keyCode == 122) {
            hcddaimhww(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        hcddaimhww(130);
        return false;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f8519jyumaefscl = new Rect();
        this.f8526pmvmpeiblj = true;
        this.f8536zynmafqrjb = false;
        this.f8516istkbnxepw = null;
        this.f8508cdpycssgdh = false;
        this.f8522lmojexxdyd = true;
        this.f8513hcddaimhww = -1;
        this.f8518jpowsppfya = new int[2];
        this.f8514hkdspvbjdz = new int[2];
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        this.f8524ntlheqmsrt = wkgbmnqykcVar;
        this.f8529ulzqkzuiru = new ojitshcjhn(getContext(), wkgbmnqykcVar);
        this.f8510cqumvgiudr = androidx.core.widget.wkgbmnqykc.iobyxmoadg(context, attributeSet);
        this.f8512esjtqupxsv = androidx.core.widget.wkgbmnqykc.iobyxmoadg(context, attributeSet);
        this.f8535zdlpuopuiu = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        zynmafqrjb();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8506jlmebxxoox, i13, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f8527stevsuqkhv = new ylkuphrtab(this);
        this.f8520kegysxyocb = new iozdgvuglv(this);
        setNestedScrollingEnabled(true);
        jhduphickx.oipsdeybqn(this, f8505crxdokpmqz);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13) {
        if (getChildCount() <= 0) {
            super.addView(view, i13);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i13, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
