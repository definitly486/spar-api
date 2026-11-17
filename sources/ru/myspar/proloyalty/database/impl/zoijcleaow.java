package ru.myspar.proloyalty.database.impl;

/* JADX INFO: loaded from: classes5.dex */
final class zoijcleaow extends o5.zoijcleaow {
    public zoijcleaow() {
        super(23, 24);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `editable_orders` ADD COLUMN `bonuses_applied` INTEGER DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `bonuses_available` INTEGER DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `bonuses_balance` INTEGER DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `bonuses_applied` INTEGER DEFAULT NULL");
    }
}
