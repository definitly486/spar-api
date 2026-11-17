package jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public interface eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f52666iobyxmoadg = iobyxmoadg.f52667iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ iobyxmoadg f52667iobyxmoadg = new iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static final vipkmwdibw.gtknphoqwx f52669zoijcleaow = vipkmwdibw.draadjrbmk.btonecajqb(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final eablkybsjg f52668ppxfxbqfkf = new C1133iobyxmoadg();

        /* JADX INFO: renamed from: jztzpxfvev.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1133iobyxmoadg implements eablkybsjg {
            C1133iobyxmoadg() {
            }
        }

        private iobyxmoadg() {
        }

        public final float iobyxmoadg(float f13, float f14, float f15) {
            float f16 = f14 + f13;
            if ((f13 >= 0.0f && f16 <= f15) || (f13 < 0.0f && f16 > f15)) {
                return 0.0f;
            }
            float f17 = f16 - f15;
            return Math.abs(f13) < Math.abs(f17) ? f13 : f17;
        }

        public final vipkmwdibw.gtknphoqwx ppxfxbqfkf() {
            return f52669zoijcleaow;
        }

        public final eablkybsjg zoijcleaow() {
            return f52668ppxfxbqfkf;
        }
    }

    default float iobyxmoadg(float f13, float f14, float f15) {
        return f52666iobyxmoadg.iobyxmoadg(f13, f14, f15);
    }

    default vipkmwdibw.gtknphoqwx zoijcleaow() {
        return f52666iobyxmoadg.ppxfxbqfkf();
    }
}
