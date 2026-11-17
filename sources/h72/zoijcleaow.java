package h72;

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
public final class zoijcleaow implements h72.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f39768iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lereixgezr f39769ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final btonecajqb f39770zoijcleaow;

    class eablkybsjg implements Callable {
        eablkybsjg() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow.this.f39769ppxfxbqfkf.zoijcleaow();
            try {
                zoijcleaow.this.f39768iobyxmoadg.ojitshcjhn();
                try {
                    gtknphoqwxVarZoijcleaow.pkzmftpjix();
                    zoijcleaow.this.f39768iobyxmoadg.dsvhmnatus();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaow.this.f39768iobyxmoadg.kcexrzcfyt();
                    zoijcleaow.this.f39769ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                    return wwaezpbzknVar;
                } catch (Throwable th2) {
                    zoijcleaow.this.f39768iobyxmoadg.kcexrzcfyt();
                    throw th2;
                }
            } catch (Throwable th3) {
                zoijcleaow.this.f39769ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                throw th3;
            }
        }
    }

    class gxszxtbevo implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f39772iobyxmoadg;

        gxszxtbevo(yggfygwlhe yggfygwlheVar) {
            this.f39772iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(zoijcleaow.this.f39768iobyxmoadg, this.f39772iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "fileUrl");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "type");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "endTime");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "showCount");
                ArrayList arrayList = new ArrayList(cursorPpxfxbqfkf.getCount());
                while (cursorPpxfxbqfkf.moveToNext()) {
                    arrayList.add(new j72.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : Integer.valueOf(cursorPpxfxbqfkf.getInt(iWkgbmnqykc4)), cursorPpxfxbqfkf.getInt(iWkgbmnqykc5)));
                }
                return arrayList;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f39772iobyxmoadg.release();
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
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar, j72.iobyxmoadg iobyxmoadgVar) {
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
        final /* synthetic */ yggfygwlhe f39774iobyxmoadg;

        lqeggnwhkg(yggfygwlhe yggfygwlheVar) {
            this.f39774iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public j72.iobyxmoadg call() {
            j72.iobyxmoadg iobyxmoadgVar = null;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(zoijcleaow.this.f39768iobyxmoadg, this.f39774iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "fileUrl");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "type");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "endTime");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "showCount");
                if (cursorPpxfxbqfkf.moveToFirst()) {
                    iobyxmoadgVar = new j72.iobyxmoadg(cursorPpxfxbqfkf.getInt(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.getString(iWkgbmnqykc3), cursorPpxfxbqfkf.isNull(iWkgbmnqykc4) ? null : Integer.valueOf(cursorPpxfxbqfkf.getInt(iWkgbmnqykc4)), cursorPpxfxbqfkf.getInt(iWkgbmnqykc5));
                }
                return iobyxmoadgVar;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f39774iobyxmoadg.release();
            }
        }
    }

    class ppxfxbqfkf implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ j72.iobyxmoadg f39776iobyxmoadg;

        ppxfxbqfkf(j72.iobyxmoadg iobyxmoadgVar) {
            this.f39776iobyxmoadg = iobyxmoadgVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            zoijcleaow.this.f39768iobyxmoadg.ojitshcjhn();
            try {
                zoijcleaow.this.f39770zoijcleaow.gtknphoqwx(this.f39776iobyxmoadg);
                zoijcleaow.this.f39768iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                zoijcleaow.this.f39768iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class wkgbmnqykc implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ List f39778iobyxmoadg;

        wkgbmnqykc(List list) {
            this.f39778iobyxmoadg = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            zoijcleaow.this.f39768iobyxmoadg.ojitshcjhn();
            try {
                zoijcleaow.this.f39770zoijcleaow.btonecajqb(this.f39778iobyxmoadg);
                zoijcleaow.this.f39768iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                zoijcleaow.this.f39768iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    /* JADX INFO: renamed from: h72.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class C0922zoijcleaow extends lereixgezr {
        C0922zoijcleaow(zoijcleaow zoijcleaowVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM splash_table";
        }
    }

    public zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f39768iobyxmoadg = oxmwwwfdhmVar;
        this.f39770zoijcleaow = new iobyxmoadg(this, oxmwwwfdhmVar);
        this.f39769ppxfxbqfkf = new C0922zoijcleaow(this, oxmwwwfdhmVar);
    }

    public static List dxjokdxxww() {
        return Collections.emptyList();
    }

    @Override // h72.iobyxmoadg
    public Object eablkybsjg(j72.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f39768iobyxmoadg, true, new ppxfxbqfkf(iobyxmoadgVar), gxszxtbevoVar);
    }

    @Override // h72.iobyxmoadg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f39768iobyxmoadg, true, new eablkybsjg(), gxszxtbevoVar);
    }

    @Override // h72.iobyxmoadg
    public Object ppxfxbqfkf(List list, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f39768iobyxmoadg, true, new wkgbmnqykc(list), gxszxtbevoVar);
    }

    @Override // h72.iobyxmoadg
    public Object wkgbmnqykc(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM splash_table WHERE id = (?)", 1);
        yggfygwlheVarLqeggnwhkg.s(1, i13);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f39768iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new lqeggnwhkg(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }

    @Override // h72.iobyxmoadg
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM splash_table", 0);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f39768iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new gxszxtbevo(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }
}
