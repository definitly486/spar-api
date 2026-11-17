package cl;

import bl.esjtqupxsv;
import bl.iozdgvuglv;
import bl.wwaezpbzkn;
import gg.cqumvgiudr;
import gg.gtknphoqwx;
import gg.vdvldrhtss;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf extends bl.dxjokdxxww {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final iobyxmoadg f19983gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final esjtqupxsv f19984lqeggnwhkg = esjtqupxsv.iobyxmoadg.eablkybsjg(esjtqupxsv.f16670yggfygwlhe, CardDateFormatTextWatcher.DIVIDER_CHARACTER, false, 1, null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gtknphoqwx f19985eablkybsjg;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: cl.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0371iobyxmoadg extends jyumaefscl implements draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C0371iobyxmoadg f19986zdlpuopuiu = new C0371iobyxmoadg();

            C0371iobyxmoadg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(wkgbmnqykc entry) {
                zdlpuopuiu.btonecajqb(entry, "entry");
                return Boolean.valueOf(ppxfxbqfkf.f19983gxszxtbevo.ppxfxbqfkf(entry.iobyxmoadg()));
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean ppxfxbqfkf(esjtqupxsv esjtqupxsvVar) {
            return !kcexrzcfyt.pmvmpeiblj(esjtqupxsvVar.gxszxtbevo(), ".class", true);
        }

        public final List eablkybsjg(ClassLoader classLoader) throws IOException {
            zdlpuopuiu.btonecajqb(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            zdlpuopuiu.dxjokdxxww(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            zdlpuopuiu.dxjokdxxww(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL it : list) {
                iobyxmoadg iobyxmoadgVar = ppxfxbqfkf.f19983gxszxtbevo;
                zdlpuopuiu.dxjokdxxww(it, "it");
                vdvldrhtss vdvldrhtssVarGxszxtbevo = iobyxmoadgVar.gxszxtbevo(it);
                if (vdvldrhtssVarGxszxtbevo != null) {
                    arrayList.add(vdvldrhtssVarGxszxtbevo);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            zdlpuopuiu.dxjokdxxww(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            zdlpuopuiu.dxjokdxxww(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL it2 : list2) {
                iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkf.f19983gxszxtbevo;
                zdlpuopuiu.dxjokdxxww(it2, "it");
                vdvldrhtss vdvldrhtssVarLqeggnwhkg = iobyxmoadgVar2.lqeggnwhkg(it2);
                if (vdvldrhtssVarLqeggnwhkg != null) {
                    arrayList2.add(vdvldrhtssVarLqeggnwhkg);
                }
            }
            return hg.jyumaefscl.ixidwrxhsl(arrayList, arrayList2);
        }

        public final vdvldrhtss gxszxtbevo(URL url) {
            zdlpuopuiu.btonecajqb(url, "<this>");
            if (zdlpuopuiu.eablkybsjg(url.getProtocol(), "file")) {
                return cqumvgiudr.iobyxmoadg(bl.dxjokdxxww.f16668zoijcleaow, esjtqupxsv.iobyxmoadg.wkgbmnqykc(esjtqupxsv.f16670yggfygwlhe, new File(url.toURI()), false, 1, null));
            }
            return null;
        }

        public final vdvldrhtss lqeggnwhkg(URL url) {
            int iIyctptxqzt;
            zdlpuopuiu.btonecajqb(url, "<this>");
            String string = url.toString();
            zdlpuopuiu.dxjokdxxww(string, "toString()");
            if (!kcexrzcfyt.stevsuqkhv(string, "jar:file:", false, 2, null) || (iIyctptxqzt = kcexrzcfyt.iyctptxqzt(string, "!", 0, false, 6, null)) == -1) {
                return null;
            }
            esjtqupxsv.iobyxmoadg iobyxmoadgVar = esjtqupxsv.f16670yggfygwlhe;
            String strSubstring = string.substring(4, iIyctptxqzt);
            zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return cqumvgiudr.iobyxmoadg(eablkybsjg.wkgbmnqykc(esjtqupxsv.iobyxmoadg.wkgbmnqykc(iobyxmoadgVar, new File(URI.create(strSubstring)), false, 1, null), bl.dxjokdxxww.f16668zoijcleaow, C0371iobyxmoadg.f19986zdlpuopuiu), zoijcleaow());
        }

        public final esjtqupxsv wkgbmnqykc(esjtqupxsv esjtqupxsvVar, esjtqupxsv base) {
            zdlpuopuiu.btonecajqb(esjtqupxsvVar, "<this>");
            zdlpuopuiu.btonecajqb(base, "base");
            return zoijcleaow().gtknphoqwx(kcexrzcfyt.pkzmftpjix(kcexrzcfyt.lxfrhoxuzk(esjtqupxsvVar.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        public final esjtqupxsv zoijcleaow() {
            return ppxfxbqfkf.f19984lqeggnwhkg;
        }

        private iobyxmoadg() {
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ClassLoader f19987zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ClassLoader classLoader) {
            super(0);
            this.f19987zdlpuopuiu = classLoader;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return ppxfxbqfkf.f19983gxszxtbevo.eablkybsjg(this.f19987zdlpuopuiu);
        }
    }

    public ppxfxbqfkf(ClassLoader classLoader, boolean z13) {
        zdlpuopuiu.btonecajqb(classLoader, "classLoader");
        this.f19985eablkybsjg = gg.draadjrbmk.zoijcleaow(new zoijcleaow(classLoader));
        if (z13) {
            yggfygwlhe().size();
        }
    }

    private final String jyumaefscl(esjtqupxsv esjtqupxsvVar) {
        return zdlpuopuiu(esjtqupxsvVar).dxjokdxxww(f19984lqeggnwhkg).toString();
    }

    private final List yggfygwlhe() {
        return (List) this.f19985eablkybsjg.getValue();
    }

    private final esjtqupxsv zdlpuopuiu(esjtqupxsv esjtqupxsvVar) {
        return f19984lqeggnwhkg.btonecajqb(esjtqupxsvVar, true);
    }

    @Override // bl.dxjokdxxww
    public bl.lqeggnwhkg agtfadlqog(esjtqupxsv file) throws FileNotFoundException {
        zdlpuopuiu.btonecajqb(file, "file");
        if (!f19983gxszxtbevo.ppxfxbqfkf(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strJyumaefscl = jyumaefscl(file);
        for (vdvldrhtss vdvldrhtssVar : yggfygwlhe()) {
            try {
                return ((bl.dxjokdxxww) vdvldrhtssVar.iobyxmoadg()).agtfadlqog(((esjtqupxsv) vdvldrhtssVar.wkgbmnqykc()).gtknphoqwx(strJyumaefscl));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // bl.dxjokdxxww
    public void dxjokdxxww(esjtqupxsv path, boolean z13) throws IOException {
        zdlpuopuiu.btonecajqb(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // bl.dxjokdxxww
    public List gtknphoqwx(esjtqupxsv dir) throws FileNotFoundException {
        zdlpuopuiu.btonecajqb(dir, "dir");
        String strJyumaefscl = jyumaefscl(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z13 = false;
        for (vdvldrhtss vdvldrhtssVar : yggfygwlhe()) {
            bl.dxjokdxxww dxjokdxxwwVar = (bl.dxjokdxxww) vdvldrhtssVar.iobyxmoadg();
            esjtqupxsv esjtqupxsvVar = (esjtqupxsv) vdvldrhtssVar.wkgbmnqykc();
            try {
                List listGtknphoqwx = dxjokdxxwwVar.gtknphoqwx(esjtqupxsvVar.gtknphoqwx(strJyumaefscl));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listGtknphoqwx) {
                    if (f19983gxszxtbevo.ppxfxbqfkf((esjtqupxsv) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f19983gxszxtbevo.wkgbmnqykc((esjtqupxsv) it.next(), esjtqupxsvVar));
                }
                hg.jyumaefscl.istkbnxepw(linkedHashSet, arrayList2);
                z13 = true;
            } catch (IOException unused) {
            }
        }
        if (z13) {
            return hg.jyumaefscl.m(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // bl.dxjokdxxww
    public void lqeggnwhkg(esjtqupxsv dir, boolean z13) throws IOException {
        zdlpuopuiu.btonecajqb(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // bl.dxjokdxxww
    public void ppxfxbqfkf(esjtqupxsv source, esjtqupxsv target) throws IOException {
        zdlpuopuiu.btonecajqb(source, "source");
        zdlpuopuiu.btonecajqb(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // bl.dxjokdxxww
    public iozdgvuglv rgvfuqvkyq(esjtqupxsv file, boolean z13) throws IOException {
        zdlpuopuiu.btonecajqb(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // bl.dxjokdxxww
    public wwaezpbzkn vdvldrhtss(esjtqupxsv file) throws FileNotFoundException {
        zdlpuopuiu.btonecajqb(file, "file");
        if (!f19983gxszxtbevo.ppxfxbqfkf(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strJyumaefscl = jyumaefscl(file);
        for (vdvldrhtss vdvldrhtssVar : yggfygwlhe()) {
            try {
                return ((bl.dxjokdxxww) vdvldrhtssVar.iobyxmoadg()).vdvldrhtss(((esjtqupxsv) vdvldrhtssVar.wkgbmnqykc()).gtknphoqwx(strJyumaefscl));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // bl.dxjokdxxww
    public bl.nufgyqmvbu wflxmlrfwp(esjtqupxsv path) {
        zdlpuopuiu.btonecajqb(path, "path");
        if (!f19983gxszxtbevo.ppxfxbqfkf(path)) {
            return null;
        }
        String strJyumaefscl = jyumaefscl(path);
        for (vdvldrhtss vdvldrhtssVar : yggfygwlhe()) {
            bl.nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = ((bl.dxjokdxxww) vdvldrhtssVar.iobyxmoadg()).wflxmlrfwp(((esjtqupxsv) vdvldrhtssVar.wkgbmnqykc()).gtknphoqwx(strJyumaefscl));
            if (nufgyqmvbuVarWflxmlrfwp != null) {
                return nufgyqmvbuVarWflxmlrfwp;
            }
        }
        return null;
    }

    @Override // bl.dxjokdxxww
    public iozdgvuglv zoijcleaow(esjtqupxsv file, boolean z13) throws IOException {
        zdlpuopuiu.btonecajqb(file, "file");
        throw new IOException(this + " is read-only");
    }
}
