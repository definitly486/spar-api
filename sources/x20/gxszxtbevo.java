package x20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.dxjokdxxww f121030zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final c10.gxszxtbevo f121031iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f121032zoijcleaow;

        public iobyxmoadg(c10.gxszxtbevo ordersStatus, int i13) {
            zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
            this.f121031iobyxmoadg = ordersStatus;
            this.f121032zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f121031iobyxmoadg == iobyxmoadgVar.f121031iobyxmoadg && this.f121032zoijcleaow == iobyxmoadgVar.f121032zoijcleaow;
        }

        public int hashCode() {
            return (this.f121031iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f121032zoijcleaow);
        }

        public final c10.gxszxtbevo iobyxmoadg() {
            return this.f121031iobyxmoadg;
        }

        public String toString() {
            return "Params(ordersStatus=" + this.f121031iobyxmoadg + ", page=" + this.f121032zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f121032zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(w10.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121030zoijcleaow = orderRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f121030zoijcleaow.dxjokdxxww(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
