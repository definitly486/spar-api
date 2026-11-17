package s21;

import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public enum zoijcleaow {
    PROD("Prod"),
    PREPROD("Preprod"),
    DEV("Dev"),
    TEST("Test");


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f105220pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f105221yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f105222zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zoijcleaow iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = zoijcleaow.lqeggnwhkg().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((zoijcleaow) next).wkgbmnqykc(), value));
            zoijcleaow zoijcleaowVar = (zoijcleaow) next;
            return zoijcleaowVar == null ? zoijcleaow.DEV : zoijcleaowVar;
        }

        private iobyxmoadg() {
        }
    }

    zoijcleaow(String str) {
        this.f105222zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg lqeggnwhkg() {
        return f105220pmvmpeiblj;
    }

    public final String wkgbmnqykc() {
        return this.f105222zdlpuopuiu;
    }
}
