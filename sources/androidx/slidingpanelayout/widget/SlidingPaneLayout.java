package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.appcompat.app.yggfygwlhe;
import androidx.customview.view.AbsSavedState;
import androidx.transition.kcexrzcfyt;
import androidx.window.layout.FoldingFeature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import v1.jhduphickx;
import v1.skhdrjzrfn;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static boolean f13274kegysxyocb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f13275cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f13276cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f13277cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    FoldingFeature f13278dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    View f13279esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f13280hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    final ArrayList f13281hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private float f13282iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    boolean f13283istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Drawable f13284iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final Rect f13285jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Drawable f13286jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    float f13287lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final List f13288lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    boolean f13289pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private float f13290pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private androidx.slidingpanelayout.widget.iobyxmoadg f13291stevsuqkhv;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private eablkybsjg f13292wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private androidx.slidingpanelayout.widget.iobyxmoadg.InterfaceC0193iobyxmoadg f13293wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private float f13294yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f13295yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    final b2.ppxfxbqfkf f13296ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f13297zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    int f13298zynmafqrjb;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f13299iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f13300jyumaefscl;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f13300jyumaefscl ? 1 : 0);
            parcel.writeInt(this.f13299iwizpuwonk);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13300jyumaefscl = parcel.readInt() != 0;
            this.f13299iwizpuwonk = parcel.readInt();
        }
    }

    public interface eablkybsjg {
        void iobyxmoadg(View view);

        void ppxfxbqfkf(View view, float f13);

        void zoijcleaow(View view);
    }

    private static class gxszxtbevo extends FrameLayout {
        gxszxtbevo(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    class iobyxmoadg implements androidx.slidingpanelayout.widget.iobyxmoadg.InterfaceC0193iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // androidx.slidingpanelayout.widget.iobyxmoadg.InterfaceC0193iobyxmoadg
        public void iobyxmoadg(FoldingFeature foldingFeature) {
            SlidingPaneLayout.this.f13278dsvhmnatus = foldingFeature;
            androidx.transition.zoijcleaow zoijcleaowVar = new androidx.transition.zoijcleaow();
            zoijcleaowVar.czzsidtyhn(300L);
            zoijcleaowVar.yfnezrywwk(x1.iobyxmoadg.iobyxmoadg(0.2f, 0.0f, 0.0f, 1.0f));
            kcexrzcfyt.iobyxmoadg(SlidingPaneLayout.this, zoijcleaowVar);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    private class ppxfxbqfkf extends b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf {
        ppxfxbqfkf() {
        }

        private boolean agtfadlqog() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f13283istkbnxepw || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.draadjrbmk() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.draadjrbmk() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void btonecajqb(int i13) {
            if (SlidingPaneLayout.this.f13296ylkuphrtab.cqumvgiudr() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f13287lereixgezr != 1.0f) {
                    slidingPaneLayout.eablkybsjg(slidingPaneLayout.f13279esjtqupxsv);
                    SlidingPaneLayout.this.f13289pkzmftpjix = true;
                } else {
                    slidingPaneLayout.iwizpuwonk(slidingPaneLayout.f13279esjtqupxsv);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.wkgbmnqykc(slidingPaneLayout2.f13279esjtqupxsv);
                    SlidingPaneLayout.this.f13289pkzmftpjix = false;
                }
            }
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void draadjrbmk(View view, float f13, float f14) {
            int paddingLeft;
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) view.getLayoutParams();
            if (SlidingPaneLayout.this.gtknphoqwx()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).rightMargin;
                if (f13 < 0.0f || (f13 == 0.0f && SlidingPaneLayout.this.f13287lereixgezr > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f13298zynmafqrjb;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f13279esjtqupxsv.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f13 > 0.0f || (f13 == 0.0f && SlidingPaneLayout.this.f13287lereixgezr > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f13298zynmafqrjb;
                }
            }
            SlidingPaneLayout.this.f13296ylkuphrtab.jpowsppfya(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void dxjokdxxww(View view, int i13) {
            SlidingPaneLayout.this.zdlpuopuiu();
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void gtknphoqwx(View view, int i13, int i14, int i15, int i16) {
            SlidingPaneLayout.this.ojitshcjhn(i13);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void gxszxtbevo(int i13, int i14) {
            if (agtfadlqog()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f13296ylkuphrtab.ppxfxbqfkf(slidingPaneLayout.f13279esjtqupxsv, i14);
            }
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int iobyxmoadg(View view, int i13, int i14) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) SlidingPaneLayout.this.f13279esjtqupxsv.getLayoutParams();
            if (SlidingPaneLayout.this.gtknphoqwx()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).rightMargin) + SlidingPaneLayout.this.f13279esjtqupxsv.getWidth());
                return Math.max(Math.min(i13, width), width - SlidingPaneLayout.this.f13298zynmafqrjb);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).leftMargin;
            return Math.min(Math.max(i13, paddingLeft), SlidingPaneLayout.this.f13298zynmafqrjb + paddingLeft);
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void nufgyqmvbu(int i13, int i14) {
            if (agtfadlqog()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f13296ylkuphrtab.ppxfxbqfkf(slidingPaneLayout.f13279esjtqupxsv, i14);
            }
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public boolean wflxmlrfwp(View view, int i13) {
            if (agtfadlqog()) {
                return ((wkgbmnqykc) view.getLayoutParams()).f13306zoijcleaow;
            }
            return false;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int wkgbmnqykc(View view) {
            return SlidingPaneLayout.this.f13298zynmafqrjb;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int zoijcleaow(View view, int i13, int i14) {
            return view.getTop();
        }
    }

    class zoijcleaow extends v1.iobyxmoadg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Rect f13308wkgbmnqykc = new Rect();

        zoijcleaow() {
        }

        private void agtfadlqog(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu zdlpuopuiuVar2) {
            Rect rect = this.f13308wkgbmnqykc;
            zdlpuopuiuVar2.draadjrbmk(rect);
            zdlpuopuiuVar.metgxyhuhe(rect);
            zdlpuopuiuVar.e(zdlpuopuiuVar2.ntlheqmsrt());
            zdlpuopuiuVar.lxfrhoxuzk(zdlpuopuiuVar2.iwizpuwonk());
            zdlpuopuiuVar.uwvvkdfqfp(zdlpuopuiuVar2.ojitshcjhn());
            zdlpuopuiuVar.zfvoamnweg(zdlpuopuiuVar2.oxmwwwfdhm());
            zdlpuopuiuVar.weqkydbzbr(zdlpuopuiuVar2.pkzmftpjix());
            zdlpuopuiuVar.yfnezrywwk(zdlpuopuiuVar2.wwaezpbzkn());
            zdlpuopuiuVar.zeieaojujs(zdlpuopuiuVar2.hcddaimhww());
            zdlpuopuiuVar.nuxfzjnpeb(zdlpuopuiuVar2.jpowsppfya());
            zdlpuopuiuVar.ikoacuggdj(zdlpuopuiuVar2.yadqdtsiqt());
            zdlpuopuiuVar.ixidwrxhsl(zdlpuopuiuVar2.kegysxyocb());
            zdlpuopuiuVar.dvvnrvtcbc(zdlpuopuiuVar2.dsvhmnatus());
            zdlpuopuiuVar.iobyxmoadg(zdlpuopuiuVar2.dxjokdxxww());
            zdlpuopuiuVar.igdgnonuha(zdlpuopuiuVar2.jyumaefscl());
        }

        @Override // v1.iobyxmoadg
        public boolean dxjokdxxww(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (ojitshcjhn(view)) {
                return false;
            }
            return super.dxjokdxxww(viewGroup, view, accessibilityEvent);
        }

        @Override // v1.iobyxmoadg
        public void gxszxtbevo(View view, AccessibilityEvent accessibilityEvent) {
            super.gxszxtbevo(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            zdlpuopuiu zdlpuopuiuVarCrxdokpmqz = zdlpuopuiu.crxdokpmqz(zdlpuopuiuVar);
            super.lqeggnwhkg(view, zdlpuopuiuVarCrxdokpmqz);
            agtfadlqog(zdlpuopuiuVar, zdlpuopuiuVarCrxdokpmqz);
            zdlpuopuiuVarCrxdokpmqz.ribwqtqdhb();
            zdlpuopuiuVar.uwvvkdfqfp("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            zdlpuopuiuVar.fmlbqenlif(view);
            Object objIozdgvuglv = jhduphickx.iozdgvuglv(view);
            if (objIozdgvuglv instanceof View) {
                zdlpuopuiuVar.hszhottldk((View) objIozdgvuglv);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i13);
                if (!ojitshcjhn(childAt) && childAt.getVisibility() == 0) {
                    jhduphickx.uawqvzlxes(childAt, 1);
                    zdlpuopuiuVar.ppxfxbqfkf(childAt);
                }
            }
        }

        public boolean ojitshcjhn(View view) {
            return SlidingPaneLayout.this.btonecajqb(view);
        }
    }

    static {
        f13274kegysxyocb = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    private static int agtfadlqog(View view, int i13, int i14) {
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) view.getLayoutParams();
        return (((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).width != 0 || wkgbmnqykcVar.f13304iobyxmoadg <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i13, i14, ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).height);
    }

    private static boolean cqumvgiudr(View view) {
        return view.isOpaque();
    }

    private static int dxjokdxxww(View view) {
        return view instanceof gxszxtbevo ? jhduphickx.zynmafqrjb(((gxszxtbevo) view).getChildAt(0)) : jhduphickx.zynmafqrjb(view);
    }

    private j1.wkgbmnqykc getSystemGestureInsets() {
        skhdrjzrfn skhdrjzrfnVarLmojexxdyd;
        if (!f13274kegysxyocb || (skhdrjzrfnVarLmojexxdyd = jhduphickx.lmojexxdyd(this)) == null) {
            return null;
        }
        return skhdrjzrfnVarLmojexxdyd.dxjokdxxww();
    }

    private ArrayList jyumaefscl() {
        Rect rectNufgyqmvbu;
        FoldingFeature foldingFeature = this.f13278dsvhmnatus;
        if (foldingFeature == null || !foldingFeature.isSeparating() || this.f13278dsvhmnatus.getBounds().left == 0 || this.f13278dsvhmnatus.getBounds().top != 0 || (rectNufgyqmvbu = nufgyqmvbu(this.f13278dsvhmnatus, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rectNufgyqmvbu.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList(Arrays.asList(rect, new Rect(Math.min(width, rectNufgyqmvbu.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    private static Activity lqeggnwhkg(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static Rect nufgyqmvbu(FoldingFeature foldingFeature, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i13 = iArr[0];
        Rect rect = new Rect(i13, iArr[1], view.getWidth() + i13, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(foldingFeature.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private void oxmwwwfdhm(float f13) {
        boolean zGtknphoqwx = gtknphoqwx();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != this.f13279esjtqupxsv) {
                float f14 = 1.0f - this.f13290pmvmpeiblj;
                int i14 = this.f13275cdpycssgdh;
                this.f13290pmvmpeiblj = f13;
                int i15 = ((int) (f14 * i14)) - ((int) ((1.0f - f13) * i14));
                if (zGtknphoqwx) {
                    i15 = -i15;
                }
                childAt.offsetLeftAndRight(i15);
            }
        }
    }

    private boolean ppxfxbqfkf(int i13) {
        if (!this.f13277cqumvgiudr) {
            this.f13289pkzmftpjix = false;
        }
        if (!this.f13280hcddaimhww && !yggfygwlhe(1.0f, i13)) {
            return false;
        }
        this.f13289pkzmftpjix = false;
        return true;
    }

    private void setFoldingFeatureObserver(androidx.slidingpanelayout.widget.iobyxmoadg iobyxmoadgVar) {
        this.f13291stevsuqkhv = iobyxmoadgVar;
        iobyxmoadgVar.gxszxtbevo(this.f13293wypolnanlu);
    }

    private boolean vdvldrhtss(int i13) {
        if (!this.f13277cqumvgiudr) {
            this.f13289pkzmftpjix = true;
        }
        if (!this.f13280hcddaimhww && !yggfygwlhe(0.0f, i13)) {
            return false;
        }
        this.f13289pkzmftpjix = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new gxszxtbevo(view), i13, layoutParams);
        } else {
            super.addView(view, i13, layoutParams);
        }
    }

    boolean btonecajqb(View view) {
        if (view == null) {
            return false;
        }
        return this.f13277cqumvgiudr && ((wkgbmnqykc) view.getLayoutParams()).f13305ppxfxbqfkf && this.f13287lereixgezr > 0.0f;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof wkgbmnqykc) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f13296ylkuphrtab.draadjrbmk(true)) {
            if (this.f13277cqumvgiudr) {
                jhduphickx.xrmfcynszj(this);
            } else {
                this.f13296ylkuphrtab.iobyxmoadg();
            }
        }
    }

    public boolean draadjrbmk() {
        return !this.f13277cqumvgiudr || this.f13287lereixgezr == 0.0f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i13;
        int right;
        super.draw(canvas);
        Drawable drawable = gtknphoqwx() ? this.f13284iwizpuwonk : this.f13286jyumaefscl;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (gtknphoqwx()) {
            right = childAt.getRight();
            i13 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i14 = left - intrinsicWidth;
            i13 = left;
            right = i14;
        }
        drawable.setBounds(right, top, i13, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j13) {
        if (gtknphoqwx() ^ draadjrbmk()) {
            this.f13296ylkuphrtab.pkzmftpjix(1);
            j1.wkgbmnqykc systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                b2.ppxfxbqfkf ppxfxbqfkfVar = this.f13296ylkuphrtab;
                ppxfxbqfkfVar.ylkuphrtab(Math.max(ppxfxbqfkfVar.yggfygwlhe(), systemGestureInsets.f50505iobyxmoadg));
            }
        } else {
            this.f13296ylkuphrtab.pkzmftpjix(2);
            j1.wkgbmnqykc systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                b2.ppxfxbqfkf ppxfxbqfkfVar2 = this.f13296ylkuphrtab;
                ppxfxbqfkfVar2.ylkuphrtab(Math.max(ppxfxbqfkfVar2.yggfygwlhe(), systemGestureInsets2.f50506ppxfxbqfkf));
            }
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f13277cqumvgiudr && !wkgbmnqykcVar.f13306zoijcleaow && this.f13279esjtqupxsv != null) {
            canvas.getClipBounds(this.f13285jpowsppfya);
            if (gtknphoqwx()) {
                Rect rect = this.f13285jpowsppfya;
                rect.left = Math.max(rect.left, this.f13279esjtqupxsv.getRight());
            } else {
                Rect rect2 = this.f13285jpowsppfya;
                rect2.right = Math.min(rect2.right, this.f13279esjtqupxsv.getLeft());
            }
            canvas.clipRect(this.f13285jpowsppfya);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j13);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    void eablkybsjg(View view) {
        Iterator it = this.f13288lmojexxdyd.iterator();
        while (it.hasNext()) {
            ((eablkybsjg) it.next()).iobyxmoadg(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new wkgbmnqykc();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new wkgbmnqykc((ViewGroup.MarginLayoutParams) layoutParams) : new wkgbmnqykc(layoutParams);
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f13295yggfygwlhe;
    }

    public final int getLockMode() {
        return this.f13276cllcsxoeiz;
    }

    public int getParallaxDistance() {
        return this.f13275cdpycssgdh;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f13297zdlpuopuiu;
    }

    boolean gtknphoqwx() {
        return jhduphickx.lereixgezr(this) == 1;
    }

    void gxszxtbevo(View view) {
        Iterator it = this.f13288lmojexxdyd.iterator();
        while (it.hasNext()) {
            ((eablkybsjg) it.next()).ppxfxbqfkf(view, this.f13287lereixgezr);
        }
    }

    public void iobyxmoadg(eablkybsjg eablkybsjgVar) {
        this.f13288lmojexxdyd.add(eablkybsjgVar);
    }

    void iwizpuwonk(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zGtknphoqwx = gtknphoqwx();
        int width = zGtknphoqwx ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zGtknphoqwx ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !cqumvgiudr(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount && (childAt = getChildAt(i13)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zGtknphoqwx ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zGtknphoqwx ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i13++;
            view2 = view;
            zGtknphoqwx = zGtknphoqwx;
        }
    }

    public void kcexrzcfyt(eablkybsjg eablkybsjgVar) {
        this.f13288lmojexxdyd.remove(eablkybsjgVar);
    }

    void ojitshcjhn(int i13) {
        if (this.f13279esjtqupxsv == null) {
            this.f13287lereixgezr = 0.0f;
            return;
        }
        boolean zGtknphoqwx = gtknphoqwx();
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f13279esjtqupxsv.getLayoutParams();
        int width = this.f13279esjtqupxsv.getWidth();
        if (zGtknphoqwx) {
            i13 = (getWidth() - i13) - width;
        }
        float paddingRight = (i13 - ((zGtknphoqwx ? getPaddingRight() : getPaddingLeft()) + (zGtknphoqwx ? ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).rightMargin : ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).leftMargin))) / this.f13298zynmafqrjb;
        this.f13287lereixgezr = paddingRight;
        if (this.f13275cdpycssgdh != 0) {
            oxmwwwfdhm(paddingRight);
        }
        gxszxtbevo(this.f13279esjtqupxsv);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity activityLqeggnwhkg;
        super.onAttachedToWindow();
        this.f13280hcddaimhww = true;
        if (this.f13291stevsuqkhv == null || (activityLqeggnwhkg = lqeggnwhkg(getContext())) == null) {
            return;
        }
        this.f13291stevsuqkhv.eablkybsjg(activityLqeggnwhkg);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13280hcddaimhww = true;
        androidx.slidingpanelayout.widget.iobyxmoadg iobyxmoadgVar = this.f13291stevsuqkhv;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.lqeggnwhkg();
        }
        if (this.f13281hkdspvbjdz.size() <= 0) {
            this.f13281hkdspvbjdz.clear();
        } else {
            yggfygwlhe.iobyxmoadg(this.f13281hkdspvbjdz.get(0));
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z13;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f13277cqumvgiudr && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f13289pkzmftpjix = this.f13296ylkuphrtab.zynmafqrjb(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f13277cqumvgiudr || (this.f13283istkbnxepw && actionMasked != 0)) {
            this.f13296ylkuphrtab.zoijcleaow();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f13296ylkuphrtab.zoijcleaow();
            return false;
        }
        if (actionMasked == 0) {
            this.f13283istkbnxepw = false;
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            this.f13294yadqdtsiqt = x13;
            this.f13282iozdgvuglv = y13;
            if (this.f13296ylkuphrtab.zynmafqrjb(this.f13279esjtqupxsv, (int) x13, (int) y13) && btonecajqb(this.f13279esjtqupxsv)) {
                z13 = true;
            }
            return this.f13296ylkuphrtab.hkdspvbjdz(motionEvent) || z13;
        }
        if (actionMasked == 2) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            float fAbs = Math.abs(x14 - this.f13294yadqdtsiqt);
            float fAbs2 = Math.abs(y14 - this.f13282iozdgvuglv);
            if (fAbs > this.f13296ylkuphrtab.iwizpuwonk() && fAbs2 > fAbs) {
                this.f13296ylkuphrtab.zoijcleaow();
                this.f13283istkbnxepw = true;
                return false;
            }
        }
        z13 = false;
        if (this.f13296ylkuphrtab.hkdspvbjdz(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        boolean zGtknphoqwx = gtknphoqwx();
        int i25 = i15 - i13;
        int paddingRight = zGtknphoqwx ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zGtknphoqwx ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f13280hcddaimhww) {
            this.f13287lereixgezr = (this.f13277cqumvgiudr && this.f13289pkzmftpjix) ? 0.0f : 1.0f;
        }
        int i26 = paddingRight;
        int i27 = 0;
        while (i27 < childCount) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() == 8) {
                i17 = i26;
            } else {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (wkgbmnqykcVar.f13306zoijcleaow) {
                    int i28 = i25 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i28) - i26) - (((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).leftMargin + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).rightMargin);
                    this.f13298zynmafqrjb = iMin;
                    int i29 = zGtknphoqwx ? ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).rightMargin : ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).leftMargin;
                    wkgbmnqykcVar.f13305ppxfxbqfkf = ((i26 + i29) + iMin) + (measuredWidth / 2) > i28;
                    int i33 = (int) (iMin * this.f13287lereixgezr);
                    this.f13287lereixgezr = i33 / iMin;
                    i17 = i26 + i29 + i33;
                    i18 = 0;
                } else if (!this.f13277cqumvgiudr || (i19 = this.f13275cdpycssgdh) == 0) {
                    i17 = paddingRight;
                    i18 = 0;
                } else {
                    i18 = (int) ((1.0f - this.f13287lereixgezr) * i19);
                    i17 = paddingRight;
                }
                if (zGtknphoqwx) {
                    i24 = (i25 - i17) + i18;
                    i23 = i24 - measuredWidth;
                } else {
                    i23 = i17 - i18;
                    i24 = i23 + measuredWidth;
                }
                childAt.layout(i23, paddingTop, i24, childAt.getMeasuredHeight() + paddingTop);
                FoldingFeature foldingFeature = this.f13278dsvhmnatus;
                paddingRight += childAt.getWidth() + Math.abs((foldingFeature != null && foldingFeature.getOrientation() == FoldingFeature.zoijcleaow.f13788ppxfxbqfkf && this.f13278dsvhmnatus.isSeparating()) ? this.f13278dsvhmnatus.getBounds().width() : 0);
            }
            i27++;
            i26 = i17;
        }
        if (this.f13280hcddaimhww) {
            if (this.f13277cqumvgiudr && this.f13275cdpycssgdh != 0) {
                oxmwwwfdhm(this.f13287lereixgezr);
            }
            iwizpuwonk(this.f13279esjtqupxsv);
        }
        this.f13280hcddaimhww = false;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0086 A[PHI: r15
      0x0086: PHI (r15v5 float) = (r15v1 float), (r15v6 float) binds: [B:19:0x007d, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        int paddingTop;
        int iMin;
        int i15;
        int iMax;
        int iMakeMeasureSpec;
        int iMax2;
        int i16;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z13;
        int i17;
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        ?? r13 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f13279esjtqupxsv = null;
        int i18 = 0;
        boolean z14 = false;
        int i19 = iMax3;
        float f13 = 0.0f;
        while (true) {
            i15 = 8;
            if (i18 >= childCount) {
                break;
            }
            View childAt = getChildAt(i18);
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) childAt.getLayoutParams();
            int i23 = size;
            if (childAt.getVisibility() == 8) {
                wkgbmnqykcVar.f13305ppxfxbqfkf = r13;
            } else {
                float f14 = wkgbmnqykcVar.f13304iobyxmoadg;
                if (f14 > 0.0f) {
                    f13 += f14;
                    if (((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).leftMargin + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).rightMargin), (int) r13);
                        i16 = ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).width;
                        if (i16 == -2) {
                            if (mode == 0) {
                                i17 = mode;
                            } else {
                                i17 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i17);
                        } else if (i16 == -1) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i14, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i19 -= measuredWidth;
                        if (i18 != 0) {
                            if (i19 < 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            wkgbmnqykcVar.f13306zoijcleaow = z13;
                            z14 |= z13;
                            if (z13) {
                                this.f13279esjtqupxsv = childAt;
                            }
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).leftMargin + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).rightMargin), (int) r13);
                    i16 = ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).width;
                    if (i16 == -2) {
                        if (mode == 0) {
                            i17 = mode;
                        } else {
                            i17 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i17);
                    } else if (i16 == -1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i14, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i19 -= measuredWidth2;
                    if (i18 != 0) {
                        if (i19 < 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wkgbmnqykcVar.f13306zoijcleaow = z13;
                        z14 |= z13;
                        if (z13) {
                            this.f13279esjtqupxsv = childAt;
                        }
                    }
                }
            }
            i18++;
            size = i23;
            r13 = 0;
        }
        int i24 = size;
        int i25 = i19;
        if (z14 || f13 > 0.0f) {
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                if (childAt2.getVisibility() != i15) {
                    wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) childAt2.getLayoutParams();
                    int measuredWidth3 = (((ViewGroup.MarginLayoutParams) wkgbmnqykcVar2).width != 0 || wkgbmnqykcVar2.f13304iobyxmoadg <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z14) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) wkgbmnqykcVar2).leftMargin + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (wkgbmnqykcVar2.f13304iobyxmoadg > 0.0f) {
                        iMax = measuredWidth3 + ((int) ((wkgbmnqykcVar2.f13304iobyxmoadg * Math.max(0, i25)) / f13));
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int iAgtfadlqog = agtfadlqog(childAt2, i14, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iAgtfadlqog);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i26++;
                i15 = 8;
            }
        }
        ArrayList arrayListJyumaefscl = jyumaefscl();
        if (arrayListJyumaefscl != null && !z14) {
            for (int i27 = 0; i27 < childCount; i27++) {
                View childAt3 = getChildAt(i27);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = (Rect) arrayListJyumaefscl.get(i27);
                    wkgbmnqykc wkgbmnqykcVar3 = (wkgbmnqykc) childAt3.getLayoutParams();
                    int i28 = ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar3).leftMargin + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar3).rightMargin;
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec3);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (dxjokdxxww(childAt3) != 0 && rect.width() < dxjokdxxww(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i28, 1073741824), iMakeMeasureSpec3);
                        if (i27 != 0) {
                            wkgbmnqykcVar3.f13306zoijcleaow = true;
                            this.f13279esjtqupxsv = childAt3;
                            z14 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec3);
                    }
                }
            }
        }
        setMeasuredDimension(i24, iMin + getPaddingTop() + getPaddingBottom());
        this.f13277cqumvgiudr = z14;
        if (this.f13296ylkuphrtab.cqumvgiudr() == 0 || z14) {
            return;
        }
        this.f13296ylkuphrtab.iobyxmoadg();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.zoijcleaow());
        if (savedState.f13300jyumaefscl) {
            rgvfuqvkyq();
        } else {
            zoijcleaow();
        }
        this.f13289pkzmftpjix = savedState.f13300jyumaefscl;
        setLockMode(savedState.f13299iwizpuwonk);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13300jyumaefscl = wflxmlrfwp() ? draadjrbmk() : this.f13289pkzmftpjix;
        savedState.f13299iwizpuwonk = this.f13276cllcsxoeiz;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (i13 != i15) {
            this.f13280hcddaimhww = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f13277cqumvgiudr) {
            return super.onTouchEvent(motionEvent);
        }
        this.f13296ylkuphrtab.istkbnxepw(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            this.f13294yadqdtsiqt = x13;
            this.f13282iozdgvuglv = y13;
        } else if (actionMasked == 1 && btonecajqb(this.f13279esjtqupxsv)) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            float f13 = x14 - this.f13294yadqdtsiqt;
            float f14 = y14 - this.f13282iozdgvuglv;
            int iIwizpuwonk = this.f13296ylkuphrtab.iwizpuwonk();
            if ((f13 * f13) + (f14 * f14) < iIwizpuwonk * iIwizpuwonk && this.f13296ylkuphrtab.zynmafqrjb(this.f13279esjtqupxsv, (int) x14, (int) y14)) {
                ppxfxbqfkf(0);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view.getParent() instanceof gxszxtbevo) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f13277cqumvgiudr) {
            return;
        }
        this.f13289pkzmftpjix = view == this.f13279esjtqupxsv;
    }

    public boolean rgvfuqvkyq() {
        return vdvldrhtss(0);
    }

    @Deprecated
    public void setCoveredFadeColor(int i13) {
        this.f13295yggfygwlhe = i13;
    }

    public final void setLockMode(int i13) {
        this.f13276cllcsxoeiz = i13;
    }

    @Deprecated
    public void setPanelSlideListener(eablkybsjg eablkybsjgVar) {
        eablkybsjg eablkybsjgVar2 = this.f13292wwaezpbzkn;
        if (eablkybsjgVar2 != null) {
            kcexrzcfyt(eablkybsjgVar2);
        }
        if (eablkybsjgVar != null) {
            iobyxmoadg(eablkybsjgVar);
        }
        this.f13292wwaezpbzkn = eablkybsjgVar;
    }

    public void setParallaxDistance(int i13) {
        this.f13275cdpycssgdh = i13;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f13286jyumaefscl = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f13284iwizpuwonk = drawable;
    }

    @Deprecated
    public void setShadowResource(int i13) {
        setShadowDrawableLeft(getResources().getDrawable(i13));
    }

    public void setShadowResourceLeft(int i13) {
        setShadowDrawableLeft(androidx.core.content.iobyxmoadg.getDrawable(getContext(), i13));
    }

    public void setShadowResourceRight(int i13) {
        setShadowDrawableRight(androidx.core.content.iobyxmoadg.getDrawable(getContext(), i13));
    }

    @Deprecated
    public void setSliderFadeColor(int i13) {
        this.f13297zdlpuopuiu = i13;
    }

    public boolean wflxmlrfwp() {
        return this.f13277cqumvgiudr;
    }

    void wkgbmnqykc(View view) {
        Iterator it = this.f13288lmojexxdyd.iterator();
        while (it.hasNext()) {
            ((eablkybsjg) it.next()).zoijcleaow(view);
        }
        sendAccessibilityEvent(32);
    }

    boolean yggfygwlhe(float f13, int i13) {
        int paddingLeft;
        if (!this.f13277cqumvgiudr) {
            return false;
        }
        boolean zGtknphoqwx = gtknphoqwx();
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f13279esjtqupxsv.getLayoutParams();
        if (zGtknphoqwx) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).rightMargin) + (f13 * this.f13298zynmafqrjb)) + this.f13279esjtqupxsv.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) wkgbmnqykcVar).leftMargin + (f13 * this.f13298zynmafqrjb));
        }
        b2.ppxfxbqfkf ppxfxbqfkfVar = this.f13296ylkuphrtab;
        View view = this.f13279esjtqupxsv;
        if (!ppxfxbqfkfVar.cllcsxoeiz(view, paddingLeft, view.getTop())) {
            return false;
        }
        zdlpuopuiu();
        jhduphickx.xrmfcynszj(this);
        return true;
    }

    void zdlpuopuiu() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public boolean zoijcleaow() {
        return ppxfxbqfkf(0);
    }

    public static class wkgbmnqykc extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final int[] f13303wkgbmnqykc = {R.attr.layout_weight};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public float f13304iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        boolean f13305ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f13306zoijcleaow;

        public wkgbmnqykc() {
            super(-1, -1);
            this.f13304iobyxmoadg = 0.0f;
        }

        public wkgbmnqykc(int i13, int i14) {
            super(i13, i14);
            this.f13304iobyxmoadg = 0.0f;
        }

        public wkgbmnqykc(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13304iobyxmoadg = 0.0f;
        }

        public wkgbmnqykc(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13304iobyxmoadg = 0.0f;
        }

        public wkgbmnqykc(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13304iobyxmoadg = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13303wkgbmnqykc);
            this.f13304iobyxmoadg = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f13297zdlpuopuiu = 0;
        this.f13287lereixgezr = 1.0f;
        this.f13288lmojexxdyd = new CopyOnWriteArrayList();
        this.f13280hcddaimhww = true;
        this.f13285jpowsppfya = new Rect();
        this.f13281hkdspvbjdz = new ArrayList();
        this.f13293wypolnanlu = new iobyxmoadg();
        float f13 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        jhduphickx.oipsdeybqn(this, new zoijcleaow());
        jhduphickx.uawqvzlxes(this, 1);
        b2.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = b2.ppxfxbqfkf.wflxmlrfwp(this, 0.5f, new ppxfxbqfkf());
        this.f13296ylkuphrtab = ppxfxbqfkfVarWflxmlrfwp;
        ppxfxbqfkfVarWflxmlrfwp.hcddaimhww(f13 * 400.0f);
        setFoldingFeatureObserver(new androidx.slidingpanelayout.widget.iobyxmoadg(androidx.window.layout.zdlpuopuiu.iobyxmoadg(context), androidx.core.content.iobyxmoadg.getMainExecutor(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new wkgbmnqykc(getContext(), attributeSet);
    }
}
