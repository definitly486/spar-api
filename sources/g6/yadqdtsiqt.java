package g6;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class yadqdtsiqt extends dsvhmnatus {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final zoijcleaow f36486eablkybsjg = new zoijcleaow(null);

    public static final class iobyxmoadg extends dsvhmnatus.iobyxmoadg {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Class workerClass, long j13, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerClass, "workerClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            nufgyqmvbu().vdvldrhtss(repeatIntervalTimeUnit.toMillis(j13));
        }

        @Override // g6.dsvhmnatus.iobyxmoadg
        /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg lqeggnwhkg() {
            return this;
        }

        @Override // g6.dsvhmnatus.iobyxmoadg
        /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
        public yadqdtsiqt ppxfxbqfkf() {
            if (wkgbmnqykc() && nufgyqmvbu().f75789btonecajqb.btonecajqb()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (nufgyqmvbu().f75806vdvldrhtss) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new yadqdtsiqt(this);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yadqdtsiqt(iobyxmoadg builder) {
        super(builder.eablkybsjg(), builder.nufgyqmvbu(), builder.gxszxtbevo());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
    }
}
