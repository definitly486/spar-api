package fu1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eu1.iobyxmoadg f35163zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35164iobyxmoadg;

        public iobyxmoadg(String subscriptionId) {
            zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
            this.f35164iobyxmoadg = subscriptionId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35164iobyxmoadg, ((iobyxmoadg) obj).f35164iobyxmoadg);
        }

        public int hashCode() {
            return this.f35164iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35164iobyxmoadg;
        }

        public String toString() {
            return "Params(subscriptionId=" + this.f35164iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(eu1.iobyxmoadg remoteSource, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f35163zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f35163zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
