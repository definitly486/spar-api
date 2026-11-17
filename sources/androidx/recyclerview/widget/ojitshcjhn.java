package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class ojitshcjhn {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    boolean f13107dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    int f13108eablkybsjg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    boolean f13112nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f13113ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f13114wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f13115zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    boolean f13110iobyxmoadg = true;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    int f13109gxszxtbevo = 0;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    int f13111lqeggnwhkg = 0;

    ojitshcjhn() {
    }

    boolean iobyxmoadg(RecyclerView.zynmafqrjb zynmafqrjbVar) {
        int i13 = this.f13113ppxfxbqfkf;
        return i13 >= 0 && i13 < zynmafqrjbVar.zoijcleaow();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f13115zoijcleaow + ", mCurrentPosition=" + this.f13113ppxfxbqfkf + ", mItemDirection=" + this.f13114wkgbmnqykc + ", mLayoutDirection=" + this.f13108eablkybsjg + ", mStartLine=" + this.f13109gxszxtbevo + ", mEndLine=" + this.f13111lqeggnwhkg + '}';
    }

    View zoijcleaow(RecyclerView.iwizpuwonk iwizpuwonkVar) {
        View viewOjitshcjhn = iwizpuwonkVar.ojitshcjhn(this.f13113ppxfxbqfkf);
        this.f13113ppxfxbqfkf += this.f13114wkgbmnqykc;
        return viewOjitshcjhn;
    }
}
