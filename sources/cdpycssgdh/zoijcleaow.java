package cdpycssgdh;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
class zoijcleaow extends FilterOutputStream {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ByteOrder f19746yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final OutputStream f19747zdlpuopuiu;

    zoijcleaow(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f19747zdlpuopuiu = outputStream;
        this.f19746yggfygwlhe = byteOrder;
    }

    public void btonecajqb(int i13) throws IOException {
        nufgyqmvbu((short) i13);
    }

    public void dxjokdxxww(long j13) throws IOException {
        lqeggnwhkg((int) j13);
    }

    public void iobyxmoadg(ByteOrder byteOrder) {
        this.f19746yggfygwlhe = byteOrder;
    }

    public void lqeggnwhkg(int i13) throws IOException {
        ByteOrder byteOrder = this.f19746yggfygwlhe;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f19747zdlpuopuiu.write(i13 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f19747zdlpuopuiu.write((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f19747zdlpuopuiu.write((i13 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f19747zdlpuopuiu.write((i13 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f19747zdlpuopuiu.write((i13 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f19747zdlpuopuiu.write((i13 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f19747zdlpuopuiu.write((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f19747zdlpuopuiu.write(i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    public void nufgyqmvbu(short s13) throws IOException {
        ByteOrder byteOrder = this.f19746yggfygwlhe;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f19747zdlpuopuiu.write(s13 & 255);
            this.f19747zdlpuopuiu.write((s13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f19747zdlpuopuiu.write((s13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f19747zdlpuopuiu.write(s13 & 255);
        }
    }

    public void wkgbmnqykc(int i13) throws IOException {
        this.f19747zdlpuopuiu.write(i13);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f19747zdlpuopuiu.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i13, int i14) throws IOException {
        this.f19747zdlpuopuiu.write(bArr, i13, i14);
    }
}
