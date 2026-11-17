package oa1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import b31.wflxmlrfwp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.rgvfuqvkyq;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.InputError;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dxjokdxxww {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, ma1.nufgyqmvbu nufgyqmvbuVar, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar3, int i14) {
        zoijcleaow(rgvfuqvkyqVar, nufgyqmvbuVar, draadjrbmkVar, draadjrbmkVar2, draadjrbmkVar3, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final rgvfuqvkyq rgvfuqvkyqVar, final ma1.nufgyqmvbu model, final draadjrbmk onFirstNameChanged, final draadjrbmk onLastNameChanged, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        zdlpuopuiu.btonecajqb(rgvfuqvkyqVar, "<this>");
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(onFirstNameChanged, "onFirstNameChanged");
        zdlpuopuiu.btonecajqb(onLastNameChanged, "onLastNameChanged");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(436798626);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(rgvfuqvkyqVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onFirstNameChanged) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onLastNameChanged) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i15 = i14;
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(436798626, i15, -1, "ru.myspar.proloyalty.legacy.presentation.screen.personaldata.compose.components.PersonalDataBlock (PersonalDataBlock.kt:25)");
            }
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_personal_data, draadjrbmkVarBtonecajqb, 0);
            z zVar = z.f44180iobyxmoadg;
            int i16 = z.f44181zoijcleaow;
            w6.btonecajqb(strPpxfxbqfkf, null, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i16).iwizpuwonk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, zVar.ppxfxbqfkf(draadjrbmkVarBtonecajqb, i16).btonecajqb(), draadjrbmkVarBtonecajqb, 0, 0, 65530);
            tzroggbefp tzroggbefpVarEablkybsjg = model.eablkybsjg();
            String strPpxfxbqfkf2 = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_firstname_label, draadjrbmkVarBtonecajqb, 0);
            InputError inputErrorGxszxtbevo = model.gxszxtbevo();
            String strIobyxmoadg = inputErrorGxszxtbevo == null ? null : ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.iobyxmoadg.iobyxmoadg(inputErrorGxszxtbevo, e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_empty_firstname_error, draadjrbmkVarBtonecajqb, 0), e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_personal_data_error_text, draadjrbmkVarBtonecajqb, 0));
            int i17 = (i15 & 14) | 805306368;
            a41.eablkybsjg.wkgbmnqykc(rgvfuqvkyqVar, null, tzroggbefpVarEablkybsjg, strPpxfxbqfkf2, strIobyxmoadg == null ? "" : strIobyxmoadg, null, null, onFirstNameChanged, null, "etFirstName", "etFirstNameError", null, draadjrbmkVarBtonecajqb, i17 | ((i15 << 15) & 29360128), 6, 1201);
            tzroggbefp tzroggbefpVarNufgyqmvbu = model.nufgyqmvbu();
            String strPpxfxbqfkf3 = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_lastname_label, draadjrbmkVarBtonecajqb, 0);
            InputError inputErrorDxjokdxxww = model.dxjokdxxww();
            String strIobyxmoadg2 = inputErrorDxjokdxxww != null ? ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.iobyxmoadg.iobyxmoadg(inputErrorDxjokdxxww, e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_empty_lastname_error, draadjrbmkVarBtonecajqb, 0), e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_personal_data_error_text, draadjrbmkVarBtonecajqb, 0)) : null;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            a41.eablkybsjg.wkgbmnqykc(rgvfuqvkyqVar, null, tzroggbefpVarNufgyqmvbu, strPpxfxbqfkf3, strIobyxmoadg2 == null ? "" : strIobyxmoadg2, null, null, onLastNameChanged, null, "etLastName", "etLastNameError", null, draadjrbmkVarBtonecajqb, i17 | ((i15 << 12) & 29360128), 6, 1201);
            z31.wkgbmnqykc.wkgbmnqykc(model.iobyxmoadg(), false, null, draadjrbmkVar2, 48, 4);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: oa1.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return dxjokdxxww.ppxfxbqfkf(rgvfuqvkyqVar, model, onFirstNameChanged, onLastNameChanged, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
