package dy;

import android.database.Cursor;
import gg.wwaezpbzkn;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n5.oxmwwwfdhm;
import n5.yggfygwlhe;
import u5.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends dy.eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final n5.dxjokdxxww f29834eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f29835iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n5.btonecajqb f29836ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final n5.dxjokdxxww f29837wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f29838zoijcleaow;

    class eablkybsjg extends n5.dxjokdxxww {
        eablkybsjg(gxszxtbevo gxszxtbevoVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, hy.dxjokdxxww dxjokdxxwwVar) {
            gtknphoqwxVar.e(1, dxjokdxxwwVar.iobyxmoadg());
            gtknphoqwxVar.e(2, dxjokdxxwwVar.zoijcleaow());
            gtknphoqwxVar.e(3, dxjokdxxwwVar.iobyxmoadg());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "UPDATE OR ABORT `order_pickup_statuses` SET `id` = ?,`pickup_status` = ? WHERE `id` = ?";
        }
    }

    /* JADX INFO: renamed from: dy.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    class CallableC0611gxszxtbevo implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ hy.dxjokdxxww f29839iobyxmoadg;

        CallableC0611gxszxtbevo(hy.dxjokdxxww dxjokdxxwwVar) {
            this.f29839iobyxmoadg = dxjokdxxwwVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            gxszxtbevo.this.f29835iobyxmoadg.ojitshcjhn();
            try {
                gxszxtbevo.this.f29836ppxfxbqfkf.gtknphoqwx(this.f29839iobyxmoadg);
                gxszxtbevo.this.f29835iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                gxszxtbevo.this.f29835iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class iobyxmoadg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f29841iobyxmoadg;

        iobyxmoadg(yggfygwlhe yggfygwlheVar) {
            this.f29841iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public hy.dxjokdxxww call() {
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(gxszxtbevo.this.f29835iobyxmoadg, this.f29841iobyxmoadg, false, null);
            try {
                return cursorPpxfxbqfkf.moveToFirst() ? new hy.dxjokdxxww(cursorPpxfxbqfkf.getString(p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id")), cursorPpxfxbqfkf.getString(p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "pickup_status"))) : null;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f29841iobyxmoadg.release();
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
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, hy.dxjokdxxww dxjokdxxwwVar) {
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
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, hy.dxjokdxxww dxjokdxxwwVar) {
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
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, hy.dxjokdxxww dxjokdxxwwVar) {
            gtknphoqwxVar.e(1, dxjokdxxwwVar.iobyxmoadg());
            gtknphoqwxVar.e(2, dxjokdxxwwVar.zoijcleaow());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR ABORT INTO `order_pickup_statuses` (`id`,`pickup_status`) VALUES (?,?)";
        }
    }

    public gxszxtbevo(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f29835iobyxmoadg = oxmwwwfdhmVar;
        this.f29838zoijcleaow = new zoijcleaow(this, oxmwwwfdhmVar);
        this.f29836ppxfxbqfkf = new ppxfxbqfkf(this, oxmwwwfdhmVar);
        this.f29837wkgbmnqykc = new wkgbmnqykc(this, oxmwwwfdhmVar);
        this.f29834eablkybsjg = new eablkybsjg(this, oxmwwwfdhmVar);
    }

    public static List dxjokdxxww() {
        return Collections.emptyList();
    }

    @Override // h60.zoijcleaow
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public Object zoijcleaow(hy.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f29835iobyxmoadg, true, new CallableC0611gxszxtbevo(dxjokdxxwwVar), gxszxtbevoVar);
    }

    @Override // dy.eablkybsjg
    public Object gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM order_pickup_statuses WHERE id = (?)", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f29835iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new iobyxmoadg(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }
}
