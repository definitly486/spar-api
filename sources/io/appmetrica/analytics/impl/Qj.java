package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class Qj implements InterfaceC3660lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f46431c;

    public Qj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f46429a = str;
        this.f46430b = str2;
        this.f46431c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3660lb
    public final void a(InterfaceC3685mb interfaceC3685mb) {
        interfaceC3685mb.getPluginExtension().reportError(this.f46429a, this.f46430b, this.f46431c);
    }
}
