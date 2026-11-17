package ut;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.ntlheqmsrt;
import androidx.compose.runtime.ulzqkzuiru;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.btonecajqb;
import com.airbnb.lottie.zdlpuopuiu;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import m7.gtknphoqwx;
import m7.nufgyqmvbu;
import m7.ojitshcjhn;
import m7.wflxmlrfwp;
import ru.myspar.common.view.hint.model.HintUiModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg implements ntlheqmsrt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Context f114372iobyxmoadg;

        public iobyxmoadg(Context context) {
            this.f114372iobyxmoadg = context;
        }

        @Override // androidx.compose.runtime.ntlheqmsrt
        public void iobyxmoadg() {
            zdlpuopuiu.gtknphoqwx(this.f114372iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(HintUiModel.Animation animation, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(animation, wkgbmnqykcVar, z13, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ntlheqmsrt eablkybsjg(Context context, ulzqkzuiru DisposableEffect) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(DisposableEffect, "$this$DisposableEffect");
        return new iobyxmoadg(context);
    }

    private static final btonecajqb gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        return (btonecajqb) gtknphoqwxVar.getValue();
    }

    private static final float lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar) {
        return ((Number) nufgyqmvbuVar.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nufgyqmvbu(nufgyqmvbu nufgyqmvbuVar) {
        return lqeggnwhkg(nufgyqmvbuVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void wkgbmnqykc(final HintUiModel.Animation hint, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        boolean z14;
        int i17;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        boolean z15;
        final Context context;
        boolean zLmojexxdyd;
        Object objYadqdtsiqt;
        final nufgyqmvbu nufgyqmvbuVarPpxfxbqfkf;
        boolean zUlzqkzuiru;
        Object objYadqdtsiqt2;
        final boolean z16;
        a0 a0VarWflxmlrfwp;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(534346813);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(hint) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                wkgbmnqykcVar2 = wkgbmnqykcVar;
                i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z14 = z13;
                    if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                        i17 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    } else {
                        i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) == 146 || !draadjrbmkVarBtonecajqb.gtknphoqwx()) {
                    if (i18 != 0) {
                        wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                    } else {
                        wkgbmnqykcVar3 = wkgbmnqykcVar2;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.ntlheqmsrt(534346813, i15, -1, "ru.myspar.common.view.hint.compose.animation.HintAnimationItem (HintAnimationItem.kt:27)");
                    }
                    context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-918451440);
                    zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(context);
                    objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    jlmebxxoox.zoijcleaow(wwaezpbzknVar, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6);
                    gtknphoqwx gtknphoqwxVarOxmwwwfdhm = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(hint.getType().nufgyqmvbu())), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
                    nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(gxszxtbevo(gtknphoqwxVarOxmwwwfdhm), z15, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                    btonecajqb btonecajqbVarGxszxtbevo = gxszxtbevo(gtknphoqwxVarOxmwwwfdhm);
                    x.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = x.gxszxtbevo.f120816iobyxmoadg.ppxfxbqfkf();
                    com.airbnb.lottie.iobyxmoadg iobyxmoadgVar = com.airbnb.lottie.iobyxmoadg.ENABLED;
                    com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-918439266);
                    zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                    objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    m7.eablkybsjg.iobyxmoadg(btonecajqbVarGxszxtbevo, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVar3, false, false, false, ulzqkzuiruVar, false, null, null, gxszxtbevoVarPpxfxbqfkf, false, false, null, iobyxmoadgVar, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 896) | 1572864, 24582, 48056);
                    if (jyumaefscl.jpowsppfya()) {
                        jyumaefscl.mbcevpiqjq();
                    }
                    wkgbmnqykcVar2 = wkgbmnqykcVar3;
                    z16 = z15;
                } else {
                    draadjrbmkVarBtonecajqb.hkdspvbjdz();
                    z16 = z14;
                }
                a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
                if (a0VarWflxmlrfwp != null) {
                    final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar2;
                    a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ut.ppxfxbqfkf
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return wkgbmnqykc.dxjokdxxww(hint, wkgbmnqykcVar4, z16, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i15 |= 384;
            z14 = z13;
            if ((i15 & 147) == 146) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(534346813, i15, -1, "ru.myspar.common.view.hint.compose.animation.HintAnimationItem (HintAnimationItem.kt:27)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-918451440);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(context);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.zoijcleaow(wwaezpbzknVar2, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6);
                gtknphoqwx gtknphoqwxVarOxmwwwfdhm2 = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(hint.getType().nufgyqmvbu())), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
                nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(gxszxtbevo(gtknphoqwxVarOxmwwwfdhm2), z15, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                btonecajqb btonecajqbVarGxszxtbevo2 = gxszxtbevo(gtknphoqwxVarOxmwwwfdhm2);
                x.gxszxtbevo gxszxtbevoVarPpxfxbqfkf2 = x.gxszxtbevo.f120816iobyxmoadg.ppxfxbqfkf();
                com.airbnb.lottie.iobyxmoadg iobyxmoadgVar2 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar2 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-918439266);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                m7.eablkybsjg.iobyxmoadg(btonecajqbVarGxszxtbevo2, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVar3, false, false, false, ulzqkzuiruVar2, false, null, null, gxszxtbevoVarPpxfxbqfkf2, false, false, null, iobyxmoadgVar2, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 896) | 1572864, 24582, 48056);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                z16 = z15;
            } else {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(534346813, i15, -1, "ru.myspar.common.view.hint.compose.animation.HintAnimationItem (HintAnimationItem.kt:27)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-918451440);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(context);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.zoijcleaow(wwaezpbzknVar3, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6);
                gtknphoqwx gtknphoqwxVarOxmwwwfdhm3 = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(hint.getType().nufgyqmvbu())), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
                nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(gxszxtbevo(gtknphoqwxVarOxmwwwfdhm3), z15, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                btonecajqb btonecajqbVarGxszxtbevo3 = gxszxtbevo(gtknphoqwxVarOxmwwwfdhm3);
                x.gxszxtbevo gxszxtbevoVarPpxfxbqfkf3 = x.gxszxtbevo.f120816iobyxmoadg.ppxfxbqfkf();
                com.airbnb.lottie.iobyxmoadg iobyxmoadgVar3 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar3 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-918439266);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                m7.eablkybsjg.iobyxmoadg(btonecajqbVarGxszxtbevo3, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVar3, false, false, false, ulzqkzuiruVar3, false, null, null, gxszxtbevoVarPpxfxbqfkf3, false, false, null, iobyxmoadgVar3, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 896) | 1572864, 24582, 48056);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                z16 = z15;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar5 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ut.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.dxjokdxxww(hint, wkgbmnqykcVar5, z16, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 48;
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z14 = z13;
                if (draadjrbmkVarBtonecajqb.iobyxmoadg(z14)) {
                    i17 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                } else {
                    i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                i15 |= i17;
            }
            if ((i15 & 147) == 146) {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(534346813, i15, -1, "ru.myspar.common.view.hint.compose.animation.HintAnimationItem (HintAnimationItem.kt:27)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-918451440);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(context);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.zoijcleaow(wwaezpbzknVar4, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6);
                gtknphoqwx gtknphoqwxVarOxmwwwfdhm4 = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(hint.getType().nufgyqmvbu())), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
                nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(gxszxtbevo(gtknphoqwxVarOxmwwwfdhm4), z15, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                btonecajqb btonecajqbVarGxszxtbevo4 = gxszxtbevo(gtknphoqwxVarOxmwwwfdhm4);
                x.gxszxtbevo gxszxtbevoVarPpxfxbqfkf4 = x.gxszxtbevo.f120816iobyxmoadg.ppxfxbqfkf();
                com.airbnb.lottie.iobyxmoadg iobyxmoadgVar4 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar4 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-918439266);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                m7.eablkybsjg.iobyxmoadg(btonecajqbVarGxszxtbevo4, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVar3, false, false, false, ulzqkzuiruVar4, false, null, null, gxszxtbevoVarPpxfxbqfkf4, false, false, null, iobyxmoadgVar4, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 896) | 1572864, 24582, 48056);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                z16 = z15;
            } else {
                if (i18 != 0) {
                    wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                } else {
                    wkgbmnqykcVar3 = wkgbmnqykcVar2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.ntlheqmsrt(534346813, i15, -1, "ru.myspar.common.view.hint.compose.animation.HintAnimationItem (HintAnimationItem.kt:27)");
                }
                context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
                wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-918451440);
                zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(context);
                objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                } else {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jlmebxxoox.zoijcleaow(wwaezpbzknVar5, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6);
                gtknphoqwx gtknphoqwxVarOxmwwwfdhm5 = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(hint.getType().nufgyqmvbu())), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
                nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(gxszxtbevo(gtknphoqwxVarOxmwwwfdhm5), z15, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
                btonecajqb btonecajqbVarGxszxtbevo5 = gxszxtbevo(gtknphoqwxVarOxmwwwfdhm5);
                x.gxszxtbevo gxszxtbevoVarPpxfxbqfkf5 = x.gxszxtbevo.f120816iobyxmoadg.ppxfxbqfkf();
                com.airbnb.lottie.iobyxmoadg iobyxmoadgVar5 = com.airbnb.lottie.iobyxmoadg.ENABLED;
                com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar5 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-918439266);
                zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
                objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                } else {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                m7.eablkybsjg.iobyxmoadg(btonecajqbVarGxszxtbevo5, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVar3, false, false, false, ulzqkzuiruVar5, false, null, null, gxszxtbevoVarPpxfxbqfkf5, false, false, null, iobyxmoadgVar5, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 896) | 1572864, 24582, 48056);
                if (jyumaefscl.jpowsppfya()) {
                    jyumaefscl.mbcevpiqjq();
                }
                wkgbmnqykcVar2 = wkgbmnqykcVar3;
                z16 = z15;
            }
            a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
            if (a0VarWflxmlrfwp != null) {
                final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar2;
                a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ut.ppxfxbqfkf
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj, Object obj2) {
                        return wkgbmnqykc.dxjokdxxww(hint, wkgbmnqykcVar6, z16, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i15 |= 384;
        z14 = z13;
        if ((i15 & 147) == 146) {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i16 != 0) {
                z15 = true;
            } else {
                z15 = z14;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(534346813, i15, -1, "ru.myspar.common.view.hint.compose.animation.HintAnimationItem (HintAnimationItem.kt:27)");
            }
            context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            wwaezpbzkn wwaezpbzknVar6 = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-918451440);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(context);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.zoijcleaow(wwaezpbzknVar6, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6);
            gtknphoqwx gtknphoqwxVarOxmwwwfdhm6 = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(hint.getType().nufgyqmvbu())), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
            nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(gxszxtbevo(gtknphoqwxVarOxmwwwfdhm6), z15, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
            btonecajqb btonecajqbVarGxszxtbevo6 = gxszxtbevo(gtknphoqwxVarOxmwwwfdhm6);
            x.gxszxtbevo gxszxtbevoVarPpxfxbqfkf6 = x.gxszxtbevo.f120816iobyxmoadg.ppxfxbqfkf();
            com.airbnb.lottie.iobyxmoadg iobyxmoadgVar6 = com.airbnb.lottie.iobyxmoadg.ENABLED;
            com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar6 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-918439266);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            m7.eablkybsjg.iobyxmoadg(btonecajqbVarGxszxtbevo6, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVar3, false, false, false, ulzqkzuiruVar6, false, null, null, gxszxtbevoVarPpxfxbqfkf6, false, false, null, iobyxmoadgVar6, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 896) | 1572864, 24582, 48056);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
            z16 = z15;
        } else {
            if (i18 != 0) {
                wkgbmnqykcVar3 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            } else {
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
            }
            if (i16 != 0) {
                z15 = true;
            } else {
                z15 = z14;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(534346813, i15, -1, "ru.myspar.common.view.hint.compose.animation.HintAnimationItem (HintAnimationItem.kt:27)");
            }
            context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            wwaezpbzkn wwaezpbzknVar7 = wwaezpbzkn.f37140iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-918451440);
            zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(context);
            objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            } else {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: ut.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return wkgbmnqykc.eablkybsjg(context, (ulzqkzuiru) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.zoijcleaow(wwaezpbzknVar7, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 6);
            gtknphoqwx gtknphoqwxVarOxmwwwfdhm7 = ojitshcjhn.oxmwwwfdhm(wflxmlrfwp.zoijcleaow.iobyxmoadg(wflxmlrfwp.zoijcleaow.zoijcleaow(hint.getType().nufgyqmvbu())), null, null, null, null, null, draadjrbmkVarBtonecajqb, 0, 62);
            nufgyqmvbuVarPpxfxbqfkf = m7.iobyxmoadg.ppxfxbqfkf(gxszxtbevo(gtknphoqwxVarOxmwwwfdhm7), z15, false, false, null, 0.0f, 0, null, false, false, draadjrbmkVarBtonecajqb, (i15 >> 3) & 112, 1020);
            btonecajqb btonecajqbVarGxszxtbevo7 = gxszxtbevo(gtknphoqwxVarOxmwwwfdhm7);
            x.gxszxtbevo gxszxtbevoVarPpxfxbqfkf7 = x.gxszxtbevo.f120816iobyxmoadg.ppxfxbqfkf();
            com.airbnb.lottie.iobyxmoadg iobyxmoadgVar7 = com.airbnb.lottie.iobyxmoadg.ENABLED;
            com.airbnb.lottie.ulzqkzuiru ulzqkzuiruVar7 = com.airbnb.lottie.ulzqkzuiru.AUTOMATIC;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-918439266);
            zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(nufgyqmvbuVarPpxfxbqfkf);
            objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru) {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            } else {
                objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ut.zoijcleaow
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return Float.valueOf(wkgbmnqykc.nufgyqmvbu(nufgyqmvbuVarPpxfxbqfkf));
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            m7.eablkybsjg.iobyxmoadg(btonecajqbVarGxszxtbevo7, (tg.iobyxmoadg) objYadqdtsiqt2, wkgbmnqykcVar3, false, false, false, ulzqkzuiruVar7, false, null, null, gxszxtbevoVarPpxfxbqfkf7, false, false, null, iobyxmoadgVar7, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 896) | 1572864, 24582, 48056);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
            z16 = z15;
        }
        a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar7 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ut.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.dxjokdxxww(hint, wkgbmnqykcVar7, z16, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
