package x20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import w10.wflxmlrfwp;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f121028zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f121029iobyxmoadg;

        public iobyxmoadg(String purchaseId) {
            zdlpuopuiu.btonecajqb(purchaseId, "purchaseId");
            this.f121029iobyxmoadg = purchaseId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121029iobyxmoadg, ((iobyxmoadg) obj).f121029iobyxmoadg);
        }

        public int hashCode() {
            return this.f121029iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f121029iobyxmoadg;
        }

        public String toString() {
            return "Params(purchaseId=" + this.f121029iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(wflxmlrfwp purchasesHistoryRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(purchasesHistoryRemoteSource, "purchasesHistoryRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121028zoijcleaow = purchasesHistoryRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f121028zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
