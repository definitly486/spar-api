package c80;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f19205iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1319500510;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19206iobyxmoadg;

        public ppxfxbqfkf(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f19206iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f19206iobyxmoadg, ((ppxfxbqfkf) obj).f19206iobyxmoadg);
        }

        public int hashCode() {
            return this.f19206iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f19206iobyxmoadg;
        }

        public String toString() {
            return "OnCardDeleteClicked(cardId=" + this.f19206iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: c80.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0350wkgbmnqykc implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final q10.iobyxmoadg f19207iobyxmoadg;

        public C0350wkgbmnqykc(q10.iobyxmoadg questionType) {
            zdlpuopuiu.btonecajqb(questionType, "questionType");
            this.f19207iobyxmoadg = questionType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0350wkgbmnqykc) && this.f19207iobyxmoadg == ((C0350wkgbmnqykc) obj).f19207iobyxmoadg;
        }

        public int hashCode() {
            return this.f19207iobyxmoadg.hashCode();
        }

        public final q10.iobyxmoadg iobyxmoadg() {
            return this.f19207iobyxmoadg;
        }

        public String toString() {
            return "OnQuestionClicked(questionType=" + this.f19207iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f19208iobyxmoadg;

        public zoijcleaow(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f19208iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f19208iobyxmoadg, ((zoijcleaow) obj).f19208iobyxmoadg);
        }

        public int hashCode() {
            return this.f19208iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f19208iobyxmoadg;
        }

        public String toString() {
            return "OnCardDeleteApproved(cardId=" + this.f19208iobyxmoadg + ")";
        }
    }
}
