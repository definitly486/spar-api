package ru.myspar.echecks.impl.dialog.presentation;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f88230iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1566151116;
        }

        public String toString() {
            return "OnCancelClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.echecks.impl.dialog.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2022zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f88231iobyxmoadg;

        public C2022zoijcleaow(boolean z13) {
            super(null);
            this.f88231iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2022zoijcleaow) && this.f88231iobyxmoadg == ((C2022zoijcleaow) obj).f88231iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88231iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f88231iobyxmoadg;
        }

        public String toString() {
            return "OnReceiveDigitalChecksChecked(isChecked=" + this.f88231iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
