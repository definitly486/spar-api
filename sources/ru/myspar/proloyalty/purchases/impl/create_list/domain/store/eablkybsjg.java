package ru.myspar.proloyalty.purchases.impl.create_list.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f99527iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f99527iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f99527iobyxmoadg == ((iobyxmoadg) obj).f99527iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f99527iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f99527iobyxmoadg;
        }

        public String toString() {
            return "IsLoading(isLoading=" + this.f99527iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f99528iobyxmoadg;

        public zoijcleaow(tzroggbefp listName) {
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f99528iobyxmoadg = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99528iobyxmoadg, ((zoijcleaow) obj).f99528iobyxmoadg);
        }

        public int hashCode() {
            return this.f99528iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f99528iobyxmoadg;
        }

        public String toString() {
            return "OnListNameChanged(listName=" + this.f99528iobyxmoadg + ")";
        }
    }
}
