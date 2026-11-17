package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3968xk implements ModuleRemoteConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f48456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f48457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f48458c;

    public C3968xk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f48456a = sdkIdentifiers;
        this.f48457b = remoteConfigMetaInfo;
        this.f48458c = obj;
    }

    public final C3968xk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C3968xk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.f48457b;
    }

    public final Object c() {
        return this.f48458c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3968xk)) {
            return false;
        }
        C3968xk c3968xk = (C3968xk) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f48456a, c3968xk.f48456a) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f48457b, c3968xk.f48457b) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f48458c, c3968xk.f48458c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f48458c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f48456a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f48457b;
    }

    public final int hashCode() {
        int iHashCode = (this.f48457b.hashCode() + (this.f48456a.hashCode() * 31)) * 31;
        Object obj = this.f48458c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f48456a + ", remoteConfigMetaInfo=" + this.f48457b + ", featuresConfig=" + this.f48458c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f48456a;
    }

    public static C3968xk a(C3968xk c3968xk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            sdkIdentifiers = c3968xk.f48456a;
        }
        if ((i13 & 2) != 0) {
            remoteConfigMetaInfo = c3968xk.f48457b;
        }
        if ((i13 & 4) != 0) {
            obj = c3968xk.f48458c;
        }
        c3968xk.getClass();
        return new C3968xk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
