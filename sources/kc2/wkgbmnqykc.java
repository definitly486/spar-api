package kc2;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'iwizpuwonk' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final wkgbmnqykc f54570cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final wkgbmnqykc f54571esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final wkgbmnqykc f54572iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final wkgbmnqykc f54573jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final wkgbmnqykc f54574lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ wkgbmnqykc[] f54575pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final wkgbmnqykc f54576yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f54577zdlpuopuiu;

    static {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc("CACHE_DISABLED", 0, 0L);
        f54576yggfygwlhe = wkgbmnqykcVar;
        wkgbmnqykc wkgbmnqykcVar2 = new wkgbmnqykc("TWENTY_SECONDS", 1, TimeUnit.SECONDS.toMillis(20L));
        f54573jyumaefscl = wkgbmnqykcVar2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        wkgbmnqykc wkgbmnqykcVar3 = new wkgbmnqykc("ONE_DAY", 2, timeUnit.toMillis(1L));
        f54572iwizpuwonk = wkgbmnqykcVar3;
        wkgbmnqykc wkgbmnqykcVar4 = new wkgbmnqykc("TWO_DAYS", 3, timeUnit.toMillis(2L));
        f54570cqumvgiudr = wkgbmnqykcVar4;
        wkgbmnqykc wkgbmnqykcVar5 = new wkgbmnqykc("THREE_DAYS", 4, timeUnit.toMillis(3L));
        f54571esjtqupxsv = wkgbmnqykcVar5;
        wkgbmnqykc wkgbmnqykcVar6 = new wkgbmnqykc("FOUR_DAYS", 5, timeUnit.toMillis(4L));
        f54574lereixgezr = wkgbmnqykcVar6;
        f54575pmvmpeiblj = new wkgbmnqykc[]{wkgbmnqykcVar, wkgbmnqykcVar2, wkgbmnqykcVar3, wkgbmnqykcVar4, wkgbmnqykcVar5, wkgbmnqykcVar6};
    }

    private wkgbmnqykc(String str, int i13, long j13) {
        super(str, i13);
        this.f54577zdlpuopuiu = j13;
    }

    public static wkgbmnqykc valueOf(String str) {
        return (wkgbmnqykc) Enum.valueOf(wkgbmnqykc.class, str);
    }

    public static wkgbmnqykc[] values() {
        return (wkgbmnqykc[]) f54575pmvmpeiblj.clone();
    }

    public long iobyxmoadg() {
        return this.f54577zdlpuopuiu;
    }
}
