package n01;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.iobyxmoadg f68387zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68388iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f68389zoijcleaow;

        public iobyxmoadg(String bannerId, int i13) {
            zdlpuopuiu.btonecajqb(bannerId, "bannerId");
            this.f68388iobyxmoadg = bannerId;
            this.f68389zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f68388iobyxmoadg, iobyxmoadgVar.f68388iobyxmoadg) && this.f68389zoijcleaow == iobyxmoadgVar.f68389zoijcleaow;
        }

        public int hashCode() {
            return (this.f68388iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f68389zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f68388iobyxmoadg;
        }

        public String toString() {
            return "Params(bannerId=" + this.f68388iobyxmoadg + ", index=" + this.f68389zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f68389zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(l01.iobyxmoadg bannerRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(bannerRemoteSource, "bannerRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f68387zoijcleaow = bannerRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f68387zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
