package ru.myspar.domain.feature.review.store;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f87853iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f87854zoijcleaow;

        public iobyxmoadg(boolean z13, int i13) {
            super(null);
            this.f87853iobyxmoadg = z13;
            this.f87854zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f87853iobyxmoadg == iobyxmoadgVar.f87853iobyxmoadg && this.f87854zoijcleaow == iobyxmoadgVar.f87854zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f87853iobyxmoadg) * 31) + Integer.hashCode(this.f87854zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f87854zoijcleaow;
        }

        public String toString() {
            return "Submit(isSubmit=" + this.f87853iobyxmoadg + ", rate=" + this.f87854zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f87853iobyxmoadg;
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
