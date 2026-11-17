package i10;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public enum ppxfxbqfkf {
    GOOGLE,
    HUAWEI,
    UNDEFINED;


    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f41695esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f41699zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg(String serverPlatform) {
            zdlpuopuiu.btonecajqb(serverPlatform, "serverPlatform");
            if (zdlpuopuiu.eablkybsjg(serverPlatform, "google")) {
                return ppxfxbqfkf.GOOGLE;
            }
            return zdlpuopuiu.eablkybsjg(serverPlatform, "huawei") ? ppxfxbqfkf.HUAWEI : ppxfxbqfkf.UNDEFINED;
        }

        private iobyxmoadg() {
        }
    }
}
