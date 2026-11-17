package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class Oj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f46344a;

    public Oj(PluginErrorDetails pluginErrorDetails) {
        this.f46344a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.getPluginExtension().reportUnhandledException(this.f46344a);
    }
}
