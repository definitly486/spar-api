package n11;

import k01.oxmwwwfdhm;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oxmwwwfdhm f68419zoijcleaow;

    /* JADX INFO: renamed from: n11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1473iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f68420iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f68421zoijcleaow;

        public C1473iobyxmoadg(double d13, double d14) {
            this.f68420iobyxmoadg = d13;
            this.f68421zoijcleaow = d14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1473iobyxmoadg)) {
                return false;
            }
            C1473iobyxmoadg c1473iobyxmoadg = (C1473iobyxmoadg) obj;
            return Double.compare(this.f68420iobyxmoadg, c1473iobyxmoadg.f68420iobyxmoadg) == 0 && Double.compare(this.f68421zoijcleaow, c1473iobyxmoadg.f68421zoijcleaow) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f68420iobyxmoadg) * 31) + Double.hashCode(this.f68421zoijcleaow);
        }

        public final double iobyxmoadg() {
            return this.f68420iobyxmoadg;
        }

        public String toString() {
            return "Params(lat=" + this.f68420iobyxmoadg + ", lon=" + this.f68421zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f68421zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(oxmwwwfdhm shopRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(shopRemoteSource, "shopRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f68419zoijcleaow = shopRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1473iobyxmoadg c1473iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f68419zoijcleaow.zoijcleaow(c1473iobyxmoadg.iobyxmoadg(), c1473iobyxmoadg.zoijcleaow(), gxszxtbevoVar);
    }
}
