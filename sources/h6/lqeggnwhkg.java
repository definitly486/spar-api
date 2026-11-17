package h6;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final lqeggnwhkg f39586ppxfxbqfkf = new lqeggnwhkg();

    private lqeggnwhkg() {
        super(11, 12);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        db3.lmojexxdyd("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
