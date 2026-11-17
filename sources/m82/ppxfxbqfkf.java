package m82;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l82.iobyxmoadg f66560zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f66561iobyxmoadg;

        public iobyxmoadg(String subscriptionId) {
            zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
            this.f66561iobyxmoadg = subscriptionId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66561iobyxmoadg, ((iobyxmoadg) obj).f66561iobyxmoadg);
        }

        public int hashCode() {
            return this.f66561iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f66561iobyxmoadg;
        }

        public String toString() {
            return "Params(subscriptionId=" + this.f66561iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(l82.iobyxmoadg remoteSource, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f66560zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f66560zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
