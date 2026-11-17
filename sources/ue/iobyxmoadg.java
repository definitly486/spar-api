package ue;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public static final iobyxmoadg f113491agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final iobyxmoadg f113492btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final iobyxmoadg f113493draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final iobyxmoadg f113495gtknphoqwx;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public static final iobyxmoadg f113497ojitshcjhn;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final iobyxmoadg f113498wflxmlrfwp;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f113499eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f113500gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int[] f113501iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f113502lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f113503ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f113504wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f113505zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final iobyxmoadg f113496nufgyqmvbu = new iobyxmoadg(4201, 4096, 1);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final iobyxmoadg f113494dxjokdxxww = new iobyxmoadg(1033, UserVerificationMethods.USER_VERIFY_ALL, 1);

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(67, 64, 1);
        f113492btonecajqb = iobyxmoadgVar;
        f113495gtknphoqwx = new iobyxmoadg(19, 16, 1);
        f113493draadjrbmk = new iobyxmoadg(285, UserVerificationMethods.USER_VERIFY_HANDPRINT, 0);
        iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(301, UserVerificationMethods.USER_VERIFY_HANDPRINT, 1);
        f113498wflxmlrfwp = iobyxmoadgVar2;
        f113491agtfadlqog = iobyxmoadgVar2;
        f113497ojitshcjhn = iobyxmoadgVar;
    }

    public iobyxmoadg(int i13, int i14, int i15) {
        this.f113500gxszxtbevo = i13;
        this.f113499eablkybsjg = i14;
        this.f113502lqeggnwhkg = i15;
        this.f113501iobyxmoadg = new int[i14];
        this.f113505zoijcleaow = new int[i14];
        int i16 = 1;
        for (int i17 = 0; i17 < i14; i17++) {
            this.f113501iobyxmoadg[i17] = i16;
            i16 <<= 1;
            if (i16 >= i14) {
                i16 = (i16 ^ i13) & (i14 - 1);
            }
        }
        for (int i18 = 0; i18 < i14 - 1; i18++) {
            this.f113505zoijcleaow[this.f113501iobyxmoadg[i18]] = i18;
        }
        this.f113503ppxfxbqfkf = new zoijcleaow(this, new int[]{0});
        this.f113504wkgbmnqykc = new zoijcleaow(this, new int[]{1});
    }

    static int iobyxmoadg(int i13, int i14) {
        return i13 ^ i14;
    }

    zoijcleaow eablkybsjg() {
        return this.f113503ppxfxbqfkf;
    }

    int gxszxtbevo(int i13) {
        if (i13 != 0) {
            return this.f113501iobyxmoadg[(this.f113499eablkybsjg - this.f113505zoijcleaow[i13]) - 1];
        }
        throw new ArithmeticException();
    }

    int lqeggnwhkg(int i13) {
        if (i13 != 0) {
            return this.f113505zoijcleaow[i13];
        }
        throw new IllegalArgumentException();
    }

    int nufgyqmvbu(int i13, int i14) {
        if (i13 == 0 || i14 == 0) {
            return 0;
        }
        int[] iArr = this.f113501iobyxmoadg;
        int[] iArr2 = this.f113505zoijcleaow;
        return iArr[(iArr2[i13] + iArr2[i14]) % (this.f113499eablkybsjg - 1)];
    }

    int ppxfxbqfkf(int i13) {
        return this.f113501iobyxmoadg[i13];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f113500gxszxtbevo) + ',' + this.f113499eablkybsjg + ')';
    }

    public int wkgbmnqykc() {
        return this.f113502lqeggnwhkg;
    }

    zoijcleaow zoijcleaow(int i13, int i14) {
        if (i13 < 0) {
            throw new IllegalArgumentException();
        }
        if (i14 == 0) {
            return this.f113503ppxfxbqfkf;
        }
        int[] iArr = new int[i13 + 1];
        iArr[0] = i14;
        return new zoijcleaow(this, iArr);
    }
}
