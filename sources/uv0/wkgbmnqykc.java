package uv0;

import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public enum wkgbmnqykc {
    WEEK("week"),
    FOR_HOME("for_home"),
    NEW("new"),
    POPULAR("popular_mp"),
    SEASONAL("seasonal"),
    BLOCK_07("block_07"),
    BLOCK_08("block_08"),
    BLOCK_09("block_09"),
    BLOCK_10("block_10"),
    BLOCK_11("block_11");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f114499zdlpuopuiu;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f114494lmojexxdyd = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f114497yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final wkgbmnqykc iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = wkgbmnqykc.wkgbmnqykc().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (zdlpuopuiu.eablkybsjg(((wkgbmnqykc) next).lqeggnwhkg(), value)) {
                    return (wkgbmnqykc) next;
                }
            }
            next = null;
            return (wkgbmnqykc) next;
        }

        private iobyxmoadg() {
        }
    }

    wkgbmnqykc(String str) {
        this.f114499zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f114494lmojexxdyd;
    }

    public final String lqeggnwhkg() {
        return this.f114499zdlpuopuiu;
    }
}
