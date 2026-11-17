package bb;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import nb.istkbnxepw;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final InputStream f15670iobyxmoadg;

    private zoijcleaow(InputStream inputStream) {
        this.f15670iobyxmoadg = inputStream;
    }

    public static rgvfuqvkyq zoijcleaow(byte[] bArr) {
        return new zoijcleaow(new ByteArrayInputStream(bArr));
    }

    @Override // bb.rgvfuqvkyq
    public nb.zdlpuopuiu iobyxmoadg() throws IOException {
        try {
            return nb.zdlpuopuiu.mbcevpiqjq(this.f15670iobyxmoadg, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        } finally {
            this.f15670iobyxmoadg.close();
        }
    }

    @Override // bb.rgvfuqvkyq
    public istkbnxepw read() throws IOException {
        try {
            return istkbnxepw.jlmebxxoox(this.f15670iobyxmoadg, com.google.crypto.tink.shaded.protobuf.ojitshcjhn.zoijcleaow());
        } finally {
            this.f15670iobyxmoadg.close();
        }
    }
}
