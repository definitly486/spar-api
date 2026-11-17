package androidx.work.impl;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends o5.zoijcleaow {
    public eablkybsjg() {
        super(17, 18);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
