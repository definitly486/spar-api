package x;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final gtknphoqwx f120877iobyxmoadg = new gtknphoqwx(iobyxmoadg.f120879zdlpuopuiu);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gtknphoqwx f120878zoijcleaow = new gtknphoqwx(C3044zoijcleaow.f120880zdlpuopuiu);

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f120879zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(2, vg.iobyxmoadg.class, "min", "min(II)I", 1);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer iobyxmoadg(int i13, int i14) {
            return Integer.valueOf(Math.min(i13, i14));
        }
    }

    /* JADX INFO: renamed from: x.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    /* synthetic */ class C3044zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final C3044zoijcleaow f120880zdlpuopuiu = new C3044zoijcleaow();

        C3044zoijcleaow() {
            super(2, vg.iobyxmoadg.class, "max", "max(II)I", 1);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer iobyxmoadg(int i13, int i14) {
            return Integer.valueOf(Math.max(i13, i14));
        }
    }

    public static final gtknphoqwx iobyxmoadg() {
        return f120877iobyxmoadg;
    }

    public static final int ppxfxbqfkf(x.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
        return ((Number) iobyxmoadgVar.iobyxmoadg().invoke(Integer.valueOf(i13), Integer.valueOf(i14))).intValue();
    }

    public static final gtknphoqwx zoijcleaow() {
        return f120878zoijcleaow;
    }
}
