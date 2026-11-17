package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import y2.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements Cache {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final HashSet f9958draadjrbmk = new HashSet();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f9959btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f9960dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final HashMap f9961eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Cache.CacheException f9962gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Random f9963gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final File f9964iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f9965lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f9966nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f9967ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wkgbmnqykc f9968wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f9969zoijcleaow;

    class iobyxmoadg extends Thread {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f9971zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f9971zdlpuopuiu = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (nufgyqmvbu.this) {
                this.f9971zdlpuopuiu.open();
                nufgyqmvbu.this.rgvfuqvkyq();
                nufgyqmvbu.this.f9969zoijcleaow.eablkybsjg();
            }
        }
    }

    public nufgyqmvbu(File file, zoijcleaow zoijcleaowVar, a3.iobyxmoadg iobyxmoadgVar) {
        this(file, zoijcleaowVar, iobyxmoadgVar, null, false, false);
    }

    private static long agtfadlqog(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private void cqumvgiudr(c3.ppxfxbqfkf ppxfxbqfkfVar) {
        eablkybsjg eablkybsjgVarGxszxtbevo = this.f9967ppxfxbqfkf.gxszxtbevo(ppxfxbqfkfVar.f18644zdlpuopuiu);
        if (eablkybsjgVarGxszxtbevo == null || !eablkybsjgVarGxszxtbevo.btonecajqb(ppxfxbqfkfVar)) {
            return;
        }
        this.f9960dxjokdxxww -= ppxfxbqfkfVar.f18642jyumaefscl;
        if (this.f9968wkgbmnqykc != null) {
            String name = ((File) y2.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar.f18639cqumvgiudr)).getName();
            try {
                this.f9968wkgbmnqykc.gxszxtbevo(name);
            } catch (IOException unused) {
                kcexrzcfyt.nufgyqmvbu("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f9967ppxfxbqfkf.agtfadlqog(eablkybsjgVarGxszxtbevo.f9908zoijcleaow);
        yggfygwlhe(ppxfxbqfkfVar);
    }

    private void esjtqupxsv() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9967ppxfxbqfkf.lqeggnwhkg().iterator();
        while (it.hasNext()) {
            for (c3.ppxfxbqfkf ppxfxbqfkfVar : ((eablkybsjg) it.next()).eablkybsjg()) {
                if (((File) y2.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar.f18639cqumvgiudr)).length() != ppxfxbqfkfVar.f18642jyumaefscl) {
                    arrayList.add(ppxfxbqfkfVar);
                }
            }
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            cqumvgiudr((c3.ppxfxbqfkf) arrayList.get(i13));
        }
    }

    private void gtknphoqwx(dxjokdxxww dxjokdxxwwVar) {
        this.f9967ppxfxbqfkf.gtknphoqwx(dxjokdxxwwVar.f18644zdlpuopuiu).iobyxmoadg(dxjokdxxwwVar);
        this.f9960dxjokdxxww += dxjokdxxwwVar.f18642jyumaefscl;
        zdlpuopuiu(dxjokdxxwwVar);
    }

    private static long iwizpuwonk(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void jyumaefscl(dxjokdxxww dxjokdxxwwVar, c3.ppxfxbqfkf ppxfxbqfkfVar) {
        ArrayList arrayList = (ArrayList) this.f9961eablkybsjg.get(dxjokdxxwwVar.f18644zdlpuopuiu);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.iobyxmoadg) arrayList.get(size)).ppxfxbqfkf(this, dxjokdxxwwVar, ppxfxbqfkfVar);
            }
        }
        this.f9969zoijcleaow.ppxfxbqfkf(this, dxjokdxxwwVar, ppxfxbqfkfVar);
    }

    private static synchronized boolean kcexrzcfyt(File file) {
        return f9958draadjrbmk.add(file.getAbsoluteFile());
    }

    private dxjokdxxww lereixgezr(String str, dxjokdxxww dxjokdxxwwVar) {
        boolean z13;
        if (!this.f9965lqeggnwhkg) {
            return dxjokdxxwwVar;
        }
        String name = ((File) y2.iobyxmoadg.eablkybsjg(dxjokdxxwwVar.f18639cqumvgiudr)).getName();
        long j13 = dxjokdxxwwVar.f18642jyumaefscl;
        long jCurrentTimeMillis = System.currentTimeMillis();
        wkgbmnqykc wkgbmnqykcVar = this.f9968wkgbmnqykc;
        if (wkgbmnqykcVar != null) {
            try {
                wkgbmnqykcVar.nufgyqmvbu(name, j13, jCurrentTimeMillis);
            } catch (IOException unused) {
                kcexrzcfyt.nufgyqmvbu("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z13 = false;
        } else {
            z13 = true;
        }
        dxjokdxxww dxjokdxxwwVarGtknphoqwx = ((eablkybsjg) y2.iobyxmoadg.eablkybsjg(this.f9967ppxfxbqfkf.gxszxtbevo(str))).gtknphoqwx(dxjokdxxwwVar, jCurrentTimeMillis, z13);
        jyumaefscl(dxjokdxxwwVar, dxjokdxxwwVarGtknphoqwx);
        return dxjokdxxwwVarGtknphoqwx;
    }

    private dxjokdxxww ojitshcjhn(String str, long j13, long j14) {
        dxjokdxxww dxjokdxxwwVarWkgbmnqykc;
        eablkybsjg eablkybsjgVarGxszxtbevo = this.f9967ppxfxbqfkf.gxszxtbevo(str);
        if (eablkybsjgVarGxszxtbevo == null) {
            return dxjokdxxww.lqeggnwhkg(str, j13, j14);
        }
        while (true) {
            dxjokdxxwwVarWkgbmnqykc = eablkybsjgVarGxszxtbevo.wkgbmnqykc(j13, j14);
            if (!dxjokdxxwwVarWkgbmnqykc.f18641iwizpuwonk || ((File) y2.iobyxmoadg.eablkybsjg(dxjokdxxwwVarWkgbmnqykc.f18639cqumvgiudr)).length() == dxjokdxxwwVarWkgbmnqykc.f18642jyumaefscl) {
                break;
            }
            esjtqupxsv();
        }
        return dxjokdxxwwVarWkgbmnqykc;
    }

    private static long oxmwwwfdhm(File[] fileArr) {
        int length = fileArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            File file = fileArr[i13];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return iwizpuwonk(name);
                } catch (NumberFormatException unused) {
                    kcexrzcfyt.ppxfxbqfkf("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rgvfuqvkyq() {
        if (!this.f9964iobyxmoadg.exists()) {
            try {
                wflxmlrfwp(this.f9964iobyxmoadg);
            } catch (Cache.CacheException e13) {
                this.f9962gtknphoqwx = e13;
                return;
            }
        }
        File[] fileArrListFiles = this.f9964iobyxmoadg.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f9964iobyxmoadg;
            kcexrzcfyt.ppxfxbqfkf("SimpleCache", str);
            this.f9962gtknphoqwx = new Cache.CacheException(str);
            return;
        }
        long jOxmwwwfdhm = oxmwwwfdhm(fileArrListFiles);
        this.f9966nufgyqmvbu = jOxmwwwfdhm;
        if (jOxmwwwfdhm == -1) {
            try {
                this.f9966nufgyqmvbu = agtfadlqog(this.f9964iobyxmoadg);
            } catch (IOException e14) {
                String str2 = "Failed to create cache UID: " + this.f9964iobyxmoadg;
                kcexrzcfyt.wkgbmnqykc("SimpleCache", str2, e14);
                this.f9962gtknphoqwx = new Cache.CacheException(str2, e14);
                return;
            }
        }
        try {
            this.f9967ppxfxbqfkf.draadjrbmk(this.f9966nufgyqmvbu);
            wkgbmnqykc wkgbmnqykcVar = this.f9968wkgbmnqykc;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.eablkybsjg(this.f9966nufgyqmvbu);
                Map mapZoijcleaow = this.f9968wkgbmnqykc.zoijcleaow();
                vdvldrhtss(this.f9964iobyxmoadg, true, fileArrListFiles, mapZoijcleaow);
                this.f9968wkgbmnqykc.lqeggnwhkg(mapZoijcleaow.keySet());
            } else {
                vdvldrhtss(this.f9964iobyxmoadg, true, fileArrListFiles, null);
            }
            this.f9967ppxfxbqfkf.rgvfuqvkyq();
            try {
                this.f9967ppxfxbqfkf.vdvldrhtss();
            } catch (IOException e15) {
                kcexrzcfyt.wkgbmnqykc("SimpleCache", "Storing index file failed", e15);
            }
        } catch (IOException e16) {
            String str3 = "Failed to initialize cache indices: " + this.f9964iobyxmoadg;
            kcexrzcfyt.wkgbmnqykc("SimpleCache", str3, e16);
            this.f9962gtknphoqwx = new Cache.CacheException(str3, e16);
        }
    }

    private void vdvldrhtss(File file, boolean z13, File[] fileArr, Map map) {
        long j13;
        long j14;
        if (fileArr == null || fileArr.length == 0) {
            if (z13) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z13 && name.indexOf(46) == -1) {
                vdvldrhtss(file2, false, file2.listFiles(), map);
            } else if (!z13 || (!gxszxtbevo.wflxmlrfwp(name) && !name.endsWith(".uid"))) {
                ppxfxbqfkf ppxfxbqfkfVar = map != null ? (ppxfxbqfkf) map.remove(name) : null;
                if (ppxfxbqfkfVar != null) {
                    j14 = ppxfxbqfkfVar.f9972iobyxmoadg;
                    j13 = ppxfxbqfkfVar.f9973zoijcleaow;
                } else {
                    j13 = -9223372036854775807L;
                    j14 = -1;
                }
                dxjokdxxww dxjokdxxwwVarEablkybsjg = dxjokdxxww.eablkybsjg(file2, j14, j13, this.f9967ppxfxbqfkf);
                if (dxjokdxxwwVarEablkybsjg != null) {
                    gtknphoqwx(dxjokdxxwwVarEablkybsjg);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static void wflxmlrfwp(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        kcexrzcfyt.ppxfxbqfkf("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    private void yggfygwlhe(c3.ppxfxbqfkf ppxfxbqfkfVar) {
        ArrayList arrayList = (ArrayList) this.f9961eablkybsjg.get(ppxfxbqfkfVar.f18644zdlpuopuiu);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.iobyxmoadg) arrayList.get(size)).gxszxtbevo(this, ppxfxbqfkfVar);
            }
        }
        this.f9969zoijcleaow.gxszxtbevo(this, ppxfxbqfkfVar);
    }

    private void zdlpuopuiu(dxjokdxxww dxjokdxxwwVar) {
        ArrayList arrayList = (ArrayList) this.f9961eablkybsjg.get(dxjokdxxwwVar.f18644zdlpuopuiu);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.iobyxmoadg) arrayList.get(size)).zoijcleaow(this, dxjokdxxwwVar);
            }
        }
        this.f9969zoijcleaow.zoijcleaow(this, dxjokdxxwwVar);
    }

    public synchronized void draadjrbmk() {
        Cache.CacheException cacheException = this.f9962gtknphoqwx;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void eablkybsjg(String str, c3.eablkybsjg eablkybsjgVar) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f9959btonecajqb);
        draadjrbmk();
        this.f9967ppxfxbqfkf.wkgbmnqykc(str, eablkybsjgVar);
        try {
            this.f9967ppxfxbqfkf.vdvldrhtss();
        } catch (IOException e13) {
            throw new Cache.CacheException(e13);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void gxszxtbevo(c3.ppxfxbqfkf ppxfxbqfkfVar) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f9959btonecajqb);
        cqumvgiudr(ppxfxbqfkfVar);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized File iobyxmoadg(String str, long j13, long j14) {
        eablkybsjg eablkybsjgVarGxszxtbevo;
        File file;
        try {
            y2.iobyxmoadg.lqeggnwhkg(!this.f9959btonecajqb);
            draadjrbmk();
            eablkybsjgVarGxszxtbevo = this.f9967ppxfxbqfkf.gxszxtbevo(str);
            y2.iobyxmoadg.eablkybsjg(eablkybsjgVarGxszxtbevo);
            y2.iobyxmoadg.lqeggnwhkg(eablkybsjgVarGxszxtbevo.lqeggnwhkg(j13, j14));
            if (!this.f9964iobyxmoadg.exists()) {
                wflxmlrfwp(this.f9964iobyxmoadg);
                esjtqupxsv();
            }
            this.f9969zoijcleaow.wkgbmnqykc(this, str, j13, j14);
            file = new File(this.f9964iobyxmoadg, Integer.toString(this.f9963gxszxtbevo.nextInt(10)));
            if (!file.exists()) {
                wflxmlrfwp(file);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return dxjokdxxww.dxjokdxxww(file, eablkybsjgVarGxszxtbevo.f9905iobyxmoadg, j13, System.currentTimeMillis());
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized c3.ppxfxbqfkf lqeggnwhkg(String str, long j13, long j14) {
        c3.ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc;
        y2.iobyxmoadg.lqeggnwhkg(!this.f9959btonecajqb);
        draadjrbmk();
        while (true) {
            ppxfxbqfkfVarWkgbmnqykc = wkgbmnqykc(str, j13, j14);
            if (ppxfxbqfkfVarWkgbmnqykc == null) {
                wait();
            }
        }
        return ppxfxbqfkfVarWkgbmnqykc;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void nufgyqmvbu(File file, long j13) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f9959btonecajqb);
        if (file.exists()) {
            if (j13 == 0) {
                file.delete();
                return;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) y2.iobyxmoadg.eablkybsjg(dxjokdxxww.gxszxtbevo(file, j13, this.f9967ppxfxbqfkf));
            eablkybsjg eablkybsjgVar = (eablkybsjg) y2.iobyxmoadg.eablkybsjg(this.f9967ppxfxbqfkf.gxszxtbevo(dxjokdxxwwVar.f18644zdlpuopuiu));
            y2.iobyxmoadg.lqeggnwhkg(eablkybsjgVar.lqeggnwhkg(dxjokdxxwwVar.f18643yggfygwlhe, dxjokdxxwwVar.f18642jyumaefscl));
            long jIobyxmoadg = c3.wkgbmnqykc.iobyxmoadg(eablkybsjgVar.ppxfxbqfkf());
            if (jIobyxmoadg != -1) {
                y2.iobyxmoadg.lqeggnwhkg(dxjokdxxwwVar.f18643yggfygwlhe + dxjokdxxwwVar.f18642jyumaefscl <= jIobyxmoadg);
            }
            if (this.f9968wkgbmnqykc == null) {
                gtknphoqwx(dxjokdxxwwVar);
                this.f9967ppxfxbqfkf.vdvldrhtss();
                notifyAll();
                return;
            }
            try {
                this.f9968wkgbmnqykc.nufgyqmvbu(file.getName(), dxjokdxxwwVar.f18642jyumaefscl, dxjokdxxwwVar.f18640esjtqupxsv);
                gtknphoqwx(dxjokdxxwwVar);
                try {
                    this.f9967ppxfxbqfkf.vdvldrhtss();
                    notifyAll();
                    return;
                } catch (IOException e13) {
                    throw new Cache.CacheException(e13);
                }
            } catch (IOException e14) {
                throw new Cache.CacheException(e14);
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized void ppxfxbqfkf(c3.ppxfxbqfkf ppxfxbqfkfVar) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f9959btonecajqb);
        eablkybsjg eablkybsjgVar = (eablkybsjg) y2.iobyxmoadg.eablkybsjg(this.f9967ppxfxbqfkf.gxszxtbevo(ppxfxbqfkfVar.f18644zdlpuopuiu));
        eablkybsjgVar.draadjrbmk(ppxfxbqfkfVar.f18643yggfygwlhe);
        this.f9967ppxfxbqfkf.agtfadlqog(eablkybsjgVar.f9908zoijcleaow);
        notifyAll();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized c3.ppxfxbqfkf wkgbmnqykc(String str, long j13, long j14) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f9959btonecajqb);
        draadjrbmk();
        dxjokdxxww dxjokdxxwwVarOjitshcjhn = ojitshcjhn(str, j13, j14);
        if (dxjokdxxwwVarOjitshcjhn.f18641iwizpuwonk) {
            return lereixgezr(str, dxjokdxxwwVarOjitshcjhn);
        }
        if (this.f9967ppxfxbqfkf.gtknphoqwx(str).dxjokdxxww(j13, dxjokdxxwwVarOjitshcjhn.f18642jyumaefscl)) {
            return dxjokdxxwwVarOjitshcjhn;
        }
        return null;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public synchronized c3.wkgbmnqykc zoijcleaow(String str) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f9959btonecajqb);
        return this.f9967ppxfxbqfkf.nufgyqmvbu(str);
    }

    public nufgyqmvbu(File file, zoijcleaow zoijcleaowVar, a3.iobyxmoadg iobyxmoadgVar, byte[] bArr, boolean z13, boolean z14) {
        this(file, zoijcleaowVar, new gxszxtbevo(iobyxmoadgVar, file, bArr, z13, z14), (iobyxmoadgVar == null || z14) ? null : new wkgbmnqykc(iobyxmoadgVar));
    }

    nufgyqmvbu(File file, zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar, wkgbmnqykc wkgbmnqykcVar) {
        if (kcexrzcfyt(file)) {
            this.f9964iobyxmoadg = file;
            this.f9969zoijcleaow = zoijcleaowVar;
            this.f9967ppxfxbqfkf = gxszxtbevoVar;
            this.f9968wkgbmnqykc = wkgbmnqykcVar;
            this.f9961eablkybsjg = new HashMap();
            this.f9963gxszxtbevo = new Random();
            this.f9965lqeggnwhkg = zoijcleaowVar.iobyxmoadg();
            this.f9966nufgyqmvbu = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new iobyxmoadg("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
