package vq1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public enum lereixgezr {
    ALL("all"),
    ONLINE("online"),
    OFFLINE("offline");


    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f117868lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f117869yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f117870zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lereixgezr iobyxmoadg(String serverValue) {
            Object next;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serverValue, "serverValue");
            Iterator<E> it = lereixgezr.wkgbmnqykc().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((lereixgezr) next).lqeggnwhkg(), serverValue));
            lereixgezr lereixgezrVar = (lereixgezr) next;
            return lereixgezrVar == null ? lereixgezr.ALL : lereixgezrVar;
        }

        private iobyxmoadg() {
        }
    }

    lereixgezr(String str) {
        this.f117870zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f117868lereixgezr;
    }

    public final String lqeggnwhkg() {
        return this.f117870zdlpuopuiu;
    }
}
