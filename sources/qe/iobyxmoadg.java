package qe;

import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import oe.wkgbmnqykc;
import pe.ppxfxbqfkf;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements wkgbmnqykc {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f78660wkgbmnqykc = new C1760iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final AtomicReference f78661iobyxmoadg = new AtomicReference();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f78662ppxfxbqfkf = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f78663zoijcleaow;

    /* JADX INFO: renamed from: qe.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C1760iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Executor f78664iobyxmoadg;

        public iobyxmoadg iobyxmoadg() {
            return new iobyxmoadg(this.f78664iobyxmoadg, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile");
        }
    }

    public iobyxmoadg(Executor executor, String str) {
        this.f78663zoijcleaow = executor;
    }

    @Override // oe.wkgbmnqykc
    public final String dxjokdxxww() {
        return "optional-module-text-latin";
    }

    @Override // oe.wkgbmnqykc
    public final int eablkybsjg() {
        return wkgbmnqykc() ? 24317 : 24306;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iobyxmoadg) {
            return Objects.equal(this.f78663zoijcleaow, ((iobyxmoadg) obj).f78663zoijcleaow);
        }
        return false;
    }

    @Override // oe.wkgbmnqykc
    public final String gxszxtbevo() {
        return true != wkgbmnqykc() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin";
    }

    public int hashCode() {
        return Objects.hashCode(this.f78663zoijcleaow);
    }

    @Override // oe.wkgbmnqykc
    public final Executor iobyxmoadg() {
        return this.f78663zoijcleaow;
    }

    @Override // oe.wkgbmnqykc
    public final String lqeggnwhkg() {
        return "en";
    }

    @Override // oe.wkgbmnqykc
    public final int nufgyqmvbu() {
        return 1;
    }

    @Override // oe.wkgbmnqykc
    public final String ppxfxbqfkf() {
        return this.f78662ppxfxbqfkf;
    }

    @Override // oe.wkgbmnqykc
    public final boolean wkgbmnqykc() {
        return ppxfxbqfkf.iobyxmoadg(this.f78661iobyxmoadg, "com.google.mlkit.dynamite.text.latin");
    }

    @Override // oe.wkgbmnqykc
    public final String zoijcleaow() {
        return true != wkgbmnqykc() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }
}
