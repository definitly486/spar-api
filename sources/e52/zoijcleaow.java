package e52;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h00.iobyxmoadg f30519zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f30520iobyxmoadg;

        public iobyxmoadg(String uri) {
            zdlpuopuiu.btonecajqb(uri, "uri");
            this.f30520iobyxmoadg = uri;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30520iobyxmoadg, ((iobyxmoadg) obj).f30520iobyxmoadg);
        }

        public int hashCode() {
            return this.f30520iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f30520iobyxmoadg;
        }

        public String toString() {
            return "Params(uri=" + this.f30520iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(h00.iobyxmoadg fileUtil, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(fileUtil, "fileUtil");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f30519zoijcleaow = fileUtil;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f30519zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg());
    }
}
