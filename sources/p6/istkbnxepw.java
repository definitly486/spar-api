package p6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class istkbnxepw implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n5.oxmwwwfdhm f75758iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final n5.lereixgezr f75759ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f75760zoijcleaow;

    class iobyxmoadg extends n5.btonecajqb {
        iobyxmoadg(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, pmvmpeiblj pmvmpeibljVar) {
            gtknphoqwxVar.e(1, pmvmpeibljVar.iobyxmoadg());
            gtknphoqwxVar.e(2, pmvmpeibljVar.zoijcleaow());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    class zoijcleaow extends n5.lereixgezr {
        zoijcleaow(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        @Override // n5.lereixgezr
        public String eablkybsjg() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public istkbnxepw(n5.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f75758iobyxmoadg = oxmwwwfdhmVar;
        this.f75760zoijcleaow = new iobyxmoadg(oxmwwwfdhmVar);
        this.f75759ppxfxbqfkf = new zoijcleaow(oxmwwwfdhmVar);
    }

    public static List eablkybsjg() {
        return Collections.emptyList();
    }

    @Override // p6.zynmafqrjb
    public List iobyxmoadg(String str) {
        n5.yggfygwlhe yggfygwlheVarLqeggnwhkg = n5.yggfygwlhe.lqeggnwhkg("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        this.f75758iobyxmoadg.agtfadlqog();
        Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(this.f75758iobyxmoadg, yggfygwlheVarLqeggnwhkg, false, null);
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

    @Override // p6.zynmafqrjb
    public void ppxfxbqfkf(String str) {
        this.f75758iobyxmoadg.agtfadlqog();
        u5.gtknphoqwx gtknphoqwxVarZoijcleaow = this.f75759ppxfxbqfkf.zoijcleaow();
        gtknphoqwxVarZoijcleaow.e(1, str);
        try {
            this.f75758iobyxmoadg.ojitshcjhn();
            try {
                gtknphoqwxVarZoijcleaow.pkzmftpjix();
                this.f75758iobyxmoadg.dsvhmnatus();
                this.f75758iobyxmoadg.kcexrzcfyt();
                this.f75759ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            } catch (Throwable th2) {
                this.f75758iobyxmoadg.kcexrzcfyt();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f75759ppxfxbqfkf.nufgyqmvbu(gtknphoqwxVarZoijcleaow);
            throw th3;
        }
    }

    @Override // p6.zynmafqrjb
    public void zoijcleaow(pmvmpeiblj pmvmpeibljVar) {
        this.f75758iobyxmoadg.agtfadlqog();
        this.f75758iobyxmoadg.ojitshcjhn();
        try {
            this.f75760zoijcleaow.gtknphoqwx(pmvmpeibljVar);
            this.f75758iobyxmoadg.dsvhmnatus();
        } finally {
            this.f75758iobyxmoadg.kcexrzcfyt();
        }
    }
}
