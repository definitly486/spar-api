package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3478e5 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47152a = "sessions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47153b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47154c = "id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47155d = "start_time";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47156e = "report_request_parameters";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47157f = "server_time_offset";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47158g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47159h = "obtained_before_first_sync";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P7 f47160i = new P7(null, 1, 0 == true ? 1 : 0);

    public final O7 a(Cursor cursor) {
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47154c)));
            int i13 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47158g));
            Wk wk2 = Wk.FOREGROUND;
            boolean z13 = true;
            if (i13 != 0) {
                wk2 = Wk.BACKGROUND;
                if (i13 != 1) {
                    wk2 = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f47156e));
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47155d)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47157f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f47159h)) != 1) {
                z13 = false;
            }
            return new O7(lValueOf, wk2, string, new N7(lValueOf2, lValueOf3, Boolean.valueOf(z13)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        Iterator it;
        Long l13;
        String str;
        Long l14;
        ArrayList arrayList = new ArrayList();
        try {
            cursorQuery = sQLiteDatabase.query(this.f47152a, null, null, null, null, null, null, String.valueOf(this.f47153b));
            while (cursorQuery.moveToNext()) {
                try {
                    O7 o7A = a(cursorQuery);
                    if (o7A != null && (l13 = o7A.f46310a) != null && l13.longValue() >= 0 && o7A.f46311b != null && (str = o7A.f46312c) != null && str.length() != 0 && (l14 = o7A.f46313d.f46252a) != null && l14.longValue() > 0) {
                        arrayList.add(this.f47160i.fromModel(o7A));
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f47152a);
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            sQLiteDatabase.insertOrThrow("sessions", null, (ContentValues) it.next());
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
        }
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f47152a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.insertOrThrow("sessions", null, (ContentValues) it.next());
        }
    }
}
