package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: loaded from: classes3.dex */
public final class Nm extends Rm {
    @Override // io.appmetrica.analytics.impl.Rm
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        A2 a13 = new A2();
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
        return new Zf("auto_inapp_collecting_info_data", iBinaryDataHelper, new T8(a13, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), new C3950x2(new C3528g3()));
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper c(Context context) {
        C3752p3 c3752p3;
        C3880u7 c3880u7A = C3880u7.a(context);
        synchronized (c3880u7A) {
            try {
                if (c3880u7A.f48173k == null) {
                    c3880u7A.f48173k = new C3752p3(c3880u7A.e());
                }
                c3752p3 = c3880u7A.f48173k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3752p3;
    }

    @Override // io.appmetrica.analytics.impl.Rm
    public final IBinaryDataHelper d(Context context) {
        IBinaryDataHelper iBinaryDataHelperE;
        C3880u7 c3880u7A = C3880u7.a(context);
        synchronized (c3880u7A) {
            iBinaryDataHelperE = c3880u7A.e();
        }
        return iBinaryDataHelperE;
    }
}
