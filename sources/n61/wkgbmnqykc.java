package n61;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f69205iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2018175871;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f69206iobyxmoadg;

        public ppxfxbqfkf(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f69206iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f69206iobyxmoadg, ((ppxfxbqfkf) obj).f69206iobyxmoadg);
        }

        public int hashCode() {
            return this.f69206iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f69206iobyxmoadg;
        }

        public String toString() {
            return "OnCardDeleteClicked(cardId=" + this.f69206iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: n61.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1485wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final g01.iobyxmoadg f69207iobyxmoadg;

        public C1485wkgbmnqykc(g01.iobyxmoadg questionType) {
            zdlpuopuiu.btonecajqb(questionType, "questionType");
            this.f69207iobyxmoadg = questionType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1485wkgbmnqykc) && this.f69207iobyxmoadg == ((C1485wkgbmnqykc) obj).f69207iobyxmoadg;
        }

        public int hashCode() {
            return this.f69207iobyxmoadg.hashCode();
        }

        public final g01.iobyxmoadg iobyxmoadg() {
            return this.f69207iobyxmoadg;
        }

        public String toString() {
            return "OnQuestionClicked(questionType=" + this.f69207iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f69208iobyxmoadg;

        public zoijcleaow(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f69208iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69208iobyxmoadg, ((zoijcleaow) obj).f69208iobyxmoadg);
        }

        public int hashCode() {
            return this.f69208iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f69208iobyxmoadg;
        }

        public String toString() {
            return "OnCardDeleteApproved(cardId=" + this.f69208iobyxmoadg + ")";
        }
    }
}
