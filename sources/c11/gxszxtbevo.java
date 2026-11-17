package c11;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.dxjokdxxww f18506zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final sz0.eablkybsjg f18507iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f18508zoijcleaow;

        public iobyxmoadg(sz0.eablkybsjg ordersStatus, int i13) {
            zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
            this.f18507iobyxmoadg = ordersStatus;
            this.f18508zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f18507iobyxmoadg == iobyxmoadgVar.f18507iobyxmoadg && this.f18508zoijcleaow == iobyxmoadgVar.f18508zoijcleaow;
        }

        public int hashCode() {
            return (this.f18507iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f18508zoijcleaow);
        }

        public final sz0.eablkybsjg iobyxmoadg() {
            return this.f18507iobyxmoadg;
        }

        public String toString() {
            return "Params(ordersStatus=" + this.f18507iobyxmoadg + ", page=" + this.f18508zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f18508zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(k01.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18506zoijcleaow = orderRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f18506zoijcleaow.draadjrbmk(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
