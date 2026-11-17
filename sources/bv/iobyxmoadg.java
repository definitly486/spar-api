package bv;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final av.iobyxmoadg f17127zoijcleaow;

    /* JADX INFO: renamed from: bv.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0307iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserAddress.Delivery f17128iobyxmoadg;

        public C0307iobyxmoadg(UserAddress.Delivery address) {
            zdlpuopuiu.btonecajqb(address, "address");
            this.f17128iobyxmoadg = address;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0307iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f17128iobyxmoadg, ((C0307iobyxmoadg) obj).f17128iobyxmoadg);
        }

        public int hashCode() {
            return this.f17128iobyxmoadg.hashCode();
        }

        public final UserAddress.Delivery iobyxmoadg() {
            return this.f17128iobyxmoadg;
        }

        public String toString() {
            return "Params(address=" + this.f17128iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(av.iobyxmoadg addressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(addressRemoteSource, "addressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f17127zoijcleaow = addressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0307iobyxmoadg c0307iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f17127zoijcleaow.wkgbmnqykc(c0307iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
