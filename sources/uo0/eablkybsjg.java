package uo0;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import bfopjjpdmp.lqeggnwhkg;
import bt0.vdvldrhtss;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import igdgnonuha.z;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import w0.nufgyqmvbu;
import wo0.btonecajqb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(btonecajqb btonecajqbVar, draadjrbmk draadjrbmkVar, rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        eablkybsjg(btonecajqbVar, draadjrbmkVar, rgvfuqvkyqVar, rgvfuqvkyqVar2, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(final btonecajqb model, final draadjrbmk onProductClicked, final rgvfuqvkyq onHintClicked, final rgvfuqvkyq onProductChanged, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        zdlpuopuiu.btonecajqb(onProductChanged, "onProductChanged");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(2113391778);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHintClicked) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductChanged) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2113391778, i14, -1, "ru.myspar.proloyalty.cart.impl.presentation.compose.recommendations.CartRecommendationsContent (CartRecommendationsContent.kt:24)");
            }
            float f13 = 16;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).zdlpuopuiu(), lqeggnwhkg.ppxfxbqfkf(nufgyqmvbu.lqeggnwhkg(f13))), 0.0f, nufgyqmvbu.lqeggnwhkg(f13), 1, null);
            String strPpxfxbqfkf = model.ppxfxbqfkf();
            String strPpxfxbqfkf2 = dxjokdxxww.ppxfxbqfkf();
            List listIobyxmoadg = model.iobyxmoadg();
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1906237398);
            boolean z13 = (i14 & 112) == 32;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new draadjrbmk() { // from class: uo0.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return eablkybsjg.gxszxtbevo(onProductClicked, (ProductUiModel) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmk draadjrbmkVar3 = (draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1906239176);
            boolean z14 = (i14 & 896) == 256;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new rgvfuqvkyq() { // from class: uo0.zoijcleaow
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.lqeggnwhkg(onHintClicked, (ProductUiModel) obj, (HintUiModel) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1906241709);
            boolean z15 = (i14 & 7168) == 2048;
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = new rgvfuqvkyq() { // from class: uo0.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.nufgyqmvbu(onProductChanged, (ProductUiModel) obj, (ProductCardEvent) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            vdvldrhtss.dxjokdxxww(strPpxfxbqfkf, true, strPpxfxbqfkf2, false, wkgbmnqykcVarRgvfuqvkyq, 0L, 0L, true, 1, listIobyxmoadg, true, true, ydmasvzmpaVarLqeggnwhkg, 0, null, draadjrbmkVar3, rgvfuqvkyqVar, (rgvfuqvkyq) objYadqdtsiqt3, null, null, draadjrbmkVar2, 113249328, 438, 811104);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: uo0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.dxjokdxxww(model, onProductClicked, onHintClicked, onProductChanged, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(draadjrbmk draadjrbmkVar, ProductUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(rgvfuqvkyq rgvfuqvkyqVar, ProductUiModel product, HintUiModel hint) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(hint, "hint");
        rgvfuqvkyqVar.invoke(hint, product);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(rgvfuqvkyq rgvfuqvkyqVar, ProductUiModel item, ProductCardEvent cardEvent) {
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(cardEvent, "cardEvent");
        rgvfuqvkyqVar.invoke(item.getId(), cardEvent);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
