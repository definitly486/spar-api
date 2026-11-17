package g2;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f35840iobyxmoadg = new ppxfxbqfkf();

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f35841zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f35841zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f35841zdlpuopuiu.invoke();
            String strVdvldrhtss = rg.gxszxtbevo.vdvldrhtss(file);
            nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.f35837iobyxmoadg;
            if (zdlpuopuiu.eablkybsjg(strVdvldrhtss, nufgyqmvbuVar.eablkybsjg())) {
                return file;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + nufgyqmvbuVar.eablkybsjg()).toString());
        }
    }

    private ppxfxbqfkf() {
    }

    public final d2.eablkybsjg iobyxmoadg(e2.zoijcleaow zoijcleaowVar, List migrations, cllcsxoeiz scope, tg.iobyxmoadg produceFile) {
        zdlpuopuiu.btonecajqb(migrations, "migrations");
        zdlpuopuiu.btonecajqb(scope, "scope");
        zdlpuopuiu.btonecajqb(produceFile, "produceFile");
        return new zoijcleaow(d2.gxszxtbevo.f26807iobyxmoadg.iobyxmoadg(nufgyqmvbu.f35837iobyxmoadg, zoijcleaowVar, migrations, scope, new iobyxmoadg(produceFile)));
    }
}
