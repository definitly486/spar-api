package a5;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class pmvmpeiblj {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f651eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f656ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f657wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y2.hcddaimhww f653iobyxmoadg = new y2.hcddaimhww(0);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f652gxszxtbevo = -9223372036854775807L;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f654lqeggnwhkg = -9223372036854775807L;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f655nufgyqmvbu = -9223372036854775807L;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.yadqdtsiqt f658zoijcleaow = new y2.yadqdtsiqt();

    pmvmpeiblj() {
    }

    private int btonecajqb(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) {
        long length = vdvldrhtssVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j13 = length - ((long) iMin);
        if (vdvldrhtssVar.getPosition() != j13) {
            ylkuphrtabVar.f109571iobyxmoadg = j13;
            return 1;
        }
        this.f658zoijcleaow.tzroggbefp(iMin);
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.ojitshcjhn(this.f658zoijcleaow.eablkybsjg(), 0, iMin);
        this.f654lqeggnwhkg = gtknphoqwx(this.f658zoijcleaow);
        this.f651eablkybsjg = true;
        return 0;
    }

    public static long draadjrbmk(y2.yadqdtsiqt yadqdtsiqtVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        if (yadqdtsiqtVar.iobyxmoadg() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, 9);
        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        if (iobyxmoadg(bArr)) {
            return wflxmlrfwp(bArr);
        }
        return -9223372036854775807L;
    }

    private long dxjokdxxww(y2.yadqdtsiqt yadqdtsiqtVar) {
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        for (int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo(); iGxszxtbevo < iLqeggnwhkg - 3; iGxszxtbevo++) {
            if (gxszxtbevo(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo) == 442) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + 4);
                long jDraadjrbmk = draadjrbmk(yadqdtsiqtVar);
                if (jDraadjrbmk != -9223372036854775807L) {
                    return jDraadjrbmk;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long gtknphoqwx(y2.yadqdtsiqt yadqdtsiqtVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        for (int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg() - 4; iLqeggnwhkg >= iGxszxtbevo; iLqeggnwhkg--) {
            if (gxszxtbevo(yadqdtsiqtVar.eablkybsjg(), iLqeggnwhkg) == 442) {
                yadqdtsiqtVar.sopmlzcsov(iLqeggnwhkg + 4);
                long jDraadjrbmk = draadjrbmk(yadqdtsiqtVar);
                if (jDraadjrbmk != -9223372036854775807L) {
                    return jDraadjrbmk;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int gxszxtbevo(byte[] bArr, int i13) {
        return (bArr[i13 + 3] & 255) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13 + 2] & 255) << 8);
    }

    private static boolean iobyxmoadg(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int nufgyqmvbu(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) {
        int iMin = (int) Math.min(20000L, vdvldrhtssVar.getLength());
        long j13 = 0;
        if (vdvldrhtssVar.getPosition() != j13) {
            ylkuphrtabVar.f109571iobyxmoadg = j13;
            return 1;
        }
        this.f658zoijcleaow.tzroggbefp(iMin);
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.ojitshcjhn(this.f658zoijcleaow.eablkybsjg(), 0, iMin);
        this.f652gxszxtbevo = dxjokdxxww(this.f658zoijcleaow);
        this.f657wkgbmnqykc = true;
        return 0;
    }

    private static long wflxmlrfwp(byte[] bArr) {
        byte b13 = bArr[0];
        long j13 = (((((long) b13) & 56) >> 3) << 30) | ((((long) b13) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b14 = bArr[2];
        return j13 | (((((long) b14) & 248) >> 3) << 15) | ((((long) b14) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    private int zoijcleaow(t3.vdvldrhtss vdvldrhtssVar) {
        this.f658zoijcleaow.mbcevpiqjq(stevsuqkhv.f123601gxszxtbevo);
        this.f656ppxfxbqfkf = true;
        vdvldrhtssVar.gxszxtbevo();
        return 0;
    }

    public boolean eablkybsjg() {
        return this.f656ppxfxbqfkf;
    }

    public int lqeggnwhkg(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) {
        if (!this.f651eablkybsjg) {
            return btonecajqb(vdvldrhtssVar, ylkuphrtabVar);
        }
        if (this.f654lqeggnwhkg == -9223372036854775807L) {
            return zoijcleaow(vdvldrhtssVar);
        }
        if (!this.f657wkgbmnqykc) {
            return nufgyqmvbu(vdvldrhtssVar, ylkuphrtabVar);
        }
        long j13 = this.f652gxszxtbevo;
        if (j13 == -9223372036854775807L) {
            return zoijcleaow(vdvldrhtssVar);
        }
        this.f655nufgyqmvbu = this.f653iobyxmoadg.ppxfxbqfkf(this.f654lqeggnwhkg) - this.f653iobyxmoadg.zoijcleaow(j13);
        return zoijcleaow(vdvldrhtssVar);
    }

    public long ppxfxbqfkf() {
        return this.f655nufgyqmvbu;
    }

    public y2.hcddaimhww wkgbmnqykc() {
        return this.f653iobyxmoadg;
    }
}
