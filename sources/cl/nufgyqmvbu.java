package cl;

import bl.esjtqupxsv;
import hg.wflxmlrfwp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {
    public static final void iobyxmoadg(bl.dxjokdxxww dxjokdxxwwVar, esjtqupxsv dir, boolean z13) {
        zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        zdlpuopuiu.btonecajqb(dir, "dir");
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp();
        for (esjtqupxsv esjtqupxsvVarNufgyqmvbu = dir; esjtqupxsvVarNufgyqmvbu != null && !dxjokdxxwwVar.btonecajqb(esjtqupxsvVarNufgyqmvbu); esjtqupxsvVarNufgyqmvbu = esjtqupxsvVarNufgyqmvbu.nufgyqmvbu()) {
            wflxmlrfwpVar.addFirst(esjtqupxsvVarNufgyqmvbu);
        }
        if (z13 && wflxmlrfwpVar.isEmpty()) {
            throw new IOException(dir + " already exist.");
        }
        Iterator<E> it = wflxmlrfwpVar.iterator();
        while (it.hasNext()) {
            dxjokdxxwwVar.gxszxtbevo((esjtqupxsv) it.next());
        }
    }

    public static final bl.nufgyqmvbu ppxfxbqfkf(bl.dxjokdxxww dxjokdxxwwVar, esjtqupxsv path) throws FileNotFoundException {
        zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        zdlpuopuiu.btonecajqb(path, "path");
        bl.nufgyqmvbu nufgyqmvbuVarWflxmlrfwp = dxjokdxxwwVar.wflxmlrfwp(path);
        if (nufgyqmvbuVarWflxmlrfwp != null) {
            return nufgyqmvbuVarWflxmlrfwp;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final boolean zoijcleaow(bl.dxjokdxxww dxjokdxxwwVar, esjtqupxsv path) {
        zdlpuopuiu.btonecajqb(dxjokdxxwwVar, "<this>");
        zdlpuopuiu.btonecajqb(path, "path");
        return dxjokdxxwwVar.wflxmlrfwp(path) != null;
    }
}
