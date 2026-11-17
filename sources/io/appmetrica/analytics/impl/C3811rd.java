package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3811rd implements ModuleEventServiceHandlerContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulePreferences f47986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModulePreferences f47987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModuleEventServiceHandlerReporter f47988c;

    public C3811rd(ModulePreferences modulePreferences, ModulePreferences modulePreferences2, ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f47986a = modulePreferences;
        this.f47987b = modulePreferences2;
        this.f47988c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f47988c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f47987b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    public final ModulePreferences getModulePreferences() {
        return this.f47986a;
    }
}
