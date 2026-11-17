package c00;

import java.util.List;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;
import ru.myspar.core.network.model.WarningDto;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx implements w10.lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.gxszxtbevo f17957iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jy.zoijcleaow f17958ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final sy.iobyxmoadg f17959wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final qy.gxszxtbevo f17960zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f17961iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f17963yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17964zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17963yggfygwlhe = obj;
            this.f17961iwizpuwonk |= Integer.MIN_VALUE;
            return gtknphoqwx.this.iobyxmoadg(this);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        ppxfxbqfkf(Object obj) {
            super(1, obj, sy.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((sy.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, jy.zoijcleaow.class, "map", "map(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((jy.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    public gtknphoqwx(ay.gxszxtbevo futurePurchasesApiService, qy.gxszxtbevo orderResponseMapper, jy.zoijcleaow responseErrorFactory, sy.iobyxmoadg cartWarningSelector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(futurePurchasesApiService, "futurePurchasesApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderResponseMapper, "orderResponseMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(responseErrorFactory, "responseErrorFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartWarningSelector, "cartWarningSelector");
        this.f17957iobyxmoadg = futurePurchasesApiService;
        this.f17960zoijcleaow = orderResponseMapper;
        this.f17958ppxfxbqfkf = responseErrorFactory;
        this.f17959wkgbmnqykc = cartWarningSelector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.lqeggnwhkg
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        gtknphoqwx gtknphoqwxVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f17961iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f17961iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f17963yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f17961iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.gxszxtbevo gxszxtbevoVar2 = this.f17957iobyxmoadg;
            iobyxmoadgVar.f17964zdlpuopuiu = this;
            iobyxmoadgVar.f17961iwizpuwonk = 1;
            objIobyxmoadg = gxszxtbevoVar2.iobyxmoadg(iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gtknphoqwxVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gtknphoqwxVar = (gtknphoqwx) iobyxmoadgVar.f17964zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return o40.eablkybsjg.gtknphoqwx((BasicResponse) objIobyxmoadg, new zoijcleaow(gtknphoqwxVar.f17958ppxfxbqfkf), new ppxfxbqfkf(gtknphoqwxVar.f17959wkgbmnqykc));
    }
}
