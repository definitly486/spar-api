package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class Og implements Ql, InterfaceC3407bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3654l5 f46339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3679m5 f46340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bm f46341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3635kb f46342e;

    public Og(Context context, C3654l5 c3654l5, K4 k13, InterfaceC3853t5 interfaceC3853t5, C3679m5 c3679m5, Hl hl2) {
        this.f46338a = context;
        this.f46339b = c3654l5;
        this.f46340c = c3679m5;
        Bm bmA = hl2.a(context, c3654l5, k13.f46124a);
        this.f46341d = bmA;
        this.f46342e = interfaceC3853t5.a(context, c3654l5, k13.f46125b, bmA);
        hl2.a(c3654l5, this);
    }

    public final C3654l5 a() {
        return this.f46339b;
    }

    public final Context b() {
        return this.f46338a;
    }

    public final void a(A4 a13) {
        this.f46340c.f47695a.add(a13);
    }

    public final void b(A4 a13) {
        this.f46340c.f47695a.remove(a13);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(C3521fm c3521fm) {
        this.f46342e.a(c3521fm);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl2, C3521fm c3521fm) {
        ((C3828s5) this.f46342e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3407bb
    public final void a(K4 k13) {
        this.f46341d.a(k13.f46124a);
        this.f46342e.a(k13.f46125b);
    }

    public Og(Context context, C3654l5 c3654l5, K4 k13, InterfaceC3853t5 interfaceC3853t5) {
        this(context, c3654l5, k13, interfaceC3853t5, new C3679m5(), Hl.a());
    }

    public final void a(C3655l6 c3655l6, K4 k13) {
        if (!R9.f46443c.contains(EnumC3934wb.a(c3655l6.f47634d))) {
            this.f46342e.a(k13.f46125b);
        }
        ((C3828s5) this.f46342e).a(c3655l6);
    }
}
