package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Qn {
    public static final Nn a(Throwable th2, U u13, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Dn dnA = th2 != null ? En.a(th2, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Dl((StackTraceElement) it.next()));
            }
        }
        return new Nn(dnA, u13, arrayList, null, null, null, str, bool);
    }
}
