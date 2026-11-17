package yv1;

import android.database.Cursor;
import com.google.android.gms.common.Scopes;
import gg.wwaezpbzkn;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n5.btonecajqb;
import n5.lereixgezr;
import n5.oxmwwwfdhm;
import n5.yggfygwlhe;
import sj.lqeggnwhkg;
import u5.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements yv1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f126728iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lereixgezr f126729ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final btonecajqb f126730zoijcleaow;

    class eablkybsjg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f126731iobyxmoadg;

        eablkybsjg(yggfygwlhe yggfygwlheVar) {
            this.f126731iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public dw1.ppxfxbqfkf call() throws Throwable {
            dw1.ppxfxbqfkf ppxfxbqfkfVar;
            eablkybsjg eablkybsjgVar = this;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(zoijcleaow.this.f126728iobyxmoadg, eablkybsjgVar.f126731iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "phone");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, Scopes.EMAIL);
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "firstName");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "lastName");
                int iWkgbmnqykc6 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "isActive");
                int iWkgbmnqykc7 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "isCardBlocked");
                int iWkgbmnqykc8 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "agreementAccepted");
                int iWkgbmnqykc9 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "gender");
                int iWkgbmnqykc10 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "dateBirth");
                int iWkgbmnqykc11 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "scangoAccess");
                int iWkgbmnqykc12 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "webviewToken");
                int iWkgbmnqykc13 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "gameToken");
                int iWkgbmnqykc14 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "cardNumber");
                try {
                    int iWkgbmnqykc15 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "isEReceiptAccepted");
                    if (cursorPpxfxbqfkf.moveToFirst()) {
                        ppxfxbqfkfVar = new dw1.ppxfxbqfkf(cursorPpxfxbqfkf.getString(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.getString(iWkgbmnqykc4), cursorPpxfxbqfkf.getString(iWkgbmnqykc5), cursorPpxfxbqfkf.getInt(iWkgbmnqykc6) != 0, cursorPpxfxbqfkf.getInt(iWkgbmnqykc7) != 0, cursorPpxfxbqfkf.getInt(iWkgbmnqykc8) != 0, cursorPpxfxbqfkf.getString(iWkgbmnqykc9), cursorPpxfxbqfkf.getString(iWkgbmnqykc10), cursorPpxfxbqfkf.getInt(iWkgbmnqykc11) != 0, cursorPpxfxbqfkf.getString(iWkgbmnqykc12), cursorPpxfxbqfkf.getString(iWkgbmnqykc13), cursorPpxfxbqfkf.getString(iWkgbmnqykc14), cursorPpxfxbqfkf.getInt(iWkgbmnqykc15) != 0);
                    } else {
                        ppxfxbqfkfVar = null;
                    }
                    cursorPpxfxbqfkf.close();
                    this.f126731iobyxmoadg.release();
                    return ppxfxbqfkfVar;
                } catch (Throwable th2) {
                    th = th2;
                    eablkybsjgVar = this;
                    cursorPpxfxbqfkf.close();
                    eablkybsjgVar.f126731iobyxmoadg.release();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    class gxszxtbevo implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f126733iobyxmoadg;

        gxszxtbevo(yggfygwlhe yggfygwlheVar) {
            this.f126733iobyxmoadg = yggfygwlheVar;
        }

        protected void finalize() {
            this.f126733iobyxmoadg.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public dw1.ppxfxbqfkf call() {
            dw1.ppxfxbqfkf ppxfxbqfkfVar;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(zoijcleaow.this.f126728iobyxmoadg, this.f126733iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "phone");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, Scopes.EMAIL);
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "firstName");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "lastName");
                int iWkgbmnqykc6 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "isActive");
                int iWkgbmnqykc7 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "isCardBlocked");
                int iWkgbmnqykc8 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "agreementAccepted");
                int iWkgbmnqykc9 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "gender");
                int iWkgbmnqykc10 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "dateBirth");
                int iWkgbmnqykc11 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "scangoAccess");
                int iWkgbmnqykc12 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "webviewToken");
                int iWkgbmnqykc13 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "gameToken");
                int iWkgbmnqykc14 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "cardNumber");
                int iWkgbmnqykc15 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "isEReceiptAccepted");
                if (cursorPpxfxbqfkf.moveToFirst()) {
                    ppxfxbqfkfVar = new dw1.ppxfxbqfkf(cursorPpxfxbqfkf.getString(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.getString(iWkgbmnqykc4), cursorPpxfxbqfkf.getString(iWkgbmnqykc5), cursorPpxfxbqfkf.getInt(iWkgbmnqykc6) != 0, cursorPpxfxbqfkf.getInt(iWkgbmnqykc7) != 0, cursorPpxfxbqfkf.getInt(iWkgbmnqykc8) != 0, cursorPpxfxbqfkf.getString(iWkgbmnqykc9), cursorPpxfxbqfkf.getString(iWkgbmnqykc10), cursorPpxfxbqfkf.getInt(iWkgbmnqykc11) != 0, cursorPpxfxbqfkf.getString(iWkgbmnqykc12), cursorPpxfxbqfkf.getString(iWkgbmnqykc13), cursorPpxfxbqfkf.getString(iWkgbmnqykc14), cursorPpxfxbqfkf.getInt(iWkgbmnqykc15) != 0);
                } else {
                    ppxfxbqfkfVar = null;
                }
                return ppxfxbqfkfVar;
            } finally {
                cursorPpxfxbqfkf.close();
            }
        }
    }

    class iobyxmoadg extends btonecajqb {
        iobyxmoadg(zoijcleaow zoijcleaowVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, dw1.ppxfxbqfkf ppxfxbqfkfVar) {
            gtknphoqwxVar.e(1, ppxfxbqfkfVar.btonecajqb());
            gtknphoqwxVar.e(2, ppxfxbqfkfVar.draadjrbmk());
            gtknphoqwxVar.e(3, ppxfxbqfkfVar.gxszxtbevo());
            gtknphoqwxVar.e(4, ppxfxbqfkfVar.lqeggnwhkg());
            gtknphoqwxVar.e(5, ppxfxbqfkfVar.gtknphoqwx());
            gtknphoqwxVar.s(6, ppxfxbqfkfVar.ojitshcjhn() ? 1L : 0L);
            gtknphoqwxVar.s(7, ppxfxbqfkfVar.rgvfuqvkyq() ? 1L : 0L);
            gtknphoqwxVar.s(8, ppxfxbqfkfVar.ppxfxbqfkf() ? 1L : 0L);
            gtknphoqwxVar.e(9, ppxfxbqfkfVar.dxjokdxxww());
            gtknphoqwxVar.e(10, ppxfxbqfkfVar.eablkybsjg());
            gtknphoqwxVar.s(11, ppxfxbqfkfVar.wflxmlrfwp() ? 1L : 0L);
            gtknphoqwxVar.e(12, ppxfxbqfkfVar.agtfadlqog());
            gtknphoqwxVar.e(13, ppxfxbqfkfVar.nufgyqmvbu());
            gtknphoqwxVar.e(14, ppxfxbqfkfVar.wkgbmnqykc());
            gtknphoqwxVar.s(15, ppxfxbqfkfVar.vdvldrhtss() ? 1L : 0L);
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `user_info` (`id`,`phone`,`email`,`firstName`,`lastName`,`isActive`,`isCardBlocked`,`agreementAccepted`,`gender`,`dateBirth`,`scangoAccess`,`webviewToken`,`gameToken`,`cardNumber`,`isEReceiptAccepted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class ppxfxbqfkf implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ dw1.ppxfxbqfkf f126735iobyxmoadg;

        ppxfxbqfkf(dw1.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f126735iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            zoijcleaow.this.f126728iobyxmoadg.ojitshcjhn();
            try {
                zoijcleaow.this.f126730zoijcleaow.gtknphoqwx(this.f126735iobyxmoadg);
                zoijcleaow.this.f126728iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                zoijcleaow.this.f126728iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class wkgbmnqykc implements Callable {
        wkgbmnqykc() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow.this.f126729ppxfxbqfkf.zoijcleaow();
            try {
                zoijcleaow.this.f126728iobyxmoadg.ojitshcjhn();
                try {
                    gtknphoqwxVarZoijcleaow.pkzmftpjix();
                    zoijcleaow.this.f126728iobyxmoadg.dsvhmnatus();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaow.this.f126728iobyxmoadg.kcexrzcfyt();
                    zoijcleaow.this.f126729ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                    return wwaezpbzknVar;
                } catch (Throwable th2) {
                    zoijcleaow.this.f126728iobyxmoadg.kcexrzcfyt();
                    throw th2;
                }
            } catch (Throwable th3) {
                zoijcleaow.this.f126729ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: yv1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class C3235zoijcleaow extends lereixgezr {
        C3235zoijcleaow(zoijcleaow zoijcleaowVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM user_info";
        }
    }

    public zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f126728iobyxmoadg = oxmwwwfdhmVar;
        this.f126730zoijcleaow = new iobyxmoadg(this, oxmwwwfdhmVar);
        this.f126729ppxfxbqfkf = new C3235zoijcleaow(this, oxmwwwfdhmVar);
    }

    public static List nufgyqmvbu() {
        return Collections.emptyList();
    }

    @Override // yv1.iobyxmoadg
    public lqeggnwhkg iobyxmoadg() {
        return androidx.room.iobyxmoadg.iobyxmoadg(this.f126728iobyxmoadg, false, new String[]{"user_info"}, new gxszxtbevo(yggfygwlhe.lqeggnwhkg("SELECT * FROM user_info", 0)));
    }

    @Override // yv1.iobyxmoadg
    public Object ppxfxbqfkf(dw1.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f126728iobyxmoadg, true, new ppxfxbqfkf(ppxfxbqfkfVar), gxszxtbevoVar);
    }

    @Override // yv1.iobyxmoadg
    public Object wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f126728iobyxmoadg, true, new wkgbmnqykc(), gxszxtbevoVar);
    }

    @Override // yv1.iobyxmoadg
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM user_info", 0);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f126728iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new eablkybsjg(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }
}
