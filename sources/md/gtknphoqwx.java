package md;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    long f66816zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final gtknphoqwx f66815yggfygwlhe = new iobyxmoadg("TERABYTES", 0, 1099511627776L);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final gtknphoqwx f66813jyumaefscl = new gtknphoqwx("GIGABYTES", 1, 1073741824) { // from class: md.gtknphoqwx.zoijcleaow
        {
            iobyxmoadg iobyxmoadgVar = null;
        }
    };

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final gtknphoqwx f66812iwizpuwonk = new gtknphoqwx("MEGABYTES", 2, 1048576) { // from class: md.gtknphoqwx.ppxfxbqfkf
        {
            iobyxmoadg iobyxmoadgVar = null;
        }
    };

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final gtknphoqwx f66810cqumvgiudr = new gtknphoqwx("KILOBYTES", 3, 1024) { // from class: md.gtknphoqwx.wkgbmnqykc
        {
            iobyxmoadg iobyxmoadgVar = null;
        }
    };

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final gtknphoqwx f66811esjtqupxsv = new gtknphoqwx("BYTES", 4, 1) { // from class: md.gtknphoqwx.eablkybsjg
        {
            iobyxmoadg iobyxmoadgVar = null;
        }
    };

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ gtknphoqwx[] f66814lereixgezr = iobyxmoadg();

    final enum iobyxmoadg extends gtknphoqwx {
        iobyxmoadg(String str, int i13, long j13) {
            super(str, i13, j13, null);
        }
    }

    /* synthetic */ gtknphoqwx(String str, int i13, long j13, iobyxmoadg iobyxmoadgVar) {
        this(str, i13, j13);
    }

    private static /* synthetic */ gtknphoqwx[] iobyxmoadg() {
        return new gtknphoqwx[]{f66815yggfygwlhe, f66813jyumaefscl, f66812iwizpuwonk, f66810cqumvgiudr, f66811esjtqupxsv};
    }

    public static gtknphoqwx valueOf(String str) {
        return (gtknphoqwx) Enum.valueOf(gtknphoqwx.class, str);
    }

    public static gtknphoqwx[] values() {
        return (gtknphoqwx[]) f66814lereixgezr.clone();
    }

    public long wkgbmnqykc(long j13) {
        return (j13 * this.f66816zdlpuopuiu) / f66810cqumvgiudr.f66816zdlpuopuiu;
    }

    private gtknphoqwx(String str, int i13, long j13) {
        super(str, i13);
        this.f66816zdlpuopuiu = j13;
    }
}
