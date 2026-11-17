package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3605j6 extends BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3521fm f47516c;

    public final String b() {
        return this.f47515b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f47514a + "', mAppSystem='" + this.f47515b + "', startupState=" + this.f47516c + '}';
    }

    public final String a() {
        return this.f47514a;
    }
}
