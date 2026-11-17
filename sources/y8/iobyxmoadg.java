package y8;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Bitmap.CompressFormat f124058iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f124059zoijcleaow;

    public iobyxmoadg() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // y8.eablkybsjg
    public n8.ppxfxbqfkf iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar, l8.lqeggnwhkg lqeggnwhkgVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) ppxfxbqfkfVar.get()).compress(this.f124058iobyxmoadg, this.f124059zoijcleaow, byteArrayOutputStream);
        ppxfxbqfkfVar.zoijcleaow();
        return new u8.zoijcleaow(byteArrayOutputStream.toByteArray());
    }

    public iobyxmoadg(Bitmap.CompressFormat compressFormat, int i13) {
        this.f124058iobyxmoadg = compressFormat;
        this.f124059zoijcleaow = i13;
    }
}
