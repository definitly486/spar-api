package c00;

import az.GetRecommendationsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lz.RecommendationsDto;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class yggfygwlhe implements x10.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.wkgbmnqykc f18189iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ly.lqeggnwhkg f18190zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18191iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18193yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18194zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18193yggfygwlhe = obj;
            this.f18191iwizpuwonk |= Integer.MIN_VALUE;
            return yggfygwlhe.this.iobyxmoadg(null, null, null, null, null, this);
        }
    }

    public yggfygwlhe(ay.wkgbmnqykc catalogApiService, ly.lqeggnwhkg recommendationsResponseMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogApiService, "catalogApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendationsResponseMapper, "recommendationsResponseMapper");
        this.f18189iobyxmoadg = catalogApiService;
        this.f18190zoijcleaow = recommendationsResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // x10.wkgbmnqykc
    public Object iobyxmoadg(String str, String str2, DeliveryCode deliveryCode, List list, Set set, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        yggfygwlhe yggfygwlheVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18191iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18191iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objEablkybsjg = iobyxmoadgVar.f18193yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18191iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ay.wkgbmnqykc wkgbmnqykcVar = this.f18189iobyxmoadg;
            Set set2 = set;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(az.gtknphoqwx.iobyxmoadg((n10.iobyxmoadg) it.next()));
            }
            GetRecommendationsRequest getRecommendationsRequest = new GetRecommendationsRequest(arrayList, str, str2, deliveryCode != null ? deliveryCode.getServerCode() : null, list, (List) null, (String) null, 96, (kotlin.jvm.internal.gtknphoqwx) null);
            iobyxmoadgVar.f18194zdlpuopuiu = this;
            iobyxmoadgVar.f18191iwizpuwonk = 1;
            objEablkybsjg = wkgbmnqykcVar.eablkybsjg(getRecommendationsRequest, iobyxmoadgVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            yggfygwlheVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yggfygwlheVar = (yggfygwlhe) iobyxmoadgVar.f18194zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return yggfygwlheVar.f18190zoijcleaow.iobyxmoadg((RecommendationsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objEablkybsjg, null, 1, null));
    }
}
