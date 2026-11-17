package ru.myspar.proloyalty.address.impl.map.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92006iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f92006iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92006iobyxmoadg, ((iobyxmoadg) obj).f92006iobyxmoadg);
        }

        public int hashCode() {
            return this.f92006iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92006iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f92006iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.map.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2140ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2140ppxfxbqfkf f92007iobyxmoadg = new C2140ppxfxbqfkf();

        private C2140ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2140ppxfxbqfkf);
        }

        public int hashCode() {
            return -1115386736;
        }

        public String toString() {
            return "ShowProductPriceCanBeChangeMessage";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f92008iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1753130251;
        }

        public String toString() {
            return "ShowSomethingProductsAvailableOnlyForPickupMessage";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f92009iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -2064324279;
        }

        public String toString() {
            return "ShowLocationDetectErrorMessage";
        }
    }
}
