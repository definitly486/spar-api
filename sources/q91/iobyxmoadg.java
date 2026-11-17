package q91;

import b31.ppxfxbqfkf;
import kotlin.jvm.internal.gtknphoqwx;
import vk0.lqeggnwhkg;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'iwizpuwonk' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f78338cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ iobyxmoadg[] f78339esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f78340iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f78341lereixgezr;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f78342jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f78343yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f78344zdlpuopuiu;

    static {
        int i13 = lqeggnwhkg.proloyalty_pickup_delivery;
        int i14 = ppxfxbqfkf.colorAdditional1;
        f78340iwizpuwonk = new iobyxmoadg("ORDER_AND_PICK_UP", 0, i13, i14, i14);
        f78338cqumvgiudr = new iobyxmoadg("UNDEFINED", 1, lqeggnwhkg.proloyalty_shop_service_undefined, 0, 0, 6, null);
        iobyxmoadg[] iobyxmoadgVarArrIobyxmoadg = iobyxmoadg();
        f78339esjtqupxsv = iobyxmoadgVarArrIobyxmoadg;
        f78341lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadgVarArrIobyxmoadg);
    }

    private iobyxmoadg(String str, int i13, int i14, int i15, int i16) {
        super(str, i13);
        this.f78344zdlpuopuiu = i14;
        this.f78343yggfygwlhe = i15;
        this.f78342jyumaefscl = i16;
    }

    private static final /* synthetic */ iobyxmoadg[] iobyxmoadg() {
        return new iobyxmoadg[]{f78340iwizpuwonk, f78338cqumvgiudr};
    }

    public static iobyxmoadg valueOf(String str) {
        return (iobyxmoadg) Enum.valueOf(iobyxmoadg.class, str);
    }

    public static iobyxmoadg[] values() {
        return (iobyxmoadg[]) f78339esjtqupxsv.clone();
    }

    public final int lqeggnwhkg() {
        return this.f78343yggfygwlhe;
    }

    public final int nufgyqmvbu() {
        return this.f78344zdlpuopuiu;
    }

    public final int wkgbmnqykc() {
        return this.f78342jyumaefscl;
    }

    /* synthetic */ iobyxmoadg(String str, int i13, int i14, int i15, int i16, int i17, gtknphoqwx gtknphoqwxVar) {
        this(str, i13, i14, (i17 & 2) != 0 ? lqeggnwhkg.iobyxmoadg.colorPrimary : i15, (i17 & 4) != 0 ? lqeggnwhkg.iobyxmoadg.colorPrimary : i16);
    }
}
