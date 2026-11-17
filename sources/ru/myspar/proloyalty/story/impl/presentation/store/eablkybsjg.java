package ru.myspar.proloyalty.story.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f101669iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 351019083;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f101670iobyxmoadg;

        public ppxfxbqfkf(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f101670iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f101670iobyxmoadg, ((ppxfxbqfkf) obj).f101670iobyxmoadg);
        }

        public int hashCode() {
            return this.f101670iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f101670iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f101670iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101671iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final StoryNavLink f101672zoijcleaow;

        public zoijcleaow(String storyId, StoryNavLink navLink) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f101671iobyxmoadg = storyId;
            this.f101672zoijcleaow = navLink;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f101671iobyxmoadg, zoijcleaowVar.f101671iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101672zoijcleaow, zoijcleaowVar.f101672zoijcleaow);
        }

        public int hashCode() {
            return (this.f101671iobyxmoadg.hashCode() * 31) + this.f101672zoijcleaow.hashCode();
        }

        public final StoryNavLink iobyxmoadg() {
            return this.f101672zoijcleaow;
        }

        public String toString() {
            return "BackWithAction(storyId=" + this.f101671iobyxmoadg + ", navLink=" + this.f101672zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101671iobyxmoadg;
        }
    }
}
