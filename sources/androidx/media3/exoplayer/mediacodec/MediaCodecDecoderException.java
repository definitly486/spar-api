package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final int f10712jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final String f10713yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final btonecajqb f10714zdlpuopuiu;

    public MediaCodecDecoderException(Throwable th2, btonecajqb btonecajqbVar) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Decoder failed: ");
        sb3.append(btonecajqbVar == null ? null : btonecajqbVar.f10806iobyxmoadg);
        super(sb3.toString(), th2);
        this.f10714zdlpuopuiu = btonecajqbVar;
        String diagnosticInfo = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f10713yggfygwlhe = diagnosticInfo;
        this.f10712jyumaefscl = stevsuqkhv.f123602iobyxmoadg >= 23 ? iobyxmoadg(th2) : stevsuqkhv.jlmebxxoox(diagnosticInfo);
    }

    private static int iobyxmoadg(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
