package ru.myspar.networkpanel.impl.presentation;

import java.io.File;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f90891iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1682265196;
        }

        public String toString() {
            return "Close";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final File f90892iobyxmoadg;

        public zoijcleaow(File log) {
            zdlpuopuiu.btonecajqb(log, "log");
            this.f90892iobyxmoadg = log;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f90892iobyxmoadg, ((zoijcleaow) obj).f90892iobyxmoadg);
        }

        public int hashCode() {
            return this.f90892iobyxmoadg.hashCode();
        }

        public final File iobyxmoadg() {
            return this.f90892iobyxmoadg;
        }

        public String toString() {
            return "ShareLog(log=" + this.f90892iobyxmoadg + ")";
        }
    }
}
