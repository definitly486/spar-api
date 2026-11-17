package v0;

import w0.iwizpuwonk;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f114990ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final kcexrzcfyt f114991wkgbmnqykc = new kcexrzcfyt(0, 0, 3, null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f114992iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f114993zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final kcexrzcfyt iobyxmoadg() {
            return kcexrzcfyt.f114991wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ kcexrzcfyt(long j13, long j14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, j14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return w0.jyumaefscl.eablkybsjg(this.f114992iobyxmoadg, kcexrzcfytVar.f114992iobyxmoadg) && w0.jyumaefscl.eablkybsjg(this.f114993zoijcleaow, kcexrzcfytVar.f114993zoijcleaow);
    }

    public int hashCode() {
        return (w0.jyumaefscl.dxjokdxxww(this.f114992iobyxmoadg) * 31) + w0.jyumaefscl.dxjokdxxww(this.f114993zoijcleaow);
    }

    public final long ppxfxbqfkf() {
        return this.f114993zoijcleaow;
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) w0.jyumaefscl.btonecajqb(this.f114992iobyxmoadg)) + ", restLine=" + ((Object) w0.jyumaefscl.btonecajqb(this.f114993zoijcleaow)) + ')';
    }

    public final long zoijcleaow() {
        return this.f114992iobyxmoadg;
    }

    private kcexrzcfyt(long j13, long j14) {
        this.f114992iobyxmoadg = j13;
        this.f114993zoijcleaow = j14;
    }

    public /* synthetic */ kcexrzcfyt(long j13, long j14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? iwizpuwonk.dxjokdxxww(0) : j13, (i13 & 2) != 0 ? iwizpuwonk.dxjokdxxww(0) : j14, null);
    }
}
