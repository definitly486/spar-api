package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.rgvfuqvkyq;
import da.draadjrbmk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.rgvfuqvkyq implements com.google.android.material.carousel.zoijcleaow, RecyclerView.pmvmpeiblj.zoijcleaow {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    int f22344cllcsxoeiz;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private int f22345crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private boolean f22346dsvhmnatus;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    int f22347hkdspvbjdz;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private int f22348jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    int f22349jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private lqeggnwhkg f22350kegysxyocb;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private int f22351mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private Map f22352ntlheqmsrt;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private int f22353ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private final View.OnLayoutChangeListener f22354sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private com.google.android.material.carousel.wkgbmnqykc f22355stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private gxszxtbevo f22356tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private com.google.android.material.carousel.ppxfxbqfkf f22357ulzqkzuiru;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final ppxfxbqfkf f22358wypolnanlu;

    class iobyxmoadg extends rgvfuqvkyq {
        iobyxmoadg(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq
        public int calculateDxToMakeVisible(View view, int i13) {
            if (CarouselLayoutManager.this.f22350kegysxyocb == null || !CarouselLayoutManager.this.wkgbmnqykc()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.v0(carouselLayoutManager.lrnfpwlwnk(view));
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq
        public int calculateDyToMakeVisible(View view, int i13) {
            if (CarouselLayoutManager.this.f22350kegysxyocb == null || CarouselLayoutManager.this.wkgbmnqykc()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.v0(carouselLayoutManager.lrnfpwlwnk(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
        public PointF computeScrollVectorForPosition(int i13) {
            return CarouselLayoutManager.this.zoijcleaow(i13);
        }
    }

    private static class ppxfxbqfkf extends RecyclerView.ojitshcjhn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Paint f22360iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private List f22361zoijcleaow;

        ppxfxbqfkf() {
            Paint paint = new Paint();
            this.f22360iobyxmoadg = paint;
            this.f22361zoijcleaow = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void gxszxtbevo(List list) {
            this.f22361zoijcleaow = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ojitshcjhn
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar) {
            super.onDrawOver(canvas, recyclerView, zynmafqrjbVar);
            this.f22360iobyxmoadg.setStrokeWidth(recyclerView.getResources().getDimension(da.wkgbmnqykc.m3_carousel_debug_keyline_width));
            for (gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar : this.f22361zoijcleaow) {
                this.f22360iobyxmoadg.setColor(j1.ppxfxbqfkf.ppxfxbqfkf(-65281, -16776961, ppxfxbqfkfVar.f22377ppxfxbqfkf));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).wkgbmnqykc()) {
                    canvas.drawLine(ppxfxbqfkfVar.f22379zoijcleaow, ((CarouselLayoutManager) recyclerView.getLayoutManager()).P0(), ppxfxbqfkfVar.f22379zoijcleaow, ((CarouselLayoutManager) recyclerView.getLayoutManager()).K0(), this.f22360iobyxmoadg);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).M0(), ppxfxbqfkfVar.f22379zoijcleaow, ((CarouselLayoutManager) recyclerView.getLayoutManager()).N0(), ppxfxbqfkfVar.f22379zoijcleaow, this.f22360iobyxmoadg);
                }
            }
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final gxszxtbevo.ppxfxbqfkf f22362iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final gxszxtbevo.ppxfxbqfkf f22363zoijcleaow;

        wkgbmnqykc(gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar2) {
            u1.nufgyqmvbu.iobyxmoadg(ppxfxbqfkfVar.f22374iobyxmoadg <= ppxfxbqfkfVar2.f22374iobyxmoadg);
            this.f22362iobyxmoadg = ppxfxbqfkfVar;
            this.f22363zoijcleaow = ppxfxbqfkfVar2;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final View f22364iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final float f22365ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final wkgbmnqykc f22366wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final float f22367zoijcleaow;

        zoijcleaow(View view, float f13, float f14, wkgbmnqykc wkgbmnqykcVar) {
            this.f22364iobyxmoadg = view;
            this.f22367zoijcleaow = f13;
            this.f22365ppxfxbqfkf = f14;
            this.f22366wkgbmnqykc = wkgbmnqykcVar;
        }
    }

    public CarouselLayoutManager() {
        this(new nufgyqmvbu());
    }

    private View A0() {
        return ribwqtqdhb(U0() ? 0 : vipkmwdibw() - 1);
    }

    private View B0() {
        return ribwqtqdhb(U0() ? vipkmwdibw() - 1 : 0);
    }

    private int C0() {
        return wkgbmnqykc() ? eablkybsjg() : gxszxtbevo();
    }

    private float D0(View view) {
        Rect rect = new Rect();
        super.metgxyhuhe(view, rect);
        return wkgbmnqykc() ? rect.centerX() : rect.centerY();
    }

    private int E0() {
        int i13;
        int i14;
        if (vipkmwdibw() <= 0) {
            return 0;
        }
        RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) ribwqtqdhb(0).getLayoutParams();
        if (this.f22357ulzqkzuiru.f22407iobyxmoadg == 0) {
            i13 = ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin;
            i14 = ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin;
        } else {
            i13 = ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin;
            i14 = ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin;
        }
        return i13 + i14;
    }

    private gxszxtbevo F0(int i13) {
        gxszxtbevo gxszxtbevoVar;
        Map map = this.f22352ntlheqmsrt;
        return (map == null || (gxszxtbevoVar = (gxszxtbevo) map.get(Integer.valueOf(o1.iobyxmoadg.zoijcleaow(i13, 0, Math.max(0, iobyxmoadg() + (-1)))))) == null) ? this.f22350kegysxyocb.lqeggnwhkg() : gxszxtbevoVar;
    }

    private int G0() {
        if (okpsazkaxt() || !this.f22355stevsuqkhv.gxszxtbevo()) {
            return 0;
        }
        return J0() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    private float H0(float f13, wkgbmnqykc wkgbmnqykcVar) {
        gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = wkgbmnqykcVar.f22362iobyxmoadg;
        float f14 = ppxfxbqfkfVar.f22378wkgbmnqykc;
        gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar2 = wkgbmnqykcVar.f22363zoijcleaow;
        return ea.iobyxmoadg.zoijcleaow(f14, ppxfxbqfkfVar2.f22378wkgbmnqykc, ppxfxbqfkfVar.f22379zoijcleaow, ppxfxbqfkfVar2.f22379zoijcleaow, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K0() {
        return this.f22357ulzqkzuiru.eablkybsjg();
    }

    private int L0() {
        return this.f22357ulzqkzuiru.gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int M0() {
        return this.f22357ulzqkzuiru.lqeggnwhkg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int N0() {
        return this.f22357ulzqkzuiru.nufgyqmvbu();
    }

    private int O0() {
        return this.f22357ulzqkzuiru.dxjokdxxww();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int P0() {
        return this.f22357ulzqkzuiru.btonecajqb();
    }

    private int Q0() {
        if (okpsazkaxt() || !this.f22355stevsuqkhv.gxszxtbevo()) {
            return 0;
        }
        return J0() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int R0(int i13, gxszxtbevo gxszxtbevoVar) {
        return U0() ? (int) (((C0() - gxszxtbevoVar.nufgyqmvbu().f22374iobyxmoadg) - (i13 * gxszxtbevoVar.gxszxtbevo())) - (gxszxtbevoVar.gxszxtbevo() / 2.0f)) : (int) (((i13 * gxszxtbevoVar.gxszxtbevo()) - gxszxtbevoVar.iobyxmoadg().f22374iobyxmoadg) + (gxszxtbevoVar.gxszxtbevo() / 2.0f));
    }

    private int S0(int i13, gxszxtbevo gxszxtbevoVar) {
        int i14 = Integer.MAX_VALUE;
        for (gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar : gxszxtbevoVar.eablkybsjg()) {
            float fGxszxtbevo = (i13 * gxszxtbevoVar.gxszxtbevo()) + (gxszxtbevoVar.gxszxtbevo() / 2.0f);
            int iC0 = (U0() ? (int) ((C0() - ppxfxbqfkfVar.f22374iobyxmoadg) - fGxszxtbevo) : (int) (fGxszxtbevo - ppxfxbqfkfVar.f22374iobyxmoadg)) - this.f22349jpowsppfya;
            if (Math.abs(i14) > Math.abs(iC0)) {
                i14 = iC0;
            }
        }
        return i14;
    }

    private static wkgbmnqykc T0(List list, float f13, boolean z13) {
        float f14 = Float.MAX_VALUE;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        float f15 = -3.4028235E38f;
        float f16 = Float.MAX_VALUE;
        float f17 = Float.MAX_VALUE;
        for (int i17 = 0; i17 < list.size(); i17++) {
            gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = (gxszxtbevo.ppxfxbqfkf) list.get(i17);
            float f18 = z13 ? ppxfxbqfkfVar.f22379zoijcleaow : ppxfxbqfkfVar.f22374iobyxmoadg;
            float fAbs = Math.abs(f18 - f13);
            if (f18 <= f13 && fAbs <= f14) {
                i13 = i17;
                f14 = fAbs;
            }
            if (f18 > f13 && fAbs <= f16) {
                i15 = i17;
                f16 = fAbs;
            }
            if (f18 <= f17) {
                i14 = i17;
                f17 = f18;
            }
            if (f18 > f15) {
                i16 = i17;
                f15 = f18;
            }
        }
        if (i13 == -1) {
            i13 = i14;
        }
        if (i15 == -1) {
            i15 = i16;
        }
        return new wkgbmnqykc((gxszxtbevo.ppxfxbqfkf) list.get(i13), (gxszxtbevo.ppxfxbqfkf) list.get(i15));
    }

    private boolean V0(float f13, wkgbmnqykc wkgbmnqykcVar) {
        float fO0 = o0(f13, H0(f13, wkgbmnqykcVar) / 2.0f);
        if (U0()) {
            if (fO0 >= 0.0f) {
                return false;
            }
        } else if (fO0 <= C0()) {
            return false;
        }
        return true;
    }

    private boolean W0(float f13, wkgbmnqykc wkgbmnqykcVar) {
        float fN0 = n0(f13, H0(f13, wkgbmnqykcVar) / 2.0f);
        if (U0()) {
            if (fN0 <= C0()) {
                return false;
            }
        } else if (fN0 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        if (i13 == i17 && i14 == i18 && i15 == i19 && i16 == i23) {
            return;
        }
        view.post(new Runnable() { // from class: ga.zoijcleaow
            @Override // java.lang.Runnable
            public final void run() {
                this.f36718zdlpuopuiu.c1();
            }
        });
    }

    private void Y0() {
        if (this.f22346dsvhmnatus && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i13 = 0; i13 < vipkmwdibw(); i13++) {
                View viewRibwqtqdhb = ribwqtqdhb(i13);
                Log.d("CarouselLayoutManager", "item position " + lrnfpwlwnk(viewRibwqtqdhb) + ", center:" + D0(viewRibwqtqdhb) + ", child index:" + i13);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private zoijcleaow Z0(RecyclerView.iwizpuwonk iwizpuwonkVar, float f13, int i13) {
        View viewOjitshcjhn = iwizpuwonkVar.ojitshcjhn(i13);
        ixidwrxhsl(viewOjitshcjhn, 0, 0);
        float fN0 = n0(f13, this.f22356tzroggbefp.gxszxtbevo() / 2.0f);
        wkgbmnqykc wkgbmnqykcVarT0 = T0(this.f22356tzroggbefp.lqeggnwhkg(), fN0, false);
        return new zoijcleaow(viewOjitshcjhn, fN0, s0(viewOjitshcjhn, fN0, wkgbmnqykcVarT0), wkgbmnqykcVarT0);
    }

    private float a1(View view, float f13, float f14, Rect rect) {
        float fN0 = n0(f13, f14);
        wkgbmnqykc wkgbmnqykcVarT0 = T0(this.f22356tzroggbefp.lqeggnwhkg(), fN0, false);
        float fS0 = s0(view, fN0, wkgbmnqykcVarT0);
        super.metgxyhuhe(view, rect);
        k1(view, fN0, wkgbmnqykcVarT0);
        this.f22357ulzqkzuiru.draadjrbmk(view, rect, f14, fS0);
        return fS0;
    }

    private void b1(RecyclerView.iwizpuwonk iwizpuwonkVar) {
        View viewOjitshcjhn = iwizpuwonkVar.ojitshcjhn(0);
        ixidwrxhsl(viewOjitshcjhn, 0, 0);
        gxszxtbevo gxszxtbevoVarLqeggnwhkg = this.f22355stevsuqkhv.lqeggnwhkg(this, viewOjitshcjhn);
        if (U0()) {
            gxszxtbevoVarLqeggnwhkg = gxszxtbevo.agtfadlqog(gxszxtbevoVarLqeggnwhkg, C0());
        }
        this.f22350kegysxyocb = lqeggnwhkg.gxszxtbevo(this, gxszxtbevoVarLqeggnwhkg, E0(), G0(), Q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1() {
        this.f22350kegysxyocb = null;
        M();
    }

    private void d1(RecyclerView.iwizpuwonk iwizpuwonkVar) {
        while (vipkmwdibw() > 0) {
            View viewRibwqtqdhb = ribwqtqdhb(0);
            float fD0 = D0(viewRibwqtqdhb);
            if (!W0(fD0, T0(this.f22356tzroggbefp.lqeggnwhkg(), fD0, true))) {
                break;
            } else {
                F(viewRibwqtqdhb, iwizpuwonkVar);
            }
        }
        while (vipkmwdibw() - 1 >= 0) {
            View viewRibwqtqdhb2 = ribwqtqdhb(vipkmwdibw() - 1);
            float fD1 = D0(viewRibwqtqdhb2);
            if (!V0(fD1, T0(this.f22356tzroggbefp.lqeggnwhkg(), fD1, true))) {
                return;
            } else {
                F(viewRibwqtqdhb2, iwizpuwonkVar);
            }
        }
    }

    private int e1(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0 || i13 == 0) {
            return 0;
        }
        if (this.f22350kegysxyocb == null) {
            b1(iwizpuwonkVar);
        }
        int iW0 = w0(i13, this.f22349jpowsppfya, this.f22347hkdspvbjdz, this.f22344cllcsxoeiz);
        this.f22349jpowsppfya += iW0;
        l1(this.f22350kegysxyocb);
        float fGxszxtbevo = this.f22356tzroggbefp.gxszxtbevo() / 2.0f;
        float fT0 = t0(lrnfpwlwnk(ribwqtqdhb(0)));
        Rect rect = new Rect();
        float f13 = U0() ? this.f22356tzroggbefp.nufgyqmvbu().f22379zoijcleaow : this.f22356tzroggbefp.iobyxmoadg().f22379zoijcleaow;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < vipkmwdibw(); i14++) {
            View viewRibwqtqdhb = ribwqtqdhb(i14);
            float fAbs = Math.abs(f13 - a1(viewRibwqtqdhb, fT0, fGxszxtbevo, rect));
            if (viewRibwqtqdhb != null && fAbs < f14) {
                this.f22348jlmebxxoox = lrnfpwlwnk(viewRibwqtqdhb);
                f14 = fAbs;
            }
            fT0 = n0(fT0, this.f22356tzroggbefp.gxszxtbevo());
        }
        z0(iwizpuwonkVar, zynmafqrjbVar);
        return iW0;
    }

    private void f1(RecyclerView recyclerView, int i13) {
        if (wkgbmnqykc()) {
            recyclerView.scrollBy(i13, 0);
        } else {
            recyclerView.scrollBy(0, i13);
        }
    }

    private void h1(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, draadjrbmk.Carousel);
            g1(typedArrayObtainStyledAttributes.getInt(draadjrbmk.Carousel_carousel_alignment, 0));
            j1(typedArrayObtainStyledAttributes.getInt(draadjrbmk.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void k1(View view, float f13, wkgbmnqykc wkgbmnqykcVar) {
    }

    private void l1(lqeggnwhkg lqeggnwhkgVar) {
        int i13 = this.f22344cllcsxoeiz;
        int i14 = this.f22347hkdspvbjdz;
        if (i13 <= i14) {
            this.f22356tzroggbefp = U0() ? lqeggnwhkgVar.nufgyqmvbu() : lqeggnwhkgVar.draadjrbmk();
        } else {
            this.f22356tzroggbefp = lqeggnwhkgVar.btonecajqb(this.f22349jpowsppfya, i14, i13);
        }
        this.f22358wypolnanlu.gxszxtbevo(this.f22356tzroggbefp.lqeggnwhkg());
    }

    private void m0(View view, int i13, zoijcleaow zoijcleaowVar) {
        float fGxszxtbevo = this.f22356tzroggbefp.gxszxtbevo() / 2.0f;
        yggfygwlhe(view, i13);
        float f13 = zoijcleaowVar.f22365ppxfxbqfkf;
        this.f22357ulzqkzuiru.gtknphoqwx(view, (int) (f13 - fGxszxtbevo), (int) (f13 + fGxszxtbevo));
        k1(view, zoijcleaowVar.f22367zoijcleaow, zoijcleaowVar.f22366wkgbmnqykc);
    }

    private void m1() {
        int iIobyxmoadg = iobyxmoadg();
        int i13 = this.f22345crxdokpmqz;
        if (iIobyxmoadg == i13 || this.f22350kegysxyocb == null) {
            return;
        }
        if (this.f22355stevsuqkhv.nufgyqmvbu(this, i13)) {
            c1();
        }
        this.f22345crxdokpmqz = iIobyxmoadg;
    }

    private float n0(float f13, float f14) {
        return U0() ? f13 - f14 : f13 + f14;
    }

    private void n1() {
        if (!this.f22346dsvhmnatus || vipkmwdibw() < 1) {
            return;
        }
        int i13 = 0;
        while (i13 < vipkmwdibw() - 1) {
            int iLrnfpwlwnk = lrnfpwlwnk(ribwqtqdhb(i13));
            int i14 = i13 + 1;
            int iLrnfpwlwnk2 = lrnfpwlwnk(ribwqtqdhb(i14));
            if (iLrnfpwlwnk > iLrnfpwlwnk2) {
                Y0();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i13 + "] had adapter position [" + iLrnfpwlwnk + "] and child at index [" + i14 + "] had adapter position [" + iLrnfpwlwnk2 + "].");
            }
            i13 = i14;
        }
    }

    private float o0(float f13, float f14) {
        return U0() ? f13 + f14 : f13 - f14;
    }

    private void p0(RecyclerView.iwizpuwonk iwizpuwonkVar, int i13, int i14) {
        if (i13 < 0 || i13 >= iobyxmoadg()) {
            return;
        }
        zoijcleaow zoijcleaowVarZ0 = Z0(iwizpuwonkVar, t0(i13), i13);
        m0(zoijcleaowVarZ0.f22364iobyxmoadg, i14, zoijcleaowVarZ0);
    }

    private void q0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        float fT0 = t0(i13);
        while (i13 < zynmafqrjbVar.zoijcleaow()) {
            zoijcleaow zoijcleaowVarZ0 = Z0(iwizpuwonkVar, fT0, i13);
            if (V0(zoijcleaowVarZ0.f22365ppxfxbqfkf, zoijcleaowVarZ0.f22366wkgbmnqykc)) {
                return;
            }
            fT0 = n0(fT0, this.f22356tzroggbefp.gxszxtbevo());
            if (!W0(zoijcleaowVarZ0.f22365ppxfxbqfkf, zoijcleaowVarZ0.f22366wkgbmnqykc)) {
                m0(zoijcleaowVarZ0.f22364iobyxmoadg, -1, zoijcleaowVarZ0);
            }
            i13++;
        }
    }

    private void r0(RecyclerView.iwizpuwonk iwizpuwonkVar, int i13) {
        float fT0 = t0(i13);
        while (i13 >= 0) {
            zoijcleaow zoijcleaowVarZ0 = Z0(iwizpuwonkVar, fT0, i13);
            if (W0(zoijcleaowVarZ0.f22365ppxfxbqfkf, zoijcleaowVarZ0.f22366wkgbmnqykc)) {
                return;
            }
            fT0 = o0(fT0, this.f22356tzroggbefp.gxszxtbevo());
            if (!V0(zoijcleaowVarZ0.f22365ppxfxbqfkf, zoijcleaowVarZ0.f22366wkgbmnqykc)) {
                m0(zoijcleaowVarZ0.f22364iobyxmoadg, 0, zoijcleaowVarZ0);
            }
            i13--;
        }
    }

    private float s0(View view, float f13, wkgbmnqykc wkgbmnqykcVar) {
        gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar = wkgbmnqykcVar.f22362iobyxmoadg;
        float f14 = ppxfxbqfkfVar.f22379zoijcleaow;
        gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar2 = wkgbmnqykcVar.f22363zoijcleaow;
        float fZoijcleaow = ea.iobyxmoadg.zoijcleaow(f14, ppxfxbqfkfVar2.f22379zoijcleaow, ppxfxbqfkfVar.f22374iobyxmoadg, ppxfxbqfkfVar2.f22374iobyxmoadg, f13);
        if (wkgbmnqykcVar.f22363zoijcleaow != this.f22356tzroggbefp.ppxfxbqfkf() && wkgbmnqykcVar.f22362iobyxmoadg != this.f22356tzroggbefp.btonecajqb()) {
            return fZoijcleaow;
        }
        float fWkgbmnqykc = this.f22357ulzqkzuiru.wkgbmnqykc((RecyclerView.vdvldrhtss) view.getLayoutParams()) / this.f22356tzroggbefp.gxszxtbevo();
        gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar3 = wkgbmnqykcVar.f22363zoijcleaow;
        return fZoijcleaow + ((f13 - ppxfxbqfkfVar3.f22374iobyxmoadg) * ((1.0f - ppxfxbqfkfVar3.f22377ppxfxbqfkf) + fWkgbmnqykc));
    }

    private float t0(int i13) {
        return n0(O0() - this.f22349jpowsppfya, this.f22356tzroggbefp.gxszxtbevo() * i13);
    }

    private int u0(RecyclerView.zynmafqrjb zynmafqrjbVar, lqeggnwhkg lqeggnwhkgVar) {
        boolean zU0 = U0();
        gxszxtbevo gxszxtbevoVarDraadjrbmk = zU0 ? lqeggnwhkgVar.draadjrbmk() : lqeggnwhkgVar.nufgyqmvbu();
        gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = zU0 ? gxszxtbevoVarDraadjrbmk.iobyxmoadg() : gxszxtbevoVarDraadjrbmk.nufgyqmvbu();
        int iZoijcleaow = (int) (((((zynmafqrjbVar.zoijcleaow() - 1) * gxszxtbevoVarDraadjrbmk.gxszxtbevo()) * (zU0 ? -1.0f : 1.0f)) - (ppxfxbqfkfVarIobyxmoadg.f22374iobyxmoadg - O0())) + (L0() - ppxfxbqfkfVarIobyxmoadg.f22374iobyxmoadg) + (zU0 ? -ppxfxbqfkfVarIobyxmoadg.f22375lqeggnwhkg : ppxfxbqfkfVarIobyxmoadg.f22376nufgyqmvbu));
        return zU0 ? Math.min(0, iZoijcleaow) : Math.max(0, iZoijcleaow);
    }

    private static int w0(int i13, int i14, int i15, int i16) {
        int i17 = i14 + i13;
        if (i17 < i15) {
            return i15 - i14;
        }
        return i17 > i16 ? i16 - i14 : i13;
    }

    private int x0(lqeggnwhkg lqeggnwhkgVar) {
        boolean zU0 = U0();
        gxszxtbevo gxszxtbevoVarNufgyqmvbu = zU0 ? lqeggnwhkgVar.nufgyqmvbu() : lqeggnwhkgVar.draadjrbmk();
        return (int) (O0() - o0((zU0 ? gxszxtbevoVarNufgyqmvbu.nufgyqmvbu() : gxszxtbevoVarNufgyqmvbu.iobyxmoadg()).f22374iobyxmoadg, gxszxtbevoVarNufgyqmvbu.gxszxtbevo() / 2.0f));
    }

    private int y0(int i13) {
        int iJ0 = J0();
        if (i13 == 1) {
            return -1;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 17) {
            if (iJ0 == 0) {
                return U0() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i13 == 33) {
            return iJ0 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i13 == 66) {
            if (iJ0 == 0) {
                return U0() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i13 == 130) {
            return iJ0 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i13);
        return Integer.MIN_VALUE;
    }

    private void z0(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        d1(iwizpuwonkVar);
        if (vipkmwdibw() == 0) {
            r0(iwizpuwonkVar, this.f22351mbcevpiqjq - 1);
            q0(iwizpuwonkVar, zynmafqrjbVar, this.f22351mbcevpiqjq);
        } else {
            int iLrnfpwlwnk = lrnfpwlwnk(ribwqtqdhb(0));
            int iLrnfpwlwnk2 = lrnfpwlwnk(ribwqtqdhb(vipkmwdibw() - 1));
            r0(iwizpuwonkVar, iLrnfpwlwnk - 1);
            q0(iwizpuwonkVar, zynmafqrjbVar, iLrnfpwlwnk2 + 1);
        }
        n1();
    }

    int I0(int i13, gxszxtbevo gxszxtbevoVar) {
        return R0(i13, gxszxtbevoVar) - this.f22349jpowsppfya;
    }

    public int J0() {
        return this.f22357ulzqkzuiru.f22407iobyxmoadg;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean L(RecyclerView recyclerView, View view, Rect rect, boolean z13, boolean z14) {
        int iS0;
        if (this.f22350kegysxyocb == null || (iS0 = S0(lrnfpwlwnk(view), F0(lrnfpwlwnk(view)))) == 0) {
            return false;
        }
        f1(recyclerView, S0(lrnfpwlwnk(view), this.f22350kegysxyocb.btonecajqb(this.f22349jpowsppfya + w0(iS0, this.f22349jpowsppfya, this.f22347hkdspvbjdz, this.f22344cllcsxoeiz), this.f22347hkdspvbjdz, this.f22344cllcsxoeiz)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int P(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (pmvmpeiblj()) {
            return e1(i13, iwizpuwonkVar, zynmafqrjbVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void Q(int i13) {
        this.f22348jlmebxxoox = i13;
        if (this.f22350kegysxyocb == null) {
            return;
        }
        this.f22349jpowsppfya = R0(i13, F0(i13));
        this.f22351mbcevpiqjq = o1.iobyxmoadg.zoijcleaow(i13, 0, Math.max(0, iobyxmoadg() - 1));
        l1(this.f22350kegysxyocb);
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int R(int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (zynmafqrjb()) {
            return e1(i13, iwizpuwonkVar, zynmafqrjbVar);
        }
        return 0;
    }

    boolean U0() {
        return wkgbmnqykc() && bfopjjpdmp() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void a(RecyclerView recyclerView, RecyclerView.iwizpuwonk iwizpuwonkVar) {
        super.a(recyclerView, iwizpuwonkVar);
        recyclerView.removeOnLayoutChangeListener(this.f22354sopmlzcsov);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public View b(View view, int i13, RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int iY0;
        if (vipkmwdibw() == 0 || (iY0 = y0(i13)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iY0 == -1) {
            if (lrnfpwlwnk(view) == 0) {
                return null;
            }
            p0(iwizpuwonkVar, lrnfpwlwnk(ribwqtqdhb(0)) - 1, 0);
            return B0();
        }
        if (lrnfpwlwnk(view) == iobyxmoadg() - 1) {
            return null;
        }
        p0(iwizpuwonkVar, lrnfpwlwnk(ribwqtqdhb(vipkmwdibw() - 1)) + 1, -1);
        return A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void b0(RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(recyclerView.getContext());
        iobyxmoadgVar.setTargetPosition(i13);
        c0(iobyxmoadgVar);
    }

    @Override // com.google.android.material.carousel.zoijcleaow
    public int btonecajqb() {
        return this.f22353ribwqtqdhb;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void c(AccessibilityEvent accessibilityEvent) {
        super.c(accessibilityEvent);
        if (vipkmwdibw() > 0) {
            accessibilityEvent.setFromIndex(lrnfpwlwnk(ribwqtqdhb(0)));
            accessibilityEvent.setToIndex(lrnfpwlwnk(ribwqtqdhb(vipkmwdibw() - 1)));
        }
    }

    @Override // com.google.android.material.carousel.zoijcleaow
    public int eablkybsjg() {
        return iwxlajgraz();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void eslsurpljm(RecyclerView recyclerView) {
        super.eslsurpljm(recyclerView);
        this.f22355stevsuqkhv.eablkybsjg(recyclerView.getContext());
        c1();
        recyclerView.addOnLayoutChangeListener(this.f22354sopmlzcsov);
    }

    public void g1(int i13) {
        this.f22353ribwqtqdhb = i13;
        c1();
    }

    @Override // com.google.android.material.carousel.zoijcleaow
    public int gxszxtbevo() {
        return zfvoamnweg();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int hcddaimhww(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return this.f22349jpowsppfya;
    }

    public void i1(com.google.android.material.carousel.wkgbmnqykc wkgbmnqykcVar) {
        this.f22355stevsuqkhv = wkgbmnqykcVar;
        c1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void ixidwrxhsl(View view, int i13, int i14) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void j(RecyclerView recyclerView, int i13, int i14) {
        super.j(recyclerView, i13, i14);
        m1();
    }

    public void j1(int i13) {
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i13);
        }
        iwizpuwonk(null);
        com.google.android.material.carousel.ppxfxbqfkf ppxfxbqfkfVar = this.f22357ulzqkzuiru;
        if (ppxfxbqfkfVar == null || i13 != ppxfxbqfkfVar.f22407iobyxmoadg) {
            this.f22357ulzqkzuiru = com.google.android.material.carousel.ppxfxbqfkf.zoijcleaow(this, i13);
            c1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int jpowsppfya(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return this.f22344cllcsxoeiz - this.f22347hkdspvbjdz;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int lmojexxdyd(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0 || this.f22350kegysxyocb == null || iobyxmoadg() <= 1) {
            return 0;
        }
        return (int) (iwxlajgraz() * (this.f22350kegysxyocb.lqeggnwhkg().gxszxtbevo() / ylkuphrtab(zynmafqrjbVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean lxfrhoxuzk() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void m(RecyclerView recyclerView, int i13, int i14) {
        super.m(recyclerView, i13, i14);
        m1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void metgxyhuhe(View view, Rect rect) {
        super.metgxyhuhe(view, rect);
        float fCenterY = rect.centerY();
        if (wkgbmnqykc()) {
            fCenterY = rect.centerX();
        }
        float fH0 = H0(fCenterY, T0(this.f22356tzroggbefp.lqeggnwhkg(), fCenterY, true));
        float fWidth = wkgbmnqykc() ? (rect.width() - fH0) / 2.0f : 0.0f;
        float fHeight = wkgbmnqykc() ? 0.0f : (rect.height() - fH0) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ntlheqmsrt() {
        return new RecyclerView.vdvldrhtss(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void p(RecyclerView.iwizpuwonk iwizpuwonkVar, RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (zynmafqrjbVar.zoijcleaow() <= 0 || C0() <= 0.0f) {
            D(iwizpuwonkVar);
            this.f22351mbcevpiqjq = 0;
            return;
        }
        boolean zU0 = U0();
        boolean z13 = this.f22350kegysxyocb == null;
        if (z13) {
            b1(iwizpuwonkVar);
        }
        int iX0 = x0(this.f22350kegysxyocb);
        int iU0 = u0(zynmafqrjbVar, this.f22350kegysxyocb);
        this.f22347hkdspvbjdz = zU0 ? iU0 : iX0;
        if (zU0) {
            iU0 = iX0;
        }
        this.f22344cllcsxoeiz = iU0;
        if (z13) {
            this.f22349jpowsppfya = iX0;
            this.f22352ntlheqmsrt = this.f22350kegysxyocb.dxjokdxxww(iobyxmoadg(), this.f22347hkdspvbjdz, this.f22344cllcsxoeiz, U0());
            int i13 = this.f22348jlmebxxoox;
            if (i13 != -1) {
                this.f22349jpowsppfya = R0(i13, F0(i13));
            }
        }
        int i14 = this.f22349jpowsppfya;
        this.f22349jpowsppfya = i14 + w0(0, i14, this.f22347hkdspvbjdz, this.f22344cllcsxoeiz);
        this.f22351mbcevpiqjq = o1.iobyxmoadg.zoijcleaow(this.f22351mbcevpiqjq, 0, zynmafqrjbVar.zoijcleaow());
        l1(this.f22350kegysxyocb);
        hkdspvbjdz(iwizpuwonkVar);
        z0(iwizpuwonkVar, zynmafqrjbVar);
        this.f22345crxdokpmqz = iobyxmoadg();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int pkzmftpjix(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        if (vipkmwdibw() == 0 || this.f22350kegysxyocb == null || iobyxmoadg() <= 1) {
            return 0;
        }
        return (int) (zfvoamnweg() * (this.f22350kegysxyocb.lqeggnwhkg().gxszxtbevo() / jpowsppfya(zynmafqrjbVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean pmvmpeiblj() {
        return wkgbmnqykc();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void q(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        super.q(zynmafqrjbVar);
        if (vipkmwdibw() == 0) {
            this.f22351mbcevpiqjq = 0;
        } else {
            this.f22351mbcevpiqjq = lrnfpwlwnk(ribwqtqdhb(0));
        }
        n1();
    }

    int v0(int i13) {
        return (int) (this.f22349jpowsppfya - R0(i13, F0(i13)));
    }

    @Override // com.google.android.material.carousel.zoijcleaow
    public boolean wkgbmnqykc() {
        return this.f22357ulzqkzuiru.f22407iobyxmoadg == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int wwaezpbzkn(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return this.f22349jpowsppfya;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int ylkuphrtab(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        return this.f22344cllcsxoeiz - this.f22347hkdspvbjdz;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj.zoijcleaow
    public PointF zoijcleaow(int i13) {
        if (this.f22350kegysxyocb == null) {
            return null;
        }
        int iI0 = I0(i13, F0(i13));
        return wkgbmnqykc() ? new PointF(iI0, 0.0f) : new PointF(0.0f, iI0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean zynmafqrjb() {
        return !wkgbmnqykc();
    }

    public CarouselLayoutManager(com.google.android.material.carousel.wkgbmnqykc wkgbmnqykcVar) {
        this(wkgbmnqykcVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.wkgbmnqykc wkgbmnqykcVar, int i13) {
        this.f22346dsvhmnatus = false;
        this.f22358wypolnanlu = new ppxfxbqfkf();
        this.f22351mbcevpiqjq = 0;
        this.f22354sopmlzcsov = new View.OnLayoutChangeListener() { // from class: ga.iobyxmoadg
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24) {
                this.f36717iobyxmoadg.X0(view, i14, i15, i16, i17, i18, i19, i23, i24);
            }
        };
        this.f22348jlmebxxoox = -1;
        this.f22353ribwqtqdhb = 0;
        i1(wkgbmnqykcVar);
        j1(i13);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i13, int i14) {
        this.f22346dsvhmnatus = false;
        this.f22358wypolnanlu = new ppxfxbqfkf();
        this.f22351mbcevpiqjq = 0;
        this.f22354sopmlzcsov = new View.OnLayoutChangeListener() { // from class: ga.iobyxmoadg
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i110, int i23, int i24) {
                this.f36717iobyxmoadg.X0(view, i15, i16, i17, i18, i19, i110, i23, i24);
            }
        };
        this.f22348jlmebxxoox = -1;
        this.f22353ribwqtqdhb = 0;
        i1(new nufgyqmvbu());
        h1(context, attributeSet);
    }
}
