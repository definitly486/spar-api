package h6;

/* JADX INFO: loaded from: classes2.dex */
public final class ojitshcjhn extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final ojitshcjhn f39633ppxfxbqfkf = new ojitshcjhn();

    private ojitshcjhn() {
        super(7, 8);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        db3.lmojexxdyd("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
