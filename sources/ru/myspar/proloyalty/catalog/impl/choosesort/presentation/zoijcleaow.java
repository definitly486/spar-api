package ru.myspar.proloyalty.catalog.impl.choosesort.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final mz0.ppxfxbqfkf f93085iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(mz0.ppxfxbqfkf type) {
            super(null);
            zdlpuopuiu.btonecajqb(type, "type");
            this.f93085iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f93085iobyxmoadg == ((iobyxmoadg) obj).f93085iobyxmoadg;
        }

        public int hashCode() {
            return this.f93085iobyxmoadg.hashCode();
        }

        public final mz0.ppxfxbqfkf iobyxmoadg() {
            return this.f93085iobyxmoadg;
        }

        public String toString() {
            return "OnSortItemClicked(type=" + this.f93085iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
