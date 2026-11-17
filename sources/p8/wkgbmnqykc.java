package p8;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc implements p8.iobyxmoadg.InterfaceC1675iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f76007iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f76008zoijcleaow;

    public interface iobyxmoadg {
        File iobyxmoadg();
    }

    public wkgbmnqykc(iobyxmoadg iobyxmoadgVar, long j13) {
        this.f76007iobyxmoadg = j13;
        this.f76008zoijcleaow = iobyxmoadgVar;
    }

    @Override // p8.iobyxmoadg.InterfaceC1675iobyxmoadg
    public p8.iobyxmoadg build() {
        File fileIobyxmoadg = this.f76008zoijcleaow.iobyxmoadg();
        if (fileIobyxmoadg == null) {
            return null;
        }
        if (fileIobyxmoadg.isDirectory() || fileIobyxmoadg.mkdirs()) {
            return eablkybsjg.ppxfxbqfkf(fileIobyxmoadg, this.f76007iobyxmoadg);
        }
        return null;
    }
}
