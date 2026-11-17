package d20;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.iobyxmoadg f26834zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f26835iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f26836zoijcleaow;

        public iobyxmoadg(String bannerId, int i13) {
            zdlpuopuiu.btonecajqb(bannerId, "bannerId");
            this.f26835iobyxmoadg = bannerId;
            this.f26836zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f26835iobyxmoadg, iobyxmoadgVar.f26835iobyxmoadg) && this.f26836zoijcleaow == iobyxmoadgVar.f26836zoijcleaow;
        }

        public int hashCode() {
            return (this.f26835iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f26836zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f26835iobyxmoadg;
        }

        public String toString() {
            return "Params(bannerId=" + this.f26835iobyxmoadg + ", index=" + this.f26836zoijcleaow + ")";
        }

        public final int zoijcleaow() {
            return this.f26836zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(x10.iobyxmoadg bannerRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(bannerRemoteSource, "bannerRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f26834zoijcleaow = bannerRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f26834zoijcleaow.iobyxmoadg(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
