package c00;

import cz.OrderEditRequest;
import d10.OrderChangeProductsRequest;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.cart.ProductData;
import ru.myspar.core.domain.models.order.OrderPickupStatus;
import ru.myspar.core.models.Warning;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;
import ru.myspar.core.network.model.WarningDto;
import sz.ChangeOrderInfoDto;
import sz.OrderDetailsDto;
import sz.OrderEditResultDto;
import sz.OrdersDto;
import uy.CancelOrderRequest;
import uy.GetOrdersRequest;
import uy.ModifyOrderRequest;
import uy.OrderDetailsRequest;
import uy.RateOrderRequest;
import uy.UpdatePickupStatusRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class ojitshcjhn implements w10.dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final jy.zoijcleaow f18108eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ay.lqeggnwhkg f18109iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final sy.zoijcleaow f18110ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final jy.iobyxmoadg f18111wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final qy.gxszxtbevo f18112zoijcleaow;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18113jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18115zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18115zdlpuopuiu = obj;
            this.f18113jyumaefscl |= Integer.MIN_VALUE;
            return ojitshcjhn.this.eablkybsjg(null, 0, null, this);
        }
    }

    /* synthetic */ class btonecajqb extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        btonecajqb(Object obj) {
            super(1, obj, sy.zoijcleaow.class, "select", "select(Ljava/util/List;)Lru/myspar/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((sy.zoijcleaow) this.receiver).zoijcleaow(p13);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18116jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18118zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18118zdlpuopuiu = obj;
            this.f18116jyumaefscl |= Integer.MIN_VALUE;
            return ojitshcjhn.this.gxszxtbevo(null, this);
        }
    }

    /* synthetic */ class dxjokdxxww extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        dxjokdxxww(Object obj) {
            super(1, obj, jy.zoijcleaow.class, "map", "map(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((jy.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f18119cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f18121jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f18122yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18123zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18121jyumaefscl = obj;
            this.f18119cqumvgiudr |= Integer.MIN_VALUE;
            return ojitshcjhn.this.lqeggnwhkg(null, null, null, false, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18124iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18126yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18127zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18126yggfygwlhe = obj;
            this.f18124iwizpuwonk |= Integer.MIN_VALUE;
            return ojitshcjhn.this.iobyxmoadg(null, this);
        }
    }

    /* synthetic */ class gxszxtbevo extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        gxszxtbevo(Object obj) {
            super(1, obj, jy.zoijcleaow.class, "map", "map(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((jy.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18128jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18130zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18130zdlpuopuiu = obj;
            this.f18128jyumaefscl |= Integer.MIN_VALUE;
            return ojitshcjhn.this.zoijcleaow(null, null, this);
        }
    }

    /* synthetic */ class kcexrzcfyt extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        kcexrzcfyt(Object obj) {
            super(1, obj, jy.zoijcleaow.class, "map", "map(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((jy.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    /* synthetic */ class lqeggnwhkg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        lqeggnwhkg(Object obj) {
            super(1, obj, sy.zoijcleaow.class, "select", "select(Ljava/util/List;)Lru/myspar/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((sy.zoijcleaow) this.receiver).zoijcleaow(p13);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f18131cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f18133jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f18134yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18135zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18133jyumaefscl = obj;
            this.f18131cqumvgiudr |= Integer.MIN_VALUE;
            return ojitshcjhn.this.wflxmlrfwp(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: c00.ojitshcjhn$ojitshcjhn, reason: collision with other inner class name */
    static final class C0334ojitshcjhn extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18136iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18138yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18139zdlpuopuiu;

        C0334ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18138yggfygwlhe = obj;
            this.f18136iwizpuwonk |= Integer.MIN_VALUE;
            return ojitshcjhn.this.wkgbmnqykc(null, this);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18140iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18142yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18143zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18142yggfygwlhe = obj;
            this.f18140iwizpuwonk |= Integer.MIN_VALUE;
            return ojitshcjhn.this.nufgyqmvbu(null, null, null, this);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        ppxfxbqfkf(Object obj) {
            super(2, obj, qy.gxszxtbevo.class, "map", "map(Lru/myspar/core/data/response/order/ChangeOrderInfoDto;Ljava/util/List;)Lru/myspar/core/domain/models/order/change_products/ChangeOrderProductsResult;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final d10.iobyxmoadg invoke(ChangeOrderInfoDto p13, List p14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            return ((qy.gxszxtbevo) this.receiver).zoijcleaow(p13, p14);
        }
    }

    /* synthetic */ class rgvfuqvkyq extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        rgvfuqvkyq(Object obj) {
            super(1, obj, jy.zoijcleaow.class, "map", "map(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((jy.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    /* synthetic */ class vdvldrhtss extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        vdvldrhtss(Object obj) {
            super(1, obj, sy.zoijcleaow.class, "select", "select(Ljava/util/List;)Lru/myspar/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((sy.zoijcleaow) this.receiver).zoijcleaow(p13);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18144iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18146yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18147zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18146yggfygwlhe = obj;
            this.f18144iwizpuwonk |= Integer.MIN_VALUE;
            return ojitshcjhn.this.dxjokdxxww(null, 0, this);
        }
    }

    /* synthetic */ class wkgbmnqykc extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        wkgbmnqykc(Object obj) {
            super(1, obj, jy.zoijcleaow.class, "map", "map(Lru/myspar/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((jy.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f18148jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f18150zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18150zdlpuopuiu = obj;
            this.f18148jyumaefscl |= Integer.MIN_VALUE;
            return ojitshcjhn.this.btonecajqb(null, null, null, this);
        }
    }

    /* synthetic */ class zdlpuopuiu extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zdlpuopuiu(Object obj) {
            super(1, obj, sy.zoijcleaow.class, "select", "select(Ljava/util/List;)Lru/myspar/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((sy.zoijcleaow) this.receiver).zoijcleaow(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18151iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18153yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18154zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18153yggfygwlhe = obj;
            this.f18151iwizpuwonk |= Integer.MIN_VALUE;
            return ojitshcjhn.this.ppxfxbqfkf(null, null, this);
        }
    }

    public ojitshcjhn(ay.lqeggnwhkg orderApiService, qy.gxszxtbevo orderResponseMapper, sy.zoijcleaow orderEditWarningSelector, jy.iobyxmoadg orderEditRequestProductListFactory, jy.zoijcleaow responseErrorFactory) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderApiService, "orderApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderResponseMapper, "orderResponseMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditWarningSelector, "orderEditWarningSelector");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditRequestProductListFactory, "orderEditRequestProductListFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(responseErrorFactory, "responseErrorFactory");
        this.f18109iobyxmoadg = orderApiService;
        this.f18112zoijcleaow = orderResponseMapper;
        this.f18110ppxfxbqfkf = orderEditWarningSelector;
        this.f18111wkgbmnqykc = orderEditRequestProductListFactory;
        this.f18108eablkybsjg = responseErrorFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e10.iobyxmoadg oxmwwwfdhm(ojitshcjhn ojitshcjhnVar, String str, OrderEditResultDto orderEditDto, Warning warning) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditDto, "orderEditDto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(warning, "warning");
        return ojitshcjhnVar.f18112zoijcleaow.ppxfxbqfkf(str, orderEditDto, warning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e10.iobyxmoadg rgvfuqvkyq(ojitshcjhn ojitshcjhnVar, String str, OrderEditResultDto orderEditResultDto, Warning warning) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditResultDto, "orderEditResultDto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(warning, "warning");
        return ojitshcjhnVar.f18112zoijcleaow.ppxfxbqfkf(str, orderEditResultDto, warning);
    }

    private final String vdvldrhtss(LocationData locationData) {
        if (locationData == null) {
            return null;
        }
        return locationData.getLatitude() + StringUtils.COMMA + locationData.getLongitude();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object btonecajqb(String str, OrderPickupStatus orderPickupStatus, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        yggfygwlhe yggfygwlheVar;
        if (gxszxtbevoVar instanceof yggfygwlhe) {
            yggfygwlheVar = (yggfygwlhe) gxszxtbevoVar;
            int i13 = yggfygwlheVar.f18148jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                yggfygwlheVar.f18148jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                yggfygwlheVar = new yggfygwlhe(gxszxtbevoVar);
            }
        } else {
            yggfygwlheVar = new yggfygwlhe(gxszxtbevoVar);
        }
        Object objGxszxtbevo = yggfygwlheVar.f18150zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = yggfygwlheVar.f18148jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            UpdatePickupStatusRequest updatePickupStatusRequest = new UpdatePickupStatusRequest(str, orderPickupStatus.getStatus(), vdvldrhtss(locationData));
            yggfygwlheVar.f18148jyumaefscl = 1;
            objGxszxtbevo = lqeggnwhkgVar.gxszxtbevo(updatePickupStatusRequest, yggfygwlheVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objGxszxtbevo, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object dxjokdxxww(c10.gxszxtbevo gxszxtbevoVar, int i13, lg.gxszxtbevo gxszxtbevoVar2) {
        wflxmlrfwp wflxmlrfwpVar;
        ojitshcjhn ojitshcjhnVar;
        if (gxszxtbevoVar2 instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar2;
            int i14 = wflxmlrfwpVar.f18144iwizpuwonk;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f18144iwizpuwonk = i14 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar2);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar2);
        }
        Object objEablkybsjg = wflxmlrfwpVar.f18146yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = wflxmlrfwpVar.f18144iwizpuwonk;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            GetOrdersRequest getOrdersRequest = new GetOrdersRequest(gxszxtbevoVar.wkgbmnqykc(), i13);
            wflxmlrfwpVar.f18147zdlpuopuiu = this;
            wflxmlrfwpVar.f18144iwizpuwonk = 1;
            objEablkybsjg = lqeggnwhkgVar.eablkybsjg(getOrdersRequest, wflxmlrfwpVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhnVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ojitshcjhnVar = (ojitshcjhn) wflxmlrfwpVar.f18147zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        return ojitshcjhnVar.f18112zoijcleaow.iobyxmoadg((OrdersDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objEablkybsjg, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object eablkybsjg(String str, int i13, String str2, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        agtfadlqog agtfadlqogVar;
        if (gxszxtbevoVar instanceof agtfadlqog) {
            agtfadlqogVar = (agtfadlqog) gxszxtbevoVar;
            int i14 = agtfadlqogVar.f18113jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                agtfadlqogVar.f18113jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            }
        } else {
            agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
        }
        Object objNufgyqmvbu = agtfadlqogVar.f18115zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = agtfadlqogVar.f18113jyumaefscl;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            RateOrderRequest rateOrderRequest = new RateOrderRequest(str, i13, str2);
            agtfadlqogVar.f18113jyumaefscl = 1;
            objNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu(rateOrderRequest, agtfadlqogVar);
            if (objNufgyqmvbu == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objNufgyqmvbu, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f18116jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f18116jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object objZoijcleaow = draadjrbmkVar.f18118zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f18116jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            OrderDetailsRequest orderDetailsRequest = new OrderDetailsRequest(str);
            draadjrbmkVar.f18116jyumaefscl = 1;
            objZoijcleaow = lqeggnwhkgVar.zoijcleaow(orderDetailsRequest, draadjrbmkVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return qy.eablkybsjg.iobyxmoadg(((OrderDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null)).getReference());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        ojitshcjhn ojitshcjhnVar;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f18124iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f18124iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objZoijcleaow = gtknphoqwxVar.f18126yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f18124iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            OrderDetailsRequest orderDetailsRequest = new OrderDetailsRequest(str);
            gtknphoqwxVar.f18127zdlpuopuiu = this;
            gtknphoqwxVar.f18124iwizpuwonk = 1;
            objZoijcleaow = lqeggnwhkgVar.zoijcleaow(orderDetailsRequest, gtknphoqwxVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhnVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ojitshcjhnVar = (ojitshcjhn) gtknphoqwxVar.f18127zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return ojitshcjhnVar.f18112zoijcleaow.wkgbmnqykc((OrderDetailsDto) o40.eablkybsjg.agtfadlqog((BasicResponse) objZoijcleaow, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object lqeggnwhkg(final String str, e10.iobyxmoadg iobyxmoadgVar, List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        final ojitshcjhn ojitshcjhnVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f18119cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f18119cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objGtknphoqwx = eablkybsjgVar.f18121jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f18119cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
            jy.iobyxmoadg iobyxmoadgVar2 = this.f18111wkgbmnqykc;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(qy.ppxfxbqfkf.iobyxmoadg((e10.gxszxtbevo) it.next()));
            }
            OrderEditRequest orderEditRequestPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(str, iobyxmoadgVar, arrayList, e10.zoijcleaow.CONTINUE, z13);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            eablkybsjgVar.f18123zdlpuopuiu = this;
            eablkybsjgVar.f18122yggfygwlhe = str;
            eablkybsjgVar.f18119cqumvgiudr = 1;
            objGtknphoqwx = lqeggnwhkgVar.gtknphoqwx(orderEditRequestPpxfxbqfkf, eablkybsjgVar);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhnVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) eablkybsjgVar.f18122yggfygwlhe;
            ojitshcjhnVar = (ojitshcjhn) eablkybsjgVar.f18123zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
        }
        return o40.eablkybsjg.ojitshcjhn((BasicResponse) objGtknphoqwx, new tg.rgvfuqvkyq() { // from class: c00.agtfadlqog
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ojitshcjhn.rgvfuqvkyq(this.f17845zdlpuopuiu, str, (OrderEditResultDto) obj, (Warning) obj2);
            }
        }, new gxszxtbevo(ojitshcjhnVar.f18108eablkybsjg), new lqeggnwhkg(ojitshcjhnVar.f18110ppxfxbqfkf));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object nufgyqmvbu(String str, e10.iobyxmoadg iobyxmoadgVar, e10.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        oxmwwwfdhm oxmwwwfdhmVar;
        ojitshcjhn ojitshcjhnVar;
        if (gxszxtbevoVar instanceof oxmwwwfdhm) {
            oxmwwwfdhmVar = (oxmwwwfdhm) gxszxtbevoVar;
            int i13 = oxmwwwfdhmVar.f18140iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oxmwwwfdhmVar.f18140iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            }
        } else {
            oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = oxmwwwfdhmVar.f18142yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = oxmwwwfdhmVar.f18140iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            OrderEditRequest orderEditRequestZoijcleaow = qy.iobyxmoadg.zoijcleaow(iobyxmoadgVar, str, null, zoijcleaowVar);
            oxmwwwfdhmVar.f18143zdlpuopuiu = this;
            oxmwwwfdhmVar.f18140iwizpuwonk = 1;
            objPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf(orderEditRequestZoijcleaow, oxmwwwfdhmVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhnVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ojitshcjhnVar = (ojitshcjhn) oxmwwwfdhmVar.f18143zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return o40.eablkybsjg.gtknphoqwx((BasicResponse) objPpxfxbqfkf, new kcexrzcfyt(ojitshcjhnVar.f18108eablkybsjg), new zdlpuopuiu(ojitshcjhnVar.f18110ppxfxbqfkf));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object ppxfxbqfkf(String str, List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        ojitshcjhn ojitshcjhnVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18151iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18151iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objBtonecajqb = zoijcleaowVar.f18153yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18151iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objBtonecajqb);
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l00.draadjrbmk.zoijcleaow((ProductData) it.next()));
            }
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            OrderChangeProductsRequest orderChangeProductsRequest = new OrderChangeProductsRequest(str, arrayList);
            zoijcleaowVar.f18154zdlpuopuiu = this;
            zoijcleaowVar.f18151iwizpuwonk = 1;
            objBtonecajqb = lqeggnwhkgVar.btonecajqb(orderChangeProductsRequest, zoijcleaowVar);
            if (objBtonecajqb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhnVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ojitshcjhnVar = (ojitshcjhn) zoijcleaowVar.f18154zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objBtonecajqb);
        }
        return o40.eablkybsjg.vdvldrhtss((BasicResponse) objBtonecajqb, new ppxfxbqfkf(ojitshcjhnVar.f18112zoijcleaow), new wkgbmnqykc(ojitshcjhnVar.f18108eablkybsjg));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object wflxmlrfwp(final String str, e10.iobyxmoadg iobyxmoadgVar, e10.gxszxtbevo gxszxtbevoVar, e10.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar2) {
        nufgyqmvbu nufgyqmvbuVar;
        final ojitshcjhn ojitshcjhnVar;
        if (gxszxtbevoVar2 instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar2;
            int i13 = nufgyqmvbuVar.f18131cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f18131cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar2);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar2);
        }
        Object objGtknphoqwx = nufgyqmvbuVar.f18133jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f18131cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
            OrderEditRequest orderEditRequestZoijcleaow = qy.iobyxmoadg.zoijcleaow(iobyxmoadgVar, str, gxszxtbevoVar != null ? qy.ppxfxbqfkf.iobyxmoadg(gxszxtbevoVar) : null, zoijcleaowVar);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            nufgyqmvbuVar.f18135zdlpuopuiu = this;
            nufgyqmvbuVar.f18134yggfygwlhe = str;
            nufgyqmvbuVar.f18131cqumvgiudr = 1;
            objGtknphoqwx = lqeggnwhkgVar.gtknphoqwx(orderEditRequestZoijcleaow, nufgyqmvbuVar);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhnVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) nufgyqmvbuVar.f18134yggfygwlhe;
            ojitshcjhnVar = (ojitshcjhn) nufgyqmvbuVar.f18135zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
        }
        return o40.eablkybsjg.ojitshcjhn((BasicResponse) objGtknphoqwx, new tg.rgvfuqvkyq() { // from class: c00.wflxmlrfwp
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ojitshcjhn.oxmwwwfdhm(this.f18181zdlpuopuiu, str, (OrderEditResultDto) obj, (Warning) obj2);
            }
        }, new dxjokdxxww(ojitshcjhnVar.f18108eablkybsjg), new btonecajqb(ojitshcjhnVar.f18110ppxfxbqfkf));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        C0334ojitshcjhn c0334ojitshcjhn;
        ojitshcjhn ojitshcjhnVar;
        if (gxszxtbevoVar instanceof C0334ojitshcjhn) {
            c0334ojitshcjhn = (C0334ojitshcjhn) gxszxtbevoVar;
            int i13 = c0334ojitshcjhn.f18136iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0334ojitshcjhn.f18136iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0334ojitshcjhn = new C0334ojitshcjhn(gxszxtbevoVar);
            }
        } else {
            c0334ojitshcjhn = new C0334ojitshcjhn(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = c0334ojitshcjhn.f18138yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0334ojitshcjhn.f18136iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            ModifyOrderRequest modifyOrderRequest = new ModifyOrderRequest(str);
            c0334ojitshcjhn.f18139zdlpuopuiu = this;
            c0334ojitshcjhn.f18136iwizpuwonk = 1;
            objLqeggnwhkg = lqeggnwhkgVar.lqeggnwhkg(modifyOrderRequest, c0334ojitshcjhn);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ojitshcjhnVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ojitshcjhnVar = (ojitshcjhn) c0334ojitshcjhn.f18139zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        return o40.eablkybsjg.gtknphoqwx((BasicResponse) objLqeggnwhkg, new rgvfuqvkyq(ojitshcjhnVar.f18108eablkybsjg), new vdvldrhtss(ojitshcjhnVar.f18110ppxfxbqfkf));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w10.dxjokdxxww
    public Object zoijcleaow(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f18128jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f18128jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objDxjokdxxww = iobyxmoadgVar.f18130zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f18128jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            ay.lqeggnwhkg lqeggnwhkgVar = this.f18109iobyxmoadg;
            CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(str, str2);
            iobyxmoadgVar.f18128jyumaefscl = 1;
            objDxjokdxxww = lqeggnwhkgVar.dxjokdxxww(cancelOrderRequest, iobyxmoadgVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        o40.eablkybsjg.btonecajqb((BasicResponse) objDxjokdxxww, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
