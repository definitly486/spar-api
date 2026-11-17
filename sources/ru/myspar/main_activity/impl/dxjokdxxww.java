package ru.myspar.main_activity.impl;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface dxjokdxxww {

    public static final class iobyxmoadg implements dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f90402iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -819225601;
        }

        public String toString() {
            return "RestartAppScreen";
        }
    }

    public static final class zoijcleaow implements dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f90403iobyxmoadg;

        public zoijcleaow(String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f90403iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f90403iobyxmoadg, ((zoijcleaow) obj).f90403iobyxmoadg);
        }

        public int hashCode() {
            return this.f90403iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f90403iobyxmoadg;
        }

        public String toString() {
            return "TechnicalWorkScreen(message=" + this.f90403iobyxmoadg + ")";
        }
    }
}
