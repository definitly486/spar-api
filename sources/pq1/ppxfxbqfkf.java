package pq1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import rq1.wkgbmnqykc;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import sq1.ApplyCompetitionRequest;
import sq1.GetSpecialBannerRequest;
import sq1.SendBannerFormRequest;
import sq1.SpecialBannerDetailsDto;
import sq1.dxjokdxxww;
import vq1.esjtqupxsv;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements tq1.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f77149iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final qq1.iobyxmoadg f77150zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f77151iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f77153yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f77154zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77153yggfygwlhe = obj;
            this.f77151iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, null, this);
        }
    }

    /* JADX INFO: renamed from: pq1.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C1708ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f77155jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f77157zdlpuopuiu;

        C1708ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77157zdlpuopuiu = obj;
            this.f77155jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.wkgbmnqykc(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f77158iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f77160yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f77161zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77160yggfygwlhe = obj;
            this.f77158iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.eablkybsjg(null, null, null, this);
        }
    }

    public ppxfxbqfkf(wkgbmnqykc specialBannerResponseMapper, qq1.iobyxmoadg specialBannerApiService) {
        zdlpuopuiu.btonecajqb(specialBannerResponseMapper, "specialBannerResponseMapper");
        zdlpuopuiu.btonecajqb(specialBannerApiService, "specialBannerApiService");
        this.f77149iobyxmoadg = specialBannerResponseMapper;
        this.f77150zoijcleaow = specialBannerApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // tq1.zoijcleaow
    public Object eablkybsjg(String str, String str2, DeliveryCode deliveryCode, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f77158iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f77158iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f77160yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f77158iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            GetSpecialBannerRequest getSpecialBannerRequest = new GetSpecialBannerRequest(str, (String) null, str2, (String) null, deliveryCode != null ? deliveryCode.getServerCode() : null, 10, (gtknphoqwx) null);
            qq1.iobyxmoadg iobyxmoadgVar = this.f77150zoijcleaow;
            zoijcleaowVar.f77161zdlpuopuiu = this;
            zoijcleaowVar.f77158iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(getSpecialBannerRequest, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f77161zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ppxfxbqfkfVar.f77149iobyxmoadg.nufgyqmvbu((SpecialBannerDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // tq1.zoijcleaow
    public Object iobyxmoadg(String str, String str2, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f77151iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f77151iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f77153yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f77151iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            qq1.iobyxmoadg iobyxmoadgVar2 = this.f77150zoijcleaow;
            ApplyCompetitionRequest applyCompetitionRequest = new ApplyCompetitionRequest(str, str2);
            iobyxmoadgVar.f77154zdlpuopuiu = this;
            iobyxmoadgVar.f77151iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(applyCompetitionRequest, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f77154zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return ppxfxbqfkfVar.f77149iobyxmoadg.ppxfxbqfkf((dxjokdxxww.ButtonParticipateBannerDto.DataButtonParticipateBannerDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // tq1.zoijcleaow
    public Object wkgbmnqykc(esjtqupxsv esjtqupxsvVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C1708ppxfxbqfkf c1708ppxfxbqfkf;
        if (gxszxtbevoVar instanceof C1708ppxfxbqfkf) {
            c1708ppxfxbqfkf = (C1708ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c1708ppxfxbqfkf.f77155jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1708ppxfxbqfkf.f77155jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1708ppxfxbqfkf = new C1708ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c1708ppxfxbqfkf = new C1708ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c1708ppxfxbqfkf.f77157zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1708ppxfxbqfkf.f77155jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            qq1.iobyxmoadg iobyxmoadgVar = this.f77150zoijcleaow;
            SendBannerFormRequest sendBannerFormRequest = new SendBannerFormRequest(esjtqupxsvVar.zoijcleaow(), esjtqupxsvVar.ppxfxbqfkf(), esjtqupxsvVar.lqeggnwhkg(), esjtqupxsvVar.dxjokdxxww(), esjtqupxsvVar.wkgbmnqykc(), esjtqupxsvVar.iobyxmoadg(), esjtqupxsvVar.gtknphoqwx(), esjtqupxsvVar.nufgyqmvbu(), esjtqupxsvVar.gxszxtbevo(), esjtqupxsvVar.btonecajqb(), esjtqupxsvVar.eablkybsjg());
            c1708ppxfxbqfkf.f77155jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(sendBannerFormRequest, c1708ppxfxbqfkf);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
