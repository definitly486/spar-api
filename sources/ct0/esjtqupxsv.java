package ct0;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import igdgnonuha.z;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes5.dex */
public abstract class esjtqupxsv {

    static final class iobyxmoadg implements tg.oxmwwwfdhm {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.wkgbmnqykc f25727zdlpuopuiu;

        iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar) {
            this.f25727zdlpuopuiu = wkgbmnqykcVar;
        }

        @Override // tg.oxmwwwfdhm
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            iobyxmoadg((yfnezrywwk.eablkybsjg) obj, ((Number) obj2).intValue(), (androidx.compose.runtime.draadjrbmk) obj3, ((Number) obj4).intValue());
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(yfnezrywwk.eablkybsjg items, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "$this$items");
            if ((i14 & 129) == 128 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1366195469, i14, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.SkeletonShimmerList.<anonymous>.<anonymous>.<anonymous> (ProductListRecommendationBlock.kt:119)");
            }
            esjtqupxsv.vdvldrhtss(this.f25727zdlpuopuiu, draadjrbmkVar, 0, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn agtfadlqog(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ot0.iobyxmoadg iobyxmoadgVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.draadjrbmk draadjrbmkVar, tg.vdvldrhtss vdvldrhtssVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        btonecajqb(wkgbmnqykcVar, iobyxmoadgVar, rgvfuqvkyqVar, draadjrbmkVar, vdvldrhtssVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void btonecajqb(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final ot0.iobyxmoadg uiModel, final tg.rgvfuqvkyq onProductChanged, final tg.draadjrbmk onProductClick, final tg.vdvldrhtss onHintClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        String feedTitle;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiModel, "uiModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductChanged, "onProductChanged");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductClick, "onProductClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHintClick, "onHintClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(921213884);
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
            i15 |= (i13 & 64) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(uiModel) : draadjrbmkVarBtonecajqb.lmojexxdyd(uiModel) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductChanged) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHintClick) ? 16384 : 8192;
        }
        if ((i15 & 9363) == 9362 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(921213884, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.ProductListRecommendationBlock (ProductListRecommendationBlock.kt:46)");
            }
            Context context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            ColorsUiModel.Hex hexEablkybsjg = uiModel.eablkybsjg();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-722148084);
            boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(hexEablkybsjg);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                ColorsUiModel.Hex hexEablkybsjg2 = uiModel.eablkybsjg();
                objYadqdtsiqt = hexEablkybsjg2 != null ? hexEablkybsjg2.ppxfxbqfkf(p41.ppxfxbqfkf.eablkybsjg(context)) : null;
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            ColorsUiModel.Hex.Tints tints = (ColorsUiModel.Hex.Tints) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(cqumvgiudr(wkgbmnqykcVar3, tints), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(16), 1, null);
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarRgvfuqvkyq);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            if (uiModel instanceof ot0.iobyxmoadg.C1620iobyxmoadg) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(356610505);
                ot0.iobyxmoadg.C1620iobyxmoadg c1620iobyxmoadg = (ot0.iobyxmoadg.C1620iobyxmoadg) uiModel;
                draadjrbmkVarBtonecajqb.sopmlzcsov(427145761);
                boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(c1620iobyxmoadg);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = Boolean.valueOf(c1620iobyxmoadg.zoijcleaow().size() > 3);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                boolean zBooleanValue = ((Boolean) objYadqdtsiqt2).booleanValue();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                String strPpxfxbqfkf = c1620iobyxmoadg.ppxfxbqfkf();
                boolean z13 = !mj.kcexrzcfyt.zfvoamnweg(c1620iobyxmoadg.ppxfxbqfkf());
                h.oipsdeybqn oipsdeybqnVarIobyxmoadg = (tints == null || (feedTitle = tints.getFeedTitle()) == null) ? null : j41.iobyxmoadg.iobyxmoadg(feedTitle);
                draadjrbmkVarBtonecajqb.sopmlzcsov(427154904);
                long jDxjokdxxww = oipsdeybqnVarIobyxmoadg == null ? z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).dxjokdxxww() : oipsdeybqnVarIobyxmoadg.iwizpuwonk();
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                String strPpxfxbqfkf2 = q11.dxjokdxxww.ppxfxbqfkf();
                List listZoijcleaow = c1620iobyxmoadg.zoijcleaow();
                draadjrbmkVarBtonecajqb.sopmlzcsov(427169681);
                boolean z14 = (i15 & 7168) == 2048;
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ct0.vdvldrhtss
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return esjtqupxsv.gtknphoqwx(onProductClick, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(427174762);
                boolean z15 = ((i15 & 112) == 32 || ((i15 & 64) != 0 && draadjrbmkVarBtonecajqb.lmojexxdyd(uiModel))) | ((57344 & i15) == 16384);
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.rgvfuqvkyq() { // from class: ct0.oxmwwwfdhm
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return esjtqupxsv.draadjrbmk(uiModel, onHintClick, (ProductUiModel) obj, (HintUiModel) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(427171729);
                boolean z16 = (i15 & 896) == 256;
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z16 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.rgvfuqvkyq() { // from class: ct0.kcexrzcfyt
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return esjtqupxsv.wflxmlrfwp(onProductChanged, (ProductUiModel) obj, (ProductCardEvent) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                bt0.vdvldrhtss.dxjokdxxww(strPpxfxbqfkf, z13, strPpxfxbqfkf2, false, null, jDxjokdxxww, 0L, true, 2, listZoijcleaow, zBooleanValue, false, null, 0, null, draadjrbmkVar3, rgvfuqvkyqVar, (tg.rgvfuqvkyq) objYadqdtsiqt5, null, null, draadjrbmkVar2, 113249280, 48, 815184);
                draadjrbmkVar2.stevsuqkhv();
            } else {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                if (!(uiModel instanceof ot0.iobyxmoadg.zoijcleaow)) {
                    draadjrbmkVar2.sopmlzcsov(427143165);
                    draadjrbmkVar2.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar2.sopmlzcsov(427184292);
                ojitshcjhn(draadjrbmkVar2, 0);
                draadjrbmkVar2.stevsuqkhv();
            }
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ct0.zdlpuopuiu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.agtfadlqog(wkgbmnqykcVar3, uiModel, onProductChanged, onProductClick, onHintClick, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final androidx.compose.ui.wkgbmnqykc cqumvgiudr(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, ColorsUiModel.Hex.Tints tints) {
        String feedBackground;
        h.oipsdeybqn oipsdeybqnVarIobyxmoadg;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc;
        return (tints == null || (feedBackground = tints.getFeedBackground()) == null || (oipsdeybqnVarIobyxmoadg = j41.iobyxmoadg.iobyxmoadg(feedBackground)) == null || (wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(wkgbmnqykcVar, oipsdeybqnVarIobyxmoadg.iwizpuwonk(), null, 2, null)) == null) ? wkgbmnqykcVar : wkgbmnqykcVarWkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(ot0.iobyxmoadg iobyxmoadgVar, tg.vdvldrhtss vdvldrhtssVar, ProductUiModel product, HintUiModel hint) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        vdvldrhtssVar.invoke(hint, product, new AnalyticsLocation.ItemFeed(null, ((ot0.iobyxmoadg.C1620iobyxmoadg) iobyxmoadgVar).ppxfxbqfkf(), 1, null));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final bfopjjpdmp.gxszxtbevo esjtqupxsv() {
        return bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(tg.draadjrbmk draadjrbmkVar, ProductUiModel it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(it);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn jyumaefscl(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2, float f13, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i16) {
        kcexrzcfyt(wkgbmnqykcVar, i13, wkgbmnqykcVar2, f13, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x010c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0117  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    private static final void kcexrzcfyt(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2, final float f13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        int i17;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6;
        boolean z13;
        boolean z14;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-55119585);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            wkgbmnqykcVar3 = wkgbmnqykcVar;
        } else if ((i14 & 6) == 0) {
            wkgbmnqykcVar3 = wkgbmnqykcVar;
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar3) ? 4 : 2) | i14;
        } else {
            wkgbmnqykcVar3 = wkgbmnqykcVar;
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 == 0) {
            if ((i14 & 384) == 0) {
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar4) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 8) != 0) {
                i16 |= 3072;
            } else if ((i14 & 3072) == 0) {
                if (draadjrbmkVarBtonecajqb.zoijcleaow(f13)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i16 |= i17;
            }
            if ((i16 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i18 != 0) {
                    wkgbmnqykcVar5 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar5 = wkgbmnqykcVar3;
                }
                if (i19 != 0) {
                    wkgbmnqykcVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar6 = wkgbmnqykcVar4;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-55119585, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.SkeletonShimmerList (ProductListRecommendationBlock.kt:110)");
                }
                czzsidtyhn.ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = androidx.compose.foundation.layout.esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
                czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(f13);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1831130975);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i16 & 896) == 256);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ct0.jyumaefscl
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return esjtqupxsv.zdlpuopuiu(i13, wkgbmnqykcVar6, (yfnezrywwk.jpowsppfya) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar6;
                yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar5, null, ydmasvzmpaVarLqeggnwhkg, false, gxszxtbevoVarRgvfuqvkyq, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i16 & 14) | 384, 490);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar4 = wkgbmnqykcVar7;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar5 = wkgbmnqykcVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar8 = wkgbmnqykcVar5;
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar9 = wkgbmnqykcVar4;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ct0.iwizpuwonk
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return esjtqupxsv.jyumaefscl(wkgbmnqykcVar8, i13, wkgbmnqykcVar9, f13, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 |= 384;
        wkgbmnqykcVar4 = wkgbmnqykcVar2;
        if ((i15 & 8) != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            if (draadjrbmkVarBtonecajqb.zoijcleaow(f13)) {
                i17 = 2048;
            } else {
                i17 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i16 |= i17;
        }
        if ((i16 & 1171) == 1170) {
            if (i18 != 0) {
                wkgbmnqykcVar5 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar5 = wkgbmnqykcVar3;
            }
            if (i19 != 0) {
                wkgbmnqykcVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar6 = wkgbmnqykcVar4;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-55119585, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.SkeletonShimmerList (ProductListRecommendationBlock.kt:110)");
            }
            czzsidtyhn.ydmasvzmpa ydmasvzmpaVarLqeggnwhkg2 = androidx.compose.foundation.layout.esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq2 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(f13);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1831130975);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((i16 & 896) == 256);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ct0.jyumaefscl
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return esjtqupxsv.zdlpuopuiu(i13, wkgbmnqykcVar6, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ct0.jyumaefscl
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return esjtqupxsv.zdlpuopuiu(i13, wkgbmnqykcVar6, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar10 = wkgbmnqykcVar6;
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar5, null, ydmasvzmpaVarLqeggnwhkg2, false, gxszxtbevoVarRgvfuqvkyq2, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i16 & 14) | 384, 490);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar10;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar5 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar5 = wkgbmnqykcVar3;
            }
            if (i19 != 0) {
                wkgbmnqykcVar6 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar6 = wkgbmnqykcVar4;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-55119585, i16, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.SkeletonShimmerList (ProductListRecommendationBlock.kt:110)");
            }
            czzsidtyhn.ydmasvzmpa ydmasvzmpaVarLqeggnwhkg3 = androidx.compose.foundation.layout.esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            czzsidtyhn.eablkybsjg.gxszxtbevo gxszxtbevoVarRgvfuqvkyq3 = czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(f13);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1831130975);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((i16 & 896) == 256);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ct0.jyumaefscl
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return esjtqupxsv.zdlpuopuiu(i13, wkgbmnqykcVar6, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ct0.jyumaefscl
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return esjtqupxsv.zdlpuopuiu(i13, wkgbmnqykcVar6, (yfnezrywwk.jpowsppfya) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar11 = wkgbmnqykcVar6;
            yfnezrywwk.wkgbmnqykc.eablkybsjg(wkgbmnqykcVar5, null, ydmasvzmpaVarLqeggnwhkg3, false, gxszxtbevoVarRgvfuqvkyq3, null, null, false, null, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i16 & 14) | 384, 490);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar4 = wkgbmnqykcVar11;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar12 = wkgbmnqykcVar5;
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar13 = wkgbmnqykcVar4;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ct0.iwizpuwonk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.jyumaefscl(wkgbmnqykcVar12, i13, wkgbmnqykcVar13, f13, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ojitshcjhn(androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1796905795);
        if (i13 == 0 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1796905795, i13, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.Shimmer (ProductListRecommendationBlock.kt:87)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null);
            x.zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            float f13 = 16;
            vdvldrhtss(androidx.compose.foundation.layout.cdpycssgdh.kcexrzcfyt(androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 0.0f, 0.0f, 14, null), w0.nufgyqmvbu.lqeggnwhkg(224), w0.nufgyqmvbu.lqeggnwhkg(24)), draadjrbmkVarBtonecajqb, 6, 0);
            t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
            kcexrzcfyt(androidx.compose.foundation.layout.cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), 5, androidx.compose.foundation.layout.cdpycssgdh.kcexrzcfyt(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(130), w0.nufgyqmvbu.lqeggnwhkg(178)), w0.nufgyqmvbu.lqeggnwhkg(8), draadjrbmkVarBtonecajqb, 3510, 0);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ct0.yggfygwlhe
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.rgvfuqvkyq(i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        vdvldrhtss(wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        ojitshcjhn(draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdvldrhtss(final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-815339047);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 3) == 2 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-815339047, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.SkeletonShimmer (ProductListRecommendationBlock.kt:125)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = s31.draadjrbmk.ppxfxbqfkf(wkgbmnqykcVar, null, 1, null);
            x.zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarPpxfxbqfkf);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            s31.lqeggnwhkg.zoijcleaow(esjtqupxsv(), androidx.compose.foundation.layout.cdpycssgdh.gxszxtbevo(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null), 0L, draadjrbmkVarBtonecajqb, 48, 4);
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ct0.cqumvgiudr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.oxmwwwfdhm(wkgbmnqykcVar, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(tg.rgvfuqvkyq rgvfuqvkyqVar, ProductUiModel product, ProductCardEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        rgvfuqvkyqVar.invoke(product, event);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object yggfygwlhe(int i13) {
        return Integer.valueOf(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn zdlpuopuiu(int i13, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, yfnezrywwk.jpowsppfya LazyRow) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(LazyRow, "$this$LazyRow");
        yfnezrywwk.jpowsppfya.eablkybsjg(LazyRow, i13, new tg.draadjrbmk() { // from class: ct0.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return esjtqupxsv.yggfygwlhe(((Integer) obj).intValue());
            }
        }, null, ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-1366195469, true, new iobyxmoadg(wkgbmnqykcVar)), 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
