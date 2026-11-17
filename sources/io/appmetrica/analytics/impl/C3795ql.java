package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3795ql implements T6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3855t7 f47927a;

    public C3795ql(C3855t7 c3855t7) {
        this.f47927a = c3855t7;
    }

    @Override // io.appmetrica.analytics.impl.T6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.T6
    public final SQLiteDatabase a() {
        try {
            return this.f47927a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
