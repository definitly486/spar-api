package we;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f119429iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f119430ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final byte[] f119431wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f119432zoijcleaow;

    public eablkybsjg(CharSequence charSequence, int i13, int i14) {
        this.f119429iobyxmoadg = charSequence;
        this.f119430ppxfxbqfkf = i13;
        this.f119432zoijcleaow = i14;
        byte[] bArr = new byte[i13 * i14];
        this.f119431wkgbmnqykc = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void btonecajqb(int i13, int i14, int i15) {
        int i16 = i13 - 2;
        int i17 = i14 - 2;
        gxszxtbevo(i16, i17, i15, 1);
        int i18 = i14 - 1;
        gxszxtbevo(i16, i18, i15, 2);
        int i19 = i13 - 1;
        gxszxtbevo(i19, i17, i15, 3);
        gxszxtbevo(i19, i18, i15, 4);
        gxszxtbevo(i19, i14, i15, 5);
        gxszxtbevo(i13, i17, i15, 6);
        gxszxtbevo(i13, i18, i15, 7);
        gxszxtbevo(i13, i14, i15, 8);
    }

    private void dxjokdxxww(int i13, int i14, boolean z13) {
        this.f119431wkgbmnqykc[(i14 * this.f119430ppxfxbqfkf) + i13] = z13 ? (byte) 1 : (byte) 0;
    }

    private void gxszxtbevo(int i13, int i14, int i15, int i16) {
        if (i13 < 0) {
            int i17 = this.f119432zoijcleaow;
            i13 += i17;
            i14 += 4 - ((i17 + 4) % 8);
        }
        if (i14 < 0) {
            int i18 = this.f119430ppxfxbqfkf;
            i14 += i18;
            i13 += 4 - ((i18 + 4) % 8);
        }
        dxjokdxxww(i14, i13, (this.f119429iobyxmoadg.charAt(i15) & (1 << (8 - i16))) != 0);
    }

    private void iobyxmoadg(int i13) {
        gxszxtbevo(this.f119432zoijcleaow - 1, 0, i13, 1);
        gxszxtbevo(this.f119432zoijcleaow - 1, 1, i13, 2);
        gxszxtbevo(this.f119432zoijcleaow - 1, 2, i13, 3);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 2, i13, 4);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 1, i13, 5);
        gxszxtbevo(1, this.f119430ppxfxbqfkf - 1, i13, 6);
        gxszxtbevo(2, this.f119430ppxfxbqfkf - 1, i13, 7);
        gxszxtbevo(3, this.f119430ppxfxbqfkf - 1, i13, 8);
    }

    private boolean lqeggnwhkg(int i13, int i14) {
        return this.f119431wkgbmnqykc[(i14 * this.f119430ppxfxbqfkf) + i13] < 0;
    }

    private void ppxfxbqfkf(int i13) {
        gxszxtbevo(this.f119432zoijcleaow - 3, 0, i13, 1);
        gxszxtbevo(this.f119432zoijcleaow - 2, 0, i13, 2);
        gxszxtbevo(this.f119432zoijcleaow - 1, 0, i13, 3);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 2, i13, 4);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 1, i13, 5);
        gxszxtbevo(1, this.f119430ppxfxbqfkf - 1, i13, 6);
        gxszxtbevo(2, this.f119430ppxfxbqfkf - 1, i13, 7);
        gxszxtbevo(3, this.f119430ppxfxbqfkf - 1, i13, 8);
    }

    private void wkgbmnqykc(int i13) {
        gxszxtbevo(this.f119432zoijcleaow - 1, 0, i13, 1);
        gxszxtbevo(this.f119432zoijcleaow - 1, this.f119430ppxfxbqfkf - 1, i13, 2);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 3, i13, 3);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 2, i13, 4);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 1, i13, 5);
        gxszxtbevo(1, this.f119430ppxfxbqfkf - 3, i13, 6);
        gxszxtbevo(1, this.f119430ppxfxbqfkf - 2, i13, 7);
        gxszxtbevo(1, this.f119430ppxfxbqfkf - 1, i13, 8);
    }

    private void zoijcleaow(int i13) {
        gxszxtbevo(this.f119432zoijcleaow - 3, 0, i13, 1);
        gxszxtbevo(this.f119432zoijcleaow - 2, 0, i13, 2);
        gxszxtbevo(this.f119432zoijcleaow - 1, 0, i13, 3);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 4, i13, 4);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 3, i13, 5);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 2, i13, 6);
        gxszxtbevo(0, this.f119430ppxfxbqfkf - 1, i13, 7);
        gxszxtbevo(1, this.f119430ppxfxbqfkf - 1, i13, 8);
    }

    public final boolean eablkybsjg(int i13, int i14) {
        return this.f119431wkgbmnqykc[(i14 * this.f119430ppxfxbqfkf) + i13] == 1;
    }

    public final void nufgyqmvbu() {
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 0;
        int i17 = 4;
        while (true) {
            if (i17 == this.f119432zoijcleaow && i15 == 0) {
                iobyxmoadg(i16);
                i16++;
            }
            if (i17 == this.f119432zoijcleaow - 2 && i15 == 0 && this.f119430ppxfxbqfkf % 4 != 0) {
                zoijcleaow(i16);
                i16++;
            }
            if (i17 == this.f119432zoijcleaow - 2 && i15 == 0 && this.f119430ppxfxbqfkf % 8 == 4) {
                ppxfxbqfkf(i16);
                i16++;
            }
            if (i17 == this.f119432zoijcleaow + 4 && i15 == 2 && this.f119430ppxfxbqfkf % 8 == 0) {
                wkgbmnqykc(i16);
                i16++;
            }
            while (true) {
                if (i17 < this.f119432zoijcleaow && i15 >= 0 && lqeggnwhkg(i15, i17)) {
                    btonecajqb(i17, i15, i16);
                    i16++;
                }
                int i18 = i17 - 2;
                int i19 = i15 + 2;
                if (i18 < 0 || i19 >= this.f119430ppxfxbqfkf) {
                    break;
                }
                i17 = i18;
                i15 = i19;
            }
            int i23 = i17 - 1;
            int i24 = i15 + 5;
            while (true) {
                if (i23 >= 0 && i24 < this.f119430ppxfxbqfkf && lqeggnwhkg(i24, i23)) {
                    btonecajqb(i23, i24, i16);
                    i16++;
                }
                int i25 = i23 + 2;
                int i26 = i24 - 2;
                i13 = this.f119432zoijcleaow;
                if (i25 >= i13 || i26 < 0) {
                    break;
                }
                i23 = i25;
                i24 = i26;
            }
            i17 = i23 + 5;
            i15 = i24 - 1;
            if (i17 >= i13 && i15 >= (i14 = this.f119430ppxfxbqfkf)) {
                break;
            }
        }
        if (lqeggnwhkg(i14 - 1, i13 - 1)) {
            dxjokdxxww(this.f119430ppxfxbqfkf - 1, this.f119432zoijcleaow - 1, true);
            dxjokdxxww(this.f119430ppxfxbqfkf - 2, this.f119432zoijcleaow - 2, true);
        }
    }
}
