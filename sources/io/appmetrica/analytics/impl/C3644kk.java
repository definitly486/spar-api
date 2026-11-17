package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3644kk implements ServiceContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleServiceLifecycleController f47611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3564he f47612b = new C3564he(getContext());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3886ud f47613c = new C3886ud();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Dk f47614d = new Dk(getContext(), new Ck(new S1()));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4018zk f47615e = new C4018zk(getContext(), Ia.j().x(), C3880u7.a(getContext()).h());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T9 f47616f = new T9();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L6 f47617g = new L6();

    public C3644kk(ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.f47611a = moduleServiceLifecycleController;
    }

    public final C3564he a() {
        return this.f47612b;
    }

    public final C3886ud b() {
        return this.f47613c;
    }

    public final C4018zk c() {
        return this.f47615e;
    }

    public final Dk d() {
        return this.f47614d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ActivationBarrier getActivationBarrier() {
        return Ia.F.B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ApplicationStateProvider getApplicationStateProvider() {
        return Ia.F.k().f46914b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ChargeTypeProvider getChargeTypeProvider() {
        Ia ia3 = Ia.F;
        C3476e3 c3476e3 = ia3.f46008e;
        if (c3476e3 == null) {
            synchronized (ia3) {
                try {
                    c3476e3 = ia3.f46008e;
                    if (c3476e3 == null) {
                        c3476e3 = new C3476e3(ia3.f46007d.a(), ia3.k().f46913a);
                        ia3.f46008e = c3476e3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3476e3;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final Context getContext() {
        return Ia.F.f46004a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final CryptoProvider getCryptoProvider() {
        return this.f47617g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return Ia.F.g();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ExecutorProvider getExecutorProvider() {
        return this.f47616f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return Ia.F.B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final LocationServiceApi getLocationServiceApi() {
        return Ia.F.l();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.f47611a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.f47612b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PermissionExtractor getPermissionExtractor() {
        return Ia.F.i();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return Ia.F.r();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return Ia.F.u();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.f47613c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.f47615e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.f47614d;
    }
}
