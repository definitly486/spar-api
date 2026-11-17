package io.appmetrica.analytics.remotepermissions.impl;

import hg.ikoacuggdj;
import hg.jyumaefscl;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import mj.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f fromModel(a aVar) {
        f fVar = new f();
        Set set = aVar.f48902a;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(wkgbmnqykc.f67326zoijcleaow));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.f48910a = (byte[][]) array;
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a toModel(f fVar) {
        Set setEablkybsjg;
        byte[][] bArr = fVar.f48910a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, wkgbmnqykc.f67326zoijcleaow));
            }
            setEablkybsjg = jyumaefscl.r(arrayList);
            if (setEablkybsjg == null) {
                setEablkybsjg = ikoacuggdj.eablkybsjg();
            }
        } else {
            setEablkybsjg = ikoacuggdj.eablkybsjg();
        }
        return new a(setEablkybsjg);
    }
}
