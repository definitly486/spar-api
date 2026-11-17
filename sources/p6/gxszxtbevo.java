package p6;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final n5.oxmwwwfdhm f75753iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final n5.btonecajqb f75754zoijcleaow;

    class iobyxmoadg extends n5.btonecajqb {
        iobyxmoadg(n5.oxmwwwfdhm oxmwwwfdhmVar) {
            super(oxmwwwfdhmVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n5.btonecajqb
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public void dxjokdxxww(u5.gtknphoqwx gtknphoqwxVar, wkgbmnqykc wkgbmnqykcVar) {
            gtknphoqwxVar.e(1, wkgbmnqykcVar.iobyxmoadg());
            if (wkgbmnqykcVar.zoijcleaow() == null) {
                gtknphoqwxVar.N(2);
            } else {
                gtknphoqwxVar.s(2, wkgbmnqykcVar.zoijcleaow().longValue());
            }
        }

        @Override // n5.lereixgezr
        protected String eablkybsjg() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public gxszxtbevo(n5.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f75753iobyxmoadg = oxmwwwfdhmVar;
        this.f75754zoijcleaow = new iobyxmoadg(oxmwwwfdhmVar);
    }

    public static List ppxfxbqfkf() {
        return Collections.emptyList();
    }

    @Override // p6.eablkybsjg
    public void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        this.f75753iobyxmoadg.agtfadlqog();
        this.f75753iobyxmoadg.ojitshcjhn();
        try {
            this.f75754zoijcleaow.gtknphoqwx(wkgbmnqykcVar);
            this.f75753iobyxmoadg.dsvhmnatus();
        } finally {
            this.f75753iobyxmoadg.kcexrzcfyt();
        }
    }

    @Override // p6.eablkybsjg
    public Long zoijcleaow(String str) {
        n5.yggfygwlhe yggfygwlheVarLqeggnwhkg = n5.yggfygwlhe.lqeggnwhkg("SELECT long_value FROM Preference where `key`=?", 1);
        yggfygwlheVarLqeggnwhkg.e(1, str);
        this.f75753iobyxmoadg.agtfadlqog();
        Long lValueOf = null;
        Cursor cursorPpxfxbqfkf = p5.zoijcleaow.ppxfxbqfkf(this.f75753iobyxmoadg, yggfygwlheVarLqeggnwhkg, false, null);
        try {
            if (cursorPpxfxbqfkf.moveToFirst() && !cursorPpxfxbqfkf.isNull(0)) {
                lValueOf = Long.valueOf(cursorPpxfxbqfkf.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorPpxfxbqfkf.close();
            yggfygwlheVarLqeggnwhkg.release();
        }
    }
}
