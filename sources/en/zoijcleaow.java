package en;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f31590eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final en.iobyxmoadg f31591gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f31592iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f31593ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f31594wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f31595zoijcleaow;

        public iobyxmoadg(String addressId, boolean z13, boolean z14, String addressName, String deliveryAddress) {
            zdlpuopuiu.btonecajqb(addressId, "addressId");
            zdlpuopuiu.btonecajqb(addressName, "addressName");
            zdlpuopuiu.btonecajqb(deliveryAddress, "deliveryAddress");
            this.f31592iobyxmoadg = addressId;
            this.f31595zoijcleaow = z13;
            this.f31593ppxfxbqfkf = z14;
            this.f31594wkgbmnqykc = addressName;
            this.f31590eablkybsjg = deliveryAddress;
            this.f31591gxszxtbevo = en.iobyxmoadg.Address;
        }

        public boolean eablkybsjg() {
            return this.f31595zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f31592iobyxmoadg, iobyxmoadgVar.f31592iobyxmoadg) && this.f31595zoijcleaow == iobyxmoadgVar.f31595zoijcleaow && this.f31593ppxfxbqfkf == iobyxmoadgVar.f31593ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f31594wkgbmnqykc, iobyxmoadgVar.f31594wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f31590eablkybsjg, iobyxmoadgVar.f31590eablkybsjg);
        }

        public final boolean gxszxtbevo() {
            return this.f31593ppxfxbqfkf;
        }

        public int hashCode() {
            return (((((((this.f31592iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f31595zoijcleaow)) * 31) + Boolean.hashCode(this.f31593ppxfxbqfkf)) * 31) + this.f31594wkgbmnqykc.hashCode()) * 31) + this.f31590eablkybsjg.hashCode();
        }

        @Override // en.zoijcleaow
        public en.iobyxmoadg iobyxmoadg() {
            return this.f31591gxszxtbevo;
        }

        public final String ppxfxbqfkf() {
            return this.f31594wkgbmnqykc;
        }

        public String toString() {
            return "AddressInfoUIItem(addressId=" + this.f31592iobyxmoadg + ", isChecked=" + this.f31595zoijcleaow + ", isEnabled=" + this.f31593ppxfxbqfkf + ", addressName=" + this.f31594wkgbmnqykc + ", deliveryAddress=" + this.f31590eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f31590eablkybsjg;
        }

        @Override // en.zoijcleaow
        public String zoijcleaow() {
            return this.f31592iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: en.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0676zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f31596eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final en.iobyxmoadg f31597gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f31598iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f31599ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f31600wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f31601zoijcleaow;

        public C0676zoijcleaow(String addressId, boolean z13, boolean z14, String shopAddress, String additionalInfo) {
            zdlpuopuiu.btonecajqb(addressId, "addressId");
            zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
            zdlpuopuiu.btonecajqb(additionalInfo, "additionalInfo");
            this.f31598iobyxmoadg = addressId;
            this.f31601zoijcleaow = z13;
            this.f31599ppxfxbqfkf = z14;
            this.f31600wkgbmnqykc = shopAddress;
            this.f31596eablkybsjg = additionalInfo;
            this.f31597gxszxtbevo = en.iobyxmoadg.Shop;
        }

        public boolean eablkybsjg() {
            return this.f31601zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0676zoijcleaow)) {
                return false;
            }
            C0676zoijcleaow c0676zoijcleaow = (C0676zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f31598iobyxmoadg, c0676zoijcleaow.f31598iobyxmoadg) && this.f31601zoijcleaow == c0676zoijcleaow.f31601zoijcleaow && this.f31599ppxfxbqfkf == c0676zoijcleaow.f31599ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f31600wkgbmnqykc, c0676zoijcleaow.f31600wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f31596eablkybsjg, c0676zoijcleaow.f31596eablkybsjg);
        }

        public final boolean gxszxtbevo() {
            return this.f31599ppxfxbqfkf;
        }

        public int hashCode() {
            return (((((((this.f31598iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f31601zoijcleaow)) * 31) + Boolean.hashCode(this.f31599ppxfxbqfkf)) * 31) + this.f31600wkgbmnqykc.hashCode()) * 31) + this.f31596eablkybsjg.hashCode();
        }

        @Override // en.zoijcleaow
        public en.iobyxmoadg iobyxmoadg() {
            return this.f31597gxszxtbevo;
        }

        public final String ppxfxbqfkf() {
            return this.f31596eablkybsjg;
        }

        public String toString() {
            return "AddressShopItem(addressId=" + this.f31598iobyxmoadg + ", isChecked=" + this.f31601zoijcleaow + ", isEnabled=" + this.f31599ppxfxbqfkf + ", shopAddress=" + this.f31600wkgbmnqykc + ", additionalInfo=" + this.f31596eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f31600wkgbmnqykc;
        }

        @Override // en.zoijcleaow
        public String zoijcleaow() {
            return this.f31598iobyxmoadg;
        }
    }

    en.iobyxmoadg iobyxmoadg();

    String zoijcleaow();
}
