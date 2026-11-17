package ru.myspar.proloyalty.purchases.impl.create_list.presentation;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99573iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -590445201;
        }

        public String toString() {
            return "EmptyNameMessage";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99574iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99574iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99574iobyxmoadg, ((zoijcleaow) obj).f99574iobyxmoadg);
        }

        public int hashCode() {
            return this.f99574iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99574iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99574iobyxmoadg + ")";
        }
    }
}
