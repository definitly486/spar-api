package pl0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f76921eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final pl0.iobyxmoadg f76922gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f76923iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f76924ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f76925wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f76926zoijcleaow;

        public iobyxmoadg(String addressId, boolean z13, boolean z14, String addressName, String deliveryAddress) {
            zdlpuopuiu.btonecajqb(addressId, "addressId");
            zdlpuopuiu.btonecajqb(addressName, "addressName");
            zdlpuopuiu.btonecajqb(deliveryAddress, "deliveryAddress");
            this.f76923iobyxmoadg = addressId;
            this.f76926zoijcleaow = z13;
            this.f76924ppxfxbqfkf = z14;
            this.f76925wkgbmnqykc = addressName;
            this.f76921eablkybsjg = deliveryAddress;
            this.f76922gxszxtbevo = pl0.iobyxmoadg.Address;
        }

        public boolean eablkybsjg() {
            return this.f76926zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f76923iobyxmoadg, iobyxmoadgVar.f76923iobyxmoadg) && this.f76926zoijcleaow == iobyxmoadgVar.f76926zoijcleaow && this.f76924ppxfxbqfkf == iobyxmoadgVar.f76924ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f76925wkgbmnqykc, iobyxmoadgVar.f76925wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f76921eablkybsjg, iobyxmoadgVar.f76921eablkybsjg);
        }

        public final boolean gxszxtbevo() {
            return this.f76924ppxfxbqfkf;
        }

        public int hashCode() {
            return (((((((this.f76923iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f76926zoijcleaow)) * 31) + Boolean.hashCode(this.f76924ppxfxbqfkf)) * 31) + this.f76925wkgbmnqykc.hashCode()) * 31) + this.f76921eablkybsjg.hashCode();
        }

        @Override // pl0.zoijcleaow
        public pl0.iobyxmoadg iobyxmoadg() {
            return this.f76922gxszxtbevo;
        }

        public final String ppxfxbqfkf() {
            return this.f76925wkgbmnqykc;
        }

        public String toString() {
            return "AddressInfoUIItem(addressId=" + this.f76923iobyxmoadg + ", isChecked=" + this.f76926zoijcleaow + ", isEnabled=" + this.f76924ppxfxbqfkf + ", addressName=" + this.f76925wkgbmnqykc + ", deliveryAddress=" + this.f76921eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f76921eablkybsjg;
        }

        @Override // pl0.zoijcleaow
        public String zoijcleaow() {
            return this.f76923iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: pl0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1702zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f76927eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final pl0.iobyxmoadg f76928gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f76929iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f76930ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f76931wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f76932zoijcleaow;

        public C1702zoijcleaow(String addressId, boolean z13, boolean z14, String shopAddress, String additionalInfo) {
            zdlpuopuiu.btonecajqb(addressId, "addressId");
            zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
            zdlpuopuiu.btonecajqb(additionalInfo, "additionalInfo");
            this.f76929iobyxmoadg = addressId;
            this.f76932zoijcleaow = z13;
            this.f76930ppxfxbqfkf = z14;
            this.f76931wkgbmnqykc = shopAddress;
            this.f76927eablkybsjg = additionalInfo;
            this.f76928gxszxtbevo = pl0.iobyxmoadg.Shop;
        }

        public boolean eablkybsjg() {
            return this.f76932zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1702zoijcleaow)) {
                return false;
            }
            C1702zoijcleaow c1702zoijcleaow = (C1702zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f76929iobyxmoadg, c1702zoijcleaow.f76929iobyxmoadg) && this.f76932zoijcleaow == c1702zoijcleaow.f76932zoijcleaow && this.f76930ppxfxbqfkf == c1702zoijcleaow.f76930ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f76931wkgbmnqykc, c1702zoijcleaow.f76931wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f76927eablkybsjg, c1702zoijcleaow.f76927eablkybsjg);
        }

        public final boolean gxszxtbevo() {
            return this.f76930ppxfxbqfkf;
        }

        public int hashCode() {
            return (((((((this.f76929iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f76932zoijcleaow)) * 31) + Boolean.hashCode(this.f76930ppxfxbqfkf)) * 31) + this.f76931wkgbmnqykc.hashCode()) * 31) + this.f76927eablkybsjg.hashCode();
        }

        @Override // pl0.zoijcleaow
        public pl0.iobyxmoadg iobyxmoadg() {
            return this.f76928gxszxtbevo;
        }

        public final String ppxfxbqfkf() {
            return this.f76927eablkybsjg;
        }

        public String toString() {
            return "AddressShopItem(addressId=" + this.f76929iobyxmoadg + ", isChecked=" + this.f76932zoijcleaow + ", isEnabled=" + this.f76930ppxfxbqfkf + ", shopAddress=" + this.f76931wkgbmnqykc + ", additionalInfo=" + this.f76927eablkybsjg + ")";
        }

        public final String wkgbmnqykc() {
            return this.f76931wkgbmnqykc;
        }

        @Override // pl0.zoijcleaow
        public String zoijcleaow() {
            return this.f76929iobyxmoadg;
        }
    }

    pl0.iobyxmoadg iobyxmoadg();

    String zoijcleaow();
}
