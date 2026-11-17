package r01;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l01.ppxfxbqfkf f81374zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f81375eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f81376iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f81377ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f81378wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f81379zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode, String str, int i13, String str2) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f81376iobyxmoadg = shopId;
            this.f81379zoijcleaow = deliveryCode;
            this.f81377ppxfxbqfkf = str;
            this.f81378wkgbmnqykc = i13;
            this.f81375eablkybsjg = str2;
        }

        public final String eablkybsjg() {
            return this.f81375eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f81376iobyxmoadg, iobyxmoadgVar.f81376iobyxmoadg) && this.f81379zoijcleaow == iobyxmoadgVar.f81379zoijcleaow && zdlpuopuiu.eablkybsjg(this.f81377ppxfxbqfkf, iobyxmoadgVar.f81377ppxfxbqfkf) && this.f81378wkgbmnqykc == iobyxmoadgVar.f81378wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f81375eablkybsjg, iobyxmoadgVar.f81375eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = this.f81376iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f81379zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            String str = this.f81377ppxfxbqfkf;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f81378wkgbmnqykc)) * 31;
            String str2 = this.f81375eablkybsjg;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f81379zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f81377ppxfxbqfkf;
        }

        public String toString() {
            return "Params(shopId=" + this.f81376iobyxmoadg + ", deliveryType=" + this.f81379zoijcleaow + ", selectedFilterId=" + this.f81377ppxfxbqfkf + ", page=" + this.f81378wkgbmnqykc + ", sort=" + this.f81375eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f81376iobyxmoadg;
        }

        public final int zoijcleaow() {
            return this.f81378wkgbmnqykc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(l01.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f81374zoijcleaow = catalogRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f81374zoijcleaow.dxjokdxxww(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.eablkybsjg(), gxszxtbevoVar);
    }
}
