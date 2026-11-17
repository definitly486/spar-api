package ru.myspar.proloyalty.legacy.presentation.screen.savedcards;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f97294iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 468668971;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.savedcards.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2296ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ib1.iobyxmoadg f97295iobyxmoadg;

        public C2296ppxfxbqfkf(ib1.iobyxmoadg card) {
            zdlpuopuiu.btonecajqb(card, "card");
            this.f97295iobyxmoadg = card;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2296ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f97295iobyxmoadg, ((C2296ppxfxbqfkf) obj).f97295iobyxmoadg);
        }

        public int hashCode() {
            return this.f97295iobyxmoadg.hashCode();
        }

        public final ib1.iobyxmoadg iobyxmoadg() {
            return this.f97295iobyxmoadg;
        }

        public String toString() {
            return "OnCardDeleteClicked(card=" + this.f97295iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final g01.iobyxmoadg f97296iobyxmoadg;

        public wkgbmnqykc(g01.iobyxmoadg questionType) {
            zdlpuopuiu.btonecajqb(questionType, "questionType");
            this.f97296iobyxmoadg = questionType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f97296iobyxmoadg == ((wkgbmnqykc) obj).f97296iobyxmoadg;
        }

        public int hashCode() {
            return this.f97296iobyxmoadg.hashCode();
        }

        public final g01.iobyxmoadg iobyxmoadg() {
            return this.f97296iobyxmoadg;
        }

        public String toString() {
            return "OnQuestionClicked(questionType=" + this.f97296iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97297iobyxmoadg;

        public zoijcleaow(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f97297iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97297iobyxmoadg, ((zoijcleaow) obj).f97297iobyxmoadg);
        }

        public int hashCode() {
            return this.f97297iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97297iobyxmoadg;
        }

        public String toString() {
            return "OnCardDeleteApproved(cardId=" + this.f97297iobyxmoadg + ")";
        }
    }
}
