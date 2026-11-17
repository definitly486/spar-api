package androidx.work.impl;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo extends o5.zoijcleaow {
    public gxszxtbevo() {
        super(18, 19);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
