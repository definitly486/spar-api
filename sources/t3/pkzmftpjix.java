package t3;

/* JADX INFO: loaded from: classes.dex */
public interface pkzmftpjix {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final hcddaimhww f109526iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final hcddaimhww f109527zoijcleaow;

        public iobyxmoadg(hcddaimhww hcddaimhwwVar) {
            this(hcddaimhwwVar, hcddaimhwwVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || iobyxmoadg.class != obj.getClass()) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f109526iobyxmoadg.equals(iobyxmoadgVar.f109526iobyxmoadg) && this.f109527zoijcleaow.equals(iobyxmoadgVar.f109527zoijcleaow);
        }

        public int hashCode() {
            return (this.f109526iobyxmoadg.hashCode() * 31) + this.f109527zoijcleaow.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[");
            sb3.append(this.f109526iobyxmoadg);
            if (this.f109526iobyxmoadg.equals(this.f109527zoijcleaow)) {
                str = "";
            } else {
                str = ", " + this.f109527zoijcleaow;
            }
            sb3.append(str);
            sb3.append("]");
            return sb3.toString();
        }

        public iobyxmoadg(hcddaimhww hcddaimhwwVar, hcddaimhww hcddaimhwwVar2) {
            this.f109526iobyxmoadg = (hcddaimhww) y2.iobyxmoadg.eablkybsjg(hcddaimhwwVar);
            this.f109527zoijcleaow = (hcddaimhww) y2.iobyxmoadg.eablkybsjg(hcddaimhwwVar2);
        }
    }

    public static class zoijcleaow implements pkzmftpjix {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f109528iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final iobyxmoadg f109529zoijcleaow;

        public zoijcleaow(long j13) {
            this(j13, 0L);
        }

        @Override // t3.pkzmftpjix
        public long gtknphoqwx() {
            return this.f109528iobyxmoadg;
        }

        @Override // t3.pkzmftpjix
        public boolean lqeggnwhkg() {
            return false;
        }

        @Override // t3.pkzmftpjix
        public iobyxmoadg wkgbmnqykc(long j13) {
            return this.f109529zoijcleaow;
        }

        public zoijcleaow(long j13, long j14) {
            this.f109528iobyxmoadg = j13;
            this.f109529zoijcleaow = new iobyxmoadg(j14 == 0 ? hcddaimhww.f109431ppxfxbqfkf : new hcddaimhww(0L, j14));
        }
    }

    long gtknphoqwx();

    boolean lqeggnwhkg();

    iobyxmoadg wkgbmnqykc(long j13);
}
