package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3712nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f47755a = new LinkedHashSet();

    public final synchronized Set a() {
        ArrayList arrayList;
        try {
            LinkedHashSet linkedHashSet = this.f47755a;
            ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(linkedHashSet, 10));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC3687md) it.next()).a());
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return hg.jyumaefscl.r(arrayList);
    }

    public final synchronized void a(InterfaceC3687md... interfaceC3687mdArr) {
        hg.jyumaefscl.cdpycssgdh(this.f47755a, interfaceC3687mdArr);
    }
}
