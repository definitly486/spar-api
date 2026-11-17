package ru.myspar.proloyalty.main_activity.impl;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface draadjrbmk {

    public static final class iobyxmoadg implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f97828iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -410741380;
        }

        public String toString() {
            return "RestartAppScreen";
        }
    }

    public static final class zoijcleaow implements draadjrbmk {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97829iobyxmoadg;

        public zoijcleaow(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f97829iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97829iobyxmoadg, ((zoijcleaow) obj).f97829iobyxmoadg);
        }

        public int hashCode() {
            return this.f97829iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97829iobyxmoadg;
        }

        public String toString() {
            return "TechnicalWorkScreen(message=" + this.f97829iobyxmoadg + ")";
        }
    }
}
