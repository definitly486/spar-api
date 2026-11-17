package fl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;
import rl.eablkybsjg;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f34303btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f34304dxjokdxxww;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final byte[] f34305gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final byte[] f34306lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final byte[] f34307nufgyqmvbu;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static final byte[] f34301gtknphoqwx = {13, 10};

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final byte[] f34300draadjrbmk = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final byte[] f34302wflxmlrfwp = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final byte[] f34299agtfadlqog = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public iobyxmoadg() {
        this(0);
    }

    @Override // fl.zoijcleaow
    protected boolean gtknphoqwx(byte b13) {
        if (b13 >= 0) {
            byte[] bArr = this.f34306lqeggnwhkg;
            if (b13 < bArr.length && bArr[b13] != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // fl.zoijcleaow
    void gxszxtbevo(byte[] bArr, int i13, int i14, zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.f34314gxszxtbevo) {
            return;
        }
        if (i14 >= 0) {
            int i15 = 0;
            while (i15 < i14) {
                byte[] bArrDxjokdxxww = dxjokdxxww(this.f34303btonecajqb, iobyxmoadgVar);
                int i16 = (iobyxmoadgVar.f34317nufgyqmvbu + 1) % 3;
                iobyxmoadgVar.f34317nufgyqmvbu = i16;
                int i17 = i13 + 1;
                int i18 = bArr[i13];
                if (i18 < 0) {
                    i18 += UserVerificationMethods.USER_VERIFY_HANDPRINT;
                }
                int i19 = (iobyxmoadgVar.f34315iobyxmoadg << 8) + i18;
                iobyxmoadgVar.f34315iobyxmoadg = i19;
                if (i16 == 0) {
                    int i23 = iobyxmoadgVar.f34319wkgbmnqykc;
                    int i24 = i23 + 1;
                    iobyxmoadgVar.f34319wkgbmnqykc = i24;
                    byte[] bArr2 = this.f34305gxszxtbevo;
                    bArrDxjokdxxww[i23] = bArr2[(i19 >> 18) & 63];
                    int i25 = i23 + 2;
                    iobyxmoadgVar.f34319wkgbmnqykc = i25;
                    bArrDxjokdxxww[i24] = bArr2[(i19 >> 12) & 63];
                    int i26 = i23 + 3;
                    iobyxmoadgVar.f34319wkgbmnqykc = i26;
                    bArrDxjokdxxww[i25] = bArr2[(i19 >> 6) & 63];
                    int i27 = i23 + 4;
                    iobyxmoadgVar.f34319wkgbmnqykc = i27;
                    bArrDxjokdxxww[i26] = bArr2[i19 & 63];
                    int i28 = iobyxmoadgVar.f34316lqeggnwhkg + 4;
                    iobyxmoadgVar.f34316lqeggnwhkg = i28;
                    int i29 = this.f34311wkgbmnqykc;
                    if (i29 > 0 && i29 <= i28) {
                        byte[] bArr3 = this.f34307nufgyqmvbu;
                        System.arraycopy(bArr3, 0, bArrDxjokdxxww, i27, bArr3.length);
                        iobyxmoadgVar.f34319wkgbmnqykc += this.f34307nufgyqmvbu.length;
                        iobyxmoadgVar.f34316lqeggnwhkg = 0;
                    }
                }
                i15++;
                i13 = i17;
            }
            return;
        }
        iobyxmoadgVar.f34314gxszxtbevo = true;
        if (iobyxmoadgVar.f34317nufgyqmvbu == 0 && this.f34311wkgbmnqykc == 0) {
            return;
        }
        byte[] bArrDxjokdxxww2 = dxjokdxxww(this.f34303btonecajqb, iobyxmoadgVar);
        int i33 = iobyxmoadgVar.f34319wkgbmnqykc;
        int i34 = iobyxmoadgVar.f34317nufgyqmvbu;
        if (i34 != 0) {
            if (i34 == 1) {
                int i35 = i33 + 1;
                iobyxmoadgVar.f34319wkgbmnqykc = i35;
                byte[] bArr4 = this.f34305gxszxtbevo;
                int i36 = iobyxmoadgVar.f34315iobyxmoadg;
                bArrDxjokdxxww2[i33] = bArr4[(i36 >> 2) & 63];
                int i37 = i33 + 2;
                iobyxmoadgVar.f34319wkgbmnqykc = i37;
                bArrDxjokdxxww2[i35] = bArr4[(i36 << 4) & 63];
                if (bArr4 == f34300draadjrbmk) {
                    int i38 = i33 + 3;
                    iobyxmoadgVar.f34319wkgbmnqykc = i38;
                    bArrDxjokdxxww2[i37] = 61;
                    iobyxmoadgVar.f34319wkgbmnqykc = i33 + 4;
                    bArrDxjokdxxww2[i38] = 61;
                }
            } else {
                if (i34 != 2) {
                    throw new IllegalStateException("Impossible modulus " + iobyxmoadgVar.f34317nufgyqmvbu);
                }
                int i39 = i33 + 1;
                iobyxmoadgVar.f34319wkgbmnqykc = i39;
                byte[] bArr5 = this.f34305gxszxtbevo;
                int i43 = iobyxmoadgVar.f34315iobyxmoadg;
                bArrDxjokdxxww2[i33] = bArr5[(i43 >> 10) & 63];
                int i44 = i33 + 2;
                iobyxmoadgVar.f34319wkgbmnqykc = i44;
                bArrDxjokdxxww2[i39] = bArr5[(i43 >> 4) & 63];
                int i45 = i33 + 3;
                iobyxmoadgVar.f34319wkgbmnqykc = i45;
                bArrDxjokdxxww2[i44] = bArr5[(i43 << 2) & 63];
                if (bArr5 == f34300draadjrbmk) {
                    iobyxmoadgVar.f34319wkgbmnqykc = i33 + 4;
                    bArrDxjokdxxww2[i45] = 61;
                }
            }
        }
        int i46 = iobyxmoadgVar.f34316lqeggnwhkg;
        int i47 = iobyxmoadgVar.f34319wkgbmnqykc;
        int i48 = i46 + (i47 - i33);
        iobyxmoadgVar.f34316lqeggnwhkg = i48;
        if (this.f34311wkgbmnqykc <= 0 || i48 <= 0) {
            return;
        }
        byte[] bArr6 = this.f34307nufgyqmvbu;
        System.arraycopy(bArr6, 0, bArrDxjokdxxww2, i47, bArr6.length);
        iobyxmoadgVar.f34319wkgbmnqykc += this.f34307nufgyqmvbu.length;
    }

    @Override // fl.zoijcleaow
    void ppxfxbqfkf(byte[] bArr, int i13, int i14, zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        byte b13;
        if (iobyxmoadgVar.f34314gxszxtbevo) {
            return;
        }
        if (i14 < 0) {
            iobyxmoadgVar.f34314gxszxtbevo = true;
        }
        int i15 = 0;
        while (i15 < i14) {
            byte[] bArrDxjokdxxww = dxjokdxxww(this.f34304dxjokdxxww, iobyxmoadgVar);
            int i16 = i13 + 1;
            byte b14 = bArr[i13];
            if (b14 == 61) {
                iobyxmoadgVar.f34314gxszxtbevo = true;
                break;
            }
            if (b14 >= 0) {
                byte[] bArr2 = f34299agtfadlqog;
                if (b14 < bArr2.length && (b13 = bArr2[b14]) >= 0) {
                    int i17 = (iobyxmoadgVar.f34317nufgyqmvbu + 1) % 4;
                    iobyxmoadgVar.f34317nufgyqmvbu = i17;
                    int i18 = (iobyxmoadgVar.f34315iobyxmoadg << 6) + b13;
                    iobyxmoadgVar.f34315iobyxmoadg = i18;
                    if (i17 == 0) {
                        int i19 = iobyxmoadgVar.f34319wkgbmnqykc;
                        int i23 = i19 + 1;
                        iobyxmoadgVar.f34319wkgbmnqykc = i23;
                        bArrDxjokdxxww[i19] = (byte) ((i18 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        int i24 = i19 + 2;
                        iobyxmoadgVar.f34319wkgbmnqykc = i24;
                        bArrDxjokdxxww[i23] = (byte) ((i18 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        iobyxmoadgVar.f34319wkgbmnqykc = i19 + 3;
                        bArrDxjokdxxww[i24] = (byte) (i18 & KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                }
            }
            i15++;
            i13 = i16;
        }
        if (!iobyxmoadgVar.f34314gxszxtbevo || iobyxmoadgVar.f34317nufgyqmvbu == 0) {
            return;
        }
        byte[] bArrDxjokdxxww2 = dxjokdxxww(this.f34304dxjokdxxww, iobyxmoadgVar);
        int i25 = iobyxmoadgVar.f34317nufgyqmvbu;
        if (i25 != 1) {
            if (i25 == 2) {
                int i26 = iobyxmoadgVar.f34315iobyxmoadg >> 4;
                iobyxmoadgVar.f34315iobyxmoadg = i26;
                int i27 = iobyxmoadgVar.f34319wkgbmnqykc;
                iobyxmoadgVar.f34319wkgbmnqykc = i27 + 1;
                bArrDxjokdxxww2[i27] = (byte) (i26 & KotlinVersion.MAX_COMPONENT_VALUE);
                return;
            }
            if (i25 != 3) {
                throw new IllegalStateException("Impossible modulus " + iobyxmoadgVar.f34317nufgyqmvbu);
            }
            int i28 = iobyxmoadgVar.f34315iobyxmoadg;
            int i29 = i28 >> 2;
            iobyxmoadgVar.f34315iobyxmoadg = i29;
            int i33 = iobyxmoadgVar.f34319wkgbmnqykc;
            int i34 = i33 + 1;
            iobyxmoadgVar.f34319wkgbmnqykc = i34;
            bArrDxjokdxxww2[i33] = (byte) ((i28 >> 10) & KotlinVersion.MAX_COMPONENT_VALUE);
            iobyxmoadgVar.f34319wkgbmnqykc = i33 + 2;
            bArrDxjokdxxww2[i34] = (byte) (i29 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    public iobyxmoadg(int i13) {
        this(i13, f34301gtknphoqwx);
    }

    public iobyxmoadg(int i13, byte[] bArr) {
        this(i13, bArr, false);
    }

    public iobyxmoadg(int i13, byte[] bArr, boolean z13) {
        super(3, 4, i13, bArr == null ? 0 : bArr.length);
        this.f34306lqeggnwhkg = f34299agtfadlqog;
        if (bArr != null) {
            if (zoijcleaow(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + eablkybsjg.gxszxtbevo(bArr) + "]");
            }
            if (i13 > 0) {
                this.f34303btonecajqb = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f34307nufgyqmvbu = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f34303btonecajqb = 4;
                this.f34307nufgyqmvbu = null;
            }
        } else {
            this.f34303btonecajqb = 4;
            this.f34307nufgyqmvbu = null;
        }
        this.f34304dxjokdxxww = this.f34303btonecajqb - 1;
        this.f34305gxszxtbevo = z13 ? f34302wflxmlrfwp : f34300draadjrbmk;
    }
}
