package vn0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import igdgnonuha.z;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f117534iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ i1 f117535jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f117536yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f117537zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(i1 i1Var, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f117535jyumaefscl = i1Var;
            this.f117534iwizpuwonk = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f117535jyumaefscl, this.f117534iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            iwxlajgraz iwxlajgrazVar;
            iwxlajgraz iwxlajgrazVar2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f117536yggfygwlhe;
            boolean z13 = true;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iwxlajgrazVar = this.f117534iwizpuwonk;
                if (ppxfxbqfkf.wkgbmnqykc(this.f117535jyumaefscl)) {
                    z13 = false;
                } else {
                    this.f117537zdlpuopuiu = iwxlajgrazVar;
                    this.f117536yggfygwlhe = 1;
                    if (crxdokpmqz.zoijcleaow(300L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    iwxlajgrazVar2 = iwxlajgrazVar;
                }
                ppxfxbqfkf.gxszxtbevo(iwxlajgrazVar, z13);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iwxlajgrazVar2 = (iwxlajgraz) this.f117537zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            iwxlajgrazVar = iwxlajgrazVar2;
            ppxfxbqfkf.gxszxtbevo(iwxlajgrazVar, z13);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f117538jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f117539yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f117540zdlpuopuiu;

        zoijcleaow(tg.iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14) {
            this.f117540zdlpuopuiu = iobyxmoadgVar;
            this.f117539yggfygwlhe = z13;
            this.f117538jyumaefscl = z14;
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            iobyxmoadg((ribwqtqdhb.wkgbmnqykc) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ribwqtqdhb.wkgbmnqykc AnimatedVisibility, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(AnimatedVisibility, "$this$AnimatedVisibility");
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-591579268, i13, -1, "ru.myspar.proloyalty.auth.impl.presentation.registration.compose.components.BottomButton.<anonymous> (BottomButton.kt:55)");
            }
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = androidx.compose.foundation.zoijcleaow.wkgbmnqykc(e.draadjrbmk.zoijcleaow(cdpycssgdh.nufgyqmvbu(iobyxmoadgVar, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(8), null, false, 0L, 0L, 30, null), l41.ppxfxbqfkf.iobyxmoadg(z.f44180iobyxmoadg, draadjrbmkVar, z.f44181zoijcleaow).gtknphoqwx(), null, 2, null);
            tg.iobyxmoadg iobyxmoadgVar2 = this.f117540zdlpuopuiu;
            boolean z13 = this.f117539yggfygwlhe;
            boolean z14 = this.f117538jyumaefscl;
            zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(a.eablkybsjg.f20iobyxmoadg.ojitshcjhn(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVar, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVar.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVar, wkgbmnqykcVarWkgbmnqykc);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar3 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg();
            if (draadjrbmkVar.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVar.pkzmftpjix();
            if (draadjrbmkVar.lqeggnwhkg()) {
                draadjrbmkVar.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVar.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVar);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar3.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar3.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar3.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar3.wkgbmnqykc());
            androidx.compose.foundation.layout.wflxmlrfwp wflxmlrfwpVar = androidx.compose.foundation.layout.wflxmlrfwp.f4892iobyxmoadg;
            i31.wkgbmnqykc.wkgbmnqykc(e0.gxszxtbevo.ppxfxbqfkf(bn0.eablkybsjg.proloyalty_registration_finish, draadjrbmkVar, 0), iobyxmoadgVar2, w31.nufgyqmvbu.ojitshcjhn(esjtqupxsv.agtfadlqog(iobyxmoadgVar, w0.nufgyqmvbu.lqeggnwhkg(16)), "btnFinish", null, null, false, 14, null), i31.nufgyqmvbu.LARGE, z13, null, null, z14, draadjrbmkVar, 3072, 96);
            draadjrbmkVar.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    private static final boolean eablkybsjg(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0.agtfadlqog lqeggnwhkg(w0.oxmwwwfdhm oxmwwwfdhmVar) {
        return w0.agtfadlqog.ppxfxbqfkf(w0.agtfadlqog.wkgbmnqykc((((long) 0) << 32) | (((long) 200) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(boolean z13, boolean z14, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(z13, z14, iobyxmoadgVar, wkgbmnqykcVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0155  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void ppxfxbqfkf(final boolean z13, final boolean z14, final tg.iobyxmoadg onClick, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        i1 i1VarPpxfxbqfkf;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar;
        iwxlajgraz iwxlajgrazVar;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt2;
        Object objYadqdtsiqt3;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClick, "onClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1714767524);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z14) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1714767524, i15, -1, "ru.myspar.proloyalty.auth.impl.presentation.registration.compose.components.BottomButton (BottomButton.kt:38)");
                }
                i1VarPpxfxbqfkf = n41.wkgbmnqykc.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0);
                draadjrbmkVarBtonecajqb.sopmlzcsov(454185701);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                Boolean boolValueOf = Boolean.valueOf(wkgbmnqykc(i1VarPpxfxbqfkf));
                draadjrbmkVarBtonecajqb.sopmlzcsov(454188085);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarPpxfxbqfkf);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt2 = new iobyxmoadg(i1VarPpxfxbqfkf, iwxlajgrazVar, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
                boolean zEablkybsjg = eablkybsjg(iwxlajgrazVar);
                draadjrbmkVarBtonecajqb.sopmlzcsov(454195585);
                objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: vn0.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return ppxfxbqfkf.lqeggnwhkg((w0.oxmwwwfdhm) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(zEablkybsjg, wkgbmnqykcVar3, androidx.compose.animation.zoijcleaow.istkbnxepw(null, (tg.draadjrbmk) objYadqdtsiqt3, 1, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(vipkmwdibw.draadjrbmk.btonecajqb(0.0f, 10000.0f, null, 5, null), 0.0f, 2, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-591579268, true, new zoijcleaow(onClick, z14, z13), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 6) & 112) | 200064, 16);
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
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: vn0.zoijcleaow
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return ppxfxbqfkf.nufgyqmvbu(z13, z14, onClick, wkgbmnqykcVar4, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        if ((i15 & 1171) == 1170) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1714767524, i15, -1, "ru.myspar.proloyalty.auth.impl.presentation.registration.compose.components.BottomButton (BottomButton.kt:38)");
            }
            i1VarPpxfxbqfkf = n41.wkgbmnqykc.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(454185701);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            Boolean boolValueOf2 = Boolean.valueOf(wkgbmnqykc(i1VarPpxfxbqfkf));
            draadjrbmkVarBtonecajqb.sopmlzcsov(454188085);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarPpxfxbqfkf);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = new iobyxmoadg(i1VarPpxfxbqfkf, iwxlajgrazVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(i1VarPpxfxbqfkf, iwxlajgrazVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf2, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            boolean zEablkybsjg2 = eablkybsjg(iwxlajgrazVar);
            draadjrbmkVarBtonecajqb.sopmlzcsov(454195585);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: vn0.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ppxfxbqfkf.lqeggnwhkg((w0.oxmwwwfdhm) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(zEablkybsjg2, wkgbmnqykcVar3, androidx.compose.animation.zoijcleaow.istkbnxepw(null, (tg.draadjrbmk) objYadqdtsiqt3, 1, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(vipkmwdibw.draadjrbmk.btonecajqb(0.0f, 10000.0f, null, 5, null), 0.0f, 2, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-591579268, true, new zoijcleaow(onClick, z14, z13), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 6) & 112) | 200064, 16);
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
                jyumaefscl.ntlheqmsrt(1714767524, i15, -1, "ru.myspar.proloyalty.auth.impl.presentation.registration.compose.components.BottomButton (BottomButton.kt:38)");
            }
            i1VarPpxfxbqfkf = n41.wkgbmnqykc.ppxfxbqfkf(draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(454185701);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            Boolean boolValueOf3 = Boolean.valueOf(wkgbmnqykc(i1VarPpxfxbqfkf));
            draadjrbmkVarBtonecajqb.sopmlzcsov(454188085);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarPpxfxbqfkf);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = new iobyxmoadg(i1VarPpxfxbqfkf, iwxlajgrazVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new iobyxmoadg(i1VarPpxfxbqfkf, iwxlajgrazVar, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf3, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            boolean zEablkybsjg3 = eablkybsjg(iwxlajgrazVar);
            draadjrbmkVarBtonecajqb.sopmlzcsov(454195585);
            objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: vn0.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ppxfxbqfkf.lqeggnwhkg((w0.oxmwwwfdhm) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ribwqtqdhb.ppxfxbqfkf.lqeggnwhkg(zEablkybsjg3, wkgbmnqykcVar3, androidx.compose.animation.zoijcleaow.istkbnxepw(null, (tg.draadjrbmk) objYadqdtsiqt3, 1, null), androidx.compose.animation.zoijcleaow.vdvldrhtss(vipkmwdibw.draadjrbmk.btonecajqb(0.0f, 10000.0f, null, 5, null), 0.0f, 2, null), null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-591579268, true, new zoijcleaow(onClick, z14, z13), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, ((i15 >> 6) & 112) | 200064, 16);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: vn0.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.nufgyqmvbu(z13, z14, onClick, wkgbmnqykcVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wkgbmnqykc(i1 i1Var) {
        return ((Boolean) i1Var.getValue()).booleanValue();
    }
}
