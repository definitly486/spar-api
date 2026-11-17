package h20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final x10.ppxfxbqfkf f39150zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f39151eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f39152iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f39153ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f39154wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final DeliveryCode f39155zoijcleaow;

        public iobyxmoadg(String shopId, DeliveryCode deliveryCode, String str, int i13, String str2) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f39152iobyxmoadg = shopId;
            this.f39155zoijcleaow = deliveryCode;
            this.f39153ppxfxbqfkf = str;
            this.f39154wkgbmnqykc = i13;
            this.f39151eablkybsjg = str2;
        }

        public final String eablkybsjg() {
            return this.f39151eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f39152iobyxmoadg, iobyxmoadgVar.f39152iobyxmoadg) && this.f39155zoijcleaow == iobyxmoadgVar.f39155zoijcleaow && zdlpuopuiu.eablkybsjg(this.f39153ppxfxbqfkf, iobyxmoadgVar.f39153ppxfxbqfkf) && this.f39154wkgbmnqykc == iobyxmoadgVar.f39154wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f39151eablkybsjg, iobyxmoadgVar.f39151eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = this.f39152iobyxmoadg.hashCode() * 31;
            DeliveryCode deliveryCode = this.f39155zoijcleaow;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            String str = this.f39153ppxfxbqfkf;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f39154wkgbmnqykc)) * 31;
            String str2 = this.f39151eablkybsjg;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final DeliveryCode iobyxmoadg() {
            return this.f39155zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f39153ppxfxbqfkf;
        }

        public String toString() {
            return "Params(shopId=" + this.f39152iobyxmoadg + ", deliveryType=" + this.f39155zoijcleaow + ", selectedFilterId=" + this.f39153ppxfxbqfkf + ", page=" + this.f39154wkgbmnqykc + ", sort=" + this.f39151eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f39152iobyxmoadg;
        }

        public final int zoijcleaow() {
            return this.f39154wkgbmnqykc;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(x10.ppxfxbqfkf catalogRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(catalogRemoteSource, "catalogRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39150zoijcleaow = catalogRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f39150zoijcleaow.eablkybsjg(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.eablkybsjg(), gxszxtbevoVar);
    }
}
