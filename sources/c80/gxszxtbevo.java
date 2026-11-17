package c80;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f19183iobyxmoadg;

        public iobyxmoadg(List cards) {
            zdlpuopuiu.btonecajqb(cards, "cards");
            this.f19183iobyxmoadg = cards;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f19183iobyxmoadg, ((iobyxmoadg) obj).f19183iobyxmoadg);
        }

        public int hashCode() {
            return this.f19183iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f19183iobyxmoadg;
        }

        public String toString() {
            return "CardListUpdated(cards=" + this.f19183iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final q10.iobyxmoadg f19184iobyxmoadg;

        public ppxfxbqfkf(q10.iobyxmoadg questionType) {
            zdlpuopuiu.btonecajqb(questionType, "questionType");
            this.f19184iobyxmoadg = questionType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f19184iobyxmoadg == ((ppxfxbqfkf) obj).f19184iobyxmoadg;
        }

        public int hashCode() {
            return this.f19184iobyxmoadg.hashCode();
        }

        public final q10.iobyxmoadg iobyxmoadg() {
            return this.f19184iobyxmoadg;
        }

        public String toString() {
            return "QuestionClicked(questionType=" + this.f19184iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f19185iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f19185iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f19185iobyxmoadg == ((zoijcleaow) obj).f19185iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f19185iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f19185iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f19185iobyxmoadg + ")";
        }
    }
}
