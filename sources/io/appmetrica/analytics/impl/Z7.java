package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Z7 implements InterfaceC3435cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Location f46848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f46849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f46850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f46851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f46852e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f46853f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f46855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ji f46857j;

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(boolean z13) {
        Boolean boolValueOf = Boolean.valueOf(z13);
        this.f46849b = boolValueOf;
        Ji ji2 = this.f46857j;
        if (ji2 != null) {
            ji2.a(boolValueOf, this.f46851d, this.f46850c);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void b(boolean z13) {
        Boolean boolValueOf = Boolean.valueOf(z13);
        this.f46850c = boolValueOf;
        Ji ji2 = this.f46857j;
        if (ji2 != null) {
            ji2.a(this.f46849b, this.f46851d, boolValueOf);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void clearAppEnvironment() {
        this.f46854g = true;
        this.f46852e.clear();
    }

    public final Location j() {
        return this.f46848a;
    }

    public final Boolean k() {
        return this.f46850c;
    }

    public final Boolean l() {
        return this.f46851d;
    }

    public final Boolean m() {
        return this.f46849b;
    }

    public final boolean n() {
        return this.f46854g;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f46852e.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void setDataSendingEnabled(boolean z13) {
        Boolean boolValueOf = Boolean.valueOf(z13);
        this.f46851d = boolValueOf;
        Ji ji2 = this.f46857j;
        if (ji2 != null) {
            ji2.a(this.f46849b, boolValueOf, this.f46850c);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void setUserProfileID(String str) {
        this.f46855h = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(Location location) {
        this.f46848a = location;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3435cd
    public final void a(String str, String str2) {
        this.f46853f.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f46856i) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builderNewConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        builderNewConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builderNewConfigBuilder.withLocation(appMetricaConfig.location);
        if (io.a(appMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (io.a(appMetricaConfig.dispatchPeriodSeconds)) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (io.a(appMetricaConfig.appBuildNumber)) {
            builderNewConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (io.a(appMetricaConfig.maxReportsCount)) {
            builderNewConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (io.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (io.a(appMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (io.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (io.a(appMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (io.a(appMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (io.a(appMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (io.a(appMetricaConfig.advIdentifiersTracking)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (io.a(appMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (io.a(appMetricaConfig.dataSendingEnabled)) {
            builderNewConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (io.a(appMetricaConfig.anrMonitoring)) {
            builderNewConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (io.a(appMetricaConfig.anrMonitoringTimeout)) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (io.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (io.a(appMetricaConfig.crashTransformer)) {
            builderNewConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (io.a(appMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (io.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (io.a(appMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (io.a((Object) appMetricaConfig.customHosts)) {
            builderNewConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f46852e;
        if (!io.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!io.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f46853f;
        if (!io.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!io.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!io.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                builderNewConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f46849b;
        if (appMetricaConfig.locationTracking == null && io.a(bool)) {
            builderNewConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f46848a;
        if (appMetricaConfig.location == null && io.a(location)) {
            builderNewConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f46851d;
        if (appMetricaConfig.dataSendingEnabled == null && io.a(bool2)) {
            builderNewConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!io.a(appMetricaConfig.userProfileID) && io.a(this.f46855h)) {
            builderNewConfigBuilder.withUserProfileID(this.f46855h);
        }
        Boolean bool3 = this.f46850c;
        if (appMetricaConfig.advIdentifiersTracking == null && io.a(bool3)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f46856i = true;
        this.f46848a = null;
        this.f46849b = null;
        this.f46850c = null;
        this.f46851d = null;
        this.f46852e.clear();
        this.f46853f.clear();
        this.f46854g = false;
        this.f46855h = null;
        return builderNewConfigBuilder.build();
    }

    public final void a(Ji ji2) {
        Boolean bool = this.f46849b;
        if (bool != null || this.f46851d != null || this.f46850c != null) {
            ji2.a(bool, this.f46851d, this.f46850c);
        }
        this.f46857j = ji2;
    }
}
