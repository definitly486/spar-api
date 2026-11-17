package ru.myspar.proloyalty.address.impl.address_search.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f91863iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f91863iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f91863iobyxmoadg, ((iobyxmoadg) obj).f91863iobyxmoadg);
        }

        public int hashCode() {
            return this.f91863iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f91863iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f91863iobyxmoadg + ")";
        }
    }
}
