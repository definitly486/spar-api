package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3993yk implements InterfaceC3637kd, InterfaceC3646km, AskForPermissionStrategyModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48537a = "rp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f48538b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f48539c = new W7();

    @Override // io.appmetrica.analytics.impl.InterfaceC3646km
    public final void a(C3521fm c3521fm) {
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c3521fm.e(), c3521fm.a(), c3521fm.b());
        Xg xg2 = new Xg(c3521fm.c(), c3521fm.d());
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f48538b) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration != null) {
                remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C3968xk(sdkIdentifiers, xg2, c3521fm.B.get(moduleServiceEntryPoint.getIdentifier())));
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3637kd
    public final List<ModuleServicesDatabase> b() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f48538b;
        ArrayList arrayList2 = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                objValueOf = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                String identifier = moduleServiceEntryPoint.getIdentifier();
                C3442ck c3442ck = Bj.f45542a;
                Map mapGxszxtbevo = hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg(identifier, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("db", gg.lqeggnwhkg.ppxfxbqfkf(th2)))));
                c3442ck.getClass();
                c3442ck.a(new C3416bk("service_module_errors", mapGxszxtbevo));
                objValueOf = gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        this.f48538b.removeAll(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3637kd
    public final Map<String, C3861td> c() {
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f48538b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = remoteConfigExtensionConfiguration != null ? gg.cqumvgiudr.iobyxmoadg(moduleServiceEntryPoint.getIdentifier(), new C3861td(remoteConfigExtensionConfiguration)) : null;
            if (vdvldrhtssVarIobyxmoadg != null) {
                arrayList.add(vdvldrhtssVarIobyxmoadg);
            }
        }
        return hg.tzroggbefp.kcexrzcfyt(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3637kd
    public final Map<String, Integer> d() {
        List listWflxmlrfwp;
        Map<String, Integer> blocks;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f48538b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration == null || (blocks = remoteConfigExtensionConfiguration.getBlocks()) == null || (listWflxmlrfwp = hg.tzroggbefp.esjtqupxsv(blocks)) == null) {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            hg.jyumaefscl.istkbnxepw(arrayList, listWflxmlrfwp);
        }
        return hg.tzroggbefp.kcexrzcfyt(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3637kd
    public final List<Consumer<Location>> e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f48538b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            Consumer<Location> locationConsumer = locationServiceExtension != null ? locationServiceExtension.getLocationConsumer() : null;
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3637kd
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController locationSourcesController;
        Iterator it = this.f48538b.iterator();
        do {
            locationSourcesController = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                locationSourcesController = locationServiceExtension.getLocationSourcesController();
            }
        } while (locationSourcesController == null);
        return locationSourcesController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3637kd
    public final Toggle g() {
        Toggle locationControllerAppStateToggle;
        Iterator it = this.f48538b.iterator();
        do {
            locationControllerAppStateToggle = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                locationControllerAppStateToggle = locationServiceExtension.getLocationControllerAppStateToggle();
            }
        } while (locationControllerAppStateToggle == null);
        return locationControllerAppStateToggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f48539c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3637kd
    public final List<String> h() {
        List<String> listWflxmlrfwp;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f48538b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration == null || (listWflxmlrfwp = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            hg.jyumaefscl.istkbnxepw(arrayList, listWflxmlrfwp);
        }
        return arrayList;
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f48538b) {
            ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
            Bundle configBundleForClient = clientConfigProvider != null ? clientConfigProvider.getConfigBundleForClient() : null;
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f48538b.add(moduleServiceEntryPoint);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f48537a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f48539c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    public final void a(ServiceContext serviceContext, C3521fm c3521fm) {
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f48538b) {
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C3968xk(new SdkIdentifiers(c3521fm.f47231d, c3521fm.f47228a, c3521fm.f47229b), new Xg(c3521fm.f47249v, c3521fm.f47248u), c3521fm.B.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    C3762pd c3762pd = Ia.F.f46023t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (c3762pd) {
                        try {
                            c3762pd.f47878a.put(identifier, moduleEventServiceHandlerFactory);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    continue;
                }
            } catch (Throwable th3) {
                String identifier2 = moduleServiceEntryPoint.getIdentifier();
                C3442ck c3442ck = Bj.f45542a;
                Map mapGxszxtbevo = hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg(identifier2, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg("init", gg.lqeggnwhkg.ppxfxbqfkf(th3)))));
                c3442ck.getClass();
                c3442ck.a(new C3416bk("service_module_errors", mapGxszxtbevo));
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        this.f48538b.removeAll(hashSet);
    }
}
