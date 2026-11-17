package ty0;

import dy0.RecommendationsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ux0.GetRecommendationsRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class kcexrzcfyt implements l01.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.wkgbmnqykc f111966iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gx0.lqeggnwhkg f111967zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111968iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111970yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111971zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111970yggfygwlhe = obj;
            this.f111968iwizpuwonk |= Integer.MIN_VALUE;
            return kcexrzcfyt.this.iobyxmoadg(null, null, null, null, null, this);
        }
    }

    public kcexrzcfyt(ww0.wkgbmnqykc catalogApiService, gx0.lqeggnwhkg recommendationsResponseMapper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogApiService, "catalogApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendationsResponseMapper, "recommendationsResponseMapper");
        this.f111966iobyxmoadg = catalogApiService;
        this.f111967zoijcleaow = recommendationsResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // l01.wkgbmnqykc
    public Object iobyxmoadg(String str, String str2, DeliveryCode deliveryCode, List list, Set set, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        kcexrzcfyt kcexrzcfytVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f111968iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f111968iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = iobyxmoadgVar.f111970yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f111968iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ww0.wkgbmnqykc wkgbmnqykcVar = this.f111966iobyxmoadg;
            Set set2 = set;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(ux0.gtknphoqwx.iobyxmoadg((d01.iobyxmoadg) it.next()));
            }
            GetRecommendationsRequest getRecommendationsRequest = new GetRecommendationsRequest(arrayList, str, str2, deliveryCode != null ? deliveryCode.getServerCode() : null, list, (List) null, (String) null, 96, (kotlin.jvm.internal.gtknphoqwx) null);
            iobyxmoadgVar.f111971zdlpuopuiu = this;
            iobyxmoadgVar.f111968iwizpuwonk = 1;
            objWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc(getRecommendationsRequest, iobyxmoadgVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            kcexrzcfytVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kcexrzcfytVar = (kcexrzcfyt) iobyxmoadgVar.f111971zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return kcexrzcfytVar.f111967zoijcleaow.iobyxmoadg((RecommendationsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objWkgbmnqykc, null, 1, null));
    }
}
