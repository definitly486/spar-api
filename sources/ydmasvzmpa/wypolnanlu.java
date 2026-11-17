package ydmasvzmpa;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wypolnanlu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final cllcsxoeiz f124624eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final jhduphickx f124625gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f124626iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f124627ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f124628wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final crxdokpmqz f124629zoijcleaow;

    public wypolnanlu(boolean z13, crxdokpmqz crxdokpmqzVar, int i13, int i14, cllcsxoeiz cllcsxoeizVar, jhduphickx jhduphickxVar) {
        this.f124626iobyxmoadg = z13;
        this.f124629zoijcleaow = crxdokpmqzVar;
        this.f124627ppxfxbqfkf = i13;
        this.f124628wkgbmnqykc = i14;
        this.f124624eablkybsjg = cllcsxoeizVar;
        this.f124625gxszxtbevo = jhduphickxVar;
    }

    public final long iobyxmoadg(int i13, int i14) {
        int i15;
        if (i14 == 1) {
            i15 = this.f124629zoijcleaow.zoijcleaow()[i13];
        } else {
            int i16 = (i14 + i13) - 1;
            i15 = (this.f124629zoijcleaow.iobyxmoadg()[i16] + this.f124629zoijcleaow.zoijcleaow()[i16]) - this.f124629zoijcleaow.iobyxmoadg()[i13];
        }
        int iGxszxtbevo = zg.gtknphoqwx.gxszxtbevo(i15, 0);
        return this.f124626iobyxmoadg ? w0.zoijcleaow.f118283zoijcleaow.eablkybsjg(iGxszxtbevo) : w0.zoijcleaow.f118283zoijcleaow.wkgbmnqykc(iGxszxtbevo);
    }

    public final dsvhmnatus ppxfxbqfkf(int i13) {
        jhduphickx.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = this.f124625gxszxtbevo.wkgbmnqykc(i13);
        int size = ppxfxbqfkfVarWkgbmnqykc.zoijcleaow().size();
        int i14 = (size == 0 || ppxfxbqfkfVarWkgbmnqykc.iobyxmoadg() + size == this.f124627ppxfxbqfkf) ? 0 : this.f124628wkgbmnqykc;
        hkdspvbjdz[] hkdspvbjdzVarArr = new hkdspvbjdz[size];
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            int iWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(((ppxfxbqfkf) ppxfxbqfkfVarWkgbmnqykc.zoijcleaow().get(i16)).lqeggnwhkg());
            hkdspvbjdz hkdspvbjdzVarEablkybsjg = this.f124624eablkybsjg.eablkybsjg(ppxfxbqfkfVarWkgbmnqykc.iobyxmoadg() + i16, iobyxmoadg(i15, iWkgbmnqykc), i15, iWkgbmnqykc, i14);
            i15 += iWkgbmnqykc;
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            hkdspvbjdzVarArr[i16] = hkdspvbjdzVarEablkybsjg;
        }
        return zoijcleaow(i13, hkdspvbjdzVarArr, ppxfxbqfkfVarWkgbmnqykc.zoijcleaow(), i14);
    }

    public final int wkgbmnqykc(int i13) {
        jhduphickx jhduphickxVar = this.f124625gxszxtbevo;
        return jhduphickxVar.gtknphoqwx(i13, jhduphickxVar.lqeggnwhkg());
    }

    public abstract dsvhmnatus zoijcleaow(int i13, hkdspvbjdz[] hkdspvbjdzVarArr, List list, int i14);
}
