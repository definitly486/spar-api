package e3;

import android.media.MediaCodec;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final zoijcleaow f30256btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f30257dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int[] f30258eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public int f30259gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public byte[] f30260iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public int f30261lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public int f30262nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public int f30263ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public int[] f30264wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public byte[] f30265zoijcleaow;

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f30266iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f30267zoijcleaow;

        /* JADX INFO: Access modifiers changed from: private */
        public void zoijcleaow(int i13, int i14) {
            this.f30267zoijcleaow.set(i13, i14);
            this.f30266iobyxmoadg.setPattern(this.f30267zoijcleaow);
        }

        private zoijcleaow(MediaCodec.CryptoInfo cryptoInfo) {
            this.f30266iobyxmoadg = cryptoInfo;
            this.f30267zoijcleaow = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ppxfxbqfkf() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f30257dxjokdxxww = cryptoInfo;
        this.f30256btonecajqb = stevsuqkhv.f123602iobyxmoadg >= 24 ? new zoijcleaow(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo iobyxmoadg() {
        return this.f30257dxjokdxxww;
    }

    public void ppxfxbqfkf(int i13, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i14, int i15, int i16) {
        this.f30259gxszxtbevo = i13;
        this.f30264wkgbmnqykc = iArr;
        this.f30258eablkybsjg = iArr2;
        this.f30265zoijcleaow = bArr;
        this.f30260iobyxmoadg = bArr2;
        this.f30263ppxfxbqfkf = i14;
        this.f30261lqeggnwhkg = i15;
        this.f30262nufgyqmvbu = i16;
        MediaCodec.CryptoInfo cryptoInfo = this.f30257dxjokdxxww;
        cryptoInfo.numSubSamples = i13;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i14;
        if (stevsuqkhv.f123602iobyxmoadg >= 24) {
            ((zoijcleaow) y2.iobyxmoadg.eablkybsjg(this.f30256btonecajqb)).zoijcleaow(i15, i16);
        }
    }

    public void zoijcleaow(int i13) {
        if (i13 == 0) {
            return;
        }
        if (this.f30264wkgbmnqykc == null) {
            int[] iArr = new int[1];
            this.f30264wkgbmnqykc = iArr;
            this.f30257dxjokdxxww.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f30264wkgbmnqykc;
        iArr2[0] = iArr2[0] + i13;
    }
}
