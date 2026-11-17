package hh0;

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

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {

    static final class iobyxmoadg implements kcexrzcfyt {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f40340zdlpuopuiu;

        iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar) {
            this.f40340zdlpuopuiu = rgvfuqvkyqVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, nb0.gxszxtbevo gxszxtbevoVar, int i13) {
            rgvfuqvkyqVar.invoke(gxszxtbevoVar, Integer.valueOf(i13));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.kcexrzcfyt
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            zoijcleaow((yfnezrywwk.eablkybsjg) obj, (nb0.gxszxtbevo) obj2, ((Number) obj3).intValue(), (draadjrbmk) obj4, ((Number) obj5).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(yfnezrywwk.eablkybsjg EndlessLazyRow, final nb0.gxszxtbevo uiModel, final int i13, draadjrbmk draadjrbmkVar, int i14) {
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
                jyumaefscl.ntlheqmsrt(-1917496569, i15, -1, "ru.myspar.myspar.impl.presentation.compose.features.FeatureContent.<anonymous> (FeatureContent.kt:36)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "ivButtonImage", Integer.valueOf(i13), null, false, 12, null);
            draadjrbmkVar.sopmlzcsov(-2044556447);
            int i16 = i15 & 112;
            boolean zUlzqkzuiru = (i16 == 32 || ((i15 & 64) != 0 && draadjrbmkVar.lmojexxdyd(uiModel))) | draadjrbmkVar.ulzqkzuiru(this.f40340zdlpuopuiu) | ((i15 & 896) == 256);
            final rgvfuqvkyq rgvfuqvkyqVar = this.f40340zdlpuopuiu;
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.iobyxmoadg() { // from class: hh0.lqeggnwhkg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.iobyxmoadg.ppxfxbqfkf(rgvfuqvkyqVar, uiModel, i13);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            wkgbmnqykc.wkgbmnqykc(wkgbmnqykcVarPmvmpeiblj, uiModel, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, (nb0.gxszxtbevo.f69518istkbnxepw << 3) | i16, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(List list, rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(list, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void ppxfxbqfkf(final List model, rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        final rgvfuqvkyq rgvfuqvkyqVar2;
        int i16;
        rgvfuqvkyq rgvfuqvkyqVar3;
        Object objYadqdtsiqt;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(model, "model");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1269715122);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = i13 | (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                rgvfuqvkyqVar2 = rgvfuqvkyqVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) == 18 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-695336142);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new rgvfuqvkyq() { // from class: hh0.eablkybsjg
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return nufgyqmvbu.wkgbmnqykc((nb0.gxszxtbevo) obj, ((Integer) obj2).intValue());
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
                    jyumaefscl.ntlheqmsrt(-1269715122, i16, -1, "ru.myspar.myspar.impl.presentation.compose.features.FeatureContent (FeatureContent.kt:22)");
                }
                d50.iobyxmoadg iobyxmoadgVarAgtfadlqog = d50.nufgyqmvbu.agtfadlqog(false, null, null, draadjrbmkVarBtonecajqb, 6, 6);
                rgvfuqvkyq rgvfuqvkyqVar4 = rgvfuqvkyqVar3;
                d50.nufgyqmvbu.lqeggnwhkg(iobyxmoadgVarAgtfadlqog, model, l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "FEATURE_SECTION_BANNERS", null, null, false, 14, null), false, esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), false, czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(10)), null, xrmfcynszj.gxszxtbevo.wkgbmnqykc(iobyxmoadgVarAgtfadlqog.iobyxmoadg(), null, draadjrbmkVarBtonecajqb, 0, 2), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1917496569, true, new iobyxmoadg(rgvfuqvkyqVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 1600512 | d50.iobyxmoadg.f27083zoijcleaow | ((i16 << 3) & 112), 6, 672);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                rgvfuqvkyqVar2 = rgvfuqvkyqVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: hh0.gxszxtbevo
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return nufgyqmvbu.eablkybsjg(model, rgvfuqvkyqVar2, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        rgvfuqvkyqVar2 = rgvfuqvkyqVar;
        i16 = i15;
        if ((i16 & 19) == 18) {
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-695336142);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new rgvfuqvkyq() { // from class: hh0.eablkybsjg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return nufgyqmvbu.wkgbmnqykc((nb0.gxszxtbevo) obj, ((Integer) obj2).intValue());
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
                jyumaefscl.ntlheqmsrt(-1269715122, i16, -1, "ru.myspar.myspar.impl.presentation.compose.features.FeatureContent (FeatureContent.kt:22)");
            }
            d50.iobyxmoadg iobyxmoadgVarAgtfadlqog2 = d50.nufgyqmvbu.agtfadlqog(false, null, null, draadjrbmkVarBtonecajqb, 6, 6);
            rgvfuqvkyq rgvfuqvkyqVar5 = rgvfuqvkyqVar3;
            d50.nufgyqmvbu.lqeggnwhkg(iobyxmoadgVarAgtfadlqog2, model, l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "FEATURE_SECTION_BANNERS", null, null, false, 14, null), false, esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), false, czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(10)), null, xrmfcynszj.gxszxtbevo.wkgbmnqykc(iobyxmoadgVarAgtfadlqog2.iobyxmoadg(), null, draadjrbmkVarBtonecajqb, 0, 2), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1917496569, true, new iobyxmoadg(rgvfuqvkyqVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 1600512 | d50.iobyxmoadg.f27083zoijcleaow | ((i16 << 3) & 112), 6, 672);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            rgvfuqvkyqVar2 = rgvfuqvkyqVar5;
        } else {
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-695336142);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new rgvfuqvkyq() { // from class: hh0.eablkybsjg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return nufgyqmvbu.wkgbmnqykc((nb0.gxszxtbevo) obj, ((Integer) obj2).intValue());
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
                jyumaefscl.ntlheqmsrt(-1269715122, i16, -1, "ru.myspar.myspar.impl.presentation.compose.features.FeatureContent (FeatureContent.kt:22)");
            }
            d50.iobyxmoadg iobyxmoadgVarAgtfadlqog3 = d50.nufgyqmvbu.agtfadlqog(false, null, null, draadjrbmkVarBtonecajqb, 6, 6);
            rgvfuqvkyq rgvfuqvkyqVar6 = rgvfuqvkyqVar3;
            d50.nufgyqmvbu.lqeggnwhkg(iobyxmoadgVarAgtfadlqog3, model, l50.draadjrbmk.pmvmpeiblj(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, "FEATURE_SECTION_BANNERS", null, null, false, 14, null), false, esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), false, czzsidtyhn.eablkybsjg.f26292iobyxmoadg.rgvfuqvkyq(w0.nufgyqmvbu.lqeggnwhkg(10)), null, xrmfcynszj.gxszxtbevo.wkgbmnqykc(iobyxmoadgVarAgtfadlqog3.iobyxmoadg(), null, draadjrbmkVarBtonecajqb, 0, 2), false, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1917496569, true, new iobyxmoadg(rgvfuqvkyqVar3), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 1600512 | d50.iobyxmoadg.f27083zoijcleaow | ((i16 << 3) & 112), 6, 672);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            rgvfuqvkyqVar2 = rgvfuqvkyqVar6;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: hh0.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return nufgyqmvbu.eablkybsjg(model, rgvfuqvkyqVar2, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(nb0.gxszxtbevo gxszxtbevoVar, int i13) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<unused var>");
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
