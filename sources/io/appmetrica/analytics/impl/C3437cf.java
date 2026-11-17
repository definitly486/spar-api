package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3437cf implements IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3514ff f47017a = new C3514ff();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3540gf f47018b = new C3540gf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f47019c = C3952x4.l().g().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f47020d;

    public C3437cf(Provider<InterfaceC3685mb> provider) {
        this.f47020d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C3514ff c3514ff = this.f47017a;
        c3514ff.f47218a.a(pluginErrorDetails);
        if (c3514ff.f47220c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f47784a) {
            this.f47018b.getClass();
            this.f47019c.execute(new RunnableC3385af(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f47017a.f47218a.a(pluginErrorDetails);
        this.f47018b.getClass();
        this.f47019c.execute(new Ze(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f47017a.f47219b.a(str);
        this.f47018b.getClass();
        this.f47019c.execute(new RunnableC3411bf(this, str, str2, pluginErrorDetails));
    }
}
