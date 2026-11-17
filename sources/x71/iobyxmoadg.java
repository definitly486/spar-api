package x71;

import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.data.response.evropolis.EvropolisGiftDto;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import w71.EvropolisRedeemDto;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements z71.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v71.iobyxmoadg f121413iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final x71.zoijcleaow f121414ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final d81.iobyxmoadg f121415zoijcleaow;

    /* JADX INFO: renamed from: x71.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3058iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f121416iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f121418yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f121419zdlpuopuiu;

        C3058iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f121418yggfygwlhe = obj;
            this.f121416iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(0, null, null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f121420iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f121422yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f121423zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f121422yggfygwlhe = obj;
            this.f121420iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, this);
        }
    }

    public iobyxmoadg(v71.iobyxmoadg evropolisApiService, d81.iobyxmoadg giftResponseMapper, x71.zoijcleaow evropolisResponseMapper) {
        zdlpuopuiu.btonecajqb(evropolisApiService, "evropolisApiService");
        zdlpuopuiu.btonecajqb(giftResponseMapper, "giftResponseMapper");
        zdlpuopuiu.btonecajqb(evropolisResponseMapper, "evropolisResponseMapper");
        this.f121413iobyxmoadg = evropolisApiService;
        this.f121415zoijcleaow = giftResponseMapper;
        this.f121414ppxfxbqfkf = evropolisResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z71.iobyxmoadg
    public Object iobyxmoadg(int i13, String str, DeliveryCode deliveryCode, gxszxtbevo gxszxtbevoVar) {
        C3058iobyxmoadg c3058iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C3058iobyxmoadg) {
            c3058iobyxmoadg = (C3058iobyxmoadg) gxszxtbevoVar;
            int i14 = c3058iobyxmoadg.f121416iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c3058iobyxmoadg.f121416iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                c3058iobyxmoadg = new C3058iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c3058iobyxmoadg = new C3058iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c3058iobyxmoadg.f121418yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = c3058iobyxmoadg.f121416iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            v71.iobyxmoadg iobyxmoadgVar2 = this.f121413iobyxmoadg;
            String serverCode = deliveryCode != null ? deliveryCode.getServerCode() : null;
            c3058iobyxmoadg.f121419zdlpuopuiu = this;
            c3058iobyxmoadg.f121416iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(i13, str, serverCode, c3058iobyxmoadg);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c3058iobyxmoadg.f121419zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return iobyxmoadgVar.f121415zoijcleaow.nufgyqmvbu((EvropolisGiftDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z71.iobyxmoadg
    public Object zoijcleaow(String str, DeliveryCode deliveryCode, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f121420iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f121420iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f121422yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f121420iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            v71.iobyxmoadg iobyxmoadgVar2 = this.f121413iobyxmoadg;
            String serverCode = deliveryCode != null ? deliveryCode.getServerCode() : null;
            zoijcleaowVar.f121423zdlpuopuiu = this;
            zoijcleaowVar.f121420iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(str, serverCode, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f121423zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f121414ppxfxbqfkf.iobyxmoadg((EvropolisRedeemDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }
}
