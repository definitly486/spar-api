package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3893uk extends AbstractC3486ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to f48210a;

    public C3893uk() {
        this(Ia.j().B().b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3486ed
    public final void a(int i13) {
        to toVar = this.f48210a;
        synchronized (toVar) {
            vo voVar = toVar.f48151a;
            voVar.a(voVar.a().put("last_migration_api_level", i13));
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3486ed
    public final int b() {
        int iOptInt;
        to toVar = this.f48210a;
        synchronized (toVar) {
            iOptInt = toVar.f48151a.a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3486ed
    public final SparseArray<InterfaceC3461dd> c() {
        SparseArray<InterfaceC3461dd> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C3918vk(this.f48210a));
        sparseArray.put(BuildConfig.API_LEVEL, new C3943wk());
        return sparseArray;
    }

    public C3893uk(to toVar) {
        this.f48210a = toVar;
    }
}
