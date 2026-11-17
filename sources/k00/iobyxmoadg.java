package k00;

import android.os.SystemClock;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.CartBonuses;
import ru.myspar.core.domain.models.cart.CartProduct;
import ru.myspar.core.domain.models.cart.CartSum;
import ru.myspar.core.domain.models.cart.ProductData;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.promocode.Promocode;
import s00.AddProductListToCartRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends j00.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C1140iobyxmoadg f53387lqeggnwhkg = new C1140iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final f20.iobyxmoadg f53388eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private AtomicLong f53389gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.ppxfxbqfkf f53390ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f20.eablkybsjg f53391wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.wkgbmnqykc f53392zoijcleaow;

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f53393jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53395zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f53393jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new btonecajqb(this.f53393jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objLqeggnwhkg;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53395zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                boolean zZynmafqrjb = iobyxmoadgVar.zynmafqrjb(iobyxmoadgVar.f53389gxszxtbevo);
                if (!this.f53393jyumaefscl && !zZynmafqrjb) {
                    w10.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.f53390ppxfxbqfkf;
                    this.f53395zdlpuopuiu = 1;
                    obj = ppxfxbqfkfVar.iobyxmoadg(this);
                    return obj == objGxszxtbevo ? objGxszxtbevo : obj;
                }
                iobyxmoadg.this.wwaezpbzkn();
                iobyxmoadg.this.f53388eablkybsjg.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
                w10.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f53392zoijcleaow;
                this.f53395zdlpuopuiu = 2;
                objLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg(this);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                this.f53395zdlpuopuiu = 3;
                obj = iobyxmoadgVar2.lereixgezr((Cart) objLqeggnwhkg, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                }
                if (i13 == 2) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objLqeggnwhkg = ((kcexrzcfyt) obj).rgvfuqvkyq();
                    zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                    iobyxmoadg iobyxmoadgVar3 = iobyxmoadg.this;
                    this.f53395zdlpuopuiu = 3;
                    obj = iobyxmoadgVar3.lereixgezr((Cart) objLqeggnwhkg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
            }
            return obj;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ MeasureType f53396cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ double f53397iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f53398jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53400zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(String str, double d13, MeasureType measureType, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f53398jyumaefscl = str;
            this.f53397iwizpuwonk = d13;
            this.f53396cqumvgiudr = measureType;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new draadjrbmk(this.f53398jyumaefscl, this.f53397iwizpuwonk, this.f53396cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objZoijcleaow;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53400zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                w10.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f53392zoijcleaow;
                List listEablkybsjg = jyumaefscl.eablkybsjg(new ProductData(this.f53398jyumaefscl, null, this.f53397iwizpuwonk, this.f53396cqumvgiudr, false, null, null, 114, null));
                this.f53400zdlpuopuiu = 1;
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
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            this.f53400zdlpuopuiu = 2;
            Object objLereixgezr = iobyxmoadgVar.lereixgezr((Cart) objZoijcleaow, this);
            return objLereixgezr == objGxszxtbevo ? objGxszxtbevo : objLereixgezr;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f53401cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f53403jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f53404yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53405zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53403jyumaefscl = obj;
            this.f53401cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.lereixgezr(null, this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Integer f53406jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53408zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(Integer num, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f53406jyumaefscl = num;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f53406jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0079  */
        /* JADX WARN: Code duplicated, block: B:34:0x007e  */
        /* JADX WARN: Code duplicated, block: B:36:0x008c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objIobyxmoadg;
            Cart cart;
            w10.ppxfxbqfkf ppxfxbqfkfVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53408zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objIobyxmoadg = ((kcexrzcfyt) obj).rgvfuqvkyq();
                    cart = (Cart) (kcexrzcfyt.draadjrbmk(objIobyxmoadg) ? null : objIobyxmoadg);
                    if (cart != null) {
                        ppxfxbqfkfVar = iobyxmoadg.this.f53390ppxfxbqfkf;
                        this.f53408zdlpuopuiu = 3;
                        if (ppxfxbqfkfVar.dxjokdxxww(cart, this) == objGxszxtbevo) {
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
            w10.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadg.this.f53390ppxfxbqfkf;
            this.f53408zdlpuopuiu = 1;
            obj = ppxfxbqfkfVar2.iobyxmoadg(this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            CartBonuses cartBonuses = ((Cart) obj).getCartBonuses();
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cartBonuses != null ? kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(cartBonuses.getApplied()) : null, this.f53406jyumaefscl)) {
                Integer num = this.f53406jyumaefscl;
                int iIntValue = num != null ? num.intValue() : 0;
                w10.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f53392zoijcleaow;
                this.f53408zdlpuopuiu = 2;
                objIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(iIntValue, this);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                cart = (Cart) (kcexrzcfyt.draadjrbmk(objIobyxmoadg) ? null : objIobyxmoadg);
                if (cart != null) {
                    ppxfxbqfkfVar = iobyxmoadg.this.f53390ppxfxbqfkf;
                    this.f53408zdlpuopuiu = 3;
                    if (ppxfxbqfkfVar.dxjokdxxww(cart, this) == objGxszxtbevo) {
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

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f53409iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f53411yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53412zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53411yggfygwlhe = obj;
            this.f53409iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iozdgvuglv(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f53413jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53415zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f53413jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(this.f53413jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo;
            Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53415zdlpuopuiu;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objGxszxtbevo = ((kcexrzcfyt) obj).rgvfuqvkyq();
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            w10.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f53392zoijcleaow;
            String str = this.f53413jyumaefscl;
            this.f53415zdlpuopuiu = 1;
            objGxszxtbevo = wkgbmnqykcVar.gxszxtbevo(str, this);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            if (kcexrzcfyt.draadjrbmk(objGxszxtbevo)) {
                objGxszxtbevo = null;
            }
            Cart cart = (Cart) objGxszxtbevo;
            if (cart == null) {
                return null;
            }
            w10.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.f53390ppxfxbqfkf;
            this.f53415zdlpuopuiu = 2;
            if (ppxfxbqfkfVar.dxjokdxxww(cart, this) == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: k00.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1140iobyxmoadg {
        public /* synthetic */ C1140iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1140iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ DeliveryCode f53416cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f53417iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f53419yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53420zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(String str, DeliveryCode deliveryCode, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f53417iwizpuwonk = str;
            this.f53416cqumvgiudr = deliveryCode;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f53417iwizpuwonk, this.f53416cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objDraadjrbmk;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53419yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                w10.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f53392zoijcleaow;
                String str = this.f53417iwizpuwonk;
                DeliveryCode deliveryCode = this.f53416cqumvgiudr;
                this.f53419yggfygwlhe = 1;
                objDraadjrbmk = wkgbmnqykcVar.draadjrbmk(str, deliveryCode, this);
                if (objDraadjrbmk == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f53420zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    return obj2;
                }
                zdlpuopuiu.zoijcleaow(obj);
                objDraadjrbmk = ((kcexrzcfyt) obj).rgvfuqvkyq();
            }
            zdlpuopuiu.zoijcleaow(objDraadjrbmk);
            w10.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.f53390ppxfxbqfkf;
            this.f53420zdlpuopuiu = objDraadjrbmk;
            this.f53419yggfygwlhe = 2;
            return ppxfxbqfkfVar.dxjokdxxww((Cart) objDraadjrbmk, this) == objGxszxtbevo ? objGxszxtbevo : objDraadjrbmk;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f53421cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ boolean f53422esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f53423iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f53425yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53426zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(String str, String str2, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f53423iwizpuwonk = str;
            this.f53421cqumvgiudr = str2;
            this.f53422esjtqupxsv = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new nufgyqmvbu(this.f53423iwizpuwonk, this.f53421cqumvgiudr, this.f53422esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGtknphoqwx;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53425yggfygwlhe;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                w10.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f53392zoijcleaow;
                String str = this.f53423iwizpuwonk;
                String str2 = this.f53421cqumvgiudr;
                boolean z13 = this.f53422esjtqupxsv;
                this.f53425yggfygwlhe = 1;
                objGtknphoqwx = wkgbmnqykcVar.gtknphoqwx(str, str2, z13, this);
                if (objGtknphoqwx == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f53426zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    return obj2;
                }
                zdlpuopuiu.zoijcleaow(obj);
                objGtknphoqwx = ((kcexrzcfyt) obj).rgvfuqvkyq();
            }
            zdlpuopuiu.zoijcleaow(objGtknphoqwx);
            w10.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadg.this.f53390ppxfxbqfkf;
            this.f53426zdlpuopuiu = objGtknphoqwx;
            this.f53425yggfygwlhe = 2;
            return ppxfxbqfkfVar.dxjokdxxww((Cart) objGtknphoqwx, this) == objGxszxtbevo ? objGxszxtbevo : objGtknphoqwx;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f53427cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f53428iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f53430yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53431zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f53428iwizpuwonk = comboSetProduct;
            this.f53427cqumvgiudr = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f53428iwizpuwonk, this.f53427cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008c  */
        /* JADX WARN: Code duplicated, block: B:30:0x008e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0093  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:49:0x00da A[LOOP:1: B:44:0x00bf->B:49:0x00da, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:56:0x0131 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:62:0x00e3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x00df A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:0x00dc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x00dd A[EDGE_INSN: B:69:0x00dd->B:51:0x00dd BREAK  A[LOOP:1: B:44:0x00bf->B:49:0x00da], SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objIobyxmoadg;
            Object obj2;
            List<CartProduct> listIobyxmoadg;
            List basket;
            List arrayList;
            w10.ppxfxbqfkf ppxfxbqfkfVar;
            Cart cartZoijcleaow;
            Iterator it;
            int i13;
            Object objWkgbmnqykc2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = this.f53430yggfygwlhe;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        zdlpuopuiu.zoijcleaow(obj);
                        objWkgbmnqykc2 = obj;
                    } else if (i14 == 2) {
                        objWkgbmnqykc = this.f53431zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                        objIobyxmoadg = obj;
                        Cart cart = (Cart) objIobyxmoadg;
                        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                            obj2 = null;
                        } else {
                            obj2 = objWkgbmnqykc;
                        }
                        t00.iobyxmoadg iobyxmoadgVar = (t00.iobyxmoadg) obj2;
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
                        ppxfxbqfkfVar = iobyxmoadg.this.f53390ppxfxbqfkf;
                        cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : null, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : arrayList, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                        this.f53431zdlpuopuiu = objWkgbmnqykc;
                        this.f53430yggfygwlhe = 3;
                        if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objWkgbmnqykc = this.f53431zdlpuopuiu;
                        zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadg.this.f53388eablkybsjg.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                    return kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
                }
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                ComboSetProduct comboSetProduct = this.f53428iwizpuwonk;
                ComboSetProduct comboSetProduct2 = this.f53427cqumvgiudr;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                w10.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar2.f53392zoijcleaow;
                List listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq(iobyxmoadgVar2.istkbnxepw(comboSetProduct), iobyxmoadgVar2.istkbnxepw(comboSetProduct2));
                this.f53430yggfygwlhe = 1;
                objWkgbmnqykc2 = wkgbmnqykcVar.wkgbmnqykc(listRgvfuqvkyq, this);
                if (objWkgbmnqykc2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((t00.iobyxmoadg) objWkgbmnqykc2);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                w10.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadg.this.f53390ppxfxbqfkf;
                this.f53431zdlpuopuiu = objWkgbmnqykc;
                this.f53430yggfygwlhe = 2;
                objIobyxmoadg = ppxfxbqfkfVar2.iobyxmoadg(this);
                if (objIobyxmoadg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                Cart cart2 = (Cart) objIobyxmoadg;
                if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                    obj2 = null;
                } else {
                    obj2 = objWkgbmnqykc;
                }
                t00.iobyxmoadg iobyxmoadgVar5 = (t00.iobyxmoadg) obj2;
                if (iobyxmoadgVar5 != null) {
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
                ppxfxbqfkfVar = iobyxmoadg.this.f53390ppxfxbqfkf;
                cartZoijcleaow = cart2.zoijcleaow((16776959 & 1) != 0 ? cart2.id : 0L, (16776959 & 2) != 0 ? cart2.deliveryInfo : null, (16776959 & 4) != 0 ? cart2.intervalInfo : null, (16776959 & 8) != 0 ? cart2.partnerCode : null, (16776959 & 16) != 0 ? cart2.payment : null, (16776959 & 32) != 0 ? cart2.sum : null, (16776959 & 64) != 0 ? cart2.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart2.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart2.basket : arrayList, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart2.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart2.isMappedValid : false, (16776959 & 2048) != 0 ? cart2.warning : null, (16776959 & 4096) != 0 ? cart2.evropolis : null, (16776959 & 8192) != 0 ? cart2.loadInfo : null, (16776959 & 16384) != 0 ? cart2.cartBonuses : null, (16776959 & 32768) != 0 ? cart2.receiver : null, (16776959 & 65536) != 0 ? cart2.progressBar : null, (16776959 & 131072) != 0 ? cart2.cartInfoList : null, (16776959 & 262144) != 0 ? cart2.selectedComments : null, (16776959 & 524288) != 0 ? cart2.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart2.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart2.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart2.payments : null, (16776959 & 8388608) != 0 ? cart2.change : null);
                this.f53431zdlpuopuiu = objWkgbmnqykc;
                this.f53430yggfygwlhe = 3;
                if (ppxfxbqfkfVar.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadg.this.f53388eablkybsjg.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
            }
            return kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ String f53432cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ double f53433esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f53434iwizpuwonk;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ MeasureType f53436lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ boolean f53437pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f53438yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53439zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(String str, String str2, double d13, MeasureType measureType, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f53434iwizpuwonk = str;
            this.f53432cqumvgiudr = str2;
            this.f53433esjtqupxsv = d13;
            this.f53436lereixgezr = measureType;
            this.f53437pmvmpeiblj = z13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean kcexrzcfyt(CartProduct cartProduct, CartProduct cartProduct2) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cartProduct2.getId(), cartProduct.getId());
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f53434iwizpuwonk, this.f53432cqumvgiudr, this.f53433esjtqupxsv, this.f53436lereixgezr, this.f53437pmvmpeiblj, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0078  */
        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        /* JADX WARN: Code duplicated, block: B:29:0x0090  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00cc A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:50:0x0107 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:55:0x0123  */
        /* JADX WARN: Code duplicated, block: B:57:0x013e  */
        /* JADX WARN: Code duplicated, block: B:60:0x017e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:67:0x00a4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:1: B:27:0x008a->B:68:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objIobyxmoadg;
            Cart cart;
            Object objAgtfadlqog;
            t00.ppxfxbqfkf ppxfxbqfkfVar;
            final CartProduct cartProductZoijcleaow;
            List<CartProduct> basket;
            boolean z13;
            Iterator it;
            List list;
            List listM;
            w10.ppxfxbqfkf ppxfxbqfkfVar2;
            CartSum sum;
            CartSum cartSumZoijcleaow;
            Cart cartZoijcleaow;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53438yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                    objIobyxmoadg = obj;
                } else if (i13 == 2) {
                    Cart cart2 = (Cart) this.f53439zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                    cart = cart2;
                    objAgtfadlqog = obj;
                    ppxfxbqfkfVar = (t00.ppxfxbqfkf) objAgtfadlqog;
                    cartProductZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
                    basket = cart.getBasket();
                    if (basket == null) {
                        basket = jyumaefscl.wflxmlrfwp();
                    }
                    z13 = false;
                    if (basket == null || !basket.isEmpty()) {
                        it = basket.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) it.next()).getId(), cartProductZoijcleaow.getId())) {
                                z13 = true;
                                break;
                            }
                        }
                    }
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
                        ppxfxbqfkfVar2 = iobyxmoadg.this.f53390ppxfxbqfkf;
                        sum = cart.getSum();
                        if (sum != null) {
                            cartSumZoijcleaow = sum.zoijcleaow((126 & 1) != 0 ? sum.basket : ppxfxbqfkfVar.iobyxmoadg(), (126 & 2) != 0 ? sum.discount : 0.0d, (126 & 4) != 0 ? sum.delivery : 0.0d, (126 & 8) != 0 ? sum.overweight : 0.0d, (126 & 16) != 0 ? sum.weight : 0.0d, (126 & 32) != 0 ? sum.total : 0.0d, (126 & 64) != 0 ? sum.count : 0);
                        } else {
                            cartSumZoijcleaow = null;
                        }
                        cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : cartSumZoijcleaow, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : list, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                        this.f53439zdlpuopuiu = ppxfxbqfkfVar;
                        this.f53438yggfygwlhe = 3;
                        if (ppxfxbqfkfVar2.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        List listP2 = jyumaefscl.p(basket);
                        jyumaefscl.pkzmftpjix(listP2, new tg.draadjrbmk() { // from class: k00.zoijcleaow
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(iobyxmoadg.wkgbmnqykc.kcexrzcfyt(cartProductZoijcleaow, (CartProduct) obj2));
                            }
                        });
                        listM = jyumaefscl.m(listP2);
                    }
                    list = listM;
                    ppxfxbqfkfVar2 = iobyxmoadg.this.f53390ppxfxbqfkf;
                    sum = cart.getSum();
                    if (sum != null) {
                        cartSumZoijcleaow = sum.zoijcleaow((126 & 1) != 0 ? sum.basket : ppxfxbqfkfVar.iobyxmoadg(), (126 & 2) != 0 ? sum.discount : 0.0d, (126 & 4) != 0 ? sum.delivery : 0.0d, (126 & 8) != 0 ? sum.overweight : 0.0d, (126 & 16) != 0 ? sum.weight : 0.0d, (126 & 32) != 0 ? sum.total : 0.0d, (126 & 64) != 0 ? sum.count : 0);
                    } else {
                        cartSumZoijcleaow = null;
                    }
                    cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : cartSumZoijcleaow, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : list, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
                    this.f53439zdlpuopuiu = ppxfxbqfkfVar;
                    this.f53438yggfygwlhe = 3;
                    if (ppxfxbqfkfVar2.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ppxfxbqfkfVar = (t00.ppxfxbqfkf) this.f53439zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                }
                iobyxmoadg.this.f53388eablkybsjg.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                return ppxfxbqfkfVar;
            }
            zdlpuopuiu.zoijcleaow(obj);
            w10.ppxfxbqfkf ppxfxbqfkfVar3 = iobyxmoadg.this.f53390ppxfxbqfkf;
            this.f53438yggfygwlhe = 1;
            objIobyxmoadg = ppxfxbqfkfVar3.iobyxmoadg(this);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cart = (Cart) objIobyxmoadg;
            w10.wkgbmnqykc wkgbmnqykcVar = iobyxmoadg.this.f53392zoijcleaow;
            String str = this.f53434iwizpuwonk;
            String str2 = this.f53432cqumvgiudr;
            double d13 = this.f53433esjtqupxsv;
            MeasureType measureType = this.f53436lereixgezr;
            boolean z14 = this.f53437pmvmpeiblj;
            this.f53439zdlpuopuiu = cart;
            this.f53438yggfygwlhe = 2;
            objAgtfadlqog = wkgbmnqykcVar.agtfadlqog(str, str2, d13, measureType, z14, this);
            if (objAgtfadlqog == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = (t00.ppxfxbqfkf) objAgtfadlqog;
            cartProductZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            basket = cart.getBasket();
            if (basket == null) {
                basket = jyumaefscl.wflxmlrfwp();
            }
            z13 = false;
            if (basket == null) {
                it = basket.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) it.next()).getId(), cartProductZoijcleaow.getId())) {
                        z13 = true;
                        break;
                    }
                }
            } else {
                it = basket.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CartProduct) it.next()).getId(), cartProductZoijcleaow.getId())) {
                        z13 = true;
                        break;
                    }
                }
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
            ppxfxbqfkfVar2 = iobyxmoadg.this.f53390ppxfxbqfkf;
            sum = cart.getSum();
            if (sum != null) {
                cartSumZoijcleaow = sum.zoijcleaow((126 & 1) != 0 ? sum.basket : ppxfxbqfkfVar.iobyxmoadg(), (126 & 2) != 0 ? sum.discount : 0.0d, (126 & 4) != 0 ? sum.delivery : 0.0d, (126 & 8) != 0 ? sum.overweight : 0.0d, (126 & 16) != 0 ? sum.weight : 0.0d, (126 & 32) != 0 ? sum.total : 0.0d, (126 & 64) != 0 ? sum.count : 0);
            } else {
                cartSumZoijcleaow = null;
            }
            cartZoijcleaow = cart.zoijcleaow((16776959 & 1) != 0 ? cart.id : 0L, (16776959 & 2) != 0 ? cart.deliveryInfo : null, (16776959 & 4) != 0 ? cart.intervalInfo : null, (16776959 & 8) != 0 ? cart.partnerCode : null, (16776959 & 16) != 0 ? cart.payment : null, (16776959 & 32) != 0 ? cart.sum : cartSumZoijcleaow, (16776959 & 64) != 0 ? cart.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart.basket : list, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart.isMappedValid : false, (16776959 & 2048) != 0 ? cart.warning : null, (16776959 & 4096) != 0 ? cart.evropolis : null, (16776959 & 8192) != 0 ? cart.loadInfo : null, (16776959 & 16384) != 0 ? cart.cartBonuses : null, (16776959 & 32768) != 0 ? cart.receiver : null, (16776959 & 65536) != 0 ? cart.progressBar : null, (16776959 & 131072) != 0 ? cart.cartInfoList : null, (16776959 & 262144) != 0 ? cart.selectedComments : null, (16776959 & 524288) != 0 ? cart.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart.payments : null, (16776959 & 8388608) != 0 ? cart.change : null);
            this.f53439zdlpuopuiu = ppxfxbqfkfVar;
            this.f53438yggfygwlhe = 3;
            if (ppxfxbqfkfVar2.dxjokdxxww(cartZoijcleaow, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadg.this.f53388eablkybsjg.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
            return ppxfxbqfkfVar;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53440jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53442zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53442zdlpuopuiu = obj;
            this.f53440jyumaefscl |= Integer.MIN_VALUE;
            Object objVdvldrhtss = iobyxmoadg.this.vdvldrhtss(null, null, this);
            return objVdvldrhtss == mg.zoijcleaow.gxszxtbevo() ? objVdvldrhtss : kcexrzcfyt.iobyxmoadg(objVdvldrhtss);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(w10.wkgbmnqykc cartRemoteSource, w10.ppxfxbqfkf cartLocalSource, f20.eablkybsjg isHasPromoCodeUseCaseDelegate, f20.iobyxmoadg changeCartCompoundStateUseCase, pkzmftpjix dispatcher) {
        super(dispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isHasPromoCodeUseCaseDelegate, "isHasPromoCodeUseCaseDelegate");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCartCompoundStateUseCase, "changeCartCompoundStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f53392zoijcleaow = cartRemoteSource;
        this.f53390ppxfxbqfkf = cartLocalSource;
        this.f53391wkgbmnqykc = isHasPromoCodeUseCaseDelegate;
        this.f53388eablkybsjg = changeCartCompoundStateUseCase;
        this.f53389gxszxtbevo = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iozdgvuglv(Cart cart, lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f53409iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f53409iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object obj = gtknphoqwxVar.f53411yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f53409iwizpuwonk;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Cart cart2 = (Cart) gtknphoqwxVar.f53412zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
            return cart2;
        }
        zdlpuopuiu.zoijcleaow(obj);
        w10.ppxfxbqfkf ppxfxbqfkfVar = this.f53390ppxfxbqfkf;
        gtknphoqwxVar.f53412zdlpuopuiu = cart;
        gtknphoqwxVar.f53409iwizpuwonk = 1;
        return ppxfxbqfkfVar.dxjokdxxww(cart, gtknphoqwxVar) == objGxszxtbevo ? objGxszxtbevo : cart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddProductListToCartRequest.Product istkbnxepw(ComboSetProduct comboSetProduct) {
        return new AddProductListToCartRequest.Product((String) null, 1.0d, comboSetProduct.getMeasure().getCurrentMeasure().getValue(), comboSetProduct.getArticle(), (String) null, (Boolean) null, 49, (kotlin.jvm.internal.gtknphoqwx) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object lereixgezr(Cart cart, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        Cart cart2;
        iobyxmoadg iobyxmoadgVar;
        Cart cart3;
        Promocode promocodePpxfxbqfkf;
        Cart cart4;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f53401cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f53401cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object objIobyxmoadg = dxjokdxxwwVar.f53403jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f53401cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            w10.ppxfxbqfkf ppxfxbqfkfVar = this.f53390ppxfxbqfkf;
            dxjokdxxwwVar.f53405zdlpuopuiu = this;
            cart2 = cart;
            dxjokdxxwwVar.f53404yggfygwlhe = cart2;
            dxjokdxxwwVar.f53401cqumvgiudr = 1;
            objIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(dxjokdxxwwVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                if (i14 == 2) {
                    cart3 = (Cart) dxjokdxxwwVar.f53405zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                    cart4 = (Cart) objIobyxmoadg;
                    Cart cart5 = cart4;
                    return cart5.zoijcleaow((16776959 & 1) != 0 ? cart5.id : 0L, (16776959 & 2) != 0 ? cart5.deliveryInfo : null, (16776959 & 4) != 0 ? cart5.intervalInfo : null, (16776959 & 8) != 0 ? cart5.partnerCode : null, (16776959 & 16) != 0 ? cart5.payment : null, (16776959 & 32) != 0 ? cart5.sum : null, (16776959 & 64) != 0 ? cart5.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart5.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart5.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart5.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart5.isMappedValid : false, (16776959 & 2048) != 0 ? cart5.warning : cart3.getWarning(), (16776959 & 4096) != 0 ? cart5.evropolis : null, (16776959 & 8192) != 0 ? cart5.loadInfo : cart3.getLoadInfo(), (16776959 & 16384) != 0 ? cart5.cartBonuses : null, (16776959 & 32768) != 0 ? cart5.receiver : null, (16776959 & 65536) != 0 ? cart5.progressBar : null, (16776959 & 131072) != 0 ? cart5.cartInfoList : null, (16776959 & 262144) != 0 ? cart5.selectedComments : null, (16776959 & 524288) != 0 ? cart5.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart5.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart5.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart5.payments : null, (16776959 & 8388608) != 0 ? cart5.change : null);
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cart3 = (Cart) dxjokdxxwwVar.f53405zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                cart4 = (Cart) objIobyxmoadg;
                Cart cart6 = cart4;
                return cart6.zoijcleaow((16776959 & 1) != 0 ? cart6.id : 0L, (16776959 & 2) != 0 ? cart6.deliveryInfo : null, (16776959 & 4) != 0 ? cart6.intervalInfo : null, (16776959 & 8) != 0 ? cart6.partnerCode : null, (16776959 & 16) != 0 ? cart6.payment : null, (16776959 & 32) != 0 ? cart6.sum : null, (16776959 & 64) != 0 ? cart6.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart6.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart6.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart6.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart6.isMappedValid : false, (16776959 & 2048) != 0 ? cart6.warning : cart3.getWarning(), (16776959 & 4096) != 0 ? cart6.evropolis : null, (16776959 & 8192) != 0 ? cart6.loadInfo : cart3.getLoadInfo(), (16776959 & 16384) != 0 ? cart6.cartBonuses : null, (16776959 & 32768) != 0 ? cart6.receiver : null, (16776959 & 65536) != 0 ? cart6.progressBar : null, (16776959 & 131072) != 0 ? cart6.cartInfoList : null, (16776959 & 262144) != 0 ? cart6.selectedComments : null, (16776959 & 524288) != 0 ? cart6.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart6.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart6.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart6.payments : null, (16776959 & 8388608) != 0 ? cart6.change : null);
            }
            cart2 = (Cart) dxjokdxxwwVar.f53404yggfygwlhe;
            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) dxjokdxxwwVar.f53405zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            iobyxmoadgVar = iobyxmoadgVar2;
        }
        Cart cart7 = (Cart) objIobyxmoadg;
        if (!iobyxmoadgVar.f53391wkgbmnqykc.iobyxmoadg(cart7)) {
            dxjokdxxwwVar.f53405zdlpuopuiu = cart2;
            dxjokdxxwwVar.f53404yggfygwlhe = null;
            dxjokdxxwwVar.f53401cqumvgiudr = 3;
            objIobyxmoadg = iobyxmoadgVar.iozdgvuglv(cart2, dxjokdxxwwVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            cart3 = cart2;
            cart4 = (Cart) objIobyxmoadg;
            Cart cart8 = cart4;
            return cart8.zoijcleaow((16776959 & 1) != 0 ? cart8.id : 0L, (16776959 & 2) != 0 ? cart8.deliveryInfo : null, (16776959 & 4) != 0 ? cart8.intervalInfo : null, (16776959 & 8) != 0 ? cart8.partnerCode : null, (16776959 & 16) != 0 ? cart8.payment : null, (16776959 & 32) != 0 ? cart8.sum : null, (16776959 & 64) != 0 ? cart8.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart8.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart8.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart8.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart8.isMappedValid : false, (16776959 & 2048) != 0 ? cart8.warning : cart3.getWarning(), (16776959 & 4096) != 0 ? cart8.evropolis : null, (16776959 & 8192) != 0 ? cart8.loadInfo : cart3.getLoadInfo(), (16776959 & 16384) != 0 ? cart8.cartBonuses : null, (16776959 & 32768) != 0 ? cart8.receiver : null, (16776959 & 65536) != 0 ? cart8.progressBar : null, (16776959 & 131072) != 0 ? cart8.cartInfoList : null, (16776959 & 262144) != 0 ? cart8.selectedComments : null, (16776959 & 524288) != 0 ? cart8.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart8.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart8.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart8.payments : null, (16776959 & 8388608) != 0 ? cart8.change : null);
        }
        Promocode promocode = cart2.getPromocode();
        if (promocode != null) {
            Promocode promocode2 = cart7.getPromocode();
            String value = promocode2 != null ? promocode2.getValue() : null;
            if (value == null) {
                value = "";
            }
            promocodePpxfxbqfkf = Promocode.ppxfxbqfkf(promocode, value, false, null, 6, null);
        } else {
            promocodePpxfxbqfkf = null;
        }
        Cart cart9 = cart2;
        Cart cartZoijcleaow = cart9.zoijcleaow((16776959 & 1) != 0 ? cart9.id : 0L, (16776959 & 2) != 0 ? cart9.deliveryInfo : null, (16776959 & 4) != 0 ? cart9.intervalInfo : null, (16776959 & 8) != 0 ? cart9.partnerCode : null, (16776959 & 16) != 0 ? cart9.payment : null, (16776959 & 32) != 0 ? cart9.sum : null, (16776959 & 64) != 0 ? cart9.promocode : promocodePpxfxbqfkf, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart9.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart9.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart9.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart9.isMappedValid : false, (16776959 & 2048) != 0 ? cart9.warning : null, (16776959 & 4096) != 0 ? cart9.evropolis : null, (16776959 & 8192) != 0 ? cart9.loadInfo : null, (16776959 & 16384) != 0 ? cart9.cartBonuses : null, (16776959 & 32768) != 0 ? cart9.receiver : null, (16776959 & 65536) != 0 ? cart9.progressBar : null, (16776959 & 131072) != 0 ? cart9.cartInfoList : null, (16776959 & 262144) != 0 ? cart9.selectedComments : null, (16776959 & 524288) != 0 ? cart9.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart9.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart9.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart9.payments : null, (16776959 & 8388608) != 0 ? cart9.change : null);
        dxjokdxxwwVar.f53405zdlpuopuiu = cart2;
        dxjokdxxwwVar.f53404yggfygwlhe = null;
        dxjokdxxwwVar.f53401cqumvgiudr = 2;
        objIobyxmoadg = iobyxmoadgVar.iozdgvuglv(cartZoijcleaow, dxjokdxxwwVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        cart3 = cart2;
        cart4 = (Cart) objIobyxmoadg;
        Cart cart10 = cart4;
        return cart10.zoijcleaow((16776959 & 1) != 0 ? cart10.id : 0L, (16776959 & 2) != 0 ? cart10.deliveryInfo : null, (16776959 & 4) != 0 ? cart10.intervalInfo : null, (16776959 & 8) != 0 ? cart10.partnerCode : null, (16776959 & 16) != 0 ? cart10.payment : null, (16776959 & 32) != 0 ? cart10.sum : null, (16776959 & 64) != 0 ? cart10.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart10.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart10.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart10.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart10.isMappedValid : false, (16776959 & 2048) != 0 ? cart10.warning : cart3.getWarning(), (16776959 & 4096) != 0 ? cart10.evropolis : null, (16776959 & 8192) != 0 ? cart10.loadInfo : cart3.getLoadInfo(), (16776959 & 16384) != 0 ? cart10.cartBonuses : null, (16776959 & 32768) != 0 ? cart10.receiver : null, (16776959 & 65536) != 0 ? cart10.progressBar : null, (16776959 & 131072) != 0 ? cart10.cartInfoList : null, (16776959 & 262144) != 0 ? cart10.selectedComments : null, (16776959 & 524288) != 0 ? cart10.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart10.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart10.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart10.payments : null, (16776959 & 8388608) != 0 ? cart10.change : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wwaezpbzkn() {
        this.f53389gxszxtbevo.set(SystemClock.elapsedRealtime());
    }

    public static /* synthetic */ Object yadqdtsiqt(iobyxmoadg iobyxmoadgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        return iobyxmoadgVar.cdpycssgdh(z13, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zynmafqrjb(AtomicLong atomicLong) {
        return atomicLong.get() == 0 || SystemClock.elapsedRealtime() - atomicLong.get() > TimeUnit.MINUTES.toMillis(1L);
    }

    public final Object cdpycssgdh(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new btonecajqb(z13, null), gxszxtbevoVar);
    }

    public final Object cqumvgiudr(String str, lg.gxszxtbevo gxszxtbevoVar) {
        Object objBtonecajqb = this.f53392zoijcleaow.btonecajqb(str, gxszxtbevoVar);
        return objBtonecajqb == mg.zoijcleaow.gxszxtbevo() ? objBtonecajqb : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = this.f53390ppxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final Object iwizpuwonk(String str, String str2, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new nufgyqmvbu(str, str2, z13, null), gxszxtbevoVar);
    }

    public final Object jyumaefscl(String str, DeliveryCode deliveryCode, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new lqeggnwhkg(str, deliveryCode, null), gxszxtbevoVar);
    }

    public final Object lmojexxdyd(String str, double d13, MeasureType measureType, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new draadjrbmk(str, d13, measureType, null), gxszxtbevoVar);
    }

    public final Object oxmwwwfdhm(String str, String str2, double d13, MeasureType measureType, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new wkgbmnqykc(str, str2, d13, measureType, z13, null), gxszxtbevoVar);
    }

    public final Object pmvmpeiblj(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f53390ppxfxbqfkf.iobyxmoadg(gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object vdvldrhtss(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f53440jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f53440jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f53442zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f53440jyumaefscl;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            tg.draadjrbmk ppxfxbqfkfVar = new ppxfxbqfkf(comboSetProduct, comboSetProduct2, null);
            zoijcleaowVar.f53440jyumaefscl = 1;
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

    public final Object yggfygwlhe(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykc(new gxszxtbevo(str, null), gxszxtbevoVar);
    }

    public final Object zdlpuopuiu(Integer num, lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = wkgbmnqykc(new eablkybsjg(num, null), gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : wwaezpbzkn.f37140iobyxmoadg;
    }
}
