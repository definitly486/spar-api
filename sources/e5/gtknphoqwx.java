package e5;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;
import v2.esjtqupxsv;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f30481cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f30482esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ View f30483iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f30484jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ esjtqupxsv f30485yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f30486zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(esjtqupxsv esjtqupxsvVar, rgvfuqvkyq rgvfuqvkyqVar, View view, iwxlajgraz iwxlajgrazVar, rgvfuqvkyq rgvfuqvkyqVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f30485yggfygwlhe = esjtqupxsvVar;
            this.f30484jyumaefscl = rgvfuqvkyqVar;
            this.f30483iwizpuwonk = view;
            this.f30481cqumvgiudr = iwxlajgrazVar;
            this.f30482esjtqupxsv = rgvfuqvkyqVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f30485yggfygwlhe, this.f30484jyumaefscl, this.f30483iwizpuwonk, this.f30481cqumvgiudr, this.f30482esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f30486zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            esjtqupxsv esjtqupxsvVarJyumaefscl = gtknphoqwx.jyumaefscl(this.f30481cqumvgiudr);
            if (esjtqupxsvVarJyumaefscl != null) {
                rgvfuqvkyq rgvfuqvkyqVar = this.f30482esjtqupxsv;
                View view = this.f30483iwizpuwonk;
                iwxlajgraz iwxlajgrazVar = this.f30481cqumvgiudr;
                if (esjtqupxsvVarJyumaefscl.kcexrzcfyt(27)) {
                    rgvfuqvkyqVar.invoke(esjtqupxsvVarJyumaefscl, view);
                }
                gtknphoqwx.iwizpuwonk(iwxlajgrazVar, null);
            }
            if (this.f30485yggfygwlhe.kcexrzcfyt(27)) {
                this.f30484jyumaefscl.invoke(this.f30485yggfygwlhe, this.f30483iwizpuwonk);
                gtknphoqwx.iwizpuwonk(this.f30481cqumvgiudr, this.f30485yggfygwlhe);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn agtfadlqog(esjtqupxsv esjtqupxsvVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, int i15, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i16) {
        gtknphoqwx(esjtqupxsvVar, wkgbmnqykcVar, i13, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View cqumvgiudr(tg.draadjrbmk draadjrbmkVar, iwxlajgraz iwxlajgrazVar, Context it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        View view = (View) draadjrbmkVar.invoke(it);
        yggfygwlhe(iwxlajgrazVar, view);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurfaceView draadjrbmk(Context it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return new SurfaceView(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(View it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void gtknphoqwx(final esjtqupxsv player, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        int i16;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(player, "player");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(12998269);
        if ((i15 & 1) != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.lmojexxdyd(player) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 32 : 16;
        }
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i16 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i18 != 0) {
                i13 = 1;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(12998269, i16, -1, "androidx.media3.ui.compose.PlayerSurface (PlayerSurface.kt:53)");
            }
            if (i13 == 1) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-316865792);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-316863549);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: e5.iobyxmoadg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return gtknphoqwx.draadjrbmk((Context) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-316862012);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt2 = new rgvfuqvkyq() { // from class: e5.zoijcleaow
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return gtknphoqwx.ojitshcjhn((esjtqupxsv) obj, (SurfaceView) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-316859322);
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                    objYadqdtsiqt3 = new rgvfuqvkyq() { // from class: e5.ppxfxbqfkf
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return gtknphoqwx.rgvfuqvkyq((esjtqupxsv) obj, (SurfaceView) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kcexrzcfyt(player, wkgbmnqykcVar, draadjrbmkVar2, rgvfuqvkyqVar, (rgvfuqvkyq) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, (i16 & 14) | 28032 | (i16 & 112));
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (i13 != 2) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-316846887);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new IllegalArgumentException("Unrecognized surface type: " + i13);
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(-316855808);
                draadjrbmkVarBtonecajqb.sopmlzcsov(-316853565);
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar2 = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
                if (objYadqdtsiqt4 == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: e5.wkgbmnqykc
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return gtknphoqwx.vdvldrhtss((Context) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-316852028);
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt5 == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt5 = new rgvfuqvkyq() { // from class: e5.eablkybsjg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return gtknphoqwx.oxmwwwfdhm((esjtqupxsv) obj, (TextureView) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                rgvfuqvkyq rgvfuqvkyqVar2 = (rgvfuqvkyq) objYadqdtsiqt5;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-316849338);
                Object objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt6 == iobyxmoadgVar2.iobyxmoadg()) {
                    objYadqdtsiqt6 = new rgvfuqvkyq() { // from class: e5.gxszxtbevo
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return gtknphoqwx.wflxmlrfwp((esjtqupxsv) obj, (TextureView) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                kcexrzcfyt(player, wkgbmnqykcVar, draadjrbmkVar3, rgvfuqvkyqVar2, (rgvfuqvkyq) objYadqdtsiqt6, draadjrbmkVarBtonecajqb, (i16 & 14) | 28032 | (i16 & 112));
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        final int i19 = i13;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: e5.lqeggnwhkg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.agtfadlqog(player, wkgbmnqykcVar2, i19, i14, i15, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iwizpuwonk(iwxlajgraz iwxlajgrazVar, esjtqupxsv esjtqupxsvVar) {
        iwxlajgrazVar.setValue(esjtqupxsvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final esjtqupxsv jyumaefscl(iwxlajgraz iwxlajgrazVar) {
        return (esjtqupxsv) iwxlajgrazVar.getValue();
    }

    private static final void kcexrzcfyt(final esjtqupxsv esjtqupxsvVar, final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tg.draadjrbmk draadjrbmkVar, final rgvfuqvkyq rgvfuqvkyqVar, final rgvfuqvkyq rgvfuqvkyqVar2, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar3;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(921581664);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(esjtqupxsvVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(draadjrbmkVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(rgvfuqvkyqVar2) ? 16384 : 8192;
        }
        if ((i14 & 9363) == 9362 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(921581664, i14, -1, "androidx.media3.ui.compose.PlayerSurfaceInternal (PlayerSurface.kt:82)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1838683342);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(null, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            final iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1838681289);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = c1.ppxfxbqfkf(null, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            iwxlajgraz iwxlajgrazVar2 = (iwxlajgraz) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1838679147);
            boolean z13 = (i14 & 896) == 256;
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: e5.nufgyqmvbu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gtknphoqwx.cqumvgiudr(draadjrbmkVar, iwxlajgrazVar, (Context) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1838677521);
            Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: e5.dxjokdxxww
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return gtknphoqwx.esjtqupxsv((View) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.viewinterop.eablkybsjg.zoijcleaow(draadjrbmkVar4, wkgbmnqykcVar, (tg.draadjrbmk) objYadqdtsiqt4, null, null, draadjrbmkVarBtonecajqb, (i14 & 112) | 384, 24);
            View viewZdlpuopuiu = zdlpuopuiu(iwxlajgrazVar);
            if (viewZdlpuopuiu == null) {
                draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
            } else {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-898423831);
                boolean zLmojexxdyd = ((57344 & i14) == 16384) | draadjrbmkVarBtonecajqb.lmojexxdyd(viewZdlpuopuiu) | draadjrbmkVarBtonecajqb.lmojexxdyd(esjtqupxsvVar) | ((i14 & 7168) == 2048);
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                    draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                    iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(esjtqupxsvVar, rgvfuqvkyqVar, viewZdlpuopuiu, iwxlajgrazVar2, rgvfuqvkyqVar2, null);
                    draadjrbmkVar3.jyumaefscl(iobyxmoadgVar2);
                    objYadqdtsiqt5 = iobyxmoadgVar2;
                } else {
                    draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                }
                draadjrbmkVar3.stevsuqkhv();
                jlmebxxoox.wkgbmnqykc(viewZdlpuopuiu, esjtqupxsvVar, (rgvfuqvkyq) objYadqdtsiqt5, draadjrbmkVar3, (i14 << 3) & 112);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: e5.btonecajqb
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gtknphoqwx.lereixgezr(esjtqupxsvVar, wkgbmnqykcVar, draadjrbmkVar, rgvfuqvkyqVar, rgvfuqvkyqVar2, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(esjtqupxsv esjtqupxsvVar, androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        kcexrzcfyt(esjtqupxsvVar, wkgbmnqykcVar, draadjrbmkVar, rgvfuqvkyqVar, rgvfuqvkyqVar2, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ojitshcjhn(esjtqupxsv player, SurfaceView view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(player, "player");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        player.btonecajqb(view);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oxmwwwfdhm(esjtqupxsv player, TextureView view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(player, "player");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        player.lereixgezr(view);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rgvfuqvkyq(esjtqupxsv player, SurfaceView view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(player, "player");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        player.ulzqkzuiru(view);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureView vdvldrhtss(Context it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        return new TextureView(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(esjtqupxsv player, TextureView view) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(player, "player");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        player.hcddaimhww(view);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final void yggfygwlhe(iwxlajgraz iwxlajgrazVar, View view) {
        iwxlajgrazVar.setValue(view);
    }

    private static final View zdlpuopuiu(iwxlajgraz iwxlajgrazVar) {
        return (View) iwxlajgrazVar.getValue();
    }
}
