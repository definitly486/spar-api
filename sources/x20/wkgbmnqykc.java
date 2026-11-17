package x20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.dxjokdxxww f121040zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f121041iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f121041iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121041iobyxmoadg, ((iobyxmoadg) obj).f121041iobyxmoadg);
        }

        public int hashCode() {
            return this.f121041iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f121041iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f121041iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(w10.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121040zoijcleaow = orderRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f121040zoijcleaow.gxszxtbevo(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
