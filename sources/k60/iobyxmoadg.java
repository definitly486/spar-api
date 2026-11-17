package k60;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f53908iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final o5.zoijcleaow f53913zoijcleaow = new C1157iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final o5.zoijcleaow f53911ppxfxbqfkf = new zoijcleaow();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final o5.zoijcleaow f53912wkgbmnqykc = new ppxfxbqfkf();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final o5.zoijcleaow f53905eablkybsjg = new wkgbmnqykc();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final o5.zoijcleaow f53907gxszxtbevo = new eablkybsjg();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final o5.zoijcleaow f53909lqeggnwhkg = new gxszxtbevo();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final o5.zoijcleaow f53910nufgyqmvbu = new lqeggnwhkg();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final o5.zoijcleaow f53904dxjokdxxww = new nufgyqmvbu();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final o5.zoijcleaow f53902btonecajqb = new dxjokdxxww();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final o5.zoijcleaow f53906gtknphoqwx = new btonecajqb();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final o5.zoijcleaow f53903draadjrbmk = new gtknphoqwx();

    public static final class btonecajqb extends o5.zoijcleaow {
        btonecajqb() {
            super(21, 22);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE cart ADD COLUMN 'cart_evropolis_percent' INT NULL");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE cart ADD COLUMN 'cart_evropolis_pic' TEXT NULL");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE cart ADD COLUMN 'cart_evropolis_text' TEXT NULL");
        }
    }

    public static final class dxjokdxxww extends o5.zoijcleaow {
        dxjokdxxww() {
            super(20, 21);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE cart ADD COLUMN 'properties_for_courier' TEXT DEFAULT ''");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE editable_orders ADD COLUMN 'properties_for_courier' TEXT NOT NULL DEFAULT ''");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE editable_orders ADD COLUMN 'references_for_courier' TEXT NOT NULL DEFAULT ''");
        }
    }

    public static final class eablkybsjg extends o5.zoijcleaow {
        eablkybsjg() {
            super(16, 17);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE catalogs ADD COLUMN 'show_on_main' INTEGER NOT NULL DEFAULT 0");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE catalogs ADD COLUMN 'sort_main' INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static final class gtknphoqwx extends o5.zoijcleaow {
        gtknphoqwx() {
            super(26, 27);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "CREATE TABLE IF NOT EXISTS `editable_orders_tmp` (`id` INTEGER NOT NULL, `order_status` TEXT NOT NULL, `city_id` TEXT NOT NULL, `shop_id` TEXT NOT NULL, `delivery` TEXT NULL, `address_id` INTEGER NOT NULL, `delivery_area` TEXT NOT NULL, `payment` TEXT NOT NULL, `basket` TEXT NOT NULL, `promocode_name` TEXT NOT NULL, `promocode_discount` REAL NOT NULL, `promocode_status` INTEGER NOT NULL, `order_properties_min_price` REAL NOT NULL, `order_properties_date_left` TEXT, `properties_address` TEXT NOT NULL, `properties_receiver_first_name` TEXT NOT NULL, `properties_receiver_last_name` TEXT NOT NULL, `properties_receiver_phone` TEXT NOT NULL, `properties_receiver_email` TEXT NOT NULL, `properties_date_receipt` TEXT NOT NULL, `properties_change` TEXT NOT NULL, `properties_for_courier` TEXT NOT NULL, `properties_internal_delivery` TEXT NOT NULL, `properties_comments` TEXT, `properties_for_stock_packer` TEXT NOT NULL, `properties_additional` TEXT NOT NULL, `references_payment` TEXT NOT NULL, `references_for_stock_packer` TEXT NOT NULL, `references_additional` TEXT NOT NULL, `references_add_params_delivery` TEXT NOT NULL, `references_for_courier` TEXT NOT NULL, `sum_basket` REAL NOT NULL, `sum_discount` REAL NOT NULL, `sum_delivery` REAL NOT NULL, `sum_overweight` REAL NOT NULL, `sum_weight` REAL NOT NULL, `sum_total` REAL NOT NULL, `sum_count` INTEGER NOT NULL, `sum_old_total` REAL NOT NULL, `sum_diff_total` REAL NOT NULL, `bonuses_applied` INT NULL, PRIMARY KEY(`id`))");
            k60.zoijcleaow.iobyxmoadg(db3, "INSERT INTO `editable_orders_tmp` (`id`, `order_status`, `city_id`, `shop_id`, `delivery`, `address_id`, `delivery_area`, `payment`, `basket`, `promocode_name`, `promocode_discount`, `promocode_status`, `order_properties_min_price`, `order_properties_date_left`, `properties_address`, `properties_receiver_first_name`, `properties_receiver_last_name`, `properties_receiver_phone`, `properties_receiver_email`, `properties_date_receipt`, `properties_internal_delivery`, `properties_comments`, `properties_for_stock_packer`, `properties_additional`, `properties_change`, `properties_for_courier`, `references_payment`, `references_for_stock_packer`, `references_for_courier`, `references_additional`, `references_add_params_delivery`, `sum_basket`, `sum_discount`, `sum_delivery`, `sum_overweight`, `sum_weight`, `sum_total`, `sum_count`, `sum_old_total`, `sum_diff_total`, `bonuses_applied`) SELECT `id`, `order_status`, `city_id`, `shop_id`, `delivery`, `address_id`, `delivery_area`, `payment`, `basket`, `promocode_name`, `promocode_discount`, `promocode_status`, `order_properties_min_price`, `order_properties_date_left`, `properties_address`, `properties_change`, `properties_for_courier`, `properties_receiver_first_name`, `properties_receiver_last_name`, `properties_receiver_phone`, `properties_receiver_email`, `properties_date_receipt`, `properties_internal_delivery`, `properties_comments`, `properties_for_stock_packer`, `properties_additional`, `references_for_courier`, `references_payment`, `references_for_stock_packer`, `references_additional`, `references_add_params_delivery`, `sum_basket`, `sum_discount`, `sum_delivery`, `sum_overweight`, `sum_weight`, `sum_total`, `sum_count`, `sum_old_total`, `sum_diff_total`, `bonuses_applied` FROM `editable_orders`");
            k60.zoijcleaow.iobyxmoadg(db3, "DROP TABLE `editable_orders`");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE `editable_orders_tmp` RENAME TO `editable_orders`");
        }
    }

    public static final class gxszxtbevo extends o5.zoijcleaow {
        gxszxtbevo() {
            super(17, 18);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE users ADD COLUMN 'segments' TEXT DEFAULT ''");
        }
    }

    /* JADX INFO: renamed from: k60.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1157iobyxmoadg extends o5.zoijcleaow {
        C1157iobyxmoadg() {
            super(12, 13);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE 'cart' ADD COLUMN 'partner_code' TEXT");
        }
    }

    public static final class lqeggnwhkg extends o5.zoijcleaow {
        lqeggnwhkg() {
            super(18, 19);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE users ADD COLUMN 'discounts_new' INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static final class nufgyqmvbu extends o5.zoijcleaow {
        nufgyqmvbu() {
            super(19, 20);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE cart ADD COLUMN 'order_properties_basket_sum' REAL");
        }
    }

    public static final class ppxfxbqfkf extends o5.zoijcleaow {
        ppxfxbqfkf() {
            super(14, 15);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "CREATE TABLE IF NOT EXISTS `editable_orders_tmp` (`id` INTEGER NOT NULL, `order_status` TEXT NOT NULL, `city_id` TEXT NOT NULL, `shop_id` TEXT NOT NULL, `delivery` TEXT NOT NULL, `address_id` INTEGER NOT NULL, `delivery_area` TEXT NOT NULL, `payment` TEXT NOT NULL, `basket` TEXT NOT NULL, `promocode_name` TEXT NOT NULL, `promocode_discount` REAL NOT NULL, `promocode_status` INTEGER NOT NULL, `order_properties_min_price` REAL NOT NULL, `order_properties_date_left` TEXT, `properties_address` TEXT NOT NULL, `properties_receiver_first_name` TEXT NOT NULL, `properties_receiver_last_name` TEXT NOT NULL, `properties_receiver_phone` TEXT NOT NULL, `properties_receiver_email` TEXT NOT NULL, `properties_date_receipt` TEXT NOT NULL, `properties_internal_delivery` TEXT NOT NULL, `properties_comments` TEXT, `properties_for_stock_packer` TEXT NOT NULL, `properties_additional` TEXT NOT NULL, `references_payment` TEXT NOT NULL, `references_for_stock_packer` TEXT NOT NULL, `references_additional` TEXT NOT NULL, `references_add_params_delivery` TEXT NOT NULL, `sum_basket` REAL NOT NULL, `sum_discount` REAL NOT NULL, `sum_delivery` REAL NOT NULL, `sum_overweight` REAL NOT NULL, `sum_weight` REAL NOT NULL, `sum_total` REAL NOT NULL, `sum_count` INTEGER NOT NULL, `sum_old_total` REAL NOT NULL, `sum_diff_total` REAL NOT NULL, PRIMARY KEY(`id`))");
            k60.zoijcleaow.iobyxmoadg(db3, "INSERT INTO `editable_orders_tmp` (`id`, `order_status`, `city_id`, `shop_id`, `delivery`, `address_id`, `delivery_area`, `payment`, `basket`, `promocode_name`, `promocode_discount`, `promocode_status`, `order_properties_min_price`, `order_properties_date_left`, `properties_address`, `properties_receiver_first_name`, `properties_receiver_last_name`, `properties_receiver_phone`, `properties_receiver_email`, `properties_date_receipt`, `properties_internal_delivery`, `properties_comments`, `properties_for_stock_packer`, `properties_additional`, `references_payment`, `references_for_stock_packer`, `references_additional`, `references_add_params_delivery`, `sum_basket`, `sum_discount`, `sum_delivery`, `sum_overweight`, `sum_weight`, `sum_total`, `sum_count`, `sum_old_total`, `sum_diff_total`) SELECT `id`, `order_status`, `city_id`, `shop_id`, `delivery`, `address_id`, `delivery_area`, `payment`, `basket`, `promocode_name`, `promocode_discount`, `promocode_status`, `order_properties_min_price`, `order_properties_date_left`, `properties_address`, `properties_receiver_first_name`, `properties_receiver_last_name`, `properties_receiver_phone`, `properties_receiver_email`, `properties_date_receipt`, `properties_internal_delivery`, `properties_comments`, `properties_for_stock_packer`, `properties_additional`, `references_payment`, `references_for_stock_packer`, `references_additional`, `references_add_params_delivery`, `sum_basket`, `sum_discount`, `sum_delivery`, `sum_overweight`, `sum_weight`, `sum_total`, `sum_count`, `sum_old_total`, `sum_diff_total` FROM `editable_orders`");
            k60.zoijcleaow.iobyxmoadg(db3, "DROP TABLE `editable_orders`");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE `editable_orders_tmp` RENAME TO `editable_orders`");
        }
    }

    public static final class wkgbmnqykc extends o5.zoijcleaow {
        wkgbmnqykc() {
            super(15, 16);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE editable_orders ADD COLUMN 'properties_change' TEXT NOT NULL DEFAULT ''");
        }
    }

    public static final class zoijcleaow extends o5.zoijcleaow {
        zoijcleaow() {
            super(13, 14);
        }

        @Override // o5.zoijcleaow
        public void iobyxmoadg(u5.lqeggnwhkg db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            k60.zoijcleaow.iobyxmoadg(db3, "ALTER TABLE 'scan_go_product' ADD COLUMN 'mark_codes' TEXT");
        }
    }

    private iobyxmoadg() {
    }

    public final o5.zoijcleaow btonecajqb() {
        return f53906gtknphoqwx;
    }

    public final o5.zoijcleaow dxjokdxxww() {
        return f53902btonecajqb;
    }

    public final o5.zoijcleaow eablkybsjg() {
        return f53907gxszxtbevo;
    }

    public final o5.zoijcleaow gtknphoqwx() {
        return f53903draadjrbmk;
    }

    public final o5.zoijcleaow gxszxtbevo() {
        return f53909lqeggnwhkg;
    }

    public final o5.zoijcleaow iobyxmoadg() {
        return f53913zoijcleaow;
    }

    public final o5.zoijcleaow lqeggnwhkg() {
        return f53910nufgyqmvbu;
    }

    public final o5.zoijcleaow nufgyqmvbu() {
        return f53904dxjokdxxww;
    }

    public final o5.zoijcleaow ppxfxbqfkf() {
        return f53912wkgbmnqykc;
    }

    public final o5.zoijcleaow wkgbmnqykc() {
        return f53905eablkybsjg;
    }

    public final o5.zoijcleaow zoijcleaow() {
        return f53911ppxfxbqfkf;
    }
}
