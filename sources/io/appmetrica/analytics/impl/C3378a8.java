package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3378a8 implements ServiceComponentsInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46910a = hg.jyumaefscl.rgvfuqvkyq("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        C3712nd c3712nd = Ia.F.f46022s;
        List list = this.f46910a;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new M5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new M5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        M5[] m5Arr = (M5[]) array;
        InterfaceC3687md[] interfaceC3687mdArr = (InterfaceC3687md[]) Arrays.copyOf(m5Arr, m5Arr.length);
        synchronized (c3712nd) {
            hg.jyumaefscl.cdpycssgdh(c3712nd.f47755a, interfaceC3687mdArr);
        }
        Ia.F.f46022s.a(new Cif(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
