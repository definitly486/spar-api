package b;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f14827zoijcleaow;

    private /* synthetic */ eablkybsjg(int i13) {
        this.f14827zoijcleaow = i13;
    }

    public static String eablkybsjg(int i13) {
        return "AndroidContentDataType(androidAutofillType=" + i13 + ')';
    }

    public static final /* synthetic */ eablkybsjg iobyxmoadg(int i13) {
        return new eablkybsjg(i13);
    }

    public static boolean ppxfxbqfkf(int i13, Object obj) {
        return (obj instanceof eablkybsjg) && i13 == ((eablkybsjg) obj).gxszxtbevo();
    }

    public static int wkgbmnqykc(int i13) {
        return Integer.hashCode(i13);
    }

    public static int zoijcleaow(int i13) {
        return i13;
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f14827zoijcleaow, obj);
    }

    public final /* synthetic */ int gxszxtbevo() {
        return this.f14827zoijcleaow;
    }

    public int hashCode() {
        return wkgbmnqykc(this.f14827zoijcleaow);
    }

    public String toString() {
        return eablkybsjg(this.f14827zoijcleaow);
    }
}
