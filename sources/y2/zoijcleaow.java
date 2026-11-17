package y2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final File f123635iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final File f123636zoijcleaow;

    private static final class iobyxmoadg extends OutputStream {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f123637yggfygwlhe = false;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final FileOutputStream f123638zdlpuopuiu;

        public iobyxmoadg(File file) {
            this.f123638zdlpuopuiu = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f123637yggfygwlhe) {
                return;
            }
            this.f123637yggfygwlhe = true;
            flush();
            try {
                this.f123638zdlpuopuiu.getFD().sync();
            } catch (IOException e13) {
                kcexrzcfyt.dxjokdxxww("AtomicFile", "Failed to sync file descriptor:", e13);
            }
            this.f123638zdlpuopuiu.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f123638zdlpuopuiu.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i13) throws IOException {
            this.f123638zdlpuopuiu.write(i13);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f123638zdlpuopuiu.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i13, int i14) throws IOException {
            this.f123638zdlpuopuiu.write(bArr, i13, i14);
        }
    }

    public zoijcleaow(File file) {
        this.f123635iobyxmoadg = file;
        this.f123636zoijcleaow = new File(file.getPath() + ".bak");
    }

    private void eablkybsjg() {
        if (this.f123636zoijcleaow.exists()) {
            this.f123635iobyxmoadg.delete();
            this.f123636zoijcleaow.renameTo(this.f123635iobyxmoadg);
        }
    }

    public OutputStream gxszxtbevo() throws IOException {
        if (this.f123635iobyxmoadg.exists()) {
            if (this.f123636zoijcleaow.exists()) {
                this.f123635iobyxmoadg.delete();
            } else if (!this.f123635iobyxmoadg.renameTo(this.f123636zoijcleaow)) {
                kcexrzcfyt.nufgyqmvbu("AtomicFile", "Couldn't rename file " + this.f123635iobyxmoadg + " to backup file " + this.f123636zoijcleaow);
            }
        }
        try {
            return new iobyxmoadg(this.f123635iobyxmoadg);
        } catch (FileNotFoundException e13) {
            File parentFile = this.f123635iobyxmoadg.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f123635iobyxmoadg, e13);
            }
            try {
                return new iobyxmoadg(this.f123635iobyxmoadg);
            } catch (FileNotFoundException e14) {
                throw new IOException("Couldn't create " + this.f123635iobyxmoadg, e14);
            }
        }
    }

    public void iobyxmoadg() {
        this.f123635iobyxmoadg.delete();
        this.f123636zoijcleaow.delete();
    }

    public boolean ppxfxbqfkf() {
        return this.f123635iobyxmoadg.exists() || this.f123636zoijcleaow.exists();
    }

    public InputStream wkgbmnqykc() {
        eablkybsjg();
        return new FileInputStream(this.f123635iobyxmoadg);
    }

    public void zoijcleaow(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f123636zoijcleaow.delete();
    }
}
