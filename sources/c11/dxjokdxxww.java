package c11;

import k01.wflxmlrfwp;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f18493zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Integer f18494iobyxmoadg;

        public iobyxmoadg(Integer num) {
            this.f18494iobyxmoadg = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18494iobyxmoadg, ((iobyxmoadg) obj).f18494iobyxmoadg);
        }

        public int hashCode() {
            Integer num = this.f18494iobyxmoadg;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final Integer iobyxmoadg() {
            return this.f18494iobyxmoadg;
        }

        public String toString() {
            return "Params(page=" + this.f18494iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(wflxmlrfwp purchasesHistoryRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(purchasesHistoryRemoteSource, "purchasesHistoryRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18493zoijcleaow = purchasesHistoryRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f18493zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
