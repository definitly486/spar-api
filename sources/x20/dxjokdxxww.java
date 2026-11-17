package x20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import w10.wflxmlrfwp;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wflxmlrfwp f121017zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Integer f121018iobyxmoadg;

        public iobyxmoadg(Integer num) {
            this.f121018iobyxmoadg = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121018iobyxmoadg, ((iobyxmoadg) obj).f121018iobyxmoadg);
        }

        public int hashCode() {
            Integer num = this.f121018iobyxmoadg;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final Integer iobyxmoadg() {
            return this.f121018iobyxmoadg;
        }

        public String toString() {
            return "Params(page=" + this.f121018iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(wflxmlrfwp purchasesHistoryRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(purchasesHistoryRemoteSource, "purchasesHistoryRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121017zoijcleaow = purchasesHistoryRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f121017zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
