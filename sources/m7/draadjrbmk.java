package m7;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.v0;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.cqumvgiudr;
import pj.lereixgezr;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk implements gtknphoqwx {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final cqumvgiudr f66287zdlpuopuiu = lereixgezr.zoijcleaow(null, 1, null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final iwxlajgraz f66286yggfygwlhe = c1.ppxfxbqfkf(null, null, 2, null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iwxlajgraz f66284jyumaefscl = c1.ppxfxbqfkf(null, null, 2, null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final i1 f66283iwizpuwonk = v0.eablkybsjg(new ppxfxbqfkf());

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final i1 f66281cqumvgiudr = v0.eablkybsjg(new iobyxmoadg());

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final i1 f66282esjtqupxsv = v0.eablkybsjg(new zoijcleaow());

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final i1 f66285lereixgezr = v0.eablkybsjg(new wkgbmnqykc());

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {
        iobyxmoadg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf((draadjrbmk.this.getValue() == null && draadjrbmk.this.draadjrbmk() == null) ? false : true);
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {
        ppxfxbqfkf() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf(draadjrbmk.this.getValue() == null && draadjrbmk.this.draadjrbmk() == null);
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {
        wkgbmnqykc() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf(draadjrbmk.this.getValue() != null);
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {
        zoijcleaow() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf(draadjrbmk.this.draadjrbmk() != null);
        }
    }

    private void rgvfuqvkyq(Throwable th2) {
        this.f66284jyumaefscl.setValue(th2);
    }

    private void vdvldrhtss(com.airbnb.lottie.btonecajqb btonecajqbVar) {
        this.f66286yggfygwlhe.setValue(btonecajqbVar);
    }

    public boolean agtfadlqog() {
        return ((Boolean) this.f66281cqumvgiudr.getValue()).booleanValue();
    }

    public Throwable draadjrbmk() {
        return (Throwable) this.f66284jyumaefscl.getValue();
    }

    public final synchronized void iobyxmoadg(com.airbnb.lottie.btonecajqb composition) {
        zdlpuopuiu.btonecajqb(composition, "composition");
        if (agtfadlqog()) {
            return;
        }
        vdvldrhtss(composition);
        this.f66287zdlpuopuiu.cqumvgiudr(composition);
    }

    @Override // m7.gtknphoqwx
    public Object lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f66287zdlpuopuiu.lqeggnwhkg(gxszxtbevoVar);
    }

    public boolean ojitshcjhn() {
        return ((Boolean) this.f66285lereixgezr.getValue()).booleanValue();
    }

    public final synchronized void wkgbmnqykc(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        if (agtfadlqog()) {
            return;
        }
        rgvfuqvkyq(error);
        this.f66287zdlpuopuiu.wkgbmnqykc(error);
    }

    @Override // androidx.compose.runtime.i1
    public com.airbnb.lottie.btonecajqb getValue() {
        return (com.airbnb.lottie.btonecajqb) this.f66286yggfygwlhe.getValue();
    }
}
