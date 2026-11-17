package se;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final gxszxtbevo f106029eablkybsjg = new gxszxtbevo(lqeggnwhkg.f106039zoijcleaow, 0, 0, 0);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f106030iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f106031ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f106032wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f106033zoijcleaow;

    private gxszxtbevo(lqeggnwhkg lqeggnwhkgVar, int i13, int i14, int i15) {
        this.f106033zoijcleaow = lqeggnwhkgVar;
        this.f106030iobyxmoadg = i13;
        this.f106031ppxfxbqfkf = i14;
        this.f106032wkgbmnqykc = i15;
    }

    private static int zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        int i13 = gxszxtbevoVar.f106031ppxfxbqfkf;
        if (i13 > 62) {
            return 21;
        }
        if (i13 > 31) {
            return 20;
        }
        return i13 > 0 ? 10 : 0;
    }

    te.iobyxmoadg btonecajqb(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = ppxfxbqfkf(bArr.length).f106033zoijcleaow; lqeggnwhkgVarWkgbmnqykc != null; lqeggnwhkgVarWkgbmnqykc = lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc()) {
            linkedList.addFirst(lqeggnwhkgVarWkgbmnqykc);
        }
        te.iobyxmoadg iobyxmoadgVar = new te.iobyxmoadg();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((lqeggnwhkg) it.next()).ppxfxbqfkf(iobyxmoadgVar, bArr);
        }
        return iobyxmoadgVar;
    }

    gxszxtbevo dxjokdxxww(int i13, int i14) {
        lqeggnwhkg lqeggnwhkgVar = this.f106033zoijcleaow;
        int i15 = this.f106030iobyxmoadg;
        int i16 = i15 == 2 ? 4 : 5;
        return new gxszxtbevo(lqeggnwhkgVar.iobyxmoadg(wkgbmnqykc.f106042eablkybsjg[i15][i13], i16).iobyxmoadg(i14, 5), this.f106030iobyxmoadg, 0, this.f106032wkgbmnqykc + i16 + 5);
    }

    int eablkybsjg() {
        return this.f106032wkgbmnqykc;
    }

    int gxszxtbevo() {
        return this.f106030iobyxmoadg;
    }

    gxszxtbevo iobyxmoadg(int i13) {
        int i14;
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = this.f106033zoijcleaow;
        int i15 = this.f106030iobyxmoadg;
        int i16 = this.f106032wkgbmnqykc;
        if (i15 == 4 || i15 == 2) {
            int i17 = wkgbmnqykc.f106043ppxfxbqfkf[i15][0];
            int i18 = 65535 & i17;
            int i19 = i17 >> 16;
            lqeggnwhkgVarIobyxmoadg = lqeggnwhkgVarIobyxmoadg.iobyxmoadg(i18, i19);
            i16 += i19;
            i15 = 0;
        }
        int i23 = this.f106031ppxfxbqfkf;
        if (i23 == 0 || i23 == 31) {
            i14 = 18;
        } else {
            i14 = i23 == 62 ? 9 : 8;
        }
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(lqeggnwhkgVarIobyxmoadg, i15, i23 + 1, i16 + i14);
        return gxszxtbevoVar.f106031ppxfxbqfkf == 2078 ? gxszxtbevoVar.ppxfxbqfkf(i13 + 1) : gxszxtbevoVar;
    }

    boolean lqeggnwhkg(gxszxtbevo gxszxtbevoVar) {
        int iZoijcleaow = this.f106032wkgbmnqykc + (wkgbmnqykc.f106043ppxfxbqfkf[this.f106030iobyxmoadg][gxszxtbevoVar.f106030iobyxmoadg] >> 16);
        int i13 = this.f106031ppxfxbqfkf;
        int i14 = gxszxtbevoVar.f106031ppxfxbqfkf;
        if (i13 < i14) {
            iZoijcleaow += zoijcleaow(gxszxtbevoVar) - zoijcleaow(this);
        } else if (i13 > i14 && i14 > 0) {
            iZoijcleaow += 10;
        }
        return iZoijcleaow <= gxszxtbevoVar.f106032wkgbmnqykc;
    }

    gxszxtbevo nufgyqmvbu(int i13, int i14) {
        int i15 = this.f106032wkgbmnqykc;
        lqeggnwhkg lqeggnwhkgVarIobyxmoadg = this.f106033zoijcleaow;
        int i16 = this.f106030iobyxmoadg;
        if (i13 != i16) {
            int i17 = wkgbmnqykc.f106043ppxfxbqfkf[i16][i13];
            int i18 = 65535 & i17;
            int i19 = i17 >> 16;
            lqeggnwhkgVarIobyxmoadg = lqeggnwhkgVarIobyxmoadg.iobyxmoadg(i18, i19);
            i15 += i19;
        }
        int i23 = i13 == 2 ? 4 : 5;
        return new gxszxtbevo(lqeggnwhkgVarIobyxmoadg.iobyxmoadg(i14, i23), i13, 0, i15 + i23);
    }

    gxszxtbevo ppxfxbqfkf(int i13) {
        int i14 = this.f106031ppxfxbqfkf;
        return i14 == 0 ? this : new gxszxtbevo(this.f106033zoijcleaow.zoijcleaow(i13 - i14, i14), this.f106030iobyxmoadg, 0, this.f106032wkgbmnqykc);
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", wkgbmnqykc.f106045zoijcleaow[this.f106030iobyxmoadg], Integer.valueOf(this.f106032wkgbmnqykc), Integer.valueOf(this.f106031ppxfxbqfkf));
    }

    int wkgbmnqykc() {
        return this.f106031ppxfxbqfkf;
    }
}
