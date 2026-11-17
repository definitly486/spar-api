package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3616jh extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo f47539b;

    public C3616jh(C3828s5 c3828s5) {
        this(c3828s5, c3828s5.t());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        C3828s5 c3828s5 = this.f47182a;
        if (this.f47539b.c()) {
            return false;
        }
        if (!this.f47539b.d()) {
            F9 f13 = c3828s5.f48043n;
            f13.f45800c.b(C3655l6.a(c3655l6, EnumC3934wb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        uo uoVar = this.f47539b;
        synchronized (uoVar) {
            vo voVar = uoVar.f48216a;
            voVar.a(voVar.a().put("first_event_done", true));
        }
        return false;
    }

    public C3616jh(C3828s5 c3828s5, uo uoVar) {
        super(c3828s5);
        this.f47539b = uoVar;
    }
}
