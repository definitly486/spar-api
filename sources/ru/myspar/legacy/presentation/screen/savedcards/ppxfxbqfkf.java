package ru.myspar.legacy.presentation.screen.savedcards;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f89615iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1726234104;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.savedcards.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2053ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ld0.iobyxmoadg f89616iobyxmoadg;

        public C2053ppxfxbqfkf(ld0.iobyxmoadg card) {
            zdlpuopuiu.btonecajqb(card, "card");
            this.f89616iobyxmoadg = card;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2053ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f89616iobyxmoadg, ((C2053ppxfxbqfkf) obj).f89616iobyxmoadg);
        }

        public int hashCode() {
            return this.f89616iobyxmoadg.hashCode();
        }

        public final ld0.iobyxmoadg iobyxmoadg() {
            return this.f89616iobyxmoadg;
        }

        public String toString() {
            return "OnCardDeleteClicked(card=" + this.f89616iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final q10.iobyxmoadg f89617iobyxmoadg;

        public wkgbmnqykc(q10.iobyxmoadg questionType) {
            zdlpuopuiu.btonecajqb(questionType, "questionType");
            this.f89617iobyxmoadg = questionType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f89617iobyxmoadg == ((wkgbmnqykc) obj).f89617iobyxmoadg;
        }

        public int hashCode() {
            return this.f89617iobyxmoadg.hashCode();
        }

        public final q10.iobyxmoadg iobyxmoadg() {
            return this.f89617iobyxmoadg;
        }

        public String toString() {
            return "OnQuestionClicked(questionType=" + this.f89617iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89618iobyxmoadg;

        public zoijcleaow(String cardId) {
            zdlpuopuiu.btonecajqb(cardId, "cardId");
            this.f89618iobyxmoadg = cardId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f89618iobyxmoadg, ((zoijcleaow) obj).f89618iobyxmoadg);
        }

        public int hashCode() {
            return this.f89618iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89618iobyxmoadg;
        }

        public String toString() {
            return "OnCardDeleteApproved(cardId=" + this.f89618iobyxmoadg + ")";
        }
    }
}
