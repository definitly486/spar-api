package ty0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ky0.OrderDetailsDto;
import ky0.OrderReferencesDto;
import px0.GetFeedbackVariantsRequest;
import qy0.SbpRecurringBankDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import yx0.RateVariantDto;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog implements k01.btonecajqb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iobyxmoadg f111834zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.lqeggnwhkg f111835iobyxmoadg;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111836jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111838zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111838zdlpuopuiu = obj;
            this.f111836jyumaefscl |= Integer.MIN_VALUE;
            return agtfadlqog.this.iobyxmoadg(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111839jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111841zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111841zdlpuopuiu = obj;
            this.f111839jyumaefscl |= Integer.MIN_VALUE;
            return agtfadlqog.this.zoijcleaow(null, this);
        }
    }

    public agtfadlqog(ww0.lqeggnwhkg otherApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(otherApiService, "otherApiService");
        this.f111835iobyxmoadg = otherApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.btonecajqb
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f111836jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f111836jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f111838zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f111836jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            GetFeedbackVariantsRequest getFeedbackVariantsRequest = new GetFeedbackVariantsRequest(hg.jyumaefscl.eablkybsjg(new RateVariantDto("sbp_banks", null)));
            ww0.lqeggnwhkg lqeggnwhkgVar = this.f111835iobyxmoadg;
            ppxfxbqfkfVar.f111836jyumaefscl = 1;
            objZoijcleaow = lqeggnwhkgVar.zoijcleaow(getFeedbackVariantsRequest, ppxfxbqfkfVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        OrderReferencesDto reference = ((OrderDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null)).getReference();
        List sbpRecurringBanks = reference != null ? reference.getSbpRecurringBanks() : null;
        if (sbpRecurringBanks == null) {
            sbpRecurringBanks = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(sbpRecurringBanks, 10));
        Iterator it = sbpRecurringBanks.iterator();
        while (it.hasNext()) {
            arrayList.add(mx0.iobyxmoadg.iobyxmoadg((SbpRecurringBankDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.btonecajqb
    public Object zoijcleaow(List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f111839jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f111839jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f111841zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f111839jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ww0.lqeggnwhkg lqeggnwhkgVar = this.f111835iobyxmoadg;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(jx0.gtknphoqwx.iobyxmoadg((c01.iobyxmoadg) it.next()));
            }
            GetFeedbackVariantsRequest getFeedbackVariantsRequest = new GetFeedbackVariantsRequest(arrayList);
            zoijcleaowVar.f111839jyumaefscl = 1;
            objZoijcleaow = lqeggnwhkgVar.zoijcleaow(getFeedbackVariantsRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return lx0.lqeggnwhkg.iobyxmoadg(((OrderDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null)).getReference());
    }
}
