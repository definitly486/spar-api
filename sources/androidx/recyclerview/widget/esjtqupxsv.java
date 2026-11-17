package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class esjtqupxsv extends RecyclerView.wflxmlrfwp {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    boolean f12986lqeggnwhkg = true;

    public final void cdpycssgdh(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        jpowsppfya(iozdgvuglvVar);
    }

    public void cllcsxoeiz(RecyclerView.iozdgvuglv iozdgvuglvVar, boolean z13) {
    }

    public void dsvhmnatus(RecyclerView.iozdgvuglv iozdgvuglvVar) {
    }

    public abstract boolean esjtqupxsv(RecyclerView.iozdgvuglv iozdgvuglvVar);

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public boolean gxszxtbevo(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        return !this.f12986lqeggnwhkg || iozdgvuglvVar.isInvalid();
    }

    public void hcddaimhww(RecyclerView.iozdgvuglv iozdgvuglvVar) {
    }

    public void hkdspvbjdz(RecyclerView.iozdgvuglv iozdgvuglvVar, boolean z13) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public boolean iobyxmoadg(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
        int i13;
        int i14;
        return (ppxfxbqfkfVar == null || ((i13 = ppxfxbqfkfVar.f12794iobyxmoadg) == (i14 = ppxfxbqfkfVar2.f12794iobyxmoadg) && ppxfxbqfkfVar.f12797zoijcleaow == ppxfxbqfkfVar2.f12797zoijcleaow)) ? esjtqupxsv(iozdgvuglvVar) : pmvmpeiblj(iozdgvuglvVar, i13, ppxfxbqfkfVar.f12797zoijcleaow, i14, ppxfxbqfkfVar2.f12797zoijcleaow);
    }

    public final void iozdgvuglv(RecyclerView.iozdgvuglv iozdgvuglvVar, boolean z13) {
        cllcsxoeiz(iozdgvuglvVar, z13);
    }

    public final void istkbnxepw(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        hcddaimhww(iozdgvuglvVar);
        nufgyqmvbu(iozdgvuglvVar);
    }

    public void jpowsppfya(RecyclerView.iozdgvuglv iozdgvuglvVar) {
    }

    public void kegysxyocb(RecyclerView.iozdgvuglv iozdgvuglvVar) {
    }

    public abstract boolean lereixgezr(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.iozdgvuglv iozdgvuglvVar2, int i13, int i14, int i15, int i16);

    public final void lmojexxdyd(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        dsvhmnatus(iozdgvuglvVar);
        nufgyqmvbu(iozdgvuglvVar);
    }

    public final void pkzmftpjix(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        kegysxyocb(iozdgvuglvVar);
    }

    public abstract boolean pmvmpeiblj(RecyclerView.iozdgvuglv iozdgvuglvVar, int i13, int i14, int i15, int i16);

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public boolean ppxfxbqfkf(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
        int i13 = ppxfxbqfkfVar.f12794iobyxmoadg;
        int i14 = ppxfxbqfkfVar.f12797zoijcleaow;
        View view = iozdgvuglvVar.itemView;
        int left = ppxfxbqfkfVar2 == null ? view.getLeft() : ppxfxbqfkfVar2.f12794iobyxmoadg;
        int top = ppxfxbqfkfVar2 == null ? view.getTop() : ppxfxbqfkfVar2.f12797zoijcleaow;
        if (iozdgvuglvVar.isRemoved() || (i13 == left && i14 == top)) {
            return zynmafqrjb(iozdgvuglvVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return pmvmpeiblj(iozdgvuglvVar, i13, i14, left, top);
    }

    public void stevsuqkhv(RecyclerView.iozdgvuglv iozdgvuglvVar) {
    }

    public void tzroggbefp(boolean z13) {
        this.f12986lqeggnwhkg = z13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public boolean wkgbmnqykc(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
        int i13 = ppxfxbqfkfVar.f12794iobyxmoadg;
        int i14 = ppxfxbqfkfVar2.f12794iobyxmoadg;
        if (i13 != i14 || ppxfxbqfkfVar.f12797zoijcleaow != ppxfxbqfkfVar2.f12797zoijcleaow) {
            return pmvmpeiblj(iozdgvuglvVar, i13, ppxfxbqfkfVar.f12797zoijcleaow, i14, ppxfxbqfkfVar2.f12797zoijcleaow);
        }
        lmojexxdyd(iozdgvuglvVar);
        return false;
    }

    public final void wwaezpbzkn(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        wypolnanlu(iozdgvuglvVar);
    }

    public void wypolnanlu(RecyclerView.iozdgvuglv iozdgvuglvVar) {
    }

    public final void yadqdtsiqt(RecyclerView.iozdgvuglv iozdgvuglvVar, boolean z13) {
        hkdspvbjdz(iozdgvuglvVar, z13);
        nufgyqmvbu(iozdgvuglvVar);
    }

    public final void ylkuphrtab(RecyclerView.iozdgvuglv iozdgvuglvVar) {
        stevsuqkhv(iozdgvuglvVar);
        nufgyqmvbu(iozdgvuglvVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.wflxmlrfwp
    public boolean zoijcleaow(RecyclerView.iozdgvuglv iozdgvuglvVar, RecyclerView.iozdgvuglv iozdgvuglvVar2, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar, RecyclerView.wflxmlrfwp.ppxfxbqfkf ppxfxbqfkfVar2) {
        int i13;
        int i14;
        int i15 = ppxfxbqfkfVar.f12794iobyxmoadg;
        int i16 = ppxfxbqfkfVar.f12797zoijcleaow;
        if (iozdgvuglvVar2.shouldIgnore()) {
            int i17 = ppxfxbqfkfVar.f12794iobyxmoadg;
            i14 = ppxfxbqfkfVar.f12797zoijcleaow;
            i13 = i17;
        } else {
            i13 = ppxfxbqfkfVar2.f12794iobyxmoadg;
            i14 = ppxfxbqfkfVar2.f12797zoijcleaow;
        }
        return lereixgezr(iozdgvuglvVar, iozdgvuglvVar2, i15, i16, i13, i14);
    }

    public abstract boolean zynmafqrjb(RecyclerView.iozdgvuglv iozdgvuglvVar);
}
