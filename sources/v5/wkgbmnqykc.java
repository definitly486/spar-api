package v5;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements u5.nufgyqmvbu {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final iobyxmoadg f116071pmvmpeiblj = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f116072cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final gtknphoqwx f116073esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f116074iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final u5.nufgyqmvbu.iobyxmoadg f116075jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f116076lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f116077yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Context f116078zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ppxfxbqfkf extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        public static final C2877ppxfxbqfkf f116079pmvmpeiblj = new C2877ppxfxbqfkf(null);

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private boolean f116080cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final w5.iobyxmoadg f116081esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final boolean f116082iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final u5.nufgyqmvbu.iobyxmoadg f116083jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private boolean f116084lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final zoijcleaow f116085yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Context f116086zdlpuopuiu;

        private static final class iobyxmoadg extends RuntimeException {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private final Throwable f116087yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final zoijcleaow f116088zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(zoijcleaow callbackName, Throwable cause) {
                super(cause);
                zdlpuopuiu.btonecajqb(callbackName, "callbackName");
                zdlpuopuiu.btonecajqb(cause, "cause");
                this.f116088zdlpuopuiu = callbackName;
                this.f116087yggfygwlhe = cause;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f116087yggfygwlhe;
            }

            public final zoijcleaow iobyxmoadg() {
                return this.f116088zdlpuopuiu;
            }
        }

        /* JADX INFO: renamed from: v5.wkgbmnqykc$ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C2877ppxfxbqfkf {
            public /* synthetic */ C2877ppxfxbqfkf(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final v5.ppxfxbqfkf iobyxmoadg(zoijcleaow refHolder, SQLiteDatabase sqLiteDatabase) {
                zdlpuopuiu.btonecajqb(refHolder, "refHolder");
                zdlpuopuiu.btonecajqb(sqLiteDatabase, "sqLiteDatabase");
                v5.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = refHolder.iobyxmoadg();
                if (ppxfxbqfkfVarIobyxmoadg != null && ppxfxbqfkfVarIobyxmoadg.lqeggnwhkg(sqLiteDatabase)) {
                    return ppxfxbqfkfVarIobyxmoadg;
                }
                v5.ppxfxbqfkf ppxfxbqfkfVar = new v5.ppxfxbqfkf(sqLiteDatabase);
                refHolder.zoijcleaow(ppxfxbqfkfVar);
                return ppxfxbqfkfVar;
            }

            private C2877ppxfxbqfkf() {
            }
        }

        /* JADX INFO: renamed from: v5.wkgbmnqykc$ppxfxbqfkf$wkgbmnqykc, reason: collision with other inner class name */
        public /* synthetic */ class C2878wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f116089iobyxmoadg;

            static {
                int[] iArr = new int[zoijcleaow.values().length];
                try {
                    iArr[zoijcleaow.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[zoijcleaow.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[zoijcleaow.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[zoijcleaow.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[zoijcleaow.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f116089iobyxmoadg = iArr;
            }
        }

        public enum zoijcleaow {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Context context, String str, final zoijcleaow dbRef, final u5.nufgyqmvbu.iobyxmoadg callback, boolean z13) {
            super(context, str, null, callback.f112691iobyxmoadg, new DatabaseErrorHandler() { // from class: v5.eablkybsjg
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    wkgbmnqykc.ppxfxbqfkf.wkgbmnqykc(callback, dbRef, sQLiteDatabase);
                }
            });
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(dbRef, "dbRef");
            zdlpuopuiu.btonecajqb(callback, "callback");
            this.f116086zdlpuopuiu = context;
            this.f116085yggfygwlhe = dbRef;
            this.f116083jyumaefscl = callback;
            this.f116082iwizpuwonk = z13;
            if (str == null) {
                str = UUID.randomUUID().toString();
                zdlpuopuiu.dxjokdxxww(str, "randomUUID().toString()");
            }
            this.f116081esjtqupxsv = new w5.iobyxmoadg(str, context.getCacheDir(), false);
        }

        private final SQLiteDatabase btonecajqb(boolean z13) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z14 = this.f116084lereixgezr;
            if (databaseName != null && !z14 && (parentFile = this.f116086zdlpuopuiu.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return dxjokdxxww(z13);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return dxjokdxxww(z13);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof iobyxmoadg) {
                        iobyxmoadg iobyxmoadgVar = th2;
                        Throwable cause = iobyxmoadgVar.getCause();
                        int i13 = C2878wkgbmnqykc.f116089iobyxmoadg[iobyxmoadgVar.iobyxmoadg().ordinal()];
                        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f116082iwizpuwonk) {
                        throw th2;
                    }
                    this.f116086zdlpuopuiu.deleteDatabase(databaseName);
                    try {
                        return dxjokdxxww(z13);
                    } catch (iobyxmoadg e13) {
                        throw e13.getCause();
                    }
                }
            }
        }

        private final SQLiteDatabase dxjokdxxww(boolean z13) {
            if (z13) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zdlpuopuiu.dxjokdxxww(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            zdlpuopuiu.dxjokdxxww(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void wkgbmnqykc(u5.nufgyqmvbu.iobyxmoadg callback, zoijcleaow dbRef, SQLiteDatabase dbObj) {
            zdlpuopuiu.btonecajqb(callback, "$callback");
            zdlpuopuiu.btonecajqb(dbRef, "$dbRef");
            C2877ppxfxbqfkf c2877ppxfxbqfkf = f116079pmvmpeiblj;
            zdlpuopuiu.dxjokdxxww(dbObj, "dbObj");
            callback.ppxfxbqfkf(c2877ppxfxbqfkf.iobyxmoadg(dbRef, dbObj));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                w5.iobyxmoadg.ppxfxbqfkf(this.f116081esjtqupxsv, false, 1, null);
                super.close();
                this.f116085yggfygwlhe.zoijcleaow(null);
                this.f116084lereixgezr = false;
            } finally {
                this.f116081esjtqupxsv.wkgbmnqykc();
            }
        }

        public final u5.lqeggnwhkg lqeggnwhkg(boolean z13) {
            try {
                this.f116081esjtqupxsv.zoijcleaow((this.f116084lereixgezr || getDatabaseName() == null) ? false : true);
                this.f116080cqumvgiudr = false;
                SQLiteDatabase sQLiteDatabaseBtonecajqb = btonecajqb(z13);
                if (!this.f116080cqumvgiudr) {
                    return nufgyqmvbu(sQLiteDatabaseBtonecajqb);
                }
                close();
                return lqeggnwhkg(z13);
            } finally {
                this.f116081esjtqupxsv.wkgbmnqykc();
            }
        }

        public final v5.ppxfxbqfkf nufgyqmvbu(SQLiteDatabase sqLiteDatabase) {
            zdlpuopuiu.btonecajqb(sqLiteDatabase, "sqLiteDatabase");
            return f116079pmvmpeiblj.iobyxmoadg(this.f116085yggfygwlhe, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            if (!this.f116080cqumvgiudr && this.f116083jyumaefscl.f112691iobyxmoadg != db3.getVersion()) {
                db3.setMaxSqlCacheSize(1);
            }
            try {
                this.f116083jyumaefscl.zoijcleaow(nufgyqmvbu(db3));
            } catch (Throwable th2) {
                throw new iobyxmoadg(zoijcleaow.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            zdlpuopuiu.btonecajqb(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f116083jyumaefscl.wkgbmnqykc(nufgyqmvbu(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new iobyxmoadg(zoijcleaow.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db3, int i13, int i14) {
            zdlpuopuiu.btonecajqb(db3, "db");
            this.f116080cqumvgiudr = true;
            try {
                this.f116083jyumaefscl.eablkybsjg(nufgyqmvbu(db3), i13, i14);
            } catch (Throwable th2) {
                throw new iobyxmoadg(zoijcleaow.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db3) {
            zdlpuopuiu.btonecajqb(db3, "db");
            if (!this.f116080cqumvgiudr) {
                try {
                    this.f116083jyumaefscl.gxszxtbevo(nufgyqmvbu(db3));
                } catch (Throwable th2) {
                    throw new iobyxmoadg(zoijcleaow.ON_OPEN, th2);
                }
            }
            this.f116084lereixgezr = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i13, int i14) {
            zdlpuopuiu.btonecajqb(sqLiteDatabase, "sqLiteDatabase");
            this.f116080cqumvgiudr = true;
            try {
                this.f116083jyumaefscl.lqeggnwhkg(nufgyqmvbu(sqLiteDatabase), i13, i14);
            } catch (Throwable th2) {
                throw new iobyxmoadg(zoijcleaow.ON_UPGRADE, th2);
            }
        }
    }

    /* JADX INFO: renamed from: v5.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    static final class C2879wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {
        C2879wkgbmnqykc() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ppxfxbqfkf invoke() {
            ppxfxbqfkf ppxfxbqfkfVar;
            if (wkgbmnqykc.this.f116077yggfygwlhe == null || !wkgbmnqykc.this.f116074iwizpuwonk) {
                ppxfxbqfkfVar = new ppxfxbqfkf(wkgbmnqykc.this.f116078zdlpuopuiu, wkgbmnqykc.this.f116077yggfygwlhe, new zoijcleaow(null), wkgbmnqykc.this.f116075jyumaefscl, wkgbmnqykc.this.f116072cqumvgiudr);
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(wkgbmnqykc.this.f116078zdlpuopuiu, new File(u5.wkgbmnqykc.iobyxmoadg(wkgbmnqykc.this.f116078zdlpuopuiu), wkgbmnqykc.this.f116077yggfygwlhe).getAbsolutePath(), new zoijcleaow(null), wkgbmnqykc.this.f116075jyumaefscl, wkgbmnqykc.this.f116072cqumvgiudr);
            }
            u5.zoijcleaow.gxszxtbevo(ppxfxbqfkfVar, wkgbmnqykc.this.f116076lereixgezr);
            return ppxfxbqfkfVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private v5.ppxfxbqfkf f116097iobyxmoadg;

        public zoijcleaow(v5.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f116097iobyxmoadg = ppxfxbqfkfVar;
        }

        public final v5.ppxfxbqfkf iobyxmoadg() {
            return this.f116097iobyxmoadg;
        }

        public final void zoijcleaow(v5.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f116097iobyxmoadg = ppxfxbqfkfVar;
        }
    }

    public wkgbmnqykc(Context context, String str, u5.nufgyqmvbu.iobyxmoadg callback, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(callback, "callback");
        this.f116078zdlpuopuiu = context;
        this.f116077yggfygwlhe = str;
        this.f116075jyumaefscl = callback;
        this.f116074iwizpuwonk = z13;
        this.f116072cqumvgiudr = z14;
        this.f116073esjtqupxsv = draadjrbmk.zoijcleaow(new C2879wkgbmnqykc());
    }

    private final ppxfxbqfkf draadjrbmk() {
        return (ppxfxbqfkf) this.f116073esjtqupxsv.getValue();
    }

    @Override // u5.nufgyqmvbu, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f116073esjtqupxsv.isInitialized()) {
            draadjrbmk().close();
        }
    }

    @Override // u5.nufgyqmvbu
    public String getDatabaseName() {
        return this.f116077yggfygwlhe;
    }

    @Override // u5.nufgyqmvbu
    public u5.lqeggnwhkg getWritableDatabase() {
        return draadjrbmk().lqeggnwhkg(true);
    }

    @Override // u5.nufgyqmvbu
    public void setWriteAheadLoggingEnabled(boolean z13) {
        if (this.f116073esjtqupxsv.isInitialized()) {
            u5.zoijcleaow.gxszxtbevo(draadjrbmk(), z13);
        }
        this.f116076lereixgezr = z13;
    }
}
