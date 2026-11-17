package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class oxmwwwfdhm implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MediaCodec f10847iobyxmoadg;

    public oxmwwwfdhm(MediaCodec mediaCodec) {
        this.f10847iobyxmoadg = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void iobyxmoadg(int i13, int i14, e3.ppxfxbqfkf ppxfxbqfkfVar, long j13, int i15) {
        this.f10847iobyxmoadg.queueSecureInputBuffer(i13, i14, ppxfxbqfkfVar.iobyxmoadg(), j13, i15);
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void ppxfxbqfkf(Bundle bundle) {
        this.f10847iobyxmoadg.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void start() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void wkgbmnqykc() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.dxjokdxxww
    public void zoijcleaow(int i13, int i14, int i15, long j13, int i16) {
        this.f10847iobyxmoadg.queueInputBuffer(i13, i14, i15, j13, i16);
    }
}
