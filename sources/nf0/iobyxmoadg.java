package nf0;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.coroutines.jvm.internal.zoijcleaow;
import kotlin.jvm.internal.zdlpuopuiu;
import lf0.ConfirmPopupRequest;
import lf0.GetPopupRequest;
import lg.gxszxtbevo;
import mf0.LoymaxPopupDto;
import o40.eablkybsjg;
import ru.myspar.core.network.model.BasicResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements bf0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final df0.iobyxmoadg f70018iobyxmoadg;

    /* JADX INFO: renamed from: nf0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1507iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f70019jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f70021zdlpuopuiu;

        C1507iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f70021zdlpuopuiu = obj;
            this.f70019jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zoijcleaow(null, null, null, this);
        }
    }

    public iobyxmoadg(df0.iobyxmoadg loymaxPopupApiService) {
        zdlpuopuiu.btonecajqb(loymaxPopupApiService, "loymaxPopupApiService");
        this.f70018iobyxmoadg = loymaxPopupApiService;
    }

    @Override // bf0.iobyxmoadg
    public Object iobyxmoadg(String str, long j13, gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = this.f70018iobyxmoadg.iobyxmoadg(new ConfirmPopupRequest(zoijcleaow.eablkybsjg(j13), str, null), gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bf0.iobyxmoadg
    public Object zoijcleaow(String str, String str2, String str3, gxszxtbevo gxszxtbevoVar) {
        C1507iobyxmoadg c1507iobyxmoadg;
        if (gxszxtbevoVar instanceof C1507iobyxmoadg) {
            c1507iobyxmoadg = (C1507iobyxmoadg) gxszxtbevoVar;
            int i13 = c1507iobyxmoadg.f70019jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1507iobyxmoadg.f70019jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                c1507iobyxmoadg = new C1507iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1507iobyxmoadg = new C1507iobyxmoadg(gxszxtbevoVar);
        }
        Object objZoijcleaow = c1507iobyxmoadg.f70021zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1507iobyxmoadg.f70019jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            df0.iobyxmoadg iobyxmoadgVar = this.f70018iobyxmoadg;
            GetPopupRequest getPopupRequest = new GetPopupRequest(str, str2, str3);
            c1507iobyxmoadg.f70019jyumaefscl = 1;
            objZoijcleaow = iobyxmoadgVar.zoijcleaow(getPopupRequest, c1507iobyxmoadg);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        LoymaxPopupDto loymaxPopupDto = (LoymaxPopupDto) jyumaefscl.weqkydbzbr((List) eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
        if (loymaxPopupDto != null) {
            return jf0.iobyxmoadg.iobyxmoadg(loymaxPopupDto);
        }
        return null;
    }
}
