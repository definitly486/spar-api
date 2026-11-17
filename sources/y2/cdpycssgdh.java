package y2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public byte[] f123526iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f123527ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f123528wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f123529zoijcleaow;

    public cdpycssgdh() {
        this.f123526iobyxmoadg = stevsuqkhv.f123601gxszxtbevo;
    }

    private void iobyxmoadg() {
        int i13;
        int i14 = this.f123529zoijcleaow;
        iobyxmoadg.lqeggnwhkg(i14 >= 0 && (i14 < (i13 = this.f123528wkgbmnqykc) || (i14 == i13 && this.f123527ppxfxbqfkf == 0)));
    }

    public void agtfadlqog(byte[] bArr) {
        ojitshcjhn(bArr, bArr.length);
    }

    public long btonecajqb(int i13) {
        return i13 <= 32 ? stevsuqkhv.r(nufgyqmvbu(i13)) : stevsuqkhv.q(nufgyqmvbu(i13 - 32), nufgyqmvbu(32));
    }

    public String draadjrbmk(int i13, Charset charset) {
        byte[] bArr = new byte[i13];
        gtknphoqwx(bArr, 0, i13);
        return new String(bArr, charset);
    }

    public void dxjokdxxww(byte[] bArr, int i13, int i14) {
        int i15 = (i14 >> 3) + i13;
        while (i13 < i15) {
            byte[] bArr2 = this.f123526iobyxmoadg;
            int i16 = this.f123529zoijcleaow;
            int i17 = i16 + 1;
            this.f123529zoijcleaow = i17;
            byte b13 = bArr2[i16];
            int i18 = this.f123527ppxfxbqfkf;
            byte b14 = (byte) (b13 << i18);
            bArr[i13] = b14;
            bArr[i13] = (byte) (((255 & bArr2[i17]) >> (8 - i18)) | b14);
            i13++;
        }
        int i19 = i14 & 7;
        if (i19 == 0) {
            return;
        }
        byte b15 = (byte) (bArr[i15] & (KotlinVersion.MAX_COMPONENT_VALUE >> i19));
        bArr[i15] = b15;
        int i23 = this.f123527ppxfxbqfkf;
        if (i23 + i19 > 8) {
            byte[] bArr3 = this.f123526iobyxmoadg;
            int i24 = this.f123529zoijcleaow;
            this.f123529zoijcleaow = i24 + 1;
            bArr[i15] = (byte) (b15 | ((bArr3[i24] & 255) << i23));
            this.f123527ppxfxbqfkf = i23 - 8;
        }
        int i25 = this.f123527ppxfxbqfkf + i19;
        this.f123527ppxfxbqfkf = i25;
        byte[] bArr4 = this.f123526iobyxmoadg;
        int i26 = this.f123529zoijcleaow;
        bArr[i15] = (byte) (((byte) (((255 & bArr4[i26]) >> (8 - i25)) << (8 - i19))) | bArr[i15]);
        if (i25 == 8) {
            this.f123527ppxfxbqfkf = 0;
            this.f123529zoijcleaow = i26 + 1;
        }
        iobyxmoadg();
    }

    public int eablkybsjg() {
        return (this.f123529zoijcleaow * 8) + this.f123527ppxfxbqfkf;
    }

    public void gtknphoqwx(byte[] bArr, int i13, int i14) {
        iobyxmoadg.lqeggnwhkg(this.f123527ppxfxbqfkf == 0);
        System.arraycopy(this.f123526iobyxmoadg, this.f123529zoijcleaow, bArr, i13, i14);
        this.f123529zoijcleaow += i14;
        iobyxmoadg();
    }

    public void gxszxtbevo(int i13, int i14) {
        if (i14 < 32) {
            i13 &= (1 << i14) - 1;
        }
        int iMin = Math.min(8 - this.f123527ppxfxbqfkf, i14);
        int i15 = this.f123527ppxfxbqfkf;
        int i16 = (8 - i15) - iMin;
        byte[] bArr = this.f123526iobyxmoadg;
        int i17 = this.f123529zoijcleaow;
        byte b13 = (byte) (((65280 >> i15) | ((1 << i16) - 1)) & bArr[i17]);
        bArr[i17] = b13;
        int i18 = i14 - iMin;
        bArr[i17] = (byte) (b13 | ((i13 >>> i18) << i16));
        int i19 = i17 + 1;
        while (i18 > 8) {
            this.f123526iobyxmoadg[i19] = (byte) (i13 >>> (i18 - 8));
            i18 -= 8;
            i19++;
        }
        int i23 = 8 - i18;
        byte[] bArr2 = this.f123526iobyxmoadg;
        byte b14 = (byte) (bArr2[i19] & ((1 << i23) - 1));
        bArr2[i19] = b14;
        bArr2[i19] = (byte) (((i13 & ((1 << i18) - 1)) << i23) | b14);
        oxmwwwfdhm(i14);
        iobyxmoadg();
    }

    public void kcexrzcfyt(int i13) {
        iobyxmoadg.lqeggnwhkg(this.f123527ppxfxbqfkf == 0);
        this.f123529zoijcleaow += i13;
        iobyxmoadg();
    }

    public boolean lqeggnwhkg() {
        boolean z13 = (this.f123526iobyxmoadg[this.f123529zoijcleaow] & (UserVerificationMethods.USER_VERIFY_PATTERN >> this.f123527ppxfxbqfkf)) != 0;
        vdvldrhtss();
        return z13;
    }

    public int nufgyqmvbu(int i13) {
        int i14;
        if (i13 == 0) {
            return 0;
        }
        this.f123527ppxfxbqfkf += i13;
        int i15 = 0;
        while (true) {
            i14 = this.f123527ppxfxbqfkf;
            if (i14 <= 8) {
                break;
            }
            int i16 = i14 - 8;
            this.f123527ppxfxbqfkf = i16;
            byte[] bArr = this.f123526iobyxmoadg;
            int i17 = this.f123529zoijcleaow;
            this.f123529zoijcleaow = i17 + 1;
            i15 |= (bArr[i17] & 255) << i16;
        }
        byte[] bArr2 = this.f123526iobyxmoadg;
        int i18 = this.f123529zoijcleaow;
        int i19 = ((-1) >>> (32 - i13)) & (i15 | ((bArr2[i18] & 255) >> (8 - i14)));
        if (i14 == 8) {
            this.f123527ppxfxbqfkf = 0;
            this.f123529zoijcleaow = i18 + 1;
        }
        iobyxmoadg();
        return i19;
    }

    public void ojitshcjhn(byte[] bArr, int i13) {
        this.f123526iobyxmoadg = bArr;
        this.f123529zoijcleaow = 0;
        this.f123527ppxfxbqfkf = 0;
        this.f123528wkgbmnqykc = i13;
    }

    public void oxmwwwfdhm(int i13) {
        int i14 = i13 / 8;
        int i15 = this.f123529zoijcleaow + i14;
        this.f123529zoijcleaow = i15;
        int i16 = this.f123527ppxfxbqfkf + (i13 - (i14 * 8));
        this.f123527ppxfxbqfkf = i16;
        if (i16 > 7) {
            this.f123529zoijcleaow = i15 + 1;
            this.f123527ppxfxbqfkf = i16 - 8;
        }
        iobyxmoadg();
    }

    public void ppxfxbqfkf() {
        if (this.f123527ppxfxbqfkf == 0) {
            return;
        }
        this.f123527ppxfxbqfkf = 0;
        this.f123529zoijcleaow++;
        iobyxmoadg();
    }

    public void rgvfuqvkyq(int i13) {
        int i14 = i13 / 8;
        this.f123529zoijcleaow = i14;
        this.f123527ppxfxbqfkf = i13 - (i14 * 8);
        iobyxmoadg();
    }

    public void vdvldrhtss() {
        int i13 = this.f123527ppxfxbqfkf + 1;
        this.f123527ppxfxbqfkf = i13;
        if (i13 == 8) {
            this.f123527ppxfxbqfkf = 0;
            this.f123529zoijcleaow++;
        }
        iobyxmoadg();
    }

    public void wflxmlrfwp(yadqdtsiqt yadqdtsiqtVar) {
        ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.lqeggnwhkg());
        rgvfuqvkyq(yadqdtsiqtVar.gxszxtbevo() * 8);
    }

    public int wkgbmnqykc() {
        iobyxmoadg.lqeggnwhkg(this.f123527ppxfxbqfkf == 0);
        return this.f123529zoijcleaow;
    }

    public int zoijcleaow() {
        return ((this.f123528wkgbmnqykc - this.f123529zoijcleaow) * 8) - this.f123527ppxfxbqfkf;
    }

    public cdpycssgdh(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public cdpycssgdh(byte[] bArr, int i13) {
        this.f123526iobyxmoadg = bArr;
        this.f123528wkgbmnqykc = i13;
    }
}
