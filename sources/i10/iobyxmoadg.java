package i10;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public enum iobyxmoadg {
    GOOGLE("google"),
    HUAWEI("huawei"),
    RUSTORE("rustore");


    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f41691lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C0975iobyxmoadg f41692yggfygwlhe = new C0975iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f41693zdlpuopuiu;

    /* JADX INFO: renamed from: i10.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0975iobyxmoadg {
        public /* synthetic */ C0975iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final iobyxmoadg iobyxmoadg(String serverPlatform) {
            zdlpuopuiu.btonecajqb(serverPlatform, "serverPlatform");
            for (iobyxmoadg iobyxmoadgVar : iobyxmoadg.values()) {
                if (zdlpuopuiu.eablkybsjg(iobyxmoadgVar.wkgbmnqykc(), serverPlatform)) {
                    if (iobyxmoadgVar == null) {
                        return iobyxmoadg.GOOGLE;
                    }
                    return iobyxmoadgVar;
                }
            }
            iobyxmoadgVar = null;
            if (iobyxmoadgVar == null) {
                return iobyxmoadg.GOOGLE;
            }
            return iobyxmoadgVar;
        }

        private C0975iobyxmoadg() {
        }
    }

    iobyxmoadg(String str) {
        this.f41693zdlpuopuiu = str;
    }

    public final String wkgbmnqykc() {
        return this.f41693zdlpuopuiu;
    }
}
