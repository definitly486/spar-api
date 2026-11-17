package ru.myspar.proloyalty.story.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f101693iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -224688946;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101694iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f101695zoijcleaow;

        public ppxfxbqfkf(String groupId, String slideId) {
            zdlpuopuiu.btonecajqb(groupId, "groupId");
            zdlpuopuiu.btonecajqb(slideId, "slideId");
            this.f101694iobyxmoadg = groupId;
            this.f101695zoijcleaow = slideId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f101694iobyxmoadg, ppxfxbqfkfVar.f101694iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101695zoijcleaow, ppxfxbqfkfVar.f101695zoijcleaow);
        }

        public int hashCode() {
            return (this.f101694iobyxmoadg.hashCode() * 31) + this.f101695zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101694iobyxmoadg;
        }

        public String toString() {
            return "OnSlideViewed(groupId=" + this.f101694iobyxmoadg + ", slideId=" + this.f101695zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101695zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.story.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2443zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f101696iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f101697zoijcleaow;

        public C2443zoijcleaow(String groupId, String slideId) {
            zdlpuopuiu.btonecajqb(groupId, "groupId");
            zdlpuopuiu.btonecajqb(slideId, "slideId");
            this.f101696iobyxmoadg = groupId;
            this.f101697zoijcleaow = slideId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2443zoijcleaow)) {
                return false;
            }
            C2443zoijcleaow c2443zoijcleaow = (C2443zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f101696iobyxmoadg, c2443zoijcleaow.f101696iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f101697zoijcleaow, c2443zoijcleaow.f101697zoijcleaow);
        }

        public int hashCode() {
            return (this.f101696iobyxmoadg.hashCode() * 31) + this.f101697zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f101696iobyxmoadg;
        }

        public String toString() {
            return "OnClickAction(groupId=" + this.f101696iobyxmoadg + ", slideId=" + this.f101697zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f101697zoijcleaow;
        }
    }
}
