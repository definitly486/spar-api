package gi0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.networkpanel.impl.domain.model.NetworkItem;
import ru.myspar.networkpanel.impl.domain.model.NetworkPayload;
import ru.myspar.networkpanel.impl.domain.model.PayloadHolder;
import ru.myspar.networkpanel.impl.domain.store.State;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final hi0.ppxfxbqfkf f37507eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final hi0.zoijcleaow f37508gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ns.iobyxmoadg f37509lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final hi0.wkgbmnqykc f37510ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final hi0.iobyxmoadg f37511wkgbmnqykc;

    /* JADX INFO: renamed from: gi0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0848iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f37513yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f37514zdlpuopuiu;

        C0848iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            C0848iobyxmoadg c0848iobyxmoadg = iobyxmoadg.this.new C0848iobyxmoadg(gxszxtbevoVar);
            c0848iobyxmoadg.f37513yggfygwlhe = obj;
            return c0848iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f37514zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.eablkybsjg((List) this.f37513yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C0848iobyxmoadg) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f37515cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f37517jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f37518yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f37519zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f37517jyumaefscl = obj;
            this.f37515cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(null, null, null, this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f37520iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f37521jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f37522yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f37523zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f37521jyumaefscl = wkgbmnqykcVar;
            this.f37520iwizpuwonk = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f37521jyumaefscl, this.f37520iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:84:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:87:0x01ef  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            iobyxmoadg iobyxmoadgVar;
            Object objWkgbmnqykc;
            File file;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f37522yggfygwlhe;
            Object obj2 = null;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f37521jyumaefscl;
                if (wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg) {
                    this.f37520iwizpuwonk.ulzqkzuiru(new gxszxtbevo.C0847gxszxtbevo(((wkgbmnqykc.iobyxmoadg) this.f37521jyumaefscl).iobyxmoadg()));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.eablkybsjg.f37530iobyxmoadg)) {
                    hi0.iobyxmoadg iobyxmoadgVar2 = this.f37520iwizpuwonk.f37511wkgbmnqykc;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f37522yggfygwlhe = 1;
                    if (iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    this.f37520iwizpuwonk.ulzqkzuiru(gxszxtbevo.iobyxmoadg.f37502iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.lqeggnwhkg.f37533iobyxmoadg)) {
                    this.f37520iwizpuwonk.crxdokpmqz(eablkybsjg.iobyxmoadg.f37498iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.btonecajqb) {
                    this.f37520iwizpuwonk.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(((wkgbmnqykc.btonecajqb) this.f37521jyumaefscl).iobyxmoadg()));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.gxszxtbevo.f37531iobyxmoadg)) {
                    this.f37520iwizpuwonk.ulzqkzuiru(new gxszxtbevo.lqeggnwhkg(null));
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.dxjokdxxww) {
                    List items = iobyxmoadg.okpsazkaxt(this.f37520iwizpuwonk).getItems();
                    if (items != null) {
                        wkgbmnqykc wkgbmnqykcVar2 = this.f37521jyumaefscl;
                        for (Object obj3 : items) {
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((NetworkItem) obj3).getId(), ((wkgbmnqykc.dxjokdxxww) wkgbmnqykcVar2).iobyxmoadg())) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        NetworkItem networkItem = (NetworkItem) obj2;
                        if (networkItem != null) {
                            wkgbmnqykc wkgbmnqykcVar3 = this.f37521jyumaefscl;
                            iobyxmoadg iobyxmoadgVar3 = this.f37520iwizpuwonk;
                            wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = (wkgbmnqykc.dxjokdxxww) wkgbmnqykcVar3;
                            PayloadHolder payloadHolder = new PayloadHolder(networkItem, dxjokdxxwwVar.zoijcleaow(), null, false, false, 28, null);
                            String id2 = networkItem.getId();
                            ei0.zoijcleaow zoijcleaowVarZoijcleaow = dxjokdxxwwVar.zoijcleaow();
                            this.f37522yggfygwlhe = 2;
                            if (iobyxmoadgVar3.rlfsiqarku(payloadHolder, id2, zoijcleaowVarZoijcleaow, this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    }
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow) {
                    PayloadHolder networkPayload = iobyxmoadg.okpsazkaxt(this.f37520iwizpuwonk).getNetworkPayload();
                    if (networkPayload != null) {
                        wkgbmnqykc wkgbmnqykcVar4 = this.f37521jyumaefscl;
                        iobyxmoadg iobyxmoadgVar4 = this.f37520iwizpuwonk;
                        wkgbmnqykc.zoijcleaow zoijcleaowVar = (wkgbmnqykc.zoijcleaow) wkgbmnqykcVar4;
                        PayloadHolder payloadHolder2 = new PayloadHolder(networkPayload.getNetworkItem(), zoijcleaowVar.iobyxmoadg(), null, false, false, 28, null);
                        String id3 = networkPayload.getNetworkItem().getId();
                        ei0.zoijcleaow zoijcleaowVarIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                        this.f37522yggfygwlhe = 3;
                        if (iobyxmoadgVar4.rlfsiqarku(payloadHolder2, id3, zoijcleaowVarIobyxmoadg, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.ppxfxbqfkf.f37535iobyxmoadg)) {
                    PayloadHolder networkPayload2 = iobyxmoadg.okpsazkaxt(this.f37520iwizpuwonk).getNetworkPayload();
                    if (networkPayload2 != null) {
                        this.f37520iwizpuwonk.ulzqkzuiru(new gxszxtbevo.zoijcleaow(!networkPayload2.getBodyEnabled()));
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.C0849wkgbmnqykc.f37536iobyxmoadg)) {
                    PayloadHolder networkPayload3 = iobyxmoadg.okpsazkaxt(this.f37520iwizpuwonk).getNetworkPayload();
                    if (networkPayload3 != null) {
                        this.f37520iwizpuwonk.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(!networkPayload3.getHeadersEnabled()));
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.nufgyqmvbu.f37534iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PayloadHolder networkPayload4 = iobyxmoadg.okpsazkaxt(this.f37520iwizpuwonk).getNetworkPayload();
                    if (networkPayload4 != null) {
                        iobyxmoadg iobyxmoadgVar5 = this.f37520iwizpuwonk;
                        hi0.zoijcleaow.iobyxmoadg iobyxmoadgVar6 = new hi0.zoijcleaow.iobyxmoadg(networkPayload4.getNetworkItem().getId(), networkPayload4.getType());
                        try {
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar7 = kcexrzcfyt.f37117yggfygwlhe;
                            hi0.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar5.f37508gxszxtbevo;
                            this.f37523zdlpuopuiu = iobyxmoadgVar5;
                            this.f37522yggfygwlhe = 4;
                            obj = zoijcleaowVar2.zoijcleaow(iobyxmoadgVar6, this);
                            if (obj == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            iobyxmoadgVar = iobyxmoadgVar5;
                            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((File) obj);
                            file = (File) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
                            if (file != null) {
                                iobyxmoadgVar.crxdokpmqz(new eablkybsjg.zoijcleaow(file));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            iobyxmoadgVar = iobyxmoadgVar5;
                            kcexrzcfyt.iobyxmoadg iobyxmoadgVar8 = kcexrzcfyt.f37117yggfygwlhe;
                            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                        }
                    }
                }
            } else if (i13 == 1) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f37520iwizpuwonk.ulzqkzuiru(gxszxtbevo.iobyxmoadg.f37502iobyxmoadg);
            } else if (i13 == 2 || i13 == 3) {
                zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar = (iobyxmoadg) this.f37523zdlpuopuiu;
                try {
                    zdlpuopuiu.zoijcleaow(obj);
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((File) obj);
                } catch (Throwable th3) {
                    th = th3;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar9 = kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
                }
                file = (File) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
                if (file != null) {
                    iobyxmoadgVar.crxdokpmqz(new eablkybsjg.zoijcleaow(file));
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(hi0.wkgbmnqykc subscribeOnNetworkItemsUseCase, hi0.iobyxmoadg clearNetworkItemsUseCase, hi0.ppxfxbqfkf getNetworkPayloadUseCase, hi0.zoijcleaow createNetworkLogUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeOnNetworkItemsUseCase, "subscribeOnNetworkItemsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearNetworkItemsUseCase, "clearNetworkItemsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getNetworkPayloadUseCase, "getNetworkPayloadUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(createNetworkLogUseCase, "createNetworkLogUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f37510ppxfxbqfkf = subscribeOnNetworkItemsUseCase;
        this.f37511wkgbmnqykc = clearNetworkItemsUseCase;
        this.f37507eablkybsjg = getNetworkPayloadUseCase;
        this.f37508gxszxtbevo = createNetworkLogUseCase;
        this.f37509lqeggnwhkg = dispatchersProvider;
    }

    public static final /* synthetic */ State okpsazkaxt(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(PayloadHolder payloadHolder, String str, ei0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f37515cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f37515cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f37517jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f37515cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.lqeggnwhkg(payloadHolder));
            hi0.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = new hi0.ppxfxbqfkf.iobyxmoadg(str, zoijcleaowVar);
            hi0.ppxfxbqfkf ppxfxbqfkfVar2 = this.f37507eablkybsjg;
            ppxfxbqfkfVar.f37519zdlpuopuiu = this;
            ppxfxbqfkfVar.f37518yggfygwlhe = payloadHolder;
            ppxfxbqfkfVar.f37515cqumvgiudr = 1;
            objZoijcleaow = ppxfxbqfkfVar2.zoijcleaow(iobyxmoadgVar2, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            payloadHolder = (PayloadHolder) ppxfxbqfkfVar.f37518yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f37519zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.lqeggnwhkg(PayloadHolder.ppxfxbqfkf(payloadHolder, null, null, (NetworkPayload) objZoijcleaow, false, false, 27, null)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(gi0.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, gi0.ppxfxbqfkf.iobyxmoadg.f37526iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb((sj.lqeggnwhkg) this.f37510ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new C0848iobyxmoadg(null)), sopmlzcsov());
    }
}
