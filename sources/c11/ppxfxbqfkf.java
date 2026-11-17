package c11;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.btonecajqb f18514zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f18515iobyxmoadg;

        public iobyxmoadg(List rateVariants) {
            zdlpuopuiu.btonecajqb(rateVariants, "rateVariants");
            this.f18515iobyxmoadg = rateVariants;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18515iobyxmoadg, ((iobyxmoadg) obj).f18515iobyxmoadg);
        }

        public int hashCode() {
            return this.f18515iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f18515iobyxmoadg;
        }

        public String toString() {
            return "Params(rateVariants=" + this.f18515iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(k01.btonecajqb otherRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(otherRemoteSource, "otherRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18514zoijcleaow = otherRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f18514zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
