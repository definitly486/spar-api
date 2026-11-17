package ys1;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import it1.Splash;
import java.io.File;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zdlpuopuiu {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ i1 f126391jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f126392yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f126393zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(boolean z13, i1 i1Var, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f126392yggfygwlhe = z13;
            this.f126391jyumaefscl = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f126392yggfygwlhe, this.f126391jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f126393zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (this.f126392yggfygwlhe) {
                    this.f126393zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(1500L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            zdlpuopuiu.eablkybsjg(this.f126391jyumaefscl).invoke();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.iobyxmoadg eablkybsjg(i1 i1Var) {
        return (tg.iobyxmoadg) i1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, Splash splash, boolean z13, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(wkgbmnqykcVar, splash, z13, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final Splash splash, final boolean z13, tg.iobyxmoadg iobyxmoadgVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        tg.iobyxmoadg iobyxmoadgVar2;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        tg.iobyxmoadg iobyxmoadgVar3;
        i1 i1VarAgtfadlqog;
        boolean z14;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt;
        Object objYadqdtsiqt2;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(splash, "splash");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(65703795);
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
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(splash) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                iobyxmoadgVar2 = iobyxmoadgVar;
                i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i15 & 1171) == 1170 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                if (i16 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i17 != 0) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(372692321);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ys1.oxmwwwfdhm
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return zdlpuopuiu.wkgbmnqykc();
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt2;
                } else {
                    iobyxmoadgVar3 = iobyxmoadgVar2;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(65703795, i15, -1, "ru.myspar.proloyalty.splash.compose.SplashScreenPng (SplashScreenPng.kt:21)");
                }
                i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
                Boolean boolValueOf = Boolean.valueOf(z13);
                draadjrbmkVarBtonecajqb.sopmlzcsov(372695807);
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zUlzqkzuiru = z14 | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new iobyxmoadg(z13, i1VarAgtfadlqog, null);
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.eablkybsjg(boolValueOf, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
                tg.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar3;
                com.bumptech.glide.integration.compose.zoijcleaow.iobyxmoadg(new File(splash.getFilePath()), null, wkgbmnqykcVar3, null, x.gxszxtbevo.f120816iobyxmoadg.zoijcleaow(), 0.0f, null, null, null, null, null, draadjrbmkVarBtonecajqb, ((i15 << 6) & 896) | 24624, 0, 2024);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                iobyxmoadgVar2 = iobyxmoadgVar4;
            } else {
                draadjrbmkVarBtonecajqb.hkdspvbjdz();
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
                final tg.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ys1.kcexrzcfyt
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return zdlpuopuiu.gxszxtbevo(wkgbmnqykcVar4, splash, z13, iobyxmoadgVar5, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 3072;
        iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i15 & 1171) == 1170) {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(372692321);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ys1.oxmwwwfdhm
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return zdlpuopuiu.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt2;
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(65703795, i15, -1, "ru.myspar.proloyalty.splash.compose.SplashScreenPng (SplashScreenPng.kt:21)");
            }
            i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
            Boolean boolValueOf2 = Boolean.valueOf(z13);
            draadjrbmkVarBtonecajqb.sopmlzcsov(372695807);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            zUlzqkzuiru = z14 | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt = new iobyxmoadg(z13, i1VarAgtfadlqog, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new iobyxmoadg(z13, i1VarAgtfadlqog, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf2, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
            tg.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar3;
            com.bumptech.glide.integration.compose.zoijcleaow.iobyxmoadg(new File(splash.getFilePath()), null, wkgbmnqykcVar3, null, x.gxszxtbevo.f120816iobyxmoadg.zoijcleaow(), 0.0f, null, null, null, null, null, draadjrbmkVarBtonecajqb, ((i15 << 6) & 896) | 24624, 0, 2024);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar2 = iobyxmoadgVar6;
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(372692321);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ys1.oxmwwwfdhm
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return zdlpuopuiu.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt2;
            } else {
                iobyxmoadgVar3 = iobyxmoadgVar2;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(65703795, i15, -1, "ru.myspar.proloyalty.splash.compose.SplashScreenPng (SplashScreenPng.kt:21)");
            }
            i1VarAgtfadlqog = v0.agtfadlqog(iobyxmoadgVar3, draadjrbmkVarBtonecajqb, (i15 >> 9) & 14);
            Boolean boolValueOf3 = Boolean.valueOf(z13);
            draadjrbmkVarBtonecajqb.sopmlzcsov(372695807);
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            zUlzqkzuiru = z14 | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt = new iobyxmoadg(z13, i1VarAgtfadlqog, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new iobyxmoadg(z13, i1VarAgtfadlqog, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(boolValueOf3, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVarBtonecajqb, (i15 >> 6) & 14);
            tg.iobyxmoadg iobyxmoadgVar7 = iobyxmoadgVar3;
            com.bumptech.glide.integration.compose.zoijcleaow.iobyxmoadg(new File(splash.getFilePath()), null, wkgbmnqykcVar3, null, x.gxszxtbevo.f120816iobyxmoadg.zoijcleaow(), 0.0f, null, null, null, null, null, draadjrbmkVarBtonecajqb, ((i15 << 6) & 896) | 24624, 0, 2024);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            iobyxmoadgVar2 = iobyxmoadgVar7;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar3;
            final tg.iobyxmoadg iobyxmoadgVar8 = iobyxmoadgVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: ys1.kcexrzcfyt
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zdlpuopuiu.gxszxtbevo(wkgbmnqykcVar5, splash, z13, iobyxmoadgVar8, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
