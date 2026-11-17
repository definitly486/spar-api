package u92;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final t92.iobyxmoadg f113026zoijcleaow;

    /* JADX INFO: renamed from: u92.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2801iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f113027iobyxmoadg;

        public C2801iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f113027iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2801iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f113027iobyxmoadg, ((C2801iobyxmoadg) obj).f113027iobyxmoadg);
        }

        public int hashCode() {
            return this.f113027iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f113027iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f113027iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(t92.iobyxmoadg tipsOrderRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(tipsOrderRepository, "tipsOrderRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f113026zoijcleaow = tipsOrderRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2801iobyxmoadg c2801iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f113026zoijcleaow.iobyxmoadg(c2801iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
