package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Fd implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3993yk f45816a = Ia.j().o();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3870tm[] fromModel(Map<String, ? extends Object> map) {
        C3870tm c3870tm;
        Map<String, C3861td> mapC = this.f45816a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C3861td c3861td = mapC.get(key);
            if (c3861td == null || value == null) {
                c3870tm = null;
            } else {
                c3870tm = new C3870tm();
                c3870tm.f48143a = key;
                c3870tm.f48144b = (byte[]) c3861td.f48123c.fromModel(value);
            }
            if (c3870tm != null) {
                arrayList.add(c3870tm);
            }
        }
        Object[] array = arrayList.toArray(new C3870tm[0]);
        if (array != null) {
            return (C3870tm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C3870tm[] c3870tmArr) {
        Map<String, C3861td> mapC = this.f45816a.c();
        ArrayList arrayList = new ArrayList();
        for (C3870tm c3870tm : c3870tmArr) {
            C3861td c3861td = mapC.get(c3870tm.f48143a);
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = c3861td != null ? gg.cqumvgiudr.iobyxmoadg(c3870tm.f48143a, c3861td.f48123c.toModel(c3870tm.f48144b)) : null;
            if (vdvldrhtssVarIobyxmoadg != null) {
                arrayList.add(vdvldrhtssVarIobyxmoadg);
            }
        }
        return hg.tzroggbefp.kcexrzcfyt(arrayList);
    }
}
