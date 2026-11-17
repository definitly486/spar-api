package q20;

import ft.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h00.iobyxmoadg f77782zoijcleaow;

    /* JADX INFO: renamed from: q20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1737iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f77783iobyxmoadg;

        public C1737iobyxmoadg(String uri) {
            zdlpuopuiu.btonecajqb(uri, "uri");
            this.f77783iobyxmoadg = uri;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1737iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f77783iobyxmoadg, ((C1737iobyxmoadg) obj).f77783iobyxmoadg);
        }

        public int hashCode() {
            return this.f77783iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f77783iobyxmoadg;
        }

        public String toString() {
            return "Params(uri=" + this.f77783iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(h00.iobyxmoadg fileUtil, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(fileUtil, "fileUtil");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f77782zoijcleaow = fileUtil;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1737iobyxmoadg c1737iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f77782zoijcleaow.wkgbmnqykc(c1737iobyxmoadg.iobyxmoadg());
    }
}
