package ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f100059iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String article) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f100059iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f100059iobyxmoadg, ((iobyxmoadg) obj).f100059iobyxmoadg);
        }

        public int hashCode() {
            return this.f100059iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f100059iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(article=" + this.f100059iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f100060iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(tzroggbefp review) {
            super(null);
            zdlpuopuiu.btonecajqb(review, "review");
            this.f100060iobyxmoadg = review;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f100060iobyxmoadg, ((ppxfxbqfkf) obj).f100060iobyxmoadg);
        }

        public int hashCode() {
            return this.f100060iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f100060iobyxmoadg;
        }

        public String toString() {
            return "OnReviewTextChanged(review=" + this.f100060iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f100061iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1566373395;
        }

        public String toString() {
            return "OnSendReviewButtonClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2403zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f100062iobyxmoadg;

        public C2403zoijcleaow(int i13) {
            super(null);
            this.f100062iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2403zoijcleaow) && this.f100062iobyxmoadg == ((C2403zoijcleaow) obj).f100062iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f100062iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f100062iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChange(rating=" + this.f100062iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
