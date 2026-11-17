package rg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb extends dxjokdxxww {
    public static final File agtfadlqog(File file, File target, boolean z13, int i13) throws FileSystemException {
        zdlpuopuiu.btonecajqb(file, "<this>");
        zdlpuopuiu.btonecajqb(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z13) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(target);
                try {
                    iobyxmoadg.iobyxmoadg(fileInputStream, fileOutputStream, i13);
                    zoijcleaow.iobyxmoadg(fileOutputStream, null);
                    zoijcleaow.iobyxmoadg(fileInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        zoijcleaow.iobyxmoadg(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    zoijcleaow.iobyxmoadg(fileInputStream, th4);
                    throw th5;
                }
            }
        } else if (!target.mkdirs()) {
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static File kcexrzcfyt(File file, String relative) {
        zdlpuopuiu.btonecajqb(file, "<this>");
        zdlpuopuiu.btonecajqb(relative, "relative");
        return oxmwwwfdhm(file, new File(relative));
    }

    public static /* synthetic */ File ojitshcjhn(File file, File file2, boolean z13, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        if ((i14 & 4) != 0) {
            i13 = 8192;
        }
        return agtfadlqog(file, file2, z13, i13);
    }

    public static final File oxmwwwfdhm(File file, File relative) {
        zdlpuopuiu.btonecajqb(file, "<this>");
        zdlpuopuiu.btonecajqb(relative, "relative");
        if (lqeggnwhkg.zoijcleaow(relative)) {
            return relative;
        }
        String string = file.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        if (string.length() != 0) {
            char c13 = File.separatorChar;
            if (!kcexrzcfyt.jhduphickx(string, c13, false, 2, null)) {
                return new File(string + c13 + relative);
            }
        }
        return new File(string + relative);
    }

    public static boolean rgvfuqvkyq(File file) {
        zdlpuopuiu.btonecajqb(file, "<this>");
        while (true) {
            boolean z13 = true;
            for (File file2 : dxjokdxxww.wflxmlrfwp(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z13) {
                    }
                }
                z13 = false;
            }
            return z13;
        }
    }

    public static String vdvldrhtss(File file) {
        zdlpuopuiu.btonecajqb(file, "<this>");
        String name = file.getName();
        zdlpuopuiu.dxjokdxxww(name, "getName(...)");
        return kcexrzcfyt.d(name, '.', "");
    }
}
