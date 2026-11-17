package i;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f41520iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final wkgbmnqykc f41519zoijcleaow = new wkgbmnqykc(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final iobyxmoadg f41517ppxfxbqfkf = new C0970iobyxmoadg(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final iobyxmoadg f41518wkgbmnqykc = new ppxfxbqfkf(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final iobyxmoadg f41516eablkybsjg = new zoijcleaow(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: i.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0970iobyxmoadg extends iobyxmoadg {
        C0970iobyxmoadg(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    public static final class ppxfxbqfkf extends iobyxmoadg {
        ppxfxbqfkf(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    public static final class wkgbmnqykc {
        public /* synthetic */ wkgbmnqykc(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iobyxmoadg iobyxmoadg() {
            return iobyxmoadg.f41517ppxfxbqfkf;
        }

        private wkgbmnqykc() {
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {
        zoijcleaow(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    public /* synthetic */ iobyxmoadg(float[] fArr, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(fArr);
    }

    public final float[] zoijcleaow() {
        return this.f41520iobyxmoadg;
    }

    private iobyxmoadg(float[] fArr) {
        this.f41520iobyxmoadg = fArr;
    }
}
