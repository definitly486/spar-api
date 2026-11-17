package ex;

import dx.SpecialProductsDto;
import dx.SpecialProductsRequest;
import dx.SpecialProductsResponse;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ly.wkgbmnqykc;
import mg.zoijcleaow;
import o40.eablkybsjg;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.network.model.BasicResponse;
import tz.ProductDto;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cx.iobyxmoadg f32289iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f32290zoijcleaow;

    /* JADX INFO: renamed from: ex.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0699iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f32291cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f32293jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f32294yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32295zdlpuopuiu;

        C0699iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32293jyumaefscl = obj;
            this.f32291cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, null, null, this);
        }
    }

    public iobyxmoadg(cx.iobyxmoadg apiService, wkgbmnqykc productDtoToDomainMapper) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        zdlpuopuiu.btonecajqb(productDtoToDomainMapper, "productDtoToDomainMapper");
        this.f32289iobyxmoadg = apiService;
        this.f32290zoijcleaow = productDtoToDomainMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(String str, DeliveryCode deliveryCode, List list, gxszxtbevo gxszxtbevoVar) {
        C0699iobyxmoadg c0699iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        ax.wkgbmnqykc wkgbmnqykcVarIobyxmoadg;
        if (gxszxtbevoVar instanceof C0699iobyxmoadg) {
            c0699iobyxmoadg = (C0699iobyxmoadg) gxszxtbevoVar;
            int i13 = c0699iobyxmoadg.f32291cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0699iobyxmoadg.f32291cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c0699iobyxmoadg = new C0699iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0699iobyxmoadg = new C0699iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0699iobyxmoadg.f32293jyumaefscl;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c0699iobyxmoadg.f32291cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            String serverCode = deliveryCode != null ? deliveryCode.getServerCode() : null;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ax.wkgbmnqykc) it.next()).lqeggnwhkg());
            }
            SpecialProductsRequest specialProductsRequest = new SpecialProductsRequest(str, serverCode, arrayList);
            cx.iobyxmoadg iobyxmoadgVar2 = this.f32289iobyxmoadg;
            c0699iobyxmoadg.f32295zdlpuopuiu = this;
            c0699iobyxmoadg.f32294yggfygwlhe = list;
            c0699iobyxmoadg.f32291cqumvgiudr = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(specialProductsRequest, c0699iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c0699iobyxmoadg.f32294yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) c0699iobyxmoadg.f32295zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        SpecialProductsResponse specialProductsResponse = (SpecialProductsResponse) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put((ax.wkgbmnqykc) it2.next(), null);
        }
        for (SpecialProductsDto specialProductsDto : specialProductsResponse.getSpecialProducts()) {
            String type = specialProductsDto.getType();
            if (type != null && (wkgbmnqykcVarIobyxmoadg = ax.wkgbmnqykc.f14671yggfygwlhe.iobyxmoadg(type)) != null) {
                List productList = specialProductsDto.getProductList();
                ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
                Iterator it3 = productList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(iobyxmoadgVar.f32290zoijcleaow.ppxfxbqfkf((ProductDto) it3.next(), specialProductsResponse.getReferences(), null));
                }
                linkedHashMap.put(wkgbmnqykcVarIobyxmoadg, gx.iobyxmoadg.iobyxmoadg(specialProductsDto, arrayList2));
            }
        }
        return linkedHashMap;
    }
}
