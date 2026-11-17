package r8;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements l8.wkgbmnqykc {
    @Override // l8.wkgbmnqykc
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(ByteBuffer byteBuffer, File file, l8.lqeggnwhkg lqeggnwhkgVar) throws Throwable {
        try {
            g9.iobyxmoadg.gxszxtbevo(byteBuffer, file);
            return true;
        } catch (IOException e13) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e13);
            }
            return false;
        }
    }
}
