package ov1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nv1.iobyxmoadg f74804zoijcleaow;

    /* JADX INFO: renamed from: ov1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1628iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f74805iobyxmoadg;

        public C1628iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f74805iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1628iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74805iobyxmoadg, ((C1628iobyxmoadg) obj).f74805iobyxmoadg);
        }

        public int hashCode() {
            return this.f74805iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f74805iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f74805iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(nv1.iobyxmoadg tipsOrderRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(tipsOrderRepository, "tipsOrderRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74804zoijcleaow = tipsOrderRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1628iobyxmoadg c1628iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f74804zoijcleaow.iobyxmoadg(c1628iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
