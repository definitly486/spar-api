package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Ea implements InterfaceC3786qc {
    @Override // io.appmetrica.analytics.impl.InterfaceC3786qc
    public final C3882u9 a(E7 e13) {
        C3882u9 c3882u9 = null;
        if ((e13 != null ? e13.f45690b : null) != null && e13.f45691c != null) {
            c3882u9 = new C3882u9();
            c3882u9.f48187b = e13.f45690b.doubleValue();
            c3882u9.f48186a = e13.f45691c.doubleValue();
            Integer num = e13.f45692d;
            if (num != null) {
                c3882u9.f48192g = num.intValue();
            }
            Integer num2 = e13.f45693e;
            if (num2 != null) {
                c3882u9.f48190e = num2.intValue();
            }
            Integer num3 = e13.f45694f;
            if (num3 != null) {
                c3882u9.f48189d = num3.intValue();
            }
            Integer num4 = e13.f45695g;
            if (num4 != null) {
                c3882u9.f48191f = num4.intValue();
            }
            Long l13 = e13.f45696h;
            if (l13 != null) {
                c3882u9.f48188c = TimeUnit.MILLISECONDS.toSeconds(l13.longValue());
            }
            String str = e13.f45697i;
            if (str != null) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "gps")) {
                    c3882u9.f48193h = 1;
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "network")) {
                    c3882u9.f48193h = 2;
                }
            }
            String str2 = e13.f45698j;
            if (str2 != null) {
                c3882u9.f48194i = str2;
            }
        }
        return c3882u9;
    }
}
