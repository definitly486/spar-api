package vw;

import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import ru.myspar.core.network.model.BasicResponse;
import ww.SearchAddressResponseDto;
import xw.SearchShopsResponseDto;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements rw.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tw.iobyxmoadg f118128iobyxmoadg;

    /* JADX INFO: renamed from: vw.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2933iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f118129jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f118131zdlpuopuiu;

        C2933iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118131zdlpuopuiu = obj;
            this.f118129jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, 0.0d, 0.0d, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f118132jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f118134zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118134zdlpuopuiu = obj;
            this.f118132jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, 0.0d, 0.0d, this);
        }
    }

    public iobyxmoadg(tw.iobyxmoadg addressApiService) {
        zdlpuopuiu.btonecajqb(addressApiService, "addressApiService");
        this.f118128iobyxmoadg = addressApiService;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // rw.iobyxmoadg
    public Object iobyxmoadg(String str, double d13, double d14, gxszxtbevo gxszxtbevoVar) {
        C2933iobyxmoadg c2933iobyxmoadg;
        if (gxszxtbevoVar instanceof C2933iobyxmoadg) {
            c2933iobyxmoadg = (C2933iobyxmoadg) gxszxtbevoVar;
            int i13 = c2933iobyxmoadg.f118129jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2933iobyxmoadg.f118129jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2933iobyxmoadg = new C2933iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2933iobyxmoadg = new C2933iobyxmoadg(gxszxtbevoVar);
        }
        C2933iobyxmoadg c2933iobyxmoadg2 = c2933iobyxmoadg;
        Object objIobyxmoadg = c2933iobyxmoadg2.f118131zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2933iobyxmoadg2.f118129jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            tw.iobyxmoadg iobyxmoadgVar = this.f118128iobyxmoadg;
            c2933iobyxmoadg2.f118129jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(str, d13, d14, c2933iobyxmoadg2);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return uw.iobyxmoadg.iobyxmoadg((SearchAddressResponseDto) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // rw.iobyxmoadg
    public Object zoijcleaow(String str, double d13, double d14, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118132jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118132jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        Object objZoijcleaow = zoijcleaowVar2.f118134zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f118132jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            tw.iobyxmoadg iobyxmoadgVar = this.f118128iobyxmoadg;
            zoijcleaowVar2.f118132jyumaefscl = 1;
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
        return uw.zoijcleaow.iobyxmoadg((SearchShopsResponseDto) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
