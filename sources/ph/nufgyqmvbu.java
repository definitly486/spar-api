package ph;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu implements zh.zoijcleaow {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f76594zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ii.gxszxtbevo f76595iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final nufgyqmvbu iobyxmoadg(Object value, ii.gxszxtbevo gxszxtbevoVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            if (gxszxtbevo.draadjrbmk(value.getClass())) {
                return new jyumaefscl(gxszxtbevoVar, (Enum) value);
            }
            if (value instanceof Annotation) {
                return new dxjokdxxww(gxszxtbevoVar, (Annotation) value);
            }
            if (value instanceof Object[]) {
                return new draadjrbmk(gxszxtbevoVar, (Object[]) value);
            }
            return value instanceof Class ? new oxmwwwfdhm(gxszxtbevoVar, (Class) value) : new cqumvgiudr(gxszxtbevoVar, value);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ nufgyqmvbu(ii.gxszxtbevo gxszxtbevoVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(gxszxtbevoVar);
    }

    @Override // zh.zoijcleaow
    public ii.gxszxtbevo getName() {
        return this.f76595iobyxmoadg;
    }

    private nufgyqmvbu(ii.gxszxtbevo gxszxtbevoVar) {
        this.f76595iobyxmoadg = gxszxtbevoVar;
    }
}
