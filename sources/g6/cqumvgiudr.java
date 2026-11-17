package g6;

/* JADX INFO: loaded from: classes2.dex */
public final class cqumvgiudr extends dsvhmnatus {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final zoijcleaow f36374eablkybsjg = new zoijcleaow(null);

    public static final class iobyxmoadg extends dsvhmnatus.iobyxmoadg {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Class workerClass) {
            super(workerClass);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerClass, "workerClass");
        }

        @Override // g6.dsvhmnatus.iobyxmoadg
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg lqeggnwhkg() {
            return this;
        }

        @Override // g6.dsvhmnatus.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public cqumvgiudr ppxfxbqfkf() {
            if (wkgbmnqykc() && nufgyqmvbu().f75789btonecajqb.btonecajqb()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new cqumvgiudr(this);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final cqumvgiudr iobyxmoadg(Class workerClass) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerClass, "workerClass");
            return (cqumvgiudr) new iobyxmoadg(workerClass).zoijcleaow();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqumvgiudr(iobyxmoadg builder) {
        super(builder.eablkybsjg(), builder.nufgyqmvbu(), builder.gxszxtbevo());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
    }

    public static final cqumvgiudr eablkybsjg(Class cls) {
        return f36374eablkybsjg.iobyxmoadg(cls);
    }
}
