package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: loaded from: classes3.dex */
public final class Om extends Rm {
    @Override // io.appmetrica.analytics.impl.Rm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        U3 u13 = new U3();
        try {
            bArrA = AbstractC3867tj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArrA = new byte[16];
        }
        try {
            bArrA2 = AbstractC3867tj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrA2 = new byte[16];
        }
        return new Zf("clids_info", iBinaryDataHelper, new T8(u13, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), new P3());
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper c(Context context) {
        C3752p3 c3752p3;
        C3880u7 c3880u7A = C3880u7.a(context);
        synchronized (c3880u7A) {
            try {
                if (c3880u7A.f48171i == null) {
                    c3880u7A.f48171i = new C3752p3(c3880u7A.g());
                }
                c3752p3 = c3880u7A.f48171i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3752p3;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper d(Context context) {
        IBinaryDataHelper iBinaryDataHelperG;
        C3880u7 c3880u7A = C3880u7.a(context);
        synchronized (c3880u7A) {
            iBinaryDataHelperG = c3880u7A.g();
        }
        return iBinaryDataHelperG;
    }
}
