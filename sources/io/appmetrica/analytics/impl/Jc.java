package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Jc implements InterfaceC3964xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Kc f46095a;

    public Jc(Kc kc3) {
        this.f46095a = kc3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3964xg
    public final void a(Ag ag2) {
        if (ag2 == null) {
            return;
        }
        C3655l6 c3655l6 = new C3655l6("", "", 0);
        c3655l6.setValueBytes(ag2.a());
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6.f47634d = 4097;
        this.f46095a.a(c3655l6);
    }
}
