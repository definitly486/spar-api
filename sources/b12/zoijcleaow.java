package b12;

import ft.ppxfxbqfkf;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final a12.iobyxmoadg f14962zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f14963iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f14964zoijcleaow;

        public iobyxmoadg(String article, int i13) {
            zdlpuopuiu.btonecajqb(article, "article");
            this.f14963iobyxmoadg = article;
            this.f14964zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f14963iobyxmoadg, iobyxmoadgVar.f14963iobyxmoadg) && this.f14964zoijcleaow == iobyxmoadgVar.f14964zoijcleaow;
        }

        public int hashCode() {
            return (this.f14963iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f14964zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f14963iobyxmoadg;
        }

        public String toString() {
            return "Params(article=" + this.f14963iobyxmoadg + ", page=" + this.f14964zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f14964zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(a12.iobyxmoadg reviewRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(reviewRemoteSource, "reviewRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f14962zoijcleaow = reviewRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f14962zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
