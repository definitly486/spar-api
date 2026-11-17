package ru.myspar.proloyalty.database.impl;

/* JADX INFO: loaded from: classes5.dex */
final class wflxmlrfwp extends o5.zoijcleaow {
    public wflxmlrfwp() {
        super(35, 36);
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `splash_table` (`id` INTEGER NOT NULL, `fileUrl` TEXT NOT NULL, `type` TEXT NOT NULL, `endTime` INTEGER, `showCount` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
