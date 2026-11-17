package z10;

import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import o20.btonecajqb;
import pj.pkzmftpjix;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final btonecajqb f127544zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.iobyxmoadg f127545iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f127546ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f127547zoijcleaow;

        public iobyxmoadg(v00.iobyxmoadg flow, DeliveryCode deliveryCode, String str) {
            zdlpuopuiu.btonecajqb(flow, "flow");
            this.f127545iobyxmoadg = flow;
            this.f127547zoijcleaow = deliveryCode;
            this.f127546ppxfxbqfkf = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f127545iobyxmoadg == iobyxmoadgVar.f127545iobyxmoadg && this.f127547zoijcleaow == iobyxmoadgVar.f127547zoijcleaow && zdlpuopuiu.eablkybsjg(this.f127546ppxfxbqfkf, iobyxmoadgVar.f127546ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = this.f127545iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f127547zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            String str = this.f127546ppxfxbqfkf;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f127547zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f127546ppxfxbqfkf;
        }

        public String toString() {
            return "Params(flow=" + this.f127545iobyxmoadg + ", deliveryType=" + this.f127547zoijcleaow + ", orderEditId=" + this.f127546ppxfxbqfkf + ")";
        }

        public final v00.iobyxmoadg zoijcleaow() {
            return this.f127545iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f127548jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f127550zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f127550zdlpuopuiu = obj;
            this.f127548jyumaefscl |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f127544zoijcleaow = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f127548jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f127548jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f127550zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f127548jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            if (iobyxmoadgVar.zoijcleaow() != v00.iobyxmoadg.ORDER_EDIT) {
                return iobyxmoadgVar.iobyxmoadg();
            }
            if (strPpxfxbqfkf == null || kcexrzcfyt.zfvoamnweg(strPpxfxbqfkf)) {
                return null;
            }
            btonecajqb btonecajqbVar = this.f127544zoijcleaow;
            btonecajqb.iobyxmoadg iobyxmoadgVar2 = new btonecajqb.iobyxmoadg(strPpxfxbqfkf);
            zoijcleaowVar.f127548jyumaefscl = 1;
            objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar2, zoijcleaowVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ((e10.iobyxmoadg) objZoijcleaow).eablkybsjg();
    }
}
