package ty0;

import dy0.CatalogBannerDto;
import dy0.CatalogBannersDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx0.SpecialBannerMapDto;
import qx0.GetSpecialBannerMapRequest;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ux0.GetCatalogBannersRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements l01.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.lqeggnwhkg f111945iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ww0.iobyxmoadg f111946zoijcleaow;

    /* JADX INFO: renamed from: ty0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2754iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111947jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111949zdlpuopuiu;

        C2754iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111949zdlpuopuiu = obj;
            this.f111947jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111950jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111952zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111952zdlpuopuiu = obj;
            this.f111950jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, 0, this);
        }
    }

    public iobyxmoadg(ww0.lqeggnwhkg otherApiService, ww0.iobyxmoadg bannersApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(otherApiService, "otherApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bannersApiService, "bannersApiService");
        this.f111945iobyxmoadg = otherApiService;
        this.f111946zoijcleaow = bannersApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l01.iobyxmoadg
    public Object iobyxmoadg(String str, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i14 = zoijcleaowVar.f111950jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f111950jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f111952zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = zoijcleaowVar.f111950jyumaefscl;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ww0.lqeggnwhkg lqeggnwhkgVar = this.f111945iobyxmoadg;
            GetSpecialBannerMapRequest getSpecialBannerMapRequest = new GetSpecialBannerMapRequest(str, i13);
            zoijcleaowVar.f111950jyumaefscl = 1;
            objIobyxmoadg = lqeggnwhkgVar.iobyxmoadg(getSpecialBannerMapRequest, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return jx0.rgvfuqvkyq.iobyxmoadg((SpecialBannerMapDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l01.iobyxmoadg
    public Object zoijcleaow(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        C2754iobyxmoadg c2754iobyxmoadg;
        if (gxszxtbevoVar instanceof C2754iobyxmoadg) {
            c2754iobyxmoadg = (C2754iobyxmoadg) gxszxtbevoVar;
            int i13 = c2754iobyxmoadg.f111947jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2754iobyxmoadg.f111947jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2754iobyxmoadg = new C2754iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2754iobyxmoadg = new C2754iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2754iobyxmoadg.f111949zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2754iobyxmoadg.f111947jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ww0.iobyxmoadg iobyxmoadgVar = this.f111946zoijcleaow;
            GetCatalogBannersRequest getCatalogBannersRequest = new GetCatalogBannersRequest(str2, str);
            c2754iobyxmoadg.f111947jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(getCatalogBannersRequest, c2754iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List items = ((CatalogBannersDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null)).getItems();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(gx0.iobyxmoadg.iobyxmoadg((CatalogBannerDto) it.next()));
        }
        return arrayList;
    }
}
