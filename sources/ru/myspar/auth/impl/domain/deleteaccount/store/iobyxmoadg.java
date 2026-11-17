package ru.myspar.auth.impl.domain.deleteaccount.store;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import k30.wflxmlrfwp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jpowsppfya;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.core.domain.models.user.DeleteAccountSmsModel;
import ru.myspar.user.models.User;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f84438btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private auzgnhcxok f84439dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final c20.gxszxtbevo f84440eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ra2.zoijcleaow f84441gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final dt.zoijcleaow f84442lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final o30.gxszxtbevo f84443nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final m20.zoijcleaow f84444ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final m20.iobyxmoadg f84445wkgbmnqykc;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final C1907iobyxmoadg f84434gtknphoqwx = new C1907iobyxmoadg(null);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final int f84433draadjrbmk = 8;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final int f84437wflxmlrfwp = uo.wkgbmnqykc.delete_account_send_code;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final int f84432agtfadlqog = uo.wkgbmnqykc.delete_account;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final int f84435ojitshcjhn = uo.wkgbmnqykc.delete_account_phone_hint;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final int f84436rgvfuqvkyq = uo.wkgbmnqykc.delete_account_phone_after_sms_request_hint;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84447zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f84447zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    ra2.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f84441gxszxtbevo;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f84447zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((User) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            User user = (User) objWkgbmnqykc;
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
            int iIobyxmoadg = iobyxmoadg.f84434gtknphoqwx.iobyxmoadg();
            String phone = user != null ? user.getPhone() : null;
            if (phone == null) {
                phone = "";
            }
            iobyxmoadgVar4.ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.ppxfxbqfkf(iIobyxmoadg, phone));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f84448iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f84450yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84451zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f84450yggfygwlhe = obj;
            this.f84448iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zeieaojujs(this);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.deleteaccount.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1907iobyxmoadg {
        public /* synthetic */ C1907iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return iobyxmoadg.f84437wflxmlrfwp;
        }

        public final int zoijcleaow() {
            return iobyxmoadg.f84435ojitshcjhn;
        }

        private C1907iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84453zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f84453zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.skhdrjzrfn();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(th2, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f84454jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f84455yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84456zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(jpowsppfya jpowsppfyaVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f84455yggfygwlhe = jpowsppfyaVar;
            this.f84454jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f84455yggfygwlhe, this.f84454jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f84456zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            jpowsppfya jpowsppfyaVar = this.f84455yggfygwlhe;
            long j13 = jpowsppfyaVar.f60024zdlpuopuiu - 1000;
            jpowsppfyaVar.f60024zdlpuopuiu = j13;
            this.f84454jyumaefscl.zfvoamnweg(this.f84454jyumaefscl.weqkydbzbr(j13));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84458zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f84458zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.igdgnonuha();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f84460zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f84460zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    m20.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f84444ppxfxbqfkf;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f84460zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((DeleteAccountSmsModel) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar4.iwxlajgraz((DeleteAccountSmsModel) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar4.auzgnhcxok(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f84461iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f84462jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f84463yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f84464zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f84462jyumaefscl = str;
            this.f84461iwizpuwonk = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f84462jyumaefscl, this.f84461iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x006e  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f84463yggfygwlhe;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f84464zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = obj2;
                    iobyxmoadgVar = this.f84461iwizpuwonk;
                    thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.roivzttewh(true);
                        iobyxmoadgVar.auzgnhcxok(thDxjokdxxww);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                zdlpuopuiu.zoijcleaow(obj);
                m20.iobyxmoadg.C1357iobyxmoadg c1357iobyxmoadg = new m20.iobyxmoadg.C1357iobyxmoadg(this.f84462jyumaefscl);
                iobyxmoadg iobyxmoadgVar2 = this.f84461iwizpuwonk;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                m20.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar2.f84445wkgbmnqykc;
                this.f84463yggfygwlhe = 1;
                if (iobyxmoadgVar4.zoijcleaow(c1357iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar6 = this.f84461iwizpuwonk;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                this.f84464zdlpuopuiu = objWkgbmnqykc;
                this.f84463yggfygwlhe = 2;
                if (iobyxmoadgVar6.zeieaojujs(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objWkgbmnqykc;
                objWkgbmnqykc = obj2;
            }
            iobyxmoadgVar = this.f84461iwizpuwonk;
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.roivzttewh(true);
                iobyxmoadgVar.auzgnhcxok(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, m20.zoijcleaow fetchDeleteAccountSmsUseCase, m20.iobyxmoadg deleteAccountConfirmUseCase, c20.gxszxtbevo logoutUseCase, ra2.zoijcleaow getCachedOrRemoteUserUseCase, dt.zoijcleaow dateUtils, o30.gxszxtbevo smsCodeValidator) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fetchDeleteAccountSmsUseCase, "fetchDeleteAccountSmsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteAccountConfirmUseCase, "deleteAccountConfirmUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logoutUseCase, "logoutUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCachedOrRemoteUserUseCase, "getCachedOrRemoteUserUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(smsCodeValidator, "smsCodeValidator");
        this.f84444ppxfxbqfkf = fetchDeleteAccountSmsUseCase;
        this.f84445wkgbmnqykc = deleteAccountConfirmUseCase;
        this.f84440eablkybsjg = logoutUseCase;
        this.f84441gxszxtbevo = getCachedOrRemoteUserUseCase;
        this.f84442lqeggnwhkg = dateUtils;
        this.f84443nufgyqmvbu = smsCodeValidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void auzgnhcxok(Throwable th2) {
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(false));
        crxdokpmqz(new ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.zoijcleaow(th2));
    }

    private final void dvvnrvtcbc(long j13) {
        jpowsppfya jpowsppfyaVar = new jpowsppfya();
        jpowsppfyaVar.f60024zdlpuopuiu = j13;
        this.f84439dxjokdxxww = wflxmlrfwp.wkgbmnqykc(sopmlzcsov(), (110 & 2) != 0 ? 0L : 0L, (110 & 4) != 0 ? 1000L : 0L, (110 & 8) != 0 ? null : null, vg.iobyxmoadg.wkgbmnqykc(j13 / 1000.0f), (110 & 32) != 0 ? new wflxmlrfwp.iobyxmoadg(null) : null, (110 & 64) != 0 ? new wflxmlrfwp.zoijcleaow(null) : null, (110 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new wflxmlrfwp.ppxfxbqfkf(null) : new lqeggnwhkg(null), (110 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new wflxmlrfwp.wkgbmnqykc(null) : new nufgyqmvbu(jpowsppfyaVar, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha() {
        auzgnhcxok auzgnhcxokVar = this.f84439dxjokdxxww;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwxlajgraz(DeleteAccountSmsModel deleteAccountSmsModel) {
        this.f84438btonecajqb = true;
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.gxszxtbevo(f84432agtfadlqog, f84436rgvfuqvkyq));
        LocalDateTime localDateTimeGxszxtbevo = this.f84442lqeggnwhkg.gxszxtbevo(deleteAccountSmsModel.getDateEnd());
        dvvnrvtcbc(ChronoUnit.MILLIS.between(this.f84442lqeggnwhkg.gxszxtbevo(deleteAccountSmsModel.getDateNow()), localDateTimeGxszxtbevo));
    }

    private final void iyctptxqzt() {
        crxdokpmqz(ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.eablkybsjg.f84470iobyxmoadg);
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(true));
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
    }

    private final auzgnhcxok lrnfpwlwnk() {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(null), 3, null);
    }

    private final void nuxfzjnpeb(String str) {
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(true));
        boolean z13 = str.length() == 0;
        if (z13 && !this.f84438btonecajqb) {
            iyctptxqzt();
            return;
        }
        if (z13) {
            roivzttewh(true);
        } else {
            if (z13) {
                return;
            }
            roivzttewh(false);
            oipsdeybqn(str);
        }
    }

    private final void oipsdeybqn(String str) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(str, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void roivzttewh(boolean z13) {
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(false));
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.C1906eablkybsjg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skhdrjzrfn() {
        ulzqkzuiru(ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.nufgyqmvbu.f84427iobyxmoadg);
        igdgnonuha();
    }

    private final void tbqsvytpvh(String str) {
        roivzttewh(false);
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.wkgbmnqykc(str));
    }

    private final void uawqvzlxes(String str) {
        String strIobyxmoadg = this.f84443nufgyqmvbu.iobyxmoadg(str);
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.lqeggnwhkg(strIobyxmoadg));
        crxdokpmqz(new ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.ppxfxbqfkf(strIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String weqkydbzbr(long j13) {
        long j14 = j13 / 1000;
        long j15 = 60;
        String strValueOf = String.valueOf(j14 / j15);
        String strValueOf2 = String.valueOf(j14 % j15);
        return mj.kcexrzcfyt.tbqsvytpvh(strValueOf, 2, '0') + StringUtils.PROCESS_POSTFIX_DELIMITER + mj.kcexrzcfyt.tbqsvytpvh(strValueOf2, 2, '0');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zeieaojujs(lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f84448iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f84448iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f84450yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f84448iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                c20.gxszxtbevo gxszxtbevoVar3 = this.f84440eablkybsjg;
                c20.gxszxtbevo.iobyxmoadg iobyxmoadgVar3 = new c20.gxszxtbevo.iobyxmoadg(false);
                gxszxtbevoVar2.f84451zdlpuopuiu = this;
                gxszxtbevoVar2.f84448iwizpuwonk = 1;
                if (gxszxtbevoVar3.zoijcleaow(iobyxmoadgVar3, gxszxtbevoVar2) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar2.f84451zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.auzgnhcxok(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.zoijcleaow(false));
        d40.iobyxmoadg.f26931iobyxmoadg.zynmafqrjb();
        iobyxmoadgVar.crxdokpmqz(ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.C1909wkgbmnqykc.f84473iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(String str) {
        ulzqkzuiru(new ru.myspar.auth.impl.domain.deleteaccount.store.eablkybsjg.iobyxmoadg(str));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: bfopjjpdmp, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(bp.iobyxmoadg action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof bp.iobyxmoadg.C0304iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        lrnfpwlwnk();
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    public void iobyxmoadg() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(null), 3, null);
        super.iobyxmoadg();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.iobyxmoadg.f84466iobyxmoadg)) {
            crxdokpmqz(ru.myspar.auth.impl.domain.deleteaccount.store.wkgbmnqykc.iobyxmoadg.f84471iobyxmoadg);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.C1908ppxfxbqfkf.f84467iobyxmoadg)) {
            nuxfzjnpeb(((State) jlmebxxoox()).getSmsCode());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.zoijcleaow.f84469iobyxmoadg)) {
            iyctptxqzt();
        } else if (intent instanceof ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.wkgbmnqykc) {
            tbqsvytpvh(((ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.wkgbmnqykc) intent).iobyxmoadg());
        } else {
            if (!(intent instanceof ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.eablkybsjg)) {
                throw new NoWhenBranchMatchedException();
            }
            uawqvzlxes(((ru.myspar.auth.impl.domain.deleteaccount.store.ppxfxbqfkf.eablkybsjg) intent).iobyxmoadg());
        }
    }
}
