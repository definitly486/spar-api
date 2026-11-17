package w42;

import c52.esjtqupxsv;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o40.eablkybsjg;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.network.model.BasicResponse;
import y42.wkgbmnqykc;
import z42.ApplyCompetitionRequest;
import z42.GetSpecialBannerRequest;
import z42.SendBannerFormRequest;
import z42.SpecialBannerDetailsDto;
import z42.dxjokdxxww;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf implements a52.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f118753iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x42.iobyxmoadg f118754zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f118755iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f118757yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118758zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118757yggfygwlhe = obj;
            this.f118755iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, null, this);
        }
    }

    /* JADX INFO: renamed from: w42.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C2953ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f118759jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f118761zdlpuopuiu;

        C2953ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118761zdlpuopuiu = obj;
            this.f118759jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.wkgbmnqykc(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f118762iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f118764yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118765zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118764yggfygwlhe = obj;
            this.f118762iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.eablkybsjg(null, null, null, this);
        }
    }

    public ppxfxbqfkf(wkgbmnqykc specialBannerResponseMapper, x42.iobyxmoadg specialBannerApiService) {
        zdlpuopuiu.btonecajqb(specialBannerResponseMapper, "specialBannerResponseMapper");
        zdlpuopuiu.btonecajqb(specialBannerApiService, "specialBannerApiService");
        this.f118753iobyxmoadg = specialBannerResponseMapper;
        this.f118754zoijcleaow = specialBannerApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // a52.zoijcleaow
    public Object eablkybsjg(String str, String str2, DeliveryCode deliveryCode, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118762iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118762iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f118764yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118762iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            GetSpecialBannerRequest getSpecialBannerRequest = new GetSpecialBannerRequest(str, (String) null, str2, (String) null, deliveryCode != null ? deliveryCode.getServerCode() : null, 10, (gtknphoqwx) null);
            x42.iobyxmoadg iobyxmoadgVar = this.f118754zoijcleaow;
            zoijcleaowVar.f118765zdlpuopuiu = this;
            zoijcleaowVar.f118762iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(getSpecialBannerRequest, zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f118765zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return ppxfxbqfkfVar.f118753iobyxmoadg.nufgyqmvbu((SpecialBannerDetailsDto) eablkybsjg.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a52.zoijcleaow
    public Object iobyxmoadg(String str, String str2, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f118755iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f118755iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = iobyxmoadgVar.f118757yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f118755iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            x42.iobyxmoadg iobyxmoadgVar2 = this.f118754zoijcleaow;
            ApplyCompetitionRequest applyCompetitionRequest = new ApplyCompetitionRequest(str, str2);
            iobyxmoadgVar.f118758zdlpuopuiu = this;
            iobyxmoadgVar.f118755iwizpuwonk = 1;
            objZoijcleaow = iobyxmoadgVar2.zoijcleaow(applyCompetitionRequest, iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f118758zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ppxfxbqfkfVar.f118753iobyxmoadg.ppxfxbqfkf((dxjokdxxww.ButtonParticipateBannerDto.DataButtonParticipateBannerDto) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // a52.zoijcleaow
    public Object wkgbmnqykc(esjtqupxsv esjtqupxsvVar, gxszxtbevo gxszxtbevoVar) throws Throwable {
        C2953ppxfxbqfkf c2953ppxfxbqfkf;
        if (gxszxtbevoVar instanceof C2953ppxfxbqfkf) {
            c2953ppxfxbqfkf = (C2953ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c2953ppxfxbqfkf.f118759jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2953ppxfxbqfkf.f118759jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c2953ppxfxbqfkf = new C2953ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c2953ppxfxbqfkf = new C2953ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = c2953ppxfxbqfkf.f118761zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2953ppxfxbqfkf.f118759jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            x42.iobyxmoadg iobyxmoadgVar = this.f118754zoijcleaow;
            SendBannerFormRequest sendBannerFormRequest = new SendBannerFormRequest(esjtqupxsvVar.zoijcleaow(), esjtqupxsvVar.ppxfxbqfkf(), esjtqupxsvVar.lqeggnwhkg(), esjtqupxsvVar.dxjokdxxww(), esjtqupxsvVar.wkgbmnqykc(), esjtqupxsvVar.iobyxmoadg(), esjtqupxsvVar.gtknphoqwx(), esjtqupxsvVar.nufgyqmvbu(), esjtqupxsvVar.gxszxtbevo(), esjtqupxsvVar.btonecajqb(), esjtqupxsvVar.eablkybsjg());
            c2953ppxfxbqfkf.f118759jyumaefscl = 1;
            objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(sendBannerFormRequest, c2953ppxfxbqfkf);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        eablkybsjg.btonecajqb((BasicResponse) objPpxfxbqfkf, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
