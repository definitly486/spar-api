package x;

/* JADX INFO: loaded from: classes.dex */
public interface gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f120816iobyxmoadg = iobyxmoadg.f120819iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f120819iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final gxszxtbevo f120824zoijcleaow = new C3042iobyxmoadg();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final gxszxtbevo f120822ppxfxbqfkf = new eablkybsjg();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final gxszxtbevo f120823wkgbmnqykc = new ppxfxbqfkf();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final gxszxtbevo f120817eablkybsjg = new wkgbmnqykc();

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private static final gxszxtbevo f120818gxszxtbevo = new C3041gxszxtbevo();

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private static final dxjokdxxww f120820lqeggnwhkg = new dxjokdxxww(1.0f);

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private static final gxszxtbevo f120821nufgyqmvbu = new zoijcleaow();

        public static final class eablkybsjg implements gxszxtbevo {
            eablkybsjg() {
            }

            @Override // x.gxszxtbevo
            public long iobyxmoadg(long j13, long j14) {
                float fWkgbmnqykc = lqeggnwhkg.wkgbmnqykc(j13, j14);
                return wypolnanlu.zoijcleaow((((long) Float.floatToRawIntBits(fWkgbmnqykc)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fWkgbmnqykc))));
            }
        }

        /* JADX INFO: renamed from: x.gxszxtbevo$iobyxmoadg$gxszxtbevo, reason: collision with other inner class name */
        public static final class C3041gxszxtbevo implements gxszxtbevo {
            C3041gxszxtbevo() {
            }

            @Override // x.gxszxtbevo
            public long iobyxmoadg(long j13, long j14) {
                if (Float.intBitsToFloat((int) (j13 >> 32)) <= Float.intBitsToFloat((int) (j14 >> 32)) && Float.intBitsToFloat((int) (j13 & 4294967295L)) <= Float.intBitsToFloat((int) (j14 & 4294967295L))) {
                    return wypolnanlu.zoijcleaow((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                }
                float fWkgbmnqykc = lqeggnwhkg.wkgbmnqykc(j13, j14);
                return wypolnanlu.zoijcleaow((((long) Float.floatToRawIntBits(fWkgbmnqykc)) << 32) | (((long) Float.floatToRawIntBits(fWkgbmnqykc)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: x.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3042iobyxmoadg implements gxszxtbevo {
            C3042iobyxmoadg() {
            }

            @Override // x.gxszxtbevo
            public long iobyxmoadg(long j13, long j14) {
                float fPpxfxbqfkf = lqeggnwhkg.ppxfxbqfkf(j13, j14);
                return wypolnanlu.zoijcleaow((((long) Float.floatToRawIntBits(fPpxfxbqfkf)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fPpxfxbqfkf))));
            }
        }

        public static final class ppxfxbqfkf implements gxszxtbevo {
            ppxfxbqfkf() {
            }

            @Override // x.gxszxtbevo
            public long iobyxmoadg(long j13, long j14) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 & 4294967295L)) / Float.intBitsToFloat((int) (j13 & 4294967295L));
                return wypolnanlu.zoijcleaow((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        public static final class wkgbmnqykc implements gxszxtbevo {
            wkgbmnqykc() {
            }

            @Override // x.gxszxtbevo
            public long iobyxmoadg(long j13, long j14) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j13 >> 32));
                return wypolnanlu.zoijcleaow((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        public static final class zoijcleaow implements gxszxtbevo {
            zoijcleaow() {
            }

            @Override // x.gxszxtbevo
            public long iobyxmoadg(long j13, long j14) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j13 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L)) / Float.intBitsToFloat((int) (j13 & 4294967295L));
                return wypolnanlu.zoijcleaow((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
            }
        }

        private iobyxmoadg() {
        }

        public final gxszxtbevo eablkybsjg() {
            return f120822ppxfxbqfkf;
        }

        public final gxszxtbevo gxszxtbevo() {
            return f120818gxszxtbevo;
        }

        public final gxszxtbevo iobyxmoadg() {
            return f120824zoijcleaow;
        }

        public final dxjokdxxww lqeggnwhkg() {
            return f120820lqeggnwhkg;
        }

        public final gxszxtbevo ppxfxbqfkf() {
            return f120823wkgbmnqykc;
        }

        public final gxszxtbevo wkgbmnqykc() {
            return f120817eablkybsjg;
        }

        public final gxszxtbevo zoijcleaow() {
            return f120821nufgyqmvbu;
        }
    }

    long iobyxmoadg(long j13, long j14);
}
