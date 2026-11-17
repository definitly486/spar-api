package x8;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f121430iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final o8.zoijcleaow f121431ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l8.dxjokdxxww f121432zoijcleaow;

    public btonecajqb(List list, l8.dxjokdxxww dxjokdxxwwVar, o8.zoijcleaow zoijcleaowVar) {
        this.f121430iobyxmoadg = list;
        this.f121432zoijcleaow = dxjokdxxwwVar;
        this.f121431ppxfxbqfkf = zoijcleaowVar;
    }

    private static byte[] eablkybsjg(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i13 = inputStream.read(bArr);
                if (i13 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i13);
            }
        } catch (IOException e13) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e13);
            return null;
        }
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public n8.ppxfxbqfkf zoijcleaow(InputStream inputStream, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        byte[] bArrEablkybsjg = eablkybsjg(inputStream);
        if (bArrEablkybsjg == null) {
            return null;
        }
        return this.f121432zoijcleaow.zoijcleaow(ByteBuffer.wrap(bArrEablkybsjg), i13, i14, lqeggnwhkgVar);
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(InputStream inputStream, l8.lqeggnwhkg lqeggnwhkgVar) {
        return !((Boolean) lqeggnwhkgVar.ppxfxbqfkf(dxjokdxxww.f121434zoijcleaow)).booleanValue() && com.bumptech.glide.load.iobyxmoadg.gxszxtbevo(this.f121430iobyxmoadg, inputStream, this.f121431ppxfxbqfkf) == ImageHeaderParser.ImageType.GIF;
    }
}
