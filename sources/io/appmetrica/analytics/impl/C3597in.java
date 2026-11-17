package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.in, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3597in {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f47488a;

    public C3597in(String str, HashMap<String, List<String>> map) {
        this.f47488a = map;
    }

    public final HashMap<String, List<String>> a() {
        return this.f47488a;
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry entry : this.f47488a.entrySet()) {
                try {
                    Cursor cursorQuery = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        io.a(cursorQuery);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= list.equals(listAsList);
                    io.a(cursorQuery);
                } catch (Throwable th2) {
                    io.a((Cursor) null);
                    throw th2;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }
}
