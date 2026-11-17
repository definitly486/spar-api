package ty0;

import java.util.List;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import ru.myspar.proloyalty.core.network.model.WarningDto;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww implements k01.lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.eablkybsjg f111873iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ex0.zoijcleaow f111874ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nx0.iobyxmoadg f111875wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lx0.nufgyqmvbu f111876zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111877iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111879yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111880zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111879yggfygwlhe = obj;
            this.f111877iwizpuwonk |= Integer.MIN_VALUE;
            return dxjokdxxww.this.iobyxmoadg(this);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        ppxfxbqfkf(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    public dxjokdxxww(ww0.eablkybsjg futurePurchasesApiService, lx0.nufgyqmvbu orderResponseMapper, ex0.zoijcleaow responseErrorFactory, nx0.iobyxmoadg cartWarningSelector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(futurePurchasesApiService, "futurePurchasesApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderResponseMapper, "orderResponseMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(responseErrorFactory, "responseErrorFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartWarningSelector, "cartWarningSelector");
        this.f111873iobyxmoadg = futurePurchasesApiService;
        this.f111876zoijcleaow = orderResponseMapper;
        this.f111874ppxfxbqfkf = responseErrorFactory;
        this.f111875wkgbmnqykc = cartWarningSelector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.lqeggnwhkg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f111877iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f111877iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f111879yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f111877iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ww0.eablkybsjg eablkybsjgVar = this.f111873iobyxmoadg;
            iobyxmoadgVar.f111880zdlpuopuiu = this;
            iobyxmoadgVar.f111877iwizpuwonk = 1;
            objIobyxmoadg = eablkybsjgVar.iobyxmoadg(iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            dxjokdxxwwVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dxjokdxxwwVar = (dxjokdxxww) iobyxmoadgVar.f111880zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return x21.wkgbmnqykc.ojitshcjhn((BasicResponse) objIobyxmoadg, new zoijcleaow(dxjokdxxwwVar.f111874ppxfxbqfkf), new ppxfxbqfkf(dxjokdxxwwVar.f111875wkgbmnqykc));
    }
}
