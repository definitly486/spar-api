package n71;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f69319iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f69319iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f69319iobyxmoadg == ((iobyxmoadg) obj).f69319iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f69319iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f69319iobyxmoadg;
        }

        public String toString() {
            return "UpdatesIsLoading(isLoading=" + this.f69319iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f69320iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f69320iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f69320iobyxmoadg == ((zoijcleaow) obj).f69320iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f69320iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f69320iobyxmoadg;
        }

        public String toString() {
            return "UpdatesSwitchEchecks(isEnabled=" + this.f69320iobyxmoadg + ")";
        }
    }
}
