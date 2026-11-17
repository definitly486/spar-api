package hk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class cqumvgiudr implements ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private char[] f40487iobyxmoadg = eablkybsjg.f40490ppxfxbqfkf.wkgbmnqykc();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f40488zoijcleaow;

    private final void eablkybsjg(int i13, int i14, String str) {
        byte b13;
        int length = str.length();
        while (i13 < length) {
            int iLqeggnwhkg = lqeggnwhkg(i14, 2);
            char cCharAt = str.charAt(i13);
            if (cCharAt >= hcddaimhww.iobyxmoadg().length || (b13 = hcddaimhww.iobyxmoadg()[cCharAt]) == 0) {
                int i15 = iLqeggnwhkg + 1;
                this.f40487iobyxmoadg[iLqeggnwhkg] = cCharAt;
                i14 = i15;
            } else if (b13 == 1) {
                String str2 = hcddaimhww.zoijcleaow()[cCharAt];
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str2);
                int iLqeggnwhkg2 = lqeggnwhkg(iLqeggnwhkg, str2.length());
                str2.getChars(0, str2.length(), this.f40487iobyxmoadg, iLqeggnwhkg2);
                i14 = iLqeggnwhkg2 + str2.length();
                this.f40488zoijcleaow = i14;
            } else {
                char[] cArr = this.f40487iobyxmoadg;
                cArr[iLqeggnwhkg] = '\\';
                cArr[iLqeggnwhkg + 1] = (char) b13;
                i14 = iLqeggnwhkg + 2;
                this.f40488zoijcleaow = i14;
            }
            i13++;
        }
        int iLqeggnwhkg3 = lqeggnwhkg(i14, 1);
        this.f40487iobyxmoadg[iLqeggnwhkg3] = '\"';
        this.f40488zoijcleaow = iLqeggnwhkg3 + 1;
    }

    private final void gxszxtbevo(int i13) {
        lqeggnwhkg(this.f40488zoijcleaow, i13);
    }

    private final int lqeggnwhkg(int i13, int i14) {
        int i15 = i14 + i13;
        char[] cArr = this.f40487iobyxmoadg;
        if (cArr.length <= i15) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, zg.gtknphoqwx.gxszxtbevo(i15, i13 * 2));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cArrCopyOf, "copyOf(...)");
            this.f40487iobyxmoadg = cArrCopyOf;
        }
        return i13;
    }

    @Override // hk.ojitshcjhn
    public void iobyxmoadg(char c13) {
        gxszxtbevo(1);
        char[] cArr = this.f40487iobyxmoadg;
        int i13 = this.f40488zoijcleaow;
        this.f40488zoijcleaow = i13 + 1;
        cArr[i13] = c13;
    }

    public void nufgyqmvbu() {
        eablkybsjg.f40490ppxfxbqfkf.ppxfxbqfkf(this.f40487iobyxmoadg);
    }

    @Override // hk.ojitshcjhn
    public void ppxfxbqfkf(long j13) {
        wkgbmnqykc(String.valueOf(j13));
    }

    public String toString() {
        return new String(this.f40487iobyxmoadg, 0, this.f40488zoijcleaow);
    }

    @Override // hk.ojitshcjhn
    public void wkgbmnqykc(String text) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        gxszxtbevo(length);
        text.getChars(0, text.length(), this.f40487iobyxmoadg, this.f40488zoijcleaow);
        this.f40488zoijcleaow += length;
    }

    @Override // hk.ojitshcjhn
    public void zoijcleaow(String text) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        gxszxtbevo(text.length() + 2);
        char[] cArr = this.f40487iobyxmoadg;
        int i13 = this.f40488zoijcleaow;
        int i14 = i13 + 1;
        cArr[i13] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i14);
        int i15 = length + i14;
        for (int i16 = i14; i16 < i15; i16++) {
            char c13 = cArr[i16];
            if (c13 < hcddaimhww.iobyxmoadg().length && hcddaimhww.iobyxmoadg()[c13] != 0) {
                eablkybsjg(i16 - i14, i16, text);
                return;
            }
        }
        cArr[i15] = '\"';
        this.f40488zoijcleaow = i15 + 1;
    }
}
