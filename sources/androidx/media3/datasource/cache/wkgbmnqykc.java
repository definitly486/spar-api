package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String[] f9974ppxfxbqfkf = {ExternalMetricsManagerImpl.NAME, "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final a3.iobyxmoadg f9975iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private String f9976zoijcleaow;

    public wkgbmnqykc(a3.iobyxmoadg iobyxmoadgVar) {
        this.f9975iobyxmoadg = iobyxmoadgVar;
    }

    private static void iobyxmoadg(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor ppxfxbqfkf() {
        y2.iobyxmoadg.eablkybsjg(this.f9976zoijcleaow);
        return this.f9975iobyxmoadg.getReadableDatabase().query(this.f9976zoijcleaow, f9974ppxfxbqfkf, null, null, null, null, null);
    }

    private static String wkgbmnqykc(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public void eablkybsjg(long j13) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j13);
            this.f9976zoijcleaow = wkgbmnqykc(hexString);
            if (a3.ppxfxbqfkf.zoijcleaow(this.f9975iobyxmoadg.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f9975iobyxmoadg.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    a3.ppxfxbqfkf.wkgbmnqykc(writableDatabase, 2, hexString, 1);
                    iobyxmoadg(writableDatabase, this.f9976zoijcleaow);
                    writableDatabase.execSQL("CREATE TABLE " + this.f9976zoijcleaow + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public void gxszxtbevo(String str) throws DatabaseIOException {
        y2.iobyxmoadg.eablkybsjg(this.f9976zoijcleaow);
        try {
            this.f9975iobyxmoadg.getWritableDatabase().delete(this.f9976zoijcleaow, "name = ?", new String[]{str});
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public void lqeggnwhkg(Set set) throws DatabaseIOException {
        y2.iobyxmoadg.eablkybsjg(this.f9976zoijcleaow);
        try {
            SQLiteDatabase writableDatabase = this.f9975iobyxmoadg.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f9976zoijcleaow, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public void nufgyqmvbu(String str, long j13, long j14) throws DatabaseIOException {
        y2.iobyxmoadg.eablkybsjg(this.f9976zoijcleaow);
        try {
            SQLiteDatabase writableDatabase = this.f9975iobyxmoadg.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(ExternalMetricsManagerImpl.NAME, str);
            contentValues.put("length", Long.valueOf(j13));
            contentValues.put("last_touch_timestamp", Long.valueOf(j14));
            writableDatabase.replaceOrThrow(this.f9976zoijcleaow, null, contentValues);
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public Map zoijcleaow() throws DatabaseIOException {
        try {
            Cursor cursorPpxfxbqfkf = ppxfxbqfkf();
            try {
                HashMap map = new HashMap(cursorPpxfxbqfkf.getCount());
                while (cursorPpxfxbqfkf.moveToNext()) {
                    map.put((String) y2.iobyxmoadg.eablkybsjg(cursorPpxfxbqfkf.getString(0)), new ppxfxbqfkf(cursorPpxfxbqfkf.getLong(1), cursorPpxfxbqfkf.getLong(2)));
                }
                cursorPpxfxbqfkf.close();
                return map;
            } catch (Throwable th2) {
                if (cursorPpxfxbqfkf != null) {
                    try {
                        cursorPpxfxbqfkf.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }
}
