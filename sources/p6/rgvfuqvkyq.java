package p6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq implements ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n5.oxmwwwfdhm f75776iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f75777zoijcleaow;

    class iobyxmoadg extends n5.btonecajqb {
        iobyxmoadg(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, agtfadlqog agtfadlqogVar) {
            gtknphoqwxVar.e(1, agtfadlqogVar.iobyxmoadg());
            gtknphoqwxVar.e(2, agtfadlqogVar.zoijcleaow());
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public rgvfuqvkyq(n5.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f75776iobyxmoadg = oxmwwwfdhmVar;
        this.f75777zoijcleaow = new iobyxmoadg(oxmwwwfdhmVar);
    }

    public static List ppxfxbqfkf() {
        return Collections.emptyList();
    }

    @Override // p6.ojitshcjhn
    public List iobyxmoadg(String str) {
        n5.yggfygwlhe yggfygwlheVarLqeggnwhkg = n5.yggfygwlhe.lqeggnwhkg("SELECT name FROM workname WHERE work_spec_id=?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        this.f75776iobyxmoadg.agtfadlqog();
        Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(this.f75776iobyxmoadg, yggfygwlheVarLqeggnwhkg, false, null);
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

    @Override // p6.ojitshcjhn
    public void zoijcleaow(agtfadlqog agtfadlqogVar) {
        this.f75776iobyxmoadg.agtfadlqog();
        this.f75776iobyxmoadg.ojitshcjhn();
        try {
            this.f75777zoijcleaow.gtknphoqwx(agtfadlqogVar);
            this.f75776iobyxmoadg.dsvhmnatus();
        } finally {
            this.f75776iobyxmoadg.kcexrzcfyt();
        }
    }
}
