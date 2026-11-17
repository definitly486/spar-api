package ru.myspar.proloyalty.support_service.impl.domain.store;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ow1.pkzmftpjix;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.support_service.impl.domain.model.SupportAction;
import ru.myspar.proloyalty.support_service.impl.domain.model.SupportInfo;
import ru.myspar.proloyalty.user.domain.model.UserNews;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cv1.iobyxmoadg f101823ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final pkzmftpjix f101824wkgbmnqykc;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.support_service.impl.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2445iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101826zdlpuopuiu;

        C2445iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new C2445iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101826zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    cv1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f101823ppxfxbqfkf;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f101826zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((SupportInfo) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ulzqkzuiru(new gxszxtbevo.zoijcleaow(new State.Content.Success((SupportInfo) objWkgbmnqykc)));
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                if (iobyxmoadg.ikoacuggdj(iobyxmoadgVar5).getContent() == null || (iobyxmoadg.ikoacuggdj(iobyxmoadgVar5).getContent() instanceof State.Content.Error)) {
                    iobyxmoadgVar5.ulzqkzuiru(new gxszxtbevo.zoijcleaow(new State.Content.Error(false)));
                }
                iobyxmoadgVar5.crxdokpmqz(new eablkybsjg.iobyxmoadg(thDxjokdxxww));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C2445iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ int f101828yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101829zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.new ppxfxbqfkf(gxszxtbevoVar);
            ppxfxbqfkfVar.f101828yggfygwlhe = ((Number) obj).intValue();
            return ppxfxbqfkfVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ojitshcjhn(((Number) obj).intValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f101829zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(this.f101828yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object ojitshcjhn(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(Integer.valueOf(i13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zoijcleaow implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f101830zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.support_service.impl.domain.store.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2446iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f101831zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.support_service.impl.domain.store.iobyxmoadg$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2447iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f101833yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f101834zdlpuopuiu;

                public C2447iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f101834zdlpuopuiu = obj;
                    this.f101833yggfygwlhe |= Integer.MIN_VALUE;
                    return C2446iobyxmoadg.this.emit(null, this);
                }
            }

            public C2446iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f101831zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2447iobyxmoadg c2447iobyxmoadg;
                if (gxszxtbevoVar instanceof C2447iobyxmoadg) {
                    c2447iobyxmoadg = (C2447iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2447iobyxmoadg.f101833yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2447iobyxmoadg.f101833yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2447iobyxmoadg = new C2447iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2447iobyxmoadg = new C2447iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2447iobyxmoadg.f101834zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2447iobyxmoadg.f101833yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f101831zdlpuopuiu;
                    Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(((UserNews) obj).getChatSupportMessages());
                    c2447iobyxmoadg.f101833yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(numWkgbmnqykc, c2447iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f101830zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f101830zdlpuopuiu.collect(new C2446iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(cv1.iobyxmoadg getSupportServiceInfoUseCase, pkzmftpjix subscribeUserNewsUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getSupportServiceInfoUseCase, "getSupportServiceInfoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeUserNewsUseCase, "subscribeUserNewsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f101823ppxfxbqfkf = getSupportServiceInfoUseCase;
        this.f101824wkgbmnqykc = subscribeUserNewsUseCase;
    }

    public static final /* synthetic */ State ikoacuggdj(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    private final void metgxyhuhe() {
        dxjokdxxww.hkdspvbjdz(dxjokdxxww.kegysxyocb(dxjokdxxww.vdvldrhtss(new zoijcleaow((sj.lqeggnwhkg) this.f101824wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg))), new ppxfxbqfkf(null)), sopmlzcsov());
    }

    private final auzgnhcxok xrmfcynszj() {
        return gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C2445iobyxmoadg(null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        SupportInfo info;
        List actions;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        Object obj = null;
        if (!(intent instanceof wkgbmnqykc.zoijcleaow)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.ppxfxbqfkf.f101839iobyxmoadg)) {
                crxdokpmqz(new eablkybsjg.zoijcleaow(new NavigationPayload(ojitshcjhn.CALL, null, null, null, false, null, null, false, 254, null)));
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f101838iobyxmoadg)) {
                xrmfcynszj();
                return;
            }
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.C2448wkgbmnqykc.f101840iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            State.Content content = ((State) jlmebxxoox()).getContent();
            State.Content.Error error = content instanceof State.Content.Error ? (State.Content.Error) content : null;
            if (error == null || error.getIsLoading()) {
                return;
            }
            ulzqkzuiru(new gxszxtbevo.zoijcleaow(new State.Content.Error(true)));
            xrmfcynszj();
            return;
        }
        State.Content content2 = ((State) jlmebxxoox()).getContent();
        State.Content.Success success = content2 instanceof State.Content.Success ? (State.Content.Success) content2 : null;
        if (success == null || (info = success.getInfo()) == null || (actions = info.getActions()) == null) {
            return;
        }
        for (Object obj2 : actions) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((SupportAction) obj2).getName(), ((wkgbmnqykc.zoijcleaow) intent).iobyxmoadg())) {
                obj = obj2;
                break;
            }
        }
        SupportAction supportAction = (SupportAction) obj;
        if (supportAction != null) {
            crxdokpmqz(new eablkybsjg.zoijcleaow(supportAction.getPayload()));
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.support_service.impl.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof ru.myspar.proloyalty.support_service.impl.domain.store.ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        metgxyhuhe();
    }
}
