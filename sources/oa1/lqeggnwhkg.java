package oa1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import b31.wflxmlrfwp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.rgvfuqvkyq;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import opjhrmiecq.uawqvzlxes;
import p0.esjtqupxsv;
import p0.kcexrzcfyt;
import p0.lereixgezr;
import p0.tzroggbefp;
import ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.InputError;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, ma1.nufgyqmvbu nufgyqmvbuVar, draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        zoijcleaow(rgvfuqvkyqVar, nufgyqmvbuVar, draadjrbmkVar, iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX WARN: Code duplicated, block: B:78:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void zoijcleaow(final rgvfuqvkyq rgvfuqvkyqVar, final ma1.nufgyqmvbu model, final draadjrbmk onValueChange, final tg.iobyxmoadg action, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        InputError inputErrorWkgbmnqykc;
        String strIobyxmoadg;
        String strPpxfxbqfkf;
        String str;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(onValueChange, "onValueChange");
        zdlpuopuiu.btonecajqb(action, "action");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1768425416);
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
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 32 : 16;
        }
        if ((i14 & 2) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onValueChange) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 4) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(action) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 16384 : 8192;
            }
            if ((i15 & 9363) == 9362 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1768425416, i15, -1, "ru.myspar.proloyalty.legacy.presentation.screen.personaldata.compose.components.EmailInput (EmailInput.kt:23)");
                }
                inputErrorWkgbmnqykc = model.wkgbmnqykc();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1409107121);
                if (inputErrorWkgbmnqykc == null) {
                    strIobyxmoadg = null;
                } else {
                    strIobyxmoadg = ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.iobyxmoadg.iobyxmoadg(inputErrorWkgbmnqykc, e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_empty_email_error, draadjrbmkVarBtonecajqb, 0), e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_personal_data_email_error, draadjrbmkVarBtonecajqb, 0));
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1409106660);
                if (strIobyxmoadg == null) {
                    strIobyxmoadg = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_unconfirmed_email_error, draadjrbmkVarBtonecajqb, 0);
                    if (model.gtknphoqwx()) {
                        strIobyxmoadg = null;
                    }
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_action_confirm_email, draadjrbmkVarBtonecajqb, 0);
                if (model.gtknphoqwx()) {
                    str = null;
                } else {
                    str = strPpxfxbqfkf;
                }
                tzroggbefp tzroggbefpVarPpxfxbqfkf = model.ppxfxbqfkf();
                String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_email_label, draadjrbmkVarBtonecajqb, 0);
                if (strIobyxmoadg == null) {
                    strIobyxmoadg = "";
                }
                int i17 = (i15 & 14) | 805306368 | ((i15 >> 9) & 112);
                int i18 = i15 << 15;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                a41.eablkybsjg.wkgbmnqykc(rgvfuqvkyqVar, wkgbmnqykcVar3, tzroggbefpVarPpxfxbqfkf, strPpxfxbqfkf2, strIobyxmoadg, str, new uawqvzlxes(esjtqupxsv.f75216zoijcleaow.zoijcleaow(), null, lereixgezr.f75258zoijcleaow.ppxfxbqfkf(), kcexrzcfyt.f75246zoijcleaow.zoijcleaow(), null, null, null, 114, null), onValueChange, action, "etEmail", "etEmailError", "etEmailAction", draadjrbmkVar2, i17 | (29360128 & i18) | (i18 & 234881024), 54, 0);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            }
            a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: oa1.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return lqeggnwhkg.ppxfxbqfkf(rgvfuqvkyqVar, model, onValueChange, action, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 24576;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 9363) == 9362) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1768425416, i15, -1, "ru.myspar.proloyalty.legacy.presentation.screen.personaldata.compose.components.EmailInput (EmailInput.kt:23)");
            }
            inputErrorWkgbmnqykc = model.wkgbmnqykc();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1409107121);
            if (inputErrorWkgbmnqykc == null) {
                strIobyxmoadg = null;
            } else {
                strIobyxmoadg = ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.iobyxmoadg.iobyxmoadg(inputErrorWkgbmnqykc, e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_empty_email_error, draadjrbmkVarBtonecajqb, 0), e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_personal_data_email_error, draadjrbmkVarBtonecajqb, 0));
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1409106660);
            if (strIobyxmoadg == null) {
                strIobyxmoadg = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_unconfirmed_email_error, draadjrbmkVarBtonecajqb, 0);
                if (model.gtknphoqwx()) {
                    strIobyxmoadg = null;
                }
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_action_confirm_email, draadjrbmkVarBtonecajqb, 0);
            if (model.gtknphoqwx()) {
                str = strPpxfxbqfkf;
            } else {
                str = null;
            }
            tzroggbefp tzroggbefpVarPpxfxbqfkf2 = model.ppxfxbqfkf();
            String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_email_label, draadjrbmkVarBtonecajqb, 0);
            if (strIobyxmoadg == null) {
                strIobyxmoadg = "";
            }
            int i19 = (i15 & 14) | 805306368 | ((i15 >> 9) & 112);
            int i110 = i15 << 15;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            a41.eablkybsjg.wkgbmnqykc(rgvfuqvkyqVar, wkgbmnqykcVar3, tzroggbefpVarPpxfxbqfkf2, strPpxfxbqfkf3, strIobyxmoadg, str, new uawqvzlxes(esjtqupxsv.f75216zoijcleaow.zoijcleaow(), null, lereixgezr.f75258zoijcleaow.ppxfxbqfkf(), kcexrzcfyt.f75246zoijcleaow.zoijcleaow(), null, null, null, 114, null), onValueChange, action, "etEmail", "etEmailError", "etEmailAction", draadjrbmkVar2, i19 | (29360128 & i110) | (i110 & 234881024), 54, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1768425416, i15, -1, "ru.myspar.proloyalty.legacy.presentation.screen.personaldata.compose.components.EmailInput (EmailInput.kt:23)");
            }
            inputErrorWkgbmnqykc = model.wkgbmnqykc();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1409107121);
            if (inputErrorWkgbmnqykc == null) {
                strIobyxmoadg = null;
            } else {
                strIobyxmoadg = ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.iobyxmoadg.iobyxmoadg(inputErrorWkgbmnqykc, e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_empty_email_error, draadjrbmkVarBtonecajqb, 0), e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_personal_data_email_error, draadjrbmkVarBtonecajqb, 0));
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1409106660);
            if (strIobyxmoadg == null) {
                strIobyxmoadg = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_unconfirmed_email_error, draadjrbmkVarBtonecajqb, 0);
                if (model.gtknphoqwx()) {
                    strIobyxmoadg = null;
                }
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_action_confirm_email, draadjrbmkVarBtonecajqb, 0);
            if (model.gtknphoqwx()) {
                str = strPpxfxbqfkf;
            } else {
                str = null;
            }
            tzroggbefp tzroggbefpVarPpxfxbqfkf3 = model.ppxfxbqfkf();
            String strPpxfxbqfkf4 = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_email_label, draadjrbmkVarBtonecajqb, 0);
            if (strIobyxmoadg == null) {
                strIobyxmoadg = "";
            }
            int i111 = (i15 & 14) | 805306368 | ((i15 >> 9) & 112);
            int i112 = i15 << 15;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            a41.eablkybsjg.wkgbmnqykc(rgvfuqvkyqVar, wkgbmnqykcVar3, tzroggbefpVarPpxfxbqfkf3, strPpxfxbqfkf4, strIobyxmoadg, str, new uawqvzlxes(esjtqupxsv.f75216zoijcleaow.zoijcleaow(), null, lereixgezr.f75258zoijcleaow.ppxfxbqfkf(), kcexrzcfyt.f75246zoijcleaow.zoijcleaow(), null, null, null, 114, null), onValueChange, action, "etEmail", "etEmailError", "etEmailAction", draadjrbmkVar2, i111 | (29360128 & i112) | (i112 & 234881024), 54, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: oa1.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return lqeggnwhkg.ppxfxbqfkf(rgvfuqvkyqVar, model, onValueChange, action, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
