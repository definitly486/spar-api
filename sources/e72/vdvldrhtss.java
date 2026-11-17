package e72;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.ntlheqmsrt;
import androidx.compose.runtime.ulzqkzuiru;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.concurrent.CancellationException;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vdvldrhtss {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f30869cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ i1 f30870esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ m7.zoijcleaow f30871iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ m7.gtknphoqwx f30872jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f30873yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30874zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(boolean z13, m7.gtknphoqwx gtknphoqwxVar, m7.zoijcleaow zoijcleaowVar, iwxlajgraz iwxlajgrazVar, i1 i1Var, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30873yggfygwlhe = z13;
            this.f30872jyumaefscl = gtknphoqwxVar;
            this.f30871iwizpuwonk = zoijcleaowVar;
            this.f30869cqumvgiudr = iwxlajgrazVar;
            this.f30870esjtqupxsv = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f30873yggfygwlhe, this.f30872jyumaefscl, this.f30871iwizpuwonk, this.f30869cqumvgiudr, this.f30870esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objLqeggnwhkg;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f30874zdlpuopuiu;
            try {
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            objLqeggnwhkg = obj;
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            gg.zdlpuopuiu.zoijcleaow(obj);
                        }
                        vdvldrhtss.draadjrbmk(this.f30870esjtqupxsv).invoke();
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    if (this.f30873yggfygwlhe) {
                        vdvldrhtss.gtknphoqwx(this.f30869cqumvgiudr, false);
                        m7.gtknphoqwx gtknphoqwxVar = this.f30872jyumaefscl;
                        try {
                            this.f30874zdlpuopuiu = 1;
                            objLqeggnwhkg = gtknphoqwxVar.lqeggnwhkg(this);
                            if (objLqeggnwhkg == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } catch (CancellationException e13) {
                            throw e13;
                        }
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                    com.airbnb.lottie.btonecajqb btonecajqbVar = (com.airbnb.lottie.btonecajqb) objLqeggnwhkg;
                    m7.zoijcleaow zoijcleaowVar = this.f30871iwizpuwonk;
                    this.f30874zdlpuopuiu = 2;
                    if (m7.zoijcleaow.iobyxmoadg.iobyxmoadg(zoijcleaowVar, btonecajqbVar, 0, 0, false, 0.0f, null, 0.0f, false, null, false, false, this, 2046, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } catch (Exception unused) {
                }
                vdvldrhtss.draadjrbmk(this.f30870esjtqupxsv).invoke();
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (CancellationException e14) {
                throw e14;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Context f30875iobyxmoadg;

        public zoijcleaow(Context context) {
            this.f30875iobyxmoadg = context;
        }

        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
            com.airbnb.lottie.zdlpuopuiu.gtknphoqwx(this.f30875iobyxmoadg);
        }
    }

    private static final float agtfadlqog(i1 i1Var) {
        return ((Number) i1Var.getValue()).floatValue();
    }

    private static final boolean btonecajqb(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.iobyxmoadg draadjrbmk(i1 i1Var) {
        return (tg.iobyxmoadg) i1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, m7.gtknphoqwx gtknphoqwxVar, boolean z13, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        eablkybsjg(wkgbmnqykcVar, gtknphoqwxVar, z13, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x0175  */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x021c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0222  */
    /* JADX WARN: Code duplicated, block: B:96:0x0255  */
    public static final void eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final m7.gtknphoqwx composition, final boolean z13, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        int i16;
        tg.iobyxmoadg iobyxmoadgVar2;
        int i17;
        tg.iobyxmoadg iobyxmoadgVar3;
        final Context context;
        Object objYadqdtsiqt;
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar4;
        iwxlajgraz iwxlajgrazVar;
        i1 i1VarAgtfadlqog;
        m7.zoijcleaow zoijcleaowVarWkgbmnqykc;
        final m7.nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf;
        float f13;
        boolean z14;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt2;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt3;
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        boolean zUlzqkzuiru2;
        Object objYadqdtsiqt4;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar3;
        final tg.iobyxmoadg iobyxmoadgVar5;
        Object objYadqdtsiqt5;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(composition, "composition");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1564890825);
        int i18 = i14 & 1;
        if (i18 != 0) {
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(composition) ? 32 : 16;
        }
        if ((i14 & 4) == 0) {
            if ((i13 & 384) == 0) {
                i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    iobyxmoadgVar2 = iobyxmoadgVar;
                    if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_ALL;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    if (i18 != 0) {
                        wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    }
                    if (i16 != 0) {
                        draadjrbmkVarBtonecajqb.sopmlzcsov(1325809262);
                        objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                        if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                            objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: e72.wflxmlrfwp
                                @Override // tg.iobyxmoadg
                                public final Object invoke() {
                                    return vdvldrhtss.gxszxtbevo();
                                }
                            };
                            draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                        }
                        iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt5;
                        draadjrbmkVarBtonecajqb.stevsuqkhv();
                    } else {
                        iobyxmoadgVar3 = iobyxmoadgVar2;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(1564890825, i15, -1, "ru.myspar.splash.compose.SplashScreenLottie (SplashScreenLottie.kt:33)");
                    }
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1325811597);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    iobyxmoadgVar4 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                    if (objYadqdtsiqt == iobyxmoadgVar4.iobyxmoadg()) {
                        objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
                    zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
                    nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(composition.getValue(), z13, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                    if (btonecajqb(iwxlajgrazVar)) {
                        f13 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                    i1 i1VarEablkybsjg = vipkmwdibw.eablkybsjg.eablkybsjg(f13, vipkmwdibw.draadjrbmk.draadjrbmk(500, 0, null, 6, null), 0.0f, "AnimationBlurSplashScreenLottie", null, draadjrbmkVarBtonecajqb, 3120, 20);
                    Boolean boolValueOf = Boolean.valueOf(z13);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1325829496);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zUlzqkzuiru = z14 | ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (!zUlzqkzuiru || objYadqdtsiqt2 == iobyxmoadgVar4.iobyxmoadg()) {
                        draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                        objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                        draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                    } else {
                        draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    }
                    draadjrbmkVar2.stevsuqkhv();
                    jlmebxxoox.eablkybsjg(boolValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar2, (i15 >> 6) & 14);
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    draadjrbmkVar2.sopmlzcsov(1325844778);
                    zLmojexxdyd = draadjrbmkVar2.lmojexxdyd(context);
                    objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                    if (zLmojexxdyd || objYadqdtsiqt3 == iobyxmoadgVar4.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                    }
                    draadjrbmkVar2.stevsuqkhv();
                    jlmebxxoox.zoijcleaow(wwaezpbzknVar, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 6);
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, agtfadlqog(i1VarEablkybsjg));
                    com.airbnb.lottie.btonecajqb value = composition.getValue();
                    x.gxszxtbevo gxszxtbevoVarIobyxmoadg = x.gxszxtbevo.f120816iobyxmoadg.iobyxmoadg();
                    com.airbnb.lottie.iobyxmoadg iobyxmoadgVar6 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                    com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                    draadjrbmkVar2.sopmlzcsov(1325852120);
                    zUlzqkzuiru2 = draadjrbmkVar2.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                    objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
                    if (zUlzqkzuiru2 || objYadqdtsiqt4 == iobyxmoadgVar4.iobyxmoadg()) {
                        objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                            }
                        };
                        draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                    }
                    draadjrbmkVar2.stevsuqkhv();
                    draadjrbmkVar3 = draadjrbmkVar2;
                    m7.eablkybsjg.iobyxmoadg(value, (tg.iobyxmoadg) objYadqdtsiqt4, wkgbmnqykcVarIobyxmoadg, false, false, false, ulzqkzuiruVar, false, null, null, gxszxtbevoVarIobyxmoadg, false, false, null, iobyxmoadgVar6, false, draadjrbmkVar3, 1572864, 24582, 48056);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    iobyxmoadgVar5 = iobyxmoadgVar3;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                    iobyxmoadgVar5 = iobyxmoadgVar2;
                }
                a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: e72.rgvfuqvkyq
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return vdvldrhtss.dxjokdxxww(wkgbmnqykcVar3, composition, z13, iobyxmoadgVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 3072;
            iobyxmoadgVar2 = iobyxmoadgVar;
            if ((i15 & 1171) == 1170) {
                if (i18 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1325809262);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: e72.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return vdvldrhtss.gxszxtbevo();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1564890825, i15, -1, "ru.myspar.splash.compose.SplashScreenLottie (SplashScreenLottie.kt:33)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325811597);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar4 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar4.iobyxmoadg()) {
                    objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
                zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
                nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(composition.getValue(), z13, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                if (btonecajqb(iwxlajgrazVar)) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                i1 i1VarEablkybsjg2 = vipkmwdibw.eablkybsjg.eablkybsjg(f13, vipkmwdibw.draadjrbmk.draadjrbmk(500, 0, null, 6, null), 0.0f, "AnimationBlurSplashScreenLottie", null, draadjrbmkVarBtonecajqb, 3120, 20);
                Boolean boolValueOf2 = Boolean.valueOf(z13);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325829496);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zUlzqkzuiru = z14 | ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                } else {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar2.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf2, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar2, (i15 >> 6) & 14);
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVar2.sopmlzcsov(1325844778);
                zLmojexxdyd = draadjrbmkVar2.lmojexxdyd(context);
                objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                } else {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVar2.stevsuqkhv();
                jlmebxxoox.zoijcleaow(wwaezpbzknVar2, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 6);
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg2 = e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, agtfadlqog(i1VarEablkybsjg2));
                com.airbnb.lottie.btonecajqb value2 = composition.getValue();
                x.gxszxtbevo gxszxtbevoVarIobyxmoadg2 = x.gxszxtbevo.f120816iobyxmoadg.iobyxmoadg();
                com.airbnb.lottie.iobyxmoadg iobyxmoadgVar7 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar2 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                draadjrbmkVar2.sopmlzcsov(1325852120);
                zUlzqkzuiru2 = draadjrbmkVar2.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                } else {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVar2.stevsuqkhv();
                draadjrbmkVar3 = draadjrbmkVar2;
                m7.eablkybsjg.iobyxmoadg(value2, (tg.iobyxmoadg) objYadqdtsiqt4, wkgbmnqykcVarIobyxmoadg2, false, false, false, ulzqkzuiruVar2, false, null, null, gxszxtbevoVarIobyxmoadg2, false, false, null, iobyxmoadgVar7, false, draadjrbmkVar3, 1572864, 24582, 48056);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar5 = iobyxmoadgVar3;
            } else {
                if (i18 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1325809262);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: e72.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return vdvldrhtss.gxszxtbevo();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1564890825, i15, -1, "ru.myspar.splash.compose.SplashScreenLottie (SplashScreenLottie.kt:33)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325811597);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar4 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar4.iobyxmoadg()) {
                    objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
                zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
                nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(composition.getValue(), z13, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                if (btonecajqb(iwxlajgrazVar)) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                i1 i1VarEablkybsjg3 = vipkmwdibw.eablkybsjg.eablkybsjg(f13, vipkmwdibw.draadjrbmk.draadjrbmk(500, 0, null, 6, null), 0.0f, "AnimationBlurSplashScreenLottie", null, draadjrbmkVarBtonecajqb, 3120, 20);
                Boolean boolValueOf3 = Boolean.valueOf(z13);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325829496);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zUlzqkzuiru = z14 | ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                } else {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar2.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf3, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar2, (i15 >> 6) & 14);
                wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVar2.sopmlzcsov(1325844778);
                zLmojexxdyd = draadjrbmkVar2.lmojexxdyd(context);
                objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                } else {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVar2.stevsuqkhv();
                jlmebxxoox.zoijcleaow(wwaezpbzknVar3, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 6);
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg3 = e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, agtfadlqog(i1VarEablkybsjg3));
                com.airbnb.lottie.btonecajqb value3 = composition.getValue();
                x.gxszxtbevo gxszxtbevoVarIobyxmoadg3 = x.gxszxtbevo.f120816iobyxmoadg.iobyxmoadg();
                com.airbnb.lottie.iobyxmoadg iobyxmoadgVar8 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar3 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                draadjrbmkVar2.sopmlzcsov(1325852120);
                zUlzqkzuiru2 = draadjrbmkVar2.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                } else {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVar2.stevsuqkhv();
                draadjrbmkVar3 = draadjrbmkVar2;
                m7.eablkybsjg.iobyxmoadg(value3, (tg.iobyxmoadg) objYadqdtsiqt4, wkgbmnqykcVarIobyxmoadg3, false, false, false, ulzqkzuiruVar3, false, null, null, gxszxtbevoVarIobyxmoadg3, false, false, null, iobyxmoadgVar8, false, draadjrbmkVar3, 1572864, 24582, 48056);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar5 = iobyxmoadgVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: e72.rgvfuqvkyq
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return vdvldrhtss.dxjokdxxww(wkgbmnqykcVar3, composition, z13, iobyxmoadgVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                iobyxmoadgVar2 = iobyxmoadgVar;
                if (draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2)) {
                    i17 = 2048;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_ALL;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) == 1170) {
                if (i18 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1325809262);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: e72.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return vdvldrhtss.gxszxtbevo();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1564890825, i15, -1, "ru.myspar.splash.compose.SplashScreenLottie (SplashScreenLottie.kt:33)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325811597);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar4 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar4.iobyxmoadg()) {
                    objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
                zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
                nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(composition.getValue(), z13, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                if (btonecajqb(iwxlajgrazVar)) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                i1 i1VarEablkybsjg4 = vipkmwdibw.eablkybsjg.eablkybsjg(f13, vipkmwdibw.draadjrbmk.draadjrbmk(500, 0, null, 6, null), 0.0f, "AnimationBlurSplashScreenLottie", null, draadjrbmkVarBtonecajqb, 3120, 20);
                Boolean boolValueOf4 = Boolean.valueOf(z13);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325829496);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zUlzqkzuiru = z14 | ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                } else {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar2.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf4, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar2, (i15 >> 6) & 14);
                wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVar2.sopmlzcsov(1325844778);
                zLmojexxdyd = draadjrbmkVar2.lmojexxdyd(context);
                objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                } else {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVar2.stevsuqkhv();
                jlmebxxoox.zoijcleaow(wwaezpbzknVar4, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 6);
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg4 = e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, agtfadlqog(i1VarEablkybsjg4));
                com.airbnb.lottie.btonecajqb value4 = composition.getValue();
                x.gxszxtbevo gxszxtbevoVarIobyxmoadg4 = x.gxszxtbevo.f120816iobyxmoadg.iobyxmoadg();
                com.airbnb.lottie.iobyxmoadg iobyxmoadgVar9 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar4 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                draadjrbmkVar2.sopmlzcsov(1325852120);
                zUlzqkzuiru2 = draadjrbmkVar2.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                } else {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVar2.stevsuqkhv();
                draadjrbmkVar3 = draadjrbmkVar2;
                m7.eablkybsjg.iobyxmoadg(value4, (tg.iobyxmoadg) objYadqdtsiqt4, wkgbmnqykcVarIobyxmoadg4, false, false, false, ulzqkzuiruVar4, false, null, null, gxszxtbevoVarIobyxmoadg4, false, false, null, iobyxmoadgVar9, false, draadjrbmkVar3, 1572864, 24582, 48056);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar5 = iobyxmoadgVar3;
            } else {
                if (i18 != 0) {
                    wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                }
                if (i16 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1325809262);
                    objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: e72.wflxmlrfwp
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return vdvldrhtss.gxszxtbevo();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt5;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                } else {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(1564890825, i15, -1, "ru.myspar.splash.compose.SplashScreenLottie (SplashScreenLottie.kt:33)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325811597);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                iobyxmoadgVar4 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar4.iobyxmoadg()) {
                    objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
                zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
                nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(composition.getValue(), z13, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                if (btonecajqb(iwxlajgrazVar)) {
                    f13 = 0.0f;
                } else {
                    f13 = 1.0f;
                }
                i1 i1VarEablkybsjg5 = vipkmwdibw.eablkybsjg.eablkybsjg(f13, vipkmwdibw.draadjrbmk.draadjrbmk(500, 0, null, 6, null), 0.0f, "AnimationBlurSplashScreenLottie", null, draadjrbmkVarBtonecajqb, 3120, 20);
                Boolean boolValueOf5 = Boolean.valueOf(z13);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325829496);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zUlzqkzuiru = z14 | ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                } else {
                    draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                    objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar2.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf5, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar2, (i15 >> 6) & 14);
                wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVar2.sopmlzcsov(1325844778);
                zLmojexxdyd = draadjrbmkVar2.lmojexxdyd(context);
                objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                } else {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVar2.stevsuqkhv();
                jlmebxxoox.zoijcleaow(wwaezpbzknVar5, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 6);
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg5 = e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, agtfadlqog(i1VarEablkybsjg5));
                com.airbnb.lottie.btonecajqb value5 = composition.getValue();
                x.gxszxtbevo gxszxtbevoVarIobyxmoadg5 = x.gxszxtbevo.f120816iobyxmoadg.iobyxmoadg();
                com.airbnb.lottie.iobyxmoadg iobyxmoadgVar10 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar5 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                draadjrbmkVar2.sopmlzcsov(1325852120);
                zUlzqkzuiru2 = draadjrbmkVar2.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
                if (zUlzqkzuiru2) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                } else {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVar2.stevsuqkhv();
                draadjrbmkVar3 = draadjrbmkVar2;
                m7.eablkybsjg.iobyxmoadg(value5, (tg.iobyxmoadg) objYadqdtsiqt4, wkgbmnqykcVarIobyxmoadg5, false, false, false, ulzqkzuiruVar5, false, null, null, gxszxtbevoVarIobyxmoadg5, false, false, null, iobyxmoadgVar10, false, draadjrbmkVar3, 1572864, 24582, 48056);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar5 = iobyxmoadgVar3;
            }
            a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: e72.rgvfuqvkyq
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return vdvldrhtss.dxjokdxxww(wkgbmnqykcVar3, composition, z13, iobyxmoadgVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i15 & 1171) == 1170) {
            if (i18 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325809262);
                objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: e72.wflxmlrfwp
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return vdvldrhtss.gxszxtbevo();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt5;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1564890825, i15, -1, "ru.myspar.splash.compose.SplashScreenLottie (SplashScreenLottie.kt:33)");
            }
            context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            draadjrbmkVarBtonecajqb.sopmlzcsov(1325811597);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar4 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar4.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
            zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
            nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(composition.getValue(), z13, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
            if (btonecajqb(iwxlajgrazVar)) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            i1 i1VarEablkybsjg6 = vipkmwdibw.eablkybsjg.eablkybsjg(f13, vipkmwdibw.draadjrbmk.draadjrbmk(500, 0, null, 6, null), 0.0f, "AnimationBlurSplashScreenLottie", null, draadjrbmkVarBtonecajqb, 3120, 20);
            Boolean boolValueOf6 = Boolean.valueOf(z13);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1325829496);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            zUlzqkzuiru = z14 | ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
            } else {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar2.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf6, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar2, (i15 >> 6) & 14);
            wwaezpbzkn wwaezpbzknVar6 = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVar2.sopmlzcsov(1325844778);
            zLmojexxdyd = draadjrbmkVar2.lmojexxdyd(context);
            objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVar2.stevsuqkhv();
            jlmebxxoox.zoijcleaow(wwaezpbzknVar6, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 6);
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg6 = e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, agtfadlqog(i1VarEablkybsjg6));
            com.airbnb.lottie.btonecajqb value6 = composition.getValue();
            x.gxszxtbevo gxszxtbevoVarIobyxmoadg6 = x.gxszxtbevo.f120816iobyxmoadg.iobyxmoadg();
            com.airbnb.lottie.iobyxmoadg iobyxmoadgVar11 = com.airbnb.lottie.iobyxmoadg.ENABLED;
            com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar6 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
            draadjrbmkVar2.sopmlzcsov(1325852120);
            zUlzqkzuiru2 = draadjrbmkVar2.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
            objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
            if (zUlzqkzuiru2) {
                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            } else {
                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar3 = draadjrbmkVar2;
            m7.eablkybsjg.iobyxmoadg(value6, (tg.iobyxmoadg) objYadqdtsiqt4, wkgbmnqykcVarIobyxmoadg6, false, false, false, ulzqkzuiruVar6, false, null, null, gxszxtbevoVarIobyxmoadg6, false, false, null, iobyxmoadgVar11, false, draadjrbmkVar3, 1572864, 24582, 48056);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar5 = iobyxmoadgVar3;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i16 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1325809262);
                objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: e72.wflxmlrfwp
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return vdvldrhtss.gxszxtbevo();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt5;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1564890825, i15, -1, "ru.myspar.splash.compose.SplashScreenLottie (SplashScreenLottie.kt:33)");
            }
            context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            draadjrbmkVarBtonecajqb.sopmlzcsov(1325811597);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            iobyxmoadgVar4 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar4.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.TRUE, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
            zoijcleaowVarWkgbmnqykc = m7.wkgbmnqykc.wkgbmnqykc(draadjrbmkVarBtonecajqb, 0);
            nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(composition.getValue(), z13, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
            if (btonecajqb(iwxlajgrazVar)) {
                f13 = 0.0f;
            } else {
                f13 = 1.0f;
            }
            i1 i1VarEablkybsjg7 = vipkmwdibw.eablkybsjg.eablkybsjg(f13, vipkmwdibw.draadjrbmk.draadjrbmk(500, 0, null, 6, null), 0.0f, "AnimationBlurSplashScreenLottie", null, draadjrbmkVarBtonecajqb, 3120, 20);
            Boolean boolValueOf7 = Boolean.valueOf(z13);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1325829496);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            zUlzqkzuiru = z14 | ((i15 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarWkgbmnqykc) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
            } else {
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                objYadqdtsiqt2 = new iobyxmoadg(z13, composition, zoijcleaowVarWkgbmnqykc, iwxlajgrazVar, i1VarAgtfadlqog, null);
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar2.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf7, (tg.rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar2, (i15 >> 6) & 14);
            wwaezpbzkn wwaezpbzknVar7 = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVar2.sopmlzcsov(1325844778);
            zLmojexxdyd = draadjrbmkVar2.lmojexxdyd(context);
            objYadqdtsiqt3 = draadjrbmkVar2.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
            } else {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e72.agtfadlqog
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return vdvldrhtss.lqeggnwhkg(context, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVar2.stevsuqkhv();
            jlmebxxoox.zoijcleaow(wwaezpbzknVar7, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVar2, 6);
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarIobyxmoadg7 = e.iobyxmoadg.iobyxmoadg(wkgbmnqykcVar3, agtfadlqog(i1VarEablkybsjg7));
            com.airbnb.lottie.btonecajqb value7 = composition.getValue();
            x.gxszxtbevo gxszxtbevoVarIobyxmoadg7 = x.gxszxtbevo.f120816iobyxmoadg.iobyxmoadg();
            com.airbnb.lottie.iobyxmoadg iobyxmoadgVar12 = com.airbnb.lottie.iobyxmoadg.ENABLED;
            com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar7 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
            draadjrbmkVar2.sopmlzcsov(1325852120);
            zUlzqkzuiru2 = draadjrbmkVar2.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
            objYadqdtsiqt4 = draadjrbmkVar2.yadqdtsiqt();
            if (zUlzqkzuiru2) {
                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            } else {
                objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: e72.ojitshcjhn
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(vdvldrhtss.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                    }
                };
                draadjrbmkVar2.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar3 = draadjrbmkVar2;
            m7.eablkybsjg.iobyxmoadg(value7, (tg.iobyxmoadg) objYadqdtsiqt4, wkgbmnqykcVarIobyxmoadg7, false, false, false, ulzqkzuiruVar7, false, null, null, gxszxtbevoVarIobyxmoadg7, false, false, null, iobyxmoadgVar12, false, draadjrbmkVar3, 1572864, 24582, 48056);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar5 = iobyxmoadgVar3;
        }
        a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: e72.rgvfuqvkyq
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return vdvldrhtss.dxjokdxxww(wkgbmnqykcVar3, composition, z13, iobyxmoadgVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gtknphoqwx(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ntlheqmsrt lqeggnwhkg(Context context, ulzqkzuiru DisposableEffect) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(DisposableEffect, "$this$DisposableEffect");
        return new zoijcleaow(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nufgyqmvbu(m7.nufgyqmvbu nufgyqmvbuVar) {
        return wflxmlrfwp(nufgyqmvbuVar);
    }

    private static final float wflxmlrfwp(m7.nufgyqmvbu nufgyqmvbuVar) {
        return ((Number) nufgyqmvbuVar.getValue()).floatValue();
    }
}
