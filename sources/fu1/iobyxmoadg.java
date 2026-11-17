package fu1;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eu1.iobyxmoadg f35160zoijcleaow;

    /* JADX INFO: renamed from: fu1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0781iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f35161iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f35162zoijcleaow;

        public C0781iobyxmoadg(Map changedParameters, String str) {
            zdlpuopuiu.btonecajqb(changedParameters, "changedParameters");
            this.f35161iobyxmoadg = changedParameters;
            this.f35162zoijcleaow = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0781iobyxmoadg)) {
                return false;
            }
            C0781iobyxmoadg c0781iobyxmoadg = (C0781iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f35161iobyxmoadg, c0781iobyxmoadg.f35161iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f35162zoijcleaow, c0781iobyxmoadg.f35162zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f35161iobyxmoadg.hashCode() * 31;
            String str = this.f35162zoijcleaow;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final Map iobyxmoadg() {
            return this.f35161iobyxmoadg;
        }

        public String toString() {
            return "Params(changedParameters=" + this.f35161iobyxmoadg + ", promoCodeValue=" + this.f35162zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f35162zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(eu1.iobyxmoadg remoteSource, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f35160zoijcleaow = remoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0781iobyxmoadg c0781iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f35160zoijcleaow.ppxfxbqfkf(c0781iobyxmoadg.iobyxmoadg(), c0781iobyxmoadg.zoijcleaow(), gxszxtbevoVar);
    }
}
