package xq1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zy0.iobyxmoadg f123081zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f123082iobyxmoadg;

        public iobyxmoadg(String uri) {
            zdlpuopuiu.btonecajqb(uri, "uri");
            this.f123082iobyxmoadg = uri;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f123082iobyxmoadg, ((iobyxmoadg) obj).f123082iobyxmoadg);
        }

        public int hashCode() {
            return this.f123082iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f123082iobyxmoadg;
        }

        public String toString() {
            return "Params(uri=" + this.f123082iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(zy0.iobyxmoadg fileUtil, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(fileUtil, "fileUtil");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f123081zoijcleaow = fileUtil;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f123081zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg());
    }
}
