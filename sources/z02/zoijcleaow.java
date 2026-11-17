package z02;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public enum zoijcleaow {
    ONE_STAR(1.0f, "Очень плохо"),
    TWO_STAR(2.0f, "Плохо"),
    THREE_STAR(3.0f, "Нормально"),
    FOUR_STAR(4.0f, "Хорошо"),
    FIVE_STAR(5.0f, "Отлично"),
    UNDEFINED(0.0f, "неопределено");


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f127540yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f127541zdlpuopuiu;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f127531cdpycssgdh = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f127536jyumaefscl = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final zoijcleaow iobyxmoadg(String value) {
            zdlpuopuiu.btonecajqb(value, "value");
            for (zoijcleaow zoijcleaowVar : zoijcleaow.values()) {
                if (zdlpuopuiu.eablkybsjg(zoijcleaowVar.lqeggnwhkg(), value)) {
                    if (zoijcleaowVar == null) {
                        return zoijcleaow.UNDEFINED;
                    }
                    return zoijcleaowVar;
                }
            }
            zoijcleaowVar = null;
            if (zoijcleaowVar == null) {
                return zoijcleaow.UNDEFINED;
            }
            return zoijcleaowVar;
        }

        private iobyxmoadg() {
        }
    }

    zoijcleaow(float f13, String str) {
        this.f127541zdlpuopuiu = f13;
        this.f127540yggfygwlhe = str;
    }

    public final String lqeggnwhkg() {
        return this.f127540yggfygwlhe;
    }

    public final float wkgbmnqykc() {
        return this.f127541zdlpuopuiu;
    }
}
