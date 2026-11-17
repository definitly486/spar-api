package dy;

import android.database.Cursor;
import cy.gtknphoqwx;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n5.lereixgezr;
import n5.oxmwwwfdhm;
import n5.yggfygwlhe;
import ru.myspar.core.domain.models.order.OrderStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu implements dy.lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f29845iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final lereixgezr f29847nufgyqmvbu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f29850zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cy.zoijcleaow f29848ppxfxbqfkf = new cy.zoijcleaow();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f29849wkgbmnqykc = new gtknphoqwx();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final cw.gxszxtbevo f29843eablkybsjg = new cw.gxszxtbevo();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final cy.dxjokdxxww f29844gxszxtbevo = new cy.dxjokdxxww();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final cy.nufgyqmvbu f29846lqeggnwhkg = new cy.nufgyqmvbu();

    class eablkybsjg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f29851iobyxmoadg;

        eablkybsjg(yggfygwlhe yggfygwlheVar) {
            this.f29851iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public hy.zoijcleaow call() {
            hy.zoijcleaow zoijcleaowVar;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(nufgyqmvbu.this.f29845iobyxmoadg, this.f29851iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_status");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "shop_id");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "delivery");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "delivery_area");
                int iWkgbmnqykc6 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "payment");
                int iWkgbmnqykc7 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "basket");
                int iWkgbmnqykc8 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "groups");
                int iWkgbmnqykc9 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "total_info");
                int iWkgbmnqykc10 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "payments_list");
                int iWkgbmnqykc11 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_name");
                int iWkgbmnqykc12 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_discount");
                int iWkgbmnqykc13 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_status");
                int iWkgbmnqykc14 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_properties_min_price");
                int iWkgbmnqykc15 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_properties_date_left");
                int iWkgbmnqykc16 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_address");
                int iWkgbmnqykc17 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_first_name");
                int iWkgbmnqykc18 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_last_name");
                int iWkgbmnqykc19 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_phone");
                int iWkgbmnqykc20 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_email");
                int iWkgbmnqykc21 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_date_receipt");
                int iWkgbmnqykc22 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_internal_delivery");
                int iWkgbmnqykc23 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_change");
                int iWkgbmnqykc24 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_order_comments_list");
                int iWkgbmnqykc25 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_basket");
                int iWkgbmnqykc26 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_discount");
                int iWkgbmnqykc27 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_delivery");
                int iWkgbmnqykc28 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_overweight");
                int iWkgbmnqykc29 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_weight");
                int iWkgbmnqykc30 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_total");
                int iWkgbmnqykc31 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_count");
                int iWkgbmnqykc32 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_old_total");
                int iWkgbmnqykc33 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_diff_total");
                int iWkgbmnqykc34 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "bonuses_applied");
                if (cursorPpxfxbqfkf.moveToFirst()) {
                    zoijcleaowVar = new hy.zoijcleaow(cursorPpxfxbqfkf.getLong(iWkgbmnqykc), nufgyqmvbu.this.vdvldrhtss(cursorPpxfxbqfkf.getString(iWkgbmnqykc2)), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc4), cursorPpxfxbqfkf.getString(iWkgbmnqykc5), cursorPpxfxbqfkf.getString(iWkgbmnqykc6), new hy.eablkybsjg(cursorPpxfxbqfkf.getString(iWkgbmnqykc11), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc12), cursorPpxfxbqfkf.getInt(iWkgbmnqykc13) != 0), new hy.ppxfxbqfkf(cursorPpxfxbqfkf.getDouble(iWkgbmnqykc14), nufgyqmvbu.this.f29844gxszxtbevo.iobyxmoadg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc15) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc15))), new hy.gxszxtbevo(cursorPpxfxbqfkf.getString(iWkgbmnqykc16), cursorPpxfxbqfkf.getString(iWkgbmnqykc17), cursorPpxfxbqfkf.getString(iWkgbmnqykc18), cursorPpxfxbqfkf.getString(iWkgbmnqykc19), cursorPpxfxbqfkf.getString(iWkgbmnqykc20), cursorPpxfxbqfkf.getString(iWkgbmnqykc21), cursorPpxfxbqfkf.getString(iWkgbmnqykc22), cursorPpxfxbqfkf.getString(iWkgbmnqykc23), nufgyqmvbu.this.f29846lqeggnwhkg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc24) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc24))), nufgyqmvbu.this.f29848ppxfxbqfkf.wkgbmnqykc(cursorPpxfxbqfkf.getString(iWkgbmnqykc7)), new hy.lqeggnwhkg(cursorPpxfxbqfkf.getDouble(iWkgbmnqykc25), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc26), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc27), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc28), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc29), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc30), cursorPpxfxbqfkf.getInt(iWkgbmnqykc31), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc32), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc33)), !cursorPpxfxbqfkf.isNull(iWkgbmnqykc34) ? new hy.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc34)) : null, cursorPpxfxbqfkf.getString(iWkgbmnqykc8), nufgyqmvbu.this.f29849wkgbmnqykc.wkgbmnqykc(cursorPpxfxbqfkf.isNull(iWkgbmnqykc9) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc9)), nufgyqmvbu.this.f29843eablkybsjg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc10) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc10)));
                } else {
                    zoijcleaowVar = null;
                }
                return zoijcleaowVar;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f29851iobyxmoadg.release();
            }
        }
    }

    class gxszxtbevo implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f29853iobyxmoadg;

        gxszxtbevo(yggfygwlhe yggfygwlheVar) {
            this.f29853iobyxmoadg = yggfygwlheVar;
        }

        protected void finalize() {
            this.f29853iobyxmoadg.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public hy.zoijcleaow call() {
            hy.zoijcleaow zoijcleaowVar;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(nufgyqmvbu.this.f29845iobyxmoadg, this.f29853iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_status");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "shop_id");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "delivery");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "delivery_area");
                int iWkgbmnqykc6 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "payment");
                int iWkgbmnqykc7 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "basket");
                int iWkgbmnqykc8 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "groups");
                int iWkgbmnqykc9 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "total_info");
                int iWkgbmnqykc10 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "payments_list");
                int iWkgbmnqykc11 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_name");
                int iWkgbmnqykc12 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_discount");
                int iWkgbmnqykc13 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_status");
                int iWkgbmnqykc14 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_properties_min_price");
                int iWkgbmnqykc15 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_properties_date_left");
                int iWkgbmnqykc16 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_address");
                int iWkgbmnqykc17 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_first_name");
                int iWkgbmnqykc18 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_last_name");
                int iWkgbmnqykc19 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_phone");
                int iWkgbmnqykc20 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_email");
                int iWkgbmnqykc21 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_date_receipt");
                int iWkgbmnqykc22 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_internal_delivery");
                int iWkgbmnqykc23 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_change");
                int iWkgbmnqykc24 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_order_comments_list");
                int iWkgbmnqykc25 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_basket");
                int iWkgbmnqykc26 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_discount");
                int iWkgbmnqykc27 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_delivery");
                int iWkgbmnqykc28 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_overweight");
                int iWkgbmnqykc29 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_weight");
                int iWkgbmnqykc30 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_total");
                int iWkgbmnqykc31 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_count");
                int iWkgbmnqykc32 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_old_total");
                int iWkgbmnqykc33 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_diff_total");
                int iWkgbmnqykc34 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "bonuses_applied");
                if (cursorPpxfxbqfkf.moveToFirst()) {
                    zoijcleaowVar = new hy.zoijcleaow(cursorPpxfxbqfkf.getLong(iWkgbmnqykc), nufgyqmvbu.this.vdvldrhtss(cursorPpxfxbqfkf.getString(iWkgbmnqykc2)), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc4), cursorPpxfxbqfkf.getString(iWkgbmnqykc5), cursorPpxfxbqfkf.getString(iWkgbmnqykc6), new hy.eablkybsjg(cursorPpxfxbqfkf.getString(iWkgbmnqykc11), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc12), cursorPpxfxbqfkf.getInt(iWkgbmnqykc13) != 0), new hy.ppxfxbqfkf(cursorPpxfxbqfkf.getDouble(iWkgbmnqykc14), nufgyqmvbu.this.f29844gxszxtbevo.iobyxmoadg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc15) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc15))), new hy.gxszxtbevo(cursorPpxfxbqfkf.getString(iWkgbmnqykc16), cursorPpxfxbqfkf.getString(iWkgbmnqykc17), cursorPpxfxbqfkf.getString(iWkgbmnqykc18), cursorPpxfxbqfkf.getString(iWkgbmnqykc19), cursorPpxfxbqfkf.getString(iWkgbmnqykc20), cursorPpxfxbqfkf.getString(iWkgbmnqykc21), cursorPpxfxbqfkf.getString(iWkgbmnqykc22), cursorPpxfxbqfkf.getString(iWkgbmnqykc23), nufgyqmvbu.this.f29846lqeggnwhkg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc24) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc24))), nufgyqmvbu.this.f29848ppxfxbqfkf.wkgbmnqykc(cursorPpxfxbqfkf.getString(iWkgbmnqykc7)), new hy.lqeggnwhkg(cursorPpxfxbqfkf.getDouble(iWkgbmnqykc25), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc26), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc27), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc28), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc29), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc30), cursorPpxfxbqfkf.getInt(iWkgbmnqykc31), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc32), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc33)), !cursorPpxfxbqfkf.isNull(iWkgbmnqykc34) ? new hy.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc34)) : null, cursorPpxfxbqfkf.getString(iWkgbmnqykc8), nufgyqmvbu.this.f29849wkgbmnqykc.wkgbmnqykc(cursorPpxfxbqfkf.isNull(iWkgbmnqykc9) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc9)), nufgyqmvbu.this.f29843eablkybsjg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc10) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc10)));
                } else {
                    zoijcleaowVar = null;
                }
                return zoijcleaowVar;
            } finally {
                cursorPpxfxbqfkf.close();
            }
        }
    }

    class iobyxmoadg extends n5.btonecajqb {
        iobyxmoadg(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, hy.zoijcleaow zoijcleaowVar) {
            gtknphoqwxVar.s(1, zoijcleaowVar.gxszxtbevo());
            gtknphoqwxVar.e(2, nufgyqmvbu.this.rgvfuqvkyq(zoijcleaowVar.nufgyqmvbu()));
            gtknphoqwxVar.e(3, zoijcleaowVar.wflxmlrfwp());
            if (zoijcleaowVar.ppxfxbqfkf() == null) {
                gtknphoqwxVar.N(4);
            } else {
                gtknphoqwxVar.e(4, zoijcleaowVar.ppxfxbqfkf());
            }
            gtknphoqwxVar.e(5, zoijcleaowVar.wkgbmnqykc());
            gtknphoqwxVar.e(6, zoijcleaowVar.dxjokdxxww());
            gtknphoqwxVar.e(7, nufgyqmvbu.this.f29848ppxfxbqfkf.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg()));
            gtknphoqwxVar.e(8, zoijcleaowVar.eablkybsjg());
            String strPpxfxbqfkf = zoijcleaowVar.ojitshcjhn() == null ? null : nufgyqmvbu.this.f29849wkgbmnqykc.ppxfxbqfkf(zoijcleaowVar.ojitshcjhn());
            if (strPpxfxbqfkf == null) {
                gtknphoqwxVar.N(9);
            } else {
                gtknphoqwxVar.e(9, strPpxfxbqfkf);
            }
            String strGxszxtbevo = zoijcleaowVar.btonecajqb() == null ? null : nufgyqmvbu.this.f29843eablkybsjg.gxszxtbevo(zoijcleaowVar.btonecajqb());
            if (strGxszxtbevo == null) {
                gtknphoqwxVar.N(10);
            } else {
                gtknphoqwxVar.e(10, strGxszxtbevo);
            }
            hy.eablkybsjg eablkybsjgVarGtknphoqwx = zoijcleaowVar.gtknphoqwx();
            gtknphoqwxVar.e(11, eablkybsjgVarGtknphoqwx.zoijcleaow());
            gtknphoqwxVar.jpowsppfya(12, eablkybsjgVarGtknphoqwx.iobyxmoadg());
            gtknphoqwxVar.s(13, eablkybsjgVarGtknphoqwx.ppxfxbqfkf() ? 1L : 0L);
            hy.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
            gtknphoqwxVar.jpowsppfya(14, ppxfxbqfkfVarLqeggnwhkg.zoijcleaow());
            String strZoijcleaow = nufgyqmvbu.this.f29844gxszxtbevo.zoijcleaow(ppxfxbqfkfVarLqeggnwhkg.iobyxmoadg());
            if (strZoijcleaow == null) {
                gtknphoqwxVar.N(15);
            } else {
                gtknphoqwxVar.e(15, strZoijcleaow);
            }
            hy.gxszxtbevo gxszxtbevoVarDraadjrbmk = zoijcleaowVar.draadjrbmk();
            gtknphoqwxVar.e(16, gxszxtbevoVarDraadjrbmk.iobyxmoadg());
            gtknphoqwxVar.e(17, gxszxtbevoVarDraadjrbmk.lqeggnwhkg());
            gtknphoqwxVar.e(18, gxszxtbevoVarDraadjrbmk.nufgyqmvbu());
            gtknphoqwxVar.e(19, gxszxtbevoVarDraadjrbmk.dxjokdxxww());
            gtknphoqwxVar.e(20, gxszxtbevoVarDraadjrbmk.gxszxtbevo());
            gtknphoqwxVar.e(21, gxszxtbevoVarDraadjrbmk.ppxfxbqfkf());
            gtknphoqwxVar.e(22, gxszxtbevoVarDraadjrbmk.wkgbmnqykc());
            gtknphoqwxVar.e(23, gxszxtbevoVarDraadjrbmk.zoijcleaow());
            String strGxszxtbevo2 = gxszxtbevoVarDraadjrbmk.eablkybsjg() != null ? nufgyqmvbu.this.f29846lqeggnwhkg.gxszxtbevo(gxszxtbevoVarDraadjrbmk.eablkybsjg()) : null;
            if (strGxszxtbevo2 == null) {
                gtknphoqwxVar.N(24);
            } else {
                gtknphoqwxVar.e(24, strGxszxtbevo2);
            }
            hy.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = zoijcleaowVar.agtfadlqog();
            gtknphoqwxVar.jpowsppfya(25, lqeggnwhkgVarAgtfadlqog.iobyxmoadg());
            gtknphoqwxVar.jpowsppfya(26, lqeggnwhkgVarAgtfadlqog.eablkybsjg());
            gtknphoqwxVar.jpowsppfya(27, lqeggnwhkgVarAgtfadlqog.ppxfxbqfkf());
            gtknphoqwxVar.jpowsppfya(28, lqeggnwhkgVarAgtfadlqog.lqeggnwhkg());
            gtknphoqwxVar.jpowsppfya(29, lqeggnwhkgVarAgtfadlqog.dxjokdxxww());
            gtknphoqwxVar.jpowsppfya(30, lqeggnwhkgVarAgtfadlqog.nufgyqmvbu());
            gtknphoqwxVar.s(31, lqeggnwhkgVarAgtfadlqog.zoijcleaow());
            gtknphoqwxVar.jpowsppfya(32, lqeggnwhkgVarAgtfadlqog.gxszxtbevo());
            gtknphoqwxVar.jpowsppfya(33, lqeggnwhkgVarAgtfadlqog.wkgbmnqykc());
            hy.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaowVar.zoijcleaow();
            if (iobyxmoadgVarZoijcleaow != null) {
                gtknphoqwxVar.s(34, iobyxmoadgVarZoijcleaow.iobyxmoadg());
            } else {
                gtknphoqwxVar.N(34);
            }
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `editable_orders` (`id`,`order_status`,`shop_id`,`delivery`,`delivery_area`,`payment`,`basket`,`groups`,`total_info`,`payments_list`,`promocode_name`,`promocode_discount`,`promocode_status`,`order_properties_min_price`,`order_properties_date_left`,`properties_address`,`properties_receiver_first_name`,`properties_receiver_last_name`,`properties_receiver_phone`,`properties_receiver_email`,`properties_date_receipt`,`properties_internal_delivery`,`properties_change`,`properties_order_comments_list`,`sum_basket`,`sum_discount`,`sum_delivery`,`sum_overweight`,`sum_weight`,`sum_total`,`sum_count`,`sum_old_total`,`sum_diff_total`,`bonuses_applied`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class lqeggnwhkg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f29856iobyxmoadg;

        lqeggnwhkg(yggfygwlhe yggfygwlheVar) {
            this.f29856iobyxmoadg = yggfygwlheVar;
        }

        protected void finalize() {
            this.f29856iobyxmoadg.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public List call() {
            lqeggnwhkg lqeggnwhkgVar = this;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(nufgyqmvbu.this.f29845iobyxmoadg, lqeggnwhkgVar.f29856iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_status");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "shop_id");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "delivery");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "delivery_area");
                int iWkgbmnqykc6 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "payment");
                int iWkgbmnqykc7 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "basket");
                int iWkgbmnqykc8 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "groups");
                int iWkgbmnqykc9 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "total_info");
                int iWkgbmnqykc10 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "payments_list");
                int iWkgbmnqykc11 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_name");
                int iWkgbmnqykc12 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_discount");
                int iWkgbmnqykc13 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "promocode_status");
                int iWkgbmnqykc14 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_properties_min_price");
                int iWkgbmnqykc15 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "order_properties_date_left");
                int iWkgbmnqykc16 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_address");
                int iWkgbmnqykc17 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_first_name");
                int iWkgbmnqykc18 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_last_name");
                int iWkgbmnqykc19 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_phone");
                int iWkgbmnqykc20 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_receiver_email");
                int iWkgbmnqykc21 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_date_receipt");
                int iWkgbmnqykc22 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_internal_delivery");
                int iWkgbmnqykc23 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_change");
                int iWkgbmnqykc24 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "properties_order_comments_list");
                int iWkgbmnqykc25 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_basket");
                int iWkgbmnqykc26 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_discount");
                int iWkgbmnqykc27 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_delivery");
                int iWkgbmnqykc28 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_overweight");
                int iWkgbmnqykc29 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_weight");
                int iWkgbmnqykc30 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_total");
                int iWkgbmnqykc31 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_count");
                int iWkgbmnqykc32 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_old_total");
                int iWkgbmnqykc33 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "sum_diff_total");
                int iWkgbmnqykc34 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "bonuses_applied");
                int i13 = iWkgbmnqykc13;
                ArrayList arrayList = new ArrayList(cursorPpxfxbqfkf.getCount());
                while (cursorPpxfxbqfkf.moveToNext()) {
                    long j13 = cursorPpxfxbqfkf.getLong(iWkgbmnqykc);
                    int i14 = iWkgbmnqykc;
                    OrderStatus orderStatusVdvldrhtss = nufgyqmvbu.this.vdvldrhtss(cursorPpxfxbqfkf.getString(iWkgbmnqykc2));
                    String string = cursorPpxfxbqfkf.getString(iWkgbmnqykc3);
                    String string2 = cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc4);
                    String string3 = cursorPpxfxbqfkf.getString(iWkgbmnqykc5);
                    String string4 = cursorPpxfxbqfkf.getString(iWkgbmnqykc6);
                    List listWkgbmnqykc = nufgyqmvbu.this.f29848ppxfxbqfkf.wkgbmnqykc(cursorPpxfxbqfkf.getString(iWkgbmnqykc7));
                    String string5 = cursorPpxfxbqfkf.getString(iWkgbmnqykc8);
                    List listWkgbmnqykc2 = nufgyqmvbu.this.f29849wkgbmnqykc.wkgbmnqykc(cursorPpxfxbqfkf.isNull(iWkgbmnqykc9) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc9));
                    List listLqeggnwhkg = nufgyqmvbu.this.f29843eablkybsjg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc10) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc10));
                    int i15 = iWkgbmnqykc2;
                    int i16 = iWkgbmnqykc3;
                    i13 = i13;
                    hy.eablkybsjg eablkybsjgVar = new hy.eablkybsjg(cursorPpxfxbqfkf.getString(iWkgbmnqykc11), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc12), cursorPpxfxbqfkf.getInt(i13) != 0);
                    int i17 = iWkgbmnqykc14;
                    int i18 = iWkgbmnqykc15;
                    hy.ppxfxbqfkf ppxfxbqfkfVar = new hy.ppxfxbqfkf(cursorPpxfxbqfkf.getDouble(i17), nufgyqmvbu.this.f29844gxszxtbevo.iobyxmoadg(cursorPpxfxbqfkf.isNull(i18) ? null : cursorPpxfxbqfkf.getString(i18)));
                    int i19 = iWkgbmnqykc16;
                    String string6 = cursorPpxfxbqfkf.getString(i19);
                    iWkgbmnqykc17 = iWkgbmnqykc17;
                    String string7 = cursorPpxfxbqfkf.getString(iWkgbmnqykc17);
                    int i23 = iWkgbmnqykc18;
                    String string8 = cursorPpxfxbqfkf.getString(i23);
                    iWkgbmnqykc16 = i19;
                    int i24 = iWkgbmnqykc19;
                    String string9 = cursorPpxfxbqfkf.getString(i24);
                    iWkgbmnqykc19 = i24;
                    int i25 = iWkgbmnqykc20;
                    String string10 = cursorPpxfxbqfkf.getString(i25);
                    iWkgbmnqykc20 = i25;
                    int i26 = iWkgbmnqykc21;
                    String string11 = cursorPpxfxbqfkf.getString(i26);
                    iWkgbmnqykc21 = i26;
                    int i27 = iWkgbmnqykc22;
                    String string12 = cursorPpxfxbqfkf.getString(i27);
                    iWkgbmnqykc22 = i27;
                    int i28 = iWkgbmnqykc23;
                    String string13 = cursorPpxfxbqfkf.getString(i28);
                    iWkgbmnqykc23 = i28;
                    iWkgbmnqykc24 = iWkgbmnqykc24;
                    hy.gxszxtbevo gxszxtbevoVar = new hy.gxszxtbevo(string6, string7, string8, string9, string10, string11, string12, string13, nufgyqmvbu.this.f29846lqeggnwhkg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc24) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc24)));
                    int i29 = iWkgbmnqykc25;
                    double d13 = cursorPpxfxbqfkf.getDouble(i29);
                    int i33 = iWkgbmnqykc26;
                    double d14 = cursorPpxfxbqfkf.getDouble(i33);
                    iWkgbmnqykc25 = i29;
                    int i34 = iWkgbmnqykc27;
                    double d15 = cursorPpxfxbqfkf.getDouble(i34);
                    iWkgbmnqykc27 = i34;
                    int i35 = iWkgbmnqykc28;
                    double d16 = cursorPpxfxbqfkf.getDouble(i35);
                    iWkgbmnqykc28 = i35;
                    int i36 = iWkgbmnqykc29;
                    double d17 = cursorPpxfxbqfkf.getDouble(i36);
                    iWkgbmnqykc29 = i36;
                    int i37 = iWkgbmnqykc30;
                    double d18 = cursorPpxfxbqfkf.getDouble(i37);
                    iWkgbmnqykc30 = i37;
                    int i38 = iWkgbmnqykc31;
                    int i39 = cursorPpxfxbqfkf.getInt(i38);
                    iWkgbmnqykc31 = i38;
                    int i43 = iWkgbmnqykc32;
                    double d19 = cursorPpxfxbqfkf.getDouble(i43);
                    iWkgbmnqykc32 = i43;
                    int i44 = iWkgbmnqykc33;
                    hy.lqeggnwhkg lqeggnwhkgVar2 = new hy.lqeggnwhkg(d13, d14, d15, d16, d17, d18, i39, d19, cursorPpxfxbqfkf.getDouble(i44));
                    iWkgbmnqykc33 = i44;
                    iWkgbmnqykc34 = iWkgbmnqykc34;
                    arrayList.add(new hy.zoijcleaow(j13, orderStatusVdvldrhtss, string, string2, string3, string4, eablkybsjgVar, ppxfxbqfkfVar, gxszxtbevoVar, listWkgbmnqykc, lqeggnwhkgVar2, !cursorPpxfxbqfkf.isNull(iWkgbmnqykc34) ? new hy.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc34)) : null, string5, listWkgbmnqykc2, listLqeggnwhkg));
                    lqeggnwhkgVar = this;
                    iWkgbmnqykc26 = i33;
                    iWkgbmnqykc18 = i23;
                    iWkgbmnqykc = i14;
                    iWkgbmnqykc3 = i16;
                    iWkgbmnqykc2 = i15;
                    iWkgbmnqykc4 = iWkgbmnqykc4;
                    iWkgbmnqykc15 = i18;
                    iWkgbmnqykc14 = i17;
                }
                return arrayList;
            } finally {
                cursorPpxfxbqfkf.close();
            }
        }
    }

    /* JADX INFO: renamed from: dy.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    static /* synthetic */ class C0612nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f29858iobyxmoadg;

        static {
            int[] iArr = new int[OrderStatus.values().length];
            f29858iobyxmoadg = iArr;
            try {
                iArr[OrderStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.PREPARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.COLLECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.COLLECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.DELIVERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.READY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.COMPLETE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29858iobyxmoadg[OrderStatus.UNDEFINED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    class ppxfxbqfkf implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ hy.zoijcleaow f29859iobyxmoadg;

        ppxfxbqfkf(hy.zoijcleaow zoijcleaowVar) {
            this.f29859iobyxmoadg = zoijcleaowVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            nufgyqmvbu.this.f29845iobyxmoadg.ojitshcjhn();
            try {
                nufgyqmvbu.this.f29850zoijcleaow.gtknphoqwx(this.f29859iobyxmoadg);
                nufgyqmvbu.this.f29845iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                nufgyqmvbu.this.f29845iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class wkgbmnqykc implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f29861iobyxmoadg;

        wkgbmnqykc(String str) {
            this.f29861iobyxmoadg = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            u5.gtknphoqwx gtknphoqwxVarZoijcleaow = nufgyqmvbu.this.f29847nufgyqmvbu.zoijcleaow();
            gtknphoqwxVarZoijcleaow.e(1, this.f29861iobyxmoadg);
            try {
                nufgyqmvbu.this.f29845iobyxmoadg.ojitshcjhn();
                try {
                    gtknphoqwxVarZoijcleaow.pkzmftpjix();
                    nufgyqmvbu.this.f29845iobyxmoadg.dsvhmnatus();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    nufgyqmvbu.this.f29845iobyxmoadg.kcexrzcfyt();
                    nufgyqmvbu.this.f29847nufgyqmvbu.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                    return wwaezpbzknVar;
                } catch (Throwable th2) {
                    nufgyqmvbu.this.f29845iobyxmoadg.kcexrzcfyt();
                    throw th2;
                }
            } catch (Throwable th3) {
                nufgyqmvbu.this.f29847nufgyqmvbu.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                throw th3;
            }
        }
    }

    class zoijcleaow extends lereixgezr {
        zoijcleaow(nufgyqmvbu nufgyqmvbuVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM editable_orders WHERE id = ?";
        }
    }

    public nufgyqmvbu(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f29845iobyxmoadg = oxmwwwfdhmVar;
        this.f29850zoijcleaow = new iobyxmoadg(oxmwwwfdhmVar);
        this.f29847nufgyqmvbu = new zoijcleaow(this, oxmwwwfdhmVar);
    }

    public static List oxmwwwfdhm() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String rgvfuqvkyq(OrderStatus orderStatus) {
        switch (C0612nufgyqmvbu.f29858iobyxmoadg[orderStatus.ordinal()]) {
            case 1:
                return "NEW";
            case 2:
                return "ACCEPT";
            case 3:
                return "PREPARE";
            case 4:
                return "COLLECTING";
            case 5:
                return "COLLECT";
            case 6:
                return "DELIVERY";
            case 7:
                return "READY";
            case 8:
                return "COMPLETE";
            case 9:
                return "CANCEL";
            case 10:
                return "UNDEFINED";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + orderStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OrderStatus vdvldrhtss(String str) {
        str.hashCode();
        switch (str) {
            case "COLLECTING":
                return OrderStatus.COLLECTING;
            case "NEW":
                return OrderStatus.NEW;
            case "READY":
                return OrderStatus.READY;
            case "COMPLETE":
                return OrderStatus.COMPLETE;
            case "PREPARE":
                return OrderStatus.PREPARE;
            case "DELIVERY":
                return OrderStatus.DELIVERY;
            case "COLLECT":
                return OrderStatus.COLLECT;
            case "UNDEFINED":
                return OrderStatus.UNDEFINED;
            case "ACCEPT":
                return OrderStatus.ACCEPT;
            case "CANCEL":
                return OrderStatus.CANCEL;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    @Override // dy.lqeggnwhkg
    public Object eablkybsjg(hy.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f29845iobyxmoadg, true, new ppxfxbqfkf(zoijcleaowVar), gxszxtbevoVar);
    }

    @Override // dy.lqeggnwhkg
    public sj.lqeggnwhkg iobyxmoadg(String str) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM editable_orders WHERE id =?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        return androidx.room.iobyxmoadg.iobyxmoadg(this.f29845iobyxmoadg, false, new String[]{"editable_orders"}, new gxszxtbevo(yggfygwlheVarLqeggnwhkg));
    }

    @Override // dy.lqeggnwhkg
    public Object ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f29845iobyxmoadg, true, new wkgbmnqykc(str), gxszxtbevoVar);
    }

    @Override // dy.lqeggnwhkg
    public sj.lqeggnwhkg wkgbmnqykc() {
        return androidx.room.iobyxmoadg.iobyxmoadg(this.f29845iobyxmoadg, false, new String[]{"editable_orders"}, new lqeggnwhkg(yggfygwlhe.lqeggnwhkg("SELECT * FROM editable_orders", 0)));
    }

    @Override // dy.lqeggnwhkg
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM editable_orders WHERE id =?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f29845iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new eablkybsjg(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }
}
