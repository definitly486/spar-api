package nb2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class ntlheqmsrt extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final zoijcleaow f69594zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntlheqmsrt(Context context, zoijcleaow migrationVer1to2) {
        super(context, "MetricsEvent.db", (SQLiteDatabase.CursorFactory) null, 2);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrationVer1to2, "migrationVer1to2");
        this.f69594zdlpuopuiu = migrationVer1to2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        db3.execSQL("CREATE TABLE IF NOT EXISTS metrics_event_table (\n    _id INTEGER PRIMARY KEY AUTOINCREMENT,\n    uuid VARCHAR(36),\n    metrics_event BLOB);\n\nCREATE INDEX IF NOT EXISTS uuid_index\n    ON metrics_event_table(uuid)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i13, int i14) throws JSONException {
        if (i13 == 1 && i14 == 2 && sQLiteDatabase != null) {
            this.f69594zdlpuopuiu.iobyxmoadg(sQLiteDatabase);
        }
    }
}
