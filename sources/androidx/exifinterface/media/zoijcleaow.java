package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import java.io.Closeable;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes.dex */
abstract class zoijcleaow {

    static class iobyxmoadg {
        static void iobyxmoadg(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        static long ppxfxbqfkf(FileDescriptor fileDescriptor, long j13, int i13) throws ErrnoException {
            return Os.lseek(fileDescriptor, j13, i13);
        }

        static FileDescriptor zoijcleaow(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static class C0142zoijcleaow {
        static void iobyxmoadg(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    static String iobyxmoadg(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b13 : bArr) {
            sb3.append(String.format("%02x", Byte.valueOf(b13)));
        }
        return sb3.toString();
    }

    static long[] ppxfxbqfkf(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            jArr[i13] = iArr[i13];
        }
        return jArr;
    }

    static boolean wkgbmnqykc(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i13 = 0; i13 < bArr2.length; i13++) {
            if (bArr[i13] != bArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    static void zoijcleaow(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e13) {
                throw e13;
            } catch (Exception unused) {
            }
        }
    }
}
