package ek0;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import o40.eablkybsjg;
import ru.myspar.core.network.model.BasicResponse;
import yj0.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bk0.iobyxmoadg f31412iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ck0.iobyxmoadg f31413zoijcleaow;

    /* JADX INFO: renamed from: ek0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0669iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f31414iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f31416yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f31417zdlpuopuiu;

        C0669iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31416yggfygwlhe = obj;
            this.f31414iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, null, null, this);
        }
    }

    public iobyxmoadg(bk0.iobyxmoadg apiService, ck0.iobyxmoadg getProductsResponseToDomainMapper) {
        zdlpuopuiu.btonecajqb(apiService, "apiService");
        zdlpuopuiu.btonecajqb(getProductsResponseToDomainMapper, "getProductsResponseToDomainMapper");
        this.f31412iobyxmoadg = apiService;
        this.f31413zoijcleaow = getProductsResponseToDomainMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yj0.wkgbmnqykc
    public Object iobyxmoadg(String str, String str2, String str3, gxszxtbevo gxszxtbevoVar) {
        C0669iobyxmoadg c0669iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C0669iobyxmoadg) {
            c0669iobyxmoadg = (C0669iobyxmoadg) gxszxtbevoVar;
            int i13 = c0669iobyxmoadg.f31414iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0669iobyxmoadg.f31414iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0669iobyxmoadg = new C0669iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0669iobyxmoadg = new C0669iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0669iobyxmoadg.f31416yggfygwlhe;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c0669iobyxmoadg.f31414iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            dk0.iobyxmoadg iobyxmoadgVar2 = new dk0.iobyxmoadg(str, str2, str3);
            bk0.iobyxmoadg iobyxmoadgVar3 = this.f31412iobyxmoadg;
            c0669iobyxmoadg.f31417zdlpuopuiu = this;
            c0669iobyxmoadg.f31414iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar3.iobyxmoadg(iobyxmoadgVar2, c0669iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c0669iobyxmoadg.f31417zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f31413zoijcleaow.invoke(eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
