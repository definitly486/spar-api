package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3487ee implements InterfaceC3822s {
    @Override // io.appmetrica.analytics.impl.InterfaceC3822s
    public final Map<String, String> a(Map<String, String> map) {
        map.put(AdRevenueConstants.LAYER_KEY, "native");
        return map;
    }
}
