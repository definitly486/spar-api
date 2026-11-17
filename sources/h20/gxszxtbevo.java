package h20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.iobyxmoadg f39163zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39164iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f39165zoijcleaow;

        public iobyxmoadg(String shopId, String section) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(section, "section");
            this.f39164iobyxmoadg = shopId;
            this.f39165zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f39164iobyxmoadg, iobyxmoadgVar.f39164iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39165zoijcleaow, iobyxmoadgVar.f39165zoijcleaow);
        }

        public int hashCode() {
            return (this.f39164iobyxmoadg.hashCode() * 31) + this.f39165zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f39165zoijcleaow;
        }

        public String toString() {
            return "Params(shopId=" + this.f39164iobyxmoadg + ", section=" + this.f39165zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f39164iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(pkzmftpjix coroutineDispatcher, x10.iobyxmoadg bannerRemoteSource) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        zdlpuopuiu.btonecajqb(bannerRemoteSource, "bannerRemoteSource");
        this.f39163zoijcleaow = bannerRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f39163zoijcleaow.zoijcleaow(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
