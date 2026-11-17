package t90;

import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import ru.myspar.core.data.response.evropolis.EvropolisGiftDto;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.network.model.BasicResponse;
import s90.EvropolisRedeemDto;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements v90.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final r90.iobyxmoadg f110105iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final t90.zoijcleaow f110106ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final z90.iobyxmoadg f110107zoijcleaow;

    /* JADX INFO: renamed from: t90.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2703iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f110108iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f110110yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f110111zdlpuopuiu;

        C2703iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f110110yggfygwlhe = obj;
            this.f110108iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(0, null, null, this);
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f110112iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f110114yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f110115zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f110114yggfygwlhe = obj;
            this.f110112iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, null, this);
        }
    }

    public iobyxmoadg(r90.iobyxmoadg evropolisApiService, z90.iobyxmoadg giftResponseMapper, t90.zoijcleaow evropolisResponseMapper) {
        zdlpuopuiu.btonecajqb(evropolisApiService, "evropolisApiService");
        zdlpuopuiu.btonecajqb(giftResponseMapper, "giftResponseMapper");
        zdlpuopuiu.btonecajqb(evropolisResponseMapper, "evropolisResponseMapper");
        this.f110105iobyxmoadg = evropolisApiService;
        this.f110107zoijcleaow = giftResponseMapper;
        this.f110106ppxfxbqfkf = evropolisResponseMapper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v90.iobyxmoadg
    public Object iobyxmoadg(String str, DeliveryCode deliveryCode, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f110112iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f110112iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f110114yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f110112iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            r90.iobyxmoadg iobyxmoadgVar2 = this.f110105iobyxmoadg;
            String serverCode = deliveryCode != null ? deliveryCode.getServerCode() : null;
            zoijcleaowVar.f110115zdlpuopuiu = this;
            zoijcleaowVar.f110112iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(str, serverCode, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f110115zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return iobyxmoadgVar.f110106ppxfxbqfkf.iobyxmoadg((EvropolisRedeemDto) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v90.iobyxmoadg
    public Object zoijcleaow(int i13, String str, DeliveryCode deliveryCode, gxszxtbevo gxszxtbevoVar) {
        C2703iobyxmoadg c2703iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C2703iobyxmoadg) {
            c2703iobyxmoadg = (C2703iobyxmoadg) gxszxtbevoVar;
            int i14 = c2703iobyxmoadg.f110108iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2703iobyxmoadg.f110108iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                c2703iobyxmoadg = new C2703iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2703iobyxmoadg = new C2703iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c2703iobyxmoadg.f110110yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = c2703iobyxmoadg.f110108iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            r90.iobyxmoadg iobyxmoadgVar2 = this.f110105iobyxmoadg;
            String serverCode = deliveryCode != null ? deliveryCode.getServerCode() : null;
            c2703iobyxmoadg.f110111zdlpuopuiu = this;
            c2703iobyxmoadg.f110108iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(i13, str, serverCode, c2703iobyxmoadg);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) c2703iobyxmoadg.f110111zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return iobyxmoadgVar.f110107zoijcleaow.nufgyqmvbu((EvropolisGiftDto) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }
}
