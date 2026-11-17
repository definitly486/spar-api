package n5;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class zdlpuopuiu extends u5.nufgyqmvbu.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final iobyxmoadg f68936lqeggnwhkg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f68937eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f68938gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private lqeggnwhkg f68939ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow f68940wkgbmnqykc;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean iobyxmoadg(u5.lqeggnwhkg db3) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
            Cursor cursorE = db3.E("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z13 = false;
                if (cursorE.moveToFirst() && cursorE.getInt(0) == 0) {
                    z13 = true;
                }
                rg.zoijcleaow.iobyxmoadg(cursorE, null);
                return z13;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(cursorE, th2);
                    throw th3;
                }
            }
        }

        public final boolean zoijcleaow(u5.lqeggnwhkg db3) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
            Cursor cursorE = db3.E("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z13 = false;
                if (cursorE.moveToFirst() && cursorE.getInt(0) != 0) {
                    z13 = true;
                }
                rg.zoijcleaow.iobyxmoadg(cursorE, null);
                return z13;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(cursorE, th2);
                    throw th3;
                }
            }
        }

        private iobyxmoadg() {
        }
    }

    public static class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final boolean f68941iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String f68942zoijcleaow;

        public ppxfxbqfkf(boolean z13, String str) {
            this.f68941iobyxmoadg = z13;
            this.f68942zoijcleaow = str;
        }
    }

    public static abstract class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f68943iobyxmoadg;

        public zoijcleaow(int i13) {
            this.f68943iobyxmoadg = i13;
        }

        public abstract void eablkybsjg(u5.lqeggnwhkg lqeggnwhkgVar);

        public abstract void gxszxtbevo(u5.lqeggnwhkg lqeggnwhkgVar);

        public abstract void iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar);

        public abstract ppxfxbqfkf lqeggnwhkg(u5.lqeggnwhkg lqeggnwhkgVar);

        public abstract void ppxfxbqfkf(u5.lqeggnwhkg lqeggnwhkgVar);

        public abstract void wkgbmnqykc(u5.lqeggnwhkg lqeggnwhkgVar);

        public abstract void zoijcleaow(u5.lqeggnwhkg lqeggnwhkgVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdlpuopuiu(lqeggnwhkg configuration, zoijcleaow delegate, String identityHash, String legacyHash) {
        super(delegate.f68943iobyxmoadg);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(identityHash, "identityHash");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(legacyHash, "legacyHash");
        this.f68939ppxfxbqfkf = configuration;
        this.f68940wkgbmnqykc = delegate;
        this.f68937eablkybsjg = identityHash;
        this.f68938gxszxtbevo = legacyHash;
    }

    private final void btonecajqb(u5.lqeggnwhkg lqeggnwhkgVar) {
        dxjokdxxww(lqeggnwhkgVar);
        lqeggnwhkgVar.lmojexxdyd(kcexrzcfyt.iobyxmoadg(this.f68937eablkybsjg));
    }

    private final void dxjokdxxww(u5.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.lmojexxdyd("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void nufgyqmvbu(u5.lqeggnwhkg lqeggnwhkgVar) {
        if (!f68936lqeggnwhkg.zoijcleaow(lqeggnwhkgVar)) {
            ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = this.f68940wkgbmnqykc.lqeggnwhkg(lqeggnwhkgVar);
            if (ppxfxbqfkfVarLqeggnwhkg.f68941iobyxmoadg) {
                this.f68940wkgbmnqykc.eablkybsjg(lqeggnwhkgVar);
                btonecajqb(lqeggnwhkgVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ppxfxbqfkfVarLqeggnwhkg.f68942zoijcleaow);
            }
        }
        Cursor cursorC0 = lqeggnwhkgVar.c0(new u5.iobyxmoadg("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorC0.moveToFirst() ? cursorC0.getString(0) : null;
            rg.zoijcleaow.iobyxmoadg(cursorC0, null);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68937eablkybsjg, string) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68938gxszxtbevo, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f68937eablkybsjg + ", found: " + string);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(cursorC0, th2);
                throw th3;
            }
        }
    }

    @Override // u5.nufgyqmvbu.iobyxmoadg
    public void eablkybsjg(u5.lqeggnwhkg db3, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        lqeggnwhkg(db3, i13, i14);
    }

    @Override // u5.nufgyqmvbu.iobyxmoadg
    public void gxszxtbevo(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        super.gxszxtbevo(db3);
        nufgyqmvbu(db3);
        this.f68940wkgbmnqykc.wkgbmnqykc(db3);
        this.f68939ppxfxbqfkf = null;
    }

    @Override // u5.nufgyqmvbu.iobyxmoadg
    public void lqeggnwhkg(u5.lqeggnwhkg db3, int i13, int i14) {
        List listWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        lqeggnwhkg lqeggnwhkgVar = this.f68939ppxfxbqfkf;
        if (lqeggnwhkgVar == null || (listWkgbmnqykc = lqeggnwhkgVar.f68834wkgbmnqykc.wkgbmnqykc(i13, i14)) == null) {
            lqeggnwhkg lqeggnwhkgVar2 = this.f68939ppxfxbqfkf;
            if (lqeggnwhkgVar2 != null && !lqeggnwhkgVar2.iobyxmoadg(i13, i14)) {
                this.f68940wkgbmnqykc.zoijcleaow(db3);
                this.f68940wkgbmnqykc.iobyxmoadg(db3);
                return;
            }
            throw new IllegalStateException("A migration from " + i13 + " to " + i14 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f68940wkgbmnqykc.gxszxtbevo(db3);
        Iterator it = listWkgbmnqykc.iterator();
        while (it.hasNext()) {
            ((o5.zoijcleaow) it.next()).iobyxmoadg(db3);
        }
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = this.f68940wkgbmnqykc.lqeggnwhkg(db3);
        if (ppxfxbqfkfVarLqeggnwhkg.f68941iobyxmoadg) {
            this.f68940wkgbmnqykc.eablkybsjg(db3);
            btonecajqb(db3);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + ppxfxbqfkfVarLqeggnwhkg.f68942zoijcleaow);
        }
    }

    @Override // u5.nufgyqmvbu.iobyxmoadg
    public void wkgbmnqykc(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        boolean zIobyxmoadg = f68936lqeggnwhkg.iobyxmoadg(db3);
        this.f68940wkgbmnqykc.iobyxmoadg(db3);
        if (!zIobyxmoadg) {
            ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = this.f68940wkgbmnqykc.lqeggnwhkg(db3);
            if (!ppxfxbqfkfVarLqeggnwhkg.f68941iobyxmoadg) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ppxfxbqfkfVarLqeggnwhkg.f68942zoijcleaow);
            }
        }
        btonecajqb(db3);
        this.f68940wkgbmnqykc.ppxfxbqfkf(db3);
    }

    @Override // u5.nufgyqmvbu.iobyxmoadg
    public void zoijcleaow(u5.lqeggnwhkg db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        super.zoijcleaow(db3);
    }
}
