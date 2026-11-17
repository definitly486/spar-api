package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3471dn extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3496en f47130a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3471dn(C3496en c3496en) {
        super(0);
        this.f47130a = c3496en;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        HashMap map = new HashMap();
        C3496en c3496en = this.f47130a;
        String strA = c3496en.f47189a.a();
        if (strA != null) {
        }
        String strA2 = c3496en.f47190b.a();
        if (strA2 != null) {
            map.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, strA2);
        }
        return map;
    }
}
