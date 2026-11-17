package u5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f112705iobyxmoadg = new zoijcleaow();

    private zoijcleaow() {
    }

    public static final Cursor eablkybsjg(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        zdlpuopuiu.btonecajqb(sQLiteDatabase, "sQLiteDatabase");
        zdlpuopuiu.btonecajqb(sql, "sql");
        zdlpuopuiu.btonecajqb(selectionArgs, "selectionArgs");
        zdlpuopuiu.btonecajqb(cancellationSignal, "cancellationSignal");
        zdlpuopuiu.btonecajqb(cursorFactory, "cursorFactory");
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
        zdlpuopuiu.dxjokdxxww(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    public static final void gxszxtbevo(SQLiteOpenHelper sQLiteOpenHelper, boolean z13) {
        zdlpuopuiu.btonecajqb(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z13);
    }

    public static final void iobyxmoadg(CancellationSignal cancellationSignal) {
        zdlpuopuiu.btonecajqb(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
    }

    public static final boolean ppxfxbqfkf(File file) {
        zdlpuopuiu.btonecajqb(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static final boolean wkgbmnqykc(SQLiteDatabase sQLiteDatabase) {
        zdlpuopuiu.btonecajqb(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final CancellationSignal zoijcleaow() {
        return new CancellationSignal();
    }
}
