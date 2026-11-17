package gj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pmvmpeiblj implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37577iobyxmoadg;

    public static final class iobyxmoadg extends pmvmpeiblj {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f37578zoijcleaow;

        public iobyxmoadg(int i13) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("must have at least ");
            sb3.append(i13);
            sb3.append(" value parameter");
            sb3.append(i13 > 1 ? "s" : "");
            super(sb3.toString(), null);
            this.f37578zoijcleaow = i13;
        }

        @Override // gj.gxszxtbevo
        public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
            return functionDescriptor.dxjokdxxww().size() >= this.f37578zoijcleaow;
        }
    }

    public static final class ppxfxbqfkf extends pmvmpeiblj {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final ppxfxbqfkf f37579zoijcleaow = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super("must have no value parameters", null);
        }

        @Override // gj.gxszxtbevo
        public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
            return functionDescriptor.dxjokdxxww().isEmpty();
        }
    }

    public static final class wkgbmnqykc extends pmvmpeiblj {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final wkgbmnqykc f37580zoijcleaow = new wkgbmnqykc();

        private wkgbmnqykc() {
            super("must have a single value parameter", null);
        }

        @Override // gj.gxszxtbevo
        public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
            return functionDescriptor.dxjokdxxww().size() == 1;
        }
    }

    public static final class zoijcleaow extends pmvmpeiblj {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f37581zoijcleaow;

        public zoijcleaow(int i13) {
            super("must have exactly " + i13 + " value parameters", null);
            this.f37581zoijcleaow = i13;
        }

        @Override // gj.gxszxtbevo
        public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
            return functionDescriptor.dxjokdxxww().size() == this.f37581zoijcleaow;
        }
    }

    public /* synthetic */ pmvmpeiblj(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    @Override // gj.gxszxtbevo
    public String getDescription() {
        return this.f37577iobyxmoadg;
    }

    @Override // gj.gxszxtbevo
    public String zoijcleaow(jh.lereixgezr lereixgezrVar) {
        return gxszxtbevo.iobyxmoadg.iobyxmoadg(this, lereixgezrVar);
    }

    private pmvmpeiblj(String str) {
        this.f37577iobyxmoadg = str;
    }
}
