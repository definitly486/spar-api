package ru.myspar.proloyalty.echecks.impl.dialog.presentation;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f96052iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 628751959;
        }

        public String toString() {
            return "OnCancelClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.echecks.impl.dialog.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2266zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f96053iobyxmoadg;

        public C2266zoijcleaow(boolean z13) {
            super(null);
            this.f96053iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2266zoijcleaow) && this.f96053iobyxmoadg == ((C2266zoijcleaow) obj).f96053iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f96053iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f96053iobyxmoadg;
        }

        public String toString() {
            return "OnReceiveDigitalChecksChecked(isChecked=" + this.f96053iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
