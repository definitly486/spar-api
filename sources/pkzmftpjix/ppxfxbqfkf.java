package pkzmftpjix;

import androidx.camera.core.agtfadlqog;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import istkbnxepw.jztzpxfvev;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final IncorrectJpegMetadataQuirk f76884iobyxmoadg;

    public ppxfxbqfkf(jztzpxfvev jztzpxfvevVar) {
        this.f76884iobyxmoadg = (IncorrectJpegMetadataQuirk) jztzpxfvevVar.zoijcleaow(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] iobyxmoadg(agtfadlqog agtfadlqogVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f76884iobyxmoadg;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.gxszxtbevo(agtfadlqogVar);
        }
        ByteBuffer byteBufferZoijcleaow = agtfadlqogVar.eslsurpljm()[0].zoijcleaow();
        byte[] bArr = new byte[byteBufferZoijcleaow.capacity()];
        byteBufferZoijcleaow.rewind();
        byteBufferZoijcleaow.get(bArr);
        return bArr;
    }
}
