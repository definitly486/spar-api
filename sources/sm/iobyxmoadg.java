package sm;

import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.cart.DeliveryInfo;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.ppxfxbqfkf f107680zoijcleaow;

    /* JADX INFO: renamed from: sm.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2644iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f107681iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final rm.zoijcleaow f107682zoijcleaow;

        public C2644iobyxmoadg(boolean z13, rm.zoijcleaow addressTypeFromCart) {
            zdlpuopuiu.btonecajqb(addressTypeFromCart, "addressTypeFromCart");
            this.f107681iobyxmoadg = z13;
            this.f107682zoijcleaow = addressTypeFromCart;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2644iobyxmoadg)) {
                return false;
            }
            C2644iobyxmoadg c2644iobyxmoadg = (C2644iobyxmoadg) obj;
            return this.f107681iobyxmoadg == c2644iobyxmoadg.f107681iobyxmoadg && this.f107682zoijcleaow == c2644iobyxmoadg.f107682zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f107681iobyxmoadg) * 31) + this.f107682zoijcleaow.hashCode();
        }

        public final rm.zoijcleaow iobyxmoadg() {
            return this.f107682zoijcleaow;
        }

        public String toString() {
            return "Result(hasUserAnyAddress=" + this.f107681iobyxmoadg + ", addressTypeFromCart=" + this.f107682zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f107681iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f107683iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107685yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107686zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107685yggfygwlhe = obj;
            this.f107683iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f107687iobyxmoadg;

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
            f107687iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(w10.ppxfxbqfkf cartLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f107680zoijcleaow = cartLocalSource;
    }

    private final rm.zoijcleaow wkgbmnqykc(DeliveryCode deliveryCode) {
        int i13 = deliveryCode == null ? -1 : zoijcleaow.f107687iobyxmoadg[deliveryCode.ordinal()];
        if (i13 != 1 && i13 == 2) {
            return rm.zoijcleaow.PickUp;
        }
        return rm.zoijcleaow.Delivery;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f107683iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f107683iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objEablkybsjg = ppxfxbqfkfVar.f107685yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f107683iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            w10.ppxfxbqfkf ppxfxbqfkfVar2 = this.f107680zoijcleaow;
            ppxfxbqfkfVar.f107686zdlpuopuiu = this;
            ppxfxbqfkfVar.f107683iwizpuwonk = 1;
            objEablkybsjg = ppxfxbqfkfVar2.eablkybsjg(ppxfxbqfkfVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f107686zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        DeliveryInfo deliveryInfo = (DeliveryInfo) objEablkybsjg;
        return new C2644iobyxmoadg(deliveryInfo.getDeliveryType() != null, iobyxmoadgVar.wkgbmnqykc(deliveryInfo.getDeliveryType()));
    }
}
