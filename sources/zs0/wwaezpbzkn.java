package zs0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wwaezpbzkn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(MeasureTypeModel measureTypeModel, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(measureTypeModel, wkgbmnqykcVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(final MeasureTypeModel measureTypeModel, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tg.draadjrbmk draadjrbmkVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13, final int i14) {
        int i15;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-2077619195);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(measureTypeModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(134055494);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: zs0.cdpycssgdh
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wwaezpbzkn.gxszxtbevo((ProductCardEvent.ChangeMeasure) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-2077619195, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.common.ProductCardMeasureTypeToggle (ProductCardMeasureTypeToggle.kt:13)");
            }
            MeasureType currentMeasure = measureTypeModel.getCurrentMeasure();
            draadjrbmkVarBtonecajqb.sopmlzcsov(134060023);
            int i18 = i15 & 896;
            boolean z13 = i18 == 256;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: zs0.yadqdtsiqt
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wwaezpbzkn.lqeggnwhkg(draadjrbmkVar);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(134062519);
            boolean z14 = i18 == 256;
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: zs0.iozdgvuglv
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wwaezpbzkn.nufgyqmvbu(draadjrbmkVar);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ts0.nufgyqmvbu.wkgbmnqykc(currentMeasure, wkgbmnqykcVar, iobyxmoadgVar, (tg.iobyxmoadg) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, i15 & 112, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        final tg.draadjrbmk draadjrbmkVar3 = draadjrbmkVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zs0.lmojexxdyd
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wwaezpbzkn.dxjokdxxww(measureTypeModel, wkgbmnqykcVar2, draadjrbmkVar3, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(ProductCardEvent.ChangeMeasure it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ProductCardEvent.ChangeMeasure.f94467zdlpuopuiu);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ProductCardEvent.ChangeMeasure.f94467zdlpuopuiu);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
