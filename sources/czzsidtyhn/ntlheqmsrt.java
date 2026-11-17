package czzsidtyhn;

import androidx.compose.runtime.c1;

/* JADX INFO: loaded from: classes.dex */
abstract class ntlheqmsrt implements y.wkgbmnqykc, y.btonecajqb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f26429zoijcleaow;

    public /* synthetic */ ntlheqmsrt(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private final lxfrhoxuzk draadjrbmk() {
        return (lxfrhoxuzk) this.f26429zoijcleaow.getValue();
    }

    private final void ojitshcjhn(lxfrhoxuzk lxfrhoxuzkVar) {
        this.f26429zoijcleaow.setValue(lxfrhoxuzkVar);
    }

    public abstract lxfrhoxuzk btonecajqb(lxfrhoxuzk lxfrhoxuzkVar);

    @Override // y.wkgbmnqykc
    public void dxjokdxxww(y.gtknphoqwx gtknphoqwxVar) {
        ojitshcjhn(btonecajqb((lxfrhoxuzk) gtknphoqwxVar.zynmafqrjb(fyldjkxazc.wkgbmnqykc())));
    }

    @Override // y.btonecajqb
    public y.draadjrbmk getKey() {
        return fyldjkxazc.wkgbmnqykc();
    }

    @Override // y.btonecajqb
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public lxfrhoxuzk getValue() {
        return draadjrbmk();
    }

    private ntlheqmsrt() {
        this.f26429zoijcleaow = c1.ppxfxbqfkf(fiwbwshyhd.iobyxmoadg(0, 0, 0, 0), null, 2, null);
    }
}
