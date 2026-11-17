package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    float f21916btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    int f21917draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    int f21918dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    int f21919eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    float f21920gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    int f21921gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    int f21923lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    int f21924nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    int f21925ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    boolean f21926oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    int f21928rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    boolean f21929vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    int f21930wflxmlrfwp;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    int f21922iobyxmoadg = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f21932zoijcleaow = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f21927ppxfxbqfkf = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f21931wkgbmnqykc = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    List f21915agtfadlqog = new ArrayList();

    zoijcleaow() {
    }

    public int iobyxmoadg() {
        return this.f21923lqeggnwhkg;
    }

    public int ppxfxbqfkf() {
        return this.f21924nufgyqmvbu - this.f21918dxjokdxxww;
    }

    void wkgbmnqykc(View view, int i13, int i14, int i15, int i16) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f21922iobyxmoadg = Math.min(this.f21922iobyxmoadg, (view.getLeft() - flexItem.z()) - i13);
        this.f21932zoijcleaow = Math.min(this.f21932zoijcleaow, (view.getTop() - flexItem.czzsidtyhn()) - i14);
        this.f21927ppxfxbqfkf = Math.max(this.f21927ppxfxbqfkf, view.getRight() + flexItem.Y() + i15);
        this.f21931wkgbmnqykc = Math.max(this.f21931wkgbmnqykc, view.getBottom() + flexItem.w() + i16);
    }

    public int zoijcleaow() {
        return this.f21924nufgyqmvbu;
    }
}
