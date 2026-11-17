package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Da implements InterfaceC3585ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3431c9 f45640a = new C3431c9();

    public final C3957x9[] a(byte[] bArr) {
        int i13 = 0;
        if (bArr == null) {
            return new C3957x9[0];
        }
        Map<String, byte[]> model = this.f45640a.toModel(bArr);
        C3957x9[] c3957x9Arr = new C3957x9[model.size()];
        for (Object obj : model.entrySet()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            Map.Entry entry = (Map.Entry) obj;
            C3957x9 c3957x9 = new C3957x9();
            c3957x9.f48415a = ((String) entry.getKey()).getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
            c3957x9.f48416b = (byte[]) entry.getValue();
            c3957x9Arr[i13] = c3957x9;
            i13 = i14;
        }
        return c3957x9Arr;
    }
}
