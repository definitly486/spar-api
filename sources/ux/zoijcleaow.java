package ux;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.vdvldrhtss;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import pj.ageimvtcrz;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.ikoacuggdj;
import q2.kcexrzcfyt;
import tg.rgvfuqvkyq;
import y50.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ i1 f114581iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ws.zoijcleaow f114582jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f114583yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f114584zdlpuopuiu;

        /* JADX INFO: renamed from: ux.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2843iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ i1 f114585jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ws.zoijcleaow f114586yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f114587zdlpuopuiu;

            /* JADX INFO: renamed from: ux.zoijcleaow$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2844iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ i1 f114588jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ ws.zoijcleaow f114589yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f114590zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2844iobyxmoadg(ws.zoijcleaow zoijcleaowVar, i1 i1Var, gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f114589yggfygwlhe = zoijcleaowVar;
                    this.f114588jyumaefscl = i1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                    return new C2844iobyxmoadg(this.f114589yggfygwlhe, this.f114588jyumaefscl, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f114590zdlpuopuiu;
                    if (i13 == 0) {
                        zdlpuopuiu.zoijcleaow(obj);
                        ws.zoijcleaow zoijcleaowVar = this.f114589yggfygwlhe;
                        tg.draadjrbmk draadjrbmkVarWkgbmnqykc = zoijcleaow.wkgbmnqykc(this.f114588jyumaefscl);
                        this.f114590zdlpuopuiu = 1;
                        if (zoijcleaowVar.wypolnanlu(draadjrbmkVarWkgbmnqykc, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // tg.rgvfuqvkyq
                public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                    return ((C2844iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2843iobyxmoadg(ws.zoijcleaow zoijcleaowVar, i1 i1Var, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f114586yggfygwlhe = zoijcleaowVar;
                this.f114585jyumaefscl = i1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C2843iobyxmoadg(this.f114586yggfygwlhe, this.f114585jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f114587zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    ageimvtcrz ageimvtcrzVarXrmfcynszj = ikoacuggdj.ppxfxbqfkf().xrmfcynszj();
                    C2844iobyxmoadg c2844iobyxmoadg = new C2844iobyxmoadg(this.f114586yggfygwlhe, this.f114585jyumaefscl, null);
                    this.f114587zdlpuopuiu = 1;
                    if (dxjokdxxww.lqeggnwhkg(ageimvtcrzVarXrmfcynszj, c2844iobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C2843iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(vdvldrhtss vdvldrhtssVar, ws.zoijcleaow zoijcleaowVar, i1 i1Var, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f114583yggfygwlhe = vdvldrhtssVar;
            this.f114582jyumaefscl = zoijcleaowVar;
            this.f114581iwizpuwonk = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f114583yggfygwlhe, this.f114582jyumaefscl, this.f114581iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f114584zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                vdvldrhtss vdvldrhtssVar = this.f114583yggfygwlhe;
                gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
                C2843iobyxmoadg c2843iobyxmoadg = new C2843iobyxmoadg(this.f114582jyumaefscl, this.f114581iwizpuwonk, null);
                this.f114584zdlpuopuiu = 1;
                if (lmojexxdyd.zoijcleaow(vdvldrhtssVar, zoijcleaowVar, c2843iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ux.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2845zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Object f114591yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f114592zdlpuopuiu;

        C2845zoijcleaow(tg.vdvldrhtss vdvldrhtssVar, Object obj) {
            this.f114592zdlpuopuiu = vdvldrhtssVar;
            this.f114591yggfygwlhe = obj;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1723599068, i13, -1, "ru.myspar.core.base.mvi.compose.BaseMviScreen.<anonymous>.<anonymous> (BaseMviScreen.kt:39)");
            }
            this.f114592zdlpuopuiu.invoke(this.f114591yggfygwlhe, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(ws.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, tg.vdvldrhtss vdvldrhtssVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        zoijcleaow(zoijcleaowVar, draadjrbmkVar, vdvldrhtssVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final Object ppxfxbqfkf(i1 i1Var) {
        return i1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tg.draadjrbmk wkgbmnqykc(i1 i1Var) {
        return (tg.draadjrbmk) i1Var.getValue();
    }

    public static final void zoijcleaow(final ws.zoijcleaow binder, final tg.draadjrbmk onLabel, final tg.vdvldrhtss content, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binder, "binder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onLabel, "onLabel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(621030853);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? draadjrbmkVarBtonecajqb.ulzqkzuiru(binder) : draadjrbmkVarBtonecajqb.lmojexxdyd(binder) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onLabel) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(content) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = i14;
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(621030853, i15, -1, "ru.myspar.core.base.mvi.compose.BaseMviScreen (BaseMviScreen.kt:23)");
            }
            i1 i1VarZoijcleaow = q2.iobyxmoadg.zoijcleaow(binder.cqumvgiudr(), null, null, null, null, draadjrbmkVarBtonecajqb, 48, 14);
            i1 i1VarAgtfadlqog = v0.agtfadlqog(onLabel, draadjrbmkVarBtonecajqb, (i15 >> 3) & 14);
            Context context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) draadjrbmkVarBtonecajqb.ojitshcjhn(kcexrzcfyt.ppxfxbqfkf());
            gtknphoqwx lifecycle = vdvldrhtssVar.getLifecycle();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-466213173);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && draadjrbmkVarBtonecajqb.lmojexxdyd(binder))) | draadjrbmkVarBtonecajqb.ulzqkzuiru(i1VarAgtfadlqog);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(vdvldrhtssVar, binder, i1VarAgtfadlqog, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.eablkybsjg(lifecycle, (rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVarBtonecajqb, 0);
            Object objPpxfxbqfkf = ppxfxbqfkf(i1VarZoijcleaow);
            if (objPpxfxbqfkf != null) {
                y50.zoijcleaow.zoijcleaow(nufgyqmvbu.f123927yggfygwlhe.iobyxmoadg(c60.zoijcleaow.eablkybsjg(context)), ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1723599068, true, new C2845zoijcleaow(content, objPpxfxbqfkf), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 48);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ux.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.eablkybsjg(binder, onLabel, content, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
