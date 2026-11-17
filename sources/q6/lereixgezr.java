package q6;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class lereixgezr {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f77947ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f77948zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f77949iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final String iobyxmoadg() {
            return lereixgezr.f77947ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    static {
        String strDxjokdxxww = g6.yggfygwlhe.dxjokdxxww("NetworkRequestCompat");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"NetworkRequestCompat\")");
        f77947ppxfxbqfkf = strDxjokdxxww;
    }

    public lereixgezr(Object obj) {
        this.f77949iobyxmoadg = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lereixgezr) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f77949iobyxmoadg, ((lereixgezr) obj).f77949iobyxmoadg);
    }

    public int hashCode() {
        Object obj = this.f77949iobyxmoadg;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f77949iobyxmoadg + ')';
    }

    public final NetworkRequest zoijcleaow() {
        return (NetworkRequest) this.f77949iobyxmoadg;
    }

    public /* synthetic */ lereixgezr(Object obj, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : obj);
    }
}
