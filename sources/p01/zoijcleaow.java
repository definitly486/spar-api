package p01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartReceiver;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.ppxfxbqfkf f75383ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.wkgbmnqykc f75384zoijcleaow;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: p01.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1651iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C1651iobyxmoadg f75385iobyxmoadg = new C1651iobyxmoadg();

            private C1651iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1651iobyxmoadg);
            }

            public int hashCode() {
                return -533026485;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: p01.zoijcleaow$iobyxmoadg$zoijcleaow, reason: collision with other inner class name */
        public static final class C1652zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f75386iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f75387zoijcleaow;

            public C1652zoijcleaow(String name, String phone) {
                zdlpuopuiu.btonecajqb(name, "name");
                zdlpuopuiu.btonecajqb(phone, "phone");
                this.f75386iobyxmoadg = name;
                this.f75387zoijcleaow = phone;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1652zoijcleaow)) {
                    return false;
                }
                C1652zoijcleaow c1652zoijcleaow = (C1652zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f75386iobyxmoadg, c1652zoijcleaow.f75386iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75387zoijcleaow, c1652zoijcleaow.f75387zoijcleaow);
            }

            public int hashCode() {
                return (this.f75386iobyxmoadg.hashCode() * 31) + this.f75387zoijcleaow.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f75386iobyxmoadg;
            }

            public String toString() {
                return "Receiver(name=" + this.f75386iobyxmoadg + ", phone=" + this.f75387zoijcleaow + ")";
            }

            public final String zoijcleaow() {
                return this.f75387zoijcleaow;
            }
        }
    }

    /* JADX INFO: renamed from: p01.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1653zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f75388cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f75390jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f75391yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75392zdlpuopuiu;

        C1653zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75390jyumaefscl = obj;
            this.f75388cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(k01.wkgbmnqykc cartRemoteSource, k01.ppxfxbqfkf cartLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f75384zoijcleaow = cartRemoteSource;
        this.f75383ppxfxbqfkf = cartLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:34:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C1653zoijcleaow c1653zoijcleaow;
        CartReceiver cartReceiver;
        zoijcleaow zoijcleaowVar;
        CartReceiver cartReceiver2;
        Cart cartZoijcleaow;
        k01.ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof C1653zoijcleaow) {
            c1653zoijcleaow = (C1653zoijcleaow) gxszxtbevoVar;
            int i13 = c1653zoijcleaow.f75388cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1653zoijcleaow.f75388cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c1653zoijcleaow = new C1653zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1653zoijcleaow = new C1653zoijcleaow(gxszxtbevoVar);
        }
        Object objOjitshcjhn = c1653zoijcleaow.f75390jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1653zoijcleaow.f75388cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaow zoijcleaowVar2 = (zoijcleaow) c1653zoijcleaow.f75392zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objOjitshcjhn);
                zoijcleaowVar = zoijcleaowVar2;
            } else if (i14 == 2) {
                cartReceiver2 = (CartReceiver) c1653zoijcleaow.f75391yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) c1653zoijcleaow.f75392zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objOjitshcjhn);
                Cart cart = (Cart) objOjitshcjhn;
                cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : cartReceiver2, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                ppxfxbqfkfVar = zoijcleaowVar.f75383ppxfxbqfkf;
                c1653zoijcleaow.f75392zdlpuopuiu = null;
                c1653zoijcleaow.f75391yggfygwlhe = null;
                c1653zoijcleaow.f75388cqumvgiudr = 3;
                if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, c1653zoijcleaow) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objOjitshcjhn);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objOjitshcjhn);
        if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.C1651iobyxmoadg.f75385iobyxmoadg)) {
            cartReceiver = new CartReceiver("", "");
        } else {
            if (!(iobyxmoadgVar instanceof iobyxmoadg.C1652zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadg.C1652zoijcleaow c1652zoijcleaow = (iobyxmoadg.C1652zoijcleaow) iobyxmoadgVar;
            cartReceiver = new CartReceiver(c1652zoijcleaow.iobyxmoadg(), c1652zoijcleaow.zoijcleaow());
        }
        k01.wkgbmnqykc wkgbmnqykcVar = this.f75384zoijcleaow;
        c1653zoijcleaow.f75392zdlpuopuiu = this;
        c1653zoijcleaow.f75388cqumvgiudr = 1;
        objOjitshcjhn = wkgbmnqykcVar.ojitshcjhn(cartReceiver, c1653zoijcleaow);
        if (objOjitshcjhn == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        cartReceiver2 = (CartReceiver) objOjitshcjhn;
        k01.ppxfxbqfkf ppxfxbqfkfVar2 = zoijcleaowVar.f75383ppxfxbqfkf;
        c1653zoijcleaow.f75392zdlpuopuiu = zoijcleaowVar;
        c1653zoijcleaow.f75391yggfygwlhe = cartReceiver2;
        c1653zoijcleaow.f75388cqumvgiudr = 2;
        objOjitshcjhn = ppxfxbqfkfVar2.iobyxmoadg(c1653zoijcleaow);
        if (objOjitshcjhn == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        Cart cart2 = (Cart) objOjitshcjhn;
        cartZoijcleaow = cart2.zoijcleaow((16776959 & 1) != 0 ? cart2.id : 0L, (16776959 & 2) != 0 ? cart2.deliveryInfo : null, (16776959 & 4) != 0 ? cart2.intervalInfo : null, (16776959 & 8) != 0 ? cart2.partnerCode : null, (16776959 & 16) != 0 ? cart2.payment : null, (16776959 & 32) != 0 ? cart2.sum : null, (16776959 & 64) != 0 ? cart2.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart2.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart2.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart2.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart2.isMappedValid : false, (16776959 & 2048) != 0 ? cart2.warning : null, (16776959 & 4096) != 0 ? cart2.evropolis : null, (16776959 & 8192) != 0 ? cart2.loadInfo : null, (16776959 & 16384) != 0 ? cart2.cartBonuses : null, (16776959 & 32768) != 0 ? cart2.receiver : cartReceiver2, (16776959 & 65536) != 0 ? cart2.progressBar : null, (16776959 & 131072) != 0 ? cart2.cartInfoList : null, (16776959 & 262144) != 0 ? cart2.selectedComments : null, (16776959 & 524288) != 0 ? cart2.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart2.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart2.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart2.payments : null, (16776959 & 8388608) != 0 ? cart2.change : null);
        ppxfxbqfkfVar = zoijcleaowVar.f75383ppxfxbqfkf;
        c1653zoijcleaow.f75392zdlpuopuiu = null;
        c1653zoijcleaow.f75391yggfygwlhe = null;
        c1653zoijcleaow.f75388cqumvgiudr = 3;
        if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, c1653zoijcleaow) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
