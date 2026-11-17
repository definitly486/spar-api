package hi0;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fi0.iobyxmoadg f40445zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f40446iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ei0.zoijcleaow f40447zoijcleaow;

        public iobyxmoadg(String networkId, ei0.zoijcleaow type) {
            zdlpuopuiu.btonecajqb(networkId, "networkId");
            zdlpuopuiu.btonecajqb(type, "type");
            this.f40446iobyxmoadg = networkId;
            this.f40447zoijcleaow = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f40446iobyxmoadg, iobyxmoadgVar.f40446iobyxmoadg) && this.f40447zoijcleaow == iobyxmoadgVar.f40447zoijcleaow;
        }

        public int hashCode() {
            return (this.f40446iobyxmoadg.hashCode() * 31) + this.f40447zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f40446iobyxmoadg;
        }

        public String toString() {
            return "Params(networkId=" + this.f40446iobyxmoadg + ", type=" + this.f40447zoijcleaow + ")";
        }

        public final ei0.zoijcleaow zoijcleaow() {
            return this.f40447zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(fi0.iobyxmoadg networkItemsRepository, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.ppxfxbqfkf());
        zdlpuopuiu.btonecajqb(networkItemsRepository, "networkItemsRepository");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f40445zoijcleaow = networkItemsRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f40445zoijcleaow.eablkybsjg(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
