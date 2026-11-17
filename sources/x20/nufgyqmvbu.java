package x20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import w10.wflxmlrfwp;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f121036zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f121037iobyxmoadg;

        public iobyxmoadg(String purchaseId) {
            zdlpuopuiu.btonecajqb(purchaseId, "purchaseId");
            this.f121037iobyxmoadg = purchaseId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121037iobyxmoadg, ((iobyxmoadg) obj).f121037iobyxmoadg);
        }

        public int hashCode() {
            return this.f121037iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f121037iobyxmoadg;
        }

        public String toString() {
            return "Params(purchaseId=" + this.f121037iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(wflxmlrfwp purchasesHistoryRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(purchasesHistoryRemoteSource, "purchasesHistoryRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121036zoijcleaow = purchasesHistoryRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f121036zoijcleaow.ppxfxbqfkf(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
