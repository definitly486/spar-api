package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3998z0 implements Xa {
    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.V6
    public final void a(int i13, Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void b(AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final InterfaceC3685mb c(ReporterConfig reporterConfig) {
        return new C3891ui();
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final C3833sa d() {
        return new C3833sa();
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final String e() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final Map<String, String> g() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final AdvIdentifiersResult h() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final Ec i() {
        Sc sc2 = new Sc();
        return new Ec(sc2, new U7(sc2));
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void setDataSendingEnabled(boolean z13) {
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void setUserProfileID(String str) {
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void b(boolean z13) {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(boolean z13) {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.Xa, io.appmetrica.analytics.impl.InterfaceC3735ob
    public final InterfaceC3710nb a() {
        return new C3966xi();
    }
}
