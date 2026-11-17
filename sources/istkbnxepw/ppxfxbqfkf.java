package istkbnxepw;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends jlmebxxoox {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Surface f49402iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f49403ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Size f49404zoijcleaow;

    ppxfxbqfkf(Surface surface, Size size, int i13) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f49402iobyxmoadg = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f49404zoijcleaow = size;
        this.f49403ppxfxbqfkf = i13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jlmebxxoox)) {
            return false;
        }
        jlmebxxoox jlmebxxooxVar = (jlmebxxoox) obj;
        return this.f49402iobyxmoadg.equals(jlmebxxooxVar.wkgbmnqykc()) && this.f49404zoijcleaow.equals(jlmebxxooxVar.ppxfxbqfkf()) && this.f49403ppxfxbqfkf == jlmebxxooxVar.zoijcleaow();
    }

    public int hashCode() {
        return ((((this.f49402iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f49404zoijcleaow.hashCode()) * 1000003) ^ this.f49403ppxfxbqfkf;
    }

    @Override // istkbnxepw.jlmebxxoox
    public Size ppxfxbqfkf() {
        return this.f49404zoijcleaow;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f49402iobyxmoadg + ", size=" + this.f49404zoijcleaow + ", imageFormat=" + this.f49403ppxfxbqfkf + "}";
    }

    @Override // istkbnxepw.jlmebxxoox
    public Surface wkgbmnqykc() {
        return this.f49402iobyxmoadg;
    }

    @Override // istkbnxepw.jlmebxxoox
    public int zoijcleaow() {
        return this.f49403ppxfxbqfkf;
    }
}
