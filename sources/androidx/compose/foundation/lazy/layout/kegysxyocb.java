package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.i1;
import androidx.compose.runtime.v0;

/* JADX INFO: loaded from: classes.dex */
public final class kegysxyocb implements i1 {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final iobyxmoadg f5050cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f5051iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final androidx.compose.runtime.iwxlajgraz f5052jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f5053yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f5054zdlpuopuiu;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final zg.btonecajqb zoijcleaow(int i13, int i14, int i15) {
            int i16 = (i13 / i14) * i14;
            return zg.gtknphoqwx.jyumaefscl(Math.max(i16 - i15, 0), i16 + i14 + i15);
        }

        private iobyxmoadg() {
        }
    }

    public kegysxyocb(int i13, int i14, int i15) {
        this.f5054zdlpuopuiu = i14;
        this.f5053yggfygwlhe = i15;
        this.f5052jyumaefscl = v0.lqeggnwhkg(f5050cqumvgiudr.zoijcleaow(i13, i14, i15), v0.rgvfuqvkyq());
        this.f5051iwizpuwonk = i13;
    }

    private void wkgbmnqykc(zg.btonecajqb btonecajqbVar) {
        this.f5052jyumaefscl.setValue(btonecajqbVar);
    }

    public final void draadjrbmk(int i13) {
        if (i13 != this.f5051iwizpuwonk) {
            this.f5051iwizpuwonk = i13;
            wkgbmnqykc(f5050cqumvgiudr.zoijcleaow(i13, this.f5054zdlpuopuiu, this.f5053yggfygwlhe));
        }
    }

    @Override // androidx.compose.runtime.i1
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public zg.btonecajqb getValue() {
        return (zg.btonecajqb) this.f5052jyumaefscl.getValue();
    }
}
