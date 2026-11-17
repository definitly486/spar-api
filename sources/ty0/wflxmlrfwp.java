package ty0;

import gg.wwaezpbzkn;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ky0.ChangeOrderInfoDto;
import ky0.OrderDetailsDto;
import ky0.OrderEditResultDto;
import ky0.OrdersDto;
import px0.CancelOrderRequest;
import px0.GetOrdersRequest;
import px0.ModifyOrderRequest;
import px0.OrderDetailsRequest;
import px0.RateOrderRequest;
import px0.UpdatePickupStatusRequest;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import ru.myspar.proloyalty.core.network.model.WarningDto;
import tz0.OrderChangeProductsRequest;
import vx0.OrderEditRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class wflxmlrfwp implements k01.dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ex0.zoijcleaow f112053eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ww0.gxszxtbevo f112054iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final nx0.zoijcleaow f112055ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ex0.iobyxmoadg f112056wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lx0.nufgyqmvbu f112057zoijcleaow;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112058jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112060zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112060zdlpuopuiu = obj;
            this.f112058jyumaefscl |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.eablkybsjg(null, 0, null, this);
        }
    }

    /* synthetic */ class btonecajqb extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        btonecajqb(Object obj) {
            super(1, obj, nx0.zoijcleaow.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.zoijcleaow) this.receiver).zoijcleaow(p13);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112061jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112063zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112063zdlpuopuiu = obj;
            this.f112061jyumaefscl |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.gxszxtbevo(null, this);
        }
    }

    /* synthetic */ class dxjokdxxww extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        dxjokdxxww(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f112064cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f112066jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112067yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112068zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112066jyumaefscl = obj;
            this.f112064cqumvgiudr |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.btonecajqb(null, null, null, false, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112069iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112071yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112072zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112071yggfygwlhe = obj;
            this.f112069iwizpuwonk |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.iobyxmoadg(null, this);
        }
    }

    /* synthetic */ class gxszxtbevo extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        gxszxtbevo(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112073jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112075zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112075zdlpuopuiu = obj;
            this.f112073jyumaefscl |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.zoijcleaow(null, null, this);
        }
    }

    /* synthetic */ class kcexrzcfyt extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        kcexrzcfyt(Object obj) {
            super(1, obj, ex0.zoijcleaow.class, "map", "map(Lru/myspar/proloyalty/core/network/model/ErrorResponse;)Ljava/lang/Exception;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Exception invoke(ErrorResponse p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((ex0.zoijcleaow) this.receiver).iobyxmoadg(p13);
        }
    }

    /* synthetic */ class lqeggnwhkg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        lqeggnwhkg(Object obj) {
            super(1, obj, nx0.zoijcleaow.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.zoijcleaow) this.receiver).zoijcleaow(p13);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f112076cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f112078jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112079yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112080zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112078jyumaefscl = obj;
            this.f112076cqumvgiudr |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.nufgyqmvbu(null, null, null, null, this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112081iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112083yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112084zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112083yggfygwlhe = obj;
            this.f112081iwizpuwonk |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.wkgbmnqykc(null, this);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112085iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112087yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112088zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112087yggfygwlhe = obj;
            this.f112085iwizpuwonk |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.wflxmlrfwp(null, null, null, this);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        ppxfxbqfkf(Object obj) {
            super(2, obj, lx0.nufgyqmvbu.class, "map", "map(Lru/myspar/proloyalty/core/data/response/order/ChangeOrderInfoDto;Ljava/util/List;)Lru/myspar/proloyalty/core/domain/models/order/change_products/ChangeOrderProductsResult;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final tz0.iobyxmoadg invoke(ChangeOrderInfoDto p13, List p14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p14, "p1");
            return ((lx0.nufgyqmvbu) this.receiver).eablkybsjg(p13, p14);
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
            super(1, obj, nx0.zoijcleaow.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.zoijcleaow) this.receiver).zoijcleaow(p13);
        }
    }

    /* JADX INFO: renamed from: ty0.wflxmlrfwp$wflxmlrfwp, reason: collision with other inner class name */
    static final class C2756wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f112089cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f112091jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f112092yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112093zdlpuopuiu;

        C2756wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112091jyumaefscl = obj;
            this.f112089cqumvgiudr |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.draadjrbmk(null, 0, this);
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

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f112094jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f112096zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112096zdlpuopuiu = obj;
            this.f112094jyumaefscl |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.dxjokdxxww(null, null, null, this);
        }
    }

    /* synthetic */ class zdlpuopuiu extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        zdlpuopuiu(Object obj) {
            super(1, obj, nx0.zoijcleaow.class, "select", "select(Ljava/util/List;)Lru/myspar/proloyalty/core/network/model/WarningDto;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final WarningDto invoke(List p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return ((nx0.zoijcleaow) this.receiver).zoijcleaow(p13);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112097iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112099yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112100zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112099yggfygwlhe = obj;
            this.f112097iwizpuwonk |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.ppxfxbqfkf(null, null, this);
        }
    }

    public wflxmlrfwp(ww0.gxszxtbevo orderApiService, lx0.nufgyqmvbu orderResponseMapper, nx0.zoijcleaow orderEditWarningSelector, ex0.iobyxmoadg orderEditRequestProductListFactory, ex0.zoijcleaow responseErrorFactory) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderApiService, "orderApiService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderResponseMapper, "orderResponseMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditWarningSelector, "orderEditWarningSelector");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditRequestProductListFactory, "orderEditRequestProductListFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(responseErrorFactory, "responseErrorFactory");
        this.f112054iobyxmoadg = orderApiService;
        this.f112057zoijcleaow = orderResponseMapper;
        this.f112055ppxfxbqfkf = orderEditWarningSelector;
        this.f112056wkgbmnqykc = orderEditRequestProductListFactory;
        this.f112053eablkybsjg = responseErrorFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uz0.iobyxmoadg oxmwwwfdhm(wflxmlrfwp wflxmlrfwpVar, String str, OrderEditResultDto orderEditDto, Warning warning) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditDto, "orderEditDto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(warning, "warning");
        return wflxmlrfwpVar.f112057zoijcleaow.gxszxtbevo(str, orderEditDto, warning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uz0.iobyxmoadg rgvfuqvkyq(wflxmlrfwp wflxmlrfwpVar, String str, OrderEditResultDto orderEditResultDto, Warning warning) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderEditResultDto, "orderEditResultDto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(warning, "warning");
        return wflxmlrfwpVar.f112057zoijcleaow.gxszxtbevo(str, orderEditResultDto, warning);
    }

    private final String vdvldrhtss(LocationData locationData) {
        if (locationData == null) {
            return null;
        }
        return locationData.getLatitude() + StringUtils.COMMA + locationData.getLongitude();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object btonecajqb(final String str, uz0.iobyxmoadg iobyxmoadgVar, List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        final wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f112064cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f112064cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objDxjokdxxww = eablkybsjgVar.f112066jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f112064cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            ex0.iobyxmoadg iobyxmoadgVar2 = this.f112056wkgbmnqykc;
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(lx0.ppxfxbqfkf.iobyxmoadg((uz0.gxszxtbevo) it.next()));
            }
            OrderEditRequest orderEditRequestPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(str, iobyxmoadgVar, arrayList, uz0.zoijcleaow.CONTINUE, z13);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            eablkybsjgVar.f112068zdlpuopuiu = this;
            eablkybsjgVar.f112067yggfygwlhe = str;
            eablkybsjgVar.f112064cqumvgiudr = 1;
            objDxjokdxxww = gxszxtbevoVar2.dxjokdxxww(orderEditRequestPpxfxbqfkf, eablkybsjgVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wflxmlrfwpVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) eablkybsjgVar.f112067yggfygwlhe;
            wflxmlrfwpVar = (wflxmlrfwp) eablkybsjgVar.f112068zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return x21.wkgbmnqykc.kcexrzcfyt((BasicResponse) objDxjokdxxww, new tg.rgvfuqvkyq() { // from class: ty0.draadjrbmk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wflxmlrfwp.rgvfuqvkyq(this.f111872zdlpuopuiu, str, (OrderEditResultDto) obj, (Warning) obj2);
            }
        }, new gxszxtbevo(wflxmlrfwpVar.f112053eablkybsjg), new lqeggnwhkg(wflxmlrfwpVar.f112055ppxfxbqfkf));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object draadjrbmk(sz0.eablkybsjg eablkybsjgVar, int i13, lg.gxszxtbevo gxszxtbevoVar) {
        C2756wflxmlrfwp c2756wflxmlrfwp;
        wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar instanceof C2756wflxmlrfwp) {
            c2756wflxmlrfwp = (C2756wflxmlrfwp) gxszxtbevoVar;
            int i14 = c2756wflxmlrfwp.f112089cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2756wflxmlrfwp.f112089cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                c2756wflxmlrfwp = new C2756wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            c2756wflxmlrfwp = new C2756wflxmlrfwp(gxszxtbevoVar);
        }
        Object objZoijcleaow = c2756wflxmlrfwp.f112091jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = c2756wflxmlrfwp.f112089cqumvgiudr;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            GetOrdersRequest getOrdersRequest = new GetOrdersRequest(eablkybsjgVar.wkgbmnqykc(), i13);
            c2756wflxmlrfwp.f112093zdlpuopuiu = this;
            c2756wflxmlrfwp.f112092yggfygwlhe = eablkybsjgVar;
            c2756wflxmlrfwp.f112089cqumvgiudr = 1;
            objZoijcleaow = gxszxtbevoVar2.zoijcleaow(getOrdersRequest, c2756wflxmlrfwp);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wflxmlrfwpVar = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eablkybsjgVar = (sz0.eablkybsjg) c2756wflxmlrfwp.f112092yggfygwlhe;
            wflxmlrfwpVar = (wflxmlrfwp) c2756wflxmlrfwp.f112093zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return wflxmlrfwpVar.f112057zoijcleaow.wkgbmnqykc((OrdersDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objZoijcleaow, null, 1, null), eablkybsjgVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object dxjokdxxww(String str, OrderPickupStatus orderPickupStatus, LocationData locationData, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        yggfygwlhe yggfygwlheVar;
        if (gxszxtbevoVar instanceof yggfygwlhe) {
            yggfygwlheVar = (yggfygwlhe) gxszxtbevoVar;
            int i13 = yggfygwlheVar.f112094jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                yggfygwlheVar.f112094jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                yggfygwlheVar = new yggfygwlhe(gxszxtbevoVar);
            }
        } else {
            yggfygwlheVar = new yggfygwlhe(gxszxtbevoVar);
        }
        Object objGtknphoqwx = yggfygwlheVar.f112096zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = yggfygwlheVar.f112094jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            UpdatePickupStatusRequest updatePickupStatusRequest = new UpdatePickupStatusRequest(str, orderPickupStatus.getStatus(), vdvldrhtss(locationData));
            yggfygwlheVar.f112094jyumaefscl = 1;
            objGtknphoqwx = gxszxtbevoVar2.gtknphoqwx(updatePickupStatusRequest, yggfygwlheVar);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objGtknphoqwx, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object eablkybsjg(String str, int i13, String str2, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        agtfadlqog agtfadlqogVar;
        if (gxszxtbevoVar instanceof agtfadlqog) {
            agtfadlqogVar = (agtfadlqog) gxszxtbevoVar;
            int i14 = agtfadlqogVar.f112058jyumaefscl;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                agtfadlqogVar.f112058jyumaefscl = i14 - Integer.MIN_VALUE;
            } else {
                agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            }
        } else {
            agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
        }
        Object objEablkybsjg = agtfadlqogVar.f112060zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = agtfadlqogVar.f112058jyumaefscl;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            RateOrderRequest rateOrderRequest = new RateOrderRequest(str, i13, str2);
            agtfadlqogVar.f112058jyumaefscl = 1;
            objEablkybsjg = gxszxtbevoVar2.eablkybsjg(rateOrderRequest, agtfadlqogVar);
            if (objEablkybsjg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objEablkybsjg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object gxszxtbevo(String str, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f112061jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f112061jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object objGxszxtbevo = draadjrbmkVar.f112063zdlpuopuiu;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f112061jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            OrderDetailsRequest orderDetailsRequest = new OrderDetailsRequest(str);
            draadjrbmkVar.f112061jyumaefscl = 1;
            objGxszxtbevo = gxszxtbevoVar2.gxszxtbevo(orderDetailsRequest, draadjrbmkVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return lx0.lqeggnwhkg.iobyxmoadg(((OrderDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objGxszxtbevo, null, 1, null)).getReference());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object iobyxmoadg(String str, lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f112069iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f112069iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objGxszxtbevo = gtknphoqwxVar.f112071yggfygwlhe;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f112069iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            OrderDetailsRequest orderDetailsRequest = new OrderDetailsRequest(str);
            gtknphoqwxVar.f112072zdlpuopuiu = this;
            gtknphoqwxVar.f112069iwizpuwonk = 1;
            objGxszxtbevo = gxszxtbevoVar2.gxszxtbevo(orderDetailsRequest, gtknphoqwxVar);
            if (objGxszxtbevo == objGxszxtbevo2) {
                return objGxszxtbevo2;
            }
            wflxmlrfwpVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wflxmlrfwpVar = (wflxmlrfwp) gtknphoqwxVar.f112072zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        }
        return wflxmlrfwpVar.f112057zoijcleaow.iobyxmoadg((OrderDetailsDto) x21.wkgbmnqykc.oxmwwwfdhm((BasicResponse) objGxszxtbevo, null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object nufgyqmvbu(final String str, uz0.iobyxmoadg iobyxmoadgVar, uz0.gxszxtbevo gxszxtbevoVar, uz0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar2) {
        nufgyqmvbu nufgyqmvbuVar;
        final wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar2 instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar2;
            int i13 = nufgyqmvbuVar.f112076cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f112076cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar2);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar2);
        }
        Object objDxjokdxxww = nufgyqmvbuVar.f112078jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f112076cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            OrderEditRequest orderEditRequestZoijcleaow = lx0.iobyxmoadg.zoijcleaow(iobyxmoadgVar, str, gxszxtbevoVar != null ? lx0.ppxfxbqfkf.iobyxmoadg(gxszxtbevoVar) : null, zoijcleaowVar);
            ww0.gxszxtbevo gxszxtbevoVar3 = this.f112054iobyxmoadg;
            nufgyqmvbuVar.f112080zdlpuopuiu = this;
            nufgyqmvbuVar.f112079yggfygwlhe = str;
            nufgyqmvbuVar.f112076cqumvgiudr = 1;
            objDxjokdxxww = gxszxtbevoVar3.dxjokdxxww(orderEditRequestZoijcleaow, nufgyqmvbuVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wflxmlrfwpVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) nufgyqmvbuVar.f112079yggfygwlhe;
            wflxmlrfwpVar = (wflxmlrfwp) nufgyqmvbuVar.f112080zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
        }
        return x21.wkgbmnqykc.kcexrzcfyt((BasicResponse) objDxjokdxxww, new tg.rgvfuqvkyq() { // from class: ty0.gtknphoqwx
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wflxmlrfwp.oxmwwwfdhm(this.f111943zdlpuopuiu, str, (OrderEditResultDto) obj, (Warning) obj2);
            }
        }, new dxjokdxxww(wflxmlrfwpVar.f112053eablkybsjg), new btonecajqb(wflxmlrfwpVar.f112055ppxfxbqfkf));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object ppxfxbqfkf(String str, List list, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112097iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112097iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f112099yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112097iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(dz0.draadjrbmk.zoijcleaow((ProductData) it.next()));
            }
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            OrderChangeProductsRequest orderChangeProductsRequest = new OrderChangeProductsRequest(str, arrayList);
            zoijcleaowVar.f112100zdlpuopuiu = this;
            zoijcleaowVar.f112097iwizpuwonk = 1;
            objWkgbmnqykc = gxszxtbevoVar2.wkgbmnqykc(orderChangeProductsRequest, zoijcleaowVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wflxmlrfwpVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wflxmlrfwpVar = (wflxmlrfwp) zoijcleaowVar.f112100zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        }
        return x21.wkgbmnqykc.yggfygwlhe((BasicResponse) objWkgbmnqykc, new ppxfxbqfkf(wflxmlrfwpVar.f112057zoijcleaow), new wkgbmnqykc(wflxmlrfwpVar.f112053eablkybsjg));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object wflxmlrfwp(String str, uz0.iobyxmoadg iobyxmoadgVar, uz0.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        oxmwwwfdhm oxmwwwfdhmVar;
        wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar instanceof oxmwwwfdhm) {
            oxmwwwfdhmVar = (oxmwwwfdhm) gxszxtbevoVar;
            int i13 = oxmwwwfdhmVar.f112085iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                oxmwwwfdhmVar.f112085iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
            }
        } else {
            oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar);
        }
        Object objBtonecajqb = oxmwwwfdhmVar.f112087yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = oxmwwwfdhmVar.f112085iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objBtonecajqb);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            OrderEditRequest orderEditRequestZoijcleaow = lx0.iobyxmoadg.zoijcleaow(iobyxmoadgVar, str, null, zoijcleaowVar);
            oxmwwwfdhmVar.f112088zdlpuopuiu = this;
            oxmwwwfdhmVar.f112085iwizpuwonk = 1;
            objBtonecajqb = gxszxtbevoVar2.btonecajqb(orderEditRequestZoijcleaow, oxmwwwfdhmVar);
            if (objBtonecajqb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wflxmlrfwpVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wflxmlrfwpVar = (wflxmlrfwp) oxmwwwfdhmVar.f112088zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objBtonecajqb);
        }
        return x21.wkgbmnqykc.ojitshcjhn((BasicResponse) objBtonecajqb, new kcexrzcfyt(wflxmlrfwpVar.f112053eablkybsjg), new zdlpuopuiu(wflxmlrfwpVar.f112055ppxfxbqfkf));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object wkgbmnqykc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ojitshcjhn ojitshcjhnVar;
        wflxmlrfwp wflxmlrfwpVar;
        if (gxszxtbevoVar instanceof ojitshcjhn) {
            ojitshcjhnVar = (ojitshcjhn) gxszxtbevoVar;
            int i13 = ojitshcjhnVar.f112081iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ojitshcjhnVar.f112081iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
            }
        } else {
            ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ojitshcjhnVar.f112083yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ojitshcjhnVar.f112081iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            ModifyOrderRequest modifyOrderRequest = new ModifyOrderRequest(str);
            ojitshcjhnVar.f112084zdlpuopuiu = this;
            ojitshcjhnVar.f112081iwizpuwonk = 1;
            objPpxfxbqfkf = gxszxtbevoVar2.ppxfxbqfkf(modifyOrderRequest, ojitshcjhnVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wflxmlrfwpVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wflxmlrfwpVar = (wflxmlrfwp) ojitshcjhnVar.f112084zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return x21.wkgbmnqykc.ojitshcjhn((BasicResponse) objPpxfxbqfkf, new rgvfuqvkyq(wflxmlrfwpVar.f112053eablkybsjg), new vdvldrhtss(wflxmlrfwpVar.f112055ppxfxbqfkf));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k01.dxjokdxxww
    public Object zoijcleaow(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f112073jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f112073jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f112075zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f112073jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            ww0.gxszxtbevo gxszxtbevoVar2 = this.f112054iobyxmoadg;
            CancelOrderRequest cancelOrderRequest = new CancelOrderRequest(str, str2);
            iobyxmoadgVar.f112073jyumaefscl = 1;
            objIobyxmoadg = gxszxtbevoVar2.iobyxmoadg(cancelOrderRequest, iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        x21.wkgbmnqykc.agtfadlqog((BasicResponse) objIobyxmoadg, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
