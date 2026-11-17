package a3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import v2.zdlpuopuiu;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {
    static {
        zdlpuopuiu.iobyxmoadg("media3.database");
    }

    private static String[] iobyxmoadg(int i13, String str) {
        return new String[]{Integer.toString(i13), str};
    }

    public static void ppxfxbqfkf(SQLiteDatabase sQLiteDatabase, int i13, String str) throws DatabaseIOException {
        try {
            if (stevsuqkhv.o(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", iobyxmoadg(i13, str));
            }
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public static void wkgbmnqykc(SQLiteDatabase sQLiteDatabase, int i13, String str, int i14) throws DatabaseIOException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i13));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i14));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }

    public static int zoijcleaow(SQLiteDatabase sQLiteDatabase, int i13, String str) throws DatabaseIOException {
        try {
            if (!stevsuqkhv.o(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", iobyxmoadg(i13, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i14 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i14;
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
            throw new DatabaseIOException(e);
        } catch (SQLException e13) {
            throw new DatabaseIOException(e13);
        }
    }
}
