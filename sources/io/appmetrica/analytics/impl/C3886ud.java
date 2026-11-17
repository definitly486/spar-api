package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3886ud implements ModuleSelfReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3442ck f48204a = AbstractC3849t1.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48205b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th2) {
        C3442ck c3442ck = this.f48204a;
        c3442ck.getClass();
        c3442ck.a(new Cj(str, th2));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        C3442ck c3442ck = this.f48204a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f48205b).withName(str).build();
        c3442ck.getClass();
        c3442ck.a(new Rj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f48204a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        C3442ck c3442ck = this.f48204a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f48205b).withName(str).withAttributes(map).build();
        c3442ck.getClass();
        c3442ck.a(new Rj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        C3442ck c3442ck = this.f48204a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f48205b).withName(str).withValue(str2).build();
        c3442ck.getClass();
        c3442ck.a(new Rj(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i13, String str, String str2) {
        C3442ck c3442ck = this.f48204a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i13).withName(str).withValue(str2).build();
        c3442ck.getClass();
        c3442ck.a(new Rj(moduleEventBuild));
    }
}
