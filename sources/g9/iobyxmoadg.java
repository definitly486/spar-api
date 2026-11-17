package g9;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final AtomicReference f36691iobyxmoadg = new AtomicReference();

    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f36694iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final byte[] f36695ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f36696zoijcleaow;

        zoijcleaow(byte[] bArr, int i13, int i14) {
            this.f36695ppxfxbqfkf = bArr;
            this.f36694iobyxmoadg = i13;
            this.f36696zoijcleaow = i14;
        }
    }

    public static byte[] eablkybsjg(ByteBuffer byteBuffer) {
        zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf(byteBuffer);
        if (zoijcleaowVarPpxfxbqfkf != null && zoijcleaowVarPpxfxbqfkf.f36694iobyxmoadg == 0 && zoijcleaowVarPpxfxbqfkf.f36696zoijcleaow == zoijcleaowVarPpxfxbqfkf.f36695ppxfxbqfkf.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        wkgbmnqykc(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void gxszxtbevo(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        wkgbmnqykc(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer iobyxmoadg(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th2) {
                th = th2;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static InputStream lqeggnwhkg(ByteBuffer byteBuffer) {
        return new C0826iobyxmoadg(byteBuffer);
    }

    private static zoijcleaow ppxfxbqfkf(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new zoijcleaow(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer wkgbmnqykc(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static ByteBuffer zoijcleaow(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f36691iobyxmoadg.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i13 = inputStream.read(bArr);
            if (i13 < 0) {
                f36691iobyxmoadg.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return wkgbmnqykc(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i13);
        }
    }

    /* JADX INFO: renamed from: g9.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C0826iobyxmoadg extends InputStream {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f36692yggfygwlhe = -1;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ByteBuffer f36693zdlpuopuiu;

        C0826iobyxmoadg(ByteBuffer byteBuffer) {
            this.f36693zdlpuopuiu = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f36693zdlpuopuiu.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i13) {
            this.f36692yggfygwlhe = this.f36693zdlpuopuiu.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f36693zdlpuopuiu.hasRemaining()) {
                return this.f36693zdlpuopuiu.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i13 = this.f36692yggfygwlhe;
            if (i13 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f36693zdlpuopuiu.position(i13);
        }

        @Override // java.io.InputStream
        public long skip(long j13) {
            if (!this.f36693zdlpuopuiu.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j13, available());
            ByteBuffer byteBuffer = this.f36693zdlpuopuiu;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i13, int i14) {
            if (!this.f36693zdlpuopuiu.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i14, available());
            this.f36693zdlpuopuiu.get(bArr, i13, iMin);
            return iMin;
        }
    }
}
