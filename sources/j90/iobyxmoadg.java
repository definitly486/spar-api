package j90;

import gg.cqumvgiudr;
import gg.kcexrzcfyt;
import gg.vdvldrhtss;
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
    private final ca2.ppxfxbqfkf f50885eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final c90.eablkybsjg f50886gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c90.zoijcleaow f50887ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c90.wkgbmnqykc f50888wkgbmnqykc;

    /* JADX INFO: renamed from: j90.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1095iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f50889jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f50890yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f50891zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1095iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f50890yggfygwlhe = wkgbmnqykcVar;
            this.f50889jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1095iobyxmoadg(this.f50890yggfygwlhe, this.f50889jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f50891zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f50890yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f50900iobyxmoadg)) {
                    this.f50889jyumaefscl.xrmfcynszj();
                } else {
                    if (!(wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f50889jyumaefscl;
                    boolean zIobyxmoadg = ((wkgbmnqykc.zoijcleaow) this.f50890yggfygwlhe).iobyxmoadg();
                    this.f50891zdlpuopuiu = 1;
                    if (iobyxmoadgVar.metgxyhuhe(zIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
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
            return ((C1095iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f50893esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f50894iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f50895jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f50896yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f50897zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f50894iwizpuwonk = obj;
            this.f50893esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.metgxyhuhe(false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(c90.zoijcleaow disableEchecksDialogUseCase, c90.wkgbmnqykc receiveDigitalChecksUseCase, ca2.ppxfxbqfkf userRepository, c90.eablkybsjg updateNextRateDateUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(disableEchecksDialogUseCase, "disableEchecksDialogUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(receiveDigitalChecksUseCase, "receiveDigitalChecksUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateNextRateDateUseCase, "updateNextRateDateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f50887ppxfxbqfkf = disableEchecksDialogUseCase;
        this.f50888wkgbmnqykc = receiveDigitalChecksUseCase;
        this.f50885eablkybsjg = userRepository;
        this.f50886gxszxtbevo = updateNextRateDateUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jztzpxfvev(vdvldrhtss vdvldrhtssVar) {
        User user = (User) vdvldrhtssVar.iobyxmoadg();
        boolean zBooleanValue = ((Boolean) vdvldrhtssVar.wkgbmnqykc()).booleanValue();
        String email = user != null ? user.getEmail() : null;
        if (email == null) {
            email = "";
        }
        if (!zBooleanValue || email.length() <= 0) {
            return;
        }
        this.f50887ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(email));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object metgxyhuhe(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2;
        User user;
        Object objWkgbmnqykc;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f50893esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f50893esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = zoijcleaowVar.f50894iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f50893esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true, false));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f50885eablkybsjg;
                zoijcleaowVar.f50897zdlpuopuiu = this;
                zoijcleaowVar.f50895jyumaefscl = z13;
                zoijcleaowVar.f50893esjtqupxsv = 1;
                objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(zoijcleaowVar);
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
                z13 = zoijcleaowVar.f50895jyumaefscl;
                user = (User) zoijcleaowVar.f50896yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f50897zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(cqumvgiudr.iobyxmoadg(user, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13)));
                } catch (Throwable th3) {
                    th = th3;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
                if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    iobyxmoadgVar.jztzpxfvev((vdvldrhtss) objWkgbmnqykc);
                }
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    iobyxmoadgVar.crxdokpmqz(new eablkybsjg.zoijcleaow(thDxjokdxxww));
                }
                iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false, true));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            z13 = zoijcleaowVar.f50895jyumaefscl;
            iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f50897zdlpuopuiu;
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
        c90.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar2.f50888wkgbmnqykc;
        c90.wkgbmnqykc.iobyxmoadg iobyxmoadgVar7 = new c90.wkgbmnqykc.iobyxmoadg(z13);
        zoijcleaowVar.f50897zdlpuopuiu = iobyxmoadgVar2;
        zoijcleaowVar.f50896yggfygwlhe = user2;
        zoijcleaowVar.f50895jyumaefscl = z13;
        zoijcleaowVar.f50893esjtqupxsv = 2;
        if (wkgbmnqykcVar.zoijcleaow(iobyxmoadgVar7, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        user = user2;
        iobyxmoadgVar = iobyxmoadgVar2;
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(cqumvgiudr.iobyxmoadg(user, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13)));
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.jztzpxfvev((vdvldrhtss) objWkgbmnqykc);
        }
        thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.zoijcleaow(thDxjokdxxww));
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false, true));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj() {
        this.f50886gxszxtbevo.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        crxdokpmqz(eablkybsjg.iobyxmoadg.f50880iobyxmoadg);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1095iobyxmoadg(intent, this, null), 3, null);
    }
}
