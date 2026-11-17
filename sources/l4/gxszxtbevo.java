package l4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import t3.vdvldrhtss;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f61553iobyxmoadg = new yadqdtsiqt(8);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f61554zoijcleaow;

    private long iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
        int i13 = 0;
        vdvldrhtssVar.ojitshcjhn(this.f61553iobyxmoadg.eablkybsjg(), 0, 1);
        int i14 = this.f61553iobyxmoadg.eablkybsjg()[0] & 255;
        if (i14 == 0) {
            return Long.MIN_VALUE;
        }
        int i15 = UserVerificationMethods.USER_VERIFY_PATTERN;
        int i16 = 0;
        while ((i14 & i15) == 0) {
            i15 >>= 1;
            i16++;
        }
        int i17 = i14 & (~i15);
        vdvldrhtssVar.ojitshcjhn(this.f61553iobyxmoadg.eablkybsjg(), 1, i16);
        while (i13 < i16) {
            i13++;
            i17 = (this.f61553iobyxmoadg.eablkybsjg()[i13] & 255) + (i17 << 8);
        }
        this.f61554zoijcleaow += i16 + 1;
        return i17;
    }

    public boolean zoijcleaow(vdvldrhtss vdvldrhtssVar) {
        long length = vdvldrhtssVar.getLength();
        long j13 = 1024;
        if (length != -1 && length <= 1024) {
            j13 = length;
        }
        int i13 = (int) j13;
        vdvldrhtssVar.ojitshcjhn(this.f61553iobyxmoadg.eablkybsjg(), 0, 4);
        long jPkzmftpjix = this.f61553iobyxmoadg.pkzmftpjix();
        this.f61554zoijcleaow = 4;
        while (jPkzmftpjix != 440786851) {
            int i14 = this.f61554zoijcleaow + 1;
            this.f61554zoijcleaow = i14;
            if (i14 == i13) {
                return false;
            }
            vdvldrhtssVar.ojitshcjhn(this.f61553iobyxmoadg.eablkybsjg(), 0, 1);
            jPkzmftpjix = ((jPkzmftpjix << 8) & (-256)) | ((long) (this.f61553iobyxmoadg.eablkybsjg()[0] & 255));
        }
        long jIobyxmoadg = iobyxmoadg(vdvldrhtssVar);
        long j14 = this.f61554zoijcleaow;
        if (jIobyxmoadg == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j14 + jIobyxmoadg >= length) {
            return false;
        }
        while (true) {
            int i15 = this.f61554zoijcleaow;
            long j15 = j14 + jIobyxmoadg;
            if (i15 >= j15) {
                return ((long) i15) == j15;
            }
            if (iobyxmoadg(vdvldrhtssVar) == Long.MIN_VALUE) {
                return false;
            }
            long jIobyxmoadg2 = iobyxmoadg(vdvldrhtssVar);
            if (jIobyxmoadg2 < 0 || jIobyxmoadg2 > 2147483647L) {
                return false;
            }
            if (jIobyxmoadg2 != 0) {
                int i16 = (int) jIobyxmoadg2;
                vdvldrhtssVar.dxjokdxxww(i16);
                this.f61554zoijcleaow += i16;
            }
        }
    }
}
