package xq1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final q11.iobyxmoadg f123073zoijcleaow;

    /* JADX INFO: renamed from: xq1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3106iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f123074iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f123075zoijcleaow;

        public C3106iobyxmoadg(LocationData centerPoint, double d13) {
            zdlpuopuiu.btonecajqb(centerPoint, "centerPoint");
            this.f123074iobyxmoadg = centerPoint;
            this.f123075zoijcleaow = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3106iobyxmoadg)) {
                return false;
            }
            C3106iobyxmoadg c3106iobyxmoadg = (C3106iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f123074iobyxmoadg, c3106iobyxmoadg.f123074iobyxmoadg) && Double.compare(this.f123075zoijcleaow, c3106iobyxmoadg.f123075zoijcleaow) == 0;
        }

        public int hashCode() {
            return (this.f123074iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f123075zoijcleaow);
        }

        public final LocationData iobyxmoadg() {
            return this.f123074iobyxmoadg;
        }

        public String toString() {
            return "Params(centerPoint=" + this.f123074iobyxmoadg + ", distanceInMeter=" + this.f123075zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f123075zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(q11.iobyxmoadg distanceUtils, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(distanceUtils, "distanceUtils");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f123073zoijcleaow = distanceUtils;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C3106iobyxmoadg c3106iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f123073zoijcleaow.zoijcleaow(c3106iobyxmoadg.iobyxmoadg(), c3106iobyxmoadg.zoijcleaow());
    }
}
