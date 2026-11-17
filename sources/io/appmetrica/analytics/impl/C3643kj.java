package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3643kj extends AbstractC3490eh {
    public C3643kj(C3828s5 c3828s5) {
        super(c3828s5);
        c3828s5.b().a();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        Object objRemove;
        for (Map.Entry entry : c3655l6.f47646p.entrySet()) {
            Kk kk2 = this.f47182a.f48050u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                kk2.getClass();
                if (bArr.length == 0) {
                    objRemove = kk2.f46163b.remove(str);
                } else {
                    objRemove = kk2.f46163b.put(str, bArr);
                }
            } else {
                objRemove = kk2.f46163b.remove(str);
            }
            Ok ok2 = kk2.f46162a;
            Map<String, byte[]> map = kk2.f46163b;
            IBinaryDataHelper iBinaryDataHelper = ok2.f46348d;
            String str2 = ok2.f46345a;
            Nk nk2 = ok2.f46347c;
            Lk lkFromModel = ok2.f46346b.fromModel(map);
            nk2.getClass();
            iBinaryDataHelper.insert(str2, MessageNano.toByteArray(lkFromModel));
        }
        return true;
    }
}
