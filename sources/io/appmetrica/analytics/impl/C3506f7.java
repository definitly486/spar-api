package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3506f7 extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3828s5 f47207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3532g7 f47208b;

    public C3506f7(C3532g7 c3532g7, C3828s5 c3828s5) {
        this.f47208b = c3532g7;
        this.f47207a = c3828s5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f47208b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f47208b.f47297j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC3658l9) it2.next()).a(arrayList2);
            }
            ((F5) this.f47207a.f48045p).e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList<ContentValues> arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (C3532g7.a(this.f47208b)) {
                            wait();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f47208b.f47292e) {
                arrayList = new ArrayList(this.f47208b.f47293f);
                this.f47208b.f47293f.clear();
            }
            C3532g7 c3532g7 = this.f47208b;
            c3532g7.getClass();
            if (!arrayList.isEmpty()) {
                c3532g7.f47289b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = c3532g7.f47290c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            for (ContentValues contentValues : arrayList) {
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                c3532g7.f47296i.incrementAndGet();
                                c3532g7.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            c3532g7.f47296i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                c3532g7.f47289b.unlock();
            }
            a(arrayList);
        }
    }
}
