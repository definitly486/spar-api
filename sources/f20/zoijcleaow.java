package f20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.CartReceiver;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.ppxfxbqfkf f32628ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.wkgbmnqykc f32629zoijcleaow;

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: f20.zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0712iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C0712iobyxmoadg f32630iobyxmoadg = new C0712iobyxmoadg();

            private C0712iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0712iobyxmoadg);
            }

            public int hashCode() {
                return -1434420018;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: f20.zoijcleaow$iobyxmoadg$zoijcleaow, reason: collision with other inner class name */
        public static final class C0713zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f32631iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f32632zoijcleaow;

            public C0713zoijcleaow(String name, String phone) {
                zdlpuopuiu.btonecajqb(name, "name");
                zdlpuopuiu.btonecajqb(phone, "phone");
                this.f32631iobyxmoadg = name;
                this.f32632zoijcleaow = phone;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0713zoijcleaow)) {
                    return false;
                }
                C0713zoijcleaow c0713zoijcleaow = (C0713zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f32631iobyxmoadg, c0713zoijcleaow.f32631iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32632zoijcleaow, c0713zoijcleaow.f32632zoijcleaow);
            }

            public int hashCode() {
                return (this.f32631iobyxmoadg.hashCode() * 31) + this.f32632zoijcleaow.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f32631iobyxmoadg;
            }

            public String toString() {
                return "Receiver(name=" + this.f32631iobyxmoadg + ", phone=" + this.f32632zoijcleaow + ")";
            }

            public final String zoijcleaow() {
                return this.f32632zoijcleaow;
            }
        }
    }

    /* JADX INFO: renamed from: f20.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0714zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f32633cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f32635jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f32636yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32637zdlpuopuiu;

        C0714zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f32635jyumaefscl = obj;
            this.f32633cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(w10.wkgbmnqykc cartRemoteSource, w10.ppxfxbqfkf cartLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f32629zoijcleaow = cartRemoteSource;
        this.f32628ppxfxbqfkf = cartLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:34:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C0714zoijcleaow c0714zoijcleaow;
        CartReceiver cartReceiver;
        zoijcleaow zoijcleaowVar;
        CartReceiver cartReceiver2;
        Cart cartZoijcleaow;
        w10.ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof C0714zoijcleaow) {
            c0714zoijcleaow = (C0714zoijcleaow) gxszxtbevoVar;
            int i13 = c0714zoijcleaow.f32633cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0714zoijcleaow.f32633cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c0714zoijcleaow = new C0714zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0714zoijcleaow = new C0714zoijcleaow(gxszxtbevoVar);
        }
        Object objOjitshcjhn = c0714zoijcleaow.f32635jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0714zoijcleaow.f32633cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaow zoijcleaowVar2 = (zoijcleaow) c0714zoijcleaow.f32637zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objOjitshcjhn);
                zoijcleaowVar = zoijcleaowVar2;
            } else if (i14 == 2) {
                cartReceiver2 = (CartReceiver) c0714zoijcleaow.f32636yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) c0714zoijcleaow.f32637zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objOjitshcjhn);
                Cart cart = (Cart) objOjitshcjhn;
                cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : cartReceiver2, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                ppxfxbqfkfVar = zoijcleaowVar.f32628ppxfxbqfkf;
                c0714zoijcleaow.f32637zdlpuopuiu = null;
                c0714zoijcleaow.f32636yggfygwlhe = null;
                c0714zoijcleaow.f32633cqumvgiudr = 3;
                if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, c0714zoijcleaow) == objGxszxtbevo) {
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
        if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar, iobyxmoadg.C0712iobyxmoadg.f32630iobyxmoadg)) {
            cartReceiver = new CartReceiver("", "");
        } else {
            if (!(iobyxmoadgVar instanceof iobyxmoadg.C0713zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            iobyxmoadg.C0713zoijcleaow c0713zoijcleaow = (iobyxmoadg.C0713zoijcleaow) iobyxmoadgVar;
            cartReceiver = new CartReceiver(c0713zoijcleaow.iobyxmoadg(), c0713zoijcleaow.zoijcleaow());
        }
        w10.wkgbmnqykc wkgbmnqykcVar = this.f32629zoijcleaow;
        c0714zoijcleaow.f32637zdlpuopuiu = this;
        c0714zoijcleaow.f32633cqumvgiudr = 1;
        objOjitshcjhn = wkgbmnqykcVar.ojitshcjhn(cartReceiver, c0714zoijcleaow);
        if (objOjitshcjhn == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        cartReceiver2 = (CartReceiver) objOjitshcjhn;
        w10.ppxfxbqfkf ppxfxbqfkfVar2 = zoijcleaowVar.f32628ppxfxbqfkf;
        c0714zoijcleaow.f32637zdlpuopuiu = zoijcleaowVar;
        c0714zoijcleaow.f32636yggfygwlhe = cartReceiver2;
        c0714zoijcleaow.f32633cqumvgiudr = 2;
        objOjitshcjhn = ppxfxbqfkfVar2.iobyxmoadg(c0714zoijcleaow);
        if (objOjitshcjhn == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        Cart cart2 = (Cart) objOjitshcjhn;
        cartZoijcleaow = cart2.zoijcleaow((16776959 & 1) != 0 ? cart2.id : 0L, (16776959 & 2) != 0 ? cart2.deliveryInfo : null, (16776959 & 4) != 0 ? cart2.intervalInfo : null, (16776959 & 8) != 0 ? cart2.partnerCode : null, (16776959 & 16) != 0 ? cart2.payment : null, (16776959 & 32) != 0 ? cart2.sum : null, (16776959 & 64) != 0 ? cart2.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart2.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart2.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart2.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart2.isMappedValid : false, (16776959 & 2048) != 0 ? cart2.warning : null, (16776959 & 4096) != 0 ? cart2.evropolis : null, (16776959 & 8192) != 0 ? cart2.loadInfo : null, (16776959 & 16384) != 0 ? cart2.cartBonuses : null, (16776959 & 32768) != 0 ? cart2.receiver : cartReceiver2, (16776959 & 65536) != 0 ? cart2.progressBar : null, (16776959 & 131072) != 0 ? cart2.cartInfoList : null, (16776959 & 262144) != 0 ? cart2.selectedComments : null, (16776959 & 524288) != 0 ? cart2.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart2.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart2.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart2.payments : null, (16776959 & 8388608) != 0 ? cart2.change : null);
        ppxfxbqfkfVar = zoijcleaowVar.f32628ppxfxbqfkf;
        c0714zoijcleaow.f32637zdlpuopuiu = null;
        c0714zoijcleaow.f32636yggfygwlhe = null;
        c0714zoijcleaow.f32633cqumvgiudr = 3;
        if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, c0714zoijcleaow) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
