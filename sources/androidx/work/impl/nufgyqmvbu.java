package androidx.work.impl;

/* JADX INFO: loaded from: classes2.dex */
final class nufgyqmvbu extends o5.zoijcleaow {
    public nufgyqmvbu() {
        super(20, 21);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
