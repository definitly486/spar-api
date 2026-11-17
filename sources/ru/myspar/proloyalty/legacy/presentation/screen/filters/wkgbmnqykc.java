package ru.myspar.proloyalty.legacy.presentation.screen.filters;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97004iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97004iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97004iobyxmoadg, ((iobyxmoadg) obj).f97004iobyxmoadg);
        }

        public int hashCode() {
            return this.f97004iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97004iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97004iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {
        public abstract CharSequence iobyxmoadg();
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
