package hh;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public enum ppxfxbqfkf {
    Function,
    SuspendFunction,
    KFunction,
    KSuspendFunction,
    UNKNOWN;


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f40315pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f40317zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg(gxszxtbevo functionTypeKind) {
            zdlpuopuiu.btonecajqb(functionTypeKind, "functionTypeKind");
            if (zdlpuopuiu.eablkybsjg(functionTypeKind, gxszxtbevo.iobyxmoadg.f40298eablkybsjg)) {
                return ppxfxbqfkf.Function;
            }
            if (zdlpuopuiu.eablkybsjg(functionTypeKind, gxszxtbevo.wkgbmnqykc.f40300eablkybsjg)) {
                return ppxfxbqfkf.SuspendFunction;
            }
            if (zdlpuopuiu.eablkybsjg(functionTypeKind, gxszxtbevo.zoijcleaow.f40301eablkybsjg)) {
                return ppxfxbqfkf.KFunction;
            }
            return zdlpuopuiu.eablkybsjg(functionTypeKind, gxszxtbevo.ppxfxbqfkf.f40299eablkybsjg) ? ppxfxbqfkf.KSuspendFunction : ppxfxbqfkf.UNKNOWN;
        }

        private iobyxmoadg() {
        }
    }
}
