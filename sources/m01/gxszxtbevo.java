package m01;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import w01.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gtknphoqwx f64862zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.iobyxmoadg f64863iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f64864ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f64865zoijcleaow;

        public iobyxmoadg(mz0.iobyxmoadg flow, DeliveryCode deliveryCode, String str) {
            zdlpuopuiu.btonecajqb(flow, "flow");
            this.f64863iobyxmoadg = flow;
            this.f64865zoijcleaow = deliveryCode;
            this.f64864ppxfxbqfkf = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f64863iobyxmoadg == iobyxmoadgVar.f64863iobyxmoadg && this.f64865zoijcleaow == iobyxmoadgVar.f64865zoijcleaow && zdlpuopuiu.eablkybsjg(this.f64864ppxfxbqfkf, iobyxmoadgVar.f64864ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f64863iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f64865zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            String str = this.f64864ppxfxbqfkf;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f64865zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f64864ppxfxbqfkf;
        }

        public String toString() {
            return "Params(flow=" + this.f64863iobyxmoadg + ", deliveryType=" + this.f64865zoijcleaow + ", orderEditId=" + this.f64864ppxfxbqfkf + ")";
        }

        public final mz0.iobyxmoadg zoijcleaow() {
            return this.f64863iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f64866jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f64868zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f64868zdlpuopuiu = obj;
            this.f64866jyumaefscl |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f64862zoijcleaow = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f64866jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f64866jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f64868zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f64866jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            if (iobyxmoadgVar.zoijcleaow() != mz0.iobyxmoadg.ORDER_EDIT) {
                return iobyxmoadgVar.iobyxmoadg();
            }
            if (strPpxfxbqfkf == null || kcexrzcfyt.zfvoamnweg(strPpxfxbqfkf)) {
                return null;
            }
            gtknphoqwx gtknphoqwxVar = this.f64862zoijcleaow;
            gtknphoqwx.iobyxmoadg iobyxmoadgVar2 = new gtknphoqwx.iobyxmoadg(strPpxfxbqfkf);
            zoijcleaowVar.f64866jyumaefscl = 1;
            objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar2, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ((uz0.iobyxmoadg) objZoijcleaow).eablkybsjg();
    }
}
