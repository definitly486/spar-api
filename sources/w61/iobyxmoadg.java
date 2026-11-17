package w61;

import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.zdlpuopuiu;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.user.domain.model.UserInfo;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final p11.iobyxmoadg f118883ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zdlpuopuiu f118884wkgbmnqykc;

    /* JADX INFO: renamed from: w61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2956iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f118885jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f118886yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f118887zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2956iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f118886yggfygwlhe = ppxfxbqfkfVar;
            this.f118885jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C2956iobyxmoadg(this.f118886yggfygwlhe, this.f118885jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f118887zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f118886yggfygwlhe, ppxfxbqfkf.iobyxmoadg.f118895iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f118885jyumaefscl;
                this.f118887zdlpuopuiu = 1;
                if (iobyxmoadgVar.ikoacuggdj(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2956iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118888cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118890jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118891yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118892zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118890jyumaefscl = obj;
            this.f118888cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ikoacuggdj(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, p11.iobyxmoadg checkAppUpdateUseCase, zdlpuopuiu getUserInfoUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkAppUpdateUseCase, "checkAppUpdateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserInfoUseCase, "getUserInfoUseCase");
        this.f118883ppxfxbqfkf = checkAppUpdateUseCase;
        this.f118884wkgbmnqykc = getUserInfoUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ikoacuggdj(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        hz0.ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar2;
        UserInfo userInfo;
        String cardNumber;
        boolean z13;
        String cardNumber2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118888cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118888cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f118890jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118888cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f118892zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ppxfxbqfkfVar = (hz0.ppxfxbqfkf) zoijcleaowVar.f118891yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f118892zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            userInfo = (UserInfo) objZoijcleaow;
            String strIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
            String strZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            if (userInfo != null) {
                cardNumber = userInfo.getCardNumber();
            } else {
                cardNumber = null;
            }
            if (cardNumber != null || cardNumber.length() == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z14 = true ^ z13;
            cardNumber2 = userInfo != null ? userInfo.getCardNumber() : null;
            if (cardNumber2 == null) {
                cardNumber2 = "";
            }
            iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(strIobyxmoadg, strZoijcleaow, z14, cardNumber2));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        p11.iobyxmoadg iobyxmoadgVar3 = this.f118883ppxfxbqfkf;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        zoijcleaowVar.f118892zdlpuopuiu = this;
        zoijcleaowVar.f118888cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        hz0.ppxfxbqfkf ppxfxbqfkfVar2 = (hz0.ppxfxbqfkf) objZoijcleaow;
        zdlpuopuiu zdlpuopuiuVar = iobyxmoadgVar.f118884wkgbmnqykc;
        wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
        zoijcleaowVar.f118892zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f118891yggfygwlhe = ppxfxbqfkfVar2;
        zoijcleaowVar.f118888cqumvgiudr = 2;
        Object objZoijcleaow2 = zdlpuopuiuVar.zoijcleaow(wwaezpbzknVar2, zoijcleaowVar);
        if (objZoijcleaow2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = ppxfxbqfkfVar2;
        objZoijcleaow = objZoijcleaow2;
        iobyxmoadgVar2 = iobyxmoadgVar;
        userInfo = (UserInfo) objZoijcleaow;
        String strIobyxmoadg2 = ppxfxbqfkfVar.iobyxmoadg();
        String strZoijcleaow2 = ppxfxbqfkfVar.zoijcleaow();
        if (userInfo != null) {
            cardNumber = userInfo.getCardNumber();
        } else {
            cardNumber = null;
        }
        if (cardNumber != null) {
            z13 = true;
        } else {
            z13 = true;
        }
        boolean z15 = true ^ z13;
        if (userInfo != null) {
        }
        if (cardNumber2 == null) {
            cardNumber2 = "";
        }
        iobyxmoadgVar2.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(strIobyxmoadg2, strZoijcleaow2, z15, cardNumber2));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f118896iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        crxdokpmqz(eablkybsjg.iobyxmoadg.f118878iobyxmoadg);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2956iobyxmoadg(action, this, null), 3, null);
    }
}
