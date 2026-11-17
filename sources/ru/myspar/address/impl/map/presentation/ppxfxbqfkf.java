package ru.myspar.address.impl.map.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f83981iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f83981iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f83981iobyxmoadg, ((iobyxmoadg) obj).f83981iobyxmoadg);
        }

        public int hashCode() {
            return this.f83981iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f83981iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f83981iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.address.impl.map.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1896ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1896ppxfxbqfkf f83982iobyxmoadg = new C1896ppxfxbqfkf();

        private C1896ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1896ppxfxbqfkf);
        }

        public int hashCode() {
            return -1124546797;
        }

        public String toString() {
            return "ShowProductPriceCanBeChangeMessage";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f83983iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1020561010;
        }

        public String toString() {
            return "ShowSomethingProductsAvailableOnlyForPickupMessage";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f83984iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -10953396;
        }

        public String toString() {
            return "ShowLocationDetectErrorMessage";
        }
    }
}
