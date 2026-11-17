package zg0;

import gg.kcexrzcfyt;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j20.iobyxmoadg f129963zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129964iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f129965zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f129964iobyxmoadg = shopId;
            this.f129965zoijcleaow = deliveryCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f129964iobyxmoadg, iobyxmoadgVar.f129964iobyxmoadg) && this.f129965zoijcleaow == iobyxmoadgVar.f129965zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f129964iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f129965zoijcleaow;
            return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f129965zoijcleaow;
        }

        public String toString() {
            return "Params(shopId=" + this.f129964iobyxmoadg + ", deliveryType=" + this.f129965zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f129964iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f129966jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f129968zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129968zdlpuopuiu = obj;
            this.f129966jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(j20.iobyxmoadg getComboSetUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(getComboSetUseCase, "getComboSetUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f129963zoijcleaow = getComboSetUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f129966jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f129966jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f129968zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f129966jyumaefscl;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                j20.iobyxmoadg iobyxmoadgVar3 = this.f129963zoijcleaow;
                j20.iobyxmoadg.InterfaceC1083iobyxmoadg.zoijcleaow zoijcleaowVar2 = new j20.iobyxmoadg.InterfaceC1083iobyxmoadg.zoijcleaow(iobyxmoadgVar.zoijcleaow(), w00.zoijcleaow.HOME_SCREEN, iobyxmoadgVar.iobyxmoadg(), null, null, 24, null);
                zoijcleaowVar.f129966jyumaefscl = 1;
                objZoijcleaow = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar2, zoijcleaowVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        return kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? jyumaefscl.wflxmlrfwp() : objWkgbmnqykc;
    }
}
