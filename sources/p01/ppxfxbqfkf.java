package p01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.ppxfxbqfkf f75374ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cz0.iobyxmoadg f75375zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75376iobyxmoadg;

        public iobyxmoadg(String str) {
            this.f75376iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75376iobyxmoadg, ((iobyxmoadg) obj).f75376iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f75376iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75376iobyxmoadg;
        }

        public String toString() {
            return "Params(partnerCode=" + this.f75376iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f75377cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f75379jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f75380yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f75381zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f75379jyumaefscl = obj;
            this.f75377cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(cz0.iobyxmoadg cartInteractor, k01.ppxfxbqfkf cartLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f75375zoijcleaow = cartInteractor;
        this.f75374ppxfxbqfkf = cartLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:30:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar2;
        ppxfxbqfkf ppxfxbqfkfVar;
        Cart cart;
        ppxfxbqfkf ppxfxbqfkfVar2;
        k01.ppxfxbqfkf ppxfxbqfkfVar3;
        Cart cartZoijcleaow;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f75377cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f75377cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIobyxmoadg = zoijcleaowVar.f75379jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f75377cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f75380yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f75381zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            } else if (i14 == 2) {
                Cart cart2 = (Cart) zoijcleaowVar.f75380yggfygwlhe;
                ppxfxbqfkf ppxfxbqfkfVar4 = (ppxfxbqfkf) zoijcleaowVar.f75381zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                cart = cart2;
                ppxfxbqfkfVar2 = ppxfxbqfkfVar4;
                ppxfxbqfkfVar3 = ppxfxbqfkfVar2.f75374ppxfxbqfkf;
                cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : jyumaefscl.wflxmlrfwp(), (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                zoijcleaowVar.f75381zdlpuopuiu = ppxfxbqfkfVar2;
                zoijcleaowVar.f75380yggfygwlhe = null;
                zoijcleaowVar.f75377cqumvgiudr = 3;
                if (ppxfxbqfkfVar3.dxjokdxxww(cartZoijcleaow, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                cz0.iobyxmoadg iobyxmoadgVar3 = ppxfxbqfkfVar2.f75375zoijcleaow;
                zoijcleaowVar.f75381zdlpuopuiu = null;
                zoijcleaowVar.f75377cqumvgiudr = 4;
                objIobyxmoadg = iobyxmoadgVar3.cdpycssgdh(zoijcleaowVar);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else if (i14 == 3) {
                ppxfxbqfkfVar2 = (ppxfxbqfkf) zoijcleaowVar.f75381zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                cz0.iobyxmoadg iobyxmoadgVar4 = ppxfxbqfkfVar2.f75375zoijcleaow;
                zoijcleaowVar.f75381zdlpuopuiu = null;
                zoijcleaowVar.f75377cqumvgiudr = 4;
                objIobyxmoadg = iobyxmoadgVar4.cdpycssgdh(zoijcleaowVar);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            return (Cart) objIobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        k01.ppxfxbqfkf ppxfxbqfkfVar5 = this.f75374ppxfxbqfkf;
        zoijcleaowVar.f75381zdlpuopuiu = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        zoijcleaowVar.f75380yggfygwlhe = iobyxmoadgVar2;
        zoijcleaowVar.f75377cqumvgiudr = 1;
        objIobyxmoadg = ppxfxbqfkfVar5.iobyxmoadg(zoijcleaowVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        Cart cart3 = (Cart) objIobyxmoadg;
        cz0.iobyxmoadg iobyxmoadgVar5 = ppxfxbqfkfVar.f75375zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
        zoijcleaowVar.f75381zdlpuopuiu = ppxfxbqfkfVar;
        zoijcleaowVar.f75380yggfygwlhe = cart3;
        zoijcleaowVar.f75377cqumvgiudr = 2;
        if (iobyxmoadgVar5.yggfygwlhe(strIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        cart = cart3;
        ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        ppxfxbqfkfVar3 = ppxfxbqfkfVar2.f75374ppxfxbqfkf;
        cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : jyumaefscl.wflxmlrfwp(), (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
        zoijcleaowVar.f75381zdlpuopuiu = ppxfxbqfkfVar2;
        zoijcleaowVar.f75380yggfygwlhe = null;
        zoijcleaowVar.f75377cqumvgiudr = 3;
        if (ppxfxbqfkfVar3.dxjokdxxww(cartZoijcleaow, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        cz0.iobyxmoadg iobyxmoadgVar6 = ppxfxbqfkfVar2.f75375zoijcleaow;
        zoijcleaowVar.f75381zdlpuopuiu = null;
        zoijcleaowVar.f75377cqumvgiudr = 4;
        objIobyxmoadg = iobyxmoadgVar6.cdpycssgdh(zoijcleaowVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return (Cart) objIobyxmoadg;
    }
}
