package c00;

import fz.RateVariantDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.core.network.model.BasicResponse;
import sz.OrderDetailsDto;
import sz.OrderReferencesDto;
import uy.GetFeedbackVariantsRequest;
import yz.SbpRecurringBankDto;

/* JADX INFO: loaded from: classes4.dex */
public final class rgvfuqvkyq implements w10.btonecajqb {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iobyxmoadg f18168zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.nufgyqmvbu f18169iobyxmoadg;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18170jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18172zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18172zdlpuopuiu = obj;
            this.f18170jyumaefscl |= Integer.MIN_VALUE;
            return rgvfuqvkyq.this.iobyxmoadg(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18173jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18175zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18175zdlpuopuiu = obj;
            this.f18173jyumaefscl |= Integer.MIN_VALUE;
            return rgvfuqvkyq.this.zoijcleaow(null, this);
        }
    }

    public rgvfuqvkyq(ay.nufgyqmvbu otherApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(otherApiService, "otherApiService");
        this.f18169iobyxmoadg = otherApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.btonecajqb
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f18170jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f18170jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objIobyxmoadg = ppxfxbqfkfVar.f18172zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f18170jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            GetFeedbackVariantsRequest getFeedbackVariantsRequest = new GetFeedbackVariantsRequest(hg.jyumaefscl.eablkybsjg(new RateVariantDto("sbp_banks", null)));
            ay.nufgyqmvbu nufgyqmvbuVar = this.f18169iobyxmoadg;
            ppxfxbqfkfVar.f18170jyumaefscl = 1;
            objIobyxmoadg = nufgyqmvbuVar.iobyxmoadg(getFeedbackVariantsRequest, ppxfxbqfkfVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        OrderReferencesDto reference = ((OrderDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null)).getReference();
        List sbpRecurringBanks = reference != null ? reference.getSbpRecurringBanks() : null;
        if (sbpRecurringBanks == null) {
            sbpRecurringBanks = hg.jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(sbpRecurringBanks, 10));
        Iterator it = sbpRecurringBanks.iterator();
        while (it.hasNext()) {
            arrayList.add(ry.iobyxmoadg.iobyxmoadg((SbpRecurringBankDto) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.btonecajqb
    public Object zoijcleaow(List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18173jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18173jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f18175zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18173jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.nufgyqmvbu nufgyqmvbuVar = this.f18169iobyxmoadg;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(oy.gtknphoqwx.iobyxmoadg((m10.iobyxmoadg) it.next()));
            }
            GetFeedbackVariantsRequest getFeedbackVariantsRequest = new GetFeedbackVariantsRequest(arrayList);
            zoijcleaowVar.f18173jyumaefscl = 1;
            objIobyxmoadg = nufgyqmvbuVar.iobyxmoadg(getFeedbackVariantsRequest, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return qy.eablkybsjg.iobyxmoadg(((OrderDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null)).getReference());
    }
}
