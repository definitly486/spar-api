package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ppxfxbqfkf f9465iobyxmoadg = new ppxfxbqfkf(null);

    public enum iobyxmoadg {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        private static final /* synthetic */ ng.iobyxmoadg $ENTRIES = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
        public static final C0147iobyxmoadg Companion = new C0147iobyxmoadg(null);

        /* JADX INFO: renamed from: androidx.lifecycle.gtknphoqwx$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0147iobyxmoadg {

            /* JADX INFO: renamed from: androidx.lifecycle.gtknphoqwx$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public /* synthetic */ class C0148iobyxmoadg {

                /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
                public static final /* synthetic */ int[] f9466iobyxmoadg;

                static {
                    int[] iArr = new int[zoijcleaow.values().length];
                    try {
                        iArr[zoijcleaow.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[zoijcleaow.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[zoijcleaow.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[zoijcleaow.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[zoijcleaow.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f9466iobyxmoadg = iArr;
                }
            }

            public /* synthetic */ C0147iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final iobyxmoadg iobyxmoadg(zoijcleaow state) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                int i13 = C0148iobyxmoadg.f9466iobyxmoadg[state.ordinal()];
                if (i13 == 1) {
                    return iobyxmoadg.ON_DESTROY;
                }
                if (i13 == 2) {
                    return iobyxmoadg.ON_STOP;
                }
                if (i13 != 3) {
                    return null;
                }
                return iobyxmoadg.ON_PAUSE;
            }

            public final iobyxmoadg ppxfxbqfkf(zoijcleaow state) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                int i13 = C0148iobyxmoadg.f9466iobyxmoadg[state.ordinal()];
                if (i13 == 1) {
                    return iobyxmoadg.ON_CREATE;
                }
                if (i13 == 2) {
                    return iobyxmoadg.ON_START;
                }
                if (i13 != 3) {
                    return null;
                }
                return iobyxmoadg.ON_RESUME;
            }

            public final iobyxmoadg zoijcleaow(zoijcleaow state) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                int i13 = C0148iobyxmoadg.f9466iobyxmoadg[state.ordinal()];
                if (i13 == 1) {
                    return iobyxmoadg.ON_START;
                }
                if (i13 == 2) {
                    return iobyxmoadg.ON_RESUME;
                }
                if (i13 != 5) {
                    return null;
                }
                return iobyxmoadg.ON_CREATE;
            }

            private C0147iobyxmoadg() {
            }
        }

        public /* synthetic */ class zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f9467iobyxmoadg;

            static {
                int[] iArr = new int[iobyxmoadg.values().length];
                try {
                    iArr[iobyxmoadg.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[iobyxmoadg.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[iobyxmoadg.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[iobyxmoadg.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[iobyxmoadg.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[iobyxmoadg.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[iobyxmoadg.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f9467iobyxmoadg = iArr;
            }
        }

        public static final iobyxmoadg nufgyqmvbu(zoijcleaow zoijcleaowVar) {
            return Companion.ppxfxbqfkf(zoijcleaowVar);
        }

        public static final iobyxmoadg wkgbmnqykc(zoijcleaow zoijcleaowVar) {
            return Companion.iobyxmoadg(zoijcleaowVar);
        }

        public final zoijcleaow lqeggnwhkg() {
            switch (zoijcleaow.f9467iobyxmoadg[ordinal()]) {
                case 1:
                case 2:
                    return zoijcleaow.CREATED;
                case 3:
                case 4:
                    return zoijcleaow.STARTED;
                case 5:
                    return zoijcleaow.RESUMED;
                case 6:
                    return zoijcleaow.DESTROYED;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public enum zoijcleaow {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;


        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f9472lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        public final boolean wkgbmnqykc(zoijcleaow state) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar);

    public final ppxfxbqfkf ppxfxbqfkf() {
        return this.f9465iobyxmoadg;
    }

    public abstract void wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar);

    public abstract zoijcleaow zoijcleaow();
}
