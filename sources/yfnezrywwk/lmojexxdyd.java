package yfnezrywwk;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lmojexxdyd extends androidx.compose.foundation.lazy.layout.stevsuqkhv {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.jpowsppfya f124826ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f124827wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ojitshcjhn f124828zoijcleaow;

    public /* synthetic */ lmojexxdyd(long j13, boolean z13, ojitshcjhn ojitshcjhnVar, androidx.compose.foundation.lazy.layout.jpowsppfya jpowsppfyaVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, z13, ojitshcjhnVar, jpowsppfyaVar);
    }

    public static /* synthetic */ iozdgvuglv gxszxtbevo(lmojexxdyd lmojexxdydVar, int i13, long j13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i14 & 2) != 0) {
            j13 = lmojexxdydVar.f124827wkgbmnqykc;
        }
        return lmojexxdydVar.eablkybsjg(i13, j13);
    }

    public final androidx.compose.foundation.lazy.layout.yadqdtsiqt dxjokdxxww() {
        return this.f124828zoijcleaow.zoijcleaow();
    }

    public final iozdgvuglv eablkybsjg(int i13, long j13) {
        return ppxfxbqfkf(i13, this.f124828zoijcleaow.wkgbmnqykc(i13), this.f124828zoijcleaow.gxszxtbevo(i13), zoijcleaow(this.f124826ppxfxbqfkf, i13, j13), j13);
    }

    public final long lqeggnwhkg() {
        return this.f124827wkgbmnqykc;
    }

    public final androidx.collection.wflxmlrfwp nufgyqmvbu() {
        return this.f124828zoijcleaow.eablkybsjg();
    }

    public abstract iozdgvuglv ppxfxbqfkf(int i13, Object obj, Object obj2, List list, long j13);

    @Override // androidx.compose.foundation.lazy.layout.stevsuqkhv
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public iozdgvuglv iobyxmoadg(int i13, int i14, int i15, long j13) {
        return eablkybsjg(i13, j13);
    }

    private lmojexxdyd(long j13, boolean z13, ojitshcjhn ojitshcjhnVar, androidx.compose.foundation.lazy.layout.jpowsppfya jpowsppfyaVar) {
        this.f124828zoijcleaow = ojitshcjhnVar;
        this.f124826ppxfxbqfkf = jpowsppfyaVar;
        this.f124827wkgbmnqykc = w0.ppxfxbqfkf.zoijcleaow(0, z13 ? w0.zoijcleaow.draadjrbmk(j13) : Integer.MAX_VALUE, 0, z13 ? Integer.MAX_VALUE : w0.zoijcleaow.gtknphoqwx(j13), 5, null);
    }
}
