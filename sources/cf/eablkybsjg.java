package cf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.zxing.WriterException;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[][] f19806iobyxmoadg = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[][] f19809zoijcleaow = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[][] f19807ppxfxbqfkf = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, UserVerificationMethods.USER_VERIFY_PATTERN, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[][] f19808wkgbmnqykc = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static int agtfadlqog(int i13) {
        return 32 - Integer.numberOfLeadingZeros(i13);
    }

    private static void btonecajqb(zoijcleaow zoijcleaowVar) throws WriterException {
        int length = f19806iobyxmoadg[0].length;
        dxjokdxxww(0, 0, zoijcleaowVar);
        dxjokdxxww(zoijcleaowVar.eablkybsjg() - length, 0, zoijcleaowVar);
        dxjokdxxww(0, zoijcleaowVar.eablkybsjg() - length, zoijcleaowVar);
        lqeggnwhkg(0, 7, zoijcleaowVar);
        lqeggnwhkg(zoijcleaowVar.eablkybsjg() - 8, 7, zoijcleaowVar);
        lqeggnwhkg(0, zoijcleaowVar.eablkybsjg() - 8, zoijcleaowVar);
        wflxmlrfwp(7, 0, zoijcleaowVar);
        wflxmlrfwp(zoijcleaowVar.wkgbmnqykc() - 8, 0, zoijcleaowVar);
        wflxmlrfwp(7, zoijcleaowVar.wkgbmnqykc() - 7, zoijcleaowVar);
    }

    static void draadjrbmk(bf.iobyxmoadg iobyxmoadgVar, int i13, zoijcleaow zoijcleaowVar) throws WriterException {
        int iWkgbmnqykc;
        te.iobyxmoadg iobyxmoadgVar2 = new te.iobyxmoadg();
        rgvfuqvkyq(iobyxmoadgVar, i13, iobyxmoadgVar2);
        for (int i14 = 0; i14 < iobyxmoadgVar2.lqeggnwhkg(); i14++) {
            boolean zGxszxtbevo = iobyxmoadgVar2.gxszxtbevo((iobyxmoadgVar2.lqeggnwhkg() - 1) - i14);
            int[] iArr = f19808wkgbmnqykc[i14];
            zoijcleaowVar.lqeggnwhkg(iArr[0], iArr[1], zGxszxtbevo);
            int iEablkybsjg = 8;
            if (i14 < 8) {
                iWkgbmnqykc = 8;
                iEablkybsjg = (zoijcleaowVar.eablkybsjg() - i14) - 1;
            } else {
                iWkgbmnqykc = (zoijcleaowVar.wkgbmnqykc() - 7) + (i14 - 8);
            }
            zoijcleaowVar.lqeggnwhkg(iEablkybsjg, iWkgbmnqykc, zGxszxtbevo);
        }
    }

    private static void dxjokdxxww(int i13, int i14, zoijcleaow zoijcleaowVar) {
        for (int i15 = 0; i15 < 7; i15++) {
            int[] iArr = f19806iobyxmoadg[i15];
            for (int i16 = 0; i16 < 7; i16++) {
                zoijcleaowVar.gxszxtbevo(i13 + i16, i14 + i15, iArr[i16]);
            }
        }
    }

    private static void eablkybsjg(zoijcleaow zoijcleaowVar) throws WriterException {
        if (zoijcleaowVar.zoijcleaow(8, zoijcleaowVar.wkgbmnqykc() - 8) == 0) {
            throw new WriterException();
        }
        zoijcleaowVar.gxszxtbevo(8, zoijcleaowVar.wkgbmnqykc() - 8, 1);
    }

    private static void gtknphoqwx(zoijcleaow zoijcleaowVar) {
        int i13 = 8;
        while (i13 < zoijcleaowVar.eablkybsjg() - 8) {
            int i14 = i13 + 1;
            int i15 = i14 % 2;
            if (ojitshcjhn(zoijcleaowVar.zoijcleaow(i13, 6))) {
                zoijcleaowVar.gxszxtbevo(i13, 6, i15);
            }
            if (ojitshcjhn(zoijcleaowVar.zoijcleaow(6, i13))) {
                zoijcleaowVar.gxszxtbevo(6, i13, i15);
            }
            i13 = i14;
        }
    }

    static void gxszxtbevo(te.iobyxmoadg iobyxmoadgVar, int i13, zoijcleaow zoijcleaowVar) throws WriterException {
        boolean zGxszxtbevo;
        int iEablkybsjg = zoijcleaowVar.eablkybsjg() - 1;
        int iWkgbmnqykc = zoijcleaowVar.wkgbmnqykc() - 1;
        int i14 = 0;
        int i15 = -1;
        while (iEablkybsjg > 0) {
            if (iEablkybsjg == 6) {
                iEablkybsjg--;
            }
            while (iWkgbmnqykc >= 0 && iWkgbmnqykc < zoijcleaowVar.wkgbmnqykc()) {
                for (int i16 = 0; i16 < 2; i16++) {
                    int i17 = iEablkybsjg - i16;
                    if (ojitshcjhn(zoijcleaowVar.zoijcleaow(i17, iWkgbmnqykc))) {
                        if (i14 < iobyxmoadgVar.lqeggnwhkg()) {
                            zGxszxtbevo = iobyxmoadgVar.gxszxtbevo(i14);
                            i14++;
                        } else {
                            zGxszxtbevo = false;
                        }
                        if (i13 != -1 && wkgbmnqykc.gxszxtbevo(i13, i17, iWkgbmnqykc)) {
                            zGxszxtbevo = !zGxszxtbevo;
                        }
                        zoijcleaowVar.lqeggnwhkg(i17, iWkgbmnqykc, zGxszxtbevo);
                    }
                }
                iWkgbmnqykc += i15;
            }
            i15 = -i15;
            iWkgbmnqykc += i15;
            iEablkybsjg -= 2;
        }
        if (i14 == iobyxmoadgVar.lqeggnwhkg()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i14 + '/' + iobyxmoadgVar.lqeggnwhkg());
    }

    static void iobyxmoadg(te.iobyxmoadg iobyxmoadgVar, bf.iobyxmoadg iobyxmoadgVar2, bf.ppxfxbqfkf ppxfxbqfkfVar, int i13, zoijcleaow zoijcleaowVar) throws WriterException {
        ppxfxbqfkf(zoijcleaowVar);
        wkgbmnqykc(ppxfxbqfkfVar, zoijcleaowVar);
        draadjrbmk(iobyxmoadgVar2, i13, zoijcleaowVar);
        kcexrzcfyt(ppxfxbqfkfVar, zoijcleaowVar);
        gxszxtbevo(iobyxmoadgVar, i13, zoijcleaowVar);
    }

    static void kcexrzcfyt(bf.ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar) throws WriterException {
        if (ppxfxbqfkfVar.gxszxtbevo() < 7) {
            return;
        }
        te.iobyxmoadg iobyxmoadgVar = new te.iobyxmoadg();
        vdvldrhtss(ppxfxbqfkfVar, iobyxmoadgVar);
        int i13 = 17;
        for (int i14 = 0; i14 < 6; i14++) {
            for (int i15 = 0; i15 < 3; i15++) {
                boolean zGxszxtbevo = iobyxmoadgVar.gxszxtbevo(i13);
                i13--;
                zoijcleaowVar.lqeggnwhkg(i14, (zoijcleaowVar.wkgbmnqykc() - 11) + i15, zGxszxtbevo);
                zoijcleaowVar.lqeggnwhkg((zoijcleaowVar.wkgbmnqykc() - 11) + i15, i14, zGxszxtbevo);
            }
        }
    }

    private static void lqeggnwhkg(int i13, int i14, zoijcleaow zoijcleaowVar) throws WriterException {
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = i13 + i15;
            if (!ojitshcjhn(zoijcleaowVar.zoijcleaow(i16, i14))) {
                throw new WriterException();
            }
            zoijcleaowVar.gxszxtbevo(i16, i14, 0);
        }
    }

    private static void nufgyqmvbu(int i13, int i14, zoijcleaow zoijcleaowVar) {
        for (int i15 = 0; i15 < 5; i15++) {
            int[] iArr = f19809zoijcleaow[i15];
            for (int i16 = 0; i16 < 5; i16++) {
                zoijcleaowVar.gxszxtbevo(i13 + i16, i14 + i15, iArr[i16]);
            }
        }
    }

    private static boolean ojitshcjhn(int i13) {
        return i13 == -1;
    }

    private static void oxmwwwfdhm(bf.ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar) {
        if (ppxfxbqfkfVar.gxszxtbevo() < 2) {
            return;
        }
        int[] iArr = f19807ppxfxbqfkf[ppxfxbqfkfVar.gxszxtbevo() - 1];
        for (int i13 : iArr) {
            if (i13 >= 0) {
                for (int i14 : iArr) {
                    if (i14 >= 0 && ojitshcjhn(zoijcleaowVar.zoijcleaow(i14, i13))) {
                        nufgyqmvbu(i14 - 2, i13 - 2, zoijcleaowVar);
                    }
                }
            }
        }
    }

    static void ppxfxbqfkf(zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.iobyxmoadg((byte) -1);
    }

    static void rgvfuqvkyq(bf.iobyxmoadg iobyxmoadgVar, int i13, te.iobyxmoadg iobyxmoadgVar2) throws WriterException {
        if (!gxszxtbevo.zoijcleaow(i13)) {
            throw new WriterException("Invalid mask pattern");
        }
        int iIobyxmoadg = (iobyxmoadgVar.iobyxmoadg() << 3) | i13;
        iobyxmoadgVar2.ppxfxbqfkf(iIobyxmoadg, 5);
        iobyxmoadgVar2.ppxfxbqfkf(zoijcleaow(iIobyxmoadg, 1335), 10);
        te.iobyxmoadg iobyxmoadgVar3 = new te.iobyxmoadg();
        iobyxmoadgVar3.ppxfxbqfkf(21522, 15);
        iobyxmoadgVar2.wflxmlrfwp(iobyxmoadgVar3);
        if (iobyxmoadgVar2.lqeggnwhkg() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + iobyxmoadgVar2.lqeggnwhkg());
    }

    static void vdvldrhtss(bf.ppxfxbqfkf ppxfxbqfkfVar, te.iobyxmoadg iobyxmoadgVar) throws WriterException {
        iobyxmoadgVar.ppxfxbqfkf(ppxfxbqfkfVar.gxszxtbevo(), 6);
        iobyxmoadgVar.ppxfxbqfkf(zoijcleaow(ppxfxbqfkfVar.gxszxtbevo(), 7973), 12);
        if (iobyxmoadgVar.lqeggnwhkg() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + iobyxmoadgVar.lqeggnwhkg());
    }

    private static void wflxmlrfwp(int i13, int i14, zoijcleaow zoijcleaowVar) throws WriterException {
        for (int i15 = 0; i15 < 7; i15++) {
            int i16 = i14 + i15;
            if (!ojitshcjhn(zoijcleaowVar.zoijcleaow(i13, i16))) {
                throw new WriterException();
            }
            zoijcleaowVar.gxszxtbevo(i13, i16, 0);
        }
    }

    static void wkgbmnqykc(bf.ppxfxbqfkf ppxfxbqfkfVar, zoijcleaow zoijcleaowVar) throws WriterException {
        btonecajqb(zoijcleaowVar);
        eablkybsjg(zoijcleaowVar);
        oxmwwwfdhm(ppxfxbqfkfVar, zoijcleaowVar);
        gtknphoqwx(zoijcleaowVar);
    }

    static int zoijcleaow(int i13, int i14) {
        if (i14 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iAgtfadlqog = agtfadlqog(i14);
        int iAgtfadlqog2 = i13 << (iAgtfadlqog - 1);
        while (agtfadlqog(iAgtfadlqog2) >= iAgtfadlqog) {
            iAgtfadlqog2 ^= i14 << (agtfadlqog(iAgtfadlqog2) - iAgtfadlqog);
        }
        return iAgtfadlqog2;
    }
}
