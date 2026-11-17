package ru.myspar.database.impl;

/* JADX INFO: loaded from: classes4.dex */
final class dxjokdxxww extends o5.zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o5.iobyxmoadg f87613ppxfxbqfkf;

    public dxjokdxxww() {
        super(31, 32);
        this.f87613ppxfxbqfkf = new l60.ppxfxbqfkf();
    }

    @Override // o5.zoijcleaow
    public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `editable_orders` ADD COLUMN `total_info` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `cart_info_list` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `cart_selected_comments` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `order_sum` REAL NOT NULL DEFAULT 0.0");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `order_sum_no_discounts` TEXT NOT NULL DEFAULT ''");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `promocode_status_text` TEXT DEFAULT ''");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `receipt_info_delivery_type_title` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `receipt_info_delivery_price_title` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `receipt_info_delivery_interval_title` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `receipt_info_address_title` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `receipt_info_is_postamat` INTEGER DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `receiver_name` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `receiver_phone` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `cart_progressbar_title` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `cart_progressbar_current_value` REAL DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `cart_progressbar_needed_value` REAL DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `cart_progressbar_values_difference` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `cart` ADD COLUMN `cart_progressbar_color` TEXT DEFAULT NULL");
        lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `_new_cart` (`id` INTEGER NOT NULL, `city_id` TEXT, `shop_id` TEXT, `address_id` INTEGER, `partner_code` TEXT, `scango_end` TEXT, `delivery_area` TEXT, `delivery` TEXT, `basket` TEXT, `payment` TEXT, `cart_info_list` TEXT, `cart_selected_comments` TEXT, `order_sum` REAL NOT NULL DEFAULT 0.0, `order_sum_no_discounts` TEXT NOT NULL DEFAULT '', `order_properties_min_price` REAL, `order_properties_free_delivery_from` REAL, `order_properties_basket_sum` REAL, `sum_basket` REAL, `sum_discount` REAL, `sum_delivery` REAL, `sum_overweight` REAL, `sum_weight` REAL, `sum_total` REAL, `sum_count` INTEGER, `properties_date_receipt` TEXT, `properties_interval_delivery` TEXT, `promocode_name` TEXT, `promocode_status` INTEGER, `promocode_discount` REAL, `promocode_status_text` TEXT DEFAULT '', `cart_references_payment` TEXT, `cart_references_add_params_delivery` TEXT, `cart_evropolis_percent` INTEGER, `cart_evropolis_pic` TEXT, `cart_evropolis_text` TEXT, `bonuses_available` INTEGER, `bonuses_balance` INTEGER, `bonuses_applied` INTEGER, `bonuses_tooltip` TEXT DEFAULT '', `receipt_info_delivery_type_title` TEXT, `receipt_info_delivery_price_title` TEXT, `receipt_info_delivery_interval_title` TEXT, `receipt_info_address_title` TEXT, `receipt_info_is_postamat` INTEGER, `receiver_name` TEXT, `receiver_phone` TEXT, `cart_progressbar_title` TEXT, `cart_progressbar_current_value` REAL, `cart_progressbar_needed_value` REAL, `cart_progressbar_values_difference` TEXT, `cart_progressbar_color` TEXT, PRIMARY KEY(`id`))");
        lqeggnwhkgVar.lmojexxdyd("INSERT INTO `_new_cart` (`id`,`city_id`,`shop_id`,`address_id`,`partner_code`,`scango_end`,`delivery_area`,`delivery`,`basket`,`payment`,`order_properties_min_price`,`order_properties_free_delivery_from`,`order_properties_basket_sum`,`sum_basket`,`sum_discount`,`sum_delivery`,`sum_overweight`,`sum_weight`,`sum_total`,`sum_count`,`properties_date_receipt`,`properties_interval_delivery`,`promocode_name`,`promocode_status`,`promocode_discount`,`cart_references_payment`,`cart_references_add_params_delivery`,`cart_evropolis_percent`,`cart_evropolis_pic`,`cart_evropolis_text`,`bonuses_available`,`bonuses_balance`,`bonuses_applied`,`bonuses_tooltip`) SELECT `id`,`city_id`,`shop_id`,`address_id`,`partner_code`,`scango_end`,`delivery_area`,`delivery`,`basket`,`payment`,`order_properties_min_price`,`order_properties_free_delivery_from`,`order_properties_basket_sum`,`sum_basket`,`sum_discount`,`sum_delivery`,`sum_overweight`,`sum_weight`,`sum_total`,`sum_count`,`properties_date_receipt`,`properties_interval_delivery`,`promocode_name`,`promocode_status`,`promocode_discount`,`cart_references_payment`,`cart_references_add_params_delivery`,`cart_evropolis_percent`,`cart_evropolis_pic`,`cart_evropolis_text`,`bonuses_available`,`bonuses_balance`,`bonuses_applied`,`bonuses_tooltip` FROM `cart`");
        lqeggnwhkgVar.lmojexxdyd("DROP TABLE `cart`");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `_new_cart` RENAME TO `cart`");
        lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `_new_editable_orders` (`id` INTEGER NOT NULL, `order_status` TEXT NOT NULL, `city_id` TEXT NOT NULL, `shop_id` TEXT NOT NULL, `delivery` TEXT, `address_id` INTEGER NOT NULL, `delivery_area` TEXT NOT NULL, `payment` TEXT NOT NULL, `basket` TEXT NOT NULL, `groups` TEXT NOT NULL DEFAULT '', `total_info` TEXT, `promocode_name` TEXT NOT NULL, `promocode_discount` REAL NOT NULL, `promocode_status` INTEGER NOT NULL, `order_properties_min_price` REAL NOT NULL, `order_properties_date_left` TEXT, `properties_address` TEXT NOT NULL, `properties_receiver_first_name` TEXT NOT NULL, `properties_receiver_last_name` TEXT NOT NULL, `properties_receiver_phone` TEXT NOT NULL, `properties_receiver_email` TEXT NOT NULL, `properties_date_receipt` TEXT NOT NULL, `properties_internal_delivery` TEXT NOT NULL, `properties_change` TEXT NOT NULL, `properties_groups` TEXT, `references_payment` TEXT NOT NULL, `references_add_params_delivery` TEXT NOT NULL, `sum_basket` REAL NOT NULL, `sum_discount` REAL NOT NULL, `sum_delivery` REAL NOT NULL, `sum_overweight` REAL NOT NULL, `sum_weight` REAL NOT NULL, `sum_total` REAL NOT NULL, `sum_count` INTEGER NOT NULL, `sum_old_total` REAL NOT NULL, `sum_diff_total` REAL NOT NULL, `bonuses_applied` INTEGER, PRIMARY KEY(`id`))");
        lqeggnwhkgVar.lmojexxdyd("INSERT INTO `_new_editable_orders` (`id`,`order_status`,`city_id`,`shop_id`,`delivery`,`address_id`,`delivery_area`,`payment`,`basket`,`groups`,`promocode_name`,`promocode_discount`,`promocode_status`,`order_properties_min_price`,`order_properties_date_left`,`properties_address`,`properties_receiver_first_name`,`properties_receiver_last_name`,`properties_receiver_phone`,`properties_receiver_email`,`properties_date_receipt`,`properties_internal_delivery`,`properties_change`,`properties_groups`,`references_payment`,`references_add_params_delivery`,`sum_basket`,`sum_discount`,`sum_delivery`,`sum_overweight`,`sum_weight`,`sum_total`,`sum_count`,`sum_old_total`,`sum_diff_total`,`bonuses_applied`) SELECT `id`,`order_status`,`city_id`,`shop_id`,`delivery`,`address_id`,`delivery_area`,`payment`,`basket`,`groups`,`promocode_name`,`promocode_discount`,`promocode_status`,`order_properties_min_price`,`order_properties_date_left`,`properties_address`,`properties_receiver_first_name`,`properties_receiver_last_name`,`properties_receiver_phone`,`properties_receiver_email`,`properties_date_receipt`,`properties_internal_delivery`,`properties_change`,`properties_groups`,`references_payment`,`references_add_params_delivery`,`sum_basket`,`sum_discount`,`sum_delivery`,`sum_overweight`,`sum_weight`,`sum_total`,`sum_count`,`sum_old_total`,`sum_diff_total`,`bonuses_applied` FROM `editable_orders`");
        lqeggnwhkgVar.lmojexxdyd("DROP TABLE `editable_orders`");
        lqeggnwhkgVar.lmojexxdyd("ALTER TABLE `_new_editable_orders` RENAME TO `editable_orders`");
        this.f87613ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVar);
    }
}
