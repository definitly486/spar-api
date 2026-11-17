package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oo implements po {
    @Override // io.appmetrica.analytics.impl.po
    public final no a(List<no> list) {
        LinkedList linkedList = new LinkedList();
        boolean z13 = true;
        for (no noVar : list) {
            if (!noVar.f47784a) {
                linkedList.add(noVar.f47785b);
                z13 = false;
            }
        }
        return z13 ? new no(this, true, "") : new no(this, false, TextUtils.join(", ", linkedList));
    }
}
