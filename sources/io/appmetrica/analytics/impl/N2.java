package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes3.dex */
public class N2 implements ExternalAttribution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V9 f46248a;

    public N2(V9 v13) {
        this.f46248a = v13;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f46248a);
    }

    public final String toString() {
        return "ExternalAttribution(type=`" + AbstractC3509fa.a(this.f46248a.f46665a) + "`value=`" + new String(this.f46248a.f46666b, mj.wkgbmnqykc.f67326zoijcleaow) + "`)";
    }
}
