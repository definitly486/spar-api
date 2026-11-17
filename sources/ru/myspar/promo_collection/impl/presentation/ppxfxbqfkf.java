package ru.myspar.promo_collection.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102196iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102196iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102196iobyxmoadg, ((iobyxmoadg) obj).f102196iobyxmoadg);
        }

        public int hashCode() {
            return this.f102196iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102196iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102196iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.promo_collection.impl.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2462ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102197iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f102198ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f102199zoijcleaow;

        public C2462ppxfxbqfkf(String name, String description, String imageUrl) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            this.f102197iobyxmoadg = name;
            this.f102199zoijcleaow = description;
            this.f102198ppxfxbqfkf = imageUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2462ppxfxbqfkf)) {
                return false;
            }
            C2462ppxfxbqfkf c2462ppxfxbqfkf = (C2462ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f102197iobyxmoadg, c2462ppxfxbqfkf.f102197iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102199zoijcleaow, c2462ppxfxbqfkf.f102199zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102198ppxfxbqfkf, c2462ppxfxbqfkf.f102198ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f102197iobyxmoadg.hashCode() * 31) + this.f102199zoijcleaow.hashCode()) * 31) + this.f102198ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102199zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f102197iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoCollectionItemsDetailDialog(name=" + this.f102197iobyxmoadg + ", description=" + this.f102199zoijcleaow + ", imageUrl=" + this.f102198ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f102198ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f102200iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 954134672;
        }

        public String toString() {
            return "ShowErrorDialogUnlockPromoProduct";
        }
    }
}
