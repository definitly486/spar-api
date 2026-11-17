package gc;

import ac.agtfadlqog;
import ac.zynmafqrjb;
import cc.ojitshcjhn;
import dc.iozdgvuglv;
import ic.btonecajqb;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AtomicInteger f36796iobyxmoadg = new AtomicInteger(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final btonecajqb f36797ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final agtfadlqog f36798wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f36799zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Charset f36792eablkybsjg = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f36793gxszxtbevo = 15;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final ec.btonecajqb f36794lqeggnwhkg = new ec.btonecajqb();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Comparator f36795nufgyqmvbu = new Comparator() { // from class: gc.iobyxmoadg
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return eablkybsjg.yggfygwlhe((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final FilenameFilter f36791dxjokdxxww = new FilenameFilter() { // from class: gc.zoijcleaow
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return eablkybsjg.jyumaefscl(file, str);
        }
    };

    public eablkybsjg(lqeggnwhkg lqeggnwhkgVar, btonecajqb btonecajqbVar, agtfadlqog agtfadlqogVar) {
        this.f36799zoijcleaow = lqeggnwhkgVar;
        this.f36797ppxfxbqfkf = btonecajqbVar;
        this.f36798wkgbmnqykc = agtfadlqogVar;
    }

    private List agtfadlqog() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f36799zoijcleaow.wflxmlrfwp());
        arrayList.addAll(this.f36799zoijcleaow.btonecajqb());
        Comparator comparator = f36795nufgyqmvbu;
        Collections.sort(arrayList, comparator);
        List listOjitshcjhn = this.f36799zoijcleaow.ojitshcjhn();
        Collections.sort(listOjitshcjhn, comparator);
        arrayList.addAll(listOjitshcjhn);
        return arrayList;
    }

    private void btonecajqb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private void cdpycssgdh(File file, List list, long j13, boolean z13, String str, String str2) {
        try {
            ec.btonecajqb btonecajqbVar = f36794lqeggnwhkg;
            iozdgvuglv iozdgvuglvVarOxmwwwfdhm = btonecajqbVar.jpowsppfya(pmvmpeiblj(file)).jyumaefscl(j13, z13, str).rgvfuqvkyq(str2).oxmwwwfdhm(list);
            iozdgvuglv.eablkybsjg eablkybsjgVarAgtfadlqog = iozdgvuglvVarOxmwwwfdhm.agtfadlqog();
            if (eablkybsjgVarAgtfadlqog == null) {
                return;
            }
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("appQualitySessionId: " + str2);
            iozdgvuglv(z13 ? this.f36799zoijcleaow.draadjrbmk(eablkybsjgVarAgtfadlqog.dxjokdxxww()) : this.f36799zoijcleaow.agtfadlqog(eablkybsjgVarAgtfadlqog.dxjokdxxww()), btonecajqbVar.hkdspvbjdz(iozdgvuglvVarOxmwwwfdhm));
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Could not synthesize final report file for " + file, e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int cqumvgiudr(File file, File file2) {
        return ojitshcjhn(file.getName()).compareTo(ojitshcjhn(file2.getName()));
    }

    private SortedSet eablkybsjg(String str) {
        this.f36799zoijcleaow.wkgbmnqykc();
        SortedSet sortedSetRgvfuqvkyq = rgvfuqvkyq();
        if (str != null) {
            sortedSetRgvfuqvkyq.remove(str);
        }
        if (sortedSetRgvfuqvkyq.size() <= 8) {
            return sortedSetRgvfuqvkyq;
        }
        while (sortedSetRgvfuqvkyq.size() > 8) {
            String str2 = (String) sortedSetRgvfuqvkyq.last();
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Removing session over cap: " + str2);
            this.f36799zoijcleaow.eablkybsjg(str2);
            sortedSetRgvfuqvkyq.remove(str2);
        }
        return sortedSetRgvfuqvkyq;
    }

    private static int gxszxtbevo(List list, int i13) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i13) {
                return size;
            }
            lqeggnwhkg.jyumaefscl(file);
            size--;
        }
        return size;
    }

    private static void iozdgvuglv(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f36792eablkybsjg);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void istkbnxepw(String str, long j13) {
        boolean z13;
        List listOxmwwwfdhm = this.f36799zoijcleaow.oxmwwwfdhm(str, f36791dxjokdxxww);
        if (listOxmwwwfdhm.isEmpty()) {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listOxmwwwfdhm);
        ArrayList arrayList = new ArrayList();
        Iterator it = listOxmwwwfdhm.iterator();
        loop0: while (true) {
            z13 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File file = (File) it.next();
                try {
                    arrayList.add(f36794lqeggnwhkg.btonecajqb(pmvmpeiblj(file)));
                    if (z13 || kcexrzcfyt(file.getName())) {
                        z13 = true;
                    }
                } catch (IOException e13) {
                    xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Could not add event to report for " + file, e13);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            cdpycssgdh(this.f36799zoijcleaow.vdvldrhtss(str, "report"), arrayList, j13, z13, ojitshcjhn.agtfadlqog(str, this.f36799zoijcleaow), this.f36798wkgbmnqykc.wkgbmnqykc(str));
        } else {
            xb.lqeggnwhkg.gxszxtbevo().gtknphoqwx("Could not parse event files for session " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean jyumaefscl(File file, String str) {
        return str.startsWith("event");
    }

    private static boolean kcexrzcfyt(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    private static void lmojexxdyd(File file, String str, long j13) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f36792eablkybsjg);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(nufgyqmvbu(j13));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void lqeggnwhkg() {
        int i13 = this.f36797ppxfxbqfkf.zoijcleaow().f42380iobyxmoadg.f42390zoijcleaow;
        List listAgtfadlqog = agtfadlqog();
        int size = listAgtfadlqog.size();
        if (size <= i13) {
            return;
        }
        Iterator it = listAgtfadlqog.subList(i13, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static long nufgyqmvbu(long j13) {
        return j13 * 1000;
    }

    private static String ojitshcjhn(String str) {
        return str.substring(0, f36793gxszxtbevo);
    }

    private static String pmvmpeiblj(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i13 = fileInputStream.read(bArr);
                if (i13 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f36792eablkybsjg);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i13);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private static String wflxmlrfwp(int i13, boolean z13) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i13)) + (z13 ? "_" : "");
    }

    private int yadqdtsiqt(String str, int i13) {
        List listOxmwwwfdhm = this.f36799zoijcleaow.oxmwwwfdhm(str, new FilenameFilter() { // from class: gc.ppxfxbqfkf
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return eablkybsjg.zdlpuopuiu(file, str2);
            }
        });
        Collections.sort(listOxmwwwfdhm, new Comparator() { // from class: gc.wkgbmnqykc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return eablkybsjg.cqumvgiudr((File) obj, (File) obj2);
            }
        });
        return gxszxtbevo(listOxmwwwfdhm, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int yggfygwlhe(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zdlpuopuiu(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    private void zynmafqrjb(File file, iozdgvuglv.wkgbmnqykc wkgbmnqykcVar, String str, iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        String strWkgbmnqykc = this.f36798wkgbmnqykc.wkgbmnqykc(str);
        try {
            ec.btonecajqb btonecajqbVar = f36794lqeggnwhkg;
            iozdgvuglv(this.f36799zoijcleaow.dxjokdxxww(str), btonecajqbVar.hkdspvbjdz(btonecajqbVar.jpowsppfya(pmvmpeiblj(file)).yggfygwlhe(wkgbmnqykcVar).vdvldrhtss(iobyxmoadgVar).rgvfuqvkyq(strWkgbmnqykc)));
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Could not synthesize final native report file for " + file, e13);
        }
    }

    public void draadjrbmk(String str, iozdgvuglv.wkgbmnqykc wkgbmnqykcVar, iozdgvuglv.iobyxmoadg iobyxmoadgVar) {
        File fileVdvldrhtss = this.f36799zoijcleaow.vdvldrhtss(str, "report");
        xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Writing native session report for " + str + " to file: " + fileVdvldrhtss);
        zynmafqrjb(fileVdvldrhtss, wkgbmnqykcVar, str, iobyxmoadgVar);
    }

    public void dxjokdxxww() {
        btonecajqb(this.f36799zoijcleaow.ojitshcjhn());
        btonecajqb(this.f36799zoijcleaow.wflxmlrfwp());
        btonecajqb(this.f36799zoijcleaow.btonecajqb());
    }

    public void esjtqupxsv(iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, String str, boolean z13) {
        int i13 = this.f36797ppxfxbqfkf.zoijcleaow().f42380iobyxmoadg.f42389iobyxmoadg;
        try {
            iozdgvuglv(this.f36799zoijcleaow.vdvldrhtss(str, wflxmlrfwp(this.f36796iobyxmoadg.getAndIncrement(), z13)), f36794lqeggnwhkg.gtknphoqwx(wkgbmnqykcVar));
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Could not persist event for session " + str, e13);
        }
        yadqdtsiqt(str, i13);
    }

    public void gtknphoqwx(String str, long j13) {
        for (String str2 : eablkybsjg(str)) {
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Finalizing report for session " + str2);
            istkbnxepw(str2, j13);
            this.f36799zoijcleaow.eablkybsjg(str2);
        }
        lqeggnwhkg();
    }

    public List iwizpuwonk() {
        List<File> listAgtfadlqog = agtfadlqog();
        ArrayList arrayList = new ArrayList();
        for (File file : listAgtfadlqog) {
            try {
                arrayList.add(zynmafqrjb.iobyxmoadg(f36794lqeggnwhkg.jpowsppfya(pmvmpeiblj(file)), file.getName(), file));
            } catch (IOException e13) {
                xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Could not load report file " + file + "; deleting", e13);
                file.delete();
            }
        }
        return arrayList;
    }

    public void lereixgezr(iozdgvuglv iozdgvuglvVar) {
        iozdgvuglv.eablkybsjg eablkybsjgVarAgtfadlqog = iozdgvuglvVar.agtfadlqog();
        if (eablkybsjgVarAgtfadlqog == null) {
            xb.lqeggnwhkg.gxszxtbevo().zoijcleaow("Could not get session for report");
            return;
        }
        String strDxjokdxxww = eablkybsjgVarAgtfadlqog.dxjokdxxww();
        try {
            iozdgvuglv(this.f36799zoijcleaow.vdvldrhtss(strDxjokdxxww, "report"), f36794lqeggnwhkg.hkdspvbjdz(iozdgvuglvVar));
            lmojexxdyd(this.f36799zoijcleaow.vdvldrhtss(strDxjokdxxww, "start-time"), "", eablkybsjgVarAgtfadlqog.draadjrbmk());
        } catch (IOException e13) {
            xb.lqeggnwhkg.gxszxtbevo().ppxfxbqfkf("Could not persist report for session " + strDxjokdxxww, e13);
        }
    }

    public boolean oxmwwwfdhm() {
        return (this.f36799zoijcleaow.ojitshcjhn().isEmpty() && this.f36799zoijcleaow.wflxmlrfwp().isEmpty() && this.f36799zoijcleaow.btonecajqb().isEmpty()) ? false : true;
    }

    public SortedSet rgvfuqvkyq() {
        return new TreeSet(this.f36799zoijcleaow.gxszxtbevo()).descendingSet();
    }

    public long vdvldrhtss(String str) {
        return this.f36799zoijcleaow.vdvldrhtss(str, "start-time").lastModified();
    }
}
