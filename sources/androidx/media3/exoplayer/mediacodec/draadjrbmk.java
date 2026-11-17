package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final draadjrbmk f10812iobyxmoadg = new draadjrbmk() { // from class: k3.rgvfuqvkyq
        @Override // androidx.media3.exoplayer.mediacodec.draadjrbmk
        public final List zoijcleaow(String str, boolean z13, boolean z14) {
            return MediaCodecUtil.gtknphoqwx(str, z13, z14);
        }
    };

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final draadjrbmk f10813zoijcleaow = new draadjrbmk() { // from class: k3.vdvldrhtss
        @Override // androidx.media3.exoplayer.mediacodec.draadjrbmk
        public final List zoijcleaow(String str, boolean z13, boolean z14) {
            return androidx.media3.exoplayer.mediacodec.draadjrbmk.ppxfxbqfkf(str, z13, z14);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ List ppxfxbqfkf(String str, boolean z13, boolean z14) {
        return MediaCodecUtil.ojitshcjhn(f10812iobyxmoadg.zoijcleaow(str, z13, z14));
    }

    List zoijcleaow(String str, boolean z13, boolean z14);
}
