package c52;

/* JADX INFO: loaded from: classes6.dex */
public enum hcddaimhww {
    HORIZONTAL("horizontal"),
    VERTICAL("vertical");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f18856zdlpuopuiu;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f18852esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f18855yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final hcddaimhww iobyxmoadg(String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            hcddaimhww hcddaimhwwVar = hcddaimhww.HORIZONTAL;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(value, hcddaimhwwVar.wkgbmnqykc()) ? hcddaimhwwVar : hcddaimhww.VERTICAL;
        }

        private iobyxmoadg() {
        }
    }

    hcddaimhww(String str) {
        this.f18856zdlpuopuiu = str;
    }

    public final boolean lqeggnwhkg() {
        return this == HORIZONTAL;
    }

    public final String wkgbmnqykc() {
        return this.f18856zdlpuopuiu;
    }
}
