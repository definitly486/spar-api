package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class Ze implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f46863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3437cf f46864b;

    public Ze(C3437cf c3437cf, PluginErrorDetails pluginErrorDetails) {
        this.f46864b = c3437cf;
        this.f46863a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC3685mb) this.f46864b.f47020d.get()).getPluginExtension().reportUnhandledException(this.f46863a);
    }
}
