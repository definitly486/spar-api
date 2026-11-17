package dw0;

import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.WarningDto;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bw0.iobyxmoadg f29717zoijcleaow;

    /* JADX INFO: renamed from: dw0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0602iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f29718iobyxmoadg;

        public C0602iobyxmoadg(String requestId) {
            zdlpuopuiu.btonecajqb(requestId, "requestId");
            this.f29718iobyxmoadg = requestId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0602iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29718iobyxmoadg, ((C0602iobyxmoadg) obj).f29718iobyxmoadg);
        }

        public int hashCode() {
            return this.f29718iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f29718iobyxmoadg;
        }

        public String toString() {
            return "Result(requestId=" + this.f29718iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f29719jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f29721zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29721zdlpuopuiu = obj;
            this.f29719jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(bw0.iobyxmoadg vpnApiService, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(vpnApiService, "vpnApiService");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f29717zoijcleaow = vpnApiService;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Object next;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f29719jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f29719jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f29721zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f29719jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            bw0.iobyxmoadg iobyxmoadgVar = this.f29717zoijcleaow;
            zoijcleaowVar.f29719jyumaefscl = 1;
            objIobyxmoadg = iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        List<WarningDto> warnings = ((BasicResponse) objIobyxmoadg).getWarnings();
        C0602iobyxmoadg c0602iobyxmoadg = null;
        if (warnings != null) {
            Iterator<T> it = warnings.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kcexrzcfyt.istkbnxepw(((WarningDto) next).getCode(), "vpnError", true));
            WarningDto warningDto = (WarningDto) next;
            if (warningDto != null) {
                String message = warningDto.getMessage();
                if (message == null) {
                    message = "";
                }
                c0602iobyxmoadg = new C0602iobyxmoadg(message);
            }
        }
        return c0602iobyxmoadg;
    }
}
