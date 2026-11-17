package pj;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public interface auzgnhcxok extends lg.btonecajqb.zoijcleaow {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final zoijcleaow f76671gtknphoqwx = zoijcleaow.f76672zdlpuopuiu;

    public static final class iobyxmoadg {
        public static lg.btonecajqb eablkybsjg(auzgnhcxok auzgnhcxokVar, lg.btonecajqb btonecajqbVar) {
            return lg.btonecajqb.zoijcleaow.iobyxmoadg.wkgbmnqykc(auzgnhcxokVar, btonecajqbVar);
        }

        public static /* synthetic */ void iobyxmoadg(auzgnhcxok auzgnhcxokVar, CancellationException cancellationException, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i13 & 1) != 0) {
                cancellationException = null;
            }
            auzgnhcxokVar.nufgyqmvbu(cancellationException);
        }

        public static lg.btonecajqb.zoijcleaow ppxfxbqfkf(auzgnhcxok auzgnhcxokVar, lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
            return lg.btonecajqb.zoijcleaow.iobyxmoadg.zoijcleaow(auzgnhcxokVar, ppxfxbqfkfVar);
        }

        public static lg.btonecajqb wkgbmnqykc(auzgnhcxok auzgnhcxokVar, lg.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
            return lg.btonecajqb.zoijcleaow.iobyxmoadg.ppxfxbqfkf(auzgnhcxokVar, ppxfxbqfkfVar);
        }

        public static Object zoijcleaow(auzgnhcxok auzgnhcxokVar, Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            return lg.btonecajqb.zoijcleaow.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, obj, rgvfuqvkyqVar);
        }
    }

    public static final class zoijcleaow implements lg.btonecajqb.ppxfxbqfkf {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        static final /* synthetic */ zoijcleaow f76672zdlpuopuiu = new zoijcleaow();

        private zoijcleaow() {
        }
    }

    boolean agtfadlqog();

    lj.btonecajqb iobyxmoadg();

    boolean isActive();

    boolean isCancelled();

    jztzpxfvev kegysxyocb(boolean z13, boolean z14, tg.draadjrbmk draadjrbmkVar);

    void nufgyqmvbu(CancellationException cancellationException);

    jztzpxfvev pmvmpeiblj(tg.draadjrbmk draadjrbmkVar);

    boolean start();

    CancellationException vdvldrhtss();

    yggfygwlhe wwaezpbzkn(iwizpuwonk iwizpuwonkVar);

    Object wypolnanlu(lg.gxszxtbevo gxszxtbevoVar);
}
