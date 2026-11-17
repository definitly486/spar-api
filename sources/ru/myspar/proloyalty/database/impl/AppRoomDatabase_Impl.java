package ru.myspar.proloyalty.database.impl;

import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import n5.oxmwwwfdhm;
import n5.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class AppRoomDatabase_Impl extends AppRoomDatabase {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private volatile yv1.iobyxmoadg f95384cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private volatile bt1.iobyxmoadg f95385esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile rk1.iobyxmoadg f95386iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private volatile rk1.ppxfxbqfkf f95387jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private volatile yw0.lqeggnwhkg f95388kcexrzcfyt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private volatile yw0.eablkybsjg f95389oxmwwwfdhm;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private volatile yw0.ppxfxbqfkf f95390vdvldrhtss;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile yw0.iobyxmoadg f95391yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private volatile yw0.dxjokdxxww f95392zdlpuopuiu;

    class iobyxmoadg extends zdlpuopuiu.zoijcleaow {
        iobyxmoadg(int i13) {
            super(i13);
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void eablkybsjg(u5.lqeggnwhkg lqeggnwhkgVar) {
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void gxszxtbevo(u5.lqeggnwhkg lqeggnwhkgVar) {
            p5.zoijcleaow.zoijcleaow(lqeggnwhkgVar);
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar) {
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `catalogs` (`id` TEXT NOT NULL, `parent_id` TEXT, `name` TEXT NOT NULL, `pic` TEXT NOT NULL, `icon` TEXT NOT NULL, `image` TEXT NOT NULL, `appImage` TEXT NOT NULL DEFAULT '', `icon_png` TEXT NOT NULL, `age_checked_needed` INTEGER NOT NULL, `show_on_main` INTEGER NOT NULL, `sort_main` INTEGER NOT NULL, `sort_type` TEXT, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `order_pickup_statuses` (`id` TEXT NOT NULL, `pickup_status` TEXT NOT NULL, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `editable_orders` (`id` INTEGER NOT NULL, `order_status` TEXT NOT NULL, `shop_id` TEXT NOT NULL, `delivery` TEXT, `delivery_area` TEXT NOT NULL, `payment` TEXT NOT NULL, `basket` TEXT NOT NULL, `groups` TEXT NOT NULL DEFAULT '', `total_info` TEXT, `payments_list` TEXT, `promocode_name` TEXT NOT NULL, `promocode_discount` REAL NOT NULL, `promocode_status` INTEGER NOT NULL, `order_properties_min_price` REAL NOT NULL, `order_properties_date_left` TEXT, `properties_address` TEXT NOT NULL, `properties_receiver_first_name` TEXT NOT NULL, `properties_receiver_last_name` TEXT NOT NULL, `properties_receiver_phone` TEXT NOT NULL, `properties_receiver_email` TEXT NOT NULL, `properties_date_receipt` TEXT NOT NULL, `properties_internal_delivery` TEXT NOT NULL, `properties_change` TEXT NOT NULL, `properties_order_comments_list` TEXT, `sum_basket` REAL NOT NULL, `sum_discount` REAL NOT NULL, `sum_delivery` REAL NOT NULL, `sum_overweight` REAL NOT NULL, `sum_weight` REAL NOT NULL, `sum_total` REAL NOT NULL, `sum_count` INTEGER NOT NULL, `sum_old_total` REAL NOT NULL, `sum_diff_total` REAL NOT NULL, `bonuses_applied` INTEGER, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `scan_go_cart` (`id` INTEGER NOT NULL, `session_expires_at` TEXT NOT NULL, `seconds_to_complete` INTEGER NOT NULL, `shop_id` TEXT NOT NULL, `total_cost` REAL NOT NULL, `number_of_products` INTEGER NOT NULL, `products` TEXT NOT NULL, `need_verify` INTEGER, `cart_references_payment` TEXT, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `scan_go_product` (`id` INTEGER NOT NULL, `article` TEXT NOT NULL, `measure` TEXT NOT NULL, `name` TEXT NOT NULL, `picture_url` TEXT, `price` REAL NOT NULL, `quantity` REAL NOT NULL, `mark_codes` TEXT, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `cart` (`id` INTEGER NOT NULL, `partner_code` TEXT, `basket` TEXT, `payment` TEXT, `cart_info_list` TEXT, `order_sum` REAL NOT NULL DEFAULT 0.0, `order_sum_no_discounts` TEXT NOT NULL DEFAULT '', `order_comments_list` TEXT, `payments_list` TEXT, `delivery_info_title` TEXT NOT NULL DEFAULT '', `delivery_info_subtitle` TEXT NOT NULL DEFAULT '', `delivery_info_price` TEXT, `delivery_info_delivery_type` TEXT, `delivery_info_shop_id` TEXT, `interval_info_title` TEXT, `interval_info_subtitle` TEXT, `interval_info_date` TEXT, `interval_info_time` TEXT, `interval_info_is_only_one` INTEGER, `order_properties_min_price` REAL, `order_properties_free_delivery_from` REAL, `order_properties_basket_sum` REAL, `sum_basket` REAL, `sum_discount` REAL, `sum_delivery` REAL, `sum_overweight` REAL, `sum_weight` REAL, `sum_total` REAL, `sum_count` INTEGER, `promocode_name` TEXT, `promocode_status` INTEGER, `promocode_discount` REAL, `promocode_status_text` TEXT DEFAULT '', `cart_evropolis_percent` INTEGER, `cart_evropolis_pic` TEXT, `cart_evropolis_text` TEXT, `bonuses_available` INTEGER, `bonuses_balance` INTEGER, `bonuses_applied` INTEGER, `bonuses_tooltip` TEXT DEFAULT '', `receiver_name` TEXT, `receiver_phone` TEXT, `cart_progressbar_title` TEXT, `cart_progressbar_current_value` REAL, `cart_progressbar_needed_value` REAL, `cart_progressbar_values_difference` TEXT, `cart_progressbar_color` TEXT, `cart_progressbar_delivery_terms` TEXT, `unavailable_order_reasoncan_create` INTEGER, `unavailable_order_reasonmessage` TEXT, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `qrs` (`id` TEXT NOT NULL, `code` TEXT NOT NULL, `status` TEXT, `type` TEXT NOT NULL, `lifeTime` INTEGER, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `qr_statuses` (`qrcode_id` TEXT NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`qrcode_id`, `status`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `user_info` (`id` TEXT NOT NULL, `phone` TEXT NOT NULL, `email` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `isActive` INTEGER NOT NULL, `isCardBlocked` INTEGER NOT NULL, `agreementAccepted` INTEGER NOT NULL, `gender` TEXT NOT NULL, `dateBirth` TEXT NOT NULL, `scangoAccess` INTEGER NOT NULL, `webviewToken` TEXT NOT NULL, `gameToken` TEXT NOT NULL, `cardNumber` TEXT NOT NULL, `isEReceiptAccepted` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS `splash_table` (`id` INTEGER NOT NULL, `fileUrl` TEXT NOT NULL, `type` TEXT NOT NULL, `endTime` INTEGER, `showCount` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            lqeggnwhkgVar.lmojexxdyd("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '675ee443b29014bda2f6053b1758e8b1')");
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public zdlpuopuiu.ppxfxbqfkf lqeggnwhkg(u5.lqeggnwhkg lqeggnwhkgVar) {
            HashMap map = new HashMap(12);
            map.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "TEXT", true, 1, null, 1));
            map.put("parent_id", new p5.gxszxtbevo.iobyxmoadg("parent_id", "TEXT", false, 0, null, 1));
            map.put(ExternalMetricsManagerImpl.NAME, new p5.gxszxtbevo.iobyxmoadg(ExternalMetricsManagerImpl.NAME, "TEXT", true, 0, null, 1));
            map.put("pic", new p5.gxszxtbevo.iobyxmoadg("pic", "TEXT", true, 0, null, 1));
            map.put("icon", new p5.gxszxtbevo.iobyxmoadg("icon", "TEXT", true, 0, null, 1));
            map.put("image", new p5.gxszxtbevo.iobyxmoadg("image", "TEXT", true, 0, null, 1));
            map.put("appImage", new p5.gxszxtbevo.iobyxmoadg("appImage", "TEXT", true, 0, "''", 1));
            map.put("icon_png", new p5.gxszxtbevo.iobyxmoadg("icon_png", "TEXT", true, 0, null, 1));
            map.put("age_checked_needed", new p5.gxszxtbevo.iobyxmoadg("age_checked_needed", "INTEGER", true, 0, null, 1));
            map.put("show_on_main", new p5.gxszxtbevo.iobyxmoadg("show_on_main", "INTEGER", true, 0, null, 1));
            map.put("sort_main", new p5.gxszxtbevo.iobyxmoadg("sort_main", "INTEGER", true, 0, null, 1));
            map.put("sort_type", new p5.gxszxtbevo.iobyxmoadg("sort_type", "TEXT", false, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar = new p5.gxszxtbevo("catalogs", map, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "catalogs");
            if (!gxszxtbevoVar.equals(gxszxtbevoVarIobyxmoadg)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "catalogs(ru.myspar.proloyalty.core.data.entity.CatalogSectionEntity).\n Expected:\n" + gxszxtbevoVar + "\n Found:\n" + gxszxtbevoVarIobyxmoadg);
            }
            HashMap map2 = new HashMap(2);
            map2.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "TEXT", true, 1, null, 1));
            map2.put("pickup_status", new p5.gxszxtbevo.iobyxmoadg("pickup_status", "TEXT", true, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar2 = new p5.gxszxtbevo("order_pickup_statuses", map2, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg2 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "order_pickup_statuses");
            if (!gxszxtbevoVar2.equals(gxszxtbevoVarIobyxmoadg2)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "order_pickup_statuses(ru.myspar.proloyalty.core.data.entity.order.OrderPickupStatusEntity).\n Expected:\n" + gxszxtbevoVar2 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg2);
            }
            HashMap map3 = new HashMap(34);
            map3.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "INTEGER", true, 1, null, 1));
            map3.put("order_status", new p5.gxszxtbevo.iobyxmoadg("order_status", "TEXT", true, 0, null, 1));
            map3.put("shop_id", new p5.gxszxtbevo.iobyxmoadg("shop_id", "TEXT", true, 0, null, 1));
            map3.put("delivery", new p5.gxszxtbevo.iobyxmoadg("delivery", "TEXT", false, 0, null, 1));
            map3.put("delivery_area", new p5.gxszxtbevo.iobyxmoadg("delivery_area", "TEXT", true, 0, null, 1));
            map3.put("payment", new p5.gxszxtbevo.iobyxmoadg("payment", "TEXT", true, 0, null, 1));
            map3.put("basket", new p5.gxszxtbevo.iobyxmoadg("basket", "TEXT", true, 0, null, 1));
            map3.put("groups", new p5.gxszxtbevo.iobyxmoadg("groups", "TEXT", true, 0, "''", 1));
            map3.put("total_info", new p5.gxszxtbevo.iobyxmoadg("total_info", "TEXT", false, 0, null, 1));
            map3.put("payments_list", new p5.gxszxtbevo.iobyxmoadg("payments_list", "TEXT", false, 0, null, 1));
            map3.put("promocode_name", new p5.gxszxtbevo.iobyxmoadg("promocode_name", "TEXT", true, 0, null, 1));
            map3.put("promocode_discount", new p5.gxszxtbevo.iobyxmoadg("promocode_discount", "REAL", true, 0, null, 1));
            map3.put("promocode_status", new p5.gxszxtbevo.iobyxmoadg("promocode_status", "INTEGER", true, 0, null, 1));
            map3.put("order_properties_min_price", new p5.gxszxtbevo.iobyxmoadg("order_properties_min_price", "REAL", true, 0, null, 1));
            map3.put("order_properties_date_left", new p5.gxszxtbevo.iobyxmoadg("order_properties_date_left", "TEXT", false, 0, null, 1));
            map3.put("properties_address", new p5.gxszxtbevo.iobyxmoadg("properties_address", "TEXT", true, 0, null, 1));
            map3.put("properties_receiver_first_name", new p5.gxszxtbevo.iobyxmoadg("properties_receiver_first_name", "TEXT", true, 0, null, 1));
            map3.put("properties_receiver_last_name", new p5.gxszxtbevo.iobyxmoadg("properties_receiver_last_name", "TEXT", true, 0, null, 1));
            map3.put("properties_receiver_phone", new p5.gxszxtbevo.iobyxmoadg("properties_receiver_phone", "TEXT", true, 0, null, 1));
            map3.put("properties_receiver_email", new p5.gxszxtbevo.iobyxmoadg("properties_receiver_email", "TEXT", true, 0, null, 1));
            map3.put("properties_date_receipt", new p5.gxszxtbevo.iobyxmoadg("properties_date_receipt", "TEXT", true, 0, null, 1));
            map3.put("properties_internal_delivery", new p5.gxszxtbevo.iobyxmoadg("properties_internal_delivery", "TEXT", true, 0, null, 1));
            map3.put("properties_change", new p5.gxszxtbevo.iobyxmoadg("properties_change", "TEXT", true, 0, null, 1));
            map3.put("properties_order_comments_list", new p5.gxszxtbevo.iobyxmoadg("properties_order_comments_list", "TEXT", false, 0, null, 1));
            map3.put("sum_basket", new p5.gxszxtbevo.iobyxmoadg("sum_basket", "REAL", true, 0, null, 1));
            map3.put("sum_discount", new p5.gxszxtbevo.iobyxmoadg("sum_discount", "REAL", true, 0, null, 1));
            map3.put("sum_delivery", new p5.gxszxtbevo.iobyxmoadg("sum_delivery", "REAL", true, 0, null, 1));
            map3.put("sum_overweight", new p5.gxszxtbevo.iobyxmoadg("sum_overweight", "REAL", true, 0, null, 1));
            map3.put("sum_weight", new p5.gxszxtbevo.iobyxmoadg("sum_weight", "REAL", true, 0, null, 1));
            map3.put("sum_total", new p5.gxszxtbevo.iobyxmoadg("sum_total", "REAL", true, 0, null, 1));
            map3.put("sum_count", new p5.gxszxtbevo.iobyxmoadg("sum_count", "INTEGER", true, 0, null, 1));
            map3.put("sum_old_total", new p5.gxszxtbevo.iobyxmoadg("sum_old_total", "REAL", true, 0, null, 1));
            map3.put("sum_diff_total", new p5.gxszxtbevo.iobyxmoadg("sum_diff_total", "REAL", true, 0, null, 1));
            map3.put("bonuses_applied", new p5.gxszxtbevo.iobyxmoadg("bonuses_applied", "INTEGER", false, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar3 = new p5.gxszxtbevo("editable_orders", map3, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg3 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "editable_orders");
            if (!gxszxtbevoVar3.equals(gxszxtbevoVarIobyxmoadg3)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "editable_orders(ru.myspar.proloyalty.core.data.entity.order.OrderEditEntity).\n Expected:\n" + gxszxtbevoVar3 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg3);
            }
            HashMap map4 = new HashMap(9);
            map4.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "INTEGER", true, 1, null, 1));
            map4.put("session_expires_at", new p5.gxszxtbevo.iobyxmoadg("session_expires_at", "TEXT", true, 0, null, 1));
            map4.put("seconds_to_complete", new p5.gxszxtbevo.iobyxmoadg("seconds_to_complete", "INTEGER", true, 0, null, 1));
            map4.put("shop_id", new p5.gxszxtbevo.iobyxmoadg("shop_id", "TEXT", true, 0, null, 1));
            map4.put("total_cost", new p5.gxszxtbevo.iobyxmoadg("total_cost", "REAL", true, 0, null, 1));
            map4.put("number_of_products", new p5.gxszxtbevo.iobyxmoadg("number_of_products", "INTEGER", true, 0, null, 1));
            map4.put("products", new p5.gxszxtbevo.iobyxmoadg("products", "TEXT", true, 0, null, 1));
            map4.put("need_verify", new p5.gxszxtbevo.iobyxmoadg("need_verify", "INTEGER", false, 0, null, 1));
            map4.put("cart_references_payment", new p5.gxszxtbevo.iobyxmoadg("cart_references_payment", "TEXT", false, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar4 = new p5.gxszxtbevo("scan_go_cart", map4, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg4 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "scan_go_cart");
            if (!gxszxtbevoVar4.equals(gxszxtbevoVarIobyxmoadg4)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "scan_go_cart(ru.myspar.proloyalty.core.data.entity.ScanGoCartEntity).\n Expected:\n" + gxszxtbevoVar4 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg4);
            }
            HashMap map5 = new HashMap(8);
            map5.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "INTEGER", true, 1, null, 1));
            map5.put("article", new p5.gxszxtbevo.iobyxmoadg("article", "TEXT", true, 0, null, 1));
            map5.put("measure", new p5.gxszxtbevo.iobyxmoadg("measure", "TEXT", true, 0, null, 1));
            map5.put(ExternalMetricsManagerImpl.NAME, new p5.gxszxtbevo.iobyxmoadg(ExternalMetricsManagerImpl.NAME, "TEXT", true, 0, null, 1));
            map5.put("picture_url", new p5.gxszxtbevo.iobyxmoadg("picture_url", "TEXT", false, 0, null, 1));
            map5.put("price", new p5.gxszxtbevo.iobyxmoadg("price", "REAL", true, 0, null, 1));
            map5.put("quantity", new p5.gxszxtbevo.iobyxmoadg("quantity", "REAL", true, 0, null, 1));
            map5.put("mark_codes", new p5.gxszxtbevo.iobyxmoadg("mark_codes", "TEXT", false, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar5 = new p5.gxszxtbevo("scan_go_product", map5, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg5 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "scan_go_product");
            if (!gxszxtbevoVar5.equals(gxszxtbevoVarIobyxmoadg5)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "scan_go_product(ru.myspar.proloyalty.core.data.entity.ScanGoProductEntity).\n Expected:\n" + gxszxtbevoVar5 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg5);
            }
            HashMap map6 = new HashMap(50);
            map6.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "INTEGER", true, 1, null, 1));
            map6.put("partner_code", new p5.gxszxtbevo.iobyxmoadg("partner_code", "TEXT", false, 0, null, 1));
            map6.put("basket", new p5.gxszxtbevo.iobyxmoadg("basket", "TEXT", false, 0, null, 1));
            map6.put("payment", new p5.gxszxtbevo.iobyxmoadg("payment", "TEXT", false, 0, null, 1));
            map6.put("cart_info_list", new p5.gxszxtbevo.iobyxmoadg("cart_info_list", "TEXT", false, 0, null, 1));
            map6.put("order_sum", new p5.gxszxtbevo.iobyxmoadg("order_sum", "REAL", true, 0, "0.0", 1));
            map6.put("order_sum_no_discounts", new p5.gxszxtbevo.iobyxmoadg("order_sum_no_discounts", "TEXT", true, 0, "''", 1));
            map6.put("order_comments_list", new p5.gxszxtbevo.iobyxmoadg("order_comments_list", "TEXT", false, 0, null, 1));
            map6.put("payments_list", new p5.gxszxtbevo.iobyxmoadg("payments_list", "TEXT", false, 0, null, 1));
            map6.put("delivery_info_title", new p5.gxszxtbevo.iobyxmoadg("delivery_info_title", "TEXT", true, 0, "''", 1));
            map6.put("delivery_info_subtitle", new p5.gxszxtbevo.iobyxmoadg("delivery_info_subtitle", "TEXT", true, 0, "''", 1));
            map6.put("delivery_info_price", new p5.gxszxtbevo.iobyxmoadg("delivery_info_price", "TEXT", false, 0, null, 1));
            map6.put("delivery_info_delivery_type", new p5.gxszxtbevo.iobyxmoadg("delivery_info_delivery_type", "TEXT", false, 0, null, 1));
            map6.put("delivery_info_shop_id", new p5.gxszxtbevo.iobyxmoadg("delivery_info_shop_id", "TEXT", false, 0, null, 1));
            map6.put("interval_info_title", new p5.gxszxtbevo.iobyxmoadg("interval_info_title", "TEXT", false, 0, null, 1));
            map6.put("interval_info_subtitle", new p5.gxszxtbevo.iobyxmoadg("interval_info_subtitle", "TEXT", false, 0, null, 1));
            map6.put("interval_info_date", new p5.gxszxtbevo.iobyxmoadg("interval_info_date", "TEXT", false, 0, null, 1));
            map6.put("interval_info_time", new p5.gxszxtbevo.iobyxmoadg("interval_info_time", "TEXT", false, 0, null, 1));
            map6.put("interval_info_is_only_one", new p5.gxszxtbevo.iobyxmoadg("interval_info_is_only_one", "INTEGER", false, 0, null, 1));
            map6.put("order_properties_min_price", new p5.gxszxtbevo.iobyxmoadg("order_properties_min_price", "REAL", false, 0, null, 1));
            map6.put("order_properties_free_delivery_from", new p5.gxszxtbevo.iobyxmoadg("order_properties_free_delivery_from", "REAL", false, 0, null, 1));
            map6.put("order_properties_basket_sum", new p5.gxszxtbevo.iobyxmoadg("order_properties_basket_sum", "REAL", false, 0, null, 1));
            map6.put("sum_basket", new p5.gxszxtbevo.iobyxmoadg("sum_basket", "REAL", false, 0, null, 1));
            map6.put("sum_discount", new p5.gxszxtbevo.iobyxmoadg("sum_discount", "REAL", false, 0, null, 1));
            map6.put("sum_delivery", new p5.gxszxtbevo.iobyxmoadg("sum_delivery", "REAL", false, 0, null, 1));
            map6.put("sum_overweight", new p5.gxszxtbevo.iobyxmoadg("sum_overweight", "REAL", false, 0, null, 1));
            map6.put("sum_weight", new p5.gxszxtbevo.iobyxmoadg("sum_weight", "REAL", false, 0, null, 1));
            map6.put("sum_total", new p5.gxszxtbevo.iobyxmoadg("sum_total", "REAL", false, 0, null, 1));
            map6.put("sum_count", new p5.gxszxtbevo.iobyxmoadg("sum_count", "INTEGER", false, 0, null, 1));
            map6.put("promocode_name", new p5.gxszxtbevo.iobyxmoadg("promocode_name", "TEXT", false, 0, null, 1));
            map6.put("promocode_status", new p5.gxszxtbevo.iobyxmoadg("promocode_status", "INTEGER", false, 0, null, 1));
            map6.put("promocode_discount", new p5.gxszxtbevo.iobyxmoadg("promocode_discount", "REAL", false, 0, null, 1));
            map6.put("promocode_status_text", new p5.gxszxtbevo.iobyxmoadg("promocode_status_text", "TEXT", false, 0, "''", 1));
            map6.put("cart_evropolis_percent", new p5.gxszxtbevo.iobyxmoadg("cart_evropolis_percent", "INTEGER", false, 0, null, 1));
            map6.put("cart_evropolis_pic", new p5.gxszxtbevo.iobyxmoadg("cart_evropolis_pic", "TEXT", false, 0, null, 1));
            map6.put("cart_evropolis_text", new p5.gxszxtbevo.iobyxmoadg("cart_evropolis_text", "TEXT", false, 0, null, 1));
            map6.put("bonuses_available", new p5.gxszxtbevo.iobyxmoadg("bonuses_available", "INTEGER", false, 0, null, 1));
            map6.put("bonuses_balance", new p5.gxszxtbevo.iobyxmoadg("bonuses_balance", "INTEGER", false, 0, null, 1));
            map6.put("bonuses_applied", new p5.gxszxtbevo.iobyxmoadg("bonuses_applied", "INTEGER", false, 0, null, 1));
            map6.put("bonuses_tooltip", new p5.gxszxtbevo.iobyxmoadg("bonuses_tooltip", "TEXT", false, 0, "''", 1));
            map6.put("receiver_name", new p5.gxszxtbevo.iobyxmoadg("receiver_name", "TEXT", false, 0, null, 1));
            map6.put("receiver_phone", new p5.gxszxtbevo.iobyxmoadg("receiver_phone", "TEXT", false, 0, null, 1));
            map6.put("cart_progressbar_title", new p5.gxszxtbevo.iobyxmoadg("cart_progressbar_title", "TEXT", false, 0, null, 1));
            map6.put("cart_progressbar_current_value", new p5.gxszxtbevo.iobyxmoadg("cart_progressbar_current_value", "REAL", false, 0, null, 1));
            map6.put("cart_progressbar_needed_value", new p5.gxszxtbevo.iobyxmoadg("cart_progressbar_needed_value", "REAL", false, 0, null, 1));
            map6.put("cart_progressbar_values_difference", new p5.gxszxtbevo.iobyxmoadg("cart_progressbar_values_difference", "TEXT", false, 0, null, 1));
            map6.put("cart_progressbar_color", new p5.gxszxtbevo.iobyxmoadg("cart_progressbar_color", "TEXT", false, 0, null, 1));
            map6.put("cart_progressbar_delivery_terms", new p5.gxszxtbevo.iobyxmoadg("cart_progressbar_delivery_terms", "TEXT", false, 0, null, 1));
            map6.put("unavailable_order_reasoncan_create", new p5.gxszxtbevo.iobyxmoadg("unavailable_order_reasoncan_create", "INTEGER", false, 0, null, 1));
            map6.put("unavailable_order_reasonmessage", new p5.gxszxtbevo.iobyxmoadg("unavailable_order_reasonmessage", "TEXT", false, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar6 = new p5.gxszxtbevo("cart", map6, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg6 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "cart");
            if (!gxszxtbevoVar6.equals(gxszxtbevoVarIobyxmoadg6)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "cart(ru.myspar.proloyalty.core.data.entity.cart.CartEntity).\n Expected:\n" + gxszxtbevoVar6 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg6);
            }
            HashMap map7 = new HashMap(5);
            map7.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "TEXT", true, 1, null, 1));
            map7.put("code", new p5.gxszxtbevo.iobyxmoadg("code", "TEXT", true, 0, null, 1));
            map7.put("status", new p5.gxszxtbevo.iobyxmoadg("status", "TEXT", false, 0, null, 1));
            map7.put("type", new p5.gxszxtbevo.iobyxmoadg("type", "TEXT", true, 0, null, 1));
            map7.put("lifeTime", new p5.gxszxtbevo.iobyxmoadg("lifeTime", "INTEGER", false, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar7 = new p5.gxszxtbevo("qrs", map7, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg7 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "qrs");
            if (!gxszxtbevoVar7.equals(gxszxtbevoVarIobyxmoadg7)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "qrs(ru.myspar.proloyalty.qr.data.entity.QrEntity).\n Expected:\n" + gxszxtbevoVar7 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg7);
            }
            HashMap map8 = new HashMap(2);
            map8.put("qrcode_id", new p5.gxszxtbevo.iobyxmoadg("qrcode_id", "TEXT", true, 1, null, 1));
            map8.put("status", new p5.gxszxtbevo.iobyxmoadg("status", "TEXT", true, 2, null, 1));
            p5.gxszxtbevo gxszxtbevoVar8 = new p5.gxszxtbevo("qr_statuses", map8, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg8 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "qr_statuses");
            if (!gxszxtbevoVar8.equals(gxszxtbevoVarIobyxmoadg8)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "qr_statuses(ru.myspar.proloyalty.qr.data.entity.QrStatusActionEntity).\n Expected:\n" + gxszxtbevoVar8 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg8);
            }
            HashMap map9 = new HashMap(15);
            map9.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "TEXT", true, 1, null, 1));
            map9.put("phone", new p5.gxszxtbevo.iobyxmoadg("phone", "TEXT", true, 0, null, 1));
            map9.put(Scopes.EMAIL, new p5.gxszxtbevo.iobyxmoadg(Scopes.EMAIL, "TEXT", true, 0, null, 1));
            map9.put("firstName", new p5.gxszxtbevo.iobyxmoadg("firstName", "TEXT", true, 0, null, 1));
            map9.put("lastName", new p5.gxszxtbevo.iobyxmoadg("lastName", "TEXT", true, 0, null, 1));
            map9.put("isActive", new p5.gxszxtbevo.iobyxmoadg("isActive", "INTEGER", true, 0, null, 1));
            map9.put("isCardBlocked", new p5.gxszxtbevo.iobyxmoadg("isCardBlocked", "INTEGER", true, 0, null, 1));
            map9.put("agreementAccepted", new p5.gxszxtbevo.iobyxmoadg("agreementAccepted", "INTEGER", true, 0, null, 1));
            map9.put("gender", new p5.gxszxtbevo.iobyxmoadg("gender", "TEXT", true, 0, null, 1));
            map9.put("dateBirth", new p5.gxszxtbevo.iobyxmoadg("dateBirth", "TEXT", true, 0, null, 1));
            map9.put("scangoAccess", new p5.gxszxtbevo.iobyxmoadg("scangoAccess", "INTEGER", true, 0, null, 1));
            map9.put("webviewToken", new p5.gxszxtbevo.iobyxmoadg("webviewToken", "TEXT", true, 0, null, 1));
            map9.put("gameToken", new p5.gxszxtbevo.iobyxmoadg("gameToken", "TEXT", true, 0, null, 1));
            map9.put("cardNumber", new p5.gxszxtbevo.iobyxmoadg("cardNumber", "TEXT", true, 0, null, 1));
            map9.put("isEReceiptAccepted", new p5.gxszxtbevo.iobyxmoadg("isEReceiptAccepted", "INTEGER", true, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar9 = new p5.gxszxtbevo("user_info", map9, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg9 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "user_info");
            if (!gxszxtbevoVar9.equals(gxszxtbevoVarIobyxmoadg9)) {
                return new zdlpuopuiu.ppxfxbqfkf(false, "user_info(ru.myspar.proloyalty.user.data.entity.UserInfoEntity).\n Expected:\n" + gxszxtbevoVar9 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg9);
            }
            HashMap map10 = new HashMap(5);
            map10.put("id", new p5.gxszxtbevo.iobyxmoadg("id", "INTEGER", true, 1, null, 1));
            map10.put("fileUrl", new p5.gxszxtbevo.iobyxmoadg("fileUrl", "TEXT", true, 0, null, 1));
            map10.put("type", new p5.gxszxtbevo.iobyxmoadg("type", "TEXT", true, 0, null, 1));
            map10.put("endTime", new p5.gxszxtbevo.iobyxmoadg("endTime", "INTEGER", false, 0, null, 1));
            map10.put("showCount", new p5.gxszxtbevo.iobyxmoadg("showCount", "INTEGER", true, 0, null, 1));
            p5.gxszxtbevo gxszxtbevoVar10 = new p5.gxszxtbevo("splash_table", map10, new HashSet(0), new HashSet(0));
            p5.gxszxtbevo gxszxtbevoVarIobyxmoadg10 = p5.gxszxtbevo.iobyxmoadg(lqeggnwhkgVar, "splash_table");
            if (gxszxtbevoVar10.equals(gxszxtbevoVarIobyxmoadg10)) {
                return new zdlpuopuiu.ppxfxbqfkf(true, null);
            }
            return new zdlpuopuiu.ppxfxbqfkf(false, "splash_table(ru.myspar.proloyalty.splash.data.entity.SplashEntity).\n Expected:\n" + gxszxtbevoVar10 + "\n Found:\n" + gxszxtbevoVarIobyxmoadg10);
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void ppxfxbqfkf(u5.lqeggnwhkg lqeggnwhkgVar) {
            List list = ((oxmwwwfdhm) AppRoomDatabase_Impl.this).f68847nufgyqmvbu;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((oxmwwwfdhm.zoijcleaow) it.next()).iobyxmoadg(lqeggnwhkgVar);
                }
            }
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void wkgbmnqykc(u5.lqeggnwhkg lqeggnwhkgVar) {
            ((oxmwwwfdhm) AppRoomDatabase_Impl.this).f68845iobyxmoadg = lqeggnwhkgVar;
            AppRoomDatabase_Impl.this.wwaezpbzkn(lqeggnwhkgVar);
            List list = ((oxmwwwfdhm) AppRoomDatabase_Impl.this).f68847nufgyqmvbu;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((oxmwwwfdhm.zoijcleaow) it.next()).ppxfxbqfkf(lqeggnwhkgVar);
                }
            }
        }

        @Override // n5.zdlpuopuiu.zoijcleaow
        public void zoijcleaow(u5.lqeggnwhkg lqeggnwhkgVar) {
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `catalogs`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `order_pickup_statuses`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `editable_orders`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `scan_go_cart`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `scan_go_product`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `cart`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `qrs`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `qr_statuses`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `user_info`");
            lqeggnwhkgVar.lmojexxdyd("DROP TABLE IF EXISTS `splash_table`");
            List list = ((oxmwwwfdhm) AppRoomDatabase_Impl.this).f68847nufgyqmvbu;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((oxmwwwfdhm.zoijcleaow) it.next()).zoijcleaow(lqeggnwhkgVar);
                }
            }
        }
    }

    @Override // w41.iobyxmoadg
    public yv1.iobyxmoadg btonecajqb() {
        yv1.iobyxmoadg iobyxmoadgVar;
        if (this.f95384cqumvgiudr != null) {
            return this.f95384cqumvgiudr;
        }
        synchronized (this) {
            try {
                if (this.f95384cqumvgiudr == null) {
                    this.f95384cqumvgiudr = new yv1.zoijcleaow(this);
                }
                iobyxmoadgVar = this.f95384cqumvgiudr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iobyxmoadgVar;
    }

    @Override // w41.iobyxmoadg
    public rk1.ppxfxbqfkf dxjokdxxww() {
        rk1.ppxfxbqfkf ppxfxbqfkfVar;
        if (this.f95387jyumaefscl != null) {
            return this.f95387jyumaefscl;
        }
        synchronized (this) {
            try {
                if (this.f95387jyumaefscl == null) {
                    this.f95387jyumaefscl = new rk1.eablkybsjg(this);
                }
                ppxfxbqfkfVar = this.f95387jyumaefscl;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ppxfxbqfkfVar;
    }

    @Override // w41.iobyxmoadg
    public yw0.ppxfxbqfkf eablkybsjg() {
        yw0.ppxfxbqfkf ppxfxbqfkfVar;
        if (this.f95390vdvldrhtss != null) {
            return this.f95390vdvldrhtss;
        }
        synchronized (this) {
            try {
                if (this.f95390vdvldrhtss == null) {
                    this.f95390vdvldrhtss = new yw0.wkgbmnqykc(this);
                }
                ppxfxbqfkfVar = this.f95390vdvldrhtss;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ppxfxbqfkfVar;
    }

    @Override // w41.iobyxmoadg
    public yw0.lqeggnwhkg gxszxtbevo() {
        yw0.lqeggnwhkg lqeggnwhkgVar;
        if (this.f95388kcexrzcfyt != null) {
            return this.f95388kcexrzcfyt;
        }
        synchronized (this) {
            try {
                if (this.f95388kcexrzcfyt == null) {
                    this.f95388kcexrzcfyt = new yw0.nufgyqmvbu(this);
                }
                lqeggnwhkgVar = this.f95388kcexrzcfyt;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lqeggnwhkgVar;
    }

    @Override // w41.iobyxmoadg
    public yw0.dxjokdxxww iobyxmoadg() {
        yw0.dxjokdxxww dxjokdxxwwVar;
        if (this.f95392zdlpuopuiu != null) {
            return this.f95392zdlpuopuiu;
        }
        synchronized (this) {
            try {
                if (this.f95392zdlpuopuiu == null) {
                    this.f95392zdlpuopuiu = new yw0.btonecajqb(this);
                }
                dxjokdxxwwVar = this.f95392zdlpuopuiu;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dxjokdxxwwVar;
    }

    @Override // n5.oxmwwwfdhm
    public Set lereixgezr() {
        return new HashSet();
    }

    @Override // w41.iobyxmoadg
    public rk1.iobyxmoadg lqeggnwhkg() {
        rk1.iobyxmoadg iobyxmoadgVar;
        if (this.f95386iwizpuwonk != null) {
            return this.f95386iwizpuwonk;
        }
        synchronized (this) {
            try {
                if (this.f95386iwizpuwonk == null) {
                    this.f95386iwizpuwonk = new rk1.zoijcleaow(this);
                }
                iobyxmoadgVar = this.f95386iwizpuwonk;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iobyxmoadgVar;
    }

    @Override // n5.oxmwwwfdhm
    protected u5.nufgyqmvbu oxmwwwfdhm(n5.lqeggnwhkg lqeggnwhkgVar) {
        return lqeggnwhkgVar.f68830ppxfxbqfkf.iobyxmoadg(u5.nufgyqmvbu.zoijcleaow.iobyxmoadg(lqeggnwhkgVar.f68824iobyxmoadg).wkgbmnqykc(lqeggnwhkgVar.f68835zoijcleaow).ppxfxbqfkf(new zdlpuopuiu(lqeggnwhkgVar, new iobyxmoadg(37), "675ee443b29014bda2f6053b1758e8b1", "8c2e49ccf59d1be351c2099ae65a3e9e")).zoijcleaow());
    }

    @Override // n5.oxmwwwfdhm
    protected Map pmvmpeiblj() {
        HashMap map = new HashMap();
        map.put(yw0.ppxfxbqfkf.class, yw0.wkgbmnqykc.lqeggnwhkg());
        map.put(yw0.eablkybsjg.class, yw0.gxszxtbevo.nufgyqmvbu());
        map.put(yw0.lqeggnwhkg.class, yw0.nufgyqmvbu.oxmwwwfdhm());
        map.put(yw0.dxjokdxxww.class, yw0.btonecajqb.rgvfuqvkyq());
        map.put(yw0.iobyxmoadg.class, yw0.zoijcleaow.wflxmlrfwp());
        map.put(rk1.ppxfxbqfkf.class, rk1.eablkybsjg.lereixgezr());
        map.put(rk1.iobyxmoadg.class, rk1.zoijcleaow.rgvfuqvkyq());
        map.put(yv1.iobyxmoadg.class, yv1.zoijcleaow.nufgyqmvbu());
        map.put(bt1.iobyxmoadg.class, bt1.zoijcleaow.btonecajqb());
        return map;
    }

    @Override // w41.iobyxmoadg
    public bt1.iobyxmoadg ppxfxbqfkf() {
        bt1.iobyxmoadg iobyxmoadgVar;
        if (this.f95385esjtqupxsv != null) {
            return this.f95385esjtqupxsv;
        }
        synchronized (this) {
            try {
                if (this.f95385esjtqupxsv == null) {
                    this.f95385esjtqupxsv = new bt1.zoijcleaow(this);
                }
                iobyxmoadgVar = this.f95385esjtqupxsv;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iobyxmoadgVar;
    }

    @Override // n5.oxmwwwfdhm
    protected androidx.room.wkgbmnqykc vdvldrhtss() {
        return new androidx.room.wkgbmnqykc(this, new HashMap(0), new HashMap(0), "catalogs", "order_pickup_statuses", "editable_orders", "scan_go_cart", "scan_go_product", "cart", "qrs", "qr_statuses", "user_info", "splash_table");
    }

    @Override // w41.iobyxmoadg
    public yw0.iobyxmoadg wkgbmnqykc() {
        yw0.iobyxmoadg iobyxmoadgVar;
        if (this.f95391yggfygwlhe != null) {
            return this.f95391yggfygwlhe;
        }
        synchronized (this) {
            try {
                if (this.f95391yggfygwlhe == null) {
                    this.f95391yggfygwlhe = new yw0.zoijcleaow(this);
                }
                iobyxmoadgVar = this.f95391yggfygwlhe;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iobyxmoadgVar;
    }

    @Override // n5.oxmwwwfdhm
    public List zdlpuopuiu(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ru.myspar.proloyalty.database.impl.iobyxmoadg());
        arrayList.add(new zoijcleaow());
        arrayList.add(new ppxfxbqfkf());
        arrayList.add(new wkgbmnqykc());
        arrayList.add(new eablkybsjg());
        arrayList.add(new gxszxtbevo());
        arrayList.add(new lqeggnwhkg());
        arrayList.add(new nufgyqmvbu());
        arrayList.add(new dxjokdxxww());
        arrayList.add(new btonecajqb());
        arrayList.add(new gtknphoqwx());
        arrayList.add(new draadjrbmk());
        arrayList.add(new wflxmlrfwp());
        arrayList.add(new agtfadlqog());
        return arrayList;
    }

    @Override // w41.iobyxmoadg
    public yw0.eablkybsjg zoijcleaow() {
        yw0.eablkybsjg eablkybsjgVar;
        if (this.f95389oxmwwwfdhm != null) {
            return this.f95389oxmwwwfdhm;
        }
        synchronized (this) {
            try {
                if (this.f95389oxmwwwfdhm == null) {
                    this.f95389oxmwwwfdhm = new yw0.gxszxtbevo(this);
                }
                eablkybsjgVar = this.f95389oxmwwwfdhm;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eablkybsjgVar;
    }
}
