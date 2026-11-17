package x20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.dxjokdxxww f121005zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f121006iobyxmoadg;

        public iobyxmoadg(String str) {
            this.f121006iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121006iobyxmoadg, ((iobyxmoadg) obj).f121006iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f121006iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f121006iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f121006iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(w10.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121005zoijcleaow = orderRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        w10.dxjokdxxww dxjokdxxwwVar = this.f121005zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if (strIobyxmoadg == null) {
            strIobyxmoadg = "";
        }
        return dxjokdxxwwVar.wkgbmnqykc(strIobyxmoadg, gxszxtbevoVar);
    }
}
