package so1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final do1.iobyxmoadg f107781zoijcleaow;

    /* JADX INFO: renamed from: so1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2650iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107782iobyxmoadg;

        public C2650iobyxmoadg(String article) {
            zdlpuopuiu.btonecajqb(article, "article");
            this.f107782iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2650iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f107782iobyxmoadg, ((C2650iobyxmoadg) obj).f107782iobyxmoadg);
        }

        public int hashCode() {
            return this.f107782iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f107782iobyxmoadg;
        }

        public String toString() {
            return "Params(article=" + this.f107782iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(do1.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f107781zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2650iobyxmoadg c2650iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f107781zoijcleaow.eablkybsjg(c2650iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
