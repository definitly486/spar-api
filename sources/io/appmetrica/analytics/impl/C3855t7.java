package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3855t7 extends SQLiteOpenHelper implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicLogger f48111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3573hn f48112c;

    public C3855t7(Context context, String str, C3573hn c3573hn, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, S5.f46494b);
        this.f48112c = c3573hn;
        this.f48110a = str;
        this.f48111b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th2) {
            this.f48111b.error(th2, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f48110a);
            C3442ck c3442ck = Bj.f45542a;
            c3442ck.getClass();
            c3442ck.a(new Cj("db_read_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th2) {
            this.f48111b.error(th2, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f48110a);
            C3442ck c3442ck = Bj.f45542a;
            c3442ck.getClass();
            c3442ck.a(new Cj("db_write_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f48112c.f47409a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        C3573hn c3573hn = this.f48112c;
        if (i13 <= i14) {
            c3573hn.getClass();
            return;
        }
        try {
            c3573hn.f47410b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c3573hn.f47409a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C3573hn c3573hn = this.f48112c;
        c3573hn.getClass();
        try {
            C3597in c3597in = c3573hn.f47412d;
            if (c3597in == null || c3597in.a(sQLiteDatabase)) {
                return;
            }
            try {
                c3573hn.f47410b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c3573hn.f47409a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        boolean z13;
        C3573hn c3573hn = this.f48112c;
        c3573hn.getClass();
        if (i14 > i13) {
            for (int i15 = i13 + 1; i15 <= i14; i15++) {
                try {
                    Collection collection = (Collection) c3573hn.f47411c.f46140a.get(Integer.valueOf(i15));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13 || (!c3573hn.f47412d.a(sQLiteDatabase))) {
            try {
                c3573hn.f47410b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c3573hn.f47409a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
