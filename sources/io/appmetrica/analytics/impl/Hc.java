package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Hc extends AbstractC3498f {
    public Hc(Context context, Og og2) {
        super(context, og2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3498f
    public final void b(C3655l6 c3655l6, K4 k13) {
        boolean zBooleanValue = ((Boolean) WrapUtils.getOrDefault(k13.f46125b.f46055b, Boolean.FALSE)).booleanValue();
        InterfaceC3511fc interfaceC3511fcL = Ia.F.l();
        interfaceC3511fcL.a(zBooleanValue);
        interfaceC3511fcL.a(k13.f46125b.f46056c);
        Boolean bool = k13.f46125b.f46067n;
        if (bool != null) {
            Ia.F.b().b(bool.booleanValue());
        }
        this.f47200b.a(c3655l6, k13);
    }
}
