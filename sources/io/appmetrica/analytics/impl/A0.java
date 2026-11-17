package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wb f45430a = new Wb(C3952x4.l().d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xb f45431b = new Xb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Zb f45432c = new Zb();

    public final void a(final String str, final String str2, final String str3) {
        Wb wb3 = this.f45430a;
        if (wb3.f46711c.a((Void) null).f47784a && wb3.f46712d.a(str).f47784a && wb3.f46713e.a(str2).f47784a && wb3.f46714f.a(str3).f47784a) {
            this.f45431b.getClass();
            ((U9) C3952x4.l().f48373c.a()).f46606b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.iobyxmoadg
                @Override // java.lang.Runnable
                public final void run() {
                    A0.a(this.f47492zdlpuopuiu, str, str2, str3);
                }
            });
            return;
        }
        String str4 = "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3;
        PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]" + str4, new Object[0]);
    }

    public static final void a(A0 a13, String str, String str2, String str3) {
        List list;
        Context contextA;
        Zb zb3 = a13.f45432c;
        zb3.getClass();
        if (str == null) {
            str = "null";
        }
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg2 = gg.cqumvgiudr.iobyxmoadg("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        Map<String, Object> mapWflxmlrfwp = hg.tzroggbefp.wflxmlrfwp(vdvldrhtssVarIobyxmoadg, vdvldrhtssVarIobyxmoadg2, gg.cqumvgiudr.iobyxmoadg("payload", str3));
        ModuleEvent.Builder builderWithName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (zb3) {
            try {
                if (zb3.f46858a == null && (contextA = C3952x4.l().f48377g.a()) != null) {
                    zb3.f46858a = hg.jyumaefscl.rgvfuqvkyq(new C3487ee(), new C3496en(contextA), new Fo());
                }
                list = zb3.f46858a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC3822s) it.next()).a(mapWflxmlrfwp);
            }
        }
        ModulesFacade.reportEvent(builderWithName.withAttributes(mapWflxmlrfwp).build());
    }
}
