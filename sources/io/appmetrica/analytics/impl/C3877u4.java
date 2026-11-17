package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3877u4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3454d6 f48156c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3852t4 f48154a = new C3852t4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f48155b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f48157d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th2) {
        C3442ck c3442ck = Bj.f45542a;
        Map mapGxszxtbevo = hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg(str, hg.tzroggbefp.gxszxtbevo(gg.cqumvgiudr.iobyxmoadg(str2, gg.lqeggnwhkg.ppxfxbqfkf(th2)))));
        c3442ck.getClass();
        c3442ck.a(new C3416bk("client_module_errors", mapGxszxtbevo));
    }

    public final ModuleAdRevenueProcessor b() {
        C3531g6 c3531g6;
        InterfaceC3454d6 interfaceC3454d6 = this.f48156c;
        if (interfaceC3454d6 == null || (c3531g6 = ((C3529g4) interfaceC3454d6).f47279b) == null) {
            return null;
        }
        return c3531g6.f47287a;
    }

    public final void c() {
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f48155b) {
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th2);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f48157d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f48155b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AdRevenueCollector) obj).getEnabled()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it2.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(arrayList3);
    }

    public final List<String> a() {
        return this.f48157d;
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f48155b.add(moduleClientEntryPoint);
    }

    public final void a(InterfaceC3454d6 interfaceC3454d6) {
        this.f48156c = interfaceC3454d6;
        HashSet hashSet = new HashSet();
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f48155b) {
            try {
                moduleClientEntryPoint.initClientSide(interfaceC3454d6);
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th2);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f48155b.removeAll(hashSet);
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f48155b) {
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C3852t4 c3852t4 = this.f48154a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c3852t4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C3827s4 c3827s4 = bundle2 != null ? new C3827s4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c3827s4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c3827s4);
                    }
                }
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th2);
            }
        }
    }
}
