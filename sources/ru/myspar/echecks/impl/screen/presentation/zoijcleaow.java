package ru.myspar.echecks.impl.screen.presentation;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f88260iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.echecks.impl.screen.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2023zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88261iobyxmoadg;

        public C2023zoijcleaow(boolean z13) {
            super(null);
            this.f88261iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2023zoijcleaow) && this.f88261iobyxmoadg == ((C2023zoijcleaow) obj).f88261iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88261iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88261iobyxmoadg;
        }

        public String toString() {
            return "OnReceiveDigitalChecksChecked(isChecked=" + this.f88261iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
