package h6;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final draadjrbmk f39530ppxfxbqfkf = new draadjrbmk();

    private draadjrbmk() {
        super(3, 4);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        db3.lmojexxdyd("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
