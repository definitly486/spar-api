package v5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.oxmwwwfdhm;
import u5.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements u5.lqeggnwhkg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final SQLiteDatabase f116069zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f116068yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final String[] f116067jyumaefscl = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final String[] f116066iwizpuwonk = new String[0];

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends jyumaefscl implements oxmwwwfdhm {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ btonecajqb f116070zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(btonecajqb btonecajqbVar) {
            super(4);
            this.f116070zdlpuopuiu = btonecajqbVar;
        }

        @Override // tg.oxmwwwfdhm
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            btonecajqb btonecajqbVar = this.f116070zdlpuopuiu;
            zdlpuopuiu.lqeggnwhkg(sQLiteQuery);
            btonecajqbVar.iobyxmoadg(new lqeggnwhkg(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public ppxfxbqfkf(SQLiteDatabase delegate) {
        zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f116069zdlpuopuiu = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor dxjokdxxww(btonecajqb query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        zdlpuopuiu.btonecajqb(query, "$query");
        zdlpuopuiu.lqeggnwhkg(sQLiteQuery);
        query.iobyxmoadg(new lqeggnwhkg(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor nufgyqmvbu(oxmwwwfdhm tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        zdlpuopuiu.btonecajqb(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // u5.lqeggnwhkg
    public Cursor E(String query) {
        zdlpuopuiu.btonecajqb(query, "query");
        return c0(new u5.iobyxmoadg(query));
    }

    @Override // u5.lqeggnwhkg
    public boolean S() {
        return this.f116069zdlpuopuiu.inTransaction();
    }

    @Override // u5.lqeggnwhkg
    public Cursor c0(btonecajqb query) {
        zdlpuopuiu.btonecajqb(query, "query");
        final zoijcleaow zoijcleaowVar = new zoijcleaow(query);
        Cursor cursorRawQueryWithFactory = this.f116069zdlpuopuiu.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: v5.zoijcleaow
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return ppxfxbqfkf.nufgyqmvbu(zoijcleaowVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.wkgbmnqykc(), f116066iwizpuwonk, null);
        zdlpuopuiu.dxjokdxxww(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f116069zdlpuopuiu.close();
    }

    @Override // u5.lqeggnwhkg
    public boolean d0() {
        return u5.zoijcleaow.wkgbmnqykc(this.f116069zdlpuopuiu);
    }

    @Override // u5.lqeggnwhkg
    public String gxszxtbevo() {
        return this.f116069zdlpuopuiu.getPath();
    }

    @Override // u5.lqeggnwhkg
    public void ikoacuggdj() {
        this.f116069zdlpuopuiu.beginTransactionNonExclusive();
    }

    @Override // u5.lqeggnwhkg
    public boolean isOpen() {
        return this.f116069zdlpuopuiu.isOpen();
    }

    @Override // u5.lqeggnwhkg
    public void jhduphickx(String sql, Object[] bindArgs) {
        zdlpuopuiu.btonecajqb(sql, "sql");
        zdlpuopuiu.btonecajqb(bindArgs, "bindArgs");
        this.f116069zdlpuopuiu.execSQL(sql, bindArgs);
    }

    @Override // u5.lqeggnwhkg
    public u5.gtknphoqwx k(String sql) {
        zdlpuopuiu.btonecajqb(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f116069zdlpuopuiu.compileStatement(sql);
        zdlpuopuiu.dxjokdxxww(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new nufgyqmvbu(sQLiteStatementCompileStatement);
    }

    @Override // u5.lqeggnwhkg
    public Cursor l(final btonecajqb query, CancellationSignal cancellationSignal) {
        zdlpuopuiu.btonecajqb(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f116069zdlpuopuiu;
        String strWkgbmnqykc = query.wkgbmnqykc();
        String[] strArr = f116066iwizpuwonk;
        zdlpuopuiu.lqeggnwhkg(cancellationSignal);
        return u5.zoijcleaow.eablkybsjg(sQLiteDatabase, strWkgbmnqykc, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: v5.iobyxmoadg
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return ppxfxbqfkf.dxjokdxxww(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // u5.lqeggnwhkg
    public void lmojexxdyd(String sql) {
        zdlpuopuiu.btonecajqb(sql, "sql");
        this.f116069zdlpuopuiu.execSQL(sql);
    }

    public final boolean lqeggnwhkg(SQLiteDatabase sqLiteDatabase) {
        zdlpuopuiu.btonecajqb(sqLiteDatabase, "sqLiteDatabase");
        return zdlpuopuiu.eablkybsjg(this.f116069zdlpuopuiu, sqLiteDatabase);
    }

    @Override // u5.lqeggnwhkg
    public void oxmwwwfdhm() {
        this.f116069zdlpuopuiu.beginTransaction();
    }

    @Override // u5.lqeggnwhkg
    public int u(String table, int i13, ContentValues values, String str, Object[] objArr) {
        zdlpuopuiu.btonecajqb(table, "table");
        zdlpuopuiu.btonecajqb(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb3 = new StringBuilder();
        sb3.append("UPDATE ");
        sb3.append(f116067jyumaefscl[i13]);
        sb3.append(table);
        sb3.append(" SET ");
        int i14 = 0;
        for (String str2 : values.keySet()) {
            sb3.append(i14 > 0 ? StringUtils.COMMA : "");
            sb3.append(str2);
            objArr2[i14] = values.get(str2);
            sb3.append("=?");
            i14++;
        }
        if (objArr != null) {
            for (int i15 = size; i15 < length; i15++) {
                objArr2[i15] = objArr[i15 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb3.append(" WHERE ");
            sb3.append(str);
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        u5.gtknphoqwx gtknphoqwxVarK = k(string);
        u5.iobyxmoadg.f112687jyumaefscl.zoijcleaow(gtknphoqwxVarK, objArr2);
        return gtknphoqwxVarK.pkzmftpjix();
    }

    @Override // u5.lqeggnwhkg
    public void uwvvkdfqfp() {
        this.f116069zdlpuopuiu.endTransaction();
    }

    @Override // u5.lqeggnwhkg
    public void vipkmwdibw() {
        this.f116069zdlpuopuiu.setTransactionSuccessful();
    }

    @Override // u5.lqeggnwhkg
    public List yadqdtsiqt() {
        return this.f116069zdlpuopuiu.getAttachedDbs();
    }
}
