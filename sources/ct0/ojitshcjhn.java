package ct0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ojitshcjhn {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, nt0.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(wkgbmnqykcVar, iobyxmoadgVar, iobyxmoadgVar2, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final nt0.iobyxmoadg uiModel, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        tg.iobyxmoadg iobyxmoadgVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        tg.iobyxmoadg iobyxmoadgVar3;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uiModel, "uiModel");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1688019414);
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(uiModel) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                iobyxmoadgVar2 = iobyxmoadgVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-1110731444);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ct0.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return ojitshcjhn.wkgbmnqykc();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt;
                } else {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1688019414, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.ProductListPromoBannerBlock (ProductListPromoBannerBlock.kt:24)");
                }
                float f13 = 4;
                h31.eablkybsjg.ppxfxbqfkf(uiModel.zoijcleaow(), uiModel.iobyxmoadg(), w0.dxjokdxxww.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(367), w0.nufgyqmvbu.lqeggnwhkg(86)), true, androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(f13), w0.nufgyqmvbu.lqeggnwhkg(f13)), iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, null, draadjrbmkVarBtonecajqb, ((i15 << 9) & 458752) | 1576320, 384);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                final tg.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar3;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ct0.agtfadlqog
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ojitshcjhn.eablkybsjg(wkgbmnqykcVar4, uiModel, iobyxmoadgVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i15 & 147) == 146) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1110731444);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ct0.wflxmlrfwp
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt;
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1688019414, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.ProductListPromoBannerBlock (ProductListPromoBannerBlock.kt:24)");
            }
            float f14 = 4;
            h31.eablkybsjg.ppxfxbqfkf(uiModel.zoijcleaow(), uiModel.iobyxmoadg(), w0.dxjokdxxww.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(367), w0.nufgyqmvbu.lqeggnwhkg(86)), true, androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(f14), w0.nufgyqmvbu.lqeggnwhkg(f14)), iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f14), 0.0f, null, draadjrbmkVarBtonecajqb, ((i15 << 9) & 458752) | 1576320, 384);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1110731444);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ct0.wflxmlrfwp
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ojitshcjhn.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt;
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1688019414, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.list.vertical.ProductListPromoBannerBlock (ProductListPromoBannerBlock.kt:24)");
            }
            float f15 = 4;
            h31.eablkybsjg.ppxfxbqfkf(uiModel.zoijcleaow(), uiModel.iobyxmoadg(), w0.dxjokdxxww.iobyxmoadg(w0.nufgyqmvbu.lqeggnwhkg(367), w0.nufgyqmvbu.lqeggnwhkg(86)), true, androidx.compose.foundation.layout.esjtqupxsv.ojitshcjhn(wkgbmnqykcVar3, w0.nufgyqmvbu.lqeggnwhkg(f15), w0.nufgyqmvbu.lqeggnwhkg(f15)), iobyxmoadgVar3, w0.nufgyqmvbu.lqeggnwhkg(f15), 0.0f, null, draadjrbmkVarBtonecajqb, ((i15 << 9) & 458752) | 1576320, 384);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
            final tg.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar3;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ct0.agtfadlqog
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ojitshcjhn.eablkybsjg(wkgbmnqykcVar5, uiModel, iobyxmoadgVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wkgbmnqykc() {
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
