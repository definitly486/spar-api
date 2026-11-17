package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* JADX INFO: loaded from: classes3.dex */
public final class Qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pf f46419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f46420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D0 f46421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0 f46422d;

    public Qd(Pf pf2) {
        this.f46419a = pf2;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f46420b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f46421c = new D0();
    }
}
