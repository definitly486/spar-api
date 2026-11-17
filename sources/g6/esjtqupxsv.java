package g6;

/* JADX INFO: loaded from: classes2.dex */
public interface esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow.ppxfxbqfkf f36390iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final zoijcleaow.C0818zoijcleaow f36391zoijcleaow;

    public static abstract class zoijcleaow {

        public static final class iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Throwable f36392iobyxmoadg;

            public iobyxmoadg(Throwable th2) {
                this.f36392iobyxmoadg = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f36392iobyxmoadg.getMessage() + ")";
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {
            public String toString() {
                return "SUCCESS";
            }

            private ppxfxbqfkf() {
            }
        }

        /* JADX INFO: renamed from: g6.esjtqupxsv$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C0818zoijcleaow extends zoijcleaow {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0818zoijcleaow() {
            }
        }

        zoijcleaow() {
        }
    }

    static {
        f36390iobyxmoadg = new zoijcleaow.ppxfxbqfkf();
        f36391zoijcleaow = new zoijcleaow.C0818zoijcleaow();
    }
}
