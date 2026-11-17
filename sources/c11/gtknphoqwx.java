package c11;

import k01.wflxmlrfwp;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f18504zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18505iobyxmoadg;

        public iobyxmoadg(String purchaseId) {
            zdlpuopuiu.btonecajqb(purchaseId, "purchaseId");
            this.f18505iobyxmoadg = purchaseId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18505iobyxmoadg, ((iobyxmoadg) obj).f18505iobyxmoadg);
        }

        public int hashCode() {
            return this.f18505iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18505iobyxmoadg;
        }

        public String toString() {
            return "Params(purchaseId=" + this.f18505iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(wflxmlrfwp purchasesHistoryRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(purchasesHistoryRemoteSource, "purchasesHistoryRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18504zoijcleaow = purchasesHistoryRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f18504zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
