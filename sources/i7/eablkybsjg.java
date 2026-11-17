package i7;

import bl.esjtqupxsv;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {
    public static final void iobyxmoadg(bl.dxjokdxxww dxjokdxxwwVar, esjtqupxsv esjtqupxsvVar) {
        if (dxjokdxxwwVar.btonecajqb(esjtqupxsvVar)) {
            return;
        }
        gtknphoqwx.wkgbmnqykc(dxjokdxxwwVar.ojitshcjhn(esjtqupxsvVar));
    }

    public static final void zoijcleaow(bl.dxjokdxxww dxjokdxxwwVar, esjtqupxsv esjtqupxsvVar) throws IOException {
        try {
            IOException iOException = null;
            for (esjtqupxsv esjtqupxsvVar2 : dxjokdxxwwVar.gtknphoqwx(esjtqupxsvVar)) {
                try {
                    if (dxjokdxxwwVar.draadjrbmk(esjtqupxsvVar2).gxszxtbevo()) {
                        zoijcleaow(dxjokdxxwwVar, esjtqupxsvVar2);
                    }
                    dxjokdxxwwVar.nufgyqmvbu(esjtqupxsvVar2);
                } catch (IOException e13) {
                    if (iOException == null) {
                        iOException = e13;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
