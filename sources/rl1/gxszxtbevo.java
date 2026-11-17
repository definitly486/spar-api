package rl1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f83085iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f83085iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f83085iobyxmoadg == ((iobyxmoadg) obj).f83085iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f83085iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f83085iobyxmoadg;
        }

        public String toString() {
            return "IsLoading(isLoading=" + this.f83085iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f83086iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f83087zoijcleaow;

        public ppxfxbqfkf(int i13, boolean z13) {
            super(null);
            this.f83086iobyxmoadg = i13;
            this.f83087zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return this.f83086iobyxmoadg == ppxfxbqfkfVar.f83086iobyxmoadg && this.f83087zoijcleaow == ppxfxbqfkfVar.f83087zoijcleaow;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f83086iobyxmoadg) * 31) + Boolean.hashCode(this.f83087zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f83086iobyxmoadg;
        }

        public String toString() {
            return "RatingChanged(rating=" + this.f83086iobyxmoadg + ", isSendButtonEnabled=" + this.f83087zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f83087zoijcleaow;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f83088iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f83089zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(tzroggbefp review, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(review, "review");
            this.f83088iobyxmoadg = review;
            this.f83089zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f83088iobyxmoadg, zoijcleaowVar.f83088iobyxmoadg) && this.f83089zoijcleaow == zoijcleaowVar.f83089zoijcleaow;
        }

        public int hashCode() {
            return (this.f83088iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f83089zoijcleaow);
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f83088iobyxmoadg;
        }

        public String toString() {
            return "OnReviewTextChanged(review=" + this.f83088iobyxmoadg + ", isSendButtonEnabled=" + this.f83089zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f83089zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
