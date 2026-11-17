package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3797qn implements TempCacheStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TempCacheStorage f47931a;

    public C3797qn(Context context, Sm sm2, TempCacheStorage tempCacheStorage) {
        this.f47931a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return this.f47931a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j13, byte[] bArr) {
        return this.f47931a.put(str, j13, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j13) {
        this.f47931a.remove(j13);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j13) {
        this.f47931a.removeOlderThan(str, j13);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final Collection<TempCacheStorage.Entry> get(String str, int i13) {
        return this.f47931a.get(str, i13);
    }
}
