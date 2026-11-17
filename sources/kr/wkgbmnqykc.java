package kr;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;
import tg.draadjrbmk;
import tg.oxmwwwfdhm;
import tg.rgvfuqvkyq;
import yfnezrywwk.jpowsppfya;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final List f60435iobyxmoadg = jyumaefscl.rgvfuqvkyq(new oq.iobyxmoadg("327", "Овощи", "https://dev-myspar.de01.1221systems.ru/local/templates/2019/img/np-sections.png", false, false, null, new ColorsUiModel.Hex(new ColorsUiModel.Hex.Tints("#ddff33", "#5BCD7B", "#420066", "#D0F1D9", "#E8F8EC", null, null, 96, null), new ColorsUiModel.Hex.Tints("#15b742", "#5BCD7B", "#FFFFFF", "#D0F1D9", "#E8F8EC", null, null, 96, null)), 32, null), new oq.iobyxmoadg("328", "Зелень, салаты", "https://dev-myspar.de01.1221systems.ru/local/templates/2019/img/np-sections.png", false, true, null, new ColorsUiModel.Hex(new ColorsUiModel.Hex.Tints("#ddff33", "#5BCD7B", "#420066", "#D0F1D9", "#E8F8EC", null, null, 96, null), new ColorsUiModel.Hex.Tints("#15b742", "#5BCD7B", "#FFFFFF", "#D0F1D9", "#E8F8EC", null, null, 96, null)), 32, null), new oq.iobyxmoadg("329", "Замороженные овощи, ягоды, грибы", "https://dev-myspar.de01.1221systems.ru/local/templates/2019/img/np-sections.png", false, false, null, new ColorsUiModel.Hex(new ColorsUiModel.Hex.Tints("#ddff33", "#5BCD7B", "#420066", "#D0F1D9", "#E8F8EC", null, null, 96, null), new ColorsUiModel.Hex.Tints("#15b742", "#5BCD7B", "#FFFFFF", "#D0F1D9", "#E8F8EC", null, null, 96, null)), 32, null));

    public static final class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f60436zdlpuopuiu = new iobyxmoadg();

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static final class ppxfxbqfkf implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f60437yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f60438zdlpuopuiu;

        public ppxfxbqfkf(draadjrbmk draadjrbmkVar, List list) {
            this.f60438zdlpuopuiu = draadjrbmkVar;
            this.f60437yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f60438zdlpuopuiu.invoke(this.f60437yggfygwlhe.get(i13));
        }
    }

    /* JADX INFO: renamed from: kr.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1209wkgbmnqykc implements oxmwwwfdhm {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f60439yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ List f60440zdlpuopuiu;

        public C1209wkgbmnqykc(List list, draadjrbmk draadjrbmkVar) {
            this.f60440zdlpuopuiu = list;
            this.f60439yggfygwlhe = draadjrbmkVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg eablkybsjgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (draadjrbmkVar.ulzqkzuiru(eablkybsjgVar) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 32 : 16;
            }
            if (!draadjrbmkVar.vdvldrhtss((i15 & 147) != 146, i15 & 1)) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(802480018, i15, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            oq.iobyxmoadg iobyxmoadgVar = (oq.iobyxmoadg) this.f60440zdlpuopuiu.get(i13);
            draadjrbmkVar.sopmlzcsov(-295726094);
            dxjokdxxww.eablkybsjg(iobyxmoadgVar, this.f60439yggfygwlhe, draadjrbmkVar, 0, 0);
            draadjrbmkVar.stevsuqkhv();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ List f60441yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f60442zdlpuopuiu;

        public zoijcleaow(draadjrbmk draadjrbmkVar, List list) {
            this.f60442zdlpuopuiu = draadjrbmkVar;
            this.f60441yggfygwlhe = list;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return iobyxmoadg(((Number) obj).intValue());
        }

        public final Object iobyxmoadg(int i13) {
            return this.f60442zdlpuopuiu.invoke(this.f60441yggfygwlhe.get(i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(List list, draadjrbmk draadjrbmkVar, jpowsppfya LazyRow) {
        zdlpuopuiu.btonecajqb(LazyRow, "$this$LazyRow");
        LazyRow.nufgyqmvbu(list.size(), new zoijcleaow(new draadjrbmk() { // from class: kr.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo((oq.iobyxmoadg) obj);
            }
        }, list), new ppxfxbqfkf(iobyxmoadg.f60436zdlpuopuiu, list), ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(802480018, true, new C1209wkgbmnqykc(list, draadjrbmkVar)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(oq.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return it.getItemId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, List list, draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        wkgbmnqykc(wkgbmnqykcVar, list, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final List categories, final draadjrbmk onCategoryClicked, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        zdlpuopuiu.btonecajqb(categories, "categories");
        zdlpuopuiu.btonecajqb(onCategoryClicked, "onCategoryClicked");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(721834560);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(categories) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onCategoryClicked) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(721834560, i15, -1, "ru.myspar.catalog.impl.product_list.presentation.compose.components.categories.Categories (Categories.kt:23)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null);
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(8));
            float f13 = 16;
            ydmasvzmpa ydmasvzmpaVarDxjokdxxww = esjtqupxsv.dxjokdxxww(w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 10, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(584906935);
            boolean zLmojexxdyd = ((i15 & 896) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(categories);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new draadjrbmk() { // from class: kr.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.eablkybsjg(categories, onCategoryClicked, (jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVarNufgyqmvbu, null, ydmasvzmpaVarDxjokdxxww, false, gxszxtbevoVarRgvfuqvkyq, null, null, false, null, (draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 24960, 490);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: kr.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.lqeggnwhkg(wkgbmnqykcVar5, categories, onCategoryClicked, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
