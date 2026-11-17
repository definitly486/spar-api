package c11;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class btonecajqb extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.dxjokdxxww f18481zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18482iobyxmoadg;

        public iobyxmoadg(String str) {
            this.f18482iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18482iobyxmoadg, ((iobyxmoadg) obj).f18482iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f18482iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18482iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f18482iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(k01.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18481zoijcleaow = orderRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        k01.dxjokdxxww dxjokdxxwwVar = this.f18481zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if (strIobyxmoadg == null) {
            strIobyxmoadg = "";
        }
        return dxjokdxxwwVar.wkgbmnqykc(strIobyxmoadg, gxszxtbevoVar);
    }
}
