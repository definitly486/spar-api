package zt;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.v0;
import androidx.compose.ui.layout.agtfadlqog;
import androidx.compose.ui.platform.zeieaojujs;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import igdgnonuha.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.measure_type.MeasureType;
import x.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {
    private static final float btonecajqb(i1 i1Var) {
        return ((w0.nufgyqmvbu) i1Var.getValue()).draadjrbmk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0.nufgyqmvbu dxjokdxxww(MeasureType measureType, iwxlajgraz iwxlajgrazVar) {
        float fLqeggnwhkg;
        if (measureType instanceof MeasureType.AMOUNT) {
            fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(0);
        } else {
            if (!(measureType instanceof MeasureType.WEIGHT)) {
                throw new NoWhenBranchMatchedException();
            }
            fLqeggnwhkg = w0.nufgyqmvbu.lqeggnwhkg(eablkybsjg(iwxlajgrazVar) / 2);
        }
        return w0.nufgyqmvbu.wkgbmnqykc(fLqeggnwhkg);
    }

    private static final float eablkybsjg(iwxlajgraz iwxlajgrazVar) {
        return ((w0.nufgyqmvbu) iwxlajgrazVar.getValue()).draadjrbmk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(w0.wkgbmnqykc wkgbmnqykcVar, iwxlajgraz iwxlajgrazVar, rgvfuqvkyq it) {
        zdlpuopuiu.btonecajqb(it, "it");
        nufgyqmvbu(iwxlajgrazVar, wkgbmnqykcVar.x((int) (it.iobyxmoadg() >> 32)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final float gxszxtbevo(i1 i1Var) {
        return ((w0.nufgyqmvbu) i1Var.getValue()).draadjrbmk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(MeasureType measureType, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, tg.iobyxmoadg iobyxmoadgVar2, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(measureType, wkgbmnqykcVar, iobyxmoadgVar, iobyxmoadgVar2, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void nufgyqmvbu(iwxlajgraz iwxlajgrazVar, float f13) {
        iwxlajgrazVar.setValue(w0.nufgyqmvbu.wkgbmnqykc(f13));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x019b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0227  */
    /* JADX WARN: Code duplicated, block: B:91:0x0232  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(final MeasureType measureType, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tg.iobyxmoadg onAmountClick, final tg.iobyxmoadg onWeightClick, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        int i17;
        int i18;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        final w0.wkgbmnqykc wkgbmnqykcVar4;
        Object objYadqdtsiqt;
        draadjrbmk.iobyxmoadg iobyxmoadgVar;
        final iwxlajgraz iwxlajgrazVar;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt2;
        i1 i1Var;
        boolean zUlzqkzuiru2;
        Object objYadqdtsiqt3;
        int iHashCode;
        tg.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        draadjrbmk draadjrbmkVarIobyxmoadg;
        tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5;
        a0 a0VarWflxmlrfwp;
        zdlpuopuiu.btonecajqb(measureType, "measureType");
        zdlpuopuiu.btonecajqb(onAmountClick, "onAmountClick");
        zdlpuopuiu.btonecajqb(onWeightClick, "onWeightClick");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1859061782);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(measureType) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            if ((i14 & 4) != 0) {
                i15 |= 384;
            } else if ((i13 & 384) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(onAmountClick)) {
                    i16 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                } else {
                    i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                i15 |= i16;
            }
            if ((i14 & 8) != 0) {
                i15 |= 3072;
            } else if ((i13 & 3072) == 0) {
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(onWeightClick)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i19 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(-1859061782, i18, -1, "ru.myspar.common.view.measure_type_toggle.compose.MeasureTypeToggle (MeasureTypeToggle.kt:35)");
                }
                wkgbmnqykcVar4 = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
                draadjrbmkVarBtonecajqb.sopmlzcsov(-109262580);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = c1.ppxfxbqfkf(w0.nufgyqmvbu.wkgbmnqykc(w0.nufgyqmvbu.lqeggnwhkg(0)), null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-109260428);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(measureType);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt2 = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: zt.eablkybsjg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return nufgyqmvbu.dxjokdxxww(measureType, iwxlajgrazVar);
                        }
                    });
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                i1Var = (i1) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(cdpycssgdh.dxjokdxxww(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "MEASURE_TYPE_TOGGLE", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(28)), y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yggfygwlhe(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(8)));
                draadjrbmkVarBtonecajqb.sopmlzcsov(-109240835);
                zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar4);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zt.gxszxtbevo
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return nufgyqmvbu.gtknphoqwx(wkgbmnqykcVar4, iwxlajgrazVar, (rgvfuqvkyq) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = agtfadlqog.iobyxmoadg(wkgbmnqykcVarPpxfxbqfkf, (tg.draadjrbmk) objYadqdtsiqt3);
                zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
                androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarIobyxmoadg);
                z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
                if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                    androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
                }
                draadjrbmkVarBtonecajqb.pkzmftpjix();
                if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                    draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
                } else {
                    draadjrbmkVarBtonecajqb.yggfygwlhe();
                }
                draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar2.ppxfxbqfkf());
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
                rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
                if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                    draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                    draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
                }
                m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
                wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(862360716);
                if (!w0.nufgyqmvbu.dxjokdxxww(eablkybsjg(iwxlajgrazVar), w0.nufgyqmvbu.lqeggnwhkg(0))) {
                    btonecajqb.zoijcleaow(gxszxtbevo(vipkmwdibw.eablkybsjg.wkgbmnqykc(btonecajqb(i1Var), null, "toggleOffset", null, draadjrbmkVarBtonecajqb, 384, 10)), draadjrbmkVarBtonecajqb, 0);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                int i23 = i18 & 14;
                int i24 = i18 >> 3;
                wkgbmnqykc.zoijcleaow(measureType, onAmountClick, onWeightClick, draadjrbmkVarBtonecajqb, i23 | (i24 & 112) | (i24 & 896));
                draadjrbmkVarBtonecajqb.cqumvgiudr();
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar5 = wkgbmnqykcVar3;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar5 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zt.lqeggnwhkg
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return nufgyqmvbu.lqeggnwhkg(measureType, wkgbmnqykcVar5, onAmountClick, onWeightClick, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(onAmountClick)) {
                i16 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i15 |= i16;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            if (draadjrbmkVarBtonecajqb.lmojexxdyd(onWeightClick)) {
                i17 = 2048;
            } else {
                i17 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i15 |= i17;
        }
        i18 = i15;
        if ((i18 & 1171) == 1170) {
            if (i19 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1859061782, i18, -1, "ru.myspar.common.view.measure_type_toggle.compose.MeasureTypeToggle (MeasureTypeToggle.kt:35)");
            }
            wkgbmnqykcVar4 = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-109262580);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(w0.nufgyqmvbu.wkgbmnqykc(w0.nufgyqmvbu.lqeggnwhkg(0)), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-109260428);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(measureType);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: zt.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.dxjokdxxww(measureType, iwxlajgrazVar);
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: zt.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.dxjokdxxww(measureType, iwxlajgrazVar);
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            i1Var = (i1) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf2 = androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(cdpycssgdh.dxjokdxxww(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "MEASURE_TYPE_TOGGLE", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(28)), y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yggfygwlhe(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(8)));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-109240835);
            zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar4);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru2) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zt.gxszxtbevo
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.gtknphoqwx(wkgbmnqykcVar4, iwxlajgrazVar, (rgvfuqvkyq) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zt.gxszxtbevo
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.gtknphoqwx(wkgbmnqykcVar4, iwxlajgrazVar, (rgvfuqvkyq) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg2 = agtfadlqog.iobyxmoadg(wkgbmnqykcVarPpxfxbqfkf2, (tg.draadjrbmk) objYadqdtsiqt3);
            zynmafqrjb zynmafqrjbVarDxjokdxxww2 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt2 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg2 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarIobyxmoadg2);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww2, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt2, iobyxmoadgVar3.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg2, iobyxmoadgVar3.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwp.f4892iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(862360716);
            if (!w0.nufgyqmvbu.dxjokdxxww(eablkybsjg(iwxlajgrazVar), w0.nufgyqmvbu.lqeggnwhkg(0))) {
                btonecajqb.zoijcleaow(gxszxtbevo(vipkmwdibw.eablkybsjg.wkgbmnqykc(btonecajqb(i1Var), null, "toggleOffset", null, draadjrbmkVarBtonecajqb, 384, 10)), draadjrbmkVarBtonecajqb, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i25 = i18 & 14;
            int i26 = i18 >> 3;
            wkgbmnqykc.zoijcleaow(measureType, onAmountClick, onWeightClick, draadjrbmkVarBtonecajqb, i25 | (i26 & 112) | (i26 & 896));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar5 = wkgbmnqykcVar3;
        } else {
            if (i19 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1859061782, i18, -1, "ru.myspar.common.view.measure_type_toggle.compose.MeasureTypeToggle (MeasureTypeToggle.kt:35)");
            }
            wkgbmnqykcVar4 = (w0.wkgbmnqykc) draadjrbmkVarBtonecajqb.ojitshcjhn(zeieaojujs.gxszxtbevo());
            draadjrbmkVarBtonecajqb.sopmlzcsov(-109262580);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(w0.nufgyqmvbu.wkgbmnqykc(w0.nufgyqmvbu.lqeggnwhkg(0)), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-109260428);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(measureType);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: zt.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.dxjokdxxww(measureType, iwxlajgrazVar);
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = v0.eablkybsjg(new tg.iobyxmoadg() { // from class: zt.eablkybsjg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return nufgyqmvbu.dxjokdxxww(measureType, iwxlajgrazVar);
                    }
                });
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            i1Var = (i1) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf3 = androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(cdpycssgdh.dxjokdxxww(l50.draadjrbmk.pmvmpeiblj(wkgbmnqykcVar3, "MEASURE_TYPE_TOGGLE", null, null, false, 14, null), w0.nufgyqmvbu.lqeggnwhkg(28)), y50.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVarBtonecajqb, z.f44181zoijcleaow).yggfygwlhe(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(8)));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-109240835);
            zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar4);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru2) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zt.gxszxtbevo
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.gtknphoqwx(wkgbmnqykcVar4, iwxlajgrazVar, (rgvfuqvkyq) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: zt.gxszxtbevo
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return nufgyqmvbu.gtknphoqwx(wkgbmnqykcVar4, iwxlajgrazVar, (rgvfuqvkyq) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg3 = agtfadlqog.iobyxmoadg(wkgbmnqykcVarPpxfxbqfkf3, (tg.draadjrbmk) objYadqdtsiqt3);
            zynmafqrjb zynmafqrjbVarDxjokdxxww3 = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt3 = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg3 = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarIobyxmoadg3);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar4 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww3, iobyxmoadgVar4.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt3, iobyxmoadgVar4.eablkybsjg());
            rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar4.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg()) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            } else {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg3, iobyxmoadgVar4.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwp.f4892iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(862360716);
            if (!w0.nufgyqmvbu.dxjokdxxww(eablkybsjg(iwxlajgrazVar), w0.nufgyqmvbu.lqeggnwhkg(0))) {
                btonecajqb.zoijcleaow(gxszxtbevo(vipkmwdibw.eablkybsjg.wkgbmnqykc(btonecajqb(i1Var), null, "toggleOffset", null, draadjrbmkVarBtonecajqb, 384, 10)), draadjrbmkVarBtonecajqb, 0);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            int i27 = i18 & 14;
            int i28 = i18 >> 3;
            wkgbmnqykc.zoijcleaow(measureType, onAmountClick, onWeightClick, draadjrbmkVarBtonecajqb, i27 | (i28 & 112) | (i28 & 896));
            draadjrbmkVarBtonecajqb.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar5 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: zt.lqeggnwhkg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return nufgyqmvbu.lqeggnwhkg(measureType, wkgbmnqykcVar5, onAmountClick, onWeightClick, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
