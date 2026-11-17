package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class J3 implements Yn {
    @Override // io.appmetrica.analytics.impl.Yn, tg.rgvfuqvkyq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<N3> invoke(List<N3> list, N3 n13) {
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC3657l8 enumC3657l8 = ((N3) it.next()).f46250b;
                EnumC3657l8 enumC3657l9 = n13.f46250b;
                if (enumC3657l8 == enumC3657l9) {
                    if (enumC3657l9 != EnumC3657l8.f47648c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((N3) obj).f46250b != EnumC3657l8.f47648c) {
                            arrayList.add(obj);
                        }
                    }
                    return hg.jyumaefscl.jrbgnlbqoe(arrayList, n13);
                }
            }
        }
        return hg.jyumaefscl.jrbgnlbqoe(list, n13);
    }
}
