package mj;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zoijcleaow(String str) {
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cCharAt, UserVerificationMethods.USER_VERIFY_PATTERN) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
