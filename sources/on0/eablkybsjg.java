package on0;

import android.text.TextUtils;
import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f.ojitshcjhn;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import io.appmetrica.analytics.BuildConfig;
import j0.l;
import j0.m;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import opjhrmiecq.roivzttewh;
import opjhrmiecq.tbqsvytpvh;
import opjhrmiecq.uawqvzlxes;
import p0.kcexrzcfyt;
import p0.lereixgezr;
import p0.tzroggbefp;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;
import w31.nufgyqmvbu;
import y31.lqeggnwhkg;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final tzroggbefp f73247iobyxmoadg = new tzroggbefp("7", m.iobyxmoadg(1), (l) null, 4, (gtknphoqwx) null);

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f73248iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f73249jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f73250yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73251zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.draadjrbmk draadjrbmkVar, iwxlajgraz iwxlajgrazVar, iwxlajgraz iwxlajgrazVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73250yggfygwlhe = draadjrbmkVar;
            this.f73249jyumaefscl = iwxlajgrazVar;
            this.f73248iwizpuwonk = iwxlajgrazVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f73250yggfygwlhe, this.f73249jyumaefscl, this.f73248iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f73251zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            if (eablkybsjg.gxszxtbevo(this.f73249jyumaefscl) && eablkybsjg.gtknphoqwx(this.f73248iwizpuwonk).draadjrbmk().length() == 0) {
                this.f73250yggfygwlhe.invoke(eablkybsjg.f73247iobyxmoadg);
            } else if (eablkybsjg.gxszxtbevo(this.f73249jyumaefscl) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjg.gtknphoqwx(this.f73248iwizpuwonk).draadjrbmk(), "7")) {
                this.f73250yggfygwlhe.invoke(eablkybsjg.gtknphoqwx(this.f73248iwizpuwonk));
            } else {
                this.f73250yggfygwlhe.invoke(new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f73252zdlpuopuiu;

        zoijcleaow(iwxlajgraz iwxlajgrazVar) {
            this.f73252zdlpuopuiu = iwxlajgrazVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn ppxfxbqfkf(iwxlajgraz iwxlajgrazVar) {
            eablkybsjg.draadjrbmk(iwxlajgrazVar, eablkybsjg.f73247iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            zoijcleaow((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void zoijcleaow(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-2022066010, i13, -1, "ru.myspar.proloyalty.auth.impl.presentation.authorization.compose.components.PhoneNumberInput.<anonymous> (PhoneNumberInput.kt:82)");
            }
            if (eablkybsjg.gtknphoqwx(this.f73252zdlpuopuiu).draadjrbmk().length() > 0) {
                draadjrbmkVar.sopmlzcsov(-1440882381);
                boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(this.f73252zdlpuopuiu);
                final iwxlajgraz iwxlajgrazVar = this.f73252zdlpuopuiu;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: on0.gxszxtbevo
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return eablkybsjg.zoijcleaow.ppxfxbqfkf(iwxlajgrazVar);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                y31.eablkybsjg.wkgbmnqykc(false, false, 0, (tg.iobyxmoadg) objYadqdtsiqt, draadjrbmkVar, 0, 7);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
    }

    private static final void btonecajqb(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draadjrbmk(iwxlajgraz iwxlajgrazVar, tzroggbefp tzroggbefpVar) {
        iwxlajgrazVar.setValue(tzroggbefpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(tzroggbefp tzroggbefpVar, tg.draadjrbmk draadjrbmkVar, tg.iobyxmoadg iobyxmoadgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        eablkybsjg(tzroggbefpVar, draadjrbmkVar, iobyxmoadgVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void eablkybsjg(final tzroggbefp phoneNumber, final tg.draadjrbmk onPhoneNumberChanged, final tg.iobyxmoadg onDoneAction, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onPhoneNumberChanged, "onPhoneNumberChanged");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onDoneAction, "onDoneAction");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(953110196);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(phoneNumber) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onPhoneNumberChanged) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onDoneAction) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(953110196, i14, -1, "ru.myspar.proloyalty.auth.impl.presentation.authorization.compose.components.PhoneNumberInput (PhoneNumberInput.kt:38)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-264912772);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            final iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-264911089);
            boolean z13 = (i14 & 14) == 4;
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = c1.ppxfxbqfkf(phoneNumber, null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            final iwxlajgraz iwxlajgrazVar2 = (iwxlajgraz) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            tzroggbefp tzroggbefpVarGtknphoqwx = gtknphoqwx(iwxlajgrazVar2);
            Boolean boolValueOf = Boolean.valueOf(gxszxtbevo(iwxlajgrazVar));
            draadjrbmkVarBtonecajqb.sopmlzcsov(-264907938);
            boolean zUlzqkzuiru = ((i14 & 112) == 32) | draadjrbmkVarBtonecajqb.ulzqkzuiru(iwxlajgrazVar2);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new iobyxmoadg(onPhoneNumberChanged, iwxlajgrazVar, iwxlajgrazVar2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            jlmebxxoox.wkgbmnqykc(tzroggbefpVarGtknphoqwx, boolValueOf, (rgvfuqvkyq) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, 0);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-264896010);
            Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: on0.iobyxmoadg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return eablkybsjg.wflxmlrfwp(iwxlajgrazVar, (ojitshcjhn) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = nufgyqmvbu.ojitshcjhn(androidx.compose.ui.focus.zoijcleaow.iobyxmoadg(wkgbmnqykcVarNufgyqmvbu, (tg.draadjrbmk) objYadqdtsiqt4), "etPhoneNumber", null, null, false, 14, null);
            tzroggbefp tzroggbefpVarGtknphoqwx2 = gtknphoqwx(iwxlajgrazVar2);
            String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(bn0.eablkybsjg.proloyalty_authorization_phone_hint, draadjrbmkVarBtonecajqb, 0);
            c41.iobyxmoadg iobyxmoadgVar2 = new c41.iobyxmoadg("+# (###) ###-##-##", '#');
            uawqvzlxes uawqvzlxesVar = new uawqvzlxes(0, null, lereixgezr.f75258zoijcleaow.wkgbmnqykc(), kcexrzcfyt.f75246zoijcleaow.zoijcleaow(), null, null, null, BuildConfig.API_LEVEL, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-264841684);
            boolean z14 = (i14 & 896) == 256;
            Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14 || objYadqdtsiqt5 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt5 = new tg.draadjrbmk() { // from class: on0.zoijcleaow
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return eablkybsjg.lqeggnwhkg(onDoneAction, (tbqsvytpvh) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            roivzttewh roivzttewhVar = new roivzttewh((tg.draadjrbmk) objYadqdtsiqt5, null, null, null, null, null, 62, null);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-264891035);
            boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(iwxlajgrazVar2);
            Object objYadqdtsiqt6 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru2 || objYadqdtsiqt6 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt6 = new tg.draadjrbmk() { // from class: on0.ppxfxbqfkf
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return eablkybsjg.nufgyqmvbu(iwxlajgrazVar2, (tzroggbefp) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt6);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            lqeggnwhkg.zoijcleaow(tzroggbefpVarGtknphoqwx2, (tg.draadjrbmk) objYadqdtsiqt6, wkgbmnqykcVarOjitshcjhn, false, false, null, strPpxfxbqfkf, null, null, ezmngbhpjk.nufgyqmvbu.eablkybsjg(-2022066010, true, new zoijcleaow(iwxlajgrazVar2), draadjrbmkVarBtonecajqb, 54), false, iobyxmoadgVar2, uawqvzlxesVar, roivzttewhVar, true, 1, 0, null, null, null, null, draadjrbmkVar2, 805306368, 221568, 0, 2033080);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: on0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return eablkybsjg.dxjokdxxww(phoneNumber, onPhoneNumberChanged, onDoneAction, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tzroggbefp gtknphoqwx(iwxlajgraz iwxlajgrazVar) {
        return (tzroggbefp) iwxlajgrazVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean gxszxtbevo(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, tbqsvytpvh KeyboardActions) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(KeyboardActions, "$this$KeyboardActions");
        iobyxmoadgVar.invoke();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(iwxlajgraz iwxlajgrazVar, tzroggbefp changedFieldValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changedFieldValue, "changedFieldValue");
        String strY = "7";
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mj.kcexrzcfyt.y(changedFieldValue.draadjrbmk(), 1), "7")) {
            changedFieldValue = new tzroggbefp("7" + changedFieldValue.draadjrbmk(), m.iobyxmoadg(l.agtfadlqog(changedFieldValue.gtknphoqwx()) + 1), (l) null, 4, (gtknphoqwx) null);
        }
        if (changedFieldValue.draadjrbmk().length() == 0 || TextUtils.isDigitsOnly(changedFieldValue.draadjrbmk())) {
            int length = changedFieldValue.draadjrbmk().length();
            int i13 = 0;
            for (int i14 = 0; i14 < "+# (###) ###-##-##".length(); i14++) {
                if ("+# (###) ###-##-##".charAt(i14) == '#') {
                    i13++;
                }
            }
            if (length > i13) {
                String strDraadjrbmk = changedFieldValue.draadjrbmk();
                int i15 = 0;
                for (int i16 = 0; i16 < "+# (###) ###-##-##".length(); i16++) {
                    if ("+# (###) ###-##-##".charAt(i16) == '#') {
                        i15++;
                    }
                }
                strY = mj.kcexrzcfyt.y(strDraadjrbmk, i15);
            } else if (changedFieldValue.draadjrbmk().length() != 0) {
                strY = null;
            }
            String str = strY;
            if (str != null) {
                changedFieldValue = new tzroggbefp(str, m.iobyxmoadg(str.length()), (l) null, 4, (gtknphoqwx) null);
            }
            draadjrbmk(iwxlajgrazVar, changedFieldValue);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wflxmlrfwp(iwxlajgraz iwxlajgrazVar, ojitshcjhn it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        btonecajqb(iwxlajgrazVar, it.iobyxmoadg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
