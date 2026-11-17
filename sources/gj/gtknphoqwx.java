package gj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtknphoqwx implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37545iobyxmoadg;

    public static final class iobyxmoadg extends gtknphoqwx {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final iobyxmoadg f37546zoijcleaow = new iobyxmoadg();

        private iobyxmoadg() {
            super("must be a member function", null);
        }

        @Override // gj.gxszxtbevo
        public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
            return functionDescriptor.hcddaimhww() != null;
        }
    }

    public static final class zoijcleaow extends gtknphoqwx {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f37547zoijcleaow = new zoijcleaow();

        private zoijcleaow() {
            super("must be a member or an extension function", null);
        }

        @Override // gj.gxszxtbevo
        public boolean iobyxmoadg(jh.lereixgezr functionDescriptor) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.hcddaimhww() == null && functionDescriptor.hkdspvbjdz() == null) ? false : true;
        }
    }

    public /* synthetic */ gtknphoqwx(String str, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    @Override // gj.gxszxtbevo
    public String getDescription() {
        return this.f37545iobyxmoadg;
    }

    @Override // gj.gxszxtbevo
    public String zoijcleaow(jh.lereixgezr lereixgezrVar) {
        return gxszxtbevo.iobyxmoadg.iobyxmoadg(this, lereixgezrVar);
    }

    private gtknphoqwx(String str) {
        this.f37545iobyxmoadg = str;
    }
}
