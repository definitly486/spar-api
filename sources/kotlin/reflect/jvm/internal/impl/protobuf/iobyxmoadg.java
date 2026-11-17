package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg implements agtfadlqog {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected int f60070zdlpuopuiu = 0;

    public void lqeggnwhkg(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        CodedOutputStream codedOutputStreamYlkuphrtab = CodedOutputStream.ylkuphrtab(outputStream, CodedOutputStream.zdlpuopuiu(CodedOutputStream.yggfygwlhe(serializedSize) + serializedSize));
        codedOutputStreamYlkuphrtab.zfvoamnweg(serializedSize);
        iobyxmoadg(codedOutputStreamYlkuphrtab);
        codedOutputStreamYlkuphrtab.wwaezpbzkn();
    }

    UninitializedMessageException wkgbmnqykc() {
        return new UninitializedMessageException(this);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractC1196iobyxmoadg implements agtfadlqog.iobyxmoadg {
        protected static UninitializedMessageException zoijcleaow(agtfadlqog agtfadlqogVar) {
            return new UninitializedMessageException(agtfadlqogVar);
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1197iobyxmoadg extends FilterInputStream {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private int f60071zdlpuopuiu;

            C1197iobyxmoadg(InputStream inputStream, int i13) {
                super(inputStream);
                this.f60071zdlpuopuiu = i13;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f60071zdlpuopuiu);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f60071zdlpuopuiu <= 0) {
                    return -1;
                }
                int i13 = super.read();
                if (i13 >= 0) {
                    this.f60071zdlpuopuiu--;
                }
                return i13;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j13) throws IOException {
                long jSkip = super.skip(Math.min(j13, this.f60071zdlpuopuiu));
                if (jSkip >= 0) {
                    this.f60071zdlpuopuiu = (int) (((long) this.f60071zdlpuopuiu) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i13, int i14) throws IOException {
                int i15 = this.f60071zdlpuopuiu;
                if (i15 <= 0) {
                    return -1;
                }
                int i16 = super.read(bArr, i13, Math.min(i14, i15));
                if (i16 >= 0) {
                    this.f60071zdlpuopuiu -= i16;
                }
                return i16;
            }
        }
    }
}
