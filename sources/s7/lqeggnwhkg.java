package s7;

import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f105621iobyxmoadg;

    public lqeggnwhkg(eablkybsjg eablkybsjgVar) {
        this.f105621iobyxmoadg = eablkybsjgVar;
    }

    private static String eablkybsjg(String str, int i13) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb3 = new StringBuilder();
            for (byte b13 : bArrDigest) {
                sb3.append(String.format("%02x", Byte.valueOf(b13)));
            }
            return sb3.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i13);
        }
    }

    private File gxszxtbevo() {
        File fileIobyxmoadg = this.f105621iobyxmoadg.iobyxmoadg();
        if (fileIobyxmoadg.isFile()) {
            fileIobyxmoadg.delete();
        }
        if (!fileIobyxmoadg.exists()) {
            fileIobyxmoadg.mkdirs();
        }
        return fileIobyxmoadg;
    }

    private static String ppxfxbqfkf(String str, ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        String strWkgbmnqykc = z13 ? ppxfxbqfkfVar.wkgbmnqykc() : ppxfxbqfkfVar.f105629zdlpuopuiu;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strWkgbmnqykc.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = eablkybsjg(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strWkgbmnqykc;
    }

    private File wkgbmnqykc(String str) {
        File file = new File(gxszxtbevo(), ppxfxbqfkf(str, ppxfxbqfkf.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(gxszxtbevo(), ppxfxbqfkf(str, ppxfxbqfkf.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(gxszxtbevo(), ppxfxbqfkf(str, ppxfxbqfkf.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public void iobyxmoadg() {
        File fileGxszxtbevo = gxszxtbevo();
        if (fileGxszxtbevo.exists()) {
            File[] fileArrListFiles = fileGxszxtbevo.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            fileGxszxtbevo.delete();
        }
    }

    void lqeggnwhkg(String str, ppxfxbqfkf ppxfxbqfkfVar) {
        File file = new File(gxszxtbevo(), ppxfxbqfkf(str, ppxfxbqfkfVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        v7.wkgbmnqykc.iobyxmoadg("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        v7.wkgbmnqykc.ppxfxbqfkf("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File nufgyqmvbu(String str, InputStream inputStream, ppxfxbqfkf ppxfxbqfkfVar) throws IOException {
        File file = new File(gxszxtbevo(), ppxfxbqfkf(str, ppxfxbqfkfVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int i13 = inputStream.read(bArr);
                    if (i13 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i13);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }

    Pair zoijcleaow(String str) {
        ppxfxbqfkf ppxfxbqfkfVar;
        try {
            File fileWkgbmnqykc = wkgbmnqykc(str);
            if (fileWkgbmnqykc == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileWkgbmnqykc);
            if (fileWkgbmnqykc.getAbsolutePath().endsWith(".zip")) {
                ppxfxbqfkfVar = ppxfxbqfkf.ZIP;
            } else {
                ppxfxbqfkfVar = fileWkgbmnqykc.getAbsolutePath().endsWith(".gz") ? ppxfxbqfkf.GZIP : ppxfxbqfkf.JSON;
            }
            v7.wkgbmnqykc.iobyxmoadg("Cache hit for " + str + " at " + fileWkgbmnqykc.getAbsolutePath());
            return new Pair(ppxfxbqfkfVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
