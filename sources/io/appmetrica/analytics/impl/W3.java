package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class W3 extends AbstractC3632k8 {
    @Override // io.appmetrica.analytics.impl.AbstractC3632k8
    public final boolean a(N3 n13, N3 n14) {
        if (!io.a(n14.f46249a)) {
            if (io.a(n13.f46249a)) {
                return false;
            }
            EnumC3657l8 enumC3657l8 = n13.f46250b;
            if (enumC3657l8 == EnumC3657l8.f47648c) {
                if (((Number) this.f47581a.a(enumC3657l8)).intValue() < ((Number) this.f47581a.a(n14.f46250b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f47581a.a(enumC3657l8)).intValue() <= ((Number) this.f47581a.a(n14.f46250b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
