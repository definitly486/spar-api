package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final iobyxmoadg f34159eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final long[] f34160gxszxtbevo = new long[0];

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dk.gxszxtbevo f34161iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f34162ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long[] f34163wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.rgvfuqvkyq f34164zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public iwizpuwonk(dk.gxszxtbevo descriptor, tg.rgvfuqvkyq readIfAbsent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(readIfAbsent, "readIfAbsent");
        this.f34161iobyxmoadg = descriptor;
        this.f34164zoijcleaow = readIfAbsent;
        int iWkgbmnqykc = descriptor.wkgbmnqykc();
        if (iWkgbmnqykc <= 64) {
            this.f34162ppxfxbqfkf = iWkgbmnqykc != 64 ? (-1) << iWkgbmnqykc : 0L;
            this.f34163wkgbmnqykc = f34160gxszxtbevo;
        } else {
            this.f34162ppxfxbqfkf = 0L;
            this.f34163wkgbmnqykc = eablkybsjg(iWkgbmnqykc);
        }
    }

    private final long[] eablkybsjg(int i13) {
        long[] jArr = new long[(i13 - 1) >>> 6];
        if ((i13 & 63) != 0) {
            jArr[hg.agtfadlqog.bfopjjpdmp(jArr)] = (-1) << i13;
        }
        return jArr;
    }

    private final int ppxfxbqfkf() {
        int length = this.f34163wkgbmnqykc.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = i13 + 1;
            int i15 = i14 * 64;
            long j13 = this.f34163wkgbmnqykc[i13];
            while (j13 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j13);
                j13 |= 1 << iNumberOfTrailingZeros;
                int i16 = iNumberOfTrailingZeros + i15;
                if (((Boolean) this.f34164zoijcleaow.invoke(this.f34161iobyxmoadg, Integer.valueOf(i16))).booleanValue()) {
                    this.f34163wkgbmnqykc[i13] = j13;
                    return i16;
                }
            }
            this.f34163wkgbmnqykc[i13] = j13;
            i13 = i14;
        }
        return -1;
    }

    private final void zoijcleaow(int i13) {
        int i14 = (i13 >>> 6) - 1;
        long[] jArr = this.f34163wkgbmnqykc;
        jArr[i14] = jArr[i14] | (1 << (i13 & 63));
    }

    public final void iobyxmoadg(int i13) {
        if (i13 < 64) {
            this.f34162ppxfxbqfkf |= 1 << i13;
        } else {
            zoijcleaow(i13);
        }
    }

    public final int wkgbmnqykc() {
        int iNumberOfTrailingZeros;
        int iWkgbmnqykc = this.f34161iobyxmoadg.wkgbmnqykc();
        do {
            long j13 = this.f34162ppxfxbqfkf;
            if (j13 == -1) {
                if (iWkgbmnqykc > 64) {
                    return ppxfxbqfkf();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j13);
            this.f34162ppxfxbqfkf |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f34164zoijcleaow.invoke(this.f34161iobyxmoadg, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
