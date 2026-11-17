package ru.myspar.proloyalty.echecks.impl.screen.presentation;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96082iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.echecks.impl.screen.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2267zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f96083iobyxmoadg;

        public C2267zoijcleaow(boolean z13) {
            super(null);
            this.f96083iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2267zoijcleaow) && this.f96083iobyxmoadg == ((C2267zoijcleaow) obj).f96083iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f96083iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f96083iobyxmoadg;
        }

        public String toString() {
            return "OnReceiveDigitalChecksChecked(isChecked=" + this.f96083iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
