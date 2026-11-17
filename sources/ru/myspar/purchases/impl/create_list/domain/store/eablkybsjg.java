package ru.myspar.purchases.impl.create_list.domain.store;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f102235iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f102235iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f102235iobyxmoadg == ((iobyxmoadg) obj).f102235iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f102235iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f102235iobyxmoadg;
        }

        public String toString() {
            return "IsLoading(isLoading=" + this.f102235iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f102236iobyxmoadg;

        public zoijcleaow(tzroggbefp listName) {
            zdlpuopuiu.btonecajqb(listName, "listName");
            this.f102236iobyxmoadg = listName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102236iobyxmoadg, ((zoijcleaow) obj).f102236iobyxmoadg);
        }

        public int hashCode() {
            return this.f102236iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f102236iobyxmoadg;
        }

        public String toString() {
            return "OnListNameChanged(listName=" + this.f102236iobyxmoadg + ")";
        }
    }
}
