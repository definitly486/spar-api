package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3572hm implements InterfaceC3646km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile C3521fm f47407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f47408b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC3646km
    public final void a(C3521fm c3521fm) {
        this.f47407a = c3521fm;
        Iterator it = this.f47408b.iterator();
        while (it.hasNext()) {
            ((InterfaceC3646km) it.next()).a(c3521fm);
        }
    }

    public final C3521fm b() {
        C3521fm c3521fm = this.f47407a;
        if (c3521fm != null) {
            return c3521fm;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("startupState");
        return null;
    }

    public final void b(InterfaceC3646km interfaceC3646km) {
        this.f47408b.remove(interfaceC3646km);
    }

    public final void a(InterfaceC3646km interfaceC3646km) {
        this.f47408b.add(interfaceC3646km);
        if (this.f47407a != null) {
            C3521fm c3521fm = this.f47407a;
            if (c3521fm == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("startupState");
                c3521fm = null;
            }
            interfaceC3646km.a(c3521fm);
        }
    }

    public final void a(Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageA = Qm.a(C3621jm.class).a(context);
        to toVarA = Ia.j().B().a();
        synchronized (toVarA) {
            strOptStringOrNull = JsonUtils.optStringOrNull(toVarA.f48151a.a(), "device_id");
        }
        a(new C3521fm(strOptStringOrNull, toVarA.a(), (C3621jm) protobufStateStorageA.read()));
    }
}
