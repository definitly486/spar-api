package m4;

import t3.hcddaimhww;
import t3.iozdgvuglv;
import t3.pkzmftpjix;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class nufgyqmvbu implements lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f65132eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long[] f65133iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f65134ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f65135wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long[] f65136zoijcleaow;

    private nufgyqmvbu(long[] jArr, long[] jArr2, long j13, long j14, int i13) {
        this.f65133iobyxmoadg = jArr;
        this.f65136zoijcleaow = jArr2;
        this.f65134ppxfxbqfkf = j13;
        this.f65135wkgbmnqykc = j14;
        this.f65132eablkybsjg = i13;
    }

    public static nufgyqmvbu iobyxmoadg(long j13, long j14, iozdgvuglv.iobyxmoadg iobyxmoadgVar, yadqdtsiqt yadqdtsiqtVar) {
        int iWwaezpbzkn;
        yadqdtsiqtVar.crxdokpmqz(6);
        long jVdvldrhtss = j14 + ((long) iobyxmoadgVar.f109452ppxfxbqfkf) + ((long) yadqdtsiqtVar.vdvldrhtss());
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (iVdvldrhtss <= 0) {
            return null;
        }
        long jA = stevsuqkhv.a((((long) iVdvldrhtss) * ((long) iobyxmoadgVar.f109451lqeggnwhkg)) - 1, iobyxmoadgVar.f109453wkgbmnqykc);
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        int iWypolnanlu2 = yadqdtsiqtVar.wypolnanlu();
        int iWypolnanlu3 = yadqdtsiqtVar.wypolnanlu();
        yadqdtsiqtVar.crxdokpmqz(2);
        long j15 = j14 + ((long) iobyxmoadgVar.f109452ppxfxbqfkf);
        long[] jArr = new long[iWypolnanlu];
        long[] jArr2 = new long[iWypolnanlu];
        int i13 = 0;
        while (i13 < iWypolnanlu) {
            long j16 = jA;
            jArr[i13] = (((long) i13) * jA) / ((long) iWypolnanlu);
            jArr2[i13] = j15;
            if (iWypolnanlu3 == 1) {
                iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            } else if (iWypolnanlu3 == 2) {
                iWwaezpbzkn = yadqdtsiqtVar.wypolnanlu();
            } else if (iWypolnanlu3 == 3) {
                iWwaezpbzkn = yadqdtsiqtVar.hcddaimhww();
            } else {
                if (iWypolnanlu3 != 4) {
                    return null;
                }
                iWwaezpbzkn = yadqdtsiqtVar.jpowsppfya();
            }
            j15 += ((long) iWwaezpbzkn) * ((long) iWypolnanlu2);
            i13++;
            jA = j16;
        }
        long j17 = jA;
        if (j13 != -1 && j13 != jVdvldrhtss) {
            kcexrzcfyt.nufgyqmvbu("VbriSeeker", "VBRI data size mismatch: " + j13 + ", " + jVdvldrhtss);
        }
        if (jVdvldrhtss != j15) {
            kcexrzcfyt.nufgyqmvbu("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jVdvldrhtss + ", " + j15 + "\nSeeking will be inaccurate.");
            jVdvldrhtss = Math.max(jVdvldrhtss, j15);
        }
        return new nufgyqmvbu(jArr, jArr2, j17, jVdvldrhtss, iobyxmoadgVar.f109449gxszxtbevo);
    }

    @Override // m4.lqeggnwhkg
    public int btonecajqb() {
        return this.f65132eablkybsjg;
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f65134ppxfxbqfkf;
    }

    @Override // m4.lqeggnwhkg
    public long gxszxtbevo() {
        return this.f65135wkgbmnqykc;
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return true;
    }

    @Override // m4.lqeggnwhkg
    public long nufgyqmvbu(long j13) {
        return this.f65133iobyxmoadg[stevsuqkhv.lqeggnwhkg(this.f65136zoijcleaow, j13, true, true)];
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        int iLqeggnwhkg = stevsuqkhv.lqeggnwhkg(this.f65133iobyxmoadg, j13, true, true);
        hcddaimhww hcddaimhwwVar = new hcddaimhww(this.f65133iobyxmoadg[iLqeggnwhkg], this.f65136zoijcleaow[iLqeggnwhkg]);
        if (hcddaimhwwVar.f109432iobyxmoadg >= j13 || iLqeggnwhkg == this.f65133iobyxmoadg.length - 1) {
            return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar);
        }
        int i13 = iLqeggnwhkg + 1;
        return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar, new hcddaimhww(this.f65133iobyxmoadg[i13], this.f65136zoijcleaow[i13]));
    }
}
