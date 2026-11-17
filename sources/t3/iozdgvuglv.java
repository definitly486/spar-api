package t3;

/* JADX INFO: loaded from: classes.dex */
public abstract class iozdgvuglv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String[] f109443iobyxmoadg = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f109447zoijcleaow = {44100, 48000, 32000};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f109445ppxfxbqfkf = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f109446wkgbmnqykc = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f109441eablkybsjg = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int[] f109442gxszxtbevo = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int[] f109444lqeggnwhkg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f109448eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public int f109449gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f109450iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public int f109451lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f109452ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f109453wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public String f109454zoijcleaow;

        public iobyxmoadg() {
        }

        public boolean iobyxmoadg(int i13) {
            int i14;
            int i15;
            int i16;
            int i17;
            if (!iozdgvuglv.draadjrbmk(i13) || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0 || (i16 = (i13 >>> 12) & 15) == 0 || i16 == 15 || (i17 = (i13 >>> 10) & 3) == 3) {
                return false;
            }
            this.f109450iobyxmoadg = i14;
            this.f109454zoijcleaow = iozdgvuglv.f109443iobyxmoadg[3 - i15];
            int i18 = iozdgvuglv.f109447zoijcleaow[i17];
            this.f109453wkgbmnqykc = i18;
            if (i14 == 2) {
                this.f109453wkgbmnqykc = i18 / 2;
            } else if (i14 == 0) {
                this.f109453wkgbmnqykc = i18 / 4;
            }
            int i19 = (i13 >>> 9) & 1;
            this.f109451lqeggnwhkg = iozdgvuglv.gtknphoqwx(i14, i15);
            if (i15 == 3) {
                int i23 = i14 == 3 ? iozdgvuglv.f109445ppxfxbqfkf[i16 - 1] : iozdgvuglv.f109446wkgbmnqykc[i16 - 1];
                this.f109449gxszxtbevo = i23;
                this.f109452ppxfxbqfkf = (((i23 * 12) / this.f109453wkgbmnqykc) + i19) * 4;
            } else {
                if (i14 == 3) {
                    int i24 = i15 == 2 ? iozdgvuglv.f109441eablkybsjg[i16 - 1] : iozdgvuglv.f109442gxszxtbevo[i16 - 1];
                    this.f109449gxszxtbevo = i24;
                    this.f109452ppxfxbqfkf = ((i24 * 144) / this.f109453wkgbmnqykc) + i19;
                } else {
                    int i25 = iozdgvuglv.f109444lqeggnwhkg[i16 - 1];
                    this.f109449gxszxtbevo = i25;
                    this.f109452ppxfxbqfkf = (((i15 == 1 ? 72 : 144) * i25) / this.f109453wkgbmnqykc) + i19;
                }
            }
            this.f109448eablkybsjg = ((i13 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            this.f109450iobyxmoadg = iobyxmoadgVar.f109450iobyxmoadg;
            this.f109454zoijcleaow = iobyxmoadgVar.f109454zoijcleaow;
            this.f109452ppxfxbqfkf = iobyxmoadgVar.f109452ppxfxbqfkf;
            this.f109453wkgbmnqykc = iobyxmoadgVar.f109453wkgbmnqykc;
            this.f109448eablkybsjg = iobyxmoadgVar.f109448eablkybsjg;
            this.f109449gxszxtbevo = iobyxmoadgVar.f109449gxszxtbevo;
            this.f109451lqeggnwhkg = iobyxmoadgVar.f109451lqeggnwhkg;
        }
    }

    public static int btonecajqb(int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (!draadjrbmk(i13) || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0 || (i16 = (i13 >>> 12) & 15) == 0 || i16 == 15 || (i17 = (i13 >>> 10) & 3) == 3) {
            return -1;
        }
        int i19 = f109447zoijcleaow[i17];
        if (i14 == 2) {
            i19 /= 2;
        } else if (i14 == 0) {
            i19 /= 4;
        }
        int i23 = (i13 >>> 9) & 1;
        if (i15 == 3) {
            return ((((i14 == 3 ? f109445ppxfxbqfkf[i16 - 1] : f109446wkgbmnqykc[i16 - 1]) * 12) / i19) + i23) * 4;
        }
        if (i14 == 3) {
            i18 = i15 == 2 ? f109441eablkybsjg[i16 - 1] : f109442gxszxtbevo[i16 - 1];
        } else {
            i18 = f109444lqeggnwhkg[i16 - 1];
        }
        if (i14 == 3) {
            return ((i18 * 144) / i19) + i23;
        }
        return (((i15 == 1 ? 72 : 144) * i18) / i19) + i23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean draadjrbmk(int i13) {
        return (i13 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gtknphoqwx(int i13, int i14) {
        if (i14 == 1) {
            return i13 == 3 ? 1152 : 576;
        }
        if (i14 == 2) {
            return 1152;
        }
        if (i14 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static int wflxmlrfwp(int i13) {
        int i14;
        int i15;
        if (!draadjrbmk(i13) || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0) {
            return -1;
        }
        int i16 = (i13 >>> 12) & 15;
        int i17 = (i13 >>> 10) & 3;
        if (i16 == 0 || i16 == 15 || i17 == 3) {
            return -1;
        }
        return gtknphoqwx(i14, i15);
    }
}
