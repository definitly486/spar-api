package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3861td implements JsonParser, Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f48121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f48122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f48123c;

    public C3861td(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f48121a = remoteConfigExtensionConfiguration;
        this.f48122b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f48123c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final byte[] a(Object obj) {
        return (byte[]) this.f48123c.fromModel(obj);
    }

    public final Object b(JSONObject jSONObject) {
        return this.f48122b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f48123c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f48122b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f48122b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f48123c.toModel((byte[]) obj);
    }

    public final Object a(JSONObject jSONObject) {
        return this.f48122b.parse(jSONObject);
    }

    public final Object a(byte[] bArr) {
        return this.f48123c.toModel(bArr);
    }

    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f48121a;
    }
}
