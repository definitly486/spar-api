package nj;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements Comparable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f70174zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C1516iobyxmoadg f70173yggfygwlhe = new C1516iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final long f70172jyumaefscl = dxjokdxxww(0);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final long f70171iwizpuwonk = ppxfxbqfkf.btonecajqb(4611686018427387903L);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final long f70170cqumvgiudr = ppxfxbqfkf.btonecajqb(-4611686018427387903L);

    /* JADX INFO: renamed from: nj.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1516iobyxmoadg {
        public /* synthetic */ C1516iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return iobyxmoadg.f70171iwizpuwonk;
        }

        public final long ppxfxbqfkf() {
            return iobyxmoadg.f70172jyumaefscl;
        }

        public final long wkgbmnqykc(String value) {
            zdlpuopuiu.btonecajqb(value, "value");
            try {
                return ppxfxbqfkf.rgvfuqvkyq(value, true);
            } catch (IllegalArgumentException e13) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e13);
            }
        }

        public final long zoijcleaow() {
            return iobyxmoadg.f70170cqumvgiudr;
        }

        private C1516iobyxmoadg() {
        }
    }

    private /* synthetic */ iobyxmoadg(long j13) {
        this.f70174zdlpuopuiu = j13;
    }

    public static final long agtfadlqog(long j13) {
        return wwaezpbzkn(j13, wkgbmnqykc.HOURS);
    }

    public static boolean btonecajqb(long j13, Object obj) {
        return (obj instanceof iobyxmoadg) && j13 == ((iobyxmoadg) obj).hcddaimhww();
    }

    public static final boolean cdpycssgdh(long j13) {
        return j13 < 0;
    }

    private static final long cqumvgiudr(long j13) {
        return j13 >> 1;
    }

    public static final int draadjrbmk(long j13) {
        if (istkbnxepw(j13)) {
            return 0;
        }
        return (int) (agtfadlqog(j13) % ((long) 24));
    }

    public static long dxjokdxxww(long j13) {
        if (zoijcleaow.iobyxmoadg()) {
            if (zynmafqrjb(j13)) {
                long jCqumvgiudr = cqumvgiudr(j13);
                if (-4611686018426999999L > jCqumvgiudr || jCqumvgiudr >= 4611686018427000000L) {
                    throw new AssertionError(cqumvgiudr(j13) + " ns is out of nanoseconds range");
                }
            } else {
                long jCqumvgiudr2 = cqumvgiudr(j13);
                if (-4611686018427387903L > jCqumvgiudr2 || jCqumvgiudr2 >= 4611686018427387904L) {
                    throw new AssertionError(cqumvgiudr(j13) + " ms is out of milliseconds range");
                }
                long jCqumvgiudr3 = cqumvgiudr(j13);
                if (-4611686018426L <= jCqumvgiudr3 && jCqumvgiudr3 < 4611686018427L) {
                    throw new AssertionError(cqumvgiudr(j13) + " ms is denormalized");
                }
            }
        }
        return j13;
    }

    private static final void eablkybsjg(long j13, StringBuilder sb3, int i13, int i14, int i15, String str, boolean z13) {
        sb3.append(i13);
        if (i14 != 0) {
            sb3.append('.');
            String strTbqsvytpvh = kcexrzcfyt.tbqsvytpvh(String.valueOf(i14), i15, '0');
            int i16 = -1;
            int length = strTbqsvytpvh.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i17 = length - 1;
                    if (strTbqsvytpvh.charAt(length) != '0') {
                        i16 = length;
                        break;
                    } else if (i17 < 0) {
                        break;
                    } else {
                        length = i17;
                    }
                }
            }
            int i18 = i16 + 1;
            if (z13 || i18 >= 3) {
                sb3.append((CharSequence) strTbqsvytpvh, 0, ((i16 + 3) / 3) * 3);
                zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
            } else {
                sb3.append((CharSequence) strTbqsvytpvh, 0, i18);
                zdlpuopuiu.dxjokdxxww(sb3, "append(...)");
            }
        }
        sb3.append(str);
    }

    public static int esjtqupxsv(long j13) {
        return Long.hashCode(j13);
    }

    public static final long gtknphoqwx(long j13) {
        return cdpycssgdh(j13) ? pkzmftpjix(j13) : j13;
    }

    public static final /* synthetic */ iobyxmoadg gxszxtbevo(long j13) {
        return new iobyxmoadg(j13);
    }

    public static final long iozdgvuglv(long j13, long j14) {
        if (istkbnxepw(j13)) {
            if (lereixgezr(j14) || (j14 ^ j13) >= 0) {
                return j13;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (istkbnxepw(j14)) {
            return j14;
        }
        if ((((int) j13) & 1) != (((int) j14) & 1)) {
            return pmvmpeiblj(j13) ? wkgbmnqykc(j13, cqumvgiudr(j13), cqumvgiudr(j14)) : wkgbmnqykc(j13, cqumvgiudr(j14), cqumvgiudr(j13));
        }
        long jCqumvgiudr = cqumvgiudr(j13) + cqumvgiudr(j14);
        return zynmafqrjb(j13) ? ppxfxbqfkf.wflxmlrfwp(jCqumvgiudr) : ppxfxbqfkf.gtknphoqwx(jCqumvgiudr);
    }

    public static final boolean istkbnxepw(long j13) {
        return j13 == f70171iwizpuwonk || j13 == f70170cqumvgiudr;
    }

    private static final wkgbmnqykc iwizpuwonk(long j13) {
        return zynmafqrjb(j13) ? wkgbmnqykc.NANOSECONDS : wkgbmnqykc.MILLISECONDS;
    }

    public static final int jyumaefscl(long j13) {
        if (istkbnxepw(j13)) {
            return 0;
        }
        return (int) (oxmwwwfdhm(j13) % ((long) 60));
    }

    public static final int kcexrzcfyt(long j13) {
        if (istkbnxepw(j13)) {
            return 0;
        }
        return (int) (rgvfuqvkyq(j13) % ((long) 60));
    }

    public static final boolean lereixgezr(long j13) {
        return !istkbnxepw(j13);
    }

    public static final String lmojexxdyd(long j13) {
        StringBuilder sb3 = new StringBuilder();
        if (cdpycssgdh(j13)) {
            sb3.append('-');
        }
        sb3.append("PT");
        long jGtknphoqwx = gtknphoqwx(j13);
        long jAgtfadlqog = agtfadlqog(jGtknphoqwx);
        int iKcexrzcfyt = kcexrzcfyt(jGtknphoqwx);
        int iJyumaefscl = jyumaefscl(jGtknphoqwx);
        int iZdlpuopuiu = zdlpuopuiu(jGtknphoqwx);
        if (istkbnxepw(j13)) {
            jAgtfadlqog = 9999999999999L;
        }
        boolean z13 = false;
        boolean z14 = jAgtfadlqog != 0;
        boolean z15 = (iJyumaefscl == 0 && iZdlpuopuiu == 0) ? false : true;
        if (iKcexrzcfyt != 0 || (z15 && z14)) {
            z13 = true;
        }
        if (z14) {
            sb3.append(jAgtfadlqog);
            sb3.append('H');
        }
        if (z13) {
            sb3.append(iKcexrzcfyt);
            sb3.append('M');
        }
        if (z15 || (!z14 && !z13)) {
            eablkybsjg(j13, sb3, iJyumaefscl, iZdlpuopuiu, 9, "S", true);
        }
        return sb3.toString();
    }

    public static int nufgyqmvbu(long j13, long j14) {
        long j15 = j13 ^ j14;
        if (j15 < 0 || (((int) j15) & 1) == 0) {
            return zdlpuopuiu.wflxmlrfwp(j13, j14);
        }
        int i13 = (((int) j13) & 1) - (((int) j14) & 1);
        return cdpycssgdh(j13) ? -i13 : i13;
    }

    public static final long ojitshcjhn(long j13) {
        return (pmvmpeiblj(j13) && lereixgezr(j13)) ? cqumvgiudr(j13) : wwaezpbzkn(j13, wkgbmnqykc.MILLISECONDS);
    }

    public static final long oxmwwwfdhm(long j13) {
        return wwaezpbzkn(j13, wkgbmnqykc.SECONDS);
    }

    public static final long pkzmftpjix(long j13) {
        return ppxfxbqfkf.dxjokdxxww(-cqumvgiudr(j13), ((int) j13) & 1);
    }

    private static final boolean pmvmpeiblj(long j13) {
        return (((int) j13) & 1) == 1;
    }

    public static final long rgvfuqvkyq(long j13) {
        return wwaezpbzkn(j13, wkgbmnqykc.MINUTES);
    }

    public static final long vdvldrhtss(long j13) {
        long jCqumvgiudr = cqumvgiudr(j13);
        if (zynmafqrjb(j13)) {
            return jCqumvgiudr;
        }
        if (jCqumvgiudr > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jCqumvgiudr < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return ppxfxbqfkf.agtfadlqog(jCqumvgiudr);
    }

    public static final long wflxmlrfwp(long j13) {
        return wwaezpbzkn(j13, wkgbmnqykc.DAYS);
    }

    private static final long wkgbmnqykc(long j13, long j14, long j15) {
        long jOjitshcjhn = ppxfxbqfkf.ojitshcjhn(j15);
        long j16 = j14 + jOjitshcjhn;
        if (-4611686018426L > j16 || j16 >= 4611686018427L) {
            return ppxfxbqfkf.btonecajqb(zg.gtknphoqwx.ojitshcjhn(j16, -4611686018427387903L, 4611686018427387903L));
        }
        return ppxfxbqfkf.draadjrbmk(ppxfxbqfkf.agtfadlqog(j16) + (j15 - ppxfxbqfkf.agtfadlqog(jOjitshcjhn)));
    }

    public static final long wwaezpbzkn(long j13, wkgbmnqykc unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        if (j13 == f70171iwizpuwonk) {
            return Long.MAX_VALUE;
        }
        if (j13 == f70170cqumvgiudr) {
            return Long.MIN_VALUE;
        }
        return eablkybsjg.zoijcleaow(cqumvgiudr(j13), iwizpuwonk(j13), unit);
    }

    public static final boolean yadqdtsiqt(long j13) {
        return j13 > 0;
    }

    public static String ylkuphrtab(long j13) {
        if (j13 == 0) {
            return "0s";
        }
        if (j13 == f70171iwizpuwonk) {
            return "Infinity";
        }
        if (j13 == f70170cqumvgiudr) {
            return "-Infinity";
        }
        boolean zCdpycssgdh = cdpycssgdh(j13);
        StringBuilder sb3 = new StringBuilder();
        if (zCdpycssgdh) {
            sb3.append('-');
        }
        long jGtknphoqwx = gtknphoqwx(j13);
        long jWflxmlrfwp = wflxmlrfwp(jGtknphoqwx);
        int iDraadjrbmk = draadjrbmk(jGtknphoqwx);
        int iKcexrzcfyt = kcexrzcfyt(jGtknphoqwx);
        int iJyumaefscl = jyumaefscl(jGtknphoqwx);
        int iZdlpuopuiu = zdlpuopuiu(jGtknphoqwx);
        int i13 = 0;
        boolean z13 = jWflxmlrfwp != 0;
        boolean z14 = iDraadjrbmk != 0;
        boolean z15 = iKcexrzcfyt != 0;
        boolean z16 = (iJyumaefscl == 0 && iZdlpuopuiu == 0) ? false : true;
        if (z13) {
            sb3.append(jWflxmlrfwp);
            sb3.append('d');
            i13 = 1;
        }
        if (z14 || (z13 && (z15 || z16))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(iDraadjrbmk);
            sb3.append('h');
            i13 = i14;
        }
        if (z15 || (z16 && (z14 || z13))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(iKcexrzcfyt);
            sb3.append('m');
            i13 = i15;
        }
        if (z16) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            if (iJyumaefscl != 0 || z13 || z14 || z15) {
                eablkybsjg(j13, sb3, iJyumaefscl, iZdlpuopuiu, 9, "s", false);
            } else if (iZdlpuopuiu >= 1000000) {
                eablkybsjg(j13, sb3, iZdlpuopuiu / 1000000, iZdlpuopuiu % 1000000, 6, "ms", false);
            } else if (iZdlpuopuiu >= 1000) {
                eablkybsjg(j13, sb3, iZdlpuopuiu / 1000, iZdlpuopuiu % 1000, 3, "us", false);
            } else {
                sb3.append(iZdlpuopuiu);
                sb3.append("ns");
            }
            i13 = i16;
        }
        if (zCdpycssgdh && i13 > 1) {
            sb3.insert(1, '(').append(')');
        }
        return sb3.toString();
    }

    public static final int zdlpuopuiu(long j13) {
        if (istkbnxepw(j13)) {
            return 0;
        }
        return (int) (pmvmpeiblj(j13) ? ppxfxbqfkf.agtfadlqog(cqumvgiudr(j13) % ((long) 1000)) : cqumvgiudr(j13) % ((long) 1000000000));
    }

    private static final boolean zynmafqrjb(long j13) {
        return (((int) j13) & 1) == 0;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return lqeggnwhkg(((iobyxmoadg) obj).hcddaimhww());
    }

    public boolean equals(Object obj) {
        return btonecajqb(this.f70174zdlpuopuiu, obj);
    }

    public int hashCode() {
        return esjtqupxsv(this.f70174zdlpuopuiu);
    }

    public final /* synthetic */ long hcddaimhww() {
        return this.f70174zdlpuopuiu;
    }

    public int lqeggnwhkg(long j13) {
        return nufgyqmvbu(this.f70174zdlpuopuiu, j13);
    }

    public String toString() {
        return ylkuphrtab(this.f70174zdlpuopuiu);
    }
}
