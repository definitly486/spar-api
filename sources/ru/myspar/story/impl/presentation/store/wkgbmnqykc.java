package ru.myspar.story.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104352iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1924608339;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class ppxfxbqfkf implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104353iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104354zoijcleaow;

        public ppxfxbqfkf(String storyId, String slideId) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            zdlpuopuiu.btonecajqb(slideId, "slideId");
            this.f104353iobyxmoadg = storyId;
            this.f104354zoijcleaow = slideId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f104353iobyxmoadg, ppxfxbqfkfVar.f104353iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104354zoijcleaow, ppxfxbqfkfVar.f104354zoijcleaow);
        }

        public int hashCode() {
            return (this.f104353iobyxmoadg.hashCode() * 31) + this.f104354zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104354zoijcleaow;
        }

        public String toString() {
            return "ProcessStoryAction(storyId=" + this.f104353iobyxmoadg + ", slideId=" + this.f104354zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104353iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104355iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104356zoijcleaow;

        public zoijcleaow(String storyId, String slideId) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            zdlpuopuiu.btonecajqb(slideId, "slideId");
            this.f104355iobyxmoadg = storyId;
            this.f104356zoijcleaow = slideId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f104355iobyxmoadg, zoijcleaowVar.f104355iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104356zoijcleaow, zoijcleaowVar.f104356zoijcleaow);
        }

        public int hashCode() {
            return (this.f104355iobyxmoadg.hashCode() * 31) + this.f104356zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104356zoijcleaow;
        }

        public String toString() {
            return "MarkSlideViewed(storyId=" + this.f104355iobyxmoadg + ", slideId=" + this.f104356zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104355iobyxmoadg;
        }
    }
}
