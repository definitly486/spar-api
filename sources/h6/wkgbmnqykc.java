package h6;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc extends n5.oxmwwwfdhm.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final g6.zoijcleaow f39658iobyxmoadg;

    public wkgbmnqykc(g6.zoijcleaow clock) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clock, "clock");
        this.f39658iobyxmoadg = clock;
    }

    private final String eablkybsjg() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + wkgbmnqykc() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    private final long wkgbmnqykc() {
        return this.f39658iobyxmoadg.currentTimeMillis() - wwaezpbzkn.f39659iobyxmoadg;
    }

    @Override // n5.oxmwwwfdhm.zoijcleaow
    public void ppxfxbqfkf(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        super.ppxfxbqfkf(db3);
        db3.oxmwwwfdhm();
        try {
            db3.lmojexxdyd(eablkybsjg());
            db3.vipkmwdibw();
        } finally {
            db3.uwvvkdfqfp();
        }
    }
}
