package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3411bf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f46972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3437cf f46973d;

    public RunnableC3411bf(C3437cf c3437cf, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f46973d = c3437cf;
        this.f46970a = str;
        this.f46971b = str2;
        this.f46972c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC3685mb) this.f46973d.f47020d.get()).getPluginExtension().reportError(this.f46970a, this.f46971b, this.f46972c);
    }
}
