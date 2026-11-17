package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3715ng implements InterfaceC3615jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3814rg f47773a;

    public C3715ng(C3814rg c3814rg) {
        this.f47773a = c3814rg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3615jg
    public final void a() {
        C3814rg c3814rg = this.f47773a;
        ArrayList arrayList = c3814rg.f47997g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Ag ag2 = (Ag) obj;
            c3814rg.f47993c.getClass();
            String str = ag2 != null ? ag2.f45468a : null;
            if (!(str == null || str.length() == 0)) {
                arrayList2.add(obj);
            }
        }
        c3814rg.a(c3814rg.f47993c.a(hg.jyumaefscl.zfvoamnweg(arrayList2)));
    }
}
