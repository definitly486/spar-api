package yzdjzghtvl;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f126921eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f126922iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int[] f126924wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long[] f126925zoijcleaow = nufgyqmvbu.zoijcleaow(16);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int[] f126923ppxfxbqfkf = new int[16];

    public gxszxtbevo() {
        int[] iArr = new int[16];
        int i13 = 0;
        while (i13 < 16) {
            int i14 = i13 + 1;
            iArr[i13] = i14;
            i13 = i14;
        }
        this.f126924wkgbmnqykc = iArr;
    }

    private final void dxjokdxxww(int i13, int i14) {
        long[] jArr = this.f126925zoijcleaow;
        int[] iArr = this.f126923ppxfxbqfkf;
        int[] iArr2 = this.f126924wkgbmnqykc;
        long j13 = jArr[i13];
        jArr[i13] = jArr[i14];
        jArr[i14] = j13;
        int i15 = iArr[i13];
        int i16 = iArr[i14];
        iArr[i13] = i16;
        iArr[i14] = i15;
        iArr2[i16] = i13;
        iArr2[i15] = i14;
    }

    private final void lqeggnwhkg(int i13) {
        long[] jArr = this.f126925zoijcleaow;
        int i14 = this.f126922iobyxmoadg >> 1;
        while (i13 < i14) {
            int i15 = (i13 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 >= this.f126922iobyxmoadg || kotlin.jvm.internal.zdlpuopuiu.wflxmlrfwp(jArr[i15], jArr[i16]) >= 0) {
                if (kotlin.jvm.internal.zdlpuopuiu.wflxmlrfwp(jArr[i16], jArr[i13]) >= 0) {
                    return;
                }
                dxjokdxxww(i16, i13);
                i13 = i16;
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.wflxmlrfwp(jArr[i15], jArr[i13]) >= 0) {
                    return;
                }
                dxjokdxxww(i15, i13);
                i13 = i15;
            }
        }
    }

    private final void nufgyqmvbu(int i13) {
        long[] jArr = this.f126925zoijcleaow;
        long j13 = jArr[i13];
        while (i13 > 0) {
            int i14 = ((i13 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.zdlpuopuiu.wflxmlrfwp(jArr[i14], j13) <= 0) {
                return;
            }
            dxjokdxxww(i14, i13);
            i13 = i14;
        }
    }

    private final void ppxfxbqfkf(int i13) {
        int length = this.f126925zoijcleaow.length;
        if (i13 <= length) {
            return;
        }
        int i14 = length * 2;
        long[] jArrZoijcleaow = nufgyqmvbu.zoijcleaow(i14);
        int[] iArr = new int[i14];
        hg.agtfadlqog.oxmwwwfdhm(this.f126925zoijcleaow, jArrZoijcleaow, 0, 0, 0, 12, null);
        hg.agtfadlqog.vdvldrhtss(this.f126923ppxfxbqfkf, iArr, 0, 0, 0, 14, null);
        this.f126925zoijcleaow = jArrZoijcleaow;
        this.f126923ppxfxbqfkf = iArr;
    }

    private final void wkgbmnqykc(int i13) {
        this.f126924wkgbmnqykc[i13] = this.f126921eablkybsjg;
        this.f126921eablkybsjg = i13;
    }

    private final int zoijcleaow() {
        int length = this.f126924wkgbmnqykc.length;
        if (this.f126921eablkybsjg >= length) {
            int i13 = length * 2;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr[i14] = i15;
                i14 = i15;
            }
            hg.agtfadlqog.vdvldrhtss(this.f126924wkgbmnqykc, iArr, 0, 0, 0, 14, null);
            this.f126924wkgbmnqykc = iArr;
        }
        int i16 = this.f126921eablkybsjg;
        this.f126921eablkybsjg = this.f126924wkgbmnqykc[i16];
        return i16;
    }

    public final long eablkybsjg(long j13) {
        return this.f126922iobyxmoadg > 0 ? this.f126925zoijcleaow[0] : j13;
    }

    public final void gxszxtbevo(int i13) {
        int i14 = this.f126924wkgbmnqykc[i13];
        dxjokdxxww(i14, this.f126922iobyxmoadg - 1);
        this.f126922iobyxmoadg--;
        nufgyqmvbu(i14);
        lqeggnwhkg(i14);
        wkgbmnqykc(i13);
    }

    public final int iobyxmoadg(long j13) {
        ppxfxbqfkf(this.f126922iobyxmoadg + 1);
        int i13 = this.f126922iobyxmoadg;
        this.f126922iobyxmoadg = i13 + 1;
        int iZoijcleaow = zoijcleaow();
        this.f126925zoijcleaow[i13] = j13;
        this.f126923ppxfxbqfkf[i13] = iZoijcleaow;
        this.f126924wkgbmnqykc[iZoijcleaow] = i13;
        nufgyqmvbu(i13);
        return iZoijcleaow;
    }
}
