package r8;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class yggfygwlhe implements l8.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o8.zoijcleaow f82116iobyxmoadg;

    public yggfygwlhe(o8.zoijcleaow zoijcleaowVar) {
        this.f82116iobyxmoadg = zoijcleaowVar;
    }

    @Override // l8.wkgbmnqykc
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(InputStream inputStream, File file, l8.lqeggnwhkg lqeggnwhkgVar) throws Throwable {
        byte[] bArr = (byte[]) this.f82116iobyxmoadg.ppxfxbqfkf(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i13 = inputStream.read(bArr);
                        if (i13 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i13);
                    } catch (IOException e13) {
                        e = e13;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f82116iobyxmoadg.eablkybsjg(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f82116iobyxmoadg.eablkybsjg(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f82116iobyxmoadg.eablkybsjg(bArr);
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }
}
