package vt0;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.address.api.model.UserAddress;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ut0.iobyxmoadg f118020zoijcleaow;

    /* JADX INFO: renamed from: vt0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2927iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final UserAddress.Delivery f118021iobyxmoadg;

        public C2927iobyxmoadg(UserAddress.Delivery address) {
            zdlpuopuiu.btonecajqb(address, "address");
            this.f118021iobyxmoadg = address;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2927iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118021iobyxmoadg, ((C2927iobyxmoadg) obj).f118021iobyxmoadg);
        }

        public int hashCode() {
            return this.f118021iobyxmoadg.hashCode();
        }

        public final UserAddress.Delivery iobyxmoadg() {
            return this.f118021iobyxmoadg;
        }

        public String toString() {
            return "Params(address=" + this.f118021iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ut0.iobyxmoadg addressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(addressRemoteSource, "addressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118020zoijcleaow = addressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2927iobyxmoadg c2927iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f118020zoijcleaow.wkgbmnqykc(c2927iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
