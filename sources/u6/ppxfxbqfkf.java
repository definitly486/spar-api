package u6;

import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.zdlpuopuiu;
import l8.dxjokdxxww;
import l8.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements dxjokdxxww {
    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public n8.ppxfxbqfkf zoijcleaow(InputStream source, int i13, int i14, lqeggnwhkg options) throws IOException {
        zdlpuopuiu.btonecajqb(source, "source");
        zdlpuopuiu.btonecajqb(options, "options");
        try {
            com.caverock.androidsvg.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = com.caverock.androidsvg.lqeggnwhkg.draadjrbmk(source);
            if (lqeggnwhkgVarDraadjrbmk.lqeggnwhkg() == null) {
                lqeggnwhkgVarDraadjrbmk.iwizpuwonk(0.0f, 0.0f, lqeggnwhkgVarDraadjrbmk.nufgyqmvbu(), lqeggnwhkgVarDraadjrbmk.gxszxtbevo());
            }
            lqeggnwhkgVarDraadjrbmk.cqumvgiudr(i13);
            lqeggnwhkgVarDraadjrbmk.zdlpuopuiu(i14);
            return new t8.dxjokdxxww(lqeggnwhkgVarDraadjrbmk);
        } catch (SVGParseException e13) {
            throw new IOException("Cannot load SVG from stream", e13);
        }
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(InputStream source, lqeggnwhkg options) {
        zdlpuopuiu.btonecajqb(source, "source");
        zdlpuopuiu.btonecajqb(options, "options");
        return true;
    }
}
