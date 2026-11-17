package s3;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.hszhottldk;
import java.nio.ByteBuffer;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow extends androidx.media3.exoplayer.nufgyqmvbu {

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private long f105349cllcsxoeiz;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final DecoderInputBuffer f105350hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private iobyxmoadg f105351hkdspvbjdz;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final yadqdtsiqt f105352jpowsppfya;

    public zoijcleaow() {
        super(6);
        this.f105350hcddaimhww = new DecoderInputBuffer(1);
        this.f105352jpowsppfya = new yadqdtsiqt();
    }

    private float[] lrnfpwlwnk(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f105352jpowsppfya.ntlheqmsrt(byteBuffer.array(), byteBuffer.limit());
        this.f105352jpowsppfya.sopmlzcsov(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i13 = 0; i13 < 3; i13++) {
            fArr[i13] = Float.intBitsToFloat(this.f105352jpowsppfya.yggfygwlhe());
        }
        return fArr;
    }

    private void zeieaojujs() {
        iobyxmoadg iobyxmoadgVar = this.f105351hkdspvbjdz;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.eablkybsjg();
        }
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public void btonecajqb(long j13, long j14) {
        while (!wflxmlrfwp() && this.f105349cllcsxoeiz < 100000 + j13) {
            this.f105350hcddaimhww.gxszxtbevo();
            if (opjhrmiecq(crxdokpmqz(), this.f105350hcddaimhww, 0) != -4 || this.f105350hcddaimhww.dxjokdxxww()) {
                return;
            }
            long j15 = this.f105350hcddaimhww.f10020esjtqupxsv;
            this.f105349cllcsxoeiz = j15;
            boolean z13 = j15 < ribwqtqdhb();
            if (this.f105351hkdspvbjdz != null && !z13) {
                this.f105350hcddaimhww.vdvldrhtss();
                float[] fArrLrnfpwlwnk = lrnfpwlwnk((ByteBuffer) stevsuqkhv.nufgyqmvbu(this.f105350hcddaimhww.f10021iwizpuwonk));
                if (fArrLrnfpwlwnk != null) {
                    ((iobyxmoadg) stevsuqkhv.nufgyqmvbu(this.f105351hkdspvbjdz)).iobyxmoadg(this.f105349cllcsxoeiz - ikoacuggdj(), fArrLrnfpwlwnk);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu, androidx.media3.exoplayer.igdgnonuha.zoijcleaow
    public void cqumvgiudr(int i13, Object obj) {
        if (i13 == 8) {
            this.f105351hkdspvbjdz = (iobyxmoadg) obj;
        } else {
            super.cqumvgiudr(i13, obj);
        }
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void czzsidtyhn(long j13, boolean z13) {
        this.f105349cllcsxoeiz = Long.MIN_VALUE;
        zeieaojujs();
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak, androidx.media3.exoplayer.hszhottldk
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.hszhottldk
    public int iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return "application/x-camera-motion".equals(iobyxmoadgVar.f9769ojitshcjhn) ? hszhottldk.jyumaefscl(4) : hszhottldk.jyumaefscl(0);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean ppxfxbqfkf() {
        return true;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public boolean wkgbmnqykc() {
        return wflxmlrfwp();
    }

    @Override // androidx.media3.exoplayer.nufgyqmvbu
    protected void xrmfcynszj() {
        zeieaojujs();
    }
}
