package ac;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1338iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f1337zoijcleaow = btonecajqb.lereixgezr(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final AtomicLong f1336ppxfxbqfkf = new AtomicLong(0);

    dxjokdxxww() {
        byte[] bArr = new byte[10];
        gxszxtbevo(bArr);
        eablkybsjg(bArr);
        wkgbmnqykc(bArr);
        String strZdlpuopuiu = btonecajqb.zdlpuopuiu(bArr);
        Locale locale = Locale.US;
        this.f1338iobyxmoadg = String.format(locale, "%s%s%s%s", strZdlpuopuiu.substring(0, 12), strZdlpuopuiu.substring(12, 16), strZdlpuopuiu.subSequence(16, 20), f1337zoijcleaow.substring(0, 12)).toUpperCase(locale);
    }

    private void eablkybsjg(byte[] bArr) {
        byte[] bArrZoijcleaow = zoijcleaow(f1336ppxfxbqfkf.incrementAndGet());
        bArr[6] = bArrZoijcleaow[0];
        bArr[7] = bArrZoijcleaow[1];
    }

    private void gxszxtbevo(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrIobyxmoadg = iobyxmoadg(time / 1000);
        bArr[0] = bArrIobyxmoadg[0];
        bArr[1] = bArrIobyxmoadg[1];
        bArr[2] = bArrIobyxmoadg[2];
        bArr[3] = bArrIobyxmoadg[3];
        byte[] bArrZoijcleaow = zoijcleaow(time % 1000);
        bArr[4] = bArrZoijcleaow[0];
        bArr[5] = bArrZoijcleaow[1];
    }

    private static byte[] iobyxmoadg(long j13) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j13);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private void wkgbmnqykc(byte[] bArr) {
        byte[] bArrZoijcleaow = zoijcleaow(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrZoijcleaow[0];
        bArr[9] = bArrZoijcleaow[1];
    }

    private static byte[] zoijcleaow(long j13) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j13);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public String ppxfxbqfkf() {
        return this.f1338iobyxmoadg;
    }

    public String toString() {
        return this.f1338iobyxmoadg;
    }
}
