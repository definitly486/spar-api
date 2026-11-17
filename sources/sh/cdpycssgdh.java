package sh;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lmojexxdyd f106510iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f106511ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f106512zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final zoijcleaow f106509wkgbmnqykc = new zoijcleaow(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final cdpycssgdh f106508eablkybsjg = new cdpycssgdh(zynmafqrjb.zoijcleaow(null, 1, null), iobyxmoadg.f106513zdlpuopuiu);

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.rgvfuqvkyq implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f106513zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // kotlin.jvm.internal.gxszxtbevo, ah.ppxfxbqfkf
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final ah.gxszxtbevo getOwner() {
            return kotlin.jvm.internal.cllcsxoeiz.wkgbmnqykc(zynmafqrjb.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.gxszxtbevo
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final dsvhmnatus invoke(ii.ppxfxbqfkf p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return zynmafqrjb.wkgbmnqykc(p13);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final cdpycssgdh iobyxmoadg() {
            return cdpycssgdh.f106508eablkybsjg;
        }

        private zoijcleaow() {
        }
    }

    public cdpycssgdh(lmojexxdyd jsr305, tg.draadjrbmk getReportLevelForAnnotation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jsr305, "jsr305");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f106510iobyxmoadg = jsr305;
        this.f106512zoijcleaow = getReportLevelForAnnotation;
        this.f106511ppxfxbqfkf = jsr305.gxszxtbevo() || getReportLevelForAnnotation.invoke(zynmafqrjb.eablkybsjg()) == dsvhmnatus.IGNORE;
    }

    public final tg.draadjrbmk ppxfxbqfkf() {
        return this.f106512zoijcleaow;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f106510iobyxmoadg + ", getReportLevelForAnnotation=" + this.f106512zoijcleaow + ')';
    }

    public final lmojexxdyd wkgbmnqykc() {
        return this.f106510iobyxmoadg;
    }

    public final boolean zoijcleaow() {
        return this.f106511ppxfxbqfkf;
    }
}
