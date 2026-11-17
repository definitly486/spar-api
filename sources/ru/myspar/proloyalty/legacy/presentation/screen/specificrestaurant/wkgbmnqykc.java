package ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f97508iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f97509ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f97510wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f97511zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(double d13, String deliveryTime, String workingHours, String address) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
            zdlpuopuiu.btonecajqb(workingHours, "workingHours");
            zdlpuopuiu.btonecajqb(address, "address");
            this.f97508iobyxmoadg = d13;
            this.f97511zoijcleaow = deliveryTime;
            this.f97509ppxfxbqfkf = workingHours;
            this.f97510wkgbmnqykc = address;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Double.compare(this.f97508iobyxmoadg, iobyxmoadgVar.f97508iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f97511zoijcleaow, iobyxmoadgVar.f97511zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97509ppxfxbqfkf, iobyxmoadgVar.f97509ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f97510wkgbmnqykc, iobyxmoadgVar.f97510wkgbmnqykc);
        }

        public int hashCode() {
            return (((((Double.hashCode(this.f97508iobyxmoadg) * 31) + this.f97511zoijcleaow.hashCode()) * 31) + this.f97509ppxfxbqfkf.hashCode()) * 31) + this.f97510wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97510wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f97511zoijcleaow;
        }

        public String toString() {
            return "ShowDescriptionDialog(deliveryPrice=" + this.f97508iobyxmoadg + ", deliveryTime=" + this.f97511zoijcleaow + ", workingHours=" + this.f97509ppxfxbqfkf + ", address=" + this.f97510wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f97509ppxfxbqfkf;
        }

        public final double zoijcleaow() {
            return this.f97508iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97512iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f97513zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String article, String partnerCode) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
            this.f97512iobyxmoadg = article;
            this.f97513zoijcleaow = partnerCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f97512iobyxmoadg, ppxfxbqfkfVar.f97512iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97513zoijcleaow, ppxfxbqfkfVar.f97513zoijcleaow);
        }

        public int hashCode() {
            return (this.f97512iobyxmoadg.hashCode() * 31) + this.f97513zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97512iobyxmoadg;
        }

        public String toString() {
            return "ShowProductDetails(article=" + this.f97512iobyxmoadg + ", partnerCode=" + this.f97513zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f97513zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2305wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2305wkgbmnqykc f97514iobyxmoadg = new C2305wkgbmnqykc();

        private C2305wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97515iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97515iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97515iobyxmoadg, ((zoijcleaow) obj).f97515iobyxmoadg);
        }

        public int hashCode() {
            return this.f97515iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97515iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97515iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
