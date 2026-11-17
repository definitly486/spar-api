package z2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private byte[] f127703iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f127704ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f127705wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f127706zoijcleaow;

    public nufgyqmvbu(byte[] bArr, int i13, int i14) {
        btonecajqb(bArr, i13, i14);
    }

    private boolean gtknphoqwx(int i13) {
        if (2 <= i13 && i13 < this.f127706zoijcleaow) {
            byte[] bArr = this.f127703iobyxmoadg;
            if (bArr[i13] == 3 && bArr[i13 - 2] == 0 && bArr[i13 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    private void iobyxmoadg() {
        int i13;
        int i14 = this.f127704ppxfxbqfkf;
        y2.iobyxmoadg.lqeggnwhkg(i14 >= 0 && (i14 < (i13 = this.f127706zoijcleaow) || (i14 == i13 && this.f127705wkgbmnqykc == 0)));
    }

    private int lqeggnwhkg() {
        int i13 = 0;
        while (!eablkybsjg()) {
            i13++;
        }
        return ((1 << i13) - 1) + (i13 > 0 ? gxszxtbevo(i13) : 0);
    }

    public void btonecajqb(byte[] bArr, int i13, int i14) {
        this.f127703iobyxmoadg = bArr;
        this.f127704ppxfxbqfkf = i13;
        this.f127706zoijcleaow = i14;
        this.f127705wkgbmnqykc = 0;
        iobyxmoadg();
    }

    public void draadjrbmk() {
        int i13 = this.f127705wkgbmnqykc + 1;
        this.f127705wkgbmnqykc = i13;
        if (i13 == 8) {
            this.f127705wkgbmnqykc = 0;
            int i14 = this.f127704ppxfxbqfkf;
            this.f127704ppxfxbqfkf = i14 + (gtknphoqwx(i14 + 1) ? 2 : 1);
        }
        iobyxmoadg();
    }

    public int dxjokdxxww() {
        return lqeggnwhkg();
    }

    public boolean eablkybsjg() {
        boolean z13 = (this.f127703iobyxmoadg[this.f127704ppxfxbqfkf] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.f127705wkgbmnqykc)) != 0;
        draadjrbmk();
        return z13;
    }

    public int gxszxtbevo(int i13) {
        int i14;
        this.f127705wkgbmnqykc += i13;
        int i15 = 0;
        while (true) {
            i14 = this.f127705wkgbmnqykc;
            int i16 = 2;
            if (i14 <= 8) {
                break;
            }
            int i17 = i14 - 8;
            this.f127705wkgbmnqykc = i17;
            byte[] bArr = this.f127703iobyxmoadg;
            int i18 = this.f127704ppxfxbqfkf;
            i15 |= (bArr[i18] & 255) << i17;
            if (!gtknphoqwx(i18 + 1)) {
                i16 = 1;
            }
            this.f127704ppxfxbqfkf = i18 + i16;
        }
        byte[] bArr2 = this.f127703iobyxmoadg;
        int i19 = this.f127704ppxfxbqfkf;
        int i23 = ((-1) >>> (32 - i13)) & (i15 | ((bArr2[i19] & 255) >> (8 - i14)));
        if (i14 == 8) {
            this.f127705wkgbmnqykc = 0;
            this.f127704ppxfxbqfkf = i19 + (gtknphoqwx(i19 + 1) ? 2 : 1);
        }
        iobyxmoadg();
        return i23;
    }

    public int nufgyqmvbu() {
        int iLqeggnwhkg = lqeggnwhkg();
        return (iLqeggnwhkg % 2 == 0 ? -1 : 1) * ((iLqeggnwhkg + 1) / 2);
    }

    public boolean ppxfxbqfkf(int i13) {
        int i14 = this.f127704ppxfxbqfkf;
        int i15 = i13 / 8;
        int i16 = i14 + i15;
        int i17 = (this.f127705wkgbmnqykc + i13) - (i15 * 8);
        if (i17 > 7) {
            i16++;
            i17 -= 8;
        }
        while (true) {
            i14++;
            if (i14 > i16 || i16 >= this.f127706zoijcleaow) {
                break;
            }
            if (gtknphoqwx(i14)) {
                i16++;
                i14 += 2;
            }
        }
        int i18 = this.f127706zoijcleaow;
        if (i16 >= i18) {
            return i16 == i18 && i17 == 0;
        }
        return true;
    }

    public void wflxmlrfwp(int i13) {
        int i14 = this.f127704ppxfxbqfkf;
        int i15 = i13 / 8;
        int i16 = i14 + i15;
        this.f127704ppxfxbqfkf = i16;
        int i17 = this.f127705wkgbmnqykc + (i13 - (i15 * 8));
        this.f127705wkgbmnqykc = i17;
        if (i17 > 7) {
            this.f127704ppxfxbqfkf = i16 + 1;
            this.f127705wkgbmnqykc = i17 - 8;
        }
        while (true) {
            i14++;
            if (i14 > this.f127704ppxfxbqfkf) {
                iobyxmoadg();
                return;
            } else if (gtknphoqwx(i14)) {
                this.f127704ppxfxbqfkf++;
                i14 += 2;
            }
        }
    }

    public boolean wkgbmnqykc() {
        int i13 = this.f127704ppxfxbqfkf;
        int i14 = this.f127705wkgbmnqykc;
        int i15 = 0;
        while (this.f127704ppxfxbqfkf < this.f127706zoijcleaow && !eablkybsjg()) {
            i15++;
        }
        boolean z13 = this.f127704ppxfxbqfkf == this.f127706zoijcleaow;
        this.f127704ppxfxbqfkf = i13;
        this.f127705wkgbmnqykc = i14;
        return !z13 && ppxfxbqfkf((i15 * 2) + 1);
    }

    public void zoijcleaow() {
        int i13 = this.f127705wkgbmnqykc;
        if (i13 > 0) {
            wflxmlrfwp(8 - i13);
        }
    }
}
