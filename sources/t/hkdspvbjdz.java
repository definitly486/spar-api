package t;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f109083iobyxmoadg;

    private /* synthetic */ hkdspvbjdz(int i13) {
        this.f109083iobyxmoadg = i13;
    }

    public static String eablkybsjg(int i13) {
        return "PointerKeyboardModifiers(packedValue=" + i13 + ')';
    }

    public static final /* synthetic */ hkdspvbjdz iobyxmoadg(int i13) {
        return new hkdspvbjdz(i13);
    }

    public static boolean ppxfxbqfkf(int i13, Object obj) {
        return (obj instanceof hkdspvbjdz) && i13 == ((hkdspvbjdz) obj).gxszxtbevo();
    }

    public static int wkgbmnqykc(int i13) {
        return Integer.hashCode(i13);
    }

    public static int zoijcleaow(int i13) {
        return i13;
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f109083iobyxmoadg, obj);
    }

    public final /* synthetic */ int gxszxtbevo() {
        return this.f109083iobyxmoadg;
    }

    public int hashCode() {
        return wkgbmnqykc(this.f109083iobyxmoadg);
    }

    public String toString() {
        return eablkybsjg(this.f109083iobyxmoadg);
    }
}
