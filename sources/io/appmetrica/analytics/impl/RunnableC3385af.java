package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3385af implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f46919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3437cf f46921c;

    public RunnableC3385af(C3437cf c3437cf, PluginErrorDetails pluginErrorDetails, String str) {
        this.f46921c = c3437cf;
        this.f46919a = pluginErrorDetails;
        this.f46920b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC3685mb) this.f46921c.f47020d.get()).getPluginExtension().reportError(this.f46919a, this.f46920b);
    }
}
