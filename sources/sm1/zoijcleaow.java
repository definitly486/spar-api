package sm1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rm1.iobyxmoadg f107714zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107715iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f107716zoijcleaow;

        public iobyxmoadg(String article, int i13) {
            zdlpuopuiu.btonecajqb(article, "article");
            this.f107715iobyxmoadg = article;
            this.f107716zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f107715iobyxmoadg, iobyxmoadgVar.f107715iobyxmoadg) && this.f107716zoijcleaow == iobyxmoadgVar.f107716zoijcleaow;
        }

        public int hashCode() {
            return (this.f107715iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f107716zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f107715iobyxmoadg;
        }

        public String toString() {
            return "Params(article=" + this.f107715iobyxmoadg + ", page=" + this.f107716zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f107716zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(rm1.iobyxmoadg reviewRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(reviewRemoteSource, "reviewRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f107714zoijcleaow = reviewRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f107714zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
