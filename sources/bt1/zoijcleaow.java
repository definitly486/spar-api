package bt1;

import android.database.Cursor;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n5.btonecajqb;
import n5.lereixgezr;
import n5.oxmwwwfdhm;
import n5.yggfygwlhe;
import u5.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements bt1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f17114iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final btonecajqb f17115ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lereixgezr f17116wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final btonecajqb f17117zoijcleaow;

    class eablkybsjg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ List f17118iobyxmoadg;

        eablkybsjg(List list) {
            this.f17118iobyxmoadg = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            zoijcleaow.this.f17114iobyxmoadg.ojitshcjhn();
            try {
                zoijcleaow.this.f17115ppxfxbqfkf.btonecajqb(this.f17118iobyxmoadg);
                zoijcleaow.this.f17114iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                zoijcleaow.this.f17114iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class gxszxtbevo implements Callable {
        gxszxtbevo() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow.this.f17116wkgbmnqykc.zoijcleaow();
            try {
                zoijcleaow.this.f17114iobyxmoadg.ojitshcjhn();
                try {
                    gtknphoqwxVarZoijcleaow.pkzmftpjix();
                    zoijcleaow.this.f17114iobyxmoadg.dsvhmnatus();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaow.this.f17114iobyxmoadg.kcexrzcfyt();
                    zoijcleaow.this.f17116wkgbmnqykc.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                    return wwaezpbzknVar;
                } catch (Throwable th2) {
                    zoijcleaow.this.f17114iobyxmoadg.kcexrzcfyt();
                    throw th2;
                }
            } catch (Throwable th3) {
                zoijcleaow.this.f17116wkgbmnqykc.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                throw th3;
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
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, dt1.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwxVar.s(1, iobyxmoadgVar.eablkybsjg());
            gtknphoqwxVar.e(2, iobyxmoadgVar.wkgbmnqykc());
            gtknphoqwxVar.e(3, iobyxmoadgVar.lqeggnwhkg());
            if (iobyxmoadgVar.ppxfxbqfkf() == null) {
                gtknphoqwxVar.N(4);
            } else {
                gtknphoqwxVar.s(4, iobyxmoadgVar.ppxfxbqfkf().intValue());
            }
            gtknphoqwxVar.s(5, iobyxmoadgVar.gxszxtbevo());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `splash_table` (`id`,`fileUrl`,`type`,`endTime`,`showCount`) VALUES (?,?,?,?,?)";
        }
    }

    class lqeggnwhkg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f17121iobyxmoadg;

        lqeggnwhkg(yggfygwlhe yggfygwlheVar) {
            this.f17121iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(zoijcleaow.this.f17114iobyxmoadg, this.f17121iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "fileUrl");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "type");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "endTime");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "showCount");
                ArrayList arrayList = new ArrayList(cursorPpxfxbqfkf.getCount());
                while (cursorPpxfxbqfkf.moveToNext()) {
                    arrayList.add(new dt1.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : Integer.valueOf(cursorPpxfxbqfkf.getInt(iWkgbmnqykc4)), cursorPpxfxbqfkf.getInt(iWkgbmnqykc5)));
                }
                return arrayList;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f17121iobyxmoadg.release();
            }
        }
    }

    class nufgyqmvbu implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f17123iobyxmoadg;

        nufgyqmvbu(yggfygwlhe yggfygwlheVar) {
            this.f17123iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public dt1.iobyxmoadg call() {
            dt1.iobyxmoadg iobyxmoadgVar = null;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(zoijcleaow.this.f17114iobyxmoadg, this.f17123iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "fileUrl");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "type");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "endTime");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "showCount");
                if (cursorPpxfxbqfkf.moveToFirst()) {
                    iobyxmoadgVar = new dt1.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : Integer.valueOf(cursorPpxfxbqfkf.getInt(iWkgbmnqykc4)), cursorPpxfxbqfkf.getInt(iWkgbmnqykc5));
                }
                return iobyxmoadgVar;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f17123iobyxmoadg.release();
            }
        }
    }

    class ppxfxbqfkf extends lereixgezr {
        ppxfxbqfkf(zoijcleaow zoijcleaowVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM splash_table";
        }
    }

    class wkgbmnqykc implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ dt1.iobyxmoadg f17125iobyxmoadg;

        wkgbmnqykc(dt1.iobyxmoadg iobyxmoadgVar) {
            this.f17125iobyxmoadg = iobyxmoadgVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            zoijcleaow.this.f17114iobyxmoadg.ojitshcjhn();
            try {
                zoijcleaow.this.f17117zoijcleaow.gtknphoqwx(this.f17125iobyxmoadg);
                zoijcleaow.this.f17114iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                zoijcleaow.this.f17114iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    /* JADX INFO: renamed from: bt1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class C0306zoijcleaow extends btonecajqb {
        C0306zoijcleaow(zoijcleaow zoijcleaowVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, dt1.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwxVar.s(1, iobyxmoadgVar.eablkybsjg());
            gtknphoqwxVar.e(2, iobyxmoadgVar.wkgbmnqykc());
            gtknphoqwxVar.e(3, iobyxmoadgVar.lqeggnwhkg());
            if (iobyxmoadgVar.ppxfxbqfkf() == null) {
                gtknphoqwxVar.N(4);
            } else {
                gtknphoqwxVar.s(4, iobyxmoadgVar.ppxfxbqfkf().intValue());
            }
            gtknphoqwxVar.s(5, iobyxmoadgVar.gxszxtbevo());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR ABORT INTO `splash_table` (`id`,`fileUrl`,`type`,`endTime`,`showCount`) VALUES (?,?,?,?,?)";
        }
    }

    public zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f17114iobyxmoadg = oxmwwwfdhmVar;
        this.f17117zoijcleaow = new iobyxmoadg(this, oxmwwwfdhmVar);
        this.f17115ppxfxbqfkf = new C0306zoijcleaow(this, oxmwwwfdhmVar);
        this.f17116wkgbmnqykc = new ppxfxbqfkf(this, oxmwwwfdhmVar);
    }

    public static List btonecajqb() {
        return Collections.emptyList();
    }

    @Override // bt1.iobyxmoadg
    public Object eablkybsjg(dt1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f17114iobyxmoadg, true, new wkgbmnqykc(iobyxmoadgVar), gxszxtbevoVar);
    }

    @Override // bt1.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f17114iobyxmoadg, true, new gxszxtbevo(), gxszxtbevoVar);
    }

    @Override // bt1.iobyxmoadg
    public Object ppxfxbqfkf(List list, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f17114iobyxmoadg, true, new eablkybsjg(list), gxszxtbevoVar);
    }

    @Override // bt1.iobyxmoadg
    public Object wkgbmnqykc(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM splash_table WHERE id = (?)", 1);
        yggfygwlheVarLqeggnwhkg.s(1, i13);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f17114iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new nufgyqmvbu(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }

    @Override // bt1.iobyxmoadg
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM splash_table", 0);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f17114iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new lqeggnwhkg(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }
}
