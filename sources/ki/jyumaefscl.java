package ki;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public enum jyumaefscl {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final Set f55578iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final Set f55580jyumaefscl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final boolean f55590zdlpuopuiu;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f55575hkdspvbjdz = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f55587yggfygwlhe = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static {
        jyumaefscl[] jyumaefsclVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (jyumaefscl jyumaefsclVar : jyumaefsclVarArrValues) {
            if (jyumaefsclVar.f55590zdlpuopuiu) {
                arrayList.add(jyumaefsclVar);
            }
        }
        f55580jyumaefscl = hg.jyumaefscl.r(arrayList);
        f55578iwizpuwonk = hg.agtfadlqog.u(values());
    }

    jyumaefscl(boolean z13) {
        this.f55590zdlpuopuiu = z13;
    }
}
