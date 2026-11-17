package tr;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class draadjrbmk {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn btonecajqb(tg.draadjrbmk draadjrbmkVar, qu.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(it.wkgbmnqykc());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(tg.draadjrbmk draadjrbmkVar, qu.iobyxmoadg combo) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(combo, "combo");
        draadjrbmkVar.invoke(combo);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(List list, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar4, int i14) {
        gxszxtbevo(list, draadjrbmkVar, draadjrbmkVar2, draadjrbmkVar3, draadjrbmkVar4, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void gxszxtbevo(final List comboSetList, final tg.draadjrbmk onClickShowAll, final tg.draadjrbmk onAddToBasket, final tg.draadjrbmk onClickProduct, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickShowAll, "onClickShowAll");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onAddToBasket, "onAddToBasket");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickProduct, "onClickProduct");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1504639463);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(comboSetList) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClickShowAll) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onAddToBasket) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClickProduct) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1504639463, i14, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.ProductComboSetBlock (ProductComboSetBlock.kt:14)");
            }
            if (comboSetList.size() == 1) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1071028193);
                final qu.iobyxmoadg iobyxmoadgVar = (qu.iobyxmoadg) hg.jyumaefscl.opjhrmiecq(comboSetList);
                draadjrbmkVarBtonecajqb.sopmlzcsov(588744313);
                boolean zUlzqkzuiru = ((i14 & 896) == 256) | draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVar);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: tr.lqeggnwhkg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return draadjrbmk.lqeggnwhkg(onAddToBasket, iobyxmoadgVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(588746173);
                boolean zUlzqkzuiru2 = ((i14 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVar);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: tr.nufgyqmvbu
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return draadjrbmk.nufgyqmvbu(onClickShowAll, iobyxmoadgVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iu.kegysxyocb.lqeggnwhkg(null, iobyxmoadgVar, onClickProduct, iobyxmoadgVar2, (tg.iobyxmoadg) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, (i14 >> 3) & 896, 1);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1071321639);
                draadjrbmkVarBtonecajqb.sopmlzcsov(588752607);
                boolean z13 = (i14 & 896) == 256;
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: tr.dxjokdxxww
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return draadjrbmk.dxjokdxxww(onAddToBasket, (qu.iobyxmoadg) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(588754647);
                boolean z14 = (i14 & 112) == 32;
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: tr.btonecajqb
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return draadjrbmk.btonecajqb(onClickShowAll, (qu.iobyxmoadg) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iu.hcddaimhww.eablkybsjg(null, comboSetList, onClickProduct, draadjrbmkVar2, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, ((i14 << 3) & 112) | ((i14 >> 3) & 896), 1);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: tr.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return draadjrbmk.gtknphoqwx(comboSetList, onClickShowAll, onAddToBasket, onClickProduct, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn lqeggnwhkg(tg.draadjrbmk draadjrbmkVar, qu.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(iobyxmoadgVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, qu.iobyxmoadg iobyxmoadgVar) {
        draadjrbmkVar.invoke(iobyxmoadgVar.wkgbmnqykc());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
