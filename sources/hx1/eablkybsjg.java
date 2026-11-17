package hx1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f41251iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2041525285;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f41252iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 246013795;
        }

        public String toString() {
            return "ShowErrorDialogUnlockPromoProduct";
        }
    }

    public static final class wkgbmnqykc implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f41253iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f41254ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f41255zoijcleaow;

        public wkgbmnqykc(String name, String description, String imageUrl) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            this.f41253iobyxmoadg = name;
            this.f41255zoijcleaow = description;
            this.f41254ppxfxbqfkf = imageUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f41253iobyxmoadg, wkgbmnqykcVar.f41253iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41255zoijcleaow, wkgbmnqykcVar.f41255zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f41254ppxfxbqfkf, wkgbmnqykcVar.f41254ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f41253iobyxmoadg.hashCode() * 31) + this.f41255zoijcleaow.hashCode()) * 31) + this.f41254ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f41255zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f41253iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoCollectionItemsDetailDialog(name=" + this.f41253iobyxmoadg + ", description=" + this.f41255zoijcleaow + ", imageUrl=" + this.f41254ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f41254ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f41256iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f41256iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f41256iobyxmoadg, ((zoijcleaow) obj).f41256iobyxmoadg);
        }

        public int hashCode() {
            return this.f41256iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f41256iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f41256iobyxmoadg + ")";
        }
    }
}
