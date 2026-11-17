package com.google.android.material.appbar;

import android.view.View;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f22028eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f22030iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f22032ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f22033wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f22034zoijcleaow;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f22029gxszxtbevo = true;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f22031lqeggnwhkg = true;

    public gxszxtbevo(View view) {
        this.f22030iobyxmoadg = view;
    }

    public boolean eablkybsjg(int i13) {
        if (!this.f22031lqeggnwhkg || this.f22028eablkybsjg == i13) {
            return false;
        }
        this.f22028eablkybsjg = i13;
        iobyxmoadg();
        return true;
    }

    public boolean gxszxtbevo(int i13) {
        if (!this.f22029gxszxtbevo || this.f22033wkgbmnqykc == i13) {
            return false;
        }
        this.f22033wkgbmnqykc = i13;
        iobyxmoadg();
        return true;
    }

    void iobyxmoadg() {
        View view = this.f22030iobyxmoadg;
        jhduphickx.ribwqtqdhb(view, this.f22033wkgbmnqykc - (view.getTop() - this.f22034zoijcleaow));
        View view2 = this.f22030iobyxmoadg;
        jhduphickx.jlmebxxoox(view2, this.f22028eablkybsjg - (view2.getLeft() - this.f22032ppxfxbqfkf));
    }

    public int ppxfxbqfkf() {
        return this.f22033wkgbmnqykc;
    }

    void wkgbmnqykc() {
        this.f22034zoijcleaow = this.f22030iobyxmoadg.getTop();
        this.f22032ppxfxbqfkf = this.f22030iobyxmoadg.getLeft();
    }

    public int zoijcleaow() {
        return this.f22034zoijcleaow;
    }
}
