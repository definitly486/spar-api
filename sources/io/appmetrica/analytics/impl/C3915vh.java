package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3915vh extends AbstractC3581i6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3828s5 f48243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3890uh f48244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y3 f48245d;

    public C3915vh(C3828s5 c3828s5, InterfaceC3890uh interfaceC3890uh) {
        this(c3828s5, interfaceC3890uh, new Y3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC3581i6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C3965xh load(C3556h6 c3556h6) {
        C3965xh c3965xh = (C3965xh) super.load(c3556h6);
        c3965xh.f48441m = ((C3840sh) c3556h6.componentArguments).f48062a;
        c3965xh.f48446r = this.f48243b.f48049t.a();
        c3965xh.f48451w = this.f48243b.f48046q.a();
        C3840sh c3840sh = (C3840sh) c3556h6.componentArguments;
        c3965xh.f48432d = c3840sh.f48063b;
        c3965xh.f48433e = c3840sh.f48064c;
        c3965xh.f48434f = c3840sh.f48065d;
        c3965xh.f48437i = c3840sh.f48066e;
        c3965xh.f48435g = c3840sh.f48067f;
        c3965xh.f48436h = c3840sh.f48068g;
        Boolean boolValueOf = Boolean.valueOf(c3840sh.f48069h);
        InterfaceC3890uh interfaceC3890uh = this.f48244c;
        c3965xh.f48438j = boolValueOf;
        c3965xh.f48439k = interfaceC3890uh;
        C3840sh c3840sh2 = (C3840sh) c3556h6.componentArguments;
        c3965xh.f48450v = c3840sh2.f48071j;
        C3521fm c3521fm = c3556h6.f47372a;
        G4 g13 = c3521fm.f47241n;
        c3965xh.f48442n = g13.f45837a;
        Le le2 = c3521fm.f47246s;
        if (le2 != null) {
            c3965xh.f48447s = le2.f46179a;
            c3965xh.f48448t = le2.f46180b;
        }
        c3965xh.f48443o = g13.f45838b;
        c3965xh.f48445q = c3521fm.f47232e;
        c3965xh.f48444p = c3521fm.f47238k;
        Y3 y13 = this.f48245d;
        Map<String, String> map = c3840sh2.f48070i;
        V3 v3E = Ia.F.e();
        y13.getClass();
        c3965xh.f48449u = Y3.a(map, c3521fm, v3E);
        return c3965xh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C3965xh(this.f48243b);
    }

    public C3915vh(C3828s5 c3828s5, InterfaceC3890uh interfaceC3890uh, Y3 y13) {
        super(c3828s5.getContext(), c3828s5.b().c());
        this.f48243b = c3828s5;
        this.f48244c = interfaceC3890uh;
        this.f48245d = y13;
    }

    public final C3965xh a() {
        return new C3965xh(this.f48243b);
    }
}
