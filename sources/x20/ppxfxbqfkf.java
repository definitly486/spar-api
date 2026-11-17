package x20;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.btonecajqb f121038zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f121039iobyxmoadg;

        public iobyxmoadg(List rateVariants) {
            zdlpuopuiu.btonecajqb(rateVariants, "rateVariants");
            this.f121039iobyxmoadg = rateVariants;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121039iobyxmoadg, ((iobyxmoadg) obj).f121039iobyxmoadg);
        }

        public int hashCode() {
            return this.f121039iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f121039iobyxmoadg;
        }

        public String toString() {
            return "Params(rateVariants=" + this.f121039iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(w10.btonecajqb otherRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(otherRemoteSource, "otherRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f121038zoijcleaow = otherRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f121038zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
