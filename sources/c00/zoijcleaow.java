package c00;

import az.GetCatalogBannersRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lz.CatalogBannerDto;
import lz.CatalogBannersDto;
import oy.SpecialBannerMapDto;
import ru.myspar.core.network.model.BasicResponse;
import wy.GetSpecialBannerMapRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements x10.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.nufgyqmvbu f18205iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ay.iobyxmoadg f18206zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18207jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18209zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18209zdlpuopuiu = obj;
            this.f18207jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.zoijcleaow(null, null, this);
        }
    }

    /* JADX INFO: renamed from: c00.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0335zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18210jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18212zdlpuopuiu;

        C0335zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18212zdlpuopuiu = obj;
            this.f18210jyumaefscl |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, 0, this);
        }
    }

    public zoijcleaow(ay.nufgyqmvbu otherApiService, ay.iobyxmoadg bannersApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(otherApiService, "otherApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bannersApiService, "bannersApiService");
        this.f18205iobyxmoadg = otherApiService;
        this.f18206zoijcleaow = bannersApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x10.iobyxmoadg
    public Object iobyxmoadg(String str, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        C0335zoijcleaow c0335zoijcleaow;
        if (gxszxtbevoVar instanceof C0335zoijcleaow) {
            c0335zoijcleaow = (C0335zoijcleaow) gxszxtbevoVar;
            int i14 = c0335zoijcleaow.f18210jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0335zoijcleaow.f18210jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                c0335zoijcleaow = new C0335zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0335zoijcleaow = new C0335zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0335zoijcleaow.f18212zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = c0335zoijcleaow.f18210jyumaefscl;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.nufgyqmvbu nufgyqmvbuVar = this.f18205iobyxmoadg;
            GetSpecialBannerMapRequest getSpecialBannerMapRequest = new GetSpecialBannerMapRequest(str, i13);
            c0335zoijcleaow.f18210jyumaefscl = 1;
            objZoijcleaow = nufgyqmvbuVar.zoijcleaow(getSpecialBannerMapRequest, c0335zoijcleaow);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return oy.rgvfuqvkyq.iobyxmoadg((SpecialBannerMapDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x10.iobyxmoadg
    public Object zoijcleaow(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18207jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18207jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f18209zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18207jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.iobyxmoadg iobyxmoadgVar2 = this.f18206zoijcleaow;
            GetCatalogBannersRequest getCatalogBannersRequest = new GetCatalogBannersRequest(str2, str);
            iobyxmoadgVar.f18207jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(getCatalogBannersRequest, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List items = ((CatalogBannersDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null)).getItems();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ly.iobyxmoadg.iobyxmoadg((CatalogBannerDto) it.next()));
        }
        return arrayList;
    }
}
