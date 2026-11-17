package bs0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface rgvfuqvkyq {

    public static final class iobyxmoadg implements rgvfuqvkyq {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f17015eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f17016gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f17017iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Integer f17018ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Integer f17019wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f17020zoijcleaow;

        public iobyxmoadg(String title, String description, Integer num, Integer num2, String deliveryPrice, boolean z13) {
            zdlpuopuiu.btonecajqb(title, "title");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(deliveryPrice, "deliveryPrice");
            this.f17017iobyxmoadg = title;
            this.f17020zoijcleaow = description;
            this.f17018ppxfxbqfkf = num;
            this.f17019wkgbmnqykc = num2;
            this.f17015eablkybsjg = deliveryPrice;
            this.f17016gxszxtbevo = z13;
        }

        public final String eablkybsjg() {
            return this.f17017iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f17017iobyxmoadg, iobyxmoadgVar.f17017iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f17020zoijcleaow, iobyxmoadgVar.f17020zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f17018ppxfxbqfkf, iobyxmoadgVar.f17018ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f17019wkgbmnqykc, iobyxmoadgVar.f17019wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f17015eablkybsjg, iobyxmoadgVar.f17015eablkybsjg) && this.f17016gxszxtbevo == iobyxmoadgVar.f17016gxszxtbevo;
        }

        public final boolean gxszxtbevo() {
            return this.f17016gxszxtbevo;
        }

        public int hashCode() {
            int iHashCode = ((this.f17017iobyxmoadg.hashCode() * 31) + this.f17020zoijcleaow.hashCode()) * 31;
            Integer num = this.f17018ppxfxbqfkf;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f17019wkgbmnqykc;
            return ((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.f17015eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f17016gxszxtbevo);
        }

        public final String iobyxmoadg() {
            return this.f17015eablkybsjg;
        }

        public final Integer ppxfxbqfkf() {
            return this.f17019wkgbmnqykc;
        }

        public String toString() {
            return "Filled(title=" + this.f17017iobyxmoadg + ", description=" + this.f17020zoijcleaow + ", iconRes=" + this.f17018ppxfxbqfkf + ", iconColorRes=" + this.f17019wkgbmnqykc + ", deliveryPrice=" + this.f17015eablkybsjg + ", isAddressTitleIconVisible=" + this.f17016gxszxtbevo + ")";
        }

        public final Integer wkgbmnqykc() {
            return this.f17018ppxfxbqfkf;
        }

        public final String zoijcleaow() {
            return this.f17020zoijcleaow;
        }
    }

    public static final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f17021iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f17021iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f17021iobyxmoadg == ((zoijcleaow) obj).f17021iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f17021iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f17021iobyxmoadg;
        }

        public String toString() {
            return "Shimmer(isDeliveryPriceVisible=" + this.f17021iobyxmoadg + ")";
        }
    }
}
