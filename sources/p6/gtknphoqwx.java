package p6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n5.oxmwwwfdhm f75746iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n5.lereixgezr f75747ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final n5.lereixgezr f75748wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f75749zoijcleaow;

    class iobyxmoadg extends n5.btonecajqb {
        iobyxmoadg(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, dxjokdxxww dxjokdxxwwVar) {
            gtknphoqwxVar.e(1, dxjokdxxwwVar.f75704iobyxmoadg);
            gtknphoqwxVar.s(2, dxjokdxxwwVar.iobyxmoadg());
            gtknphoqwxVar.s(3, dxjokdxxwwVar.f75705ppxfxbqfkf);
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }
    }

    class ppxfxbqfkf extends n5.lereixgezr {
        ppxfxbqfkf(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    class zoijcleaow extends n5.lereixgezr {
        zoijcleaow(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    public gtknphoqwx(n5.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f75746iobyxmoadg = oxmwwwfdhmVar;
        this.f75749zoijcleaow = new iobyxmoadg(oxmwwwfdhmVar);
        this.f75747ppxfxbqfkf = new zoijcleaow(oxmwwwfdhmVar);
        this.f75748wkgbmnqykc = new ppxfxbqfkf(oxmwwwfdhmVar);
    }

    public static List nufgyqmvbu() {
        return Collections.emptyList();
    }

    @Override // p6.btonecajqb
    public void eablkybsjg(String str, int i13) {
        this.f75746iobyxmoadg.agtfadlqog();
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = this.f75747ppxfxbqfkf.zoijcleaow();
        gtknphoqwxVarZoijcleaow.e(1, str);
        gtknphoqwxVarZoijcleaow.s(2, i13);
        try {
            this.f75746iobyxmoadg.ojitshcjhn();
            try {
                gtknphoqwxVarZoijcleaow.pkzmftpjix();
                this.f75746iobyxmoadg.dsvhmnatus();
                this.f75746iobyxmoadg.kcexrzcfyt();
                this.f75747ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            } catch (Throwable th2) {
                this.f75746iobyxmoadg.kcexrzcfyt();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f75747ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            throw th3;
        }
    }

    @Override // p6.btonecajqb
    public void gxszxtbevo(String str) {
        this.f75746iobyxmoadg.agtfadlqog();
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = this.f75748wkgbmnqykc.zoijcleaow();
        gtknphoqwxVarZoijcleaow.e(1, str);
        try {
            this.f75746iobyxmoadg.ojitshcjhn();
            try {
                gtknphoqwxVarZoijcleaow.pkzmftpjix();
                this.f75746iobyxmoadg.dsvhmnatus();
                this.f75746iobyxmoadg.kcexrzcfyt();
                this.f75748wkgbmnqykc.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            } catch (Throwable th2) {
                this.f75746iobyxmoadg.kcexrzcfyt();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f75748wkgbmnqykc.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            throw th3;
        }
    }

    @Override // p6.btonecajqb
    public dxjokdxxww ppxfxbqfkf(String str, int i13) {
        n5.yggfygwlhe yggfygwlheVarLqeggnwhkg = n5.yggfygwlhe.lqeggnwhkg("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        yggfygwlheVarLqeggnwhkg.s(2, i13);
        this.f75746iobyxmoadg.agtfadlqog();
        Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(this.f75746iobyxmoadg, yggfygwlheVarLqeggnwhkg, false, null);
        try {
            return cursorPpxfxbqfkf.moveToFirst() ? new dxjokdxxww(cursorPpxfxbqfkf.getString(p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "work_spec_id")), cursorPpxfxbqfkf.getInt(p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "generation")), cursorPpxfxbqfkf.getInt(p5.iobyxmoadg.wkgbmnqykc(cursorPpxfxbqfkf, "system_id"))) : null;
        } finally {
            cursorPpxfxbqfkf.close();
            yggfygwlheVarLqeggnwhkg.release();
        }
    }

    @Override // p6.btonecajqb
    public List wkgbmnqykc() {
        n5.yggfygwlhe yggfygwlheVarLqeggnwhkg = n5.yggfygwlhe.lqeggnwhkg("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f75746iobyxmoadg.agtfadlqog();
        Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(this.f75746iobyxmoadg, yggfygwlheVarLqeggnwhkg, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorPpxfxbqfkf.getCount());
            while (cursorPpxfxbqfkf.moveToNext()) {
                arrayList.add(cursorPpxfxbqfkf.getString(0));
            }
            cursorPpxfxbqfkf.close();
            yggfygwlheVarLqeggnwhkg.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorPpxfxbqfkf.close();
            yggfygwlheVarLqeggnwhkg.release();
            throw th2;
        }
    }

    @Override // p6.btonecajqb
    public void zoijcleaow(dxjokdxxww dxjokdxxwwVar) {
        this.f75746iobyxmoadg.agtfadlqog();
        this.f75746iobyxmoadg.ojitshcjhn();
        try {
            this.f75749zoijcleaow.gtknphoqwx(dxjokdxxwwVar);
            this.f75746iobyxmoadg.dsvhmnatus();
        } finally {
            this.f75746iobyxmoadg.kcexrzcfyt();
        }
    }
}
