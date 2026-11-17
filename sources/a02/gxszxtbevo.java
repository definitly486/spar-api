package a02;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f124iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f124iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f124iobyxmoadg == ((iobyxmoadg) obj).f124iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f124iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f124iobyxmoadg;
        }

        public String toString() {
            return "IsLoading(isLoading=" + this.f124iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f125iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f126zoijcleaow;

        public ppxfxbqfkf(int i13, boolean z13) {
            super(null);
            this.f125iobyxmoadg = i13;
            this.f126zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f125iobyxmoadg == ppxfxbqfkfVar.f125iobyxmoadg && this.f126zoijcleaow == ppxfxbqfkfVar.f126zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f125iobyxmoadg) * 31) + Boolean.hashCode(this.f126zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f125iobyxmoadg;
        }

        public String toString() {
            return "RatingChanged(rating=" + this.f125iobyxmoadg + ", isSendButtonEnabled=" + this.f126zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f126zoijcleaow;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f127iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f128zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(tzroggbefp review, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(review, "review");
            this.f127iobyxmoadg = review;
            this.f128zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f127iobyxmoadg, zoijcleaowVar.f127iobyxmoadg) && this.f128zoijcleaow == zoijcleaowVar.f128zoijcleaow;
        }

        public int hashCode() {
            return (this.f127iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f128zoijcleaow);
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f127iobyxmoadg;
        }

        public String toString() {
            return "OnReviewTextChanged(review=" + this.f127iobyxmoadg + ", isSendButtonEnabled=" + this.f128zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f128zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
