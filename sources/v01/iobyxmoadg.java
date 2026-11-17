package v01;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cz0.iobyxmoadg f115052zoijcleaow;

    /* JADX INFO: renamed from: v01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC2862iobyxmoadg {

        /* JADX INFO: renamed from: v01.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2863iobyxmoadg implements InterfaceC2862iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f115053iobyxmoadg;

            public C2863iobyxmoadg(String addressId) {
                zdlpuopuiu.btonecajqb(addressId, "addressId");
                this.f115053iobyxmoadg = addressId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2863iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f115053iobyxmoadg, ((C2863iobyxmoadg) obj).f115053iobyxmoadg);
            }

            public int hashCode() {
                return this.f115053iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f115053iobyxmoadg;
            }

            public String toString() {
                return "WithAddress(addressId=" + this.f115053iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: v01.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC2862iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f115054iobyxmoadg;

            public zoijcleaow(String shopId) {
                zdlpuopuiu.btonecajqb(shopId, "shopId");
                this.f115054iobyxmoadg = shopId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f115054iobyxmoadg, ((zoijcleaow) obj).f115054iobyxmoadg);
            }

            public int hashCode() {
                return this.f115054iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f115054iobyxmoadg;
            }

            public String toString() {
                return "WithShop(shopId=" + this.f115054iobyxmoadg + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(pkzmftpjix coroutineDispatcher, cz0.iobyxmoadg cartInteractor) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        this.f115052zoijcleaow = cartInteractor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(InterfaceC2862iobyxmoadg interfaceC2862iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        if (interfaceC2862iobyxmoadg instanceof InterfaceC2862iobyxmoadg.C2863iobyxmoadg) {
            return this.f115052zoijcleaow.kcexrzcfyt(((InterfaceC2862iobyxmoadg.C2863iobyxmoadg) interfaceC2862iobyxmoadg).iobyxmoadg(), DeliveryCode.DELIVERY, gxszxtbevoVar);
        }
        if (interfaceC2862iobyxmoadg instanceof InterfaceC2862iobyxmoadg.zoijcleaow) {
            return this.f115052zoijcleaow.kcexrzcfyt(((InterfaceC2862iobyxmoadg.zoijcleaow) interfaceC2862iobyxmoadg).iobyxmoadg(), DeliveryCode.PICKUP, gxszxtbevoVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
