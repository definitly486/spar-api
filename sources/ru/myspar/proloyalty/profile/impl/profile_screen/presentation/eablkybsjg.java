package ru.myspar.proloyalty.profile.impl.profile_screen.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99424iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99424iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99424iobyxmoadg, ((iobyxmoadg) obj).f99424iobyxmoadg);
        }

        public int hashCode() {
            return this.f99424iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99424iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99424iobyxmoadg + ")";
        }
    }
}
