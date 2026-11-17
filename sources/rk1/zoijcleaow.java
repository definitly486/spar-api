package rk1;

import android.database.Cursor;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n5.lereixgezr;
import n5.oxmwwwfdhm;
import n5.yggfygwlhe;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends rk1.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final n5.dxjokdxxww f83001eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lereixgezr f83002gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f83003iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n5.btonecajqb f83004ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final n5.dxjokdxxww f83005wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f83006zoijcleaow;

    class btonecajqb extends lereixgezr {
        btonecajqb(zoijcleaow zoijcleaowVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM qr_statuses";
        }
    }

    class dxjokdxxww extends n5.dxjokdxxww {
        dxjokdxxww(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.ppxfxbqfkf ppxfxbqfkfVar) {
            gtknphoqwxVar.e(1, ppxfxbqfkfVar.iobyxmoadg());
            gtknphoqwxVar.e(2, zoijcleaow.this.agtfadlqog(ppxfxbqfkfVar.zoijcleaow()));
            gtknphoqwxVar.e(3, ppxfxbqfkfVar.iobyxmoadg());
            gtknphoqwxVar.e(4, zoijcleaow.this.agtfadlqog(ppxfxbqfkfVar.zoijcleaow()));
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "UPDATE OR ABORT `qr_statuses` SET `qrcode_id` = ?,`status` = ? WHERE `qrcode_id` = ? AND `status` = ?";
        }
    }

    static /* synthetic */ class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f83008iobyxmoadg;

        static {
            int[] iArr = new int[tk1.eablkybsjg.values().length];
            f83008iobyxmoadg = iArr;
            try {
                iArr[tk1.eablkybsjg.ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83008iobyxmoadg[tk1.eablkybsjg.ARCHIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class gtknphoqwx implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tk1.ppxfxbqfkf f83009iobyxmoadg;

        gtknphoqwx(tk1.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f83009iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            zoijcleaow.this.f83003iobyxmoadg.ojitshcjhn();
            try {
                zoijcleaow.this.f83004ppxfxbqfkf.gtknphoqwx(this.f83009iobyxmoadg);
                zoijcleaow.this.f83003iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                zoijcleaow.this.f83003iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class gxszxtbevo extends n5.btonecajqb {
        gxszxtbevo(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.ppxfxbqfkf ppxfxbqfkfVar) {
            gtknphoqwxVar.e(1, ppxfxbqfkfVar.iobyxmoadg());
            gtknphoqwxVar.e(2, zoijcleaow.this.agtfadlqog(ppxfxbqfkfVar.zoijcleaow()));
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR ABORT INTO `qr_statuses` (`qrcode_id`,`status`) VALUES (?,?)";
        }
    }

    class iobyxmoadg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ List f83012iobyxmoadg;

        iobyxmoadg(List list) {
            this.f83012iobyxmoadg = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            zoijcleaow.this.f83003iobyxmoadg.ojitshcjhn();
            try {
                zoijcleaow.this.f83004ppxfxbqfkf.btonecajqb(this.f83012iobyxmoadg);
                zoijcleaow.this.f83003iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                zoijcleaow.this.f83003iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class lqeggnwhkg extends n5.btonecajqb {
        lqeggnwhkg(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.ppxfxbqfkf ppxfxbqfkfVar) {
            gtknphoqwxVar.e(1, ppxfxbqfkfVar.iobyxmoadg());
            gtknphoqwxVar.e(2, zoijcleaow.this.agtfadlqog(ppxfxbqfkfVar.zoijcleaow()));
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `qr_statuses` (`qrcode_id`,`status`) VALUES (?,?)";
        }
    }

    class nufgyqmvbu extends n5.dxjokdxxww {
        nufgyqmvbu(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.ppxfxbqfkf ppxfxbqfkfVar) {
            gtknphoqwxVar.e(1, ppxfxbqfkfVar.iobyxmoadg());
            gtknphoqwxVar.e(2, zoijcleaow.this.agtfadlqog(ppxfxbqfkfVar.zoijcleaow()));
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "DELETE FROM `qr_statuses` WHERE `qrcode_id` = ? AND `status` = ?";
        }
    }

    class ppxfxbqfkf implements Callable {
        ppxfxbqfkf() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            u5.gtknphoqwx gtknphoqwxVarZoijcleaow = zoijcleaow.this.f83002gxszxtbevo.zoijcleaow();
            try {
                zoijcleaow.this.f83003iobyxmoadg.ojitshcjhn();
                try {
                    gtknphoqwxVarZoijcleaow.pkzmftpjix();
                    zoijcleaow.this.f83003iobyxmoadg.dsvhmnatus();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    zoijcleaow.this.f83003iobyxmoadg.kcexrzcfyt();
                    zoijcleaow.this.f83002gxszxtbevo.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                    return wwaezpbzknVar;
                } catch (Throwable th2) {
                    zoijcleaow.this.f83003iobyxmoadg.kcexrzcfyt();
                    throw th2;
                }
            } catch (Throwable th3) {
                zoijcleaow.this.f83002gxszxtbevo.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                throw th3;
            }
        }
    }

    class wkgbmnqykc implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f83017iobyxmoadg;

        wkgbmnqykc(yggfygwlhe yggfygwlheVar) {
            this.f83017iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(zoijcleaow.this.f83003iobyxmoadg, this.f83017iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "qrcode_id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "status");
                ArrayList arrayList = new ArrayList(cursorPpxfxbqfkf.getCount());
                while (cursorPpxfxbqfkf.moveToNext()) {
                    arrayList.add(new tk1.ppxfxbqfkf(cursorPpxfxbqfkf.getString(iWkgbmnqykc), zoijcleaow.this.ojitshcjhn(cursorPpxfxbqfkf.getString(iWkgbmnqykc2))));
                }
                cursorPpxfxbqfkf.close();
                this.f83017iobyxmoadg.release();
                return arrayList;
            } catch (Throwable th2) {
                cursorPpxfxbqfkf.close();
                this.f83017iobyxmoadg.release();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: rk1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class CallableC1860zoijcleaow implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ List f83019iobyxmoadg;

        CallableC1860zoijcleaow(List list) {
            this.f83019iobyxmoadg = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            zoijcleaow.this.f83003iobyxmoadg.ojitshcjhn();
            try {
                zoijcleaow.this.f83005wkgbmnqykc.gtknphoqwx(this.f83019iobyxmoadg);
                zoijcleaow.this.f83003iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                zoijcleaow.this.f83003iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    public zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f83003iobyxmoadg = oxmwwwfdhmVar;
        this.f83006zoijcleaow = new gxszxtbevo(oxmwwwfdhmVar);
        this.f83004ppxfxbqfkf = new lqeggnwhkg(oxmwwwfdhmVar);
        this.f83005wkgbmnqykc = new nufgyqmvbu(oxmwwwfdhmVar);
        this.f83001eablkybsjg = new dxjokdxxww(oxmwwwfdhmVar);
        this.f83002gxszxtbevo = new btonecajqb(this, oxmwwwfdhmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String agtfadlqog(tk1.eablkybsjg eablkybsjgVar) {
        int i13 = eablkybsjg.f83008iobyxmoadg[eablkybsjgVar.ordinal()];
        if (i13 == 1) {
            return "ACTIVATED";
        }
        if (i13 == 2) {
            return "ARCHIVED";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + eablkybsjgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tk1.eablkybsjg ojitshcjhn(String str) {
        str.hashCode();
        if (str.equals("ACTIVATED")) {
            return tk1.eablkybsjg.ACTIVATED;
        }
        if (str.equals("ARCHIVED")) {
            return tk1.eablkybsjg.ARCHIVED;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    public static List rgvfuqvkyq() {
        return Collections.emptyList();
    }

    @Override // rk1.iobyxmoadg
    public Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f83003iobyxmoadg, true, new ppxfxbqfkf(), gxszxtbevoVar);
    }

    @Override // rk1.iobyxmoadg
    public Object gxszxtbevo(List list, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f83003iobyxmoadg, true, new CallableC1860zoijcleaow(list), gxszxtbevoVar);
    }

    @Override // rk1.iobyxmoadg
    public Object lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM qr_statuses", 0);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f83003iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new wkgbmnqykc(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }

    @Override // u41.zoijcleaow
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(tk1.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f83003iobyxmoadg, true, new gtknphoqwx(ppxfxbqfkfVar), gxszxtbevoVar);
    }

    @Override // u41.zoijcleaow
    public Object zoijcleaow(List list, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f83003iobyxmoadg, true, new iobyxmoadg(list), gxszxtbevoVar);
    }
}
