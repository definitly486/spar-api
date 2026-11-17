package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3885uc implements T6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3573hn f48201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3858ta f48202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3855t7 f48203e;

    public C3885uc(Context context, String str, C3573hn c3573hn) {
        this(context, str, new C3858ta(str), c3573hn);
    }

    @Override // io.appmetrica.analytics.impl.T6
    public final synchronized SQLiteDatabase a() {
        C3855t7 c3855t7;
        try {
            this.f48202d.a();
            c3855t7 = new C3855t7(this.f48199a, this.f48200b, this.f48201c, PublicLogger.getAnonymousInstance());
            this.f48203e = c3855t7;
        } catch (Throwable unused) {
            return null;
        }
        return c3855t7.getWritableDatabase();
    }

    public C3885uc(Context context, String str, C3858ta c3858ta, C3573hn c3573hn) {
        this.f48199a = context;
        this.f48200b = str;
        this.f48202d = c3858ta;
        this.f48201c = c3573hn;
    }

    @Override // io.appmetrica.analytics.impl.T6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        io.a((Closeable) this.f48203e);
        this.f48202d.b();
        this.f48203e = null;
    }
}
