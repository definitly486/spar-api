package e12;

import f12.GetReviewRequest;
import f12.SetReviewRequest;
import g12.ReviewsDto;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a12.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final c12.iobyxmoadg f30219iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final d12.iobyxmoadg f30220zoijcleaow;

    /* JADX INFO: renamed from: e12.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0632iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f30221jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f30223zdlpuopuiu;

        C0632iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f30223zdlpuopuiu = obj;
            this.f30221jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, 0, null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f30224iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f30226yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f30227zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f30226yggfygwlhe = obj;
            this.f30224iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, 0, this);
        }
    }

    public iobyxmoadg(c12.iobyxmoadg reviewsApiService, d12.iobyxmoadg responseMapper) {
        zdlpuopuiu.btonecajqb(reviewsApiService, "reviewsApiService");
        zdlpuopuiu.btonecajqb(responseMapper, "responseMapper");
        this.f30219iobyxmoadg = reviewsApiService;
        this.f30220zoijcleaow = responseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a12.iobyxmoadg
    public Object iobyxmoadg(String str, int i13, String str2, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C0632iobyxmoadg c0632iobyxmoadg;
        if (gxszxtbevoVar instanceof C0632iobyxmoadg) {
            c0632iobyxmoadg = (C0632iobyxmoadg) gxszxtbevoVar;
            int i14 = c0632iobyxmoadg.f30221jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0632iobyxmoadg.f30221jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                c0632iobyxmoadg = new C0632iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0632iobyxmoadg = new C0632iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0632iobyxmoadg.f30223zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = c0632iobyxmoadg.f30221jyumaefscl;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            c12.iobyxmoadg iobyxmoadgVar = this.f30219iobyxmoadg;
            SetReviewRequest setReviewRequest = new SetReviewRequest(str, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13), str2);
            c0632iobyxmoadg.f30221jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(setReviewRequest, c0632iobyxmoadg);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        eablkybsjg.btonecajqb((BasicResponse) objZoijcleaow, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a12.iobyxmoadg
    public Object zoijcleaow(String str, int i13, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i14 = zoijcleaowVar.f30224iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f30224iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f30226yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = zoijcleaowVar.f30224iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            c12.iobyxmoadg iobyxmoadgVar2 = this.f30219iobyxmoadg;
            GetReviewRequest getReviewRequest = new GetReviewRequest(str, i13);
            zoijcleaowVar.f30227zdlpuopuiu = this;
            zoijcleaowVar.f30224iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(getReviewRequest, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f30227zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f30220zoijcleaow.zoijcleaow((ReviewsDto) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
