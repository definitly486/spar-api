package yw0;

import android.database.Cursor;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n5.lereixgezr;
import n5.oxmwwwfdhm;
import n5.yggfygwlhe;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import xw0.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements yw0.lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f126771iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final lereixgezr f126773nufgyqmvbu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f126776zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final xw0.zoijcleaow f126774ppxfxbqfkf = new xw0.zoijcleaow();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f126775wkgbmnqykc = new gtknphoqwx();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wu0.gxszxtbevo f126769eablkybsjg = new wu0.gxszxtbevo();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final xw0.dxjokdxxww f126770gxszxtbevo = new xw0.dxjokdxxww();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final xw0.nufgyqmvbu f126772lqeggnwhkg = new xw0.nufgyqmvbu();

    class eablkybsjg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f126777iobyxmoadg;

        eablkybsjg(yggfygwlhe yggfygwlheVar) {
            this.f126777iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public cx0.zoijcleaow call() {
            cx0.zoijcleaow zoijcleaowVar;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(nufgyqmvbu.this.f126771iobyxmoadg, this.f126777iobyxmoadg, false, null);
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
                    zoijcleaowVar = new cx0.zoijcleaow(cursorPpxfxbqfkf.getLong(iWkgbmnqykc), nufgyqmvbu.this.vdvldrhtss(cursorPpxfxbqfkf.getString(iWkgbmnqykc2)), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc4), cursorPpxfxbqfkf.getString(iWkgbmnqykc5), cursorPpxfxbqfkf.getString(iWkgbmnqykc6), new cx0.eablkybsjg(cursorPpxfxbqfkf.getString(iWkgbmnqykc11), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc12), cursorPpxfxbqfkf.getInt(iWkgbmnqykc13) != 0), new cx0.ppxfxbqfkf(cursorPpxfxbqfkf.getDouble(iWkgbmnqykc14), nufgyqmvbu.this.f126770gxszxtbevo.iobyxmoadg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc15) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc15))), new cx0.gxszxtbevo(cursorPpxfxbqfkf.getString(iWkgbmnqykc16), cursorPpxfxbqfkf.getString(iWkgbmnqykc17), cursorPpxfxbqfkf.getString(iWkgbmnqykc18), cursorPpxfxbqfkf.getString(iWkgbmnqykc19), cursorPpxfxbqfkf.getString(iWkgbmnqykc20), cursorPpxfxbqfkf.getString(iWkgbmnqykc21), cursorPpxfxbqfkf.getString(iWkgbmnqykc22), cursorPpxfxbqfkf.getString(iWkgbmnqykc23), nufgyqmvbu.this.f126772lqeggnwhkg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc24) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc24))), nufgyqmvbu.this.f126774ppxfxbqfkf.wkgbmnqykc(cursorPpxfxbqfkf.getString(iWkgbmnqykc7)), new cx0.lqeggnwhkg(cursorPpxfxbqfkf.getDouble(iWkgbmnqykc25), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc26), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc27), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc28), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc29), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc30), cursorPpxfxbqfkf.getInt(iWkgbmnqykc31), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc32), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc33)), !cursorPpxfxbqfkf.isNull(iWkgbmnqykc34) ? new cx0.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc34)) : null, cursorPpxfxbqfkf.getString(iWkgbmnqykc8), nufgyqmvbu.this.f126775wkgbmnqykc.wkgbmnqykc(cursorPpxfxbqfkf.isNull(iWkgbmnqykc9) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc9)), nufgyqmvbu.this.f126769eablkybsjg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc10) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc10)));
                } else {
                    zoijcleaowVar = null;
                }
                return zoijcleaowVar;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f126777iobyxmoadg.release();
            }
        }
    }

    class gxszxtbevo implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f126779iobyxmoadg;

        gxszxtbevo(yggfygwlhe yggfygwlheVar) {
            this.f126779iobyxmoadg = yggfygwlheVar;
        }

        protected void finalize() {
            this.f126779iobyxmoadg.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public cx0.zoijcleaow call() {
            cx0.zoijcleaow zoijcleaowVar;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(nufgyqmvbu.this.f126771iobyxmoadg, this.f126779iobyxmoadg, false, null);
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
                    zoijcleaowVar = new cx0.zoijcleaow(cursorPpxfxbqfkf.getLong(iWkgbmnqykc), nufgyqmvbu.this.vdvldrhtss(cursorPpxfxbqfkf.getString(iWkgbmnqykc2)), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc4), cursorPpxfxbqfkf.getString(iWkgbmnqykc5), cursorPpxfxbqfkf.getString(iWkgbmnqykc6), new cx0.eablkybsjg(cursorPpxfxbqfkf.getString(iWkgbmnqykc11), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc12), cursorPpxfxbqfkf.getInt(iWkgbmnqykc13) != 0), new cx0.ppxfxbqfkf(cursorPpxfxbqfkf.getDouble(iWkgbmnqykc14), nufgyqmvbu.this.f126770gxszxtbevo.iobyxmoadg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc15) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc15))), new cx0.gxszxtbevo(cursorPpxfxbqfkf.getString(iWkgbmnqykc16), cursorPpxfxbqfkf.getString(iWkgbmnqykc17), cursorPpxfxbqfkf.getString(iWkgbmnqykc18), cursorPpxfxbqfkf.getString(iWkgbmnqykc19), cursorPpxfxbqfkf.getString(iWkgbmnqykc20), cursorPpxfxbqfkf.getString(iWkgbmnqykc21), cursorPpxfxbqfkf.getString(iWkgbmnqykc22), cursorPpxfxbqfkf.getString(iWkgbmnqykc23), nufgyqmvbu.this.f126772lqeggnwhkg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc24) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc24))), nufgyqmvbu.this.f126774ppxfxbqfkf.wkgbmnqykc(cursorPpxfxbqfkf.getString(iWkgbmnqykc7)), new cx0.lqeggnwhkg(cursorPpxfxbqfkf.getDouble(iWkgbmnqykc25), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc26), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc27), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc28), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc29), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc30), cursorPpxfxbqfkf.getInt(iWkgbmnqykc31), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc32), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc33)), !cursorPpxfxbqfkf.isNull(iWkgbmnqykc34) ? new cx0.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc34)) : null, cursorPpxfxbqfkf.getString(iWkgbmnqykc8), nufgyqmvbu.this.f126775wkgbmnqykc.wkgbmnqykc(cursorPpxfxbqfkf.isNull(iWkgbmnqykc9) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc9)), nufgyqmvbu.this.f126769eablkybsjg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc10) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc10)));
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
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, cx0.zoijcleaow zoijcleaowVar) {
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
            gtknphoqwxVar.e(7, nufgyqmvbu.this.f126774ppxfxbqfkf.ppxfxbqfkf(zoijcleaowVar.iobyxmoadg()));
            gtknphoqwxVar.e(8, zoijcleaowVar.eablkybsjg());
            String strPpxfxbqfkf = zoijcleaowVar.ojitshcjhn() == null ? null : nufgyqmvbu.this.f126775wkgbmnqykc.ppxfxbqfkf(zoijcleaowVar.ojitshcjhn());
            if (strPpxfxbqfkf == null) {
                gtknphoqwxVar.N(9);
            } else {
                gtknphoqwxVar.e(9, strPpxfxbqfkf);
            }
            String strGxszxtbevo = zoijcleaowVar.btonecajqb() == null ? null : nufgyqmvbu.this.f126769eablkybsjg.gxszxtbevo(zoijcleaowVar.btonecajqb());
            if (strGxszxtbevo == null) {
                gtknphoqwxVar.N(10);
            } else {
                gtknphoqwxVar.e(10, strGxszxtbevo);
            }
            cx0.eablkybsjg eablkybsjgVarGtknphoqwx = zoijcleaowVar.gtknphoqwx();
            gtknphoqwxVar.e(11, eablkybsjgVarGtknphoqwx.zoijcleaow());
            gtknphoqwxVar.jpowsppfya(12, eablkybsjgVarGtknphoqwx.iobyxmoadg());
            gtknphoqwxVar.s(13, eablkybsjgVarGtknphoqwx.ppxfxbqfkf() ? 1L : 0L);
            cx0.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = zoijcleaowVar.lqeggnwhkg();
            gtknphoqwxVar.jpowsppfya(14, ppxfxbqfkfVarLqeggnwhkg.zoijcleaow());
            String strZoijcleaow = nufgyqmvbu.this.f126770gxszxtbevo.zoijcleaow(ppxfxbqfkfVarLqeggnwhkg.iobyxmoadg());
            if (strZoijcleaow == null) {
                gtknphoqwxVar.N(15);
            } else {
                gtknphoqwxVar.e(15, strZoijcleaow);
            }
            cx0.gxszxtbevo gxszxtbevoVarDraadjrbmk = zoijcleaowVar.draadjrbmk();
            gtknphoqwxVar.e(16, gxszxtbevoVarDraadjrbmk.iobyxmoadg());
            gtknphoqwxVar.e(17, gxszxtbevoVarDraadjrbmk.lqeggnwhkg());
            gtknphoqwxVar.e(18, gxszxtbevoVarDraadjrbmk.nufgyqmvbu());
            gtknphoqwxVar.e(19, gxszxtbevoVarDraadjrbmk.dxjokdxxww());
            gtknphoqwxVar.e(20, gxszxtbevoVarDraadjrbmk.gxszxtbevo());
            gtknphoqwxVar.e(21, gxszxtbevoVarDraadjrbmk.ppxfxbqfkf());
            gtknphoqwxVar.e(22, gxszxtbevoVarDraadjrbmk.wkgbmnqykc());
            gtknphoqwxVar.e(23, gxszxtbevoVarDraadjrbmk.zoijcleaow());
            String strGxszxtbevo2 = gxszxtbevoVarDraadjrbmk.eablkybsjg() != null ? nufgyqmvbu.this.f126772lqeggnwhkg.gxszxtbevo(gxszxtbevoVarDraadjrbmk.eablkybsjg()) : null;
            if (strGxszxtbevo2 == null) {
                gtknphoqwxVar.N(24);
            } else {
                gtknphoqwxVar.e(24, strGxszxtbevo2);
            }
            cx0.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = zoijcleaowVar.agtfadlqog();
            gtknphoqwxVar.jpowsppfya(25, lqeggnwhkgVarAgtfadlqog.iobyxmoadg());
            gtknphoqwxVar.jpowsppfya(26, lqeggnwhkgVarAgtfadlqog.eablkybsjg());
            gtknphoqwxVar.jpowsppfya(27, lqeggnwhkgVarAgtfadlqog.ppxfxbqfkf());
            gtknphoqwxVar.jpowsppfya(28, lqeggnwhkgVarAgtfadlqog.lqeggnwhkg());
            gtknphoqwxVar.jpowsppfya(29, lqeggnwhkgVarAgtfadlqog.dxjokdxxww());
            gtknphoqwxVar.jpowsppfya(30, lqeggnwhkgVarAgtfadlqog.nufgyqmvbu());
            gtknphoqwxVar.s(31, lqeggnwhkgVarAgtfadlqog.zoijcleaow());
            gtknphoqwxVar.jpowsppfya(32, lqeggnwhkgVarAgtfadlqog.gxszxtbevo());
            gtknphoqwxVar.jpowsppfya(33, lqeggnwhkgVarAgtfadlqog.wkgbmnqykc());
            cx0.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaowVar.zoijcleaow();
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
        final /* synthetic */ yggfygwlhe f126782iobyxmoadg;

        lqeggnwhkg(yggfygwlhe yggfygwlheVar) {
            this.f126782iobyxmoadg = yggfygwlheVar;
        }

        protected void finalize() {
            this.f126782iobyxmoadg.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public List call() {
            lqeggnwhkg lqeggnwhkgVar = this;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(nufgyqmvbu.this.f126771iobyxmoadg, lqeggnwhkgVar.f126782iobyxmoadg, false, null);
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
                    List listWkgbmnqykc = nufgyqmvbu.this.f126774ppxfxbqfkf.wkgbmnqykc(cursorPpxfxbqfkf.getString(iWkgbmnqykc7));
                    String string5 = cursorPpxfxbqfkf.getString(iWkgbmnqykc8);
                    List listWkgbmnqykc2 = nufgyqmvbu.this.f126775wkgbmnqykc.wkgbmnqykc(cursorPpxfxbqfkf.isNull(iWkgbmnqykc9) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc9));
                    List listLqeggnwhkg = nufgyqmvbu.this.f126769eablkybsjg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc10) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc10));
                    int i15 = iWkgbmnqykc2;
                    int i16 = iWkgbmnqykc3;
                    i13 = i13;
                    cx0.eablkybsjg eablkybsjgVar = new cx0.eablkybsjg(cursorPpxfxbqfkf.getString(iWkgbmnqykc11), cursorPpxfxbqfkf.getDouble(iWkgbmnqykc12), cursorPpxfxbqfkf.getInt(i13) != 0);
                    int i17 = iWkgbmnqykc14;
                    int i18 = iWkgbmnqykc15;
                    cx0.ppxfxbqfkf ppxfxbqfkfVar = new cx0.ppxfxbqfkf(cursorPpxfxbqfkf.getDouble(i17), nufgyqmvbu.this.f126770gxszxtbevo.iobyxmoadg(cursorPpxfxbqfkf.isNull(i18) ? null : cursorPpxfxbqfkf.getString(i18)));
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
                    cx0.gxszxtbevo gxszxtbevoVar = new cx0.gxszxtbevo(string6, string7, string8, string9, string10, string11, string12, string13, nufgyqmvbu.this.f126772lqeggnwhkg.lqeggnwhkg(cursorPpxfxbqfkf.isNull(iWkgbmnqykc24) ? null : cursorPpxfxbqfkf.getString(iWkgbmnqykc24)));
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
                    cx0.lqeggnwhkg lqeggnwhkgVar2 = new cx0.lqeggnwhkg(d13, d14, d15, d16, d17, d18, i39, d19, cursorPpxfxbqfkf.getDouble(i44));
                    iWkgbmnqykc33 = i44;
                    iWkgbmnqykc34 = iWkgbmnqykc34;
                    arrayList.add(new cx0.zoijcleaow(j13, orderStatusVdvldrhtss, string, string2, string3, string4, eablkybsjgVar, ppxfxbqfkfVar, gxszxtbevoVar, listWkgbmnqykc, lqeggnwhkgVar2, !cursorPpxfxbqfkf.isNull(iWkgbmnqykc34) ? new cx0.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc34)) : null, string5, listWkgbmnqykc2, listLqeggnwhkg));
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

    /* JADX INFO: renamed from: yw0.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    static /* synthetic */ class C3238nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f126784iobyxmoadg;

        static {
            int[] iArr = new int[OrderStatus.values().length];
            f126784iobyxmoadg = iArr;
            try {
                iArr[OrderStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.ACCEPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.PREPARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.COLLECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.COLLECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.DELIVERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.READY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.COMPLETE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f126784iobyxmoadg[OrderStatus.UNDEFINED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    class ppxfxbqfkf implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ cx0.zoijcleaow f126785iobyxmoadg;

        ppxfxbqfkf(cx0.zoijcleaow zoijcleaowVar) {
            this.f126785iobyxmoadg = zoijcleaowVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            nufgyqmvbu.this.f126771iobyxmoadg.ojitshcjhn();
            try {
                nufgyqmvbu.this.f126776zoijcleaow.gtknphoqwx(this.f126785iobyxmoadg);
                nufgyqmvbu.this.f126771iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                nufgyqmvbu.this.f126771iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class wkgbmnqykc implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ String f126787iobyxmoadg;

        wkgbmnqykc(String str) {
            this.f126787iobyxmoadg = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            u5.gtknphoqwx gtknphoqwxVarZoijcleaow = nufgyqmvbu.this.f126773nufgyqmvbu.zoijcleaow();
            gtknphoqwxVarZoijcleaow.e(1, this.f126787iobyxmoadg);
            try {
                nufgyqmvbu.this.f126771iobyxmoadg.ojitshcjhn();
                try {
                    gtknphoqwxVarZoijcleaow.pkzmftpjix();
                    nufgyqmvbu.this.f126771iobyxmoadg.dsvhmnatus();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    nufgyqmvbu.this.f126771iobyxmoadg.kcexrzcfyt();
                    nufgyqmvbu.this.f126773nufgyqmvbu.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                    return wwaezpbzknVar;
                } catch (Throwable th2) {
                    nufgyqmvbu.this.f126771iobyxmoadg.kcexrzcfyt();
                    throw th2;
                }
            } catch (Throwable th3) {
                nufgyqmvbu.this.f126773nufgyqmvbu.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
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
        this.f126771iobyxmoadg = oxmwwwfdhmVar;
        this.f126776zoijcleaow = new iobyxmoadg(oxmwwwfdhmVar);
        this.f126773nufgyqmvbu = new zoijcleaow(this, oxmwwwfdhmVar);
    }

    public static List oxmwwwfdhm() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String rgvfuqvkyq(OrderStatus orderStatus) {
        switch (C3238nufgyqmvbu.f126784iobyxmoadg[orderStatus.ordinal()]) {
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

    @Override // yw0.lqeggnwhkg
    public Object eablkybsjg(cx0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f126771iobyxmoadg, true, new ppxfxbqfkf(zoijcleaowVar), gxszxtbevoVar);
    }

    @Override // yw0.lqeggnwhkg
    public sj.lqeggnwhkg iobyxmoadg(String str) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM editable_orders WHERE id =?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        return androidx.room.iobyxmoadg.iobyxmoadg(this.f126771iobyxmoadg, false, new String[]{"editable_orders"}, new gxszxtbevo(yggfygwlheVarLqeggnwhkg));
    }

    @Override // yw0.lqeggnwhkg
    public Object ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f126771iobyxmoadg, true, new wkgbmnqykc(str), gxszxtbevoVar);
    }

    @Override // yw0.lqeggnwhkg
    public sj.lqeggnwhkg wkgbmnqykc() {
        return androidx.room.iobyxmoadg.iobyxmoadg(this.f126771iobyxmoadg, false, new String[]{"editable_orders"}, new lqeggnwhkg(yggfygwlhe.lqeggnwhkg("SELECT * FROM editable_orders", 0)));
    }

    @Override // yw0.lqeggnwhkg
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM editable_orders WHERE id =?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f126771iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new eablkybsjg(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }
}
