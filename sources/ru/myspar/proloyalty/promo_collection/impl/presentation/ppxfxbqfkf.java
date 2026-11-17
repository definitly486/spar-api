package ru.myspar.proloyalty.promo_collection.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99488iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99488iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99488iobyxmoadg, ((iobyxmoadg) obj).f99488iobyxmoadg);
        }

        public int hashCode() {
            return this.f99488iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99488iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99488iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.promo_collection.impl.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2380ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99489iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f99490ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f99491zoijcleaow;

        public C2380ppxfxbqfkf(String name, String description, String imageUrl) {
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(description, "description");
            zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
            this.f99489iobyxmoadg = name;
            this.f99491zoijcleaow = description;
            this.f99490ppxfxbqfkf = imageUrl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2380ppxfxbqfkf)) {
                return false;
            }
            C2380ppxfxbqfkf c2380ppxfxbqfkf = (C2380ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f99489iobyxmoadg, c2380ppxfxbqfkf.f99489iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99491zoijcleaow, c2380ppxfxbqfkf.f99491zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99490ppxfxbqfkf, c2380ppxfxbqfkf.f99490ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f99489iobyxmoadg.hashCode() * 31) + this.f99491zoijcleaow.hashCode()) * 31) + this.f99490ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99491zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f99489iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoCollectionItemsDetailDialog(name=" + this.f99489iobyxmoadg + ", description=" + this.f99491zoijcleaow + ", imageUrl=" + this.f99490ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f99490ppxfxbqfkf;
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f99492iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1660876912;
        }

        public String toString() {
            return "ShowErrorSnackbarUnlockPromoProduct";
        }
    }
}
