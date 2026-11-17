package cz0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz0.AddProductListToCartRequest;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartBonuses;
import ru.myspar.proloyalty.core.domain.models.cart.CartProduct;
import ru.myspar.proloyalty.core.domain.models.cart.CartSum;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.promocode.Promocode;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends bz0.iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final C0469iobyxmoadg f26206gxszxtbevo = new C0469iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final p01.iobyxmoadg f26207eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.ppxfxbqfkf f26208ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p01.eablkybsjg f26209wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.wkgbmnqykc f26210zoijcleaow;

    static final class btonecajqb extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26212zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new btonecajqb(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objLqeggnwhkg;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26212zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objLqeggnwhkg = ((kcexrzcfyt) obj).rgvfuqvkyq();
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.cqumvgiudr();
            k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f26210zoijcleaow;
            this.f26212zdlpuopuiu = 1;
            objLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg(this);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            this.f26212zdlpuopuiu = 2;
            obj = iobyxmoadg.pmvmpeiblj(iobyxmoadgVar, (Cart) objLqeggnwhkg, false, this, 2, null);
            return obj == objGxszxtbevo ? objGxszxtbevo : obj;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f26214esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f26215iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f26216jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f26217yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26218zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f26215iwizpuwonk = obj;
            this.f26214esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, false, this);
        }
    }

    static final class eablkybsjg extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ Integer f26219iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f26221yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26222zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(Integer num, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26219iwizpuwonk = num;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f26219iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0079  */
        /* JADX WARN: Code duplicated, block: B:34:0x007f  */
        /* JADX WARN: Code duplicated, block: B:36:0x008f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objIobyxmoadg;
            Cart cart;
            iobyxmoadg iobyxmoadgVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26221yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objIobyxmoadg = ((kcexrzcfyt) obj).rgvfuqvkyq();
                    cart = (Cart) (kcexrzcfyt.draadjrbmk(objIobyxmoadg) ? null : objIobyxmoadg);
                    if (cart != null) {
                        iobyxmoadgVar = iobyxmoadg.this;
                        this.f26222zdlpuopuiu = cart;
                        this.f26221yggfygwlhe = 3;
                        if (iobyxmoadg.pmvmpeiblj(iobyxmoadgVar, cart, false, this, 2, null) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
            this.f26221yggfygwlhe = 1;
            obj = iobyxmoadgVar2.zynmafqrjb(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            CartBonuses cartBonuses = ((Cart) obj).getCartBonuses();
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cartBonuses != null ? kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getApplied()) : null, this.f26219iwizpuwonk)) {
                Integer num = this.f26219iwizpuwonk;
                int iIntValue = num != null ? num.intValue() : 0;
                k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f26210zoijcleaow;
                this.f26221yggfygwlhe = 2;
                objIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(iIntValue, this);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                cart = (Cart) (kcexrzcfyt.draadjrbmk(objIobyxmoadg) ? null : objIobyxmoadg);
                if (cart != null) {
                    iobyxmoadgVar = iobyxmoadg.this;
                    this.f26222zdlpuopuiu = cart;
                    this.f26221yggfygwlhe = 3;
                    if (iobyxmoadg.pmvmpeiblj(iobyxmoadgVar, cart, false, this, 2, null) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ MeasureType f26223cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ double f26224iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f26225jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f26227zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(String str, double d13, MeasureType measureType, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26225jyumaefscl = str;
            this.f26224iwizpuwonk = d13;
            this.f26223cqumvgiudr = measureType;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gtknphoqwx(this.f26225jyumaefscl, this.f26224iwizpuwonk, this.f26223cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objZoijcleaow;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26227zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f26210zoijcleaow;
                List listEablkybsjg = jyumaefscl.eablkybsjg(new ProductData(this.f26225jyumaefscl, null, this.f26224iwizpuwonk, this.f26223cqumvgiudr, false, null, null, 114, null));
                this.f26227zdlpuopuiu = 1;
                objZoijcleaow = wkgbmnqykcVar.zoijcleaow(listEablkybsjg, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                    return obj;
                }
                zdlpuopuiu.zoijcleaow(obj);
                objZoijcleaow = obj;
            }
            Cart cart = (Cart) objZoijcleaow;
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            this.f26227zdlpuopuiu = 2;
            Object objPmvmpeiblj = iobyxmoadg.pmvmpeiblj(iobyxmoadgVar, cart, false, this, 2, null);
            return objPmvmpeiblj == objGxszxtbevo ? objGxszxtbevo : objPmvmpeiblj;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f26228iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f26230yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26231zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26228iwizpuwonk = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(this.f26228iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo;
            Cart cart;
            Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26230yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objGxszxtbevo = ((kcexrzcfyt) obj).rgvfuqvkyq();
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cart = (Cart) this.f26231zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return cart;
            }
            zdlpuopuiu.zoijcleaow(obj);
            k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f26210zoijcleaow;
            String str = this.f26228iwizpuwonk;
            this.f26230yggfygwlhe = 1;
            objGxszxtbevo = wkgbmnqykcVar.gxszxtbevo(str, this);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            if (kcexrzcfyt.draadjrbmk(objGxszxtbevo)) {
                objGxszxtbevo = null;
            }
            Cart cart2 = (Cart) objGxszxtbevo;
            if (cart2 == null) {
                return null;
            }
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            this.f26231zdlpuopuiu = cart2;
            this.f26230yggfygwlhe = 2;
            if (iobyxmoadgVar.lereixgezr(cart2, false, this) == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            cart = cart2;
            return cart;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: cz0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0469iobyxmoadg {
        public /* synthetic */ C0469iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0469iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ DeliveryCode f26232cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f26233iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f26235yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26236zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(String str, DeliveryCode deliveryCode, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26233iwizpuwonk = str;
            this.f26232cqumvgiudr = deliveryCode;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f26233iwizpuwonk, this.f26232cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWflxmlrfwp;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26235yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f26210zoijcleaow;
                String str = this.f26233iwizpuwonk;
                DeliveryCode deliveryCode = this.f26232cqumvgiudr;
                this.f26235yggfygwlhe = 1;
                objWflxmlrfwp = wkgbmnqykcVar.wflxmlrfwp(str, deliveryCode, this);
                if (objWflxmlrfwp == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f26236zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    return obj2;
                }
                zdlpuopuiu.zoijcleaow(obj);
                objWflxmlrfwp = ((kcexrzcfyt) obj).rgvfuqvkyq();
            }
            zdlpuopuiu.zoijcleaow(objWflxmlrfwp);
            this.f26236zdlpuopuiu = objWflxmlrfwp;
            this.f26235yggfygwlhe = 2;
            return iobyxmoadg.pmvmpeiblj(iobyxmoadg.this, (Cart) objWflxmlrfwp, false, this, 2, null) == objGxszxtbevo ? objGxszxtbevo : objWflxmlrfwp;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f26237cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ boolean f26238esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f26239iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f26241yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26242zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(String str, String str2, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26239iwizpuwonk = str;
            this.f26237cqumvgiudr = str2;
            this.f26238esjtqupxsv = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new nufgyqmvbu(this.f26239iwizpuwonk, this.f26237cqumvgiudr, this.f26238esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGtknphoqwx;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26241yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f26210zoijcleaow;
                String str = this.f26239iwizpuwonk;
                String str2 = this.f26237cqumvgiudr;
                boolean z13 = this.f26238esjtqupxsv;
                this.f26241yggfygwlhe = 1;
                objGtknphoqwx = wkgbmnqykcVar.gtknphoqwx(str, str2, z13, this);
                if (objGtknphoqwx == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f26242zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    return obj2;
                }
                zdlpuopuiu.zoijcleaow(obj);
                objGtknphoqwx = ((kcexrzcfyt) obj).rgvfuqvkyq();
            }
            zdlpuopuiu.zoijcleaow(objGtknphoqwx);
            this.f26242zdlpuopuiu = objGtknphoqwx;
            this.f26241yggfygwlhe = 2;
            return iobyxmoadg.pmvmpeiblj(iobyxmoadg.this, (Cart) objGtknphoqwx, false, this, 2, null) == objGxszxtbevo ? objGxszxtbevo : objGtknphoqwx;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f26243cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f26244iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f26246yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26247zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26244iwizpuwonk = comboSetProduct;
            this.f26243cqumvgiudr = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f26244iwizpuwonk, this.f26243cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0088  */
        /* JADX WARN: Code duplicated, block: B:30:0x008a  */
        /* JADX WARN: Code duplicated, block: B:33:0x008f  */
        /* JADX WARN: Code duplicated, block: B:38:0x009f  */
        /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d6 A[LOOP:1: B:44:0x00bb->B:49:0x00d6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:56:0x0129 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:62:0x00df A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x00db A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x00d9 A[EDGE_INSN: B:69:0x00d9->B:51:0x00d9 BREAK  A[LOOP:1: B:44:0x00bb->B:49:0x00d6], SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objZynmafqrjb;
            Object obj2;
            List<CartProduct> listIobyxmoadg;
            List basket;
            List arrayList;
            k01.ppxfxbqfkf ppxfxbqfkfVar;
            Cart cartZoijcleaow;
            Iterator it;
            int i13;
            Object objWkgbmnqykc2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = this.f26246yggfygwlhe;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc2 = obj;
                    } else if (i14 == 2) {
                        objWkgbmnqykc = this.f26247zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                        objZynmafqrjb = obj;
                        Cart cart = (Cart) objZynmafqrjb;
                        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                            obj2 = null;
                        } else {
                            obj2 = objWkgbmnqykc;
                        }
                        kz0.iobyxmoadg iobyxmoadgVar = (kz0.iobyxmoadg) obj2;
                        listIobyxmoadg = iobyxmoadgVar != null ? iobyxmoadgVar.iobyxmoadg() : null;
                        basket = cart.getBasket();
                        if (basket != null || (arrayList = jyumaefscl.p(basket)) == null) {
                            arrayList = new ArrayList();
                        }
                        if (listIobyxmoadg != null) {
                            for (CartProduct cartProduct : listIobyxmoadg) {
                                it = arrayList.iterator();
                                i13 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        i13 = -1;
                                        break;
                                    }
                                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) it.next()).getId(), cartProduct.getId())) {
                                        break;
                                    }
                                    i13++;
                                }
                                if (i13 >= 0) {
                                    arrayList.set(i13, cartProduct);
                                } else {
                                    kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(arrayList.add(cartProduct));
                                }
                            }
                        }
                        ppxfxbqfkfVar = iobyxmoadg.this.f26208ppxfxbqfkf;
                        cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : arrayList, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                        this.f26247zdlpuopuiu = objWkgbmnqykc;
                        this.f26246yggfygwlhe = 3;
                        if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objWkgbmnqykc = this.f26247zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadg.this.esjtqupxsv();
                    return kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
                }
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                ComboSetProduct comboSetProduct = this.f26244iwizpuwonk;
                ComboSetProduct comboSetProduct2 = this.f26243cqumvgiudr;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar2.f26210zoijcleaow;
                List listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq(iobyxmoadgVar2.istkbnxepw(comboSetProduct), iobyxmoadgVar2.istkbnxepw(comboSetProduct2));
                this.f26246yggfygwlhe = 1;
                objWkgbmnqykc2 = wkgbmnqykcVar.wkgbmnqykc(listRgvfuqvkyq, this);
                if (objWkgbmnqykc2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((kz0.iobyxmoadg) objWkgbmnqykc2);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
                this.f26247zdlpuopuiu = objWkgbmnqykc;
                this.f26246yggfygwlhe = 2;
                objZynmafqrjb = iobyxmoadgVar5.zynmafqrjb(this);
                if (objZynmafqrjb == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                Cart cart2 = (Cart) objZynmafqrjb;
                if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                    obj2 = null;
                } else {
                    obj2 = objWkgbmnqykc;
                }
                kz0.iobyxmoadg iobyxmoadgVar6 = (kz0.iobyxmoadg) obj2;
                if (iobyxmoadgVar6 != null) {
                }
                basket = cart2.getBasket();
                if (basket != null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList();
                }
                if (listIobyxmoadg != null) {
                    while (r7.hasNext()) {
                        it = arrayList.iterator();
                        i13 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i13 = -1;
                                break;
                            }
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) it.next()).getId(), cartProduct.getId())) {
                                break;
                                break;
                            }
                            i13++;
                        }
                        if (i13 >= 0) {
                            arrayList.set(i13, cartProduct);
                        } else {
                            kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(arrayList.add(cartProduct));
                        }
                    }
                }
                ppxfxbqfkfVar = iobyxmoadg.this.f26208ppxfxbqfkf;
                cartZoijcleaow = cart2.zoijcleaow((16776959 & 1) != 0 ? cart2.id : 0L, (16776959 & 2) != 0 ? cart2.deliveryInfo : null, (16776959 & 4) != 0 ? cart2.intervalInfo : null, (16776959 & 8) != 0 ? cart2.partnerCode : null, (16776959 & 16) != 0 ? cart2.payment : null, (16776959 & 32) != 0 ? cart2.sum : null, (16776959 & 64) != 0 ? cart2.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart2.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart2.basket : arrayList, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart2.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart2.isMappedValid : false, (16776959 & 2048) != 0 ? cart2.warning : null, (16776959 & 4096) != 0 ? cart2.evropolis : null, (16776959 & 8192) != 0 ? cart2.loadInfo : null, (16776959 & 16384) != 0 ? cart2.cartBonuses : null, (16776959 & 32768) != 0 ? cart2.receiver : null, (16776959 & 65536) != 0 ? cart2.progressBar : null, (16776959 & 131072) != 0 ? cart2.cartInfoList : null, (16776959 & 262144) != 0 ? cart2.selectedComments : null, (16776959 & 524288) != 0 ? cart2.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart2.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart2.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart2.payments : null, (16776959 & 8388608) != 0 ? cart2.change : null);
                this.f26247zdlpuopuiu = objWkgbmnqykc;
                this.f26246yggfygwlhe = 3;
                if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadg.this.esjtqupxsv();
            }
            return kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f26248cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ double f26249esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f26250iwizpuwonk;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ MeasureType f26252lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ boolean f26253pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f26254yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f26255zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(String str, String str2, double d13, MeasureType measureType, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f26250iwizpuwonk = str;
            this.f26248cqumvgiudr = str2;
            this.f26249esjtqupxsv = d13;
            this.f26252lereixgezr = measureType;
            this.f26253pmvmpeiblj = z13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean kcexrzcfyt(CartProduct cartProduct, CartProduct cartProduct2) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cartProduct2.getId(), cartProduct.getId());
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f26250iwizpuwonk, this.f26248cqumvgiudr, this.f26249esjtqupxsv, this.f26252lereixgezr, this.f26253pmvmpeiblj, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0074  */
        /* JADX WARN: Code duplicated, block: B:26:0x0083  */
        /* JADX WARN: Code duplicated, block: B:29:0x008d  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c8 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:49:0x0103 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:54:0x011f  */
        /* JADX WARN: Code duplicated, block: B:56:0x013a  */
        /* JADX WARN: Code duplicated, block: B:59:0x017a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:65:0x0081 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objZynmafqrjb;
            Cart cart;
            Object objAgtfadlqog;
            kz0.ppxfxbqfkf ppxfxbqfkfVar;
            final CartProduct cartProductZoijcleaow;
            List<CartProduct> basket;
            Iterator it;
            List list;
            List listM;
            k01.ppxfxbqfkf ppxfxbqfkfVar2;
            CartSum sum;
            CartSum cartSumZoijcleaow;
            Cart cartZoijcleaow;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f26254yggfygwlhe;
            boolean z13 = true;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objZynmafqrjb = obj;
                } else if (i13 == 2) {
                    Cart cart2 = (Cart) this.f26255zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    cart = cart2;
                    objAgtfadlqog = obj;
                    ppxfxbqfkfVar = (kz0.ppxfxbqfkf) objAgtfadlqog;
                    cartProductZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
                    basket = cart.getBasket();
                    if (basket == null) {
                        basket = jyumaefscl.wflxmlrfwp();
                    }
                    if (basket == null && basket.isEmpty()) {
                        z13 = false;
                        break;
                    }
                    it = basket.iterator();
                    do {
                        if (!it.hasNext()) {
                            z13 = false;
                            break;
                        }
                    } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) it.next()).getId(), cartProductZoijcleaow.getId()));
                    if (cartProductZoijcleaow.getQuantity() == 0.0d || !z13) {
                        if (cartProductZoijcleaow.getQuantity() <= 0.0d && z13) {
                            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(basket, 10));
                            for (CartProduct cartProduct : basket) {
                                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cartProduct.getId(), cartProductZoijcleaow.getId())) {
                                    cartProduct = cartProductZoijcleaow;
                                }
                                arrayList.add(cartProduct);
                            }
                            list = arrayList;
                        } else if (cartProductZoijcleaow.getQuantity() > 0.0d || z13) {
                            list = basket;
                        } else {
                            List listP = jyumaefscl.p(basket);
                            listP.add(cartProductZoijcleaow);
                            listM = jyumaefscl.m(listP);
                        }
                        ppxfxbqfkfVar2 = iobyxmoadg.this.f26208ppxfxbqfkf;
                        sum = cart.getSum();
                        if (sum != null) {
                            cartSumZoijcleaow = sum.zoijcleaow((126 & 1) != 0 ? sum.basket : ppxfxbqfkfVar.iobyxmoadg(), (126 & 2) != 0 ? sum.discount : 0.0d, (126 & 4) != 0 ? sum.delivery : 0.0d, (126 & 8) != 0 ? sum.overweight : 0.0d, (126 & 16) != 0 ? sum.weight : 0.0d, (126 & 32) != 0 ? sum.total : 0.0d, (126 & 64) != 0 ? sum.count : 0);
                        } else {
                            cartSumZoijcleaow = null;
                        }
                        cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : cartSumZoijcleaow, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : list, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                        this.f26255zdlpuopuiu = ppxfxbqfkfVar;
                        this.f26254yggfygwlhe = 3;
                        if (ppxfxbqfkfVar2.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        List listP2 = jyumaefscl.p(basket);
                        jyumaefscl.pkzmftpjix(listP2, new tg.draadjrbmk() { // from class: cz0.zoijcleaow
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(iobyxmoadg.wkgbmnqykc.kcexrzcfyt(cartProductZoijcleaow, (CartProduct) obj2));
                            }
                        });
                        listM = jyumaefscl.m(listP2);
                    }
                    list = listM;
                    ppxfxbqfkfVar2 = iobyxmoadg.this.f26208ppxfxbqfkf;
                    sum = cart.getSum();
                    if (sum != null) {
                        cartSumZoijcleaow = sum.zoijcleaow((126 & 1) != 0 ? sum.basket : ppxfxbqfkfVar.iobyxmoadg(), (126 & 2) != 0 ? sum.discount : 0.0d, (126 & 4) != 0 ? sum.delivery : 0.0d, (126 & 8) != 0 ? sum.overweight : 0.0d, (126 & 16) != 0 ? sum.weight : 0.0d, (126 & 32) != 0 ? sum.total : 0.0d, (126 & 64) != 0 ? sum.count : 0);
                    } else {
                        cartSumZoijcleaow = null;
                    }
                    cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : cartSumZoijcleaow, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : list, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                    this.f26255zdlpuopuiu = ppxfxbqfkfVar;
                    this.f26254yggfygwlhe = 3;
                    if (ppxfxbqfkfVar2.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ppxfxbqfkfVar = (kz0.ppxfxbqfkf) this.f26255zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                iobyxmoadg.this.esjtqupxsv();
                return ppxfxbqfkfVar;
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            this.f26254yggfygwlhe = 1;
            objZynmafqrjb = iobyxmoadgVar.zynmafqrjb(this);
            if (objZynmafqrjb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cart = (Cart) objZynmafqrjb;
            k01.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f26210zoijcleaow;
            String str = this.f26250iwizpuwonk;
            String str2 = this.f26248cqumvgiudr;
            double d13 = this.f26249esjtqupxsv;
            MeasureType measureType = this.f26252lereixgezr;
            boolean z14 = this.f26253pmvmpeiblj;
            this.f26255zdlpuopuiu = cart;
            this.f26254yggfygwlhe = 2;
            objAgtfadlqog = wkgbmnqykcVar.agtfadlqog(str, str2, d13, measureType, z14, this);
            if (objAgtfadlqog == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = (kz0.ppxfxbqfkf) objAgtfadlqog;
            cartProductZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            basket = cart.getBasket();
            if (basket == null) {
                basket = jyumaefscl.wflxmlrfwp();
            }
            if (basket == null) {
                it = basket.iterator();
                do {
                    if (!it.hasNext()) {
                        z13 = false;
                        break;
                    }
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) it.next()).getId(), cartProductZoijcleaow.getId()));
            } else {
                it = basket.iterator();
                do {
                    if (!it.hasNext()) {
                        z13 = false;
                        break;
                    }
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) it.next()).getId(), cartProductZoijcleaow.getId()));
            }
            if (cartProductZoijcleaow.getQuantity() == 0.0d) {
                if (cartProductZoijcleaow.getQuantity() <= 0.0d) {
                    if (cartProductZoijcleaow.getQuantity() > 0.0d) {
                    }
                    list = basket;
                } else {
                    if (cartProductZoijcleaow.getQuantity() > 0.0d) {
                    }
                    list = basket;
                }
            } else if (cartProductZoijcleaow.getQuantity() <= 0.0d) {
                if (cartProductZoijcleaow.getQuantity() > 0.0d) {
                }
                list = basket;
            } else {
                if (cartProductZoijcleaow.getQuantity() > 0.0d) {
                }
                list = basket;
            }
            ppxfxbqfkfVar2 = iobyxmoadg.this.f26208ppxfxbqfkf;
            sum = cart.getSum();
            if (sum != null) {
                cartSumZoijcleaow = sum.zoijcleaow((126 & 1) != 0 ? sum.basket : ppxfxbqfkfVar.iobyxmoadg(), (126 & 2) != 0 ? sum.discount : 0.0d, (126 & 4) != 0 ? sum.delivery : 0.0d, (126 & 8) != 0 ? sum.overweight : 0.0d, (126 & 16) != 0 ? sum.weight : 0.0d, (126 & 32) != 0 ? sum.total : 0.0d, (126 & 64) != 0 ? sum.count : 0);
            } else {
                cartSumZoijcleaow = null;
            }
            cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : cartSumZoijcleaow, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : list, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
            this.f26255zdlpuopuiu = ppxfxbqfkfVar;
            this.f26254yggfygwlhe = 3;
            if (ppxfxbqfkfVar2.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg.this.esjtqupxsv();
            return ppxfxbqfkfVar;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f26256jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f26258zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f26258zdlpuopuiu = obj;
            this.f26256jyumaefscl |= Integer.MIN_VALUE;
            Object objAgtfadlqog = iobyxmoadg.this.agtfadlqog(null, null, this);
            return objAgtfadlqog == mg.zoijcleaow.gxszxtbevo() ? objAgtfadlqog : kcexrzcfyt.iobyxmoadg(objAgtfadlqog);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k01.wkgbmnqykc cartRemoteSource, k01.ppxfxbqfkf cartLocalSource, p01.eablkybsjg isHasPromoCodeUseCaseDelegate, p01.iobyxmoadg changeCartCompoundStateUseCase, pkzmftpjix dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isHasPromoCodeUseCaseDelegate, "isHasPromoCodeUseCaseDelegate");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartCompoundStateUseCase, "changeCartCompoundStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f26210zoijcleaow = cartRemoteSource;
        this.f26208ppxfxbqfkf = cartLocalSource;
        this.f26209wkgbmnqykc = isHasPromoCodeUseCaseDelegate;
        this.f26207eablkybsjg = changeCartCompoundStateUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cqumvgiudr() {
        this.f26207eablkybsjg.zoijcleaow(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void esjtqupxsv() {
        this.f26207eablkybsjg.zoijcleaow(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddProductListToCartRequest.Product istkbnxepw(ComboSetProduct comboSetProduct) {
        return new AddProductListToCartRequest.Product((String) null, 1.0d, comboSetProduct.getMeasure().getCurrentMeasure().getValue(), comboSetProduct.getArticle(), (String) null, (Boolean) null, 49, (kotlin.jvm.internal.gtknphoqwx) null);
    }

    private final Cart jyumaefscl(Cart cart, String str) {
        Promocode promocode = cart.getPromocode();
        return cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : promocode != null ? Promocode.ppxfxbqfkf(promocode, str, false, null, 6, null) : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object lereixgezr(Cart cart, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f26214esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f26214esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objZynmafqrjb = dxjokdxxwwVar.f26215iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f26214esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZynmafqrjb);
            cqumvgiudr();
            dxjokdxxwwVar.f26218zdlpuopuiu = this;
            dxjokdxxwwVar.f26217yggfygwlhe = cart;
            dxjokdxxwwVar.f26216jyumaefscl = z13;
            dxjokdxxwwVar.f26214esjtqupxsv = 1;
            objZynmafqrjb = zynmafqrjb(dxjokdxxwwVar);
            if (objZynmafqrjb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Cart cart2 = (Cart) dxjokdxxwwVar.f26218zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objZynmafqrjb);
                return cart2;
            }
            z13 = dxjokdxxwwVar.f26216jyumaefscl;
            cart = (Cart) dxjokdxxwwVar.f26217yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) dxjokdxxwwVar.f26218zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(objZynmafqrjb);
        }
        Cart cart3 = (Cart) objZynmafqrjb;
        Cart cart4 = z13 ? cart : null;
        if (cart4 != null) {
            if (!iobyxmoadgVar.f26209wkgbmnqykc.iobyxmoadg(cart3)) {
                cart4 = null;
            }
            if (cart4 != null) {
                Promocode promocode = cart3.getPromocode();
                String value = promocode != null ? promocode.getValue() : null;
                if (value == null) {
                    value = "";
                }
                Cart cartJyumaefscl = iobyxmoadgVar.jyumaefscl(cart4, value);
                if (cartJyumaefscl != null) {
                    cart = cartJyumaefscl;
                }
            }
        }
        k01.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f26208ppxfxbqfkf;
        dxjokdxxwwVar.f26218zdlpuopuiu = cart;
        dxjokdxxwwVar.f26217yggfygwlhe = null;
        dxjokdxxwwVar.f26214esjtqupxsv = 2;
        return ppxfxbqfkfVar.dxjokdxxww(cart, dxjokdxxwwVar) == objGxszxtbevo ? objGxszxtbevo : cart;
    }

    static /* synthetic */ Object pmvmpeiblj(iobyxmoadg iobyxmoadgVar, Cart cart, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        return iobyxmoadgVar.lereixgezr(cart, z13, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object agtfadlqog(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f26256jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f26256jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f26258zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f26256jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            tg.draadjrbmk ppxfxbqfkfVar = new ppxfxbqfkf(comboSetProduct, comboSetProduct2, null);
            zoijcleaowVar.f26256jyumaefscl = 1;
            objWkgbmnqykc = wkgbmnqykc(ppxfxbqfkfVar, zoijcleaowVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return ((kcexrzcfyt) objWkgbmnqykc).rgvfuqvkyq();
    }

    public final Object cdpycssgdh(lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new btonecajqb(null), gxszxtbevoVar);
    }

    public final Object iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f26208ppxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object kcexrzcfyt(String str, DeliveryCode deliveryCode, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new lqeggnwhkg(str, deliveryCode, null), gxszxtbevoVar);
    }

    public final Object ojitshcjhn(String str, String str2, double d13, MeasureType measureType, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new wkgbmnqykc(str, str2, d13, measureType, z13, null), gxszxtbevoVar);
    }

    public final Object oxmwwwfdhm(String str, lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = wkgbmnqykc(new gxszxtbevo(str, null), gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object vdvldrhtss(Integer num, lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = wkgbmnqykc(new eablkybsjg(num, null), gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object yadqdtsiqt(String str, double d13, MeasureType measureType, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new gtknphoqwx(str, d13, measureType, null), gxszxtbevoVar);
    }

    public final Object yggfygwlhe(String str, lg.gxszxtbevo gxszxtbevoVar) {
        Object objBtonecajqb = this.f26210zoijcleaow.btonecajqb(str, gxszxtbevoVar);
        return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object zdlpuopuiu(String str, String str2, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new nufgyqmvbu(str, str2, z13, null), gxszxtbevoVar);
    }

    public final Object zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f26208ppxfxbqfkf.iobyxmoadg(gxszxtbevoVar);
    }
}
