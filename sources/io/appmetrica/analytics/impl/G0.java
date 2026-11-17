package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f45826a = C3952x4.l().g().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3873u0 f45827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3488ef f45828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3565hf f45829d;

    public G0() {
        C3873u0 c3873u0 = new C3873u0();
        this.f45827b = c3873u0;
        this.f45828c = new C3488ef(c3873u0);
        this.f45829d = new C3565hf();
    }

    public final void a(final PluginErrorDetails pluginErrorDetails) {
        C3488ef c3488ef = this.f45828c;
        c3488ef.f47178a.a(null);
        c3488ef.f47179b.a(pluginErrorDetails);
        C3565hf c3565hf = this.f45829d;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(pluginErrorDetails);
        c3565hf.getClass();
        this.f45826a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                G0.a(this.f48351zdlpuopuiu, pluginErrorDetails);
            }
        });
    }

    public final void a(final PluginErrorDetails pluginErrorDetails, final String str) {
        C3488ef c3488ef = this.f45828c;
        c3488ef.f47178a.a(null);
        c3488ef.f47179b.a(pluginErrorDetails);
        if (c3488ef.f47181d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f47784a) {
            C3565hf c3565hf = this.f45829d;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(pluginErrorDetails);
            c3565hf.getClass();
            this.f45826a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.ppxfxbqfkf
                @Override // java.lang.Runnable
                public final void run() {
                    G0.a(this.f47901zdlpuopuiu, pluginErrorDetails, str);
                }
            });
        }
    }

    public final void a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        C3488ef c3488ef = this.f45828c;
        c3488ef.f47178a.a(null);
        c3488ef.f47180c.a(str);
        C3565hf c3565hf = this.f45829d;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str);
        c3565hf.getClass();
        this.f45826a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                G0.a(this.f47177zdlpuopuiu, str, str2, pluginErrorDetails);
            }
        });
    }

    public static final void a(G0 g13, PluginErrorDetails pluginErrorDetails, String str) {
        g13.f45827b.getClass();
        C3848t0 c3848t0 = C3848t0.f48087e;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3848t0);
        Ec ecI = c3848t0.f().i();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ecI);
        ecI.f45721a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(G0 g13, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        g13.f45827b.getClass();
        C3848t0 c3848t0 = C3848t0.f48087e;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3848t0);
        Ec ecI = c3848t0.f().i();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ecI);
        ecI.f45721a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(G0 g13, PluginErrorDetails pluginErrorDetails) {
        g13.f45827b.getClass();
        C3848t0 c3848t0 = C3848t0.f48087e;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(c3848t0);
        Ec ecI = c3848t0.f().i();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(ecI);
        ecI.f45721a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
