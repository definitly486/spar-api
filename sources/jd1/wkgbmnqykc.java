package jd1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.qr.domain.model.QrModel;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class eablkybsjg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f51169iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -159180958;
        }

        public String toString() {
            return "VpnImage";
        }
    }

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f51170iobyxmoadg;

        public iobyxmoadg(String cardNumber) {
            zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
            this.f51170iobyxmoadg = cardNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f51170iobyxmoadg, ((iobyxmoadg) obj).f51170iobyxmoadg);
        }

        public int hashCode() {
            return this.f51170iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f51170iobyxmoadg;
        }

        public String toString() {
            return "QrCodeCard(cardNumber=" + this.f51170iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f51171iobyxmoadg;

        public ppxfxbqfkf(String qrCode) {
            zdlpuopuiu.btonecajqb(qrCode, "qrCode");
            this.f51171iobyxmoadg = qrCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f51171iobyxmoadg, ((ppxfxbqfkf) obj).f51171iobyxmoadg);
        }

        public int hashCode() {
            return this.f51171iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f51171iobyxmoadg;
        }

        public String toString() {
            return "QrCodeStatic(qrCode=" + this.f51171iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: jd1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1100wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1100wkgbmnqykc f51172iobyxmoadg = new C1100wkgbmnqykc();

        private C1100wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1100wkgbmnqykc);
        }

        public int hashCode() {
            return 1256195846;
        }

        public String toString() {
            return "Shimmer";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final QrModel.Dynamic f51173iobyxmoadg;

        public zoijcleaow(QrModel.Dynamic qrModel) {
            zdlpuopuiu.btonecajqb(qrModel, "qrModel");
            this.f51173iobyxmoadg = qrModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51173iobyxmoadg, ((zoijcleaow) obj).f51173iobyxmoadg);
        }

        public int hashCode() {
            return this.f51173iobyxmoadg.hashCode();
        }

        public final QrModel.Dynamic iobyxmoadg() {
            return this.f51173iobyxmoadg;
        }

        public String toString() {
            return "QrCodeDynamic(qrModel=" + this.f51173iobyxmoadg + ")";
        }
    }
}
