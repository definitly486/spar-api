package n20;

import ft.ppxfxbqfkf;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k00.iobyxmoadg f68441zoijcleaow;

    /* JADX INFO: renamed from: n20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC1474iobyxmoadg {

        /* JADX INFO: renamed from: n20.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1475iobyxmoadg implements InterfaceC1474iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f68442iobyxmoadg;

            public C1475iobyxmoadg(String addressId) {
                zdlpuopuiu.btonecajqb(addressId, "addressId");
                this.f68442iobyxmoadg = addressId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1475iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f68442iobyxmoadg, ((C1475iobyxmoadg) obj).f68442iobyxmoadg);
            }

            public int hashCode() {
                return this.f68442iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f68442iobyxmoadg;
            }

            public String toString() {
                return "WithAddress(addressId=" + this.f68442iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: n20.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC1474iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f68443iobyxmoadg;

            public zoijcleaow(String shopId) {
                zdlpuopuiu.btonecajqb(shopId, "shopId");
                this.f68443iobyxmoadg = shopId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f68443iobyxmoadg, ((zoijcleaow) obj).f68443iobyxmoadg);
            }

            public int hashCode() {
                return this.f68443iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f68443iobyxmoadg;
            }

            public String toString() {
                return "WithShop(shopId=" + this.f68443iobyxmoadg + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(pkzmftpjix coroutineDispatcher, k00.iobyxmoadg cartInteractor) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        this.f68441zoijcleaow = cartInteractor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(InterfaceC1474iobyxmoadg interfaceC1474iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        if (interfaceC1474iobyxmoadg instanceof InterfaceC1474iobyxmoadg.C1475iobyxmoadg) {
            return this.f68441zoijcleaow.jyumaefscl(((InterfaceC1474iobyxmoadg.C1475iobyxmoadg) interfaceC1474iobyxmoadg).iobyxmoadg(), DeliveryCode.DELIVERY, gxszxtbevoVar);
        }
        if (interfaceC1474iobyxmoadg instanceof InterfaceC1474iobyxmoadg.zoijcleaow) {
            return this.f68441zoijcleaow.jyumaefscl(((InterfaceC1474iobyxmoadg.zoijcleaow) interfaceC1474iobyxmoadg).iobyxmoadg(), DeliveryCode.PICKUP, gxszxtbevoVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
