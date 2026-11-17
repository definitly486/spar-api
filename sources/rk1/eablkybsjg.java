package rk1;

import android.database.Cursor;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import lg.gxszxtbevo;
import n5.lereixgezr;
import n5.oxmwwwfdhm;
import n5.yggfygwlhe;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg extends rk1.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final n5.dxjokdxxww f82973eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final n5.dxjokdxxww f82974gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f82975iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final lereixgezr f82976lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n5.btonecajqb f82977ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final n5.dxjokdxxww f82978wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f82979zoijcleaow;

    class agtfadlqog extends lereixgezr {
        agtfadlqog(eablkybsjg eablkybsjgVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM qrs";
        }
    }

    class btonecajqb extends n5.btonecajqb {
        btonecajqb(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwxVar.e(1, iobyxmoadgVar.wkgbmnqykc());
            gtknphoqwxVar.e(2, iobyxmoadgVar.ppxfxbqfkf());
            if (iobyxmoadgVar.gxszxtbevo() == null) {
                gtknphoqwxVar.N(3);
            } else {
                gtknphoqwxVar.e(3, eablkybsjg.this.yggfygwlhe(iobyxmoadgVar.gxszxtbevo()));
            }
            gtknphoqwxVar.e(4, eablkybsjg.this.iwizpuwonk(iobyxmoadgVar.lqeggnwhkg()));
            if (iobyxmoadgVar.eablkybsjg() == null) {
                gtknphoqwxVar.N(5);
            } else {
                gtknphoqwxVar.s(5, iobyxmoadgVar.eablkybsjg().intValue());
            }
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `qrs` (`id`,`code`,`status`,`type`,`lifeTime`) VALUES (?,?,?,?,?)";
        }
    }

    class draadjrbmk extends n5.dxjokdxxww {
        draadjrbmk(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwxVar.e(1, iobyxmoadgVar.wkgbmnqykc());
            gtknphoqwxVar.e(2, iobyxmoadgVar.ppxfxbqfkf());
            if (iobyxmoadgVar.gxszxtbevo() == null) {
                gtknphoqwxVar.N(3);
            } else {
                gtknphoqwxVar.e(3, eablkybsjg.this.yggfygwlhe(iobyxmoadgVar.gxszxtbevo()));
            }
            gtknphoqwxVar.e(4, eablkybsjg.this.iwizpuwonk(iobyxmoadgVar.lqeggnwhkg()));
            if (iobyxmoadgVar.eablkybsjg() == null) {
                gtknphoqwxVar.N(5);
            } else {
                gtknphoqwxVar.s(5, iobyxmoadgVar.eablkybsjg().intValue());
            }
            gtknphoqwxVar.e(6, iobyxmoadgVar.wkgbmnqykc());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "UPDATE OR ABORT `qrs` SET `id` = ?,`code` = ?,`status` = ?,`type` = ?,`lifeTime` = ? WHERE `id` = ?";
        }
    }

    static /* synthetic */ class dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f82982iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f82983zoijcleaow;

        static {
            int[] iArr = new int[tk1.iobyxmoadg.zoijcleaow.values().length];
            f82983zoijcleaow = iArr;
            try {
                iArr[tk1.iobyxmoadg.zoijcleaow.DYNAMIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82983zoijcleaow[tk1.iobyxmoadg.zoijcleaow.STATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[tk1.eablkybsjg.values().length];
            f82982iobyxmoadg = iArr2;
            try {
                iArr2[tk1.eablkybsjg.ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82982iobyxmoadg[tk1.eablkybsjg.ARCHIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: rk1.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    class CallableC1859eablkybsjg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f82984iobyxmoadg;

        CallableC1859eablkybsjg(yggfygwlhe yggfygwlheVar) {
            this.f82984iobyxmoadg = yggfygwlheVar;
        }

        protected void finalize() {
            this.f82984iobyxmoadg.release();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(eablkybsjg.this.f82975iobyxmoadg, this.f82984iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "code");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "status");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "type");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "lifeTime");
                ArrayList arrayList = new ArrayList(cursorPpxfxbqfkf.getCount());
                while (cursorPpxfxbqfkf.moveToNext()) {
                    arrayList.add(new tk1.iobyxmoadg(cursorPpxfxbqfkf.getString(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.isNull(iWkgbmnqykc3) ? null : eablkybsjg.this.jyumaefscl(cursorPpxfxbqfkf.getString(iWkgbmnqykc3)), eablkybsjg.this.cqumvgiudr(cursorPpxfxbqfkf.getString(iWkgbmnqykc4)), cursorPpxfxbqfkf.isNull(iWkgbmnqykc5) ? null : Integer.valueOf(cursorPpxfxbqfkf.getInt(iWkgbmnqykc5))));
                }
                return arrayList;
            } finally {
                cursorPpxfxbqfkf.close();
            }
        }
    }

    class gtknphoqwx extends n5.dxjokdxxww {
        gtknphoqwx(eablkybsjg eablkybsjgVar, oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwxVar.e(1, iobyxmoadgVar.wkgbmnqykc());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "DELETE FROM `qrs` WHERE `id` = ?";
        }
    }

    class gxszxtbevo extends n5.btonecajqb {
        gxszxtbevo(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwxVar.e(1, iobyxmoadgVar.wkgbmnqykc());
            gtknphoqwxVar.e(2, iobyxmoadgVar.ppxfxbqfkf());
            if (iobyxmoadgVar.gxszxtbevo() == null) {
                gtknphoqwxVar.N(3);
            } else {
                gtknphoqwxVar.e(3, eablkybsjg.this.yggfygwlhe(iobyxmoadgVar.gxszxtbevo()));
            }
            gtknphoqwxVar.e(4, eablkybsjg.this.iwizpuwonk(iobyxmoadgVar.lqeggnwhkg()));
            if (iobyxmoadgVar.eablkybsjg() == null) {
                gtknphoqwxVar.N(5);
            } else {
                gtknphoqwxVar.s(5, iobyxmoadgVar.eablkybsjg().intValue());
            }
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR ABORT INTO `qrs` (`id`,`code`,`status`,`type`,`lifeTime`) VALUES (?,?,?,?,?)";
        }
    }

    class iobyxmoadg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ List f82987iobyxmoadg;

        iobyxmoadg(List list) {
            this.f82987iobyxmoadg = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            eablkybsjg.this.f82975iobyxmoadg.ojitshcjhn();
            try {
                eablkybsjg.this.f82977ppxfxbqfkf.btonecajqb(this.f82987iobyxmoadg);
                eablkybsjg.this.f82975iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                eablkybsjg.this.f82975iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class lqeggnwhkg implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f82989iobyxmoadg;

        lqeggnwhkg(yggfygwlhe yggfygwlheVar) {
            this.f82989iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(eablkybsjg.this.f82975iobyxmoadg, this.f82989iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "code");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "status");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "type");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "lifeTime");
                ArrayList arrayList = new ArrayList(cursorPpxfxbqfkf.getCount());
                while (cursorPpxfxbqfkf.moveToNext()) {
                    arrayList.add(new tk1.iobyxmoadg(cursorPpxfxbqfkf.getString(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.isNull(iWkgbmnqykc3) ? null : eablkybsjg.this.jyumaefscl(cursorPpxfxbqfkf.getString(iWkgbmnqykc3)), eablkybsjg.this.cqumvgiudr(cursorPpxfxbqfkf.getString(iWkgbmnqykc4)), cursorPpxfxbqfkf.isNull(iWkgbmnqykc5) ? null : Integer.valueOf(cursorPpxfxbqfkf.getInt(iWkgbmnqykc5))));
                }
                return arrayList;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f82989iobyxmoadg.release();
            }
        }
    }

    class nufgyqmvbu implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ yggfygwlhe f82991iobyxmoadg;

        nufgyqmvbu(yggfygwlhe yggfygwlheVar) {
            this.f82991iobyxmoadg = yggfygwlheVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public tk1.iobyxmoadg call() {
            tk1.iobyxmoadg iobyxmoadgVar = null;
            Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(eablkybsjg.this.f82975iobyxmoadg, this.f82991iobyxmoadg, false, null);
            try {
                int iWkgbmnqykc = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "id");
                int iWkgbmnqykc2 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "code");
                int iWkgbmnqykc3 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "status");
                int iWkgbmnqykc4 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "type");
                int iWkgbmnqykc5 = p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "lifeTime");
                if (cursorPpxfxbqfkf.moveToFirst()) {
                    iobyxmoadgVar = new tk1.iobyxmoadg(cursorPpxfxbqfkf.getString(iWkgbmnqykc), cursorPpxfxbqfkf.getString(iWkgbmnqykc2), cursorPpxfxbqfkf.isNull(iWkgbmnqykc3) ? null : eablkybsjg.this.jyumaefscl(cursorPpxfxbqfkf.getString(iWkgbmnqykc3)), eablkybsjg.this.cqumvgiudr(cursorPpxfxbqfkf.getString(iWkgbmnqykc4)), cursorPpxfxbqfkf.isNull(iWkgbmnqykc5) ? null : Integer.valueOf(cursorPpxfxbqfkf.getInt(iWkgbmnqykc5)));
                }
                return iobyxmoadgVar;
            } finally {
                cursorPpxfxbqfkf.close();
                this.f82991iobyxmoadg.release();
            }
        }
    }

    class ppxfxbqfkf implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ List f82993iobyxmoadg;

        ppxfxbqfkf(List list) {
            this.f82993iobyxmoadg = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            eablkybsjg.this.f82975iobyxmoadg.ojitshcjhn();
            try {
                eablkybsjg.this.f82974gxszxtbevo.gtknphoqwx(this.f82993iobyxmoadg);
                eablkybsjg.this.f82975iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                eablkybsjg.this.f82975iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    class wflxmlrfwp extends n5.dxjokdxxww {
        wflxmlrfwp(oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.dxjokdxxww
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, tk1.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwxVar.e(1, iobyxmoadgVar.wkgbmnqykc());
            gtknphoqwxVar.e(2, iobyxmoadgVar.ppxfxbqfkf());
            if (iobyxmoadgVar.gxszxtbevo() == null) {
                gtknphoqwxVar.N(3);
            } else {
                gtknphoqwxVar.e(3, eablkybsjg.this.yggfygwlhe(iobyxmoadgVar.gxszxtbevo()));
            }
            gtknphoqwxVar.e(4, eablkybsjg.this.iwizpuwonk(iobyxmoadgVar.lqeggnwhkg()));
            if (iobyxmoadgVar.eablkybsjg() == null) {
                gtknphoqwxVar.N(5);
            } else {
                gtknphoqwxVar.s(5, iobyxmoadgVar.eablkybsjg().intValue());
            }
            gtknphoqwxVar.e(6, iobyxmoadgVar.wkgbmnqykc());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "UPDATE OR REPLACE `qrs` SET `id` = ?,`code` = ?,`status` = ?,`type` = ?,`lifeTime` = ? WHERE `id` = ?";
        }
    }

    class wkgbmnqykc implements Callable {
        wkgbmnqykc() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            u5.gtknphoqwx gtknphoqwxVarZoijcleaow = eablkybsjg.this.f82976lqeggnwhkg.zoijcleaow();
            try {
                eablkybsjg.this.f82975iobyxmoadg.ojitshcjhn();
                try {
                    gtknphoqwxVarZoijcleaow.pkzmftpjix();
                    eablkybsjg.this.f82975iobyxmoadg.dsvhmnatus();
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    eablkybsjg.this.f82975iobyxmoadg.kcexrzcfyt();
                    eablkybsjg.this.f82976lqeggnwhkg.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                    return wwaezpbzknVar;
                } catch (Throwable th2) {
                    eablkybsjg.this.f82975iobyxmoadg.kcexrzcfyt();
                    throw th2;
                }
            } catch (Throwable th3) {
                eablkybsjg.this.f82976lqeggnwhkg.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
                throw th3;
            }
        }
    }

    class zoijcleaow implements Callable {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tk1.iobyxmoadg f82997iobyxmoadg;

        zoijcleaow(tk1.iobyxmoadg iobyxmoadgVar) {
            this.f82997iobyxmoadg = iobyxmoadgVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public wwaezpbzkn call() {
            eablkybsjg.this.f82975iobyxmoadg.ojitshcjhn();
            try {
                eablkybsjg.this.f82974gxszxtbevo.btonecajqb(this.f82997iobyxmoadg);
                eablkybsjg.this.f82975iobyxmoadg.dsvhmnatus();
                return wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                eablkybsjg.this.f82975iobyxmoadg.kcexrzcfyt();
            }
        }
    }

    public eablkybsjg(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f82975iobyxmoadg = oxmwwwfdhmVar;
        this.f82979zoijcleaow = new gxszxtbevo(oxmwwwfdhmVar);
        this.f82977ppxfxbqfkf = new btonecajqb(oxmwwwfdhmVar);
        this.f82978wkgbmnqykc = new gtknphoqwx(this, oxmwwwfdhmVar);
        this.f82973eablkybsjg = new draadjrbmk(oxmwwwfdhmVar);
        this.f82974gxszxtbevo = new wflxmlrfwp(oxmwwwfdhmVar);
        this.f82976lqeggnwhkg = new agtfadlqog(this, oxmwwwfdhmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tk1.iobyxmoadg.zoijcleaow cqumvgiudr(String str) {
        str.hashCode();
        if (str.equals("STATIC")) {
            return tk1.iobyxmoadg.zoijcleaow.STATIC;
        }
        if (str.equals("DYNAMIC")) {
            return tk1.iobyxmoadg.zoijcleaow.DYNAMIC;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String iwizpuwonk(tk1.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        int i13 = dxjokdxxww.f82983zoijcleaow[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return "DYNAMIC";
        }
        if (i13 == 2) {
            return "STATIC";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tk1.eablkybsjg jyumaefscl(String str) {
        str.hashCode();
        if (str.equals("ACTIVATED")) {
            return tk1.eablkybsjg.ACTIVATED;
        }
        if (str.equals("ARCHIVED")) {
            return tk1.eablkybsjg.ARCHIVED;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    public static List lereixgezr() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object pmvmpeiblj(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return super.ppxfxbqfkf(draadjrbmkVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String yggfygwlhe(tk1.eablkybsjg eablkybsjgVar) {
        int i13 = dxjokdxxww.f82982iobyxmoadg[eablkybsjgVar.ordinal()];
        if (i13 == 1) {
            return "ACTIVATED";
        }
        if (i13 == 2) {
            return "ARCHIVED";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + eablkybsjgVar);
    }

    @Override // rk1.ppxfxbqfkf
    public Object btonecajqb(List list, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f82975iobyxmoadg, true, new ppxfxbqfkf(list), gxszxtbevoVar);
    }

    @Override // rk1.ppxfxbqfkf
    public sj.lqeggnwhkg dxjokdxxww() {
        return androidx.room.iobyxmoadg.iobyxmoadg(this.f82975iobyxmoadg, false, new String[]{"qrs"}, new CallableC1859eablkybsjg(yggfygwlhe.lqeggnwhkg("SELECT * FROM qrs", 0)));
    }

    @Override // rk1.ppxfxbqfkf
    public Object eablkybsjg(List list, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f82975iobyxmoadg, true, new iobyxmoadg(list), gxszxtbevoVar);
    }

    @Override // rk1.ppxfxbqfkf
    public Object gtknphoqwx(tk1.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f82975iobyxmoadg, true, new zoijcleaow(iobyxmoadgVar), gxszxtbevoVar);
    }

    @Override // rk1.ppxfxbqfkf
    public Object gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.iobyxmoadg.ppxfxbqfkf(this.f82975iobyxmoadg, true, new wkgbmnqykc(), gxszxtbevoVar);
    }

    @Override // rk1.ppxfxbqfkf
    public Object lqeggnwhkg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM qrs WHERE id == ?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f82975iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new nufgyqmvbu(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }

    @Override // rk1.ppxfxbqfkf
    public Object nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
        yggfygwlhe yggfygwlheVarLqeggnwhkg = yggfygwlhe.lqeggnwhkg("SELECT * FROM qrs", 0);
        return androidx.room.iobyxmoadg.zoijcleaow(this.f82975iobyxmoadg, false, p5.zoijcleaow.iobyxmoadg(), new lqeggnwhkg(yggfygwlheVarLqeggnwhkg), gxszxtbevoVar);
    }

    @Override // u41.zoijcleaow
    public Object ppxfxbqfkf(final tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return androidx.room.gxszxtbevo.wkgbmnqykc(this.f82975iobyxmoadg, new tg.draadjrbmk() { // from class: rk1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return this.f83000zdlpuopuiu.pmvmpeiblj(draadjrbmkVar, (gxszxtbevo) obj);
            }
        }, gxszxtbevoVar);
    }
}
