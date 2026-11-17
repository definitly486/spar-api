package b61;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.domain.feature.editreceiver.store.State;
import tg.rgvfuqvkyq;
import uz0.nufgyqmvbu;
import w01.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f15385ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final w01.gxszxtbevo f15386wkgbmnqykc;

    /* JADX INFO: renamed from: b61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0259iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f15387jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ b61.ppxfxbqfkf f15388yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f15389zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0259iobyxmoadg(b61.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f15388yggfygwlhe = ppxfxbqfkfVar;
            this.f15387jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C0259iobyxmoadg(this.f15388yggfygwlhe, this.f15387jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f15389zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!(this.f15388yggfygwlhe instanceof b61.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f15387jyumaefscl;
                String orderId = iobyxmoadg.metgxyhuhe(iobyxmoadgVar).getArgs().getOrderId();
                this.f15389zdlpuopuiu = 1;
                if (iobyxmoadgVar.yfnezrywwk(orderId, this) == objGxszxtbevo) {
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
            return ((C0259iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f15390iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f15392yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f15393zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f15392yggfygwlhe = obj;
            this.f15390iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.yfnezrywwk(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f15394iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f15396yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f15397zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f15396yggfygwlhe = obj;
            this.f15394iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f15398jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ b61.wkgbmnqykc f15399yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f15400zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(b61.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f15399yggfygwlhe = wkgbmnqykcVar;
            this.f15398jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f15399yggfygwlhe, this.f15398jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f15400zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                b61.wkgbmnqykc wkgbmnqykcVar = this.f15399yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, b61.wkgbmnqykc.iobyxmoadg.f15405iobyxmoadg)) {
                    this.f15398jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f15370iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof b61.wkgbmnqykc.zoijcleaow) {
                    this.f15398jyumaefscl.ydmasvzmpa(((b61.wkgbmnqykc.zoijcleaow) this.f15399yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof b61.wkgbmnqykc.ppxfxbqfkf) {
                    this.f15398jyumaefscl.sflfametgt(((b61.wkgbmnqykc.ppxfxbqfkf) this.f15399yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof b61.wkgbmnqykc.C0260wkgbmnqykc) {
                    this.f15398jyumaefscl.zfvoamnweg(((b61.wkgbmnqykc.C0260wkgbmnqykc) this.f15399yggfygwlhe).iobyxmoadg());
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, b61.wkgbmnqykc.eablkybsjg.f15404iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f15398jyumaefscl;
                    this.f15400zdlpuopuiu = 1;
                    if (iobyxmoadgVar.oipsdeybqn(this) == objGxszxtbevo) {
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gtknphoqwx getEditOrderUseCase, w01.gxszxtbevo changeReceiverDataUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeReceiverDataUseCase, "changeReceiverDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f15385ppxfxbqfkf = getEditOrderUseCase;
        this.f15386wkgbmnqykc = changeReceiverDataUseCase;
    }

    public static final /* synthetic */ State metgxyhuhe(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object oipsdeybqn(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f15394iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f15394iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f15396yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f15394iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
            State state = (State) jlmebxxoox();
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                w01.gxszxtbevo gxszxtbevoVar2 = this.f15386wkgbmnqykc;
                w01.gxszxtbevo.iobyxmoadg iobyxmoadgVar3 = new w01.gxszxtbevo.iobyxmoadg(state.getArgs().getOrderId(), state.getFirstName(), state.getLastName(), state.getPhone());
                wkgbmnqykcVar.f15397zdlpuopuiu = this;
                wkgbmnqykcVar.f15394iwizpuwonk = 1;
                if (gxszxtbevoVar2.zoijcleaow(iobyxmoadgVar3, wkgbmnqykcVar) == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f15397zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.crxdokpmqz(eablkybsjg.iobyxmoadg.f15370iobyxmoadg);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.bfopjjpdmp(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sflfametgt(String str) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((State) jlmebxxoox()).getLastName(), str)) {
            return;
        }
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(str, mj.kcexrzcfyt.zfvoamnweg(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp(uz0.iobyxmoadg iobyxmoadgVar) {
        nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar.agtfadlqog();
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(nufgyqmvbuVarAgtfadlqog.dxjokdxxww(), mj.kcexrzcfyt.zfvoamnweg(nufgyqmvbuVarAgtfadlqog.dxjokdxxww()), nufgyqmvbuVarAgtfadlqog.btonecajqb(), mj.kcexrzcfyt.zfvoamnweg(nufgyqmvbuVarAgtfadlqog.btonecajqb()), nufgyqmvbuVarAgtfadlqog.gtknphoqwx(), !t11.zoijcleaow.f109309iobyxmoadg.zoijcleaow(nufgyqmvbuVarAgtfadlqog.gtknphoqwx())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa(String str) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((State) jlmebxxoox()).getFirstName(), str)) {
            return;
        }
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(str, mj.kcexrzcfyt.zfvoamnweg(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yfnezrywwk(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f15390iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f15390iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f15392yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f15390iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                gtknphoqwx gtknphoqwxVar = this.f15385ppxfxbqfkf;
                gtknphoqwx.iobyxmoadg iobyxmoadgVar3 = new gtknphoqwx.iobyxmoadg(str);
                ppxfxbqfkfVar.f15393zdlpuopuiu = this;
                ppxfxbqfkfVar.f15390iwizpuwonk = 1;
                objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar3, ppxfxbqfkfVar);
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
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f15393zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((uz0.iobyxmoadg) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.uwvvkdfqfp((uz0.iobyxmoadg) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.bfopjjpdmp(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(String str) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((State) jlmebxxoox()).getPhone(), str)) {
            return;
        }
        ulzqkzuiru(new gxszxtbevo.eablkybsjg(str, !t11.zoijcleaow.f109309iobyxmoadg.zoijcleaow(str)));
    }

    public final void bfopjjpdmp(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
        crxdokpmqz(new eablkybsjg.zoijcleaow(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(b61.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(b61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0259iobyxmoadg(action, this, null), 3, null);
    }
}
