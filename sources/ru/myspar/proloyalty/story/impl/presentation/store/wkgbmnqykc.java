package ru.myspar.proloyalty.story.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f101686iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1393190416;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101687iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f101688zoijcleaow;

        public ppxfxbqfkf(String storyId, String slideId) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            zdlpuopuiu.btonecajqb(slideId, "slideId");
            this.f101687iobyxmoadg = storyId;
            this.f101688zoijcleaow = slideId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f101687iobyxmoadg, ppxfxbqfkfVar.f101687iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101688zoijcleaow, ppxfxbqfkfVar.f101688zoijcleaow);
        }

        public int hashCode() {
            return (this.f101687iobyxmoadg.hashCode() * 31) + this.f101688zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101688zoijcleaow;
        }

        public String toString() {
            return "ProcessStoryAction(storyId=" + this.f101687iobyxmoadg + ", slideId=" + this.f101688zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101687iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101689iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f101690zoijcleaow;

        public zoijcleaow(String storyId, String slideId) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            zdlpuopuiu.btonecajqb(slideId, "slideId");
            this.f101689iobyxmoadg = storyId;
            this.f101690zoijcleaow = slideId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f101689iobyxmoadg, zoijcleaowVar.f101689iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101690zoijcleaow, zoijcleaowVar.f101690zoijcleaow);
        }

        public int hashCode() {
            return (this.f101689iobyxmoadg.hashCode() * 31) + this.f101690zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101690zoijcleaow;
        }

        public String toString() {
            return "MarkSlideViewed(storyId=" + this.f101689iobyxmoadg + ", slideId=" + this.f101690zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101689iobyxmoadg;
        }
    }
}
