package yz0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public enum iobyxmoadg {
    GOOGLE("google"),
    HUAWEI("huawei"),
    RUSTORE("rustore");


    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f126876lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C3247iobyxmoadg f126877yggfygwlhe = new C3247iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f126878zdlpuopuiu;

    /* JADX INFO: renamed from: yz0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3247iobyxmoadg {
        public /* synthetic */ C3247iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
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

        private C3247iobyxmoadg() {
        }
    }

    iobyxmoadg(String str) {
        this.f126878zdlpuopuiu = str;
    }

    public final String wkgbmnqykc() {
        return this.f126878zdlpuopuiu;
    }
}
