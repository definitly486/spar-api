package g8;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements Closeable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f36577cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final int f36578cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f36579esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final File f36582iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final File f36583jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f36584lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final File f36588yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final File f36589zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private Writer f36590zynmafqrjb;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private long f36586pmvmpeiblj = 0;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final LinkedHashMap f36581istkbnxepw = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private long f36587yadqdtsiqt = 0;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    final ThreadPoolExecutor f36580iozdgvuglv = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zoijcleaow(null));

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final Callable f36585lmojexxdyd = new CallableC0823iobyxmoadg();

    public final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36592iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final long[] f36593ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final File[] f36594wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f36595zoijcleaow;

        /* synthetic */ eablkybsjg(iobyxmoadg iobyxmoadgVar, String str, long j13, File[] fileArr, long[] jArr, CallableC0823iobyxmoadg callableC0823iobyxmoadg) {
            this(str, j13, fileArr, jArr);
        }

        public File iobyxmoadg(int i13) {
            return this.f36594wkgbmnqykc[i13];
        }

        private eablkybsjg(String str, long j13, File[] fileArr, long[] jArr) {
            this.f36592iobyxmoadg = str;
            this.f36595zoijcleaow = j13;
            this.f36594wkgbmnqykc = fileArr;
            this.f36593ppxfxbqfkf = jArr;
        }
    }

    /* JADX INFO: renamed from: g8.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class CallableC0823iobyxmoadg implements Callable {
        CallableC0823iobyxmoadg() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (iobyxmoadg.this) {
                try {
                    if (iobyxmoadg.this.f36590zynmafqrjb == null) {
                        return null;
                    }
                    iobyxmoadg.this.mbcevpiqjq();
                    if (iobyxmoadg.this.zynmafqrjb()) {
                        iobyxmoadg.this.dsvhmnatus();
                        iobyxmoadg.this.f36577cdpycssgdh = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wkgbmnqykc f36597iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f36598ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean[] f36600zoijcleaow;

        /* synthetic */ ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, wkgbmnqykc wkgbmnqykcVar, CallableC0823iobyxmoadg callableC0823iobyxmoadg) {
            this(wkgbmnqykcVar);
        }

        public void eablkybsjg() {
            iobyxmoadg.this.vdvldrhtss(this, true);
            this.f36598ppxfxbqfkf = true;
        }

        public File gxszxtbevo(int i13) {
            File fileGtknphoqwx;
            synchronized (iobyxmoadg.this) {
                try {
                    if (this.f36597iobyxmoadg.f36602gxszxtbevo != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f36597iobyxmoadg.f36601eablkybsjg) {
                        this.f36600zoijcleaow[i13] = true;
                    }
                    fileGtknphoqwx = this.f36597iobyxmoadg.gtknphoqwx(i13);
                    iobyxmoadg.this.f36589zdlpuopuiu.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileGtknphoqwx;
        }

        public void iobyxmoadg() {
            iobyxmoadg.this.vdvldrhtss(this, false);
        }

        public void zoijcleaow() {
            if (this.f36598ppxfxbqfkf) {
                return;
            }
            try {
                iobyxmoadg();
            } catch (IOException unused) {
            }
        }

        private ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar) {
            this.f36597iobyxmoadg = wkgbmnqykcVar;
            this.f36600zoijcleaow = wkgbmnqykcVar.f36601eablkybsjg ? null : new boolean[iobyxmoadg.this.f36584lereixgezr];
        }
    }

    private final class wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f36601eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private ppxfxbqfkf f36602gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36603iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private long f36604lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        File[] f36606ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        File[] f36607wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long[] f36608zoijcleaow;

        /* synthetic */ wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String str, CallableC0823iobyxmoadg callableC0823iobyxmoadg) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void agtfadlqog(String[] strArr) throws IOException {
            if (strArr.length != iobyxmoadg.this.f36584lereixgezr) {
                throw wflxmlrfwp(strArr);
            }
            for (int i13 = 0; i13 < strArr.length; i13++) {
                try {
                    this.f36608zoijcleaow[i13] = Long.parseLong(strArr[i13]);
                } catch (NumberFormatException unused) {
                    throw wflxmlrfwp(strArr);
                }
            }
        }

        private IOException wflxmlrfwp(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File btonecajqb(int i13) {
            return this.f36606ppxfxbqfkf[i13];
        }

        public String draadjrbmk() {
            StringBuilder sb3 = new StringBuilder();
            for (long j13 : this.f36608zoijcleaow) {
                sb3.append(' ');
                sb3.append(j13);
            }
            return sb3.toString();
        }

        public File gtknphoqwx(int i13) {
            return this.f36607wkgbmnqykc[i13];
        }

        private wkgbmnqykc(String str) {
            this.f36603iobyxmoadg = str;
            this.f36608zoijcleaow = new long[iobyxmoadg.this.f36584lereixgezr];
            this.f36606ppxfxbqfkf = new File[iobyxmoadg.this.f36584lereixgezr];
            this.f36607wkgbmnqykc = new File[iobyxmoadg.this.f36584lereixgezr];
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append('.');
            int length = sb3.length();
            for (int i13 = 0; i13 < iobyxmoadg.this.f36584lereixgezr; i13++) {
                sb3.append(i13);
                this.f36606ppxfxbqfkf[i13] = new File(iobyxmoadg.this.f36589zdlpuopuiu, sb3.toString());
                sb3.append(".tmp");
                this.f36607wkgbmnqykc[i13] = new File(iobyxmoadg.this.f36589zdlpuopuiu, sb3.toString());
                sb3.setLength(length);
            }
        }
    }

    private static final class zoijcleaow implements ThreadFactory {
        private zoijcleaow() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ zoijcleaow(CallableC0823iobyxmoadg callableC0823iobyxmoadg) {
            this();
        }
    }

    private iobyxmoadg(File file, int i13, int i14, long j13) {
        this.f36589zdlpuopuiu = file;
        this.f36578cqumvgiudr = i13;
        this.f36588yggfygwlhe = new File(file, "journal");
        this.f36583jyumaefscl = new File(file, "journal.tmp");
        this.f36582iwizpuwonk = new File(file, "journal.bkp");
        this.f36584lereixgezr = i14;
        this.f36579esjtqupxsv = j13;
    }

    private void cdpycssgdh() throws IOException {
        zdlpuopuiu(this.f36583jyumaefscl);
        Iterator it = this.f36581istkbnxepw.values().iterator();
        while (it.hasNext()) {
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) it.next();
            int i13 = 0;
            if (wkgbmnqykcVar.f36602gxszxtbevo == null) {
                while (i13 < this.f36584lereixgezr) {
                    this.f36586pmvmpeiblj += wkgbmnqykcVar.f36608zoijcleaow[i13];
                    i13++;
                }
            } else {
                wkgbmnqykcVar.f36602gxszxtbevo = null;
                while (i13 < this.f36584lereixgezr) {
                    zdlpuopuiu(wkgbmnqykcVar.btonecajqb(i13));
                    zdlpuopuiu(wkgbmnqykcVar.gtknphoqwx(i13));
                    i13++;
                }
                it.remove();
            }
        }
    }

    private synchronized ppxfxbqfkf cqumvgiudr(String str, long j13) {
        ojitshcjhn();
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f36581istkbnxepw.get(str);
        CallableC0823iobyxmoadg callableC0823iobyxmoadg = null;
        if (j13 != -1 && (wkgbmnqykcVar == null || wkgbmnqykcVar.f36604lqeggnwhkg != j13)) {
            return null;
        }
        if (wkgbmnqykcVar == null) {
            wkgbmnqykcVar = new wkgbmnqykc(this, str, callableC0823iobyxmoadg);
            this.f36581istkbnxepw.put(str, wkgbmnqykcVar);
        } else if (wkgbmnqykcVar.f36602gxszxtbevo != null) {
            return null;
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this, wkgbmnqykcVar, callableC0823iobyxmoadg);
        wkgbmnqykcVar.f36602gxszxtbevo = ppxfxbqfkfVar;
        this.f36590zynmafqrjb.append((CharSequence) "DIRTY");
        this.f36590zynmafqrjb.append(' ');
        this.f36590zynmafqrjb.append((CharSequence) str);
        this.f36590zynmafqrjb.append('\n');
        lereixgezr(this.f36590zynmafqrjb);
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void dsvhmnatus() {
        try {
            Writer writer = this.f36590zynmafqrjb;
            if (writer != null) {
                rgvfuqvkyq(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36583jyumaefscl), g8.ppxfxbqfkf.f36609iobyxmoadg));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f36578cqumvgiudr));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f36584lereixgezr));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (wkgbmnqykc wkgbmnqykcVar : this.f36581istkbnxepw.values()) {
                    if (wkgbmnqykcVar.f36602gxszxtbevo != null) {
                        bufferedWriter.write("DIRTY " + wkgbmnqykcVar.f36603iobyxmoadg + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + wkgbmnqykcVar.f36603iobyxmoadg + wkgbmnqykcVar.draadjrbmk() + '\n');
                    }
                }
                rgvfuqvkyq(bufferedWriter);
                if (this.f36588yggfygwlhe.exists()) {
                    kegysxyocb(this.f36588yggfygwlhe, this.f36582iwizpuwonk, true);
                }
                kegysxyocb(this.f36583jyumaefscl, this.f36588yggfygwlhe, false);
                this.f36582iwizpuwonk.delete();
                this.f36590zynmafqrjb = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36588yggfygwlhe, true), g8.ppxfxbqfkf.f36609iobyxmoadg));
            } catch (Throwable th2) {
                rgvfuqvkyq(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void hkdspvbjdz(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i13 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i13);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i13);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f36581istkbnxepw.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i13, iIndexOf2);
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f36581istkbnxepw.get(strSubstring);
        CallableC0823iobyxmoadg callableC0823iobyxmoadg = null;
        if (wkgbmnqykcVar == null) {
            wkgbmnqykcVar = new wkgbmnqykc(this, strSubstring, callableC0823iobyxmoadg);
            this.f36581istkbnxepw.put(strSubstring, wkgbmnqykcVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            wkgbmnqykcVar.f36601eablkybsjg = true;
            wkgbmnqykcVar.f36602gxszxtbevo = null;
            wkgbmnqykcVar.agtfadlqog(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            wkgbmnqykcVar.f36602gxszxtbevo = new ppxfxbqfkf(this, wkgbmnqykcVar, callableC0823iobyxmoadg);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public static iobyxmoadg istkbnxepw(File file, int i13, int i14, long j13) throws IOException {
        if (j13 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i14 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                kegysxyocb(file2, file3, false);
            }
        }
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(file, i13, i14, j13);
        if (iobyxmoadgVar.f36588yggfygwlhe.exists()) {
            try {
                iobyxmoadgVar.wwaezpbzkn();
                iobyxmoadgVar.cdpycssgdh();
                return iobyxmoadgVar;
            } catch (IOException e13) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e13.getMessage() + ", removing");
                iobyxmoadgVar.kcexrzcfyt();
            }
        }
        file.mkdirs();
        iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(file, i13, i14, j13);
        iobyxmoadgVar2.dsvhmnatus();
        return iobyxmoadgVar2;
    }

    private static void kegysxyocb(File file, File file2, boolean z13) throws IOException {
        if (z13) {
            zdlpuopuiu(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private static void lereixgezr(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mbcevpiqjq() {
        while (this.f36586pmvmpeiblj > this.f36579esjtqupxsv) {
            wypolnanlu((String) ((Map.Entry) this.f36581istkbnxepw.entrySet().iterator().next()).getKey());
        }
    }

    private void ojitshcjhn() {
        if (this.f36590zynmafqrjb == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void rgvfuqvkyq(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        wkgbmnqykc wkgbmnqykcVar = ppxfxbqfkfVar.f36597iobyxmoadg;
        if (wkgbmnqykcVar.f36602gxszxtbevo != ppxfxbqfkfVar) {
            throw new IllegalStateException();
        }
        if (z13 && !wkgbmnqykcVar.f36601eablkybsjg) {
            for (int i13 = 0; i13 < this.f36584lereixgezr; i13++) {
                if (!ppxfxbqfkfVar.f36600zoijcleaow[i13]) {
                    ppxfxbqfkfVar.iobyxmoadg();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i13);
                }
                if (!wkgbmnqykcVar.gtknphoqwx(i13).exists()) {
                    ppxfxbqfkfVar.iobyxmoadg();
                    return;
                }
            }
        }
        for (int i14 = 0; i14 < this.f36584lereixgezr; i14++) {
            File fileGtknphoqwx = wkgbmnqykcVar.gtknphoqwx(i14);
            if (!z13) {
                zdlpuopuiu(fileGtknphoqwx);
            } else if (fileGtknphoqwx.exists()) {
                File fileBtonecajqb = wkgbmnqykcVar.btonecajqb(i14);
                fileGtknphoqwx.renameTo(fileBtonecajqb);
                long j13 = wkgbmnqykcVar.f36608zoijcleaow[i14];
                long length = fileBtonecajqb.length();
                wkgbmnqykcVar.f36608zoijcleaow[i14] = length;
                this.f36586pmvmpeiblj = (this.f36586pmvmpeiblj - j13) + length;
            }
        }
        this.f36577cdpycssgdh++;
        wkgbmnqykcVar.f36602gxszxtbevo = null;
        if (wkgbmnqykcVar.f36601eablkybsjg || z13) {
            wkgbmnqykcVar.f36601eablkybsjg = true;
            this.f36590zynmafqrjb.append((CharSequence) "CLEAN");
            this.f36590zynmafqrjb.append(' ');
            this.f36590zynmafqrjb.append((CharSequence) wkgbmnqykcVar.f36603iobyxmoadg);
            this.f36590zynmafqrjb.append((CharSequence) wkgbmnqykcVar.draadjrbmk());
            this.f36590zynmafqrjb.append('\n');
            if (z13) {
                long j14 = this.f36587yadqdtsiqt;
                this.f36587yadqdtsiqt = 1 + j14;
                wkgbmnqykcVar.f36604lqeggnwhkg = j14;
            }
        } else {
            this.f36581istkbnxepw.remove(wkgbmnqykcVar.f36603iobyxmoadg);
            this.f36590zynmafqrjb.append((CharSequence) "REMOVE");
            this.f36590zynmafqrjb.append(' ');
            this.f36590zynmafqrjb.append((CharSequence) wkgbmnqykcVar.f36603iobyxmoadg);
            this.f36590zynmafqrjb.append('\n');
        }
        lereixgezr(this.f36590zynmafqrjb);
        if (this.f36586pmvmpeiblj > this.f36579esjtqupxsv || zynmafqrjb()) {
            this.f36580iozdgvuglv.submit(this.f36585lmojexxdyd);
        }
    }

    private void wwaezpbzkn() {
        g8.zoijcleaow zoijcleaowVar = new g8.zoijcleaow(new FileInputStream(this.f36588yggfygwlhe), g8.ppxfxbqfkf.f36609iobyxmoadg);
        try {
            String strNufgyqmvbu = zoijcleaowVar.nufgyqmvbu();
            String strNufgyqmvbu2 = zoijcleaowVar.nufgyqmvbu();
            String strNufgyqmvbu3 = zoijcleaowVar.nufgyqmvbu();
            String strNufgyqmvbu4 = zoijcleaowVar.nufgyqmvbu();
            String strNufgyqmvbu5 = zoijcleaowVar.nufgyqmvbu();
            if (!"libcore.io.DiskLruCache".equals(strNufgyqmvbu) || !"1".equals(strNufgyqmvbu2) || !Integer.toString(this.f36578cqumvgiudr).equals(strNufgyqmvbu3) || !Integer.toString(this.f36584lereixgezr).equals(strNufgyqmvbu4) || !"".equals(strNufgyqmvbu5)) {
                throw new IOException("unexpected journal header: [" + strNufgyqmvbu + ", " + strNufgyqmvbu2 + ", " + strNufgyqmvbu4 + ", " + strNufgyqmvbu5 + "]");
            }
            int i13 = 0;
            while (true) {
                try {
                    hkdspvbjdz(zoijcleaowVar.nufgyqmvbu());
                    i13++;
                } catch (EOFException unused) {
                    this.f36577cdpycssgdh = i13 - this.f36581istkbnxepw.size();
                    if (zoijcleaowVar.lqeggnwhkg()) {
                        dsvhmnatus();
                    } else {
                        this.f36590zynmafqrjb = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f36588yggfygwlhe, true), g8.ppxfxbqfkf.f36609iobyxmoadg));
                    }
                    g8.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            g8.ppxfxbqfkf.iobyxmoadg(zoijcleaowVar);
            throw th2;
        }
    }

    private static void zdlpuopuiu(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zynmafqrjb() {
        int i13 = this.f36577cdpycssgdh;
        return i13 >= 2000 && i13 >= this.f36581istkbnxepw.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f36590zynmafqrjb == null) {
                return;
            }
            for (wkgbmnqykc wkgbmnqykcVar : new ArrayList(this.f36581istkbnxepw.values())) {
                if (wkgbmnqykcVar.f36602gxszxtbevo != null) {
                    wkgbmnqykcVar.f36602gxszxtbevo.iobyxmoadg();
                }
            }
            mbcevpiqjq();
            rgvfuqvkyq(this.f36590zynmafqrjb);
            this.f36590zynmafqrjb = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public ppxfxbqfkf jyumaefscl(String str) {
        return cqumvgiudr(str, -1L);
    }

    public void kcexrzcfyt() throws IOException {
        close();
        g8.ppxfxbqfkf.zoijcleaow(this.f36589zdlpuopuiu);
    }

    public synchronized eablkybsjg pmvmpeiblj(String str) {
        ojitshcjhn();
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f36581istkbnxepw.get(str);
        if (wkgbmnqykcVar == null) {
            return null;
        }
        if (!wkgbmnqykcVar.f36601eablkybsjg) {
            return null;
        }
        for (File file : wkgbmnqykcVar.f36606ppxfxbqfkf) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f36577cdpycssgdh++;
        this.f36590zynmafqrjb.append((CharSequence) "READ");
        this.f36590zynmafqrjb.append(' ');
        this.f36590zynmafqrjb.append((CharSequence) str);
        this.f36590zynmafqrjb.append('\n');
        if (zynmafqrjb()) {
            this.f36580iozdgvuglv.submit(this.f36585lmojexxdyd);
        }
        return new eablkybsjg(this, str, wkgbmnqykcVar.f36604lqeggnwhkg, wkgbmnqykcVar.f36606ppxfxbqfkf, wkgbmnqykcVar.f36608zoijcleaow, null);
    }

    public synchronized boolean wypolnanlu(String str) {
        try {
            ojitshcjhn();
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) this.f36581istkbnxepw.get(str);
            if (wkgbmnqykcVar != null && wkgbmnqykcVar.f36602gxszxtbevo == null) {
                for (int i13 = 0; i13 < this.f36584lereixgezr; i13++) {
                    File fileBtonecajqb = wkgbmnqykcVar.btonecajqb(i13);
                    if (fileBtonecajqb.exists() && !fileBtonecajqb.delete()) {
                        throw new IOException("failed to delete " + fileBtonecajqb);
                    }
                    this.f36586pmvmpeiblj -= wkgbmnqykcVar.f36608zoijcleaow[i13];
                    wkgbmnqykcVar.f36608zoijcleaow[i13] = 0;
                }
                this.f36577cdpycssgdh++;
                this.f36590zynmafqrjb.append((CharSequence) "REMOVE");
                this.f36590zynmafqrjb.append(' ');
                this.f36590zynmafqrjb.append((CharSequence) str);
                this.f36590zynmafqrjb.append('\n');
                this.f36581istkbnxepw.remove(str);
                if (zynmafqrjb()) {
                    this.f36580iozdgvuglv.submit(this.f36585lmojexxdyd);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
