package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final SideSheetBehavior f23058iobyxmoadg;

    iobyxmoadg(SideSheetBehavior sideSheetBehavior) {
        this.f23058iobyxmoadg = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    boolean agtfadlqog(View view, float f13) {
        return Math.abs(((float) view.getLeft()) + (f13 * this.f23058iobyxmoadg.czzsidtyhn())) > this.f23058iobyxmoadg.uwvvkdfqfp();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int btonecajqb() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    boolean draadjrbmk(View view) {
        return view.getRight() < (wkgbmnqykc() - eablkybsjg()) / 2;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    public int dxjokdxxww(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int eablkybsjg() {
        return (-this.f23058iobyxmoadg.okpsazkaxt()) - this.f23058iobyxmoadg.yfnezrywwk();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    boolean gtknphoqwx(float f13) {
        return f13 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int gxszxtbevo() {
        return this.f23058iobyxmoadg.yfnezrywwk();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int iobyxmoadg(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int lqeggnwhkg() {
        return -this.f23058iobyxmoadg.okpsazkaxt();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int nufgyqmvbu(View view) {
        return view.getRight() + this.f23058iobyxmoadg.yfnezrywwk();
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    void ojitshcjhn(ViewGroup.MarginLayoutParams marginLayoutParams, int i13) {
        marginLayoutParams.leftMargin = i13;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int ppxfxbqfkf(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    void rgvfuqvkyq(ViewGroup.MarginLayoutParams marginLayoutParams, int i13, int i14) {
        if (i13 <= this.f23058iobyxmoadg.zfvoamnweg()) {
            marginLayoutParams.leftMargin = i14;
        }
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    boolean wflxmlrfwp(float f13, float f14) {
        return wkgbmnqykc.iobyxmoadg(f13, f14) && Math.abs(f13) > ((float) this.f23058iobyxmoadg.oipsdeybqn());
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    int wkgbmnqykc() {
        return Math.max(0, this.f23058iobyxmoadg.sflfametgt() + this.f23058iobyxmoadg.yfnezrywwk());
    }

    @Override // com.google.android.material.sidesheet.ppxfxbqfkf
    float zoijcleaow(int i13) {
        float fEablkybsjg = eablkybsjg();
        return (i13 - fEablkybsjg) / (wkgbmnqykc() - fEablkybsjg);
    }
}
