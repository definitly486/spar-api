package ru.myspar.rate.rate_bonus_product.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f102769iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f102769iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f102769iobyxmoadg == ((iobyxmoadg) obj).f102769iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f102769iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f102769iobyxmoadg;
        }

        public String toString() {
            return "Dismiss(isSentReview=" + this.f102769iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f102770iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f102770iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102770iobyxmoadg, ((zoijcleaow) obj).f102770iobyxmoadg);
        }

        public int hashCode() {
            return this.f102770iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f102770iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f102770iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
