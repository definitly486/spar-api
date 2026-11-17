package c11;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus;

/* JADX INFO: loaded from: classes5.dex */
public final class draadjrbmk extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.dxjokdxxww f18483ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f18484zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18485iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f18486ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final OrderPickupStatus f18487zoijcleaow;

        public iobyxmoadg(String orderId, OrderPickupStatus status, LocationData locationData) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(status, "status");
            this.f18485iobyxmoadg = orderId;
            this.f18487zoijcleaow = status;
            this.f18486ppxfxbqfkf = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f18485iobyxmoadg, iobyxmoadgVar.f18485iobyxmoadg) && this.f18487zoijcleaow == iobyxmoadgVar.f18487zoijcleaow && zdlpuopuiu.eablkybsjg(this.f18486ppxfxbqfkf, iobyxmoadgVar.f18486ppxfxbqfkf);
        }

        public int hashCode() {
            int iHashCode = ((this.f18485iobyxmoadg.hashCode() * 31) + this.f18487zoijcleaow.hashCode()) * 31;
            LocationData locationData = this.f18486ppxfxbqfkf;
            return iHashCode + (locationData == null ? 0 : locationData.hashCode());
        }

        public final LocationData iobyxmoadg() {
            return this.f18486ppxfxbqfkf;
        }

        public final OrderPickupStatus ppxfxbqfkf() {
            return this.f18487zoijcleaow;
        }

        public String toString() {
            return "Params(orderId=" + this.f18485iobyxmoadg + ", status=" + this.f18487zoijcleaow + ", location=" + this.f18486ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f18485iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f18488cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f18490jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f18491yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18492zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18490jyumaefscl = obj;
            this.f18488cqumvgiudr |= Integer.MIN_VALUE;
            return draadjrbmk.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(k01.nufgyqmvbu orderLocalSource, k01.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18484zoijcleaow = orderLocalSource;
        this.f18483ppxfxbqfkf = orderRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        draadjrbmk draadjrbmkVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18488cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18488cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objGxszxtbevo = zoijcleaowVar.f18490jyumaefscl;
        Object objGxszxtbevo2 = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18488cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f18491yggfygwlhe;
                draadjrbmkVar = (draadjrbmk) zoijcleaowVar.f18492zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objGxszxtbevo);
        k01.dxjokdxxww dxjokdxxwwVar = this.f18483ppxfxbqfkf;
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        OrderPickupStatus orderPickupStatusPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        LocationData locationDataIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f18492zdlpuopuiu = this;
        zoijcleaowVar.f18491yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f18488cqumvgiudr = 1;
        if (dxjokdxxwwVar.dxjokdxxww(strZoijcleaow, orderPickupStatusPpxfxbqfkf, locationDataIobyxmoadg, zoijcleaowVar) == objGxszxtbevo2) {
            return objGxszxtbevo2;
        }
        draadjrbmkVar = this;
        k01.nufgyqmvbu nufgyqmvbuVar = draadjrbmkVar.f18484zoijcleaow;
        String strZoijcleaow2 = iobyxmoadgVar.zoijcleaow();
        OrderPickupStatus orderPickupStatusPpxfxbqfkf2 = iobyxmoadgVar.ppxfxbqfkf();
        zoijcleaowVar.f18492zdlpuopuiu = null;
        zoijcleaowVar.f18491yggfygwlhe = null;
        zoijcleaowVar.f18488cqumvgiudr = 2;
        objGxszxtbevo = nufgyqmvbuVar.gxszxtbevo(strZoijcleaow2, orderPickupStatusPpxfxbqfkf2, zoijcleaowVar);
        return objGxszxtbevo == objGxszxtbevo2 ? objGxszxtbevo2 : objGxszxtbevo;
    }
}
