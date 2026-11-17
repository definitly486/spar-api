package l6;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f61690iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: l6.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1248zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f61691iobyxmoadg;

        public C1248zoijcleaow(int i13) {
            super(null);
            this.f61691iobyxmoadg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1248zoijcleaow) && this.f61691iobyxmoadg == ((C1248zoijcleaow) obj).f61691iobyxmoadg;
        }

        public int hashCode() {
            return Integer.hashCode(this.f61691iobyxmoadg);
        }

        public final int iobyxmoadg() {
            return this.f61691iobyxmoadg;
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f61691iobyxmoadg + ')';
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
