package r01;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.iobyxmoadg f81388zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f81389iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f81390zoijcleaow;

        public iobyxmoadg(String shopId, String section) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            zdlpuopuiu.btonecajqb(section, "section");
            this.f81389iobyxmoadg = shopId;
            this.f81390zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f81389iobyxmoadg, iobyxmoadgVar.f81389iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81390zoijcleaow, iobyxmoadgVar.f81390zoijcleaow);
        }

        public int hashCode() {
            return (this.f81389iobyxmoadg.hashCode() * 31) + this.f81390zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f81390zoijcleaow;
        }

        public String toString() {
            return "Params(shopId=" + this.f81389iobyxmoadg + ", section=" + this.f81390zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f81389iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(pkzmftpjix coroutineDispatcher, l01.iobyxmoadg bannerRemoteSource) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        zdlpuopuiu.btonecajqb(bannerRemoteSource, "bannerRemoteSource");
        this.f81388zoijcleaow = bannerRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f81388zoijcleaow.zoijcleaow(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
