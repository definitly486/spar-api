package lr0;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public enum zoijcleaow {
    MALE("male"),
    FEMALE("female"),
    NONE("");


    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f63922lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f63923yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f63924zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow iobyxmoadg(String code) {
            Object next;
            String lowerCase;
            String lowerCase2;
            zdlpuopuiu.btonecajqb(code, "code");
            Iterator<E> it = zoijcleaow.lqeggnwhkg().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String strWkgbmnqykc = ((zoijcleaow) next).wkgbmnqykc();
                Locale locale = Locale.ROOT;
                lowerCase = strWkgbmnqykc.toLowerCase(locale);
                zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
                lowerCase2 = code.toLowerCase(locale);
                zdlpuopuiu.dxjokdxxww(lowerCase2, "toLowerCase(...)");
            } while (!zdlpuopuiu.eablkybsjg(lowerCase, lowerCase2));
            zoijcleaow zoijcleaowVar = (zoijcleaow) next;
            return zoijcleaowVar == null ? zoijcleaow.NONE : zoijcleaowVar;
        }

        private iobyxmoadg() {
        }
    }

    zoijcleaow(String str) {
        this.f63924zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg lqeggnwhkg() {
        return f63922lereixgezr;
    }

    public final String wkgbmnqykc() {
        return this.f63924zdlpuopuiu;
    }
}
