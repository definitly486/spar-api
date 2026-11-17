package n61;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f69183iobyxmoadg;

        public iobyxmoadg(List cards) {
            zdlpuopuiu.btonecajqb(cards, "cards");
            this.f69183iobyxmoadg = cards;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69183iobyxmoadg, ((iobyxmoadg) obj).f69183iobyxmoadg);
        }

        public int hashCode() {
            return this.f69183iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f69183iobyxmoadg;
        }

        public String toString() {
            return "CardListUpdated(cards=" + this.f69183iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final g01.iobyxmoadg f69184iobyxmoadg;

        public ppxfxbqfkf(g01.iobyxmoadg questionType) {
            zdlpuopuiu.btonecajqb(questionType, "questionType");
            this.f69184iobyxmoadg = questionType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f69184iobyxmoadg == ((ppxfxbqfkf) obj).f69184iobyxmoadg;
        }

        public int hashCode() {
            return this.f69184iobyxmoadg.hashCode();
        }

        public final g01.iobyxmoadg iobyxmoadg() {
            return this.f69184iobyxmoadg;
        }

        public String toString() {
            return "QuestionClicked(questionType=" + this.f69184iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f69185iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f69185iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f69185iobyxmoadg == ((zoijcleaow) obj).f69185iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f69185iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f69185iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f69185iobyxmoadg + ")";
        }
    }
}
