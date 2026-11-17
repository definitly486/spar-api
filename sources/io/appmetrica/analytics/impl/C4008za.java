package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4008za {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4008za f48597d = new C4008za();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Id f48598a = new Id();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f48599b = AbstractC3619jk.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48600c = false;

    public final void a(Context context) {
        Ia.a(context);
        this.f48599b.onCreate(context);
        this.f48598a.getClass();
        Iterator it = Ia.F.f46022s.a().iterator();
        while (it.hasNext()) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                Ia.F.o().a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new C3893uk(Ia.j().B().b()).a(context);
        Ia.F.p().a();
    }

    public final void b(Context context) {
        if (this.f48600c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f48600c) {
                    a(context);
                    this.f48600c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
