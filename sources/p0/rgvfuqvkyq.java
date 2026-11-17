package p0;

/* JADX INFO: loaded from: classes.dex */
final class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f75276iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f75277ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f75278wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private char[] f75279zoijcleaow;

    public rgvfuqvkyq(char[] cArr, int i13, int i14) {
        this.f75276iobyxmoadg = cArr.length;
        this.f75279zoijcleaow = cArr;
        this.f75277ppxfxbqfkf = i13;
        this.f75278wkgbmnqykc = i14;
    }

    private final void gxszxtbevo(int i13) {
        if (i13 <= ppxfxbqfkf()) {
            return;
        }
        int iPpxfxbqfkf = i13 - ppxfxbqfkf();
        int i14 = this.f75276iobyxmoadg;
        do {
            i14 *= 2;
        } while (i14 - this.f75276iobyxmoadg < iPpxfxbqfkf);
        char[] cArr = new char[i14];
        hg.agtfadlqog.btonecajqb(this.f75279zoijcleaow, cArr, 0, 0, this.f75277ppxfxbqfkf);
        int i15 = this.f75276iobyxmoadg;
        int i16 = this.f75278wkgbmnqykc;
        int i17 = i15 - i16;
        int i18 = i14 - i17;
        hg.agtfadlqog.btonecajqb(this.f75279zoijcleaow, cArr, i18, i16, i17 + i16);
        this.f75279zoijcleaow = cArr;
        this.f75276iobyxmoadg = i14;
        this.f75278wkgbmnqykc = i18;
    }

    private final int ppxfxbqfkf() {
        return this.f75278wkgbmnqykc - this.f75277ppxfxbqfkf;
    }

    private final void zoijcleaow(int i13, int i14) {
        int i15 = this.f75277ppxfxbqfkf;
        if (i13 < i15 && i14 <= i15) {
            int i16 = i15 - i14;
            char[] cArr = this.f75279zoijcleaow;
            hg.agtfadlqog.btonecajqb(cArr, cArr, this.f75278wkgbmnqykc - i16, i14, i15);
            this.f75277ppxfxbqfkf = i13;
            this.f75278wkgbmnqykc -= i16;
            return;
        }
        if (i13 < i15 && i14 >= i15) {
            this.f75278wkgbmnqykc = i14 + ppxfxbqfkf();
            this.f75277ppxfxbqfkf = i13;
            return;
        }
        int iPpxfxbqfkf = i13 + ppxfxbqfkf();
        int iPpxfxbqfkf2 = i14 + ppxfxbqfkf();
        int i17 = this.f75278wkgbmnqykc;
        char[] cArr2 = this.f75279zoijcleaow;
        hg.agtfadlqog.btonecajqb(cArr2, cArr2, this.f75277ppxfxbqfkf, i17, iPpxfxbqfkf);
        this.f75277ppxfxbqfkf += iPpxfxbqfkf - i17;
        this.f75278wkgbmnqykc = iPpxfxbqfkf2;
    }

    public final int eablkybsjg() {
        return this.f75276iobyxmoadg - ppxfxbqfkf();
    }

    public final void iobyxmoadg(StringBuilder sb3) {
        sb3.append(this.f75279zoijcleaow, 0, this.f75277ppxfxbqfkf);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
        char[] cArr = this.f75279zoijcleaow;
        int i13 = this.f75278wkgbmnqykc;
        sb3.append(cArr, i13, this.f75276iobyxmoadg - i13);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
    }

    public final void lqeggnwhkg(int i13, int i14, String str) {
        gxszxtbevo(str.length() - (i14 - i13));
        zoijcleaow(i13, i14);
        vdvldrhtss.zoijcleaow(str, this.f75279zoijcleaow, this.f75277ppxfxbqfkf);
        this.f75277ppxfxbqfkf += str.length();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) sb3);
        return sb3.toString();
    }

    public final char wkgbmnqykc(int i13) {
        int i14 = this.f75277ppxfxbqfkf;
        return i13 < i14 ? this.f75279zoijcleaow[i13] : this.f75279zoijcleaow[(i13 - i14) + this.f75278wkgbmnqykc];
    }
}
