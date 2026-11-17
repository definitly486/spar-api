package o20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class ojitshcjhn extends ft.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71666zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71667iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f71667iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71667iobyxmoadg, ((iobyxmoadg) obj).f71667iobyxmoadg);
        }

        public int hashCode() {
            return this.f71667iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71667iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71667iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojitshcjhn(w10.nufgyqmvbu orderLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71666zoijcleaow = orderLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.iobyxmoadg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(iobyxmoadg parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        return this.f71666zoijcleaow.eablkybsjg(parameters.iobyxmoadg());
    }
}
