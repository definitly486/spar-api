package ru.myspar.proloyalty.domain.feature.review.store;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f95632iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f95633zoijcleaow;

        public iobyxmoadg(boolean z13, int i13) {
            super(null);
            this.f95632iobyxmoadg = z13;
            this.f95633zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f95632iobyxmoadg == iobyxmoadgVar.f95632iobyxmoadg && this.f95633zoijcleaow == iobyxmoadgVar.f95633zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f95632iobyxmoadg) * 31) + Integer.hashCode(this.f95633zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f95633zoijcleaow;
        }

        public String toString() {
            return "Submit(isSubmit=" + this.f95632iobyxmoadg + ", rate=" + this.f95633zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f95632iobyxmoadg;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
