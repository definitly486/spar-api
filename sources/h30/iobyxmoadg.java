package h30;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import w10.oxmwwwfdhm;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oxmwwwfdhm f39292zoijcleaow;

    /* JADX INFO: renamed from: h30.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0903iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f39293iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f39294zoijcleaow;

        public C0903iobyxmoadg(double d13, double d14) {
            this.f39293iobyxmoadg = d13;
            this.f39294zoijcleaow = d14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0903iobyxmoadg)) {
                return false;
            }
            C0903iobyxmoadg c0903iobyxmoadg = (C0903iobyxmoadg) obj;
            return Double.compare(this.f39293iobyxmoadg, c0903iobyxmoadg.f39293iobyxmoadg) == 0 && Double.compare(this.f39294zoijcleaow, c0903iobyxmoadg.f39294zoijcleaow) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f39293iobyxmoadg) * 31) + Double.hashCode(this.f39294zoijcleaow);
        }

        public final double iobyxmoadg() {
            return this.f39293iobyxmoadg;
        }

        public String toString() {
            return "Params(lat=" + this.f39293iobyxmoadg + ", lon=" + this.f39294zoijcleaow + ")";
        }

        public final double zoijcleaow() {
            return this.f39294zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(oxmwwwfdhm shopRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(shopRemoteSource, "shopRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39292zoijcleaow = shopRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0903iobyxmoadg c0903iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f39292zoijcleaow.zoijcleaow(c0903iobyxmoadg.iobyxmoadg(), c0903iobyxmoadg.zoijcleaow(), gxszxtbevoVar);
    }
}
