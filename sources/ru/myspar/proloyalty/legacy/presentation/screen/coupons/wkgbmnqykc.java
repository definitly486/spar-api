package ru.myspar.proloyalty.legacy.presentation.screen.coupons;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f96689iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f96689iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f96689iobyxmoadg, ((iobyxmoadg) obj).f96689iobyxmoadg);
        }

        public int hashCode() {
            return this.f96689iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f96689iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f96689iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f96690iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1168829361;
        }

        public String toString() {
            return "ShowQrCodeDialog";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f96691iobyxmoadg;

        public zoijcleaow(CharSequence promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f96691iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f96691iobyxmoadg, ((zoijcleaow) obj).f96691iobyxmoadg);
        }

        public int hashCode() {
            return this.f96691iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f96691iobyxmoadg;
        }

        public String toString() {
            return "ShowMessageAboutCopying(promoCode=" + ((Object) this.f96691iobyxmoadg) + ")";
        }
    }
}
