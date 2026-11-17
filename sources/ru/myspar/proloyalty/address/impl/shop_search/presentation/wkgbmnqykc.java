package ru.myspar.proloyalty.address.impl.shop_search.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f92049iobyxmoadg;

        public iobyxmoadg(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f92049iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f92049iobyxmoadg, ((iobyxmoadg) obj).f92049iobyxmoadg);
        }

        public int hashCode() {
            return this.f92049iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f92049iobyxmoadg;
        }

        public String toString() {
            return "ShowErrorSnackBar(error=" + this.f92049iobyxmoadg + ")";
        }
    }
}
