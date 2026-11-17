package p6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n5.oxmwwwfdhm f75773iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f75774zoijcleaow;

    class iobyxmoadg extends n5.btonecajqb {
        iobyxmoadg(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, p6.iobyxmoadg iobyxmoadgVar) {
            gtknphoqwxVar.e(1, iobyxmoadgVar.zoijcleaow());
            gtknphoqwxVar.e(2, iobyxmoadgVar.iobyxmoadg());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public ppxfxbqfkf(n5.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f75773iobyxmoadg = oxmwwwfdhmVar;
        this.f75774zoijcleaow = new iobyxmoadg(oxmwwwfdhmVar);
    }

    public static List eablkybsjg() {
        return Collections.emptyList();
    }

    @Override // p6.zoijcleaow
    public void iobyxmoadg(p6.iobyxmoadg iobyxmoadgVar) {
        this.f75773iobyxmoadg.agtfadlqog();
        this.f75773iobyxmoadg.ojitshcjhn();
        try {
            this.f75774zoijcleaow.gtknphoqwx(iobyxmoadgVar);
            this.f75773iobyxmoadg.dsvhmnatus();
        } finally {
            this.f75773iobyxmoadg.kcexrzcfyt();
        }
    }

    @Override // p6.zoijcleaow
    public boolean ppxfxbqfkf(String str) {
        n5.yggfygwlhe yggfygwlheVarLqeggnwhkg = n5.yggfygwlhe.lqeggnwhkg("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        this.f75773iobyxmoadg.agtfadlqog();
        boolean z13 = false;
        Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(this.f75773iobyxmoadg, yggfygwlheVarLqeggnwhkg, false, null);
        try {
            if (cursorPpxfxbqfkf.moveToFirst()) {
                z13 = cursorPpxfxbqfkf.getInt(0) != 0;
            }
            return z13;
        } finally {
            cursorPpxfxbqfkf.close();
            yggfygwlheVarLqeggnwhkg.release();
        }
    }

    @Override // p6.zoijcleaow
    public boolean wkgbmnqykc(String str) {
        n5.yggfygwlhe yggfygwlheVarLqeggnwhkg = n5.yggfygwlhe.lqeggnwhkg("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        this.f75773iobyxmoadg.agtfadlqog();
        boolean z13 = false;
        Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(this.f75773iobyxmoadg, yggfygwlheVarLqeggnwhkg, false, null);
        try {
            if (cursorPpxfxbqfkf.moveToFirst()) {
                z13 = cursorPpxfxbqfkf.getInt(0) != 0;
            }
            return z13;
        } finally {
            cursorPpxfxbqfkf.close();
            yggfygwlheVarLqeggnwhkg.release();
        }
    }

    @Override // p6.zoijcleaow
    public List zoijcleaow(String str) {
        n5.yggfygwlhe yggfygwlheVarLqeggnwhkg = n5.yggfygwlhe.lqeggnwhkg("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        this.f75773iobyxmoadg.agtfadlqog();
        Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(this.f75773iobyxmoadg, yggfygwlheVarLqeggnwhkg, false, null);
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
}
