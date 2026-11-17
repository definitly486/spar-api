package ru.myspar.legacy.presentation.screen.coupons;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f88905iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f88905iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f88905iobyxmoadg, ((iobyxmoadg) obj).f88905iobyxmoadg);
        }

        public int hashCode() {
            return this.f88905iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f88905iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f88905iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f88906iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 1846310772;
        }

        public String toString() {
            return "ShowQrCodeDialog";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CharSequence f88907iobyxmoadg;

        public zoijcleaow(CharSequence promoCode) {
            zdlpuopuiu.btonecajqb(promoCode, "promoCode");
            this.f88907iobyxmoadg = promoCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f88907iobyxmoadg, ((zoijcleaow) obj).f88907iobyxmoadg);
        }

        public int hashCode() {
            return this.f88907iobyxmoadg.hashCode();
        }

        public final CharSequence iobyxmoadg() {
            return this.f88907iobyxmoadg;
        }

        public String toString() {
            return "ShowMessageAboutCopying(promoCode=" + ((Object) this.f88907iobyxmoadg) + ")";
        }
    }
}
