package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModuleDummy;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3462de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCrashServiceModule f47099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xd f47100b;

    public C3462de() {
        NativeCrashServiceModule nativeCrashServiceModule = (NativeCrashServiceModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashServiceModuleImpl", NativeCrashServiceModule.class);
        this.f47099a = nativeCrashServiceModule == null ? new NativeCrashServiceModuleDummy() : nativeCrashServiceModule;
        this.f47100b = new Xd(new C3436ce(this));
    }
}
