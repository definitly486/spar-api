package ru.myspar.catalog.impl.choosesort.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v00.ppxfxbqfkf f85161iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(v00.ppxfxbqfkf type) {
            super(null);
            zdlpuopuiu.btonecajqb(type, "type");
            this.f85161iobyxmoadg = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f85161iobyxmoadg == ((iobyxmoadg) obj).f85161iobyxmoadg;
        }

        public int hashCode() {
            return this.f85161iobyxmoadg.hashCode();
        }

        public final v00.ppxfxbqfkf iobyxmoadg() {
            return this.f85161iobyxmoadg;
        }

        public String toString() {
            return "OnSortItemClicked(type=" + this.f85161iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
