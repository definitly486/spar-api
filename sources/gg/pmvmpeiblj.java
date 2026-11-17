package gg;

/* JADX INFO: loaded from: classes3.dex */
public final class pmvmpeiblj implements Comparable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f37131yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f37132zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ pmvmpeiblj(int i13) {
        this.f37132zdlpuopuiu = i13;
    }

    public static String eablkybsjg(int i13) {
        return String.valueOf(((long) i13) & 4294967295L);
    }

    public static final /* synthetic */ pmvmpeiblj iobyxmoadg(int i13) {
        return new pmvmpeiblj(i13);
    }

    public static boolean ppxfxbqfkf(int i13, Object obj) {
        return (obj instanceof pmvmpeiblj) && i13 == ((pmvmpeiblj) obj).gxszxtbevo();
    }

    public static int wkgbmnqykc(int i13) {
        return Integer.hashCode(i13);
    }

    public static int zoijcleaow(int i13) {
        return i13;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return pkzmftpjix.iobyxmoadg(gxszxtbevo(), ((pmvmpeiblj) obj).gxszxtbevo());
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f37132zdlpuopuiu, obj);
    }

    public final /* synthetic */ int gxszxtbevo() {
        return this.f37132zdlpuopuiu;
    }

    public int hashCode() {
        return wkgbmnqykc(this.f37132zdlpuopuiu);
    }

    public String toString() {
        return eablkybsjg(this.f37132zdlpuopuiu);
    }
}
