package vn0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.BuildConfig;
import opjhrmiecq.uawqvzlxes;
import p0.lereixgezr;
import p0.tzroggbefp;
import ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.InputError;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(czzsidtyhn.rgvfuqvkyq rgvfuqvkyqVar, tzroggbefp tzroggbefpVar, InputError inputError, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        zoijcleaow(rgvfuqvkyqVar, tzroggbefpVar, inputError, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final czzsidtyhn.rgvfuqvkyq rgvfuqvkyqVar, final tzroggbefp email, InputError inputError, final tg.draadjrbmk onEmailChanged, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final InputError inputError2;
        InputError inputError3 = inputError;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(email, "email");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onEmailChanged, "onEmailChanged");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-719121550);
        if ((i14 & Integer.MIN_VALUE) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(rgvfuqvkyqVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 1) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(email) ? 32 : 16;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= (i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(inputError3) : draadjrbmkVarBtonecajqb.lmojexxdyd(inputError3) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 4) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onEmailChanged) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            inputError2 = inputError3;
        } else {
            if (i16 != 0) {
                inputError3 = null;
            }
            InputError inputError4 = inputError3;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-719121550, i15, -1, "ru.myspar.proloyalty.auth.impl.presentation.registration.compose.components.EmailInputBlock (EmailInputBlock.kt:24)");
            }
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(b31.wflxmlrfwp.proloyalty_personal_data_email_error, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-35777330);
            boolean z13 = (i15 & 896) == 256 || ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && draadjrbmkVarBtonecajqb.ulzqkzuiru(inputError4));
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                if (!(inputError4 instanceof InputError.InvalidValue)) {
                    strPpxfxbqfkf = inputError4 instanceof InputError.BackendError ? ((InputError.BackendError) inputError4).getErrorMessage() : "";
                }
                draadjrbmkVarBtonecajqb.jyumaefscl(strPpxfxbqfkf);
                objYadqdtsiqt = strPpxfxbqfkf;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            yggfygwlhe.ppxfxbqfkf(rgvfuqvkyqVar, w31.nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "etEmail", null, null, false, 14, null), email, e0.gxszxtbevo.ppxfxbqfkf(b31.wflxmlrfwp.proloyalty_email_label, draadjrbmkVarBtonecajqb, 0), (String) objYadqdtsiqt, inputError4, new uawqvzlxes(0, null, lereixgezr.f75258zoijcleaow.ppxfxbqfkf(), p0.kcexrzcfyt.f75246zoijcleaow.wkgbmnqykc(), null, null, null, BuildConfig.API_LEVEL, null), onEmailChanged, null, null, draadjrbmkVarBtonecajqb, (i15 & 14) | 1572864 | ((i15 << 3) & 896) | (InputError.f95345zdlpuopuiu << 15) | ((i15 << 9) & 458752) | ((i15 << 12) & 29360128), 384);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            inputError2 = inputError4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: vn0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.ppxfxbqfkf(rgvfuqvkyqVar, email, inputError2, onEmailChanged, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
