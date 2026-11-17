package x20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.order.OrderPickupStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.dxjokdxxww f121007ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f121008zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f121009iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f121010ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final OrderPickupStatus f121011zoijcleaow;

        public iobyxmoadg(String orderId, OrderPickupStatus status, LocationData locationData) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(status, "status");
            this.f121009iobyxmoadg = orderId;
            this.f121011zoijcleaow = status;
            this.f121010ppxfxbqfkf = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f121009iobyxmoadg, iobyxmoadgVar.f121009iobyxmoadg) && this.f121011zoijcleaow == iobyxmoadgVar.f121011zoijcleaow && zdlpuopuiu.eablkybsjg(this.f121010ppxfxbqfkf, iobyxmoadgVar.f121010ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f121009iobyxmoadg.hashCode() * 31) + this.f121011zoijcleaow.hashCode()) * 31;
            LocationData locationData = this.f121010ppxfxbqfkf;
            return iHashCode + (locationData == null ? 0 : locationData.hashCode());
        }

        public final LocationData iobyxmoadg() {
            return this.f121010ppxfxbqfkf;
        }

        public final OrderPickupStatus ppxfxbqfkf() {
            return this.f121011zoijcleaow;
        }

        public String toString() {
            return "Params(orderId=" + this.f121009iobyxmoadg + ", status=" + this.f121011zoijcleaow + ", location=" + this.f121010ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f121009iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f121012cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f121014jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f121015yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f121016zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f121014jyumaefscl = obj;
            this.f121012cqumvgiudr |= Integer.MIN_VALUE;
            return draadjrbmk.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(w10.nufgyqmvbu orderLocalSource, w10.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121008zoijcleaow = orderLocalSource;
        this.f121007ppxfxbqfkf = orderRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        draadjrbmk draadjrbmkVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f121012cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f121012cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objGxszxtbevo = zoijcleaowVar.f121014jyumaefscl;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f121012cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f121015yggfygwlhe;
                draadjrbmkVar = (draadjrbmk) zoijcleaowVar.f121016zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        w10.dxjokdxxww dxjokdxxwwVar = this.f121007ppxfxbqfkf;
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        OrderPickupStatus orderPickupStatusPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        LocationData locationDataIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f121016zdlpuopuiu = this;
        zoijcleaowVar.f121015yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f121012cqumvgiudr = 1;
        if (dxjokdxxwwVar.btonecajqb(strZoijcleaow, orderPickupStatusPpxfxbqfkf, locationDataIobyxmoadg, zoijcleaowVar) == objGxszxtbevo2) {
            return objGxszxtbevo2;
        }
        draadjrbmkVar = this;
        w10.nufgyqmvbu nufgyqmvbuVar = draadjrbmkVar.f121008zoijcleaow;
        String strZoijcleaow2 = iobyxmoadgVar.zoijcleaow();
        OrderPickupStatus orderPickupStatusPpxfxbqfkf2 = iobyxmoadgVar.ppxfxbqfkf();
        zoijcleaowVar.f121016zdlpuopuiu = null;
        zoijcleaowVar.f121015yggfygwlhe = null;
        zoijcleaowVar.f121012cqumvgiudr = 2;
        objGxszxtbevo = nufgyqmvbuVar.gxszxtbevo(strZoijcleaow2, orderPickupStatusPpxfxbqfkf2, zoijcleaowVar);
        return objGxszxtbevo == objGxszxtbevo2 ? objGxszxtbevo2 : objGxszxtbevo;
    }
}
