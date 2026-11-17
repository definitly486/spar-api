package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3429c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f47012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4017zj f47013b;

    public C3429c7(CounterConfigurationReporterType counterConfigurationReporterType) {
        this(counterConfigurationReporterType, Ia.j().v());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    public final C3377a7 a(SQLiteDatabase sQLiteDatabase, String str, int i13, String str2, boolean z13) {
        Cursor cursorRawQuery;
        ArrayList<ContentValues> arrayList;
        int iDelete;
        C4017zj c4017zj;
        C3967xj c3967xj;
        C3579i4 c3579i4;
        Integer num;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s, %s, %s FROM %s WHERE %s", "global_number", "type", "event_description", "events", str), null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        arrayList = new ArrayList(cursorRawQuery.getCount());
                        while (cursorRawQuery.moveToNext()) {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                            arrayList.add(contentValues);
                        }
                    } else {
                        arrayList = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C3442ck c3442ck = Bj.f45542a;
                        c3442ck.getClass();
                        c3442ck.a(new Cj("select_rows_to_delete_exception", th));
                        io.a(cursorRawQuery);
                        arrayList = null;
                    } catch (Throwable th3) {
                        io.a(cursorRawQuery);
                        throw th3;
                    }
                }
            } else {
                arrayList = null;
            }
            io.a(cursorRawQuery);
        } catch (Throwable th4) {
            th = th4;
            cursorRawQuery = null;
        }
        try {
            iDelete = sQLiteDatabase.delete("events", str, null);
        } catch (Throwable unused) {
            iDelete = 0;
        }
        if (arrayList != null && arrayList.size() != 0 && iDelete == arrayList.size() && z13 && str2 != null && (c4017zj = this.f47013b) != null) {
            CounterConfigurationReporterType counterConfigurationReporterType = this.f47012a;
            synchronized (c4017zj) {
                c3967xj = (C3967xj) c4017zj.f48625c.get(str2);
                if (c3967xj == null) {
                    c3967xj = new C3967xj(str2, c4017zj.f48624b, counterConfigurationReporterType, c4017zj.f48623a);
                    c4017zj.f48625c.put(str2, c3967xj);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (ContentValues contentValues2 : arrayList) {
                    Integer asInteger = contentValues2.getAsInteger("global_number");
                    Integer asInteger2 = contentValues2.getAsInteger("type");
                    if (asInteger != null && asInteger2 != null) {
                        jSONArray.put(asInteger);
                        EnumC3934wb enumC3934wbA = EnumC3934wb.a(asInteger2.intValue());
                        if (enumC3934wbA == null) {
                            Map map = AbstractC3438cg.f47021a;
                            num = null;
                        } else {
                            num = (Integer) AbstractC3438cg.f47023c.get(enumC3934wbA);
                        }
                        jSONArray2.put(num);
                    }
                }
                jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                JSONObject jSONObjectPut = new JSONObject().put("details", new JSONObject().put("reason", AbstractC3403b7.a(i13)).put("cleared", jSONObject).put("actual_deleted_number", iDelete));
                PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                String string = jSONObjectPut.toString();
                Set set = R9.f46441a;
                EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
                c3579i4 = new C3579i4(string, "", 12290, 0, orCreatePublicLogger);
            } catch (Throwable unused2) {
                c3579i4 = null;
            }
            if (c3579i4 != null && c3967xj.f48454c != null) {
                try {
                    CounterConfiguration counterConfiguration = new CounterConfiguration(c3967xj.f48452a);
                    counterConfiguration.setReporterType(c3967xj.f48454c);
                    c3967xj.f48455d.f45473a.reportData(1, c3579i4.d(new Sh(new Pf(c3967xj.f48453b, (ResultReceiver) null), counterConfiguration, new W8(new C3819rl(LoggerStorage.getOrCreatePublicLogger(c3967xj.f48452a), "Crash Environment")), null).c()));
                } catch (Throwable unused3) {
                }
            }
        }
        return new C3377a7(arrayList, iDelete);
    }

    public C3429c7(CounterConfigurationReporterType counterConfigurationReporterType, C4017zj c4017zj) {
        this.f47012a = counterConfigurationReporterType;
        this.f47013b = c4017zj;
    }
}
