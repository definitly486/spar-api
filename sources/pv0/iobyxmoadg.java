package pv0;

import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import qv0.SearchAddressResponseDto;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import rv0.SearchShopsResponseDto;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements lv0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nv0.iobyxmoadg f77368iobyxmoadg;

    /* JADX INFO: renamed from: pv0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1717iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f77369jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f77371zdlpuopuiu;

        C1717iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77371zdlpuopuiu = obj;
            this.f77369jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, 0.0d, 0.0d, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f77372jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f77374zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77374zdlpuopuiu = obj;
            this.f77372jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, 0.0d, 0.0d, this);
        }
    }

    public iobyxmoadg(nv0.iobyxmoadg addressApiService) {
        zdlpuopuiu.btonecajqb(addressApiService, "addressApiService");
        this.f77368iobyxmoadg = addressApiService;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // lv0.iobyxmoadg
    public Object iobyxmoadg(String str, double d13, double d14, gxszxtbevo gxszxtbevoVar) {
        C1717iobyxmoadg c1717iobyxmoadg;
        if (gxszxtbevoVar instanceof C1717iobyxmoadg) {
            c1717iobyxmoadg = (C1717iobyxmoadg) gxszxtbevoVar;
            int i13 = c1717iobyxmoadg.f77369jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1717iobyxmoadg.f77369jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1717iobyxmoadg = new C1717iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1717iobyxmoadg = new C1717iobyxmoadg(gxszxtbevoVar);
        }
        C1717iobyxmoadg c1717iobyxmoadg2 = c1717iobyxmoadg;
        Object objIobyxmoadg = c1717iobyxmoadg2.f77371zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1717iobyxmoadg2.f77369jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            nv0.iobyxmoadg iobyxmoadgVar = this.f77368iobyxmoadg;
            c1717iobyxmoadg2.f77369jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(str, d13, d14, c1717iobyxmoadg2);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return ov0.iobyxmoadg.iobyxmoadg((SearchAddressResponseDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // lv0.iobyxmoadg
    public Object zoijcleaow(String str, double d13, double d14, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f77372jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f77372jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        Object objZoijcleaow = zoijcleaowVar2.f77374zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f77372jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            nv0.iobyxmoadg iobyxmoadgVar = this.f77368iobyxmoadg;
            zoijcleaowVar2.f77372jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(str, d13, d14, zoijcleaowVar2);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ov0.zoijcleaow.iobyxmoadg((SearchShopsResponseDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
