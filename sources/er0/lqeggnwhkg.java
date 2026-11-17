package er0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Arrays;
import java.util.List;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f31828zdlpuopuiu;

        /* JADX INFO: renamed from: er0.lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0687iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f31829zdlpuopuiu;

            /* JADX INFO: renamed from: er0.lqeggnwhkg$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0688iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f31831yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f31832zdlpuopuiu;

                public C0688iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f31832zdlpuopuiu = obj;
                    this.f31831yggfygwlhe |= Integer.MIN_VALUE;
                    return C0687iobyxmoadg.this.emit(null, this);
                }
            }

            public C0687iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f31829zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0688iobyxmoadg c0688iobyxmoadg;
                if (gxszxtbevoVar instanceof C0688iobyxmoadg) {
                    c0688iobyxmoadg = (C0688iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0688iobyxmoadg.f31831yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0688iobyxmoadg.f31831yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0688iobyxmoadg = new C0688iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0688iobyxmoadg = new C0688iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0688iobyxmoadg.f31832zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0688iobyxmoadg.f31831yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f31829zdlpuopuiu;
                    if (obj instanceof List) {
                        c0688iobyxmoadg.f31831yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0688iobyxmoadg) == objGxszxtbevo) {
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

        public iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f31828zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f31828zdlpuopuiu.collect(new C0687iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final sj.lqeggnwhkg iobyxmoadg(sj.lqeggnwhkg isScreenVisibleFlow, sj.lqeggnwhkg... flows) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isScreenVisibleFlow, "isScreenVisibleFlow");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(flows, "flows");
        return new iobyxmoadg(new gxszxtbevo(dxjokdxxww.wypolnanlu((sj.lqeggnwhkg[]) Arrays.copyOf(flows, flows.length)), isScreenVisibleFlow));
    }
}
