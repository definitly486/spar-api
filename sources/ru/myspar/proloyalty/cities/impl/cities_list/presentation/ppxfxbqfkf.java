package ru.myspar.proloyalty.cities.impl.cities_list.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f93825iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 751563201;
        }

        public String toString() {
            return "Exit";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f93826iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f93826iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f93826iobyxmoadg, ((zoijcleaow) obj).f93826iobyxmoadg);
        }

        public int hashCode() {
            return this.f93826iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f93826iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f93826iobyxmoadg + ")";
        }
    }
}
