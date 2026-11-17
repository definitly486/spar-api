package vq1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public enum iozdgvuglv {
    H1("h1"),
    H2("h2"),
    H3("h3"),
    H5("h5"),
    H6("h6"),
    UNDEFINED("");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f117797zdlpuopuiu;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f117790istkbnxepw = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f117795yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iozdgvuglv iobyxmoadg(String serverValue) {
            Object next;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serverValue, "serverValue");
            Iterator<E> it = iozdgvuglv.wkgbmnqykc().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((iozdgvuglv) next).lqeggnwhkg(), serverValue));
            iozdgvuglv iozdgvuglvVar = (iozdgvuglv) next;
            return iozdgvuglvVar == null ? iozdgvuglv.UNDEFINED : iozdgvuglvVar;
        }

        private iobyxmoadg() {
        }
    }

    iozdgvuglv(String str) {
        this.f117797zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f117790istkbnxepw;
    }

    public final String lqeggnwhkg() {
        return this.f117797zdlpuopuiu;
    }
}
