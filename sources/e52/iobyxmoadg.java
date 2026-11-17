package e52;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k30.iobyxmoadg f30511zoijcleaow;

    /* JADX INFO: renamed from: e52.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0636iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f30512iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f30513zoijcleaow;

        public C0636iobyxmoadg(LocationData centerPoint, double d13) {
            zdlpuopuiu.btonecajqb(centerPoint, "centerPoint");
            this.f30512iobyxmoadg = centerPoint;
            this.f30513zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0636iobyxmoadg)) {
                return false;
            }
            C0636iobyxmoadg c0636iobyxmoadg = (C0636iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f30512iobyxmoadg, c0636iobyxmoadg.f30512iobyxmoadg) && Double.compare(this.f30513zoijcleaow, c0636iobyxmoadg.f30513zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f30512iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f30513zoijcleaow);
        }

        public final LocationData iobyxmoadg() {
            return this.f30512iobyxmoadg;
        }

        public String toString() {
            return "Params(centerPoint=" + this.f30512iobyxmoadg + ", distanceInMeter=" + this.f30513zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f30513zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k30.iobyxmoadg distanceUtils, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(distanceUtils, "distanceUtils");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f30511zoijcleaow = distanceUtils;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0636iobyxmoadg c0636iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f30511zoijcleaow.zoijcleaow(c0636iobyxmoadg.iobyxmoadg(), c0636iobyxmoadg.zoijcleaow());
    }
}
