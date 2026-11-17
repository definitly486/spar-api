package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class Pj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f46396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46397b;

    public Pj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f46396a = pluginErrorDetails;
        this.f46397b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.getPluginExtension().reportError(this.f46396a, this.f46397b);
    }
}
