package h6;

/* JADX INFO: loaded from: classes2.dex */
public final class wflxmlrfwp extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final wflxmlrfwp f39657ppxfxbqfkf = new wflxmlrfwp();

    private wflxmlrfwp() {
        super(4, 5);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        db3.lmojexxdyd("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db3.lmojexxdyd("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
