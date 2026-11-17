package rw0;

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
import l41.nufgyqmvbu;
import lg.gxszxtbevo;
import p41.ppxfxbqfkf;
import pj.ageimvtcrz;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.ikoacuggdj;
import q2.kcexrzcfyt;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ i1 f104971iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ pr0.zoijcleaow f104972jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f104973yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f104974zdlpuopuiu;

        /* JADX INFO: renamed from: rw0.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C2544iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ i1 f104975jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ pr0.zoijcleaow f104976yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f104977zdlpuopuiu;

            /* JADX INFO: renamed from: rw0.zoijcleaow$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2545iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ i1 f104978jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ pr0.zoijcleaow f104979yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f104980zdlpuopuiu;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2545iobyxmoadg(pr0.zoijcleaow zoijcleaowVar, i1 i1Var, gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f104979yggfygwlhe = zoijcleaowVar;
                    this.f104978jyumaefscl = i1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                    return new C2545iobyxmoadg(this.f104979yggfygwlhe, this.f104978jyumaefscl, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f104980zdlpuopuiu;
                    if (i13 == 0) {
                        zdlpuopuiu.zoijcleaow(obj);
                        pr0.zoijcleaow zoijcleaowVar = this.f104979yggfygwlhe;
                        tg.draadjrbmk draadjrbmkVarWkgbmnqykc = zoijcleaow.wkgbmnqykc(this.f104978jyumaefscl);
                        this.f104980zdlpuopuiu = 1;
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
                    return ((C2545iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2544iobyxmoadg(pr0.zoijcleaow zoijcleaowVar, i1 i1Var, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f104976yggfygwlhe = zoijcleaowVar;
                this.f104975jyumaefscl = i1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C2544iobyxmoadg(this.f104976yggfygwlhe, this.f104975jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f104977zdlpuopuiu;
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    ageimvtcrz ageimvtcrzVarXrmfcynszj = ikoacuggdj.ppxfxbqfkf().xrmfcynszj();
                    C2545iobyxmoadg c2545iobyxmoadg = new C2545iobyxmoadg(this.f104976yggfygwlhe, this.f104975jyumaefscl, null);
                    this.f104977zdlpuopuiu = 1;
                    if (dxjokdxxww.lqeggnwhkg(ageimvtcrzVarXrmfcynszj, c2545iobyxmoadg, this) == objGxszxtbevo) {
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
                return ((C2544iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(vdvldrhtss vdvldrhtssVar, pr0.zoijcleaow zoijcleaowVar, i1 i1Var, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f104973yggfygwlhe = vdvldrhtssVar;
            this.f104972jyumaefscl = zoijcleaowVar;
            this.f104971iwizpuwonk = i1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f104973yggfygwlhe, this.f104972jyumaefscl, this.f104971iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f104974zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                vdvldrhtss vdvldrhtssVar = this.f104973yggfygwlhe;
                gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
                C2544iobyxmoadg c2544iobyxmoadg = new C2544iobyxmoadg(this.f104972jyumaefscl, this.f104971iwizpuwonk, null);
                this.f104974zdlpuopuiu = 1;
                if (lmojexxdyd.zoijcleaow(vdvldrhtssVar, zoijcleaowVar, c2544iobyxmoadg, this) == objGxszxtbevo) {
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

    /* JADX INFO: renamed from: rw0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2546zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Object f104981yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.vdvldrhtss f104982zdlpuopuiu;

        C2546zoijcleaow(tg.vdvldrhtss vdvldrhtssVar, Object obj) {
            this.f104982zdlpuopuiu = vdvldrhtssVar;
            this.f104981yggfygwlhe = obj;
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
                jyumaefscl.ntlheqmsrt(440179535, i13, -1, "ru.myspar.proloyalty.core.base.mvi.compose.BaseMviScreen.<anonymous>.<anonymous> (BaseMviScreen.kt:39)");
            }
            this.f104982zdlpuopuiu.invoke(this.f104981yggfygwlhe, draadjrbmkVar, 0);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(pr0.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, tg.vdvldrhtss vdvldrhtssVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
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

    public static final void zoijcleaow(final pr0.zoijcleaow binder, final tg.draadjrbmk onLabel, final tg.vdvldrhtss content, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(binder, "binder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onLabel, "onLabel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(content, "content");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(102213134);
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
                jyumaefscl.ntlheqmsrt(102213134, i15, -1, "ru.myspar.proloyalty.core.base.mvi.compose.BaseMviScreen (BaseMviScreen.kt:23)");
            }
            i1 i1VarZoijcleaow = q2.iobyxmoadg.zoijcleaow(binder.cqumvgiudr(), null, null, null, null, draadjrbmkVarBtonecajqb, 48, 14);
            i1 i1VarAgtfadlqog = v0.agtfadlqog(onLabel, draadjrbmkVarBtonecajqb, (i15 >> 3) & 14);
            Context context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) draadjrbmkVarBtonecajqb.ojitshcjhn(kcexrzcfyt.ppxfxbqfkf());
            gtknphoqwx lifecycle = vdvldrhtssVar.getLifecycle();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1048806296);
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
                l41.zoijcleaow.zoijcleaow(nufgyqmvbu.f61589yggfygwlhe.iobyxmoadg(ppxfxbqfkf.eablkybsjg(context)), ezmngbhpjk.nufgyqmvbu.eablkybsjg(440179535, true, new C2546zoijcleaow(content, objPpxfxbqfkf), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, 48);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: rw0.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return zoijcleaow.eablkybsjg(binder, onLabel, content, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
