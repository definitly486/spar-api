package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final SideSheetBehavior f23059iobyxmoadg;

    zoijcleaow(SideSheetBehavior sideSheetBehavior) {
        this.f23059iobyxmoadg = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    boolean agtfadlqog(View view, float f13) {
        return Math.abs(((float) view.getRight()) + (f13 * this.f23059iobyxmoadg.czzsidtyhn())) > this.f23059iobyxmoadg.uwvvkdfqfp();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int btonecajqb() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    boolean draadjrbmk(View view) {
        return view.getLeft() > (eablkybsjg() + wkgbmnqykc()) / 2;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    public int dxjokdxxww(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int eablkybsjg() {
        return this.f23059iobyxmoadg.zfvoamnweg();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    boolean gtknphoqwx(float f13) {
        return f13 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int gxszxtbevo() {
        return this.f23059iobyxmoadg.zfvoamnweg();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int iobyxmoadg(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int lqeggnwhkg() {
        return wkgbmnqykc();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int nufgyqmvbu(View view) {
        return view.getLeft() - this.f23059iobyxmoadg.yfnezrywwk();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    void ojitshcjhn(ViewGroup.MarginLayoutParams marginLayoutParams, int i13) {
        marginLayoutParams.rightMargin = i13;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int ppxfxbqfkf(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    void rgvfuqvkyq(ViewGroup.MarginLayoutParams marginLayoutParams, int i13, int i14) {
        int iZfvoamnweg = this.f23059iobyxmoadg.zfvoamnweg();
        if (i13 <= iZfvoamnweg) {
            marginLayoutParams.rightMargin = iZfvoamnweg - i13;
        }
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    boolean wflxmlrfwp(float f13, float f14) {
        return wkgbmnqykc.iobyxmoadg(f13, f14) && Math.abs(f13) > ((float) this.f23059iobyxmoadg.oipsdeybqn());
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int wkgbmnqykc() {
        return Math.max(0, (eablkybsjg() - this.f23059iobyxmoadg.okpsazkaxt()) - this.f23059iobyxmoadg.yfnezrywwk());
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    float zoijcleaow(int i13) {
        float fEablkybsjg = eablkybsjg();
        return (fEablkybsjg - i13) / (fEablkybsjg - wkgbmnqykc());
    }
}
