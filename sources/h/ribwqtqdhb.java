package h;

import android.graphics.ColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class ribwqtqdhb extends androidx.compose.ui.graphics.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f38951ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f38952wkgbmnqykc;

    public /* synthetic */ ribwqtqdhb(long j13, int i13, ColorFilter colorFilter, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, i13, colorFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ribwqtqdhb)) {
            return false;
        }
        ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) obj;
        return oipsdeybqn.ojitshcjhn(this.f38951ppxfxbqfkf, ribwqtqdhbVar.f38951ppxfxbqfkf) && androidx.compose.ui.graphics.ppxfxbqfkf.yadqdtsiqt(this.f38952wkgbmnqykc, ribwqtqdhbVar.f38952wkgbmnqykc);
    }

    public int hashCode() {
        return (oipsdeybqn.yggfygwlhe(this.f38951ppxfxbqfkf) * 31) + androidx.compose.ui.graphics.ppxfxbqfkf.iozdgvuglv(this.f38952wkgbmnqykc);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) oipsdeybqn.jyumaefscl(this.f38951ppxfxbqfkf)) + ", blendMode=" + ((Object) androidx.compose.ui.graphics.ppxfxbqfkf.lmojexxdyd(this.f38952wkgbmnqykc)) + ')';
    }

    public final int zoijcleaow() {
        return this.f38952wkgbmnqykc;
    }

    public /* synthetic */ ribwqtqdhb(long j13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, i13);
    }

    private ribwqtqdhb(long j13, int i13, ColorFilter colorFilter) {
        super(colorFilter);
        this.f38951ppxfxbqfkf = j13;
        this.f38952wkgbmnqykc = i13;
    }

    private ribwqtqdhb(long j13, int i13) {
        this(j13, i13, iozdgvuglv.iobyxmoadg(j13, i13), null);
    }
}
