package s0;

import android.graphics.Matrix;
import android.graphics.Shader;
import h.a;
import h.c;
import h.f;
import h.jztzpxfvev;
import h.metgxyhuhe;
import h.xrmfcynszj;
import j0.cdpycssgdh;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(j0.yggfygwlhe yggfygwlheVar, metgxyhuhe metgxyhuheVar, jztzpxfvev jztzpxfvevVar, float f13, c cVar, v0.gtknphoqwx gtknphoqwxVar, j.lqeggnwhkg lqeggnwhkgVar, int i13) {
        metgxyhuheVar.jyumaefscl();
        if (yggfygwlheVar.istkbnxepw().size() <= 1 || (jztzpxfvevVar instanceof f)) {
            zoijcleaow(yggfygwlheVar, metgxyhuheVar, jztzpxfvevVar, f13, cVar, gtknphoqwxVar, lqeggnwhkgVar, i13);
        } else {
            if (!(jztzpxfvevVar instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            List listIstkbnxepw = yggfygwlheVar.istkbnxepw();
            int size = listIstkbnxepw.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i14 = 0; i14 < size; i14++) {
                cdpycssgdh cdpycssgdhVar = (cdpycssgdh) listIstkbnxepw.get(i14);
                height += cdpycssgdhVar.eablkybsjg().getHeight();
                fMax = Math.max(fMax, cdpycssgdhVar.eablkybsjg().getWidth());
            }
            Shader shaderZoijcleaow = ((a) jztzpxfvevVar).zoijcleaow(g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(height)) & 4294967295L)));
            Matrix matrix = new Matrix();
            shaderZoijcleaow.getLocalMatrix(matrix);
            List listIstkbnxepw2 = yggfygwlheVar.istkbnxepw();
            int size2 = listIstkbnxepw2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                cdpycssgdh cdpycssgdhVar2 = (cdpycssgdh) listIstkbnxepw2.get(i15);
                cdpycssgdhVar2.eablkybsjg().nufgyqmvbu(metgxyhuheVar, xrmfcynszj.iobyxmoadg(shaderZoijcleaow), f13, cVar, gtknphoqwxVar, lqeggnwhkgVar, i13);
                metgxyhuheVar.wkgbmnqykc(0.0f, cdpycssgdhVar2.eablkybsjg().getHeight());
                matrix.setTranslate(0.0f, -cdpycssgdhVar2.eablkybsjg().getHeight());
                shaderZoijcleaow.setLocalMatrix(matrix);
            }
        }
        metgxyhuheVar.agtfadlqog();
    }

    private static final void zoijcleaow(j0.yggfygwlhe yggfygwlheVar, metgxyhuhe metgxyhuheVar, jztzpxfvev jztzpxfvevVar, float f13, c cVar, v0.gtknphoqwx gtknphoqwxVar, j.lqeggnwhkg lqeggnwhkgVar, int i13) {
        List listIstkbnxepw = yggfygwlheVar.istkbnxepw();
        int size = listIstkbnxepw.size();
        for (int i14 = 0; i14 < size; i14++) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) listIstkbnxepw.get(i14);
            cdpycssgdhVar.eablkybsjg().nufgyqmvbu(metgxyhuheVar, jztzpxfvevVar, f13, cVar, gtknphoqwxVar, lqeggnwhkgVar, i13);
            metgxyhuheVar.wkgbmnqykc(0.0f, cdpycssgdhVar.eablkybsjg().getHeight());
        }
    }
}
