package ru.myspar.legacy.presentation.screen.specificrestaurant;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final double f89878iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f89879ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f89880wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f89881zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(double d13, String deliveryTime, String workingHours, String address) {
            super(null);
            zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
            zdlpuopuiu.btonecajqb(workingHours, "workingHours");
            zdlpuopuiu.btonecajqb(address, "address");
            this.f89878iobyxmoadg = d13;
            this.f89881zoijcleaow = deliveryTime;
            this.f89879ppxfxbqfkf = workingHours;
            this.f89880wkgbmnqykc = address;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Double.compare(this.f89878iobyxmoadg, iobyxmoadgVar.f89878iobyxmoadg) == 0 && zdlpuopuiu.eablkybsjg(this.f89881zoijcleaow, iobyxmoadgVar.f89881zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89879ppxfxbqfkf, iobyxmoadgVar.f89879ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f89880wkgbmnqykc, iobyxmoadgVar.f89880wkgbmnqykc);
        }

        public int hashCode() {
            return (((((Double.hashCode(this.f89878iobyxmoadg) * 31) + this.f89881zoijcleaow.hashCode()) * 31) + this.f89879ppxfxbqfkf.hashCode()) * 31) + this.f89880wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89880wkgbmnqykc;
        }

        public final String ppxfxbqfkf() {
            return this.f89881zoijcleaow;
        }

        public String toString() {
            return "ShowDescriptionDialog(deliveryPrice=" + this.f89878iobyxmoadg + ", deliveryTime=" + this.f89881zoijcleaow + ", workingHours=" + this.f89879ppxfxbqfkf + ", address=" + this.f89880wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f89879ppxfxbqfkf;
        }

        public final double zoijcleaow() {
            return this.f89878iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89882iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f89883zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String article, String partnerCode) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
            this.f89882iobyxmoadg = article;
            this.f89883zoijcleaow = partnerCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f89882iobyxmoadg, ppxfxbqfkfVar.f89882iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89883zoijcleaow, ppxfxbqfkfVar.f89883zoijcleaow);
        }

        public int hashCode() {
            return (this.f89882iobyxmoadg.hashCode() * 31) + this.f89883zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89882iobyxmoadg;
        }

        public String toString() {
            return "ShowProductDetails(article=" + this.f89882iobyxmoadg + ", partnerCode=" + this.f89883zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f89883zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.specificrestaurant.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2065wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2065wkgbmnqykc f89884iobyxmoadg = new C2065wkgbmnqykc();

        private C2065wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f89885iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f89885iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89885iobyxmoadg, ((zoijcleaow) obj).f89885iobyxmoadg);
        }

        public int hashCode() {
            return this.f89885iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f89885iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f89885iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
