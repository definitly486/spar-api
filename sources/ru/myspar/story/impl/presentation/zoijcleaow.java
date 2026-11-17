package ru.myspar.story.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f104359iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 306728977;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104360iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104361zoijcleaow;

        public ppxfxbqfkf(String groupId, String slideId) {
            zdlpuopuiu.btonecajqb(groupId, "groupId");
            zdlpuopuiu.btonecajqb(slideId, "slideId");
            this.f104360iobyxmoadg = groupId;
            this.f104361zoijcleaow = slideId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f104360iobyxmoadg, ppxfxbqfkfVar.f104360iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104361zoijcleaow, ppxfxbqfkfVar.f104361zoijcleaow);
        }

        public int hashCode() {
            return (this.f104360iobyxmoadg.hashCode() * 31) + this.f104361zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104360iobyxmoadg;
        }

        public String toString() {
            return "OnSlideViewed(groupId=" + this.f104360iobyxmoadg + ", slideId=" + this.f104361zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104361zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.story.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2523zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f104362iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f104363zoijcleaow;

        public C2523zoijcleaow(String groupId, String slideId) {
            zdlpuopuiu.btonecajqb(groupId, "groupId");
            zdlpuopuiu.btonecajqb(slideId, "slideId");
            this.f104362iobyxmoadg = groupId;
            this.f104363zoijcleaow = slideId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2523zoijcleaow)) {
                return false;
            }
            C2523zoijcleaow c2523zoijcleaow = (C2523zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f104362iobyxmoadg, c2523zoijcleaow.f104362iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f104363zoijcleaow, c2523zoijcleaow.f104363zoijcleaow);
        }

        public int hashCode() {
            return (this.f104362iobyxmoadg.hashCode() * 31) + this.f104363zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f104362iobyxmoadg;
        }

        public String toString() {
            return "OnClickAction(groupId=" + this.f104362iobyxmoadg + ", slideId=" + this.f104363zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f104363zoijcleaow;
        }
    }
}
