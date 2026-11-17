package ai0;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hi0.wkgbmnqykc;
import java.util.List;
import lg.gxszxtbevo;
import ru.myspar.core.base.mvi.dialog.BaseComposeMviDialogFragment;
import ru.myspar.networkpanel.impl.presentation.NetworkPanelFragment;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements zh0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f2025iobyxmoadg;

    /* JADX INFO: renamed from: ai0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0043iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ lqeggnwhkg f2026zdlpuopuiu;

        /* JADX INFO: renamed from: ai0.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0044iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ nufgyqmvbu f2027zdlpuopuiu;

            /* JADX INFO: renamed from: ai0.iobyxmoadg$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0045iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f2029yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f2030zdlpuopuiu;

                public C0045iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f2030zdlpuopuiu = obj;
                    this.f2029yggfygwlhe |= Integer.MIN_VALUE;
                    return C0044iobyxmoadg.this.emit(null, this);
                }
            }

            public C0044iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
                this.f2027zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, gxszxtbevo gxszxtbevoVar) {
                C0045iobyxmoadg c0045iobyxmoadg;
                if (gxszxtbevoVar instanceof C0045iobyxmoadg) {
                    c0045iobyxmoadg = (C0045iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0045iobyxmoadg.f2029yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0045iobyxmoadg.f2029yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0045iobyxmoadg = new C0045iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0045iobyxmoadg = new C0045iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0045iobyxmoadg.f2030zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0045iobyxmoadg.f2029yggfygwlhe;
                if (i14 == 0) {
                    zdlpuopuiu.zoijcleaow(obj2);
                    nufgyqmvbu nufgyqmvbuVar = this.f2027zdlpuopuiu;
                    Integer numWkgbmnqykc = kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(((List) obj).size());
                    c0045iobyxmoadg.f2029yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(numWkgbmnqykc, c0045iobyxmoadg) == objGxszxtbevo) {
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

        public C0043iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) {
            this.f2026zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f2026zdlpuopuiu.collect(new C0044iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public iobyxmoadg(wkgbmnqykc subscribeOnNetworkItemsUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeOnNetworkItemsUseCase, "subscribeOnNetworkItemsUseCase");
        this.f2025iobyxmoadg = subscribeOnNetworkItemsUseCase;
    }

    @Override // zh0.iobyxmoadg
    public lqeggnwhkg iobyxmoadg() {
        return new C0043iobyxmoadg((lqeggnwhkg) this.f2025iobyxmoadg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg));
    }

    @Override // zh0.iobyxmoadg
    public BaseComposeMviDialogFragment zoijcleaow() {
        return NetworkPanelFragment.INSTANCE.iobyxmoadg();
    }
}
