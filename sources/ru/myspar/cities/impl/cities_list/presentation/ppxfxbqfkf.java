package ru.myspar.cities.impl.cities_list.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f86091iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -82004770;
        }

        public String toString() {
            return "Exit";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f86092iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f86092iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f86092iobyxmoadg, ((zoijcleaow) obj).f86092iobyxmoadg);
        }

        public int hashCode() {
            return this.f86092iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f86092iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f86092iobyxmoadg + ")";
        }
    }
}
