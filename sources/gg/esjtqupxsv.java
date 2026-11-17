package gg;

/* JADX INFO: loaded from: classes3.dex */
public final class esjtqupxsv implements Comparable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f37099yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final byte f37100zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ esjtqupxsv(byte b13) {
        this.f37100zdlpuopuiu = b13;
    }

    public static String eablkybsjg(byte b13) {
        return String.valueOf(b13 & 255);
    }

    public static final /* synthetic */ esjtqupxsv iobyxmoadg(byte b13) {
        return new esjtqupxsv(b13);
    }

    public static boolean ppxfxbqfkf(byte b13, Object obj) {
        return (obj instanceof esjtqupxsv) && b13 == ((esjtqupxsv) obj).gxszxtbevo();
    }

    public static int wkgbmnqykc(byte b13) {
        return Byte.hashCode(b13);
    }

    public static byte zoijcleaow(byte b13) {
        return b13;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(gxszxtbevo() & 255, ((esjtqupxsv) obj).gxszxtbevo() & 255);
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f37100zdlpuopuiu, obj);
    }

    public final /* synthetic */ byte gxszxtbevo() {
        return this.f37100zdlpuopuiu;
    }

    public int hashCode() {
        return wkgbmnqykc(this.f37100zdlpuopuiu);
    }

    public String toString() {
        return eablkybsjg(this.f37100zdlpuopuiu);
    }
}
