package g20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.cart.Cart;
import w10.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.ppxfxbqfkf f35847ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f35848zoijcleaow;

    /* JADX INFO: renamed from: g20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0812iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f35849iobyxmoadg;

        public C0812iobyxmoadg(List comments) {
            zdlpuopuiu.btonecajqb(comments, "comments");
            this.f35849iobyxmoadg = comments;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0812iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35849iobyxmoadg, ((C0812iobyxmoadg) obj).f35849iobyxmoadg);
        }

        public int hashCode() {
            return this.f35849iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f35849iobyxmoadg;
        }

        public String toString() {
            return "Params(comments=" + this.f35849iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f35850cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f35852jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f35853yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f35854zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35852jyumaefscl = obj;
            this.f35850cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(wkgbmnqykc cartRemoteSource, w10.ppxfxbqfkf cartLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f35848zoijcleaow = cartRemoteSource;
        this.f35847ppxfxbqfkf = cartLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:28:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0812iobyxmoadg c0812iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        List list;
        Cart cartZoijcleaow;
        w10.ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f35850cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f35850cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = zoijcleaowVar.f35852jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f35850cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f35854zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            } else if (i14 == 2) {
                List list2 = (List) zoijcleaowVar.f35853yggfygwlhe;
                iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f35854zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
                list = list2;
                iobyxmoadgVar = iobyxmoadgVar2;
                Cart cart = (Cart) objEablkybsjg;
                cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : list, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                ppxfxbqfkfVar = iobyxmoadgVar.f35847ppxfxbqfkf;
                zoijcleaowVar.f35854zdlpuopuiu = null;
                zoijcleaowVar.f35853yggfygwlhe = null;
                zoijcleaowVar.f35850cqumvgiudr = 3;
                if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        wkgbmnqykc wkgbmnqykcVar = this.f35848zoijcleaow;
        List listIobyxmoadg = c0812iobyxmoadg.iobyxmoadg();
        zoijcleaowVar.f35854zdlpuopuiu = this;
        zoijcleaowVar.f35850cqumvgiudr = 1;
        objEablkybsjg = wkgbmnqykcVar.eablkybsjg(listIobyxmoadg, zoijcleaowVar);
        if (objEablkybsjg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        List list3 = (List) objEablkybsjg;
        w10.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVar.f35847ppxfxbqfkf;
        zoijcleaowVar.f35854zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f35853yggfygwlhe = list3;
        zoijcleaowVar.f35850cqumvgiudr = 2;
        Object objIobyxmoadg = ppxfxbqfkfVar2.iobyxmoadg(zoijcleaowVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        list = list3;
        objEablkybsjg = objIobyxmoadg;
        Cart cart2 = (Cart) objEablkybsjg;
        cartZoijcleaow = cart2.zoijcleaow((16776959 & 1) != 0 ? cart2.id : 0L, (16776959 & 2) != 0 ? cart2.deliveryInfo : null, (16776959 & 4) != 0 ? cart2.intervalInfo : null, (16776959 & 8) != 0 ? cart2.partnerCode : null, (16776959 & 16) != 0 ? cart2.payment : null, (16776959 & 32) != 0 ? cart2.sum : null, (16776959 & 64) != 0 ? cart2.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart2.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart2.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart2.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart2.isMappedValid : false, (16776959 & 2048) != 0 ? cart2.warning : null, (16776959 & 4096) != 0 ? cart2.evropolis : null, (16776959 & 8192) != 0 ? cart2.loadInfo : null, (16776959 & 16384) != 0 ? cart2.cartBonuses : null, (16776959 & 32768) != 0 ? cart2.receiver : null, (16776959 & 65536) != 0 ? cart2.progressBar : null, (16776959 & 131072) != 0 ? cart2.cartInfoList : null, (16776959 & 262144) != 0 ? cart2.selectedComments : list, (16776959 & 524288) != 0 ? cart2.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart2.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart2.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart2.payments : null, (16776959 & 8388608) != 0 ? cart2.change : null);
        ppxfxbqfkfVar = iobyxmoadgVar.f35847ppxfxbqfkf;
        zoijcleaowVar.f35854zdlpuopuiu = null;
        zoijcleaowVar.f35853yggfygwlhe = null;
        zoijcleaowVar.f35850cqumvgiudr = 3;
        if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
