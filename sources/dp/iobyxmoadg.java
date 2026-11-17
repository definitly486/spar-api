package dp;

import c20.dxjokdxxww;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.auth.impl.domain.nonauthorized.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dxjokdxxww f29272ppxfxbqfkf;

    /* JADX INFO: renamed from: dp.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0594iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f29273zdlpuopuiu;

        /* JADX INFO: renamed from: dp.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0595iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f29274zdlpuopuiu;

            /* JADX INFO: renamed from: dp.iobyxmoadg$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0596iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f29276yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f29277zdlpuopuiu;

                public C0596iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f29277zdlpuopuiu = obj;
                    this.f29276yggfygwlhe |= Integer.MIN_VALUE;
                    return C0595iobyxmoadg.this.emit(null, this);
                }
            }

            public C0595iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f29274zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0596iobyxmoadg c0596iobyxmoadg;
                if (gxszxtbevoVar instanceof C0596iobyxmoadg) {
                    c0596iobyxmoadg = (C0596iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0596iobyxmoadg.f29276yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0596iobyxmoadg.f29276yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0596iobyxmoadg = new C0596iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0596iobyxmoadg = new C0596iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0596iobyxmoadg.f29277zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0596iobyxmoadg.f29276yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f29274zdlpuopuiu;
                    if (((Boolean) obj).booleanValue()) {
                        c0596iobyxmoadg.f29276yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0596iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
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

        public C0594iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f29273zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f29273zdlpuopuiu.collect(new C0595iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f29279zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zoijcleaow(gxszxtbevoVar);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (lg.gxszxtbevo) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f29279zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.ikoacuggdj(iobyxmoadg.this, false, 1, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final Object invoke(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(Boolean.valueOf(z13), gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, dxjokdxxww subscribeToLoggedInUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        this.f29272ppxfxbqfkf = subscribeToLoggedInUseCase;
    }

    static /* synthetic */ void ikoacuggdj(iobyxmoadg iobyxmoadgVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.jhduphickx(z13);
    }

    private final void jhduphickx(boolean z13) {
        NonAuthorizedPayload.zoijcleaow errorType = ((State) jlmebxxoox()).getErrorType();
        if (jyumaefscl.rgvfuqvkyq(NonAuthorizedPayload.zoijcleaow.PROFILE, NonAuthorizedPayload.zoijcleaow.CATALOG).contains(errorType)) {
            crxdokpmqz(new eablkybsjg.iobyxmoadg(errorType));
        } else if (z13) {
            crxdokpmqz(eablkybsjg.zoijcleaow.f29271iobyxmoadg);
        }
    }

    private final void okpsazkaxt() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new C0594iobyxmoadg(sj.dxjokdxxww.vdvldrhtss(this.f29272ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg))), new zoijcleaow(null)), sopmlzcsov());
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!(action instanceof ppxfxbqfkf.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        okpsazkaxt();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof wkgbmnqykc.iobyxmoadg) {
            jhduphickx(true);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f29285iobyxmoadg)) {
            State state = (State) jlmebxxoox();
            crxdokpmqz(new eablkybsjg.ppxfxbqfkf(state.getResult(), state.getErrorType()));
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.ppxfxbqfkf.f29284iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.wkgbmnqykc(((State) jlmebxxoox()).getResult()));
        }
    }
}
