package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* JADX INFO: loaded from: classes3.dex */
public abstract class P2 implements ModulePreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3894ul f46369a;

    public P2(InterfaceC3894ul interfaceC3894ul) {
        this.f46369a = interfaceC3894ul;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z13) {
        return ((Nd) this.f46369a).c(str, z13);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i13) {
        return ((Nd) this.f46369a).c(str, i13);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j13) {
        return ((Nd) this.f46369a).c(a(str), j13);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((Nd) this.f46369a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z13) {
        Nd nd2 = (Nd) this.f46369a;
        ((AbstractC3664lf) ((InterfaceC3894ul) nd2.b(nd2.f(a(str)), z13))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i13) {
        Nd nd2 = (Nd) this.f46369a;
        ((AbstractC3664lf) ((InterfaceC3894ul) nd2.b(nd2.f(str), i13))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j13) {
        Nd nd2 = (Nd) this.f46369a;
        ((AbstractC3664lf) ((InterfaceC3894ul) nd2.b(nd2.f(a(str)), j13))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        Nd nd2 = (Nd) this.f46369a;
        ((AbstractC3664lf) ((InterfaceC3894ul) nd2.b(nd2.f(a(str)), str2))).b();
    }
}
