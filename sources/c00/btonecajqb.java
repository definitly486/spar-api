package c00;

import b00.FetchDeleteAccountSmsDto;
import gg.wwaezpbzkn;
import ru.myspar.core.network.model.BasicResponse;
import uy.DeleteAccountConfirmRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb implements y10.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.eablkybsjg f17846iobyxmoadg;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f17847jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17849zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17849zdlpuopuiu = obj;
            this.f17847jyumaefscl |= Integer.MIN_VALUE;
            return btonecajqb.this.zoijcleaow(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f17850jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f17852zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17852zdlpuopuiu = obj;
            this.f17850jyumaefscl |= Integer.MIN_VALUE;
            return btonecajqb.this.iobyxmoadg(this);
        }
    }

    public btonecajqb(ay.eablkybsjg deleteAccountApiService) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteAccountApiService, "deleteAccountApiService");
        this.f17846iobyxmoadg = deleteAccountApiService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y10.zoijcleaow
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f17850jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f17850jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f17852zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f17850jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.eablkybsjg eablkybsjgVar = this.f17846iobyxmoadg;
            zoijcleaowVar.f17850jyumaefscl = 1;
            objZoijcleaow = eablkybsjgVar.zoijcleaow(zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ky.ppxfxbqfkf.iobyxmoadg((FetchDeleteAccountSmsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y10.zoijcleaow
    public Object zoijcleaow(String str, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f17847jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f17847jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f17849zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f17847jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ay.eablkybsjg eablkybsjgVar = this.f17846iobyxmoadg;
            DeleteAccountConfirmRequest deleteAccountConfirmRequest = new DeleteAccountConfirmRequest(str);
            iobyxmoadgVar.f17847jyumaefscl = 1;
            objIobyxmoadg = eablkybsjgVar.iobyxmoadg(deleteAccountConfirmRequest, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
