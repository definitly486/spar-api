package bl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class oxmwwwfdhm extends dxjokdxxww {
    private final void kcexrzcfyt(esjtqupxsv esjtqupxsvVar) throws IOException {
        if (btonecajqb(esjtqupxsvVar)) {
            throw new IOException(esjtqupxsvVar + " already exists.");
        }
    }

    private final List oxmwwwfdhm(esjtqupxsv esjtqupxsvVar, boolean z13) throws IOException {
        File fileDraadjrbmk = esjtqupxsvVar.draadjrbmk();
        String[] list = fileDraadjrbmk.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String it : list) {
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(it, "it");
                arrayList.add(esjtqupxsvVar.gtknphoqwx(it));
            }
            hg.jyumaefscl.pmvmpeiblj(arrayList);
            return arrayList;
        }
        if (!z13) {
            return null;
        }
        if (fileDraadjrbmk.exists()) {
            throw new IOException("failed to list " + esjtqupxsvVar);
        }
        throw new FileNotFoundException("no such file: " + esjtqupxsvVar);
    }

    private final void zdlpuopuiu(esjtqupxsv esjtqupxsvVar) throws IOException {
        if (btonecajqb(esjtqupxsvVar)) {
            return;
        }
        throw new IOException(esjtqupxsvVar + " doesn't exist.");
    }

    @Override // bl.dxjokdxxww
    public lqeggnwhkg agtfadlqog(esjtqupxsv file) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        return new vdvldrhtss(false, new RandomAccessFile(file.draadjrbmk(), "r"));
    }

    @Override // bl.dxjokdxxww
    public void dxjokdxxww(esjtqupxsv path, boolean z13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileDraadjrbmk = path.draadjrbmk();
        if (fileDraadjrbmk.delete()) {
            return;
        }
        if (fileDraadjrbmk.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z13) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // bl.dxjokdxxww
    public List gtknphoqwx(esjtqupxsv dir) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        List listOxmwwwfdhm = oxmwwwfdhm(dir, true);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(listOxmwwwfdhm);
        return listOxmwwwfdhm;
    }

    @Override // bl.dxjokdxxww
    public void lqeggnwhkg(esjtqupxsv dir, boolean z13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dir, "dir");
        if (dir.draadjrbmk().mkdir()) {
            return;
        }
        nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = wflxmlrfwp(dir);
        if (nufgyqmvbuVarWflxmlrfwp == null || !nufgyqmvbuVarWflxmlrfwp.gxszxtbevo()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z13) {
            throw new IOException(dir + " already exist.");
        }
    }

    @Override // bl.dxjokdxxww
    public void ppxfxbqfkf(esjtqupxsv source, esjtqupxsv target) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(source, "source");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(target, "target");
        if (source.draadjrbmk().renameTo(target.draadjrbmk())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // bl.dxjokdxxww
    public iozdgvuglv rgvfuqvkyq(esjtqupxsv file, boolean z13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        if (z13) {
            kcexrzcfyt(file);
        }
        return yggfygwlhe.gxszxtbevo(file.draadjrbmk(), false, 1, null);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // bl.dxjokdxxww
    public wwaezpbzkn vdvldrhtss(esjtqupxsv file) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        return zdlpuopuiu.dxjokdxxww(file.draadjrbmk());
    }

    @Override // bl.dxjokdxxww
    public nufgyqmvbu wflxmlrfwp(esjtqupxsv path) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "path");
        File fileDraadjrbmk = path.draadjrbmk();
        boolean zIsFile = fileDraadjrbmk.isFile();
        boolean zIsDirectory = fileDraadjrbmk.isDirectory();
        long jLastModified = fileDraadjrbmk.lastModified();
        long length = fileDraadjrbmk.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileDraadjrbmk.exists()) {
            return new nufgyqmvbu(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        }
        return null;
    }

    @Override // bl.dxjokdxxww
    public iozdgvuglv zoijcleaow(esjtqupxsv file, boolean z13) throws IOException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "file");
        if (z13) {
            zdlpuopuiu(file);
        }
        return zdlpuopuiu.eablkybsjg(file.draadjrbmk(), true);
    }
}
