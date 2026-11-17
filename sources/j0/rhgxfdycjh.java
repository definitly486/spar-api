package j0;

/* JADX INFO: loaded from: classes.dex */
public final class rhgxfdycjh implements eablkybsjg.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f50312iobyxmoadg;

    private /* synthetic */ rhgxfdycjh(String str) {
        this.f50312iobyxmoadg = str;
    }

    public static String eablkybsjg(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public static final /* synthetic */ rhgxfdycjh iobyxmoadg(String str) {
        return new rhgxfdycjh(str);
    }

    public static boolean ppxfxbqfkf(String str, Object obj) {
        return (obj instanceof rhgxfdycjh) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, ((rhgxfdycjh) obj).gxszxtbevo());
    }

    public static int wkgbmnqykc(String str) {
        return str.hashCode();
    }

    public static String zoijcleaow(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f50312iobyxmoadg, obj);
    }

    public final /* synthetic */ String gxszxtbevo() {
        return this.f50312iobyxmoadg;
    }

    public int hashCode() {
        return wkgbmnqykc(this.f50312iobyxmoadg);
    }

    public String toString() {
        return eablkybsjg(this.f50312iobyxmoadg);
    }
}
