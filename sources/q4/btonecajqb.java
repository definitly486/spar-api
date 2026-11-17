package q4;

import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb extends e3.gxszxtbevo implements draadjrbmk {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final String f77817ojitshcjhn;

    class iobyxmoadg extends rgvfuqvkyq {
        iobyxmoadg() {
        }

        @Override // e3.eablkybsjg
        public void ojitshcjhn() {
            btonecajqb.this.zdlpuopuiu(this);
        }
    }

    protected btonecajqb(String str) {
        super(new ojitshcjhn[2], new rgvfuqvkyq[2]);
        this.f77817ojitshcjhn = str;
        iwizpuwonk(UserVerificationMethods.USER_VERIFY_ALL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.gxszxtbevo
    /* JADX INFO: renamed from: esjtqupxsv, reason: merged with bridge method [inline-methods] */
    public final ojitshcjhn dxjokdxxww() {
        return new ojitshcjhn();
    }

    protected abstract gtknphoqwx istkbnxepw(byte[] bArr, int i13, boolean z13);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.gxszxtbevo
    /* JADX INFO: renamed from: lereixgezr, reason: merged with bridge method [inline-methods] */
    public final rgvfuqvkyq btonecajqb() {
        return new iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.gxszxtbevo
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException gtknphoqwx(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // q4.draadjrbmk
    public void zoijcleaow(long j13) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e3.gxszxtbevo
    /* JADX INFO: renamed from: zynmafqrjb, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException draadjrbmk(ojitshcjhn ojitshcjhnVar, rgvfuqvkyq rgvfuqvkyqVar, boolean z13) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(ojitshcjhnVar.f10021iwizpuwonk);
            rgvfuqvkyqVar.rgvfuqvkyq(ojitshcjhnVar.f10020esjtqupxsv, istkbnxepw(byteBuffer.array(), byteBuffer.limit(), z13), ojitshcjhnVar.f77830istkbnxepw);
            rgvfuqvkyqVar.f30237iwizpuwonk = false;
            return null;
        } catch (SubtitleDecoderException e13) {
            return e13;
        }
    }
}
