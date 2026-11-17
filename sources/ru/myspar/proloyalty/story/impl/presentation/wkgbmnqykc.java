package ru.myspar.proloyalty.story.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f101691iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -68602572;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f101692iobyxmoadg;

        public zoijcleaow(Throwable throwable) {
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f101692iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f101692iobyxmoadg, ((zoijcleaow) obj).f101692iobyxmoadg);
        }

        public int hashCode() {
            return this.f101692iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f101692iobyxmoadg;
        }

        public String toString() {
            return "ShowError(throwable=" + this.f101692iobyxmoadg + ")";
        }
    }
}
