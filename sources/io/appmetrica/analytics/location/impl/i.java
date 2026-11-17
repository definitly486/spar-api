package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationFilter f48664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheArguments f48665b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f48664a = locationFilter;
        this.f48665b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        i iVar = (i) obj;
        return zdlpuopuiu.eablkybsjg(this.f48664a, iVar.f48664a) && zdlpuopuiu.eablkybsjg(this.f48665b, iVar.f48665b);
    }

    public final int hashCode() {
        return this.f48665b.hashCode() + (this.f48664a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f48664a + ", cacheArguments=" + this.f48665b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
