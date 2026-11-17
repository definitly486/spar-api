package qh0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wflxmlrfwp {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(yh0.iobyxmoadg.gtknphoqwx gtknphoqwxVar, esjtqupxsv esjtqupxsvVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        ppxfxbqfkf(gtknphoqwxVar, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final yh0.iobyxmoadg.gtknphoqwx item, final esjtqupxsv sectionsCallbacks, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-69145731);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-69145731, i14, -1, "ru.myspar.myspar.impl.presentation.compose.story.StorySection (StorySection.kt:10)");
            }
            yh0.iobyxmoadg.gtknphoqwx.zoijcleaow zoijcleaowVar = item instanceof yh0.iobyxmoadg.gtknphoqwx.zoijcleaow ? (yh0.iobyxmoadg.gtknphoqwx.zoijcleaow) item : null;
            List listLqeggnwhkg = zoijcleaowVar != null ? zoijcleaowVar.lqeggnwhkg() : null;
            draadjrbmkVarBtonecajqb.sopmlzcsov(570660894);
            boolean z13 = (i14 & 112) == 32;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: qh0.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wflxmlrfwp.wkgbmnqykc(sectionsCallbacks, (wh0.eablkybsjg) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            btonecajqb.eablkybsjg(listLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: qh0.draadjrbmk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wflxmlrfwp.eablkybsjg(item, sectionsCallbacks, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(esjtqupxsv esjtqupxsvVar, wh0.eablkybsjg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        esjtqupxsvVar.zdlpuopuiu().invoke(it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
