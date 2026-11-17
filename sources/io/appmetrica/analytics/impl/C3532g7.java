package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3532g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f47288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f47289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3855t7 f47290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3506f7 f47291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f47292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f47293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f47294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3828s5 f47295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f47296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f47297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3429c7 f47298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final B7 f47299l;

    static {
        HashSet hashSet = new HashSet();
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public C3532g7(C3828s5 c3828s5, C3855t7 c3855t7, C3429c7 c3429c7, B7 b13) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f47288a = reentrantReadWriteLock.readLock();
        this.f47289b = reentrantReadWriteLock.writeLock();
        this.f47292e = new Object();
        this.f47293f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f47296i = atomicLong;
        this.f47297j = new ArrayList();
        this.f47290c = c3855t7;
        this.f47294g = c3828s5.getContext();
        this.f47295h = c3828s5;
        this.f47298k = c3429c7;
        this.f47299l = b13;
        atomicLong.set(c());
        C3506f7 c3506f7 = new C3506f7(this, c3828s5);
        this.f47291d = c3506f7;
        c3506f7.setName(a(c3828s5));
    }

    public final long a(Set set) {
        this.f47288a.lock();
        Cursor cursorRawQuery = null;
        long j13 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f47290c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb3 = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb3.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i13 > 0) {
                        sb3.append(" OR ");
                    }
                    sb3.append("type == " + num);
                    i13++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb3.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j13 = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        io.a(cursorRawQuery);
        this.f47288a.unlock();
        return j13;
    }

    public final long b() {
        this.f47288a.lock();
        try {
            return this.f47296i.get();
        } finally {
            this.f47288a.unlock();
        }
    }

    public final long c() {
        long jQueryRowsCount;
        this.f47288a.lock();
        try {
            SQLiteDatabase readableDatabase = this.f47290c.getReadableDatabase();
            jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        } catch (Throwable unused) {
        }
        this.f47288a.unlock();
        return jQueryRowsCount;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.f47288a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.f47290c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursorRawQuery.moveToNext()) {
                        stringBuffer.append(cursorRawQuery.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursorRawQuery2 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursorRawQuery2.moveToNext()) {
                        stringBuffer2.append(cursorRawQuery2.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    cursorRawQuery2 = cursor;
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f47288a.unlock();
        io.a(cursorRawQuery);
        io.a(cursorRawQuery2);
    }

    public final void e() {
        this.f47291d.start();
    }

    public final void a(InterfaceC3658l9 interfaceC3658l9) {
        this.f47297j.add(interfaceC3658l9);
    }

    public static String a(Za za3) {
        return "DatabaseWorker [" + za3.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j13, Wk wk2, long j14) {
        JSONObject jSONObject;
        boolean zB;
        P7 p13 = new P7(null, 1, 0 == true ? 1 : 0);
        C3965xh c3965xh = (C3965xh) this.f47295h.f48040k.a();
        Long lValueOf = Long.valueOf(j13);
        Long lValueOf2 = Long.valueOf(j14);
        try {
            jSONObject = new JSONObject().put("dId", c3965xh.getDeviceId()).put("uId", c3965xh.getUuid()).put("appVer", c3965xh.getAppVersion()).put("appBuild", c3965xh.getAppBuildNumber()).put("kitBuildType", c3965xh.getAnalyticsSdkBuildType()).put("osVer", c3965xh.getOsVersion()).put("osApiLev", c3965xh.getOsApiLevel()).put("lang", c3965xh.getLocale()).put("root", c3965xh.getDeviceRootStatus()).put("app_debuggable", ((C3605j6) c3965xh).f47514a).put(CommonUrlParts.APP_FRAMEWORK, c3965xh.getAppFramework()).put("attribution_id", c3965xh.f48446r).put("analyticsSdkVersionName", c3965xh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c3965xh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(Fn.a());
        C3570hk c3570hk = AbstractC3545gk.f47346a;
        synchronized (c3570hk) {
            zB = c3570hk.f47404b.b(true);
        }
        ContentValues contentValuesA = p13.fromModel(new O7(lValueOf, wk2, string, new N7(lValueOf2, lValueOf3, Boolean.valueOf(zB))));
        if (contentValuesA == null) {
            return;
        }
        this.f47289b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f47290c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesA);
            }
        } catch (Throwable unused2) {
        }
        this.f47289b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f47292e) {
            this.f47293f.add(contentValues);
        }
        synchronized (this.f47291d) {
            this.f47291d.notifyAll();
        }
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f47289b.lock();
            if (this.f47296i.get() > ((C3965xh) this.f47295h.f48040k.a()).f48450v && (writableDatabase = this.f47290c.getWritableDatabase()) != null) {
                int iA = a(writableDatabase);
                this.f47296i.addAndGet(-iA);
                if (iA != 0) {
                    Iterator it = this.f47297j.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3658l9) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f47289b.unlock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f47298k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", R9.f46449i), TextUtils.join(", ", R9.f46450j), 10), 2, this.f47295h.f48031b.f47630b, true).f46909b;
        } catch (Throwable th2) {
            C3442ck c3442ck = Bj.f45542a;
            c3442ck.getClass();
            c3442ck.a(new Cj("deleteExcessiveReports exception", th2));
            return 0;
        }
    }

    public final void a(long j13, int i13, int i14, boolean z13) {
        if (i14 <= 0) {
            return;
        }
        this.f47289b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j13), "session_type", Integer.toString(i13), "id", "events", Integer.toString(i14 - 1));
            SQLiteDatabase writableDatabase = this.f47290c.getWritableDatabase();
            if (writableDatabase != null) {
                C3377a7 c3377a7A = this.f47298k.a(writableDatabase, str, 1, this.f47295h.f48031b.f47630b, z13);
                if (c3377a7A.f46908a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c3377a7A.f46908a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f47297j.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC3658l9) it2.next()).b(arrayList);
                    }
                }
                List list = c3377a7A.f46908a;
                if (list != null) {
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        a((ContentValues) list.get(i15), "Event removed from db");
                    }
                }
                this.f47296i.addAndGet(-c3377a7A.f46909b);
            }
        } catch (Throwable unused) {
        }
        this.f47289b.unlock();
    }

    public final ContentValues a(long j13, Wk wk2) {
        ContentValues contentValues = new ContentValues();
        this.f47288a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f47290c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j13), Integer.valueOf(wk2.f46734a)), null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        io.a(cursorRawQuery);
        this.f47288a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb3 = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb3.append(sb3.length() > 0 ? " AND " : "");
            sb3.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb3.toString())) {
            return null;
        }
        return sb3.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (R9.f46444d.contains(EnumC3934wb.a(asInteger != null ? asInteger.intValue() : -1))) {
            A7 a7A = new B7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f47295h.f48042m;
            EnumC3934wb enumC3934wb = a7A.f45445d;
            C4005z7 c4005z7 = a7A.f45448g;
            publicLogger.info(AbstractC3464dg.a(str, enumC3934wb, c4005z7.f48552b, c4005z7.f48553c), new Object[0]);
        }
    }

    public static boolean a(C3532g7 c3532g7) {
        boolean zIsEmpty;
        synchronized (c3532g7.f47292e) {
            zIsEmpty = c3532g7.f47293f.isEmpty();
        }
        return zIsEmpty;
    }
}
