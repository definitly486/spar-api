package y31;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jyumaefscl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ppxfxbqfkf(String str, String str2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(str, str2, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void zoijcleaow(final String label, final String str, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(label, "label");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1363137380);
        if ((i13 & 6) == 0) {
            i14 = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(label) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(str) ? 32 : 16;
        }
        int i15 = i14;
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1363137380, i15, -1, "ru.myspar.proloyalty.core.ui.compose.components.text_fields.MySparTextFieldLabel (MySparTextFieldLabel.kt:9)");
            }
            if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
                wkgbmnqykcVarOjitshcjhn = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, str + "_hint", null, label, false, 10, null);
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(label, wkgbmnqykcVarOjitshcjhn, 0L, 0L, null, null, z.f44180iobyxmoadg.ppxfxbqfkf(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).wkgbmnqykc().btonecajqb(), 0L, null, null, 0L, 0, false, 1, 0, null, null, draadjrbmkVar2, i15 & 14, 3072, 122812);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: y31.yggfygwlhe
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return jyumaefscl.ppxfxbqfkf(label, str, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
