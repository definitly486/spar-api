package yv0;

import gx0.wkgbmnqykc;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ly0.ProductDto;
import mg.zoijcleaow;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import xv0.SpecialProductsDto;
import xv0.SpecialProductsRequest;
import xv0.SpecialProductsResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wv0.iobyxmoadg f126721iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f126722zoijcleaow;

    /* JADX INFO: renamed from: yv0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3234iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f126723cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f126725jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f126726yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f126727zdlpuopuiu;

        C3234iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f126725jyumaefscl = obj;
            this.f126723cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, null, null, this);
        }
    }

    public iobyxmoadg(wv0.iobyxmoadg apiService, wkgbmnqykc productDtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        zdlpuopuiu.btonecajqb(productDtoToDomainMapper, "productDtoToDomainMapper");
        this.f126721iobyxmoadg = apiService;
        this.f126722zoijcleaow = productDtoToDomainMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(String str, DeliveryCode deliveryCode, List list, gxszxtbevo gxszxtbevoVar) {
        C3234iobyxmoadg c3234iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        uv0.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        if (gxszxtbevoVar instanceof C3234iobyxmoadg) {
            c3234iobyxmoadg = (C3234iobyxmoadg) gxszxtbevoVar;
            int i13 = c3234iobyxmoadg.f126723cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3234iobyxmoadg.f126723cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c3234iobyxmoadg = new C3234iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c3234iobyxmoadg = new C3234iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c3234iobyxmoadg.f126725jyumaefscl;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c3234iobyxmoadg.f126723cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            String serverCode = deliveryCode != null ? deliveryCode.getServerCode() : null;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((uv0.wkgbmnqykc) it.next()).lqeggnwhkg());
            }
            SpecialProductsRequest specialProductsRequest = new SpecialProductsRequest(str, serverCode, arrayList);
            wv0.iobyxmoadg iobyxmoadgVar2 = this.f126721iobyxmoadg;
            c3234iobyxmoadg.f126727zdlpuopuiu = this;
            c3234iobyxmoadg.f126726yggfygwlhe = list;
            c3234iobyxmoadg.f126723cqumvgiudr = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(specialProductsRequest, c3234iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c3234iobyxmoadg.f126726yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) c3234iobyxmoadg.f126727zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        SpecialProductsResponse specialProductsResponse = (SpecialProductsResponse) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put((uv0.wkgbmnqykc) it2.next(), null);
        }
        for (SpecialProductsDto specialProductsDto : specialProductsResponse.getSpecialProducts()) {
            String type = specialProductsDto.getType();
            if (type != null && (wkgbmnqykcVarIobyxmoadg = uv0.wkgbmnqykc.f114497yggfygwlhe.iobyxmoadg(type)) != null) {
                List productList = specialProductsDto.getProductList();
                ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
                Iterator it3 = productList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(iobyxmoadgVar.f126722zoijcleaow.ppxfxbqfkf((ProductDto) it3.next(), specialProductsResponse.getReferences(), null));
                }
                linkedHashMap.put(wkgbmnqykcVarIobyxmoadg, aw0.iobyxmoadg.iobyxmoadg(specialProductsDto, arrayList2));
            }
        }
        return linkedHashMap;
    }
}
