package dl0;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.DeliveryInfo;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.ppxfxbqfkf f29121zoijcleaow;

    /* JADX INFO: renamed from: dl0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0579iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f29122iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final cl0.zoijcleaow f29123zoijcleaow;

        public C0579iobyxmoadg(boolean z13, cl0.zoijcleaow addressTypeFromCart) {
            zdlpuopuiu.btonecajqb(addressTypeFromCart, "addressTypeFromCart");
            this.f29122iobyxmoadg = z13;
            this.f29123zoijcleaow = addressTypeFromCart;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0579iobyxmoadg)) {
                return false;
            }
            C0579iobyxmoadg c0579iobyxmoadg = (C0579iobyxmoadg) obj;
            return this.f29122iobyxmoadg == c0579iobyxmoadg.f29122iobyxmoadg && this.f29123zoijcleaow == c0579iobyxmoadg.f29123zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f29122iobyxmoadg) * 31) + this.f29123zoijcleaow.hashCode();
        }

        public final cl0.zoijcleaow iobyxmoadg() {
            return this.f29123zoijcleaow;
        }

        public String toString() {
            return "Result(hasUserAnyAddress=" + this.f29122iobyxmoadg + ", addressTypeFromCart=" + this.f29123zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f29122iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f29124iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f29126yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f29127zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f29126yggfygwlhe = obj;
            this.f29124iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f29128iobyxmoadg;

        static {
            int[] iArr = new int[DeliveryCode.values().length];
            try {
                iArr[DeliveryCode.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryCode.PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29128iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k01.ppxfxbqfkf cartLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f29121zoijcleaow = cartLocalSource;
    }

    private final cl0.zoijcleaow wkgbmnqykc(DeliveryCode deliveryCode) {
        int i13 = deliveryCode == null ? -1 : zoijcleaow.f29128iobyxmoadg[deliveryCode.ordinal()];
        if (i13 != 1 && i13 == 2) {
            return cl0.zoijcleaow.PickUp;
        }
        return cl0.zoijcleaow.Delivery;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f29124iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f29124iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objEablkybsjg = ppxfxbqfkfVar.f29126yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f29124iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            k01.ppxfxbqfkf ppxfxbqfkfVar2 = this.f29121zoijcleaow;
            ppxfxbqfkfVar.f29127zdlpuopuiu = this;
            ppxfxbqfkfVar.f29124iwizpuwonk = 1;
            objEablkybsjg = ppxfxbqfkfVar2.eablkybsjg(ppxfxbqfkfVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f29127zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        DeliveryInfo deliveryInfo = (DeliveryInfo) objEablkybsjg;
        return new C0579iobyxmoadg(deliveryInfo.getDeliveryType() != null, iobyxmoadgVar.wkgbmnqykc(deliveryInfo.getDeliveryType()));
    }
}
