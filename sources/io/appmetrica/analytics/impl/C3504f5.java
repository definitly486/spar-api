package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3504f5 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3478e5 f47205a = new C3478e5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3453d5 f47206b = new C3453d5();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        this.f47205a.runScript(sQLiteDatabase);
        this.f47206b.runScript(sQLiteDatabase);
    }
}
