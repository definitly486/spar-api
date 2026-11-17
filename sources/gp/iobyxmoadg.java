package gp;

import gg.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.cllcsxoeiz;
import ru.myspar.auth.api.model.RegistrationArgs;
import ru.myspar.auth.impl.domain.registrationverification.store.State;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.core.error_handler.exceptions.ExistingUserException;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C0865iobyxmoadg f38141lqeggnwhkg = new C0865iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f38142nufgyqmvbu = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final o30.ppxfxbqfkf f38143eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ns.iobyxmoadg f38144gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c20.zoijcleaow f38145ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final o30.eablkybsjg f38146wkgbmnqykc;

    /* JADX INFO: renamed from: gp.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0865iobyxmoadg {
        public /* synthetic */ C0865iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0865iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f38147jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f38148yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f38149zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f38148yggfygwlhe = wkgbmnqykcVar;
            this.f38147jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f38148yggfygwlhe, this.f38147jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f38149zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f38148yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f38160iobyxmoadg)) {
                    this.f38147jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f38131iobyxmoadg);
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f38163iobyxmoadg)) {
                    this.f38147jyumaefscl.crxdokpmqz(eablkybsjg.zoijcleaow.f38135iobyxmoadg);
                    wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ppxfxbqfkf.f38161iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f38147jyumaefscl;
                    State stateMetgxyhuhe = iobyxmoadg.metgxyhuhe(iobyxmoadgVar);
                    this.f38149zdlpuopuiu = 1;
                    if (iobyxmoadgVar.uwvvkdfqfp(stateMetgxyhuhe, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.C0866wkgbmnqykc) {
                    this.f38147jyumaefscl.yfnezrywwk(((wkgbmnqykc.C0866wkgbmnqykc) this.f38148yggfygwlhe).iobyxmoadg());
                    wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.eablkybsjg.f38158iobyxmoadg)) {
                    new eablkybsjg.ppxfxbqfkf(iobyxmoadg.metgxyhuhe(this.f38147jyumaefscl).getResult());
                } else {
                    if (!(wkgbmnqykcVar instanceof wkgbmnqykc.gxszxtbevo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f38147jyumaefscl.ydmasvzmpa(((wkgbmnqykc.gxszxtbevo) this.f38148yggfygwlhe).iobyxmoadg());
                    wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f38150cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f38152jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f38153yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f38154zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f38152jyumaefscl = obj;
            this.f38150cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(c20.zoijcleaow checkRegistrationUseCase, o30.eablkybsjg phoneValidator, o30.ppxfxbqfkf emailValidator, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkRegistrationUseCase, "checkRegistrationUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(phoneValidator, "phoneValidator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(emailValidator, "emailValidator");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f38145ppxfxbqfkf = checkRegistrationUseCase;
        this.f38146wkgbmnqykc = phoneValidator;
        this.f38143eablkybsjg = emailValidator;
        this.f38144gxszxtbevo = dispatchersProvider;
    }

    public static final /* synthetic */ State metgxyhuhe(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oipsdeybqn(Throwable th2) {
        String message;
        if (th2 instanceof ExistingUserException) {
            crxdokpmqz(eablkybsjg.gxszxtbevo.f38130iobyxmoadg);
            return;
        }
        boolean z13 = th2 instanceof DomainException;
        if (z13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((DomainException) th2).getCode(), "email_already_exists")) {
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(t10.ppxfxbqfkf.TAKEN));
            return;
        }
        if (!z13 || ((message = th2.getMessage()) != null && message.length() != 0)) {
            sflfametgt(th2);
        } else {
            crxdokpmqz(eablkybsjg.lqeggnwhkg.f38132iobyxmoadg);
            sflfametgt(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(State state, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f38150cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f38150cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f38152jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f38150cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                c20.zoijcleaow zoijcleaowVar2 = this.f38145ppxfxbqfkf;
                c20.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new c20.zoijcleaow.iobyxmoadg(state.getPhoneNumber(), state.getEmail());
                zoijcleaowVar.f38154zdlpuopuiu = this;
                zoijcleaowVar.f38153yggfygwlhe = state;
                zoijcleaowVar.f38150cqumvgiudr = 1;
                objZoijcleaow = zoijcleaowVar2.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
                if (objZoijcleaow == objGxszxtbevo) {
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
            state = (State) zoijcleaowVar.f38153yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f38154zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((vdvldrhtss) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.zfvoamnweg((vdvldrhtss) objWkgbmnqykc, state);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.oipsdeybqn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uwvvkdfqfp(State state, lg.gxszxtbevo gxszxtbevoVar) {
        if (!this.f38146wkgbmnqykc.iobyxmoadg(state.getPhoneNumber())) {
            ulzqkzuiru(new gxszxtbevo.eablkybsjg(true));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (this.f38143eablkybsjg.iobyxmoadg(state.getEmail())) {
            Object objRlfsiqarku = rlfsiqarku(state, gxszxtbevoVar);
            return objRlfsiqarku == mg.zoijcleaow.gxszxtbevo() ? objRlfsiqarku : wwaezpbzkn.f37140iobyxmoadg;
        }
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(t10.ppxfxbqfkf.VALIDATION));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa(String str) {
        ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(str));
        if (this.f38146wkgbmnqykc.iobyxmoadg(str) && ((State) jlmebxxoox()).getPhoneNumberErrorIsVisible()) {
            ulzqkzuiru(new gxszxtbevo.eablkybsjg(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yfnezrywwk(String str) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(str));
        if (this.f38143eablkybsjg.iobyxmoadg(str)) {
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(t10.ppxfxbqfkf.NONE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(vdvldrhtss vdvldrhtssVar, State state) {
        crxdokpmqz(new eablkybsjg.wkgbmnqykc(new RegistrationArgs(state.getPhoneNumber(), state.getEmail(), ((t10.wkgbmnqykc) vdvldrhtssVar.lqeggnwhkg()).iobyxmoadg(), ((Boolean) vdvldrhtssVar.nufgyqmvbu()).booleanValue(), state.getResult())));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    public final void sflfametgt(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        crxdokpmqz(new eablkybsjg.C0864eablkybsjg(error));
    }
}
