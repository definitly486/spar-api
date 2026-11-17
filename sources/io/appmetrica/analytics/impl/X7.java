package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class X7 implements ClientComponentsInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46763a = hg.jyumaefscl.rgvfuqvkyq("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C3952x4.l().f48371a.c()) {
            C3712nd c3712nd = C3952x4.l().f48383m;
            List list = this.f46763a;
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
        }
    }
}
