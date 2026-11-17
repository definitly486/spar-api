package gg;

/* JADX INFO: loaded from: classes3.dex */
public final class iozdgvuglv implements Comparable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f37107yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final short f37108zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ iozdgvuglv(short s13) {
        this.f37108zdlpuopuiu = s13;
    }

    public static String eablkybsjg(short s13) {
        return String.valueOf(s13 & 65535);
    }

    public static final /* synthetic */ iozdgvuglv iobyxmoadg(short s13) {
        return new iozdgvuglv(s13);
    }

    public static boolean ppxfxbqfkf(short s13, Object obj) {
        return (obj instanceof iozdgvuglv) && s13 == ((iozdgvuglv) obj).gxszxtbevo();
    }

    public static int wkgbmnqykc(short s13) {
        return Short.hashCode(s13);
    }

    public static short zoijcleaow(short s13) {
        return s13;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(gxszxtbevo() & 65535, ((iozdgvuglv) obj).gxszxtbevo() & 65535);
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f37108zdlpuopuiu, obj);
    }

    public final /* synthetic */ short gxszxtbevo() {
        return this.f37108zdlpuopuiu;
    }

    public int hashCode() {
        return wkgbmnqykc(this.f37108zdlpuopuiu);
    }

    public String toString() {
        return eablkybsjg(this.f37108zdlpuopuiu);
    }
}
