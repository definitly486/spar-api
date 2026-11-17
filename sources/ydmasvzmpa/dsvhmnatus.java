package ydmasvzmpa;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dsvhmnatus {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f124420eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f124421gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f124422iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f124423lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f124424nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final crxdokpmqz f124425ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f124426wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hkdspvbjdz[] f124427zoijcleaow;

    public dsvhmnatus(int i13, hkdspvbjdz[] hkdspvbjdzVarArr, crxdokpmqz crxdokpmqzVar, List list, boolean z13, int i14) {
        this.f124422iobyxmoadg = i13;
        this.f124427zoijcleaow = hkdspvbjdzVarArr;
        this.f124425ppxfxbqfkf = crxdokpmqzVar;
        this.f124426wkgbmnqykc = list;
        this.f124420eablkybsjg = z13;
        this.f124421gxszxtbevo = i14;
        int iMax = 0;
        for (hkdspvbjdz hkdspvbjdzVar : hkdspvbjdzVarArr) {
            iMax = Math.max(iMax, hkdspvbjdzVar.oxmwwwfdhm());
        }
        this.f124423lqeggnwhkg = iMax;
        this.f124424nufgyqmvbu = zg.gtknphoqwx.gxszxtbevo(iMax + this.f124421gxszxtbevo, 0);
    }

    public final boolean eablkybsjg() {
        return this.f124427zoijcleaow.length == 0;
    }

    public final hkdspvbjdz[] gxszxtbevo(int i13, int i14, int i15) {
        hkdspvbjdz[] hkdspvbjdzVarArr = this.f124427zoijcleaow;
        int length = hkdspvbjdzVarArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < length) {
            hkdspvbjdz hkdspvbjdzVar = hkdspvbjdzVarArr[i16];
            int i19 = i17 + 1;
            int iWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc(((ppxfxbqfkf) this.f124426wkgbmnqykc.get(i17)).lqeggnwhkg());
            int i23 = this.f124425ppxfxbqfkf.iobyxmoadg()[i18];
            boolean z13 = this.f124420eablkybsjg;
            hkdspvbjdzVar.yggfygwlhe(i13, i23, i14, i15, z13 ? this.f124422iobyxmoadg : i18, z13 ? i18 : this.f124422iobyxmoadg);
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            i18 += iWkgbmnqykc;
            i16++;
            i17 = i19;
        }
        return this.f124427zoijcleaow;
    }

    public final int iobyxmoadg() {
        return this.f124422iobyxmoadg;
    }

    public final int ppxfxbqfkf() {
        return this.f124423lqeggnwhkg;
    }

    public final int wkgbmnqykc() {
        return this.f124424nufgyqmvbu;
    }

    public final hkdspvbjdz[] zoijcleaow() {
        return this.f124427zoijcleaow;
    }
}
