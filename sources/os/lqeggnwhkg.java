package os;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Arrays;
import java.util.List;
import sj.dxjokdxxww;
import sj.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f74647zdlpuopuiu;

        /* JADX INFO: renamed from: os.lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1618iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f74648zdlpuopuiu;

            /* JADX INFO: renamed from: os.lqeggnwhkg$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1619iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f74650yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f74651zdlpuopuiu;

                public C1619iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f74651zdlpuopuiu = obj;
                    this.f74650yggfygwlhe |= Integer.MIN_VALUE;
                    return C1618iobyxmoadg.this.emit(null, this);
                }
            }

            public C1618iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f74648zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1619iobyxmoadg c1619iobyxmoadg;
                if (gxszxtbevoVar instanceof C1619iobyxmoadg) {
                    c1619iobyxmoadg = (C1619iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1619iobyxmoadg.f74650yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1619iobyxmoadg.f74650yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1619iobyxmoadg = new C1619iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1619iobyxmoadg = new C1619iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1619iobyxmoadg.f74651zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1619iobyxmoadg.f74650yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f74648zdlpuopuiu;
                    if (obj instanceof List) {
                        c1619iobyxmoadg.f74650yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1619iobyxmoadg) == objGxszxtbevo) {
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
            this.f74647zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f74647zdlpuopuiu.collect(new C1618iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final sj.lqeggnwhkg iobyxmoadg(sj.lqeggnwhkg isScreenVisibleFlow, sj.lqeggnwhkg... flows) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isScreenVisibleFlow, "isScreenVisibleFlow");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(flows, "flows");
        return new iobyxmoadg(new gxszxtbevo(dxjokdxxww.wypolnanlu((sj.lqeggnwhkg[]) Arrays.copyOf(flows, flows.length)), isScreenVisibleFlow));
    }
}
