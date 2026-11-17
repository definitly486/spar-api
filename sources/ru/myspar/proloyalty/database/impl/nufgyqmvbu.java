package ru.myspar.proloyalty.database.impl;

/* JADX INFO: loaded from: classes5.dex */
final class nufgyqmvbu extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o5.iobyxmoadg f95399ppxfxbqfkf;

    public nufgyqmvbu() {
        super(30, 31);
        this.f95399ppxfxbqfkf = new y41.zoijcleaow();
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `_new_users` (`phone` TEXT NOT NULL, `xml_id` TEXT, `email` TEXT NOT NULL, `first_name` TEXT NOT NULL, `last_name` TEXT NOT NULL, `card_number` TEXT, `gender` TEXT NOT NULL, `date_birth` TEXT NOT NULL, `bonuses` REAL, `desc` TEXT, `is_email_notification_enabled` INTEGER NOT NULL, `is_sms_notification_enabled` INTEGER NOT NULL, `is_push_notification_enabled` INTEGER NOT NULL, `is_iqos_agreements_applied` INTEGER NOT NULL, `scan_go_access_granted` INTEGER NOT NULL, `push_tokens` TEXT, `is_email_confirmed` INTEGER NOT NULL, `digital_checks` INTEGER NOT NULL, `notifications_new` INTEGER NOT NULL, `discounts_new` INTEGER NOT NULL, `tester_functions` TEXT, `verify_sum` REAL, `segments` TEXT, `game_token` TEXT, `promo_new` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`phone`))");
        lqeggnwhkgVar.lmojexxdyd("INSERT INTO `_new_users` (`phone`,`xml_id`,`email`,`first_name`,`last_name`,`card_number`,`gender`,`date_birth`,`bonuses`,`desc`,`is_email_notification_enabled`,`is_sms_notification_enabled`,`is_push_notification_enabled`,`is_iqos_agreements_applied`,`scan_go_access_granted`,`push_tokens`,`is_email_confirmed`,`digital_checks`,`notifications_new`,`discounts_new`,`tester_functions`,`verify_sum`,`segments`,`game_token`,`promo_new`) SELECT `phone`,`xml_id`,`email`,`first_name`,`last_name`,`card_number`,`gender`,`date_birth`,`bonuses`,`desc`,`is_email_notification_enabled`,`is_sms_notification_enabled`,`is_push_notification_enabled`,`is_iqos_agreements_applied`,`scan_go_access_granted`,`push_tokens`,`is_email_confirmed`,`digital_checks`,`notifications_new`,`discounts_new`,`tester_functions`,`verify_sum`,`segments`,`game_token`,`promo_new` FROM `users`");
        lqeggnwhkgVar.lmojexxdyd("DROP TABLE `users`");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `_new_users` RENAME TO `users`");
        this.f95399ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVar);
    }
}
