package czzsidtyhn;

import androidx.compose.runtime.c1;

/* JADX INFO: loaded from: classes.dex */
public final class crxdokpmqz implements x.jyumaefscl, y.wkgbmnqykc, y.btonecajqb {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f26273ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f26274wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lxfrhoxuzk f26275zoijcleaow;

    public crxdokpmqz(lxfrhoxuzk lxfrhoxuzkVar) {
        this.f26275zoijcleaow = lxfrhoxuzkVar;
        this.f26273ppxfxbqfkf = c1.ppxfxbqfkf(lxfrhoxuzkVar, null, 2, null);
        this.f26274wkgbmnqykc = c1.ppxfxbqfkf(lxfrhoxuzkVar, null, 2, null);
    }

    private final lxfrhoxuzk draadjrbmk() {
        return (lxfrhoxuzk) this.f26274wkgbmnqykc.getValue();
    }

    private final void kcexrzcfyt(lxfrhoxuzk lxfrhoxuzkVar) {
        this.f26273ppxfxbqfkf.setValue(lxfrhoxuzkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i13, int i14, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, i13, i14, 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void vdvldrhtss(lxfrhoxuzk lxfrhoxuzkVar) {
        this.f26274wkgbmnqykc.setValue(lxfrhoxuzkVar);
    }

    private final lxfrhoxuzk wflxmlrfwp() {
        return (lxfrhoxuzk) this.f26273ppxfxbqfkf.getValue();
    }

    @Override // y.wkgbmnqykc
    public void dxjokdxxww(y.gtknphoqwx gtknphoqwxVar) {
        lxfrhoxuzk lxfrhoxuzkVar = (lxfrhoxuzk) gtknphoqwxVar.zynmafqrjb(fyldjkxazc.wkgbmnqykc());
        kcexrzcfyt(fiwbwshyhd.nufgyqmvbu(this.f26275zoijcleaow, lxfrhoxuzkVar));
        vdvldrhtss(fiwbwshyhd.dxjokdxxww(lxfrhoxuzkVar, this.f26275zoijcleaow));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof crxdokpmqz) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((crxdokpmqz) obj).f26275zoijcleaow, this.f26275zoijcleaow);
        }
        return false;
    }

    @Override // y.btonecajqb
    public y.draadjrbmk getKey() {
        return fyldjkxazc.wkgbmnqykc();
    }

    @Override // x.jyumaefscl
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        final int iIobyxmoadg = wflxmlrfwp().iobyxmoadg(draadjrbmkVar, draadjrbmkVar.getLayoutDirection());
        final int iWkgbmnqykc = wflxmlrfwp().wkgbmnqykc(draadjrbmkVar);
        int iPpxfxbqfkf = wflxmlrfwp().ppxfxbqfkf(draadjrbmkVar, draadjrbmkVar.getLayoutDirection()) + iIobyxmoadg;
        int iZoijcleaow = wflxmlrfwp().zoijcleaow(draadjrbmkVar) + iWkgbmnqykc;
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(w0.ppxfxbqfkf.dxjokdxxww(j13, -iPpxfxbqfkf, -iZoijcleaow));
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, w0.ppxfxbqfkf.lqeggnwhkg(j13, kcexrzcfytVarSflfametgt.eslsurpljm() + iPpxfxbqfkf), w0.ppxfxbqfkf.gxszxtbevo(j13, kcexrzcfytVarSflfametgt.ipoelvxyzq() + iZoijcleaow), null, new tg.draadjrbmk() { // from class: czzsidtyhn.sopmlzcsov
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return crxdokpmqz.rgvfuqvkyq(kcexrzcfytVarSflfametgt, iIobyxmoadg, iWkgbmnqykc, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    public int hashCode() {
        return this.f26275zoijcleaow.hashCode();
    }

    @Override // y.btonecajqb
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public lxfrhoxuzk getValue() {
        return draadjrbmk();
    }
}
