package p70;

import e10.nufgyqmvbu;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import o20.btonecajqb;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.domain.feature.editreceiver.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final btonecajqb f75888ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final o20.gxszxtbevo f75889wkgbmnqykc;

    /* JADX INFO: renamed from: p70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1670iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f75890jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ p70.ppxfxbqfkf f75891yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75892zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1670iobyxmoadg(p70.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f75891yggfygwlhe = ppxfxbqfkfVar;
            this.f75890jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1670iobyxmoadg(this.f75891yggfygwlhe, this.f75890jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75892zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!(this.f75891yggfygwlhe instanceof p70.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f75890jyumaefscl;
                String orderId = iobyxmoadg.metgxyhuhe(iobyxmoadgVar).getArgs().getOrderId();
                this.f75892zdlpuopuiu = 1;
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
            return ((C1670iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75893iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75895yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75896zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75895yggfygwlhe = obj;
            this.f75893iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.yfnezrywwk(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f75897iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f75899yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75900zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75899yggfygwlhe = obj;
            this.f75897iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f75901jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ p70.wkgbmnqykc f75902yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f75903zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(p70.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f75902yggfygwlhe = wkgbmnqykcVar;
            this.f75901jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f75902yggfygwlhe, this.f75901jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f75903zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                p70.wkgbmnqykc wkgbmnqykcVar = this.f75902yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, p70.wkgbmnqykc.iobyxmoadg.f75908iobyxmoadg)) {
                    this.f75901jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f75873iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof p70.wkgbmnqykc.zoijcleaow) {
                    this.f75901jyumaefscl.ydmasvzmpa(((p70.wkgbmnqykc.zoijcleaow) this.f75902yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof p70.wkgbmnqykc.ppxfxbqfkf) {
                    this.f75901jyumaefscl.sflfametgt(((p70.wkgbmnqykc.ppxfxbqfkf) this.f75902yggfygwlhe).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof p70.wkgbmnqykc.C1671wkgbmnqykc) {
                    this.f75901jyumaefscl.zfvoamnweg(((p70.wkgbmnqykc.C1671wkgbmnqykc) this.f75902yggfygwlhe).iobyxmoadg());
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, p70.wkgbmnqykc.eablkybsjg.f75907iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f75901jyumaefscl;
                    this.f75903zdlpuopuiu = 1;
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
    public iobyxmoadg(btonecajqb getEditOrderUseCase, o20.gxszxtbevo changeReceiverDataUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeReceiverDataUseCase, "changeReceiverDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f75888ppxfxbqfkf = getEditOrderUseCase;
        this.f75889wkgbmnqykc = changeReceiverDataUseCase;
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
            int i13 = wkgbmnqykcVar.f75897iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f75897iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object obj = wkgbmnqykcVar.f75899yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f75897iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
            State state = (State) jlmebxxoox();
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                o20.gxszxtbevo gxszxtbevoVar2 = this.f75889wkgbmnqykc;
                o20.gxszxtbevo.iobyxmoadg iobyxmoadgVar3 = new o20.gxszxtbevo.iobyxmoadg(state.getArgs().getOrderId(), state.getFirstName(), state.getLastName(), state.getPhone());
                wkgbmnqykcVar.f75900zdlpuopuiu = this;
                wkgbmnqykcVar.f75897iwizpuwonk = 1;
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
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f75900zdlpuopuiu;
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
            iobyxmoadgVar.crxdokpmqz(eablkybsjg.iobyxmoadg.f75873iobyxmoadg);
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
    public final void uwvvkdfqfp(e10.iobyxmoadg iobyxmoadgVar) {
        nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar.agtfadlqog();
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(nufgyqmvbuVarAgtfadlqog.dxjokdxxww(), mj.kcexrzcfyt.zfvoamnweg(nufgyqmvbuVarAgtfadlqog.dxjokdxxww()), nufgyqmvbuVarAgtfadlqog.btonecajqb(), mj.kcexrzcfyt.zfvoamnweg(nufgyqmvbuVarAgtfadlqog.btonecajqb()), nufgyqmvbuVarAgtfadlqog.gtknphoqwx(), !n30.ppxfxbqfkf.f68498iobyxmoadg.zoijcleaow(nufgyqmvbuVarAgtfadlqog.gtknphoqwx())));
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
            int i13 = ppxfxbqfkfVar.f75893iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f75893iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f75895yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f75893iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                btonecajqb btonecajqbVar = this.f75888ppxfxbqfkf;
                btonecajqb.iobyxmoadg iobyxmoadgVar3 = new btonecajqb.iobyxmoadg(str);
                ppxfxbqfkfVar.f75896zdlpuopuiu = this;
                ppxfxbqfkfVar.f75893iwizpuwonk = 1;
                objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar3, ppxfxbqfkfVar);
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
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f75896zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((e10.iobyxmoadg) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.uwvvkdfqfp((e10.iobyxmoadg) objWkgbmnqykc);
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
        ulzqkzuiru(new gxszxtbevo.eablkybsjg(str, !n30.ppxfxbqfkf.f68498iobyxmoadg.zoijcleaow(str)));
    }

    public final void bfopjjpdmp(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
        crxdokpmqz(new eablkybsjg.zoijcleaow(error));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(p70.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(p70.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1670iobyxmoadg(action, this, null), 3, null);
    }
}
