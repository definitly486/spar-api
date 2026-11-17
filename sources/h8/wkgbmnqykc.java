package h8;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ppxfxbqfkf f39815ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ByteBuffer f39817zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f39814iobyxmoadg = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f39816wkgbmnqykc = 0;

    private int agtfadlqog() {
        return this.f39817zoijcleaow.getShort();
    }

    private void btonecajqb() {
        wkgbmnqykc();
        int iWkgbmnqykc = wkgbmnqykc();
        zoijcleaow zoijcleaowVar = this.f39815ppxfxbqfkf.f39812wkgbmnqykc;
        int i13 = (iWkgbmnqykc & 28) >> 2;
        zoijcleaowVar.f39824lqeggnwhkg = i13;
        if (i13 == 0) {
            zoijcleaowVar.f39824lqeggnwhkg = 1;
        }
        zoijcleaowVar.f39822gxszxtbevo = (iWkgbmnqykc & 1) != 0;
        int iAgtfadlqog = agtfadlqog();
        if (iAgtfadlqog < 2) {
            iAgtfadlqog = 10;
        }
        zoijcleaow zoijcleaowVar2 = this.f39815ppxfxbqfkf.f39812wkgbmnqykc;
        zoijcleaowVar2.f39819dxjokdxxww = iAgtfadlqog * 10;
        zoijcleaowVar2.f39825nufgyqmvbu = wkgbmnqykc();
        wkgbmnqykc();
    }

    private void draadjrbmk() {
        this.f39815ppxfxbqfkf.f39806gxszxtbevo = agtfadlqog();
        this.f39815ppxfxbqfkf.f39808lqeggnwhkg = agtfadlqog();
        int iWkgbmnqykc = wkgbmnqykc();
        ppxfxbqfkf ppxfxbqfkfVar = this.f39815ppxfxbqfkf;
        ppxfxbqfkfVar.f39809nufgyqmvbu = (iWkgbmnqykc & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
        ppxfxbqfkfVar.f39803dxjokdxxww = (int) Math.pow(2.0d, (iWkgbmnqykc & 7) + 1);
        this.f39815ppxfxbqfkf.f39801btonecajqb = wkgbmnqykc();
        this.f39815ppxfxbqfkf.f39805gtknphoqwx = wkgbmnqykc();
    }

    private void dxjokdxxww(int i13) {
        boolean z13 = false;
        while (!z13 && !zoijcleaow() && this.f39815ppxfxbqfkf.f39810ppxfxbqfkf <= i13) {
            int iWkgbmnqykc = wkgbmnqykc();
            if (iWkgbmnqykc == 33) {
                int iWkgbmnqykc2 = wkgbmnqykc();
                if (iWkgbmnqykc2 == 1) {
                    vdvldrhtss();
                } else if (iWkgbmnqykc2 == 249) {
                    this.f39815ppxfxbqfkf.f39812wkgbmnqykc = new zoijcleaow();
                    btonecajqb();
                } else if (iWkgbmnqykc2 == 254) {
                    vdvldrhtss();
                } else if (iWkgbmnqykc2 != 255) {
                    vdvldrhtss();
                } else {
                    gxszxtbevo();
                    StringBuilder sb3 = new StringBuilder();
                    for (int i14 = 0; i14 < 11; i14++) {
                        sb3.append((char) this.f39814iobyxmoadg[i14]);
                    }
                    if (sb3.toString().equals("NETSCAPE2.0")) {
                        wflxmlrfwp();
                    } else {
                        vdvldrhtss();
                    }
                }
            } else if (iWkgbmnqykc == 44) {
                ppxfxbqfkf ppxfxbqfkfVar = this.f39815ppxfxbqfkf;
                if (ppxfxbqfkfVar.f39812wkgbmnqykc == null) {
                    ppxfxbqfkfVar.f39812wkgbmnqykc = new zoijcleaow();
                }
                eablkybsjg();
            } else if (iWkgbmnqykc != 59) {
                this.f39815ppxfxbqfkf.f39813zoijcleaow = 1;
            } else {
                z13 = true;
            }
        }
    }

    private void eablkybsjg() {
        this.f39815ppxfxbqfkf.f39812wkgbmnqykc.f39823iobyxmoadg = agtfadlqog();
        this.f39815ppxfxbqfkf.f39812wkgbmnqykc.f39828zoijcleaow = agtfadlqog();
        this.f39815ppxfxbqfkf.f39812wkgbmnqykc.f39826ppxfxbqfkf = agtfadlqog();
        this.f39815ppxfxbqfkf.f39812wkgbmnqykc.f39827wkgbmnqykc = agtfadlqog();
        int iWkgbmnqykc = wkgbmnqykc();
        boolean z13 = (iWkgbmnqykc & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
        int iPow = (int) Math.pow(2.0d, (iWkgbmnqykc & 7) + 1);
        zoijcleaow zoijcleaowVar = this.f39815ppxfxbqfkf.f39812wkgbmnqykc;
        zoijcleaowVar.f39820eablkybsjg = (iWkgbmnqykc & 64) != 0;
        if (z13) {
            zoijcleaowVar.f39821gtknphoqwx = lqeggnwhkg(iPow);
        } else {
            zoijcleaowVar.f39821gtknphoqwx = null;
        }
        this.f39815ppxfxbqfkf.f39812wkgbmnqykc.f39818btonecajqb = this.f39817zoijcleaow.position();
        oxmwwwfdhm();
        if (zoijcleaow()) {
            return;
        }
        ppxfxbqfkf ppxfxbqfkfVar = this.f39815ppxfxbqfkf;
        ppxfxbqfkfVar.f39810ppxfxbqfkf++;
        ppxfxbqfkfVar.f39804eablkybsjg.add(ppxfxbqfkfVar.f39812wkgbmnqykc);
    }

    private void gtknphoqwx() {
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < 6; i13++) {
            sb3.append((char) wkgbmnqykc());
        }
        if (!sb3.toString().startsWith("GIF")) {
            this.f39815ppxfxbqfkf.f39813zoijcleaow = 1;
            return;
        }
        draadjrbmk();
        if (!this.f39815ppxfxbqfkf.f39809nufgyqmvbu || zoijcleaow()) {
            return;
        }
        ppxfxbqfkf ppxfxbqfkfVar = this.f39815ppxfxbqfkf;
        ppxfxbqfkfVar.f39807iobyxmoadg = lqeggnwhkg(ppxfxbqfkfVar.f39803dxjokdxxww);
        ppxfxbqfkf ppxfxbqfkfVar2 = this.f39815ppxfxbqfkf;
        ppxfxbqfkfVar2.f39802draadjrbmk = ppxfxbqfkfVar2.f39807iobyxmoadg[ppxfxbqfkfVar2.f39801btonecajqb];
    }

    private void gxszxtbevo() {
        int iWkgbmnqykc = wkgbmnqykc();
        this.f39816wkgbmnqykc = iWkgbmnqykc;
        if (iWkgbmnqykc <= 0) {
            return;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            try {
                int i15 = this.f39816wkgbmnqykc;
                if (i13 >= i15) {
                    return;
                }
                i14 = i15 - i13;
                this.f39817zoijcleaow.get(this.f39814iobyxmoadg, i13, i14);
                i13 += i14;
            } catch (Exception e13) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i13 + " count: " + i14 + " blockSize: " + this.f39816wkgbmnqykc, e13);
                }
                this.f39815ppxfxbqfkf.f39813zoijcleaow = 1;
                return;
            }
        }
    }

    private int[] lqeggnwhkg(int i13) {
        byte[] bArr = new byte[i13 * 3];
        int[] iArr = null;
        try {
            this.f39817zoijcleaow.get(bArr);
            iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
            int i14 = 0;
            int i15 = 0;
            while (i14 < i13) {
                int i16 = bArr[i15] & 255;
                int i17 = i15 + 2;
                int i18 = bArr[i15 + 1] & 255;
                i15 += 3;
                int i19 = i14 + 1;
                iArr[i14] = (i18 << 8) | (i16 << 16) | (-16777216) | (bArr[i17] & 255);
                i14 = i19;
            }
        } catch (BufferUnderflowException e13) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e13);
            }
            this.f39815ppxfxbqfkf.f39813zoijcleaow = 1;
        }
        return iArr;
    }

    private void nufgyqmvbu() {
        dxjokdxxww(Integer.MAX_VALUE);
    }

    private void ojitshcjhn() {
        this.f39817zoijcleaow = null;
        Arrays.fill(this.f39814iobyxmoadg, (byte) 0);
        this.f39815ppxfxbqfkf = new ppxfxbqfkf();
        this.f39816wkgbmnqykc = 0;
    }

    private void oxmwwwfdhm() {
        wkgbmnqykc();
        vdvldrhtss();
    }

    private void vdvldrhtss() {
        int iWkgbmnqykc;
        do {
            iWkgbmnqykc = wkgbmnqykc();
            this.f39817zoijcleaow.position(Math.min(this.f39817zoijcleaow.position() + iWkgbmnqykc, this.f39817zoijcleaow.limit()));
        } while (iWkgbmnqykc > 0);
    }

    private void wflxmlrfwp() {
        do {
            gxszxtbevo();
            byte[] bArr = this.f39814iobyxmoadg;
            if (bArr[0] == 1) {
                this.f39815ppxfxbqfkf.f39811wflxmlrfwp = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f39816wkgbmnqykc <= 0) {
                return;
            }
        } while (!zoijcleaow());
    }

    private int wkgbmnqykc() {
        try {
            return this.f39817zoijcleaow.get() & 255;
        } catch (Exception unused) {
            this.f39815ppxfxbqfkf.f39813zoijcleaow = 1;
            return 0;
        }
    }

    private boolean zoijcleaow() {
        return this.f39815ppxfxbqfkf.f39813zoijcleaow != 0;
    }

    public void iobyxmoadg() {
        this.f39817zoijcleaow = null;
        this.f39815ppxfxbqfkf = null;
    }

    public ppxfxbqfkf ppxfxbqfkf() {
        if (this.f39817zoijcleaow == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (zoijcleaow()) {
            return this.f39815ppxfxbqfkf;
        }
        gtknphoqwx();
        if (!zoijcleaow()) {
            nufgyqmvbu();
            ppxfxbqfkf ppxfxbqfkfVar = this.f39815ppxfxbqfkf;
            if (ppxfxbqfkfVar.f39810ppxfxbqfkf < 0) {
                ppxfxbqfkfVar.f39813zoijcleaow = 1;
            }
        }
        return this.f39815ppxfxbqfkf;
    }

    public wkgbmnqykc rgvfuqvkyq(ByteBuffer byteBuffer) {
        ojitshcjhn();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f39817zoijcleaow = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f39817zoijcleaow.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
