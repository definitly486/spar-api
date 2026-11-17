package me1;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.kcexrzcfyt;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nufgyqmvbu {

    static final class iobyxmoadg implements kcexrzcfyt {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f66886zdlpuopuiu;

        iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
            this.f66886zdlpuopuiu = rgvfuqvkyqVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, m91.nufgyqmvbu nufgyqmvbuVar, int i13) {
            rgvfuqvkyqVar.invoke(nufgyqmvbuVar, Integer.valueOf(i13));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.kcexrzcfyt
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            zoijcleaow((yfnezrywwk.eablkybsjg) obj, (m91.nufgyqmvbu) obj2, ((Number) obj3).intValue(), (draadjrbmk) obj4, ((Number) obj5).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(yfnezrywwk.eablkybsjg EndlessLazyRow, final m91.nufgyqmvbu uiModel, final int i13, draadjrbmk draadjrbmkVar, int i14) {
            int i15;
            zdlpuopuiu.btonecajqb(EndlessLazyRow, "$this$EndlessLazyRow");
            zdlpuopuiu.btonecajqb(uiModel, "uiModel");
            if ((i14 & 48) == 0) {
                i15 = ((i14 & 64) == 0 ? draadjrbmkVar.ulzqkzuiru(uiModel) : draadjrbmkVar.lmojexxdyd(uiModel) ? 32 : 16) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 384) == 0) {
                i15 |= draadjrbmkVar.ppxfxbqfkf(i13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i15 & 1169) == 1168 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(16645623, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.features.FeatureContent.<anonymous> (FeatureContent.kt:38)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "ivButtonImage", Integer.valueOf(i13), null, false, 12, null);
            draadjrbmkVar.sopmlzcsov(-1210979868);
            int i16 = i15 & 112;
            boolean zUlzqkzuiru = (i16 == 32 || ((i15 & 64) != 0 && draadjrbmkVar.lmojexxdyd(uiModel))) | draadjrbmkVar.ulzqkzuiru(this.f66886zdlpuopuiu) | ((i15 & 896) == 256);
            final rgvfuqvkyq rgvfuqvkyqVar = this.f66886zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: me1.lqeggnwhkg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.iobyxmoadg.ppxfxbqfkf(rgvfuqvkyqVar, uiModel, i13);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            wkgbmnqykc.wkgbmnqykc(wkgbmnqykcVarOjitshcjhn, uiModel, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, (m91.nufgyqmvbu.f66617istkbnxepw << 3) | i16, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, List list, rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(wkgbmnqykcVar, list, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final List model, rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        rgvfuqvkyq rgvfuqvkyqVar2;
        int i16;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        rgvfuqvkyq rgvfuqvkyqVar3;
        final rgvfuqvkyq rgvfuqvkyqVar4;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(943747262);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                rgvfuqvkyqVar2 = rgvfuqvkyqVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar2) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i16 = i15;
            if ((i16 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i18 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(815749781);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new rgvfuqvkyq() { // from class: me1.eablkybsjg
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return nufgyqmvbu.wkgbmnqykc((m91.nufgyqmvbu) obj, ((Integer) obj2).intValue());
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    rgvfuqvkyqVar3 = (rgvfuqvkyq) objYadqdtsiqt;
                } else {
                    rgvfuqvkyqVar3 = rgvfuqvkyqVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(943747262, i16, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.features.FeatureContent (FeatureContent.kt:24)");
                }
                l31.iobyxmoadg iobyxmoadgVarAgtfadlqog = l31.nufgyqmvbu.agtfadlqog(false, null, null, draadjrbmkVarBtonecajqb, 6, 6);
                rgvfuqvkyq rgvfuqvkyqVar5 = rgvfuqvkyqVar3;
                l31.nufgyqmvbu.lqeggnwhkg(iobyxmoadgVarAgtfadlqog, model, w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "FEATURE_SECTION_BANNERS", null, null, false, 14, null), false, esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), false, czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(8)), null, xrmfcynszj.gxszxtbevo.wkgbmnqykc(iobyxmoadgVarAgtfadlqog.iobyxmoadg(), null, draadjrbmkVarBtonecajqb, 0, 2), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(16645623, true, new iobyxmoadg(rgvfuqvkyqVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 1600512 | l31.iobyxmoadg.f61395zoijcleaow | (i16 & 112), 6, 672);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                rgvfuqvkyqVar4 = rgvfuqvkyqVar5;
                wkgbmnqykcVar4 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar4 = wkgbmnqykcVar2;
                rgvfuqvkyqVar4 = rgvfuqvkyqVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: me1.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return nufgyqmvbu.eablkybsjg(wkgbmnqykcVar4, model, rgvfuqvkyqVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        rgvfuqvkyqVar2 = rgvfuqvkyqVar;
        i16 = i15;
        if ((i16 & 147) == 146) {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(815749781);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new rgvfuqvkyq() { // from class: me1.eablkybsjg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return nufgyqmvbu.wkgbmnqykc((m91.nufgyqmvbu) obj, ((Integer) obj2).intValue());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                rgvfuqvkyqVar3 = (rgvfuqvkyq) objYadqdtsiqt;
            } else {
                rgvfuqvkyqVar3 = rgvfuqvkyqVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(943747262, i16, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.features.FeatureContent (FeatureContent.kt:24)");
            }
            l31.iobyxmoadg iobyxmoadgVarAgtfadlqog2 = l31.nufgyqmvbu.agtfadlqog(false, null, null, draadjrbmkVarBtonecajqb, 6, 6);
            rgvfuqvkyq rgvfuqvkyqVar6 = rgvfuqvkyqVar3;
            l31.nufgyqmvbu.lqeggnwhkg(iobyxmoadgVarAgtfadlqog2, model, w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "FEATURE_SECTION_BANNERS", null, null, false, 14, null), false, esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), false, czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(8)), null, xrmfcynszj.gxszxtbevo.wkgbmnqykc(iobyxmoadgVarAgtfadlqog2.iobyxmoadg(), null, draadjrbmkVarBtonecajqb, 0, 2), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(16645623, true, new iobyxmoadg(rgvfuqvkyqVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 1600512 | l31.iobyxmoadg.f61395zoijcleaow | (i16 & 112), 6, 672);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            rgvfuqvkyqVar4 = rgvfuqvkyqVar6;
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i18 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(815749781);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new rgvfuqvkyq() { // from class: me1.eablkybsjg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return nufgyqmvbu.wkgbmnqykc((m91.nufgyqmvbu) obj, ((Integer) obj2).intValue());
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                rgvfuqvkyqVar3 = (rgvfuqvkyq) objYadqdtsiqt;
            } else {
                rgvfuqvkyqVar3 = rgvfuqvkyqVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(943747262, i16, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.features.FeatureContent (FeatureContent.kt:24)");
            }
            l31.iobyxmoadg iobyxmoadgVarAgtfadlqog3 = l31.nufgyqmvbu.agtfadlqog(false, null, null, draadjrbmkVarBtonecajqb, 6, 6);
            rgvfuqvkyq rgvfuqvkyqVar7 = rgvfuqvkyqVar3;
            l31.nufgyqmvbu.lqeggnwhkg(iobyxmoadgVarAgtfadlqog3, model, w31.nufgyqmvbu.ojitshcjhn(wkgbmnqykcVar3, "FEATURE_SECTION_BANNERS", null, null, false, 14, null), false, esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), false, czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(8)), null, xrmfcynszj.gxszxtbevo.wkgbmnqykc(iobyxmoadgVarAgtfadlqog3.iobyxmoadg(), null, draadjrbmkVarBtonecajqb, 0, 2), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(16645623, true, new iobyxmoadg(rgvfuqvkyqVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 1600512 | l31.iobyxmoadg.f61395zoijcleaow | (i16 & 112), 6, 672);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            rgvfuqvkyqVar4 = rgvfuqvkyqVar7;
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: me1.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return nufgyqmvbu.eablkybsjg(wkgbmnqykcVar4, model, rgvfuqvkyqVar4, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(m91.nufgyqmvbu nufgyqmvbuVar, int i13) {
        zdlpuopuiu.btonecajqb(nufgyqmvbuVar, "<unused var>");
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
