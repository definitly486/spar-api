package ru.myspar.proloyalty.database.impl;

/* JADX INFO: loaded from: classes5.dex */
final class draadjrbmk extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o5.iobyxmoadg f95395ppxfxbqfkf;

    public draadjrbmk() {
        super(34, 35);
        this.f95395ppxfxbqfkf = new y41.eablkybsjg();
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("DROP TABLE `users`");
        lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `qrs` (`id` TEXT NOT NULL, `code` TEXT NOT NULL, `status` TEXT, `type` TEXT NOT NULL, `lifeTime` INTEGER, PRIMARY KEY(`id`))");
        lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `qr_statuses` (`qrcode_id` TEXT NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`qrcode_id`, `status`))");
        lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `user_info` (`id` TEXT NOT NULL, `phone` TEXT NOT NULL, `email` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `isActive` INTEGER NOT NULL, `isCardBlocked` INTEGER NOT NULL, `agreementAccepted` INTEGER NOT NULL, `gender` TEXT NOT NULL, `dateBirth` TEXT NOT NULL, `scangoAccess` INTEGER NOT NULL, `gameToken` TEXT NOT NULL, `webviewToken` TEXT NOT NULL, `cardNumber` TEXT NOT NULL, `isEReceiptAccepted` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        this.f95395ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVar);
    }
}
