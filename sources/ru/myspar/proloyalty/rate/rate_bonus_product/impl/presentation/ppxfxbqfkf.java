package ru.myspar.proloyalty.rate.rate_bonus_product.impl.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f100057iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f100057iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f100057iobyxmoadg == ((iobyxmoadg) obj).f100057iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f100057iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f100057iobyxmoadg;
        }

        public String toString() {
            return "Dismiss(isSentReview=" + this.f100057iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f100058iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f100058iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f100058iobyxmoadg, ((zoijcleaow) obj).f100058iobyxmoadg);
        }

        public int hashCode() {
            return this.f100058iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f100058iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f100058iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
