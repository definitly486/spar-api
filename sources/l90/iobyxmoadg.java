package l90;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.user.models.User;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f61934eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ra2.gxszxtbevo f61935gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c90.zoijcleaow f61936ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c90.wkgbmnqykc f61937wkgbmnqykc;

    /* JADX INFO: renamed from: l90.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1257iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f61938jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ l90.ppxfxbqfkf f61939yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61940zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1257iobyxmoadg(l90.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61939yggfygwlhe = ppxfxbqfkfVar;
            this.f61938jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1257iobyxmoadg(this.f61939yggfygwlhe, this.f61938jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61940zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f61939yggfygwlhe, l90.ppxfxbqfkf.iobyxmoadg.f61956iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f61938jyumaefscl;
                this.f61940zdlpuopuiu = 1;
                if (iobyxmoadgVar.metgxyhuhe(this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C1257iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f61941iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f61943yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f61944zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f61943yggfygwlhe = obj;
            this.f61941iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f61946esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f61947iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f61948jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f61949yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f61950zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f61947iwizpuwonk = obj;
            this.f61946esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(false, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f61951jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ l90.wkgbmnqykc f61952yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61953zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(l90.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61952yggfygwlhe = wkgbmnqykcVar;
            this.f61951jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f61952yggfygwlhe, this.f61951jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61953zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                l90.wkgbmnqykc wkgbmnqykcVar = this.f61952yggfygwlhe;
                if (wkgbmnqykcVar instanceof l90.wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f61951jyumaefscl;
                    boolean zIobyxmoadg = ((l90.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg();
                    this.f61953zdlpuopuiu = 1;
                    if (iobyxmoadgVar.rlfsiqarku(zIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, l90.wkgbmnqykc.iobyxmoadg.f61957iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f61951jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f61926iobyxmoadg);
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(c90.zoijcleaow disableEchecksDialogUseCase, c90.wkgbmnqykc receiveDigitalChecksUseCase, ca2.ppxfxbqfkf userRepository, ra2.gxszxtbevo loadUserUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(disableEchecksDialogUseCase, "disableEchecksDialogUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(receiveDigitalChecksUseCase, "receiveDigitalChecksUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loadUserUseCase, "loadUserUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f61936ppxfxbqfkf = disableEchecksDialogUseCase;
        this.f61937wkgbmnqykc = receiveDigitalChecksUseCase;
        this.f61934eablkybsjg = userRepository;
        this.f61935gxszxtbevo = loadUserUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object metgxyhuhe(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f61941iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f61941iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f61943yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f61941iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                ra2.gxszxtbevo gxszxtbevoVar2 = this.f61935gxszxtbevo;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f61944zdlpuopuiu = this;
                ppxfxbqfkfVar.f61941iwizpuwonk = 1;
                objZoijcleaow = gxszxtbevoVar2.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f61944zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((User) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.yfnezrywwk((User) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        User user;
        Object objWkgbmnqykc;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f61946esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f61946esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = wkgbmnqykcVar.f61947iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f61946esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f61934eablkybsjg;
                wkgbmnqykcVar.f61950zdlpuopuiu = this;
                wkgbmnqykcVar.f61948jyumaefscl = z13;
                wkgbmnqykcVar.f61946esjtqupxsv = 1;
                objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(wkgbmnqykcVar);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z13 = wkgbmnqykcVar.f61948jyumaefscl;
                user = (User) wkgbmnqykcVar.f61949yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f61950zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(user);
                } catch (Throwable th3) {
                    th = th3;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    iobyxmoadgVar.uwvvkdfqfp(z13, (User) objWkgbmnqykc);
                }
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
                }
                iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            z13 = wkgbmnqykcVar.f61948jyumaefscl;
            iobyxmoadgVar2 = (iobyxmoadg) wkgbmnqykcVar.f61950zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            } catch (Throwable th4) {
                th = th4;
                iobyxmoadgVar = iobyxmoadgVar2;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        User user2 = (User) objLqeggnwhkg;
        c90.wkgbmnqykc wkgbmnqykcVar2 = iobyxmoadgVar2.f61937wkgbmnqykc;
        c90.wkgbmnqykc.iobyxmoadg iobyxmoadgVar7 = new c90.wkgbmnqykc.iobyxmoadg(z13);
        wkgbmnqykcVar.f61950zdlpuopuiu = iobyxmoadgVar2;
        wkgbmnqykcVar.f61949yggfygwlhe = user2;
        wkgbmnqykcVar.f61948jyumaefscl = z13;
        wkgbmnqykcVar.f61946esjtqupxsv = 2;
        if (wkgbmnqykcVar2.zoijcleaow(iobyxmoadgVar7, wkgbmnqykcVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        user = user2;
        iobyxmoadgVar = iobyxmoadgVar2;
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(user);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.uwvvkdfqfp(z13, (User) objWkgbmnqykc);
        }
        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp(boolean z13, User user) {
        if (z13) {
            String email = user != null ? user.getEmail() : null;
            if (email == null) {
                email = "";
            }
            crxdokpmqz(new eablkybsjg.zoijcleaow(email));
            this.f61936ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        }
        String email2 = user != null ? user.getEmail() : null;
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(z13, email2 != null ? email2 : ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yfnezrywwk(User user) {
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(user.getEmail(), user.getDigitalChecks()));
    }

    public final void czzsidtyhn(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(l90.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1257iobyxmoadg(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(l90.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }
}
