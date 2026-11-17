package ty0;

import cy0.AddProductListToCartResponseDto;
import cy0.AddToBasketInfoDto;
import cy0.BasketOrderDto;
import cy0.CartSetParamsRequest;
import cy0.ChangeBasketInfoDto;
import cy0.MakeOrderRequest;
import cy0.OrderCommentsDto;
import cy0.OrderCommentsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz0.AddProductListToCartRequest;
import jz0.CartChangeProductsRequest;
import px0.ClearCartRequest;
import px0.EditCartProductRequest;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartReceiver;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import ru.myspar.proloyalty.core.network.model.WarningDto;
import tx0.CartDto;
import tx0.CartReceiverDto;
import tx0.CartSetReceiverResultDto;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements k01.wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ex0.zoijcleaow f111881eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.zoijcleaow f111882iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final kx0.zoijcleaow f111883ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nx0.iobyxmoadg f111884wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final kx0.wkgbmnqykc f111885zoijcleaow;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111886iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111888yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111889zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111888yggfygwlhe = obj;
            this.f111886iwizpuwonk |= Integer.MIN_VALUE;
            Object objGxszxtbevo = eablkybsjg.this.gxszxtbevo(null, this);
            return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.kcexrzcfyt.iobyxmoadg(objGxszxtbevo);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111890iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111892yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111893zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111892yggfygwlhe = obj;
            this.f111890iwizpuwonk |= Integer.MIN_VALUE;
            Object objIobyxmoadg = eablkybsjg.this.iobyxmoadg(0, this);
            return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : gg.kcexrzcfyt.iobyxmoadg(objIobyxmoadg);
        }
    }

    /* synthetic */ class cdpycssgdh extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        cdpycssgdh(Object obj) {
            super(2, obj, kx0.wkgbmnqykc.class, "map", "map(Lru/myspar/proloyalty/core/data/request/cart/CartDto;Lru/myspar/proloyalty/core/models/Warning;)Lru/myspar/proloyalty/core/domain/models/cart/Cart;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Cart invoke(CartDto cartDto, Warning p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p1");
            return ((kx0.wkgbmnqykc) this.receiver).iobyxmoadg(cartDto, p13);
        }
    }

    static final class cllcsxoeiz extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111894iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111896yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111897zdlpuopuiu;

        cllcsxoeiz(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111896yggfygwlhe = obj;
            this.f111894iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.ppxfxbqfkf(null, null, this);
        }
    }

    /* synthetic */ class cqumvgiudr extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        cqumvgiudr(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    /* synthetic */ class draadjrbmk extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        draadjrbmk(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class dsvhmnatus extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111898jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111900zdlpuopuiu;

        dsvhmnatus(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111900zdlpuopuiu = obj;
            this.f111898jyumaefscl |= Integer.MIN_VALUE;
            return eablkybsjg.this.eablkybsjg(null, this);
        }
    }

    /* synthetic */ class dxjokdxxww extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        dxjokdxxww(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    /* JADX INFO: renamed from: ty0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    /* synthetic */ class C2753eablkybsjg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        C2753eablkybsjg(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    /* synthetic */ class esjtqupxsv extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        esjtqupxsv(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    /* synthetic */ class gtknphoqwx extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        gtknphoqwx(Object obj) {
            super(2, obj, kx0.wkgbmnqykc.class, "map", "map(Lru/myspar/proloyalty/core/data/request/cart/CartDto;Lru/myspar/proloyalty/core/models/Warning;)Lru/myspar/proloyalty/core/domain/models/cart/Cart;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Cart invoke(CartDto cartDto, Warning p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p1");
            return ((kx0.wkgbmnqykc) this.receiver).iobyxmoadg(cartDto, p13);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111901iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111903yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111904zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111903yggfygwlhe = obj;
            this.f111901iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.agtfadlqog(null, null, 0.0d, null, false, this);
        }
    }

    /* synthetic */ class hcddaimhww extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        hcddaimhww(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    static final class hkdspvbjdz extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111905jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111907zdlpuopuiu;

        hkdspvbjdz(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111907zdlpuopuiu = obj;
            this.f111905jyumaefscl |= Integer.MIN_VALUE;
            return eablkybsjg.this.dxjokdxxww(null, this);
        }
    }

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f111908iobyxmoadg;

        static {
            int[] iArr = new int[DeliveryCode.values().length];
            try {
                iArr[DeliveryCode.DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f111908iobyxmoadg = iArr;
        }
    }

    /* synthetic */ class iozdgvuglv extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        iozdgvuglv(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    static final class istkbnxepw extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111909iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111911yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111912zdlpuopuiu;

        istkbnxepw(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111911yggfygwlhe = obj;
            this.f111909iwizpuwonk |= Integer.MIN_VALUE;
            Object objGtknphoqwx = eablkybsjg.this.gtknphoqwx(null, null, false, this);
            return objGtknphoqwx == mg.zoijcleaow.gxszxtbevo() ? objGtknphoqwx : gg.kcexrzcfyt.iobyxmoadg(objGtknphoqwx);
        }
    }

    /* synthetic */ class iwizpuwonk extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        iwizpuwonk(Object obj) {
            super(2, obj, kx0.wkgbmnqykc.class, "map", "map(Lru/myspar/proloyalty/core/data/request/cart/CartDto;Lru/myspar/proloyalty/core/models/Warning;)Lru/myspar/proloyalty/core/domain/models/cart/Cart;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Cart invoke(CartDto cartDto, Warning p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p1");
            return ((kx0.wkgbmnqykc) this.receiver).iobyxmoadg(cartDto, p13);
        }
    }

    static final class jpowsppfya extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111913jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111915zdlpuopuiu;

        jpowsppfya(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111915zdlpuopuiu = obj;
            this.f111913jyumaefscl |= Integer.MIN_VALUE;
            return eablkybsjg.this.draadjrbmk(null, this);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111916iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111918yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111919zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111918yggfygwlhe = obj;
            this.f111916iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.zoijcleaow(null, this);
        }
    }

    /* synthetic */ class kcexrzcfyt extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        kcexrzcfyt(Object obj) {
            super(2, obj, kx0.wkgbmnqykc.class, "map", "map(Lru/myspar/proloyalty/core/data/request/cart/CartDto;Lru/myspar/proloyalty/core/models/Warning;)Lru/myspar/proloyalty/core/domain/models/cart/Cart;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Cart invoke(CartDto cartDto, Warning p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p1");
            return ((kx0.wkgbmnqykc) this.receiver).iobyxmoadg(cartDto, p13);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111920iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111922yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111923zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111922yggfygwlhe = obj;
            this.f111920iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.nufgyqmvbu(null, this);
        }
    }

    static final class lmojexxdyd extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111924jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111926zdlpuopuiu;

        lmojexxdyd(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111926zdlpuopuiu = obj;
            this.f111924jyumaefscl |= Integer.MIN_VALUE;
            return eablkybsjg.this.btonecajqb(null, this);
        }
    }

    /* synthetic */ class lqeggnwhkg extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        lqeggnwhkg(Object obj) {
            super(2, obj, kx0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/data/response/cart/AddToBasketInfoDto;Lru/myspar/proloyalty/core/models/Warning;)Lru/myspar/proloyalty/core/domain/models/cart/AddToBasketResult;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final kz0.ppxfxbqfkf invoke(AddToBasketInfoDto p13, Warning p14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            return ((kx0.zoijcleaow) this.receiver).zoijcleaow(p13, p14);
        }
    }

    /* synthetic */ class nufgyqmvbu extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        nufgyqmvbu(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    /* synthetic */ class ojitshcjhn extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        ojitshcjhn(Object obj) {
            super(2, obj, kx0.wkgbmnqykc.class, "map", "map(Lru/myspar/proloyalty/core/data/request/cart/CartDto;Lru/myspar/proloyalty/core/models/Warning;)Lru/myspar/proloyalty/core/domain/models/cart/Cart;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Cart invoke(CartDto cartDto, Warning p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p1");
            return ((kx0.wkgbmnqykc) this.receiver).iobyxmoadg(cartDto, p13);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111927iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111929yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111930zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111929yggfygwlhe = obj;
            this.f111927iwizpuwonk |= Integer.MIN_VALUE;
            Object objWflxmlrfwp = eablkybsjg.this.wflxmlrfwp(null, null, this);
            return objWflxmlrfwp == mg.zoijcleaow.gxszxtbevo() ? objWflxmlrfwp : gg.kcexrzcfyt.iobyxmoadg(objWflxmlrfwp);
        }
    }

    /* synthetic */ class pkzmftpjix extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        pkzmftpjix(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    /* synthetic */ class pmvmpeiblj extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        pmvmpeiblj(Object obj) {
            super(2, obj, kx0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/data/response/cart/ChangeBasketInfoDto;Ljava/util/List;)Lru/myspar/proloyalty/core/domain/models/cart/ChangeProductsResult;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final kz0.gxszxtbevo invoke(ChangeBasketInfoDto p13, List p14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            return ((kx0.zoijcleaow) this.receiver).wkgbmnqykc(p13, p14);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        ppxfxbqfkf(Object obj) {
            super(2, obj, kx0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/data/response/cart/AddProductListToCartResponseDto;Lru/myspar/proloyalty/core/models/Warning;)Lru/myspar/proloyalty/core/domain/models/cart/AddComboToCartResult;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final kz0.iobyxmoadg invoke(AddProductListToCartResponseDto p13, Warning p14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            return ((kx0.zoijcleaow) this.receiver).iobyxmoadg(p13, p14);
        }
    }

    /* synthetic */ class rgvfuqvkyq extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        rgvfuqvkyq(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    /* synthetic */ class vdvldrhtss extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        vdvldrhtss(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    /* synthetic */ class wflxmlrfwp extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        wflxmlrfwp(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    /* synthetic */ class wkgbmnqykc extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        wkgbmnqykc(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class wwaezpbzkn extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111931iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111933yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111934zdlpuopuiu;

        wwaezpbzkn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111933yggfygwlhe = obj;
            this.f111931iwizpuwonk |= Integer.MIN_VALUE;
            Object objLqeggnwhkg = eablkybsjg.this.lqeggnwhkg(this);
            return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.kcexrzcfyt.iobyxmoadg(objLqeggnwhkg);
        }
    }

    static final class wypolnanlu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f111935jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f111937zdlpuopuiu;

        wypolnanlu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111937zdlpuopuiu = obj;
            this.f111935jyumaefscl |= Integer.MIN_VALUE;
            return eablkybsjg.this.ojitshcjhn(null, this);
        }
    }

    /* synthetic */ class yadqdtsiqt extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        yadqdtsiqt(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    /* synthetic */ class yggfygwlhe extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        yggfygwlhe(Object obj) {
            super(1, obj, nx0.iobyxmoadg.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.iobyxmoadg) this.receiver).zoijcleaow(p13);
        }
    }

    /* synthetic */ class ylkuphrtab extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        ylkuphrtab(Object obj) {
            super(2, obj, kx0.wkgbmnqykc.class, "map", "map(Lru/myspar/proloyalty/core/data/request/cart/CartDto;Lru/myspar/proloyalty/core/models/Warning;)Lru/myspar/proloyalty/core/domain/models/cart/Cart;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Cart invoke(CartDto cartDto, Warning p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p1");
            return ((kx0.wkgbmnqykc) this.receiver).iobyxmoadg(cartDto, p13);
        }
    }

    /* synthetic */ class zdlpuopuiu extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zdlpuopuiu(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f111938iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f111940yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f111941zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f111940yggfygwlhe = obj;
            this.f111938iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.wkgbmnqykc(null, this);
        }
    }

    /* synthetic */ class zynmafqrjb extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zynmafqrjb(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    public eablkybsjg(ww0.zoijcleaow apiService, kx0.wkgbmnqykc cartMapper, kx0.zoijcleaow cartBasketMapper, nx0.iobyxmoadg cartWarningSelector, ex0.zoijcleaow responseErrorFactory) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(apiService, "apiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartMapper, "cartMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartBasketMapper, "cartBasketMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartWarningSelector, "cartWarningSelector");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(responseErrorFactory, "responseErrorFactory");
        this.f111882iobyxmoadg = apiService;
        this.f111885zoijcleaow = cartMapper;
        this.f111883ppxfxbqfkf = cartBasketMapper;
        this.f111884wkgbmnqykc = cartWarningSelector;
        this.f111881eablkybsjg = responseErrorFactory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // k01.wkgbmnqykc
    public Object agtfadlqog(String str, String str2, double d13, MeasureType measureType, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f111901iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f111901iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = gxszxtbevoVar2.f111903yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f111901iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            EditCartProductRequest editCartProductRequest = new EditCartProductRequest(str, str2, d13, measureType.getValue(), (String) null, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13), 16, (kotlin.jvm.internal.gtknphoqwx) null);
            gxszxtbevoVar2.f111904zdlpuopuiu = this;
            gxszxtbevoVar2.f111901iwizpuwonk = 1;
            objWkgbmnqykc = zoijcleaowVar.wkgbmnqykc(editCartProductRequest, gxszxtbevoVar2);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar2.f111904zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return x21.wkgbmnqykc.kcexrzcfyt((BasicResponse) objWkgbmnqykc, new lqeggnwhkg(eablkybsjgVar.f111883ppxfxbqfkf), new nufgyqmvbu(eablkybsjgVar.f111881eablkybsjg), new dxjokdxxww(eablkybsjgVar.f111884wkgbmnqykc));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object btonecajqb(String str, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        lmojexxdyd lmojexxdydVar;
        if (gxszxtbevoVar instanceof lmojexxdyd) {
            lmojexxdydVar = (lmojexxdyd) gxszxtbevoVar;
            int i13 = lmojexxdydVar.f111924jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lmojexxdydVar.f111924jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                lmojexxdydVar = new lmojexxdyd(gxszxtbevoVar);
            }
        } else {
            lmojexxdydVar = new lmojexxdyd(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = lmojexxdydVar.f111926zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lmojexxdydVar.f111924jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            ClearCartRequest clearCartRequest = new ClearCartRequest(str);
            lmojexxdydVar.f111924jyumaefscl = 1;
            objPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(clearCartRequest, lmojexxdydVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objPpxfxbqfkf, null, 1, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object draadjrbmk(kz0.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
        jpowsppfya jpowsppfyaVar;
        if (gxszxtbevoVar instanceof jpowsppfya) {
            jpowsppfyaVar = (jpowsppfya) gxszxtbevoVar;
            int i13 = jpowsppfyaVar.f111913jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jpowsppfyaVar.f111913jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                jpowsppfyaVar = new jpowsppfya(gxszxtbevoVar);
            }
        } else {
            jpowsppfyaVar = new jpowsppfya(gxszxtbevoVar);
        }
        Object objGxszxtbevo = jpowsppfyaVar.f111915zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = jpowsppfyaVar.f111913jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            String strZoijcleaow = lqeggnwhkgVar.zoijcleaow();
            DeliveryCode deliveryCodeIobyxmoadg = lqeggnwhkgVar.iobyxmoadg();
            OrderCommentsRequest orderCommentsRequest = new OrderCommentsRequest((String) null, strZoijcleaow, (String) null, deliveryCodeIobyxmoadg != null ? deliveryCodeIobyxmoadg.getServerCode() : null, 5, (kotlin.jvm.internal.gtknphoqwx) null);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            jpowsppfyaVar.f111913jyumaefscl = 1;
            objGxszxtbevo = zoijcleaowVar.gxszxtbevo(orderCommentsRequest, jpowsppfyaVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return kx0.nufgyqmvbu.iobyxmoadg((OrderCommentsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objGxszxtbevo, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object dxjokdxxww(String str, lg.gxszxtbevo gxszxtbevoVar) {
        hkdspvbjdz hkdspvbjdzVar;
        if (gxszxtbevoVar instanceof hkdspvbjdz) {
            hkdspvbjdzVar = (hkdspvbjdz) gxszxtbevoVar;
            int i13 = hkdspvbjdzVar.f111905jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hkdspvbjdzVar.f111905jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                hkdspvbjdzVar = new hkdspvbjdz(gxszxtbevoVar);
            }
        } else {
            hkdspvbjdzVar = new hkdspvbjdz(gxszxtbevoVar);
        }
        Object objGxszxtbevo = hkdspvbjdzVar.f111907zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = hkdspvbjdzVar.f111905jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            OrderCommentsRequest orderCommentsRequest = new OrderCommentsRequest(str, (String) null, (String) null, (String) null, 14, (kotlin.jvm.internal.gtknphoqwx) null);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            hkdspvbjdzVar.f111905jyumaefscl = 1;
            objGxszxtbevo = zoijcleaowVar.gxszxtbevo(orderCommentsRequest, hkdspvbjdzVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return kx0.nufgyqmvbu.iobyxmoadg((OrderCommentsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objGxszxtbevo, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object eablkybsjg(List list, lg.gxszxtbevo gxszxtbevoVar) {
        dsvhmnatus dsvhmnatusVar;
        if (gxszxtbevoVar instanceof dsvhmnatus) {
            dsvhmnatusVar = (dsvhmnatus) gxszxtbevoVar;
            int i13 = dsvhmnatusVar.f111898jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dsvhmnatusVar.f111898jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                dsvhmnatusVar = new dsvhmnatus(gxszxtbevoVar);
            }
        } else {
            dsvhmnatusVar = new dsvhmnatus(gxszxtbevoVar);
        }
        Object objZoijcleaow = dsvhmnatusVar.f111900zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dsvhmnatusVar.f111898jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            List listWkgbmnqykc = kx0.nufgyqmvbu.wkgbmnqykc(list);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            CartSetParamsRequest cartSetParamsRequest = new CartSetParamsRequest((CartReceiverDto) null, listWkgbmnqykc, 1, (kotlin.jvm.internal.gtknphoqwx) null);
            dsvhmnatusVar.f111898jyumaefscl = 1;
            objZoijcleaow = zoijcleaowVar.zoijcleaow(cartSetParamsRequest, dsvhmnatusVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return kx0.nufgyqmvbu.iobyxmoadg((OrderCommentsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object gtknphoqwx(String str, String str2, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        istkbnxepw istkbnxepwVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof istkbnxepw) {
            istkbnxepwVar = (istkbnxepw) gxszxtbevoVar;
            int i13 = istkbnxepwVar.f111909iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                istkbnxepwVar.f111909iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                istkbnxepwVar = new istkbnxepw(gxszxtbevoVar);
            }
        } else {
            istkbnxepwVar = new istkbnxepw(gxszxtbevoVar);
        }
        Object objDxjokdxxww = istkbnxepwVar.f111911yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = istkbnxepwVar.f111909iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            cy0.lqeggnwhkg.ChangeDateAndInterval changeDateAndInterval = new cy0.lqeggnwhkg.ChangeDateAndInterval(str, str2, z13);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            istkbnxepwVar.f111912zdlpuopuiu = this;
            istkbnxepwVar.f111909iwizpuwonk = 1;
            objDxjokdxxww = zoijcleaowVar.dxjokdxxww(changeDateAndInterval, istkbnxepwVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) istkbnxepwVar.f111912zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return x21.wkgbmnqykc.jyumaefscl((BasicResponse) objDxjokdxxww, new cdpycssgdh(eablkybsjgVar.f111885zoijcleaow), new yadqdtsiqt(eablkybsjgVar.f111881eablkybsjg), new iozdgvuglv(eablkybsjgVar.f111884wkgbmnqykc));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar) {
        agtfadlqog agtfadlqogVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof agtfadlqog) {
            agtfadlqogVar = (agtfadlqog) gxszxtbevoVar;
            int i13 = agtfadlqogVar.f111886iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                agtfadlqogVar.f111886iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            }
        } else {
            agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
        }
        Object objDxjokdxxww = agtfadlqogVar.f111888yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = agtfadlqogVar.f111886iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            cy0.lqeggnwhkg.ApplyPromoCode applyPromoCode = new cy0.lqeggnwhkg.ApplyPromoCode(str);
            agtfadlqogVar.f111889zdlpuopuiu = this;
            agtfadlqogVar.f111886iwizpuwonk = 1;
            objDxjokdxxww = zoijcleaowVar.dxjokdxxww(applyPromoCode, agtfadlqogVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) agtfadlqogVar.f111889zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return x21.wkgbmnqykc.jyumaefscl((BasicResponse) objDxjokdxxww, new ojitshcjhn(eablkybsjgVar.f111885zoijcleaow), new rgvfuqvkyq(eablkybsjgVar.f111881eablkybsjg), new vdvldrhtss(eablkybsjgVar.f111884wkgbmnqykc));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object iobyxmoadg(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i14 = btonecajqbVar.f111890iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f111890iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object objDxjokdxxww = btonecajqbVar.f111892yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = btonecajqbVar.f111890iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            cy0.lqeggnwhkg.ApplyBonuses applyBonuses = new cy0.lqeggnwhkg.ApplyBonuses(i13);
            btonecajqbVar.f111893zdlpuopuiu = this;
            btonecajqbVar.f111890iwizpuwonk = 1;
            objDxjokdxxww = zoijcleaowVar.dxjokdxxww(applyBonuses, btonecajqbVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) btonecajqbVar.f111893zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return x21.wkgbmnqykc.jyumaefscl((BasicResponse) objDxjokdxxww, new gtknphoqwx(eablkybsjgVar.f111885zoijcleaow), new draadjrbmk(eablkybsjgVar.f111881eablkybsjg), new wflxmlrfwp(eablkybsjgVar.f111884wkgbmnqykc));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
        wwaezpbzkn wwaezpbzknVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof wwaezpbzkn) {
            wwaezpbzknVar = (wwaezpbzkn) gxszxtbevoVar;
            int i13 = wwaezpbzknVar.f111931iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wwaezpbzknVar.f111931iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wwaezpbzknVar = new wwaezpbzkn(gxszxtbevoVar);
            }
        } else {
            wwaezpbzknVar = new wwaezpbzkn(gxszxtbevoVar);
        }
        Object objDxjokdxxww = wwaezpbzknVar.f111933yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wwaezpbzknVar.f111931iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            cy0.lqeggnwhkg.nufgyqmvbu nufgyqmvbuVar = cy0.lqeggnwhkg.nufgyqmvbu.INSTANCE;
            wwaezpbzknVar.f111934zdlpuopuiu = this;
            wwaezpbzknVar.f111931iwizpuwonk = 1;
            objDxjokdxxww = zoijcleaowVar.dxjokdxxww(nufgyqmvbuVar, wwaezpbzknVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) wwaezpbzknVar.f111934zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return x21.wkgbmnqykc.jyumaefscl((BasicResponse) objDxjokdxxww, new ylkuphrtab(eablkybsjgVar.f111885zoijcleaow), new pkzmftpjix(eablkybsjgVar.f111881eablkybsjg), new hcddaimhww(eablkybsjgVar.f111884wkgbmnqykc));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object nufgyqmvbu(List list, lg.gxszxtbevo gxszxtbevoVar) {
        lereixgezr lereixgezrVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof lereixgezr) {
            lereixgezrVar = (lereixgezr) gxszxtbevoVar;
            int i13 = lereixgezrVar.f111920iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lereixgezrVar.f111920iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lereixgezrVar = new lereixgezr(gxszxtbevoVar);
            }
        } else {
            lereixgezrVar = new lereixgezr(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = lereixgezrVar.f111922yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lereixgezrVar.f111920iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            CartChangeProductsRequest cartChangeProductsRequest = new CartChangeProductsRequest(list);
            lereixgezrVar.f111923zdlpuopuiu = this;
            lereixgezrVar.f111920iwizpuwonk = 1;
            objNufgyqmvbu = zoijcleaowVar.nufgyqmvbu(cartChangeProductsRequest, lereixgezrVar);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) lereixgezrVar.f111923zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        return x21.wkgbmnqykc.yggfygwlhe((BasicResponse) objNufgyqmvbu, new pmvmpeiblj(eablkybsjgVar.f111883ppxfxbqfkf), new zynmafqrjb(eablkybsjgVar.f111881eablkybsjg));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object ojitshcjhn(CartReceiver cartReceiver, lg.gxszxtbevo gxszxtbevoVar) {
        wypolnanlu wypolnanluVar;
        if (gxszxtbevoVar instanceof wypolnanlu) {
            wypolnanluVar = (wypolnanlu) gxszxtbevoVar;
            int i13 = wypolnanluVar.f111935jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wypolnanluVar.f111935jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                wypolnanluVar = new wypolnanlu(gxszxtbevoVar);
            }
        } else {
            wypolnanluVar = new wypolnanlu(gxszxtbevoVar);
        }
        Object objIobyxmoadg = wypolnanluVar.f111937zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wypolnanluVar.f111935jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            CartReceiverDto cartReceiverDtoPpxfxbqfkf = kx0.gxszxtbevo.ppxfxbqfkf(cartReceiver);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            CartSetParamsRequest cartSetParamsRequest = new CartSetParamsRequest(cartReceiverDtoPpxfxbqfkf, (List) null, 2, (kotlin.jvm.internal.gtknphoqwx) null);
            wypolnanluVar.f111935jyumaefscl = 1;
            objIobyxmoadg = zoijcleaowVar.iobyxmoadg(cartSetParamsRequest, wypolnanluVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        return kx0.gxszxtbevo.zoijcleaow((CartSetReceiverResultDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objIobyxmoadg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object ppxfxbqfkf(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        cllcsxoeiz cllcsxoeizVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof cllcsxoeiz) {
            cllcsxoeizVar = (cllcsxoeiz) gxszxtbevoVar;
            int i13 = cllcsxoeizVar.f111894iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cllcsxoeizVar.f111894iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                cllcsxoeizVar = new cllcsxoeiz(gxszxtbevoVar);
            }
        } else {
            cllcsxoeizVar = new cllcsxoeiz(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = cllcsxoeizVar.f111896yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = cllcsxoeizVar.f111894iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            MakeOrderRequest makeOrderRequest = new MakeOrderRequest(str, str2);
            cllcsxoeizVar.f111897zdlpuopuiu = this;
            cllcsxoeizVar.f111894iwizpuwonk = 1;
            objLqeggnwhkg = zoijcleaowVar.lqeggnwhkg(makeOrderRequest, cllcsxoeizVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) cllcsxoeizVar.f111897zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        return eablkybsjgVar.f111883ppxfxbqfkf.ppxfxbqfkf((BasketOrderDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objLqeggnwhkg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object wflxmlrfwp(String str, DeliveryCode deliveryCode, lg.gxszxtbevo gxszxtbevoVar) {
        oxmwwwfdhm oxmwwwfdhmVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof oxmwwwfdhm) {
            oxmwwwfdhmVar = (oxmwwwfdhm) gxszxtbevoVar;
            int i13 = oxmwwwfdhmVar.f111927iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oxmwwwfdhmVar.f111927iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            }
        } else {
            oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
        }
        Object objDxjokdxxww = oxmwwwfdhmVar.f111929yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = oxmwwwfdhmVar.f111927iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            cy0.lqeggnwhkg changeAddressDelivery = iobyxmoadg.f111908iobyxmoadg[deliveryCode.ordinal()] == 1 ? new cy0.lqeggnwhkg.ChangeAddressDelivery(deliveryCode.getServerCode(), str) : new cy0.lqeggnwhkg.ChangeAddressPickUp(DeliveryCode.PICKUP.getServerCode(), str);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            oxmwwwfdhmVar.f111930zdlpuopuiu = this;
            oxmwwwfdhmVar.f111927iwizpuwonk = 1;
            objDxjokdxxww = zoijcleaowVar.dxjokdxxww(changeAddressDelivery, oxmwwwfdhmVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) oxmwwwfdhmVar.f111930zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return x21.wkgbmnqykc.jyumaefscl((BasicResponse) objDxjokdxxww, new kcexrzcfyt(eablkybsjgVar.f111885zoijcleaow), new zdlpuopuiu(eablkybsjgVar.f111881eablkybsjg), new yggfygwlhe(eablkybsjgVar.f111884wkgbmnqykc));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object wkgbmnqykc(List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f111938iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f111938iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = zoijcleaowVar.f111940yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f111938iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ww0.zoijcleaow zoijcleaowVar2 = this.f111882iobyxmoadg;
            AddProductListToCartRequest addProductListToCartRequest = new AddProductListToCartRequest(list);
            zoijcleaowVar.f111941zdlpuopuiu = this;
            zoijcleaowVar.f111938iwizpuwonk = 1;
            objEablkybsjg = zoijcleaowVar2.eablkybsjg(addProductListToCartRequest, zoijcleaowVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) zoijcleaowVar.f111941zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return x21.wkgbmnqykc.kcexrzcfyt((BasicResponse) objEablkybsjg, new ppxfxbqfkf(eablkybsjgVar.f111883ppxfxbqfkf), new wkgbmnqykc(eablkybsjgVar.f111881eablkybsjg), new C2753eablkybsjg(eablkybsjgVar.f111884wkgbmnqykc));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.wkgbmnqykc
    public Object zoijcleaow(List list, lg.gxszxtbevo gxszxtbevoVar) {
        jyumaefscl jyumaefsclVar;
        eablkybsjg eablkybsjgVar;
        if (gxszxtbevoVar instanceof jyumaefscl) {
            jyumaefsclVar = (jyumaefscl) gxszxtbevoVar;
            int i13 = jyumaefsclVar.f111916iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jyumaefsclVar.f111916iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            }
        } else {
            jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
        }
        Object objDxjokdxxww = jyumaefsclVar.f111918yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = jyumaefsclVar.f111916iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            ww0.zoijcleaow zoijcleaowVar = this.f111882iobyxmoadg;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kx0.ppxfxbqfkf.iobyxmoadg((ProductData) it.next()));
            }
            cy0.lqeggnwhkg.ChangeProducts changeProducts = new cy0.lqeggnwhkg.ChangeProducts(arrayList);
            jyumaefsclVar.f111919zdlpuopuiu = this;
            jyumaefsclVar.f111916iwizpuwonk = 1;
            objDxjokdxxww = zoijcleaowVar.dxjokdxxww(changeProducts, jyumaefsclVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            eablkybsjgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (eablkybsjg) jyumaefsclVar.f111919zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return x21.wkgbmnqykc.kcexrzcfyt((BasicResponse) objDxjokdxxww, new iwizpuwonk(eablkybsjgVar.f111885zoijcleaow), new cqumvgiudr(eablkybsjgVar.f111881eablkybsjg), new esjtqupxsv(eablkybsjgVar.f111884wkgbmnqykc));
    }
}
