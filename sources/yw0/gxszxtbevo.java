package yw0;

import android.database.Cursor;
import gg.wwaezpbzkn;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n5.oxmwwwfdhm;
import n5.yggfygwlhe;
import u5.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends yw0.eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final n5.dxjokdxxww f126760eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f126761iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n5.btonecajqb f126762ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final n5.dxjokdxxww f126763wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f126764zoijcleaow;

    class eablkybsjg extends n5.dxjokdxxww {
        eablkybsjg(gxszxtbevo gxszxtbevoVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, cx0.dxjokdxxww dxjokdxxwwVar) {
            gtknphoqwxVar.e(1, dxjokdxxwwVar.iobyxmoadg());
            gtknphoqwxVar.e(2, dxjokdxxwwVar.zoijcleaow());
            gtknphoqwxVar.e(3, dxjokdxxwwVar.iobyxmoadg());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "UPDATE OR ABORT `order_pickup_statuses` SET `id` = ?,`pickup_status` = ? WHERE `id` = ?";
        }
    }

    /* JADX INFO: renamed from: yw0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    class CallableC3237gxszxtbevo implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ cx0.dxjokdxxww f126765iobyxmoadg;

        CallableC3237gxszxtbevo(cx0.dxjokdxxww dxjokdxxwwVar) {
            this.f126765iobyxmoadg = dxjokdxxwwVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            gxszxtbevo.this.f126761iobyxmoadg.ojitshcjhn();
            try {
                gxszxtbevo.this.f126762ppxfxbqfkf.gtknphoqwx(this.f126765iobyxmoadg);
                gxszxtbevo.this.f126761iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                gxszxtbevo.this.f126761iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class iobyxmoadg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f126767iobyxmoadg;

        iobyxmoadg(yggfygwlhe yggfygwlheVar) {
            this.f126767iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public cx0.dxjokdxxww call() {
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(gxszxtbevo.this.f126761iobyxmoadg, this.f126767iobyxmoadg, false, null);
            try {
                return cursorPpxfxbqfkf.moveToFirst() ? new cx0.dxjokdxxww(cursorPpxfxbqfkf.getString(p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id")), cursorPpxfxbqfkf.getString(p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "pickup_status"))) : null;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f126767iobyxmoadg.release();
            }
        }
    }

    class ppxfxbqfkf extends n5.btonecajqb {
        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, cx0.dxjokdxxww dxjokdxxwwVar) {
            gtknphoqwxVar.e(1, dxjokdxxwwVar.iobyxmoadg());
            gtknphoqwxVar.e(2, dxjokdxxwwVar.zoijcleaow());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `order_pickup_statuses` (`id`,`pickup_status`) VALUES (?,?)";
        }
    }

    class wkgbmnqykc extends n5.dxjokdxxww {
        wkgbmnqykc(gxszxtbevo gxszxtbevoVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, cx0.dxjokdxxww dxjokdxxwwVar) {
            gtknphoqwxVar.e(1, dxjokdxxwwVar.iobyxmoadg());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "DELETE FROM `order_pickup_statuses` WHERE `id` = ?";
        }
    }

    class zoijcleaow extends n5.btonecajqb {
        zoijcleaow(gxszxtbevo gxszxtbevoVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, cx0.dxjokdxxww dxjokdxxwwVar) {
            gtknphoqwxVar.e(1, dxjokdxxwwVar.iobyxmoadg());
            gtknphoqwxVar.e(2, dxjokdxxwwVar.zoijcleaow());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR ABORT INTO `order_pickup_statuses` (`id`,`pickup_status`) VALUES (?,?)";
        }
    }

    public gxszxtbevo(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f126761iobyxmoadg = oxmwwwfdhmVar;
        this.f126764zoijcleaow = new zoijcleaow(this, oxmwwwfdhmVar);
        this.f126762ppxfxbqfkf = new ppxfxbqfkf(this, oxmwwwfdhmVar);
        this.f126763wkgbmnqykc = new wkgbmnqykc(this, oxmwwwfdhmVar);
        this.f126760eablkybsjg = new eablkybsjg(this, oxmwwwfdhmVar);
    }

    public static List nufgyqmvbu() {
        return Collections.emptyList();
    }

    @Override // u41.zoijcleaow
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(cx0.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f126761iobyxmoadg, true, new CallableC3237gxszxtbevo(dxjokdxxwwVar), gxszxtbevoVar);
    }

    @Override // yw0.eablkybsjg
    public Object eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM order_pickup_statuses WHERE id = (?)", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f126761iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new iobyxmoadg(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }
}
