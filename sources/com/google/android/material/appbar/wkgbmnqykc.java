package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import v1.jhduphickx;
import v1.skhdrjzrfn;
import v1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
abstract class wkgbmnqykc extends eablkybsjg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final Rect f22051cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f22052esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final Rect f22053iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f22054lereixgezr;

    public wkgbmnqykc() {
        this.f22053iwizpuwonk = new Rect();
        this.f22051cqumvgiudr = new Rect();
        this.f22052esjtqupxsv = 0;
    }

    private static int kegysxyocb(int i13) {
        if (i13 == 0) {
            return 8388659;
        }
        return i13;
    }

    abstract float cllcsxoeiz(View view);

    public final int dsvhmnatus() {
        return this.f22054lereixgezr;
    }

    final int hkdspvbjdz(View view) {
        if (this.f22054lereixgezr == 0) {
            return 0;
        }
        float fCllcsxoeiz = cllcsxoeiz(view);
        int i13 = this.f22054lereixgezr;
        return o1.iobyxmoadg.zoijcleaow((int) (fCllcsxoeiz * i13), 0, i13);
    }

    abstract View jpowsppfya(List list);

    protected boolean mbcevpiqjq() {
        return false;
    }

    @Override // com.google.android.material.appbar.eablkybsjg
    protected void pkzmftpjix(CoordinatorLayout coordinatorLayout, View view, int i13) {
        View viewJpowsppfya = jpowsppfya(coordinatorLayout.oxmwwwfdhm(view));
        if (viewJpowsppfya == null) {
            super.pkzmftpjix(coordinatorLayout, view, i13);
            this.f22052esjtqupxsv = 0;
            return;
        }
        CoordinatorLayout.gxszxtbevo gxszxtbevoVar = (CoordinatorLayout.gxszxtbevo) view.getLayoutParams();
        Rect rect = this.f22053iwizpuwonk;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).leftMargin, viewJpowsppfya.getBottom() + ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).rightMargin, ((coordinatorLayout.getHeight() + viewJpowsppfya.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gxszxtbevoVar).bottomMargin);
        skhdrjzrfn lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && jhduphickx.iwizpuwonk(coordinatorLayout) && !jhduphickx.iwizpuwonk(view)) {
            rect.left += lastWindowInsets.gtknphoqwx();
            rect.right -= lastWindowInsets.draadjrbmk();
        }
        Rect rect2 = this.f22051cqumvgiudr;
        zdlpuopuiu.iobyxmoadg(kegysxyocb(gxszxtbevoVar.f8327ppxfxbqfkf), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i13);
        int iHkdspvbjdz = hkdspvbjdz(viewJpowsppfya);
        view.layout(rect2.left, rect2.top - iHkdspvbjdz, rect2.right, rect2.bottom - iHkdspvbjdz);
        this.f22052esjtqupxsv = rect2.top - viewJpowsppfya.getBottom();
    }

    final int stevsuqkhv() {
        return this.f22052esjtqupxsv;
    }

    public final void tzroggbefp(int i13) {
        this.f22054lereixgezr = i13;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean vdvldrhtss(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
        View viewJpowsppfya;
        skhdrjzrfn lastWindowInsets;
        int i17 = view.getLayoutParams().height;
        if ((i17 != -1 && i17 != -2) || (viewJpowsppfya = jpowsppfya(coordinatorLayout.oxmwwwfdhm(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i15);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (jhduphickx.iwizpuwonk(viewJpowsppfya) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.wflxmlrfwp() + lastWindowInsets.btonecajqb();
        }
        int iWypolnanlu = size + wypolnanlu(viewJpowsppfya);
        int measuredHeight = viewJpowsppfya.getMeasuredHeight();
        if (mbcevpiqjq()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iWypolnanlu -= measuredHeight;
        }
        coordinatorLayout.pkzmftpjix(view, i13, i14, View.MeasureSpec.makeMeasureSpec(iWypolnanlu, i17 == -1 ? 1073741824 : Integer.MIN_VALUE), i16);
        return true;
    }

    int wypolnanlu(View view) {
        return view.getMeasuredHeight();
    }

    public wkgbmnqykc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22053iwizpuwonk = new Rect();
        this.f22051cqumvgiudr = new Rect();
        this.f22052esjtqupxsv = 0;
    }
}
