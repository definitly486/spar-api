package vm1;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import wm1.GetReviewRequest;
import wm1.SetReviewRequest;
import xm1.ReviewsDto;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements rm1.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tm1.iobyxmoadg f117500iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final um1.iobyxmoadg f117501zoijcleaow;

    /* JADX INFO: renamed from: vm1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2921iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f117502jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f117504zdlpuopuiu;

        C2921iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f117504zdlpuopuiu = obj;
            this.f117502jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, 0, null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f117505iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f117507yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f117508zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f117507yggfygwlhe = obj;
            this.f117505iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, 0, this);
        }
    }

    public iobyxmoadg(tm1.iobyxmoadg reviewsApiService, um1.iobyxmoadg responseMapper) {
        zdlpuopuiu.btonecajqb(reviewsApiService, "reviewsApiService");
        zdlpuopuiu.btonecajqb(responseMapper, "responseMapper");
        this.f117500iobyxmoadg = reviewsApiService;
        this.f117501zoijcleaow = responseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rm1.iobyxmoadg
    public Object iobyxmoadg(String str, int i13, String str2, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C2921iobyxmoadg c2921iobyxmoadg;
        if (gxszxtbevoVar instanceof C2921iobyxmoadg) {
            c2921iobyxmoadg = (C2921iobyxmoadg) gxszxtbevoVar;
            int i14 = c2921iobyxmoadg.f117502jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2921iobyxmoadg.f117502jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                c2921iobyxmoadg = new C2921iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2921iobyxmoadg = new C2921iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c2921iobyxmoadg.f117504zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = c2921iobyxmoadg.f117502jyumaefscl;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            tm1.iobyxmoadg iobyxmoadgVar = this.f117500iobyxmoadg;
            SetReviewRequest setReviewRequest = new SetReviewRequest(str, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(i13), str2);
            c2921iobyxmoadg.f117502jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(setReviewRequest, c2921iobyxmoadg);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rm1.iobyxmoadg
    public Object zoijcleaow(String str, int i13, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i14 = zoijcleaowVar.f117505iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f117505iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f117507yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = zoijcleaowVar.f117505iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            tm1.iobyxmoadg iobyxmoadgVar2 = this.f117500iobyxmoadg;
            GetReviewRequest getReviewRequest = new GetReviewRequest(str, i13);
            zoijcleaowVar.f117508zdlpuopuiu = this;
            zoijcleaowVar.f117505iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(getReviewRequest, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f117508zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f117501zoijcleaow.zoijcleaow((ReviewsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
