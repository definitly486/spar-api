package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3453d5 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47067a = 2000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47068b = "number";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47069c = "global_number";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47070d = "number_of_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47071e = ExternalMetricsManagerImpl.NAME;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47072f = "value";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47073g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47074h = "time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47075i = "session_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f47076j = "error_environment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f47077k = "session_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f47078l = "app_environment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f47079m = "app_environment_revision";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f47080n = "truncated";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f47081o = "custom_type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f47082p = "encrypting_mode";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f47083q = "profile_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f47084r = "first_occurrence_status";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f47085s = AdRevenueConstants.SOURCE_KEY;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f47086t = "attribution_id_changed";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f47087u = "open_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f47088v = "extras";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f47089w = "reports";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final B7 f47090x = new B7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(A7 a13) {
        Long l13;
        EnumC3934wb enumC3934wb;
        Long l14;
        Long l15;
        Long l16;
        Integer num;
        Long l17 = a13.f45442a;
        return (l17 == null || l17.longValue() < 10000000000L || a13.f45443b == null || (l13 = a13.f45444c) == null || l13.longValue() < 0 || (enumC3934wb = a13.f45445d) == null || enumC3934wb == EnumC3934wb.EVENT_TYPE_UNDEFINED || (l14 = a13.f45446e) == null || l14.longValue() < 0 || (l15 = a13.f45447f) == null || l15.longValue() < 0 || ((l16 = a13.f45448g.f48554d) != null && l16.longValue() < 0) || ((num = a13.f45448g.f48559i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query(this.f47089w, null, null, null, null, null, null, String.valueOf(this.f47067a));
            while (cursorQuery.moveToNext()) {
                try {
                    A7 a7A = a(cursorQuery);
                    if (a7A != null && a(a7A)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f47090x.fromModel(a7A));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursorQuery = cursor;
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f47089w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f47089w);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0115 A[PHI: r4
      0x0115: PHI (r4v7 io.appmetrica.analytics.impl.H9) = (r4v5 io.appmetrica.analytics.impl.H9), (r4v6 io.appmetrica.analytics.impl.H9) binds: [B:32:0x0113, B:35:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:31:0x0107, B:34:0x0118), top: B:57:0x0107, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:10:0x002a, B:20:0x00e0, B:44:0x0132, B:48:0x0142, B:52:0x0157, B:51:0x0151, B:38:0x0120, B:29:0x0103, B:13:0x00d4, B:16:0x00d9, B:6:0x0024, B:31:0x0107, B:34:0x0118, B:21:0x00ea, B:24:0x00fb, B:27:0x0100), top: B:65:0x0005, inners: #0, #3 }] */
    public final A7 a(Cursor cursor) {
        Wk wk2;
        EnumC3405b9 enumC3405b9;
        EnumC3983ya enumC3983ya;
        EnumC3983ya enumC3983ya2;
        H9 h13;
        int i13;
        int columnIndex;
        byte[] blob;
        int i14;
        H9 h14;
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47075i)));
            int i15 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47077k));
            Wk wk3 = Wk.FOREGROUND;
            if (i15 != 0) {
                wk3 = Wk.BACKGROUND;
                wk2 = i15 == 1 ? wk3 : null;
            }
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47068b)));
            EnumC3934wb enumC3934wbA = EnumC3934wb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f47073g)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47069c)));
            Long lValueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47074h)));
            Integer numValueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f47081o)));
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f47071e));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f47072f));
            Long lValueOf5 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47070d)));
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f47076j));
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f47078l));
            Long lValueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f47079m)));
            Integer numValueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f47080n)));
            int i16 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47082p));
            EnumC3405b9 enumC3405b10 = EnumC3405b9.NONE;
            if (i16 == 0) {
                enumC3405b9 = enumC3405b10;
            } else {
                enumC3405b10 = EnumC3405b9.AES_VALUE_ENCRYPTION;
                if (i16 != 2) {
                    enumC3405b10 = EnumC3405b9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                    if (i16 != 1) {
                        enumC3405b9 = null;
                    }
                }
                enumC3405b9 = enumC3405b10;
            }
            String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f47083q));
            try {
                try {
                    try {
                        try {
                            int i17 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47084r));
                            EnumC3983ya enumC3983ya3 = EnumC3983ya.FIRST_OCCURRENCE;
                            if (i17 != 1) {
                                enumC3983ya3 = EnumC3983ya.NON_FIRST_OCCURENCE;
                                if (i17 != 2) {
                                    enumC3983ya = EnumC3983ya.UNKNOWN;
                                    enumC3983ya2 = enumC3983ya;
                                    i14 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47085s));
                                    h14 = H9.NATIVE;
                                    if (i14 == 0) {
                                        h13 = h14;
                                    } else {
                                        h14 = H9.JS;
                                        if (i14 == 1) {
                                            h13 = h14;
                                        } else {
                                            h13 = null;
                                        }
                                    }
                                    boolean z13 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47086t)) == 1;
                                    Boolean boolValueOf = Boolean.valueOf(z13);
                                    i13 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47087u));
                                    Integer numValueOf3 = Integer.valueOf(i13);
                                    columnIndex = cursor.getColumnIndex(this.f47088v);
                                    if (columnIndex < 0) {
                                        blob = null;
                                    } else {
                                        blob = cursor.getBlob(columnIndex);
                                    }
                                    return new A7(lValueOf, wk2, lValueOf2, enumC3934wbA, lValueOf3, lValueOf4, new C4005z7(numValueOf, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf2, null, null, enumC3405b9, string5, enumC3983ya2, h13, boolValueOf, numValueOf3, blob));
                                }
                                return null;
                            }
                            enumC3983ya2 = enumC3983ya3;
                        } catch (Throwable unused) {
                            enumC3983ya = EnumC3983ya.UNKNOWN;
                        }
                        if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f47086t)) == 1) {
                        }
                    } catch (Throwable unused2) {
                    }
                    i13 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47087u));
                } catch (Throwable unused3) {
                    i13 = -1;
                }
                i14 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f47085s));
                h14 = H9.NATIVE;
                if (i14 == 0) {
                    h13 = h14;
                } else {
                    h14 = H9.JS;
                    if (i14 == 1) {
                        h13 = h14;
                    } else {
                        h13 = null;
                    }
                }
            } catch (Throwable unused4) {
                h13 = H9.NATIVE;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z13);
            Integer numValueOf4 = Integer.valueOf(i13);
            columnIndex = cursor.getColumnIndex(this.f47088v);
            if (columnIndex < 0) {
                blob = null;
            } else {
                blob = cursor.getBlob(columnIndex);
            }
            return new A7(lValueOf, wk2, lValueOf2, enumC3934wbA, lValueOf3, lValueOf4, new C4005z7(numValueOf, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf2, null, null, enumC3405b9, string5, enumC3983ya2, h13, boolValueOf2, numValueOf4, blob));
        } catch (Throwable unused5) {
            return null;
        }
    }
}
