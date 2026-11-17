package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final boolean f11453cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final int f11454iwizpuwonk;

    public MediaCodecVideoDecoderException(Throwable th2, androidx.media3.exoplayer.mediacodec.btonecajqb btonecajqbVar, Surface surface) {
        super(th2, btonecajqbVar);
        this.f11454iwizpuwonk = System.identityHashCode(surface);
        this.f11453cqumvgiudr = surface == null || surface.isValid();
    }
}
