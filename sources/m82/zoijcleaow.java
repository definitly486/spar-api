package m82;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l82.iobyxmoadg f66562zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f66563iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f66564zoijcleaow;

        public iobyxmoadg(Map changedParameters, String str) {
            zdlpuopuiu.btonecajqb(changedParameters, "changedParameters");
            this.f66563iobyxmoadg = changedParameters;
            this.f66564zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f66563iobyxmoadg, iobyxmoadgVar.f66563iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66564zoijcleaow, iobyxmoadgVar.f66564zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f66563iobyxmoadg.hashCode() * 31;
            String str = this.f66564zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final Map iobyxmoadg() {
            return this.f66563iobyxmoadg;
        }

        public String toString() {
            return "Params(changedParameters=" + this.f66563iobyxmoadg + ", promoCodeValue=" + this.f66564zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f66564zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(l82.iobyxmoadg remoteSource, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f66562zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f66562zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
