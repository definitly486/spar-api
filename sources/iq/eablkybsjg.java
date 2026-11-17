package iq;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.ydmasvzmpa;
import gg.wwaezpbzkn;
import hu.vdvldrhtss;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import kq.dxjokdxxww;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(dxjokdxxww dxjokdxxwwVar, draadjrbmk draadjrbmkVar, rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        eablkybsjg(dxjokdxxwwVar, draadjrbmkVar, rgvfuqvkyqVar, rgvfuqvkyqVar2, wkgbmnqykcVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:77:0x010e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:91:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0198  */
    public static final void eablkybsjg(final dxjokdxxww model, final draadjrbmk onProductClicked, final rgvfuqvkyq onHintClicked, final rgvfuqvkyq onProductChanged, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        boolean z13;
        Object objYadqdtsiqt;
        boolean z14;
        Object objYadqdtsiqt2;
        boolean z15;
        Object objYadqdtsiqt3;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(model, "model");
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        zdlpuopuiu.btonecajqb(onProductChanged, "onProductChanged");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1943606652);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductClicked) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHintClicked) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductChanged) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i16 = i14 & 16;
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
                    jyumaefscl.ntlheqmsrt(1943606652, i15, -1, "ru.myspar.cart.impl.presentation.compose.recommendations.CartRecommendationsContent (CartRecommendationsContent.kt:19)");
                }
                List listIobyxmoadg = model.iobyxmoadg();
                ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(130825657);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new draadjrbmk() { // from class: iq.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return eablkybsjg.gxszxtbevo(onProductClicked, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmk draadjrbmkVar2 = (draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(130827435);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new rgvfuqvkyq() { // from class: iq.zoijcleaow
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return eablkybsjg.lqeggnwhkg(onHintClicked, (ProductUiModel) obj, (HintUiModel) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(130829968);
                z15 = (i15 & 7168) == 2048;
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z15 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new rgvfuqvkyq() { // from class: iq.ppxfxbqfkf
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return eablkybsjg.nufgyqmvbu(onProductChanged, (ProductUiModel) obj, (ProductCardEvent) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                vdvldrhtss.dxjokdxxww("", false, "", false, wkgbmnqykcVar3, 0L, 0L, true, 1, listIobyxmoadg, true, true, ydmasvzmpaVarLqeggnwhkg, 0, null, draadjrbmkVar2, rgvfuqvkyqVar, (rgvfuqvkyq) objYadqdtsiqt3, null, null, draadjrbmkVarBtonecajqb, (57344 & i15) | 113249718, 3510, 802912);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: iq.wkgbmnqykc
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.dxjokdxxww(model, onProductClicked, onHintClicked, onProductChanged, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
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
                jyumaefscl.ntlheqmsrt(1943606652, i15, -1, "ru.myspar.cart.impl.presentation.compose.recommendations.CartRecommendationsContent (CartRecommendationsContent.kt:19)");
            }
            List listIobyxmoadg2 = model.iobyxmoadg();
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg2 = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(130825657);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt = new draadjrbmk() { // from class: iq.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return eablkybsjg.gxszxtbevo(onProductClicked, (ProductUiModel) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: iq.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return eablkybsjg.gxszxtbevo(onProductClicked, (ProductUiModel) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmk draadjrbmkVar3 = (draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(130827435);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt2 = new rgvfuqvkyq() { // from class: iq.zoijcleaow
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.lqeggnwhkg(onHintClicked, (ProductUiModel) obj, (HintUiModel) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new rgvfuqvkyq() { // from class: iq.zoijcleaow
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.lqeggnwhkg(onHintClicked, (ProductUiModel) obj, (HintUiModel) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            rgvfuqvkyq rgvfuqvkyqVar2 = (rgvfuqvkyq) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(130829968);
            if ((i15 & 7168) == 2048) {
            }
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15) {
                objYadqdtsiqt3 = new rgvfuqvkyq() { // from class: iq.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.nufgyqmvbu(onProductChanged, (ProductUiModel) obj, (ProductCardEvent) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new rgvfuqvkyq() { // from class: iq.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.nufgyqmvbu(onProductChanged, (ProductUiModel) obj, (ProductCardEvent) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            vdvldrhtss.dxjokdxxww("", false, "", false, wkgbmnqykcVar3, 0L, 0L, true, 1, listIobyxmoadg2, true, true, ydmasvzmpaVarLqeggnwhkg2, 0, null, draadjrbmkVar3, rgvfuqvkyqVar2, (rgvfuqvkyq) objYadqdtsiqt3, null, null, draadjrbmkVarBtonecajqb, (57344 & i15) | 113249718, 3510, 802912);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1943606652, i15, -1, "ru.myspar.cart.impl.presentation.compose.recommendations.CartRecommendationsContent (CartRecommendationsContent.kt:19)");
            }
            List listIobyxmoadg3 = model.iobyxmoadg();
            ydmasvzmpa ydmasvzmpaVarLqeggnwhkg3 = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(130825657);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13) {
                objYadqdtsiqt = new draadjrbmk() { // from class: iq.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return eablkybsjg.gxszxtbevo(onProductClicked, (ProductUiModel) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new draadjrbmk() { // from class: iq.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return eablkybsjg.gxszxtbevo(onProductClicked, (ProductUiModel) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmk draadjrbmkVar4 = (draadjrbmk) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(130827435);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14) {
                objYadqdtsiqt2 = new rgvfuqvkyq() { // from class: iq.zoijcleaow
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.lqeggnwhkg(onHintClicked, (ProductUiModel) obj, (HintUiModel) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new rgvfuqvkyq() { // from class: iq.zoijcleaow
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.lqeggnwhkg(onHintClicked, (ProductUiModel) obj, (HintUiModel) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            rgvfuqvkyq rgvfuqvkyqVar3 = (rgvfuqvkyq) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(130829968);
            if ((i15 & 7168) == 2048) {
            }
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z15) {
                objYadqdtsiqt3 = new rgvfuqvkyq() { // from class: iq.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.nufgyqmvbu(onProductChanged, (ProductUiModel) obj, (ProductCardEvent) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new rgvfuqvkyq() { // from class: iq.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return eablkybsjg.nufgyqmvbu(onProductChanged, (ProductUiModel) obj, (ProductCardEvent) obj2);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            vdvldrhtss.dxjokdxxww("", false, "", false, wkgbmnqykcVar3, 0L, 0L, true, 1, listIobyxmoadg3, true, true, ydmasvzmpaVarLqeggnwhkg3, 0, null, draadjrbmkVar4, rgvfuqvkyqVar3, (rgvfuqvkyq) objYadqdtsiqt3, null, null, draadjrbmkVarBtonecajqb, (57344 & i15) | 113249718, 3510, 802912);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: iq.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.dxjokdxxww(model, onProductClicked, onHintClicked, onProductChanged, wkgbmnqykcVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
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
