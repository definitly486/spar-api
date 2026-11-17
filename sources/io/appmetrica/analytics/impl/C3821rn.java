package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3821rn implements TempCacheStorage.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f48024d;

    public C3821rn(long j13, String str, long j14, byte[] bArr) {
        this.f48021a = j13;
        this.f48022b = str;
        this.f48023c = j14;
        this.f48024d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(C3821rn.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C3821rn c3821rn = (C3821rn) obj;
        if (this.f48021a == c3821rn.f48021a && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f48022b, c3821rn.f48022b) && this.f48023c == c3821rn.f48023c) {
            return Arrays.equals(this.f48024d, c3821rn.f48024d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f48024d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f48021a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f48022b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f48023c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48024d) + ((Long.hashCode(this.f48023c) + ((this.f48022b.hashCode() + (Long.hashCode(this.f48021a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f48021a + ", scope='" + this.f48022b + "', timestamp=" + this.f48023c + ", data=array[" + this.f48024d.length + "])";
    }
}
