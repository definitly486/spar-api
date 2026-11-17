package ru.myspar.story.impl.presentation.store;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104335iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1194794930;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f104336iobyxmoadg;

        public ppxfxbqfkf(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f104336iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f104336iobyxmoadg, ((ppxfxbqfkf) obj).f104336iobyxmoadg);
        }

        public int hashCode() {
            return this.f104336iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f104336iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f104336iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104337iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final StoryNavLink f104338zoijcleaow;

        public zoijcleaow(String storyId, StoryNavLink navLink) {
            zdlpuopuiu.btonecajqb(storyId, "storyId");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            this.f104337iobyxmoadg = storyId;
            this.f104338zoijcleaow = navLink;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f104337iobyxmoadg, zoijcleaowVar.f104337iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104338zoijcleaow, zoijcleaowVar.f104338zoijcleaow);
        }

        public int hashCode() {
            return (this.f104337iobyxmoadg.hashCode() * 31) + this.f104338zoijcleaow.hashCode();
        }

        public final StoryNavLink iobyxmoadg() {
            return this.f104338zoijcleaow;
        }

        public String toString() {
            return "BackWithAction(storyId=" + this.f104337iobyxmoadg + ", navLink=" + this.f104338zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104337iobyxmoadg;
        }
    }
}
