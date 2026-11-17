package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class B5 implements yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45494a;

    public B5(List<? extends gg.vdvldrhtss> list) {
        this.f45494a = list;
    }

    @Override // io.appmetrica.analytics.impl.yo
    public final String a() {
        Iterator it = this.f45494a.iterator();
        while (it.hasNext()) {
            String strA = ((yo) ((gg.vdvldrhtss) it.next()).nufgyqmvbu()).a();
            if (strA != null && strA.length() > 0) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.yo
    public final void a(String str) {
        Iterator it = this.f45494a.iterator();
        while (it.hasNext()) {
            ((yo) ((gg.vdvldrhtss) it.next()).nufgyqmvbu()).a(str);
        }
    }
}
