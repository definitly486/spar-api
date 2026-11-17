package ru.myspar.rate.rate_bonus_product.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102771iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String article) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f102771iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102771iobyxmoadg, ((iobyxmoadg) obj).f102771iobyxmoadg);
        }

        public int hashCode() {
            return this.f102771iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102771iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(article=" + this.f102771iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f102772iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(tzroggbefp review) {
            super(null);
            zdlpuopuiu.btonecajqb(review, "review");
            this.f102772iobyxmoadg = review;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102772iobyxmoadg, ((ppxfxbqfkf) obj).f102772iobyxmoadg);
        }

        public int hashCode() {
            return this.f102772iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f102772iobyxmoadg;
        }

        public String toString() {
            return "OnReviewTextChanged(review=" + this.f102772iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f102773iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -292214672;
        }

        public String toString() {
            return "OnSendReviewButtonClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.rate.rate_bonus_product.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2485zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f102774iobyxmoadg;

        public C2485zoijcleaow(int i13) {
            super(null);
            this.f102774iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2485zoijcleaow) && this.f102774iobyxmoadg == ((C2485zoijcleaow) obj).f102774iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f102774iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f102774iobyxmoadg;
        }

        public String toString() {
            return "OnRatingChange(rating=" + this.f102774iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
