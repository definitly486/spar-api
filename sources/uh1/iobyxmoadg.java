package uh1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import oh1.wkgbmnqykc;
import ru.myspar.proloyalty.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rh1.iobyxmoadg f113596iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final sh1.iobyxmoadg f113597zoijcleaow;

    /* JADX INFO: renamed from: uh1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2817iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f113598iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f113600yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f113601zdlpuopuiu;

        C2817iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f113600yggfygwlhe = obj;
            this.f113598iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, null, null, this);
        }
    }

    public iobyxmoadg(rh1.iobyxmoadg apiService, sh1.iobyxmoadg getProductsResponseToDomainMapper) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        zdlpuopuiu.btonecajqb(getProductsResponseToDomainMapper, "getProductsResponseToDomainMapper");
        this.f113596iobyxmoadg = apiService;
        this.f113597zoijcleaow = getProductsResponseToDomainMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oh1.wkgbmnqykc
    public Object iobyxmoadg(String str, String str2, String str3, gxszxtbevo gxszxtbevoVar) {
        C2817iobyxmoadg c2817iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C2817iobyxmoadg) {
            c2817iobyxmoadg = (C2817iobyxmoadg) gxszxtbevoVar;
            int i13 = c2817iobyxmoadg.f113598iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2817iobyxmoadg.f113598iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c2817iobyxmoadg = new C2817iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2817iobyxmoadg = new C2817iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2817iobyxmoadg.f113600yggfygwlhe;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c2817iobyxmoadg.f113598iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            th1.iobyxmoadg iobyxmoadgVar2 = new th1.iobyxmoadg(str, str2, str3);
            rh1.iobyxmoadg iobyxmoadgVar3 = this.f113596iobyxmoadg;
            c2817iobyxmoadg.f113601zdlpuopuiu = this;
            c2817iobyxmoadg.f113598iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar3.iobyxmoadg(iobyxmoadgVar2, c2817iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c2817iobyxmoadg.f113601zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f113597zoijcleaow.invoke(x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
