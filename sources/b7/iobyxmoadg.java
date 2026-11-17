package b7;

import e7.draadjrbmk;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f15429iobyxmoadg;

    public iobyxmoadg(boolean z13) {
        this.f15429iobyxmoadg = z13;
    }

    @Override // b7.zoijcleaow
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(File file, draadjrbmk draadjrbmkVar) {
        if (!this.f15429iobyxmoadg) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
