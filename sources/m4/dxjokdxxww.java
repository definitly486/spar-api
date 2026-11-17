package m4;

import t3.iozdgvuglv;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f65098eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final long[] f65099gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final iozdgvuglv.iobyxmoadg f65100iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long f65101ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f65102wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f65103zoijcleaow;

    private dxjokdxxww(iozdgvuglv.iobyxmoadg iobyxmoadgVar, long j13, long j14, long[] jArr, int i13, int i14) {
        this.f65100iobyxmoadg = new iozdgvuglv.iobyxmoadg(iobyxmoadgVar);
        this.f65103zoijcleaow = j13;
        this.f65101ppxfxbqfkf = j14;
        this.f65099gxszxtbevo = jArr;
        this.f65102wkgbmnqykc = i13;
        this.f65098eablkybsjg = i14;
    }

    public static dxjokdxxww zoijcleaow(iozdgvuglv.iobyxmoadg iobyxmoadgVar, yadqdtsiqt yadqdtsiqtVar) {
        long[] jArr;
        int i13;
        int i14;
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        int iJpowsppfya = (iVdvldrhtss & 1) != 0 ? yadqdtsiqtVar.jpowsppfya() : -1;
        long jPkzmftpjix = (iVdvldrhtss & 2) != 0 ? yadqdtsiqtVar.pkzmftpjix() : -1L;
        if ((iVdvldrhtss & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i15 = 0; i15 < 100; i15++) {
                jArr2[i15] = yadqdtsiqtVar.wwaezpbzkn();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iVdvldrhtss & 8) != 0) {
            yadqdtsiqtVar.crxdokpmqz(4);
        }
        if (yadqdtsiqtVar.iobyxmoadg() >= 24) {
            yadqdtsiqtVar.crxdokpmqz(21);
            int iHcddaimhww = yadqdtsiqtVar.hcddaimhww();
            i14 = iHcddaimhww & 4095;
            i13 = (16773120 & iHcddaimhww) >> 12;
        } else {
            i13 = -1;
            i14 = -1;
        }
        return new dxjokdxxww(iobyxmoadgVar, iJpowsppfya, jPkzmftpjix, jArr, i13, i14);
    }

    public long iobyxmoadg() {
        long j13 = this.f65103zoijcleaow;
        if (j13 == -1 || j13 == 0) {
            return -9223372036854775807L;
        }
        iozdgvuglv.iobyxmoadg iobyxmoadgVar = this.f65100iobyxmoadg;
        return stevsuqkhv.a((j13 * ((long) iobyxmoadgVar.f109451lqeggnwhkg)) - 1, iobyxmoadgVar.f109453wkgbmnqykc);
    }
}
