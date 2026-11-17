package f11;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.domain.models.cart.CartSum;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final C0705iobyxmoadg f32547cqumvgiudr = new C0705iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final pkzmftpjix f32548iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final p01.iobyxmoadg f32549jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final k01.wkgbmnqykc f32550yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final k01.ppxfxbqfkf f32551zdlpuopuiu;

    public /* synthetic */ class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f32552iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            try {
                iArr[zoijcleaow.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zoijcleaow.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32552iobyxmoadg = iArr;
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f32553cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f32555jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f32556yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f32557zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f32553cqumvgiudr = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(this.f32553cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:33:0x0104  */
        /* JADX WARN: Code duplicated, block: B:36:0x0146 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x0147  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objIobyxmoadg;
            Cart cart;
            Object objNufgyqmvbu;
            kz0.gxszxtbevo gxszxtbevoVar;
            List basket;
            List listOxmwwwfdhm;
            k01.ppxfxbqfkf ppxfxbqfkfVar;
            CartSum sum;
            CartSum cartSumZoijcleaow;
            Cart cartZoijcleaow;
            List list;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f32555jyumaefscl;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objIobyxmoadg = obj;
                } else if (i13 == 2) {
                    cart = (Cart) this.f32557zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    objNufgyqmvbu = obj;
                    Cart cart2 = cart;
                    gxszxtbevoVar = (kz0.gxszxtbevo) objNufgyqmvbu;
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    basket = cart2.getBasket();
                    if (basket == null) {
                        basket = jyumaefscl.wflxmlrfwp();
                    }
                    listOxmwwwfdhm = iobyxmoadgVar.oxmwwwfdhm(basket, gxszxtbevoVar.zoijcleaow(), this.f32553cqumvgiudr.wkgbmnqykc());
                    ppxfxbqfkfVar = iobyxmoadg.this.f32551zdlpuopuiu;
                    sum = cart2.getSum();
                    if (sum != null) {
                        cartSumZoijcleaow = sum.zoijcleaow((126 & 1) != 0 ? sum.basket : gxszxtbevoVar.iobyxmoadg(), (126 & 2) != 0 ? sum.discount : 0.0d, (126 & 4) != 0 ? sum.delivery : 0.0d, (126 & 8) != 0 ? sum.overweight : 0.0d, (126 & 16) != 0 ? sum.weight : 0.0d, (126 & 32) != 0 ? sum.total : 0.0d, (126 & 64) != 0 ? sum.count : 0);
                    } else {
                        cartSumZoijcleaow = null;
                    }
                    cartZoijcleaow = cart2.zoijcleaow((16776959 & 1) != 0 ? cart2.id : 0L, (16776959 & 2) != 0 ? cart2.deliveryInfo : null, (16776959 & 4) != 0 ? cart2.intervalInfo : null, (16776959 & 8) != 0 ? cart2.partnerCode : null, (16776959 & 16) != 0 ? cart2.payment : null, (16776959 & 32) != 0 ? cart2.sum : cartSumZoijcleaow, (16776959 & 64) != 0 ? cart2.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart2.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart2.basket : listOxmwwwfdhm, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart2.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart2.isMappedValid : false, (16776959 & 2048) != 0 ? cart2.warning : null, (16776959 & 4096) != 0 ? cart2.evropolis : null, (16776959 & 8192) != 0 ? cart2.loadInfo : null, (16776959 & 16384) != 0 ? cart2.cartBonuses : null, (16776959 & 32768) != 0 ? cart2.receiver : null, (16776959 & 65536) != 0 ? cart2.progressBar : null, (16776959 & 131072) != 0 ? cart2.cartInfoList : null, (16776959 & 262144) != 0 ? cart2.selectedComments : null, (16776959 & 524288) != 0 ? cart2.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart2.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart2.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart2.payments : null, (16776959 & 8388608) != 0 ? cart2.change : null);
                    this.f32557zdlpuopuiu = gxszxtbevoVar;
                    this.f32556yggfygwlhe = listOxmwwwfdhm;
                    this.f32555jyumaefscl = 3;
                    if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    list = listOxmwwwfdhm;
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.f32556yggfygwlhe;
                    gxszxtbevoVar = (kz0.gxszxtbevo) this.f32557zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                iobyxmoadg.this.f32549jyumaefscl.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                return new wkgbmnqykc(list, gxszxtbevoVar.wkgbmnqykc(), gxszxtbevoVar.ppxfxbqfkf());
            }
            zdlpuopuiu.zoijcleaow(obj);
            k01.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadg.this.f32551zdlpuopuiu;
            this.f32555jyumaefscl = 1;
            objIobyxmoadg = ppxfxbqfkfVar2.iobyxmoadg(this);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cart = (Cart) objIobyxmoadg;
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
            List listPpxfxbqfkf = this.f32553cqumvgiudr.ppxfxbqfkf();
            List basket2 = cart.getBasket();
            if (basket2 == null) {
                basket2 = jyumaefscl.wflxmlrfwp();
            }
            List listWflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp(listPpxfxbqfkf, basket2, this.f32553cqumvgiudr.zoijcleaow(), this.f32553cqumvgiudr.iobyxmoadg());
            iobyxmoadg.this.btonecajqb(this.f32553cqumvgiudr.wkgbmnqykc(), "productsForSend = " + listWflxmlrfwp);
            k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f32550yggfygwlhe;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listWflxmlrfwp, 10));
            Iterator it = listWflxmlrfwp.iterator();
            while (it.hasNext()) {
                arrayList.add(dz0.draadjrbmk.iobyxmoadg((ProductData) it.next()));
            }
            this.f32557zdlpuopuiu = cart;
            this.f32555jyumaefscl = 2;
            objNufgyqmvbu = wkgbmnqykcVar.nufgyqmvbu(arrayList, this);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Cart cart3 = cart;
            gxszxtbevoVar = (kz0.gxszxtbevo) objNufgyqmvbu;
            iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
            basket = cart3.getBasket();
            if (basket == null) {
                basket = jyumaefscl.wflxmlrfwp();
            }
            listOxmwwwfdhm = iobyxmoadgVar3.oxmwwwfdhm(basket, gxszxtbevoVar.zoijcleaow(), this.f32553cqumvgiudr.wkgbmnqykc());
            ppxfxbqfkfVar = iobyxmoadg.this.f32551zdlpuopuiu;
            sum = cart3.getSum();
            if (sum != null) {
                cartSumZoijcleaow = sum.zoijcleaow((126 & 1) != 0 ? sum.basket : gxszxtbevoVar.iobyxmoadg(), (126 & 2) != 0 ? sum.discount : 0.0d, (126 & 4) != 0 ? sum.delivery : 0.0d, (126 & 8) != 0 ? sum.overweight : 0.0d, (126 & 16) != 0 ? sum.weight : 0.0d, (126 & 32) != 0 ? sum.total : 0.0d, (126 & 64) != 0 ? sum.count : 0);
            } else {
                cartSumZoijcleaow = null;
            }
            cartZoijcleaow = cart3.zoijcleaow((16776959 & 1) != 0 ? cart3.id : 0L, (16776959 & 2) != 0 ? cart3.deliveryInfo : null, (16776959 & 4) != 0 ? cart3.intervalInfo : null, (16776959 & 8) != 0 ? cart3.partnerCode : null, (16776959 & 16) != 0 ? cart3.payment : null, (16776959 & 32) != 0 ? cart3.sum : cartSumZoijcleaow, (16776959 & 64) != 0 ? cart3.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart3.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart3.basket : listOxmwwwfdhm, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart3.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart3.isMappedValid : false, (16776959 & 2048) != 0 ? cart3.warning : null, (16776959 & 4096) != 0 ? cart3.evropolis : null, (16776959 & 8192) != 0 ? cart3.loadInfo : null, (16776959 & 16384) != 0 ? cart3.cartBonuses : null, (16776959 & 32768) != 0 ? cart3.receiver : null, (16776959 & 65536) != 0 ? cart3.progressBar : null, (16776959 & 131072) != 0 ? cart3.cartInfoList : null, (16776959 & 262144) != 0 ? cart3.selectedComments : null, (16776959 & 524288) != 0 ? cart3.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart3.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart3.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart3.payments : null, (16776959 & 8388608) != 0 ? cart3.change : null);
            this.f32557zdlpuopuiu = gxszxtbevoVar;
            this.f32556yggfygwlhe = listOxmwwwfdhm;
            this.f32555jyumaefscl = 3;
            if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            list = listOxmwwwfdhm;
            iobyxmoadg.this.f32549jyumaefscl.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
            return new wkgbmnqykc(list, gxszxtbevoVar.wkgbmnqykc(), gxszxtbevoVar.ppxfxbqfkf());
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: f11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0705iobyxmoadg {
        public /* synthetic */ C0705iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0705iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f32558iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f32559ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f32560wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final zoijcleaow f32561zoijcleaow;

        public ppxfxbqfkf(List products, zoijcleaow operationType, boolean z13, String str) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(products, "products");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(operationType, "operationType");
            this.f32558iobyxmoadg = products;
            this.f32561zoijcleaow = operationType;
            this.f32559ppxfxbqfkf = z13;
            this.f32560wkgbmnqykc = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f32558iobyxmoadg, ppxfxbqfkfVar.f32558iobyxmoadg) && this.f32561zoijcleaow == ppxfxbqfkfVar.f32561zoijcleaow && this.f32559ppxfxbqfkf == ppxfxbqfkfVar.f32559ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f32560wkgbmnqykc, ppxfxbqfkfVar.f32560wkgbmnqykc);
        }

        public int hashCode() {
            int iHashCode = ((((this.f32558iobyxmoadg.hashCode() * 31) + this.f32561zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f32559ppxfxbqfkf)) * 31;
            String str = this.f32560wkgbmnqykc;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean iobyxmoadg() {
            return this.f32559ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f32558iobyxmoadg;
        }

        public String toString() {
            return "Params(products=" + this.f32558iobyxmoadg + ", operationType=" + this.f32561zoijcleaow + ", cropProductsQuantityByLimits=" + this.f32559ppxfxbqfkf + ", tagForLogger=" + this.f32560wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f32560wkgbmnqykc;
        }

        public final zoijcleaow zoijcleaow() {
            return this.f32561zoijcleaow;
        }
    }

    public static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f32562iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f32563ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f32564zoijcleaow;

        public wkgbmnqykc(List newCartProducts, List warnings, List limitedProductsIds) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newCartProducts, "newCartProducts");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(warnings, "warnings");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
            this.f32562iobyxmoadg = newCartProducts;
            this.f32564zoijcleaow = warnings;
            this.f32563ppxfxbqfkf = limitedProductsIds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f32562iobyxmoadg, wkgbmnqykcVar.f32562iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f32564zoijcleaow, wkgbmnqykcVar.f32564zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f32563ppxfxbqfkf, wkgbmnqykcVar.f32563ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f32562iobyxmoadg.hashCode() * 31) + this.f32564zoijcleaow.hashCode()) * 31) + this.f32563ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f32563ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f32564zoijcleaow;
        }

        public String toString() {
            return "Result(newCartProducts=" + this.f32562iobyxmoadg + ", warnings=" + this.f32564zoijcleaow + ", limitedProductsIds=" + this.f32563ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f32562iobyxmoadg;
        }
    }

    public enum zoijcleaow {
        ADD,
        REPLACE;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f32565iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public iobyxmoadg(k01.ppxfxbqfkf cartLocalSource, k01.wkgbmnqykc cartRemoteSource, p01.iobyxmoadg changeCartCompoundStateUseCase, pkzmftpjix dispatcher) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartCompoundStateUseCase, "changeCartCompoundStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f32551zdlpuopuiu = cartLocalSource;
        this.f32550yggfygwlhe = cartRemoteSource;
        this.f32549jyumaefscl = changeCartCompoundStateUseCase;
        this.f32548iwizpuwonk = dispatcher;
    }

    private final double agtfadlqog(ProductData productData, CartProduct cartProduct) {
        double d13;
        double dEablkybsjg;
        MeasureType measureType = productData.getMeasureType();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(measureType.getValue(), cartProduct.getMeasureTypeModel().getCurrentMeasure().getValue())) {
            if (cartProduct.getAvgWeight() != null && cartProduct.getAvgWeight().doubleValue() > 0.0d) {
                if (!(measureType instanceof MeasureType.WEIGHT)) {
                    if (measureType instanceof MeasureType.AMOUNT) {
                        dEablkybsjg = bz0.wkgbmnqykc.f17724iobyxmoadg.eablkybsjg(cartProduct.getQuantity(), cartProduct.getAvgWeight().doubleValue());
                    }
                    return jr0.wkgbmnqykc.nufgyqmvbu(productData.getQuantity(), d13, null, 2, null);
                }
                dEablkybsjg = bz0.wkgbmnqykc.f17724iobyxmoadg.wkgbmnqykc(cartProduct.getQuantity(), cartProduct.getAvgWeight().doubleValue(), ((MeasureType.WEIGHT) measureType).getMinAvailable());
            }
            d13 = 0.0d;
            return jr0.wkgbmnqykc.nufgyqmvbu(productData.getQuantity(), d13, null, 2, null);
        }
        dEablkybsjg = cartProduct.getQuantity();
        d13 = dEablkybsjg;
        return jr0.wkgbmnqykc.nufgyqmvbu(productData.getQuantity(), d13, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void btonecajqb(String str, String str2) {
        if (str == null) {
            return;
        }
        kr0.wkgbmnqykc.wkgbmnqykc(kr0.wkgbmnqykc.f60450iobyxmoadg, str, str2, false, 4, null);
    }

    private final ProductData gtknphoqwx(ProductData productData, double d13, List list, boolean z13, Double d14) {
        Double dValueOf = Double.valueOf(d13);
        if (z13) {
            dValueOf = null;
        }
        return productData.zoijcleaow((123 & 1) != 0 ? productData.id : null, (123 & 2) != 0 ? productData.article : null, (123 & 4) != 0 ? productData.quantity : dValueOf != null ? dValueOf.doubleValue() : bz0.wkgbmnqykc.f17724iobyxmoadg.iobyxmoadg(list, productData.getMeasureType(), d13, d14), (123 & 8) != 0 ? productData.measureType : null, (123 & 16) != 0 ? productData.isLoading : false, (123 & 32) != 0 ? productData.limits : null, (123 & 64) != 0 ? productData.messageType : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List oxmwwwfdhm(List list, List list2, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList4.add(((CartProduct) it.next()).getId());
        }
        ArrayList arrayList5 = new ArrayList(jyumaefscl.cqumvgiudr(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((CartProduct) it2.next()).getId());
        }
        Set setTbqsvytpvh = jyumaefscl.tbqsvytpvh(arrayList4, jyumaefscl.r(arrayList5));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            CartProduct cartProduct = (CartProduct) it3.next();
            String id2 = cartProduct.getId();
            if (cartProduct.getQuantity() <= 0.0d) {
                arrayList.add(id2);
            } else if (!cartProduct.getIsAvailable()) {
                arrayList.add(id2);
            } else if (setTbqsvytpvh.contains(id2)) {
                arrayList3.add(cartProduct);
            } else {
                arrayList2.add(cartProduct);
            }
        }
        btonecajqb(str, "resultProducts = " + list2 + ",\n newProducts = " + arrayList2 + ",\n dropProductsIds = " + arrayList + ",\n changedProducts = " + arrayList3 + "\n");
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            CartProduct cartProduct2 = (CartProduct) it4.next();
            Object obj = null;
            if (arrayList.contains(cartProduct2.getId())) {
                cartProduct2 = null;
            }
            if (cartProduct2 != null) {
                for (Object obj2 : arrayList3) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) obj2).getId(), cartProduct2.getId())) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (CartProduct) obj;
                if (obj == null) {
                    obj = cartProduct2;
                }
            }
            if (obj != null) {
                arrayList6.add(obj);
            }
        }
        listPpxfxbqfkf.addAll(arrayList6);
        listPpxfxbqfkf.addAll(arrayList2);
        List listIobyxmoadg = jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
        btonecajqb(str, "cartLocalSource.updateCart = " + listIobyxmoadg);
        return listIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List wflxmlrfwp(List list, List list2, zoijcleaow zoijcleaowVar, boolean z13) {
        Object next;
        ProductData productDataGtknphoqwx;
        int i13 = eablkybsjg.f32552iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i13 == 1) {
            return list;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductData productData = (ProductData) it.next();
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) next).getId(), productData.getId()));
            CartProduct cartProduct = (CartProduct) next;
            if (cartProduct != null && (productDataGtknphoqwx = gtknphoqwx(productData, agtfadlqog(productData, cartProduct), productData.getLimits(), z13, cartProduct.getAvgWeight())) != null) {
                productData = productDataGtknphoqwx;
            }
            arrayList.add(productData);
        }
        return arrayList;
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public Object invoke(ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        return dxjokdxxww.lqeggnwhkg(this.f32548iwizpuwonk, new gxszxtbevo(ppxfxbqfkfVar, null), gxszxtbevoVar);
    }
}
