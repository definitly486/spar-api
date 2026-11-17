package y6;

import android.os.StatFs;
import bl.dxjokdxxww;
import bl.esjtqupxsv;
import java.io.Closeable;
import java.io.File;
import pj.ikoacuggdj;
import pj.pkzmftpjix;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: y6.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3132iobyxmoadg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f123946gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private esjtqupxsv f123947iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private dxjokdxxww f123951zoijcleaow = dxjokdxxww.f16668zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private double f123949ppxfxbqfkf = 0.02d;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private long f123950wkgbmnqykc = 10485760;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f123945eablkybsjg = 262144000;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private pkzmftpjix f123948lqeggnwhkg = ikoacuggdj.zoijcleaow();

        public final iobyxmoadg iobyxmoadg() {
            long jOjitshcjhn;
            esjtqupxsv esjtqupxsvVar = this.f123947iobyxmoadg;
            if (esjtqupxsvVar == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.f123949ppxfxbqfkf > 0.0d) {
                try {
                    File fileDraadjrbmk = esjtqupxsvVar.draadjrbmk();
                    fileDraadjrbmk.mkdir();
                    StatFs statFs = new StatFs(fileDraadjrbmk.getAbsolutePath());
                    jOjitshcjhn = gtknphoqwx.ojitshcjhn((long) (this.f123949ppxfxbqfkf * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f123950wkgbmnqykc, this.f123945eablkybsjg);
                } catch (Exception unused) {
                    jOjitshcjhn = this.f123950wkgbmnqykc;
                }
            } else {
                jOjitshcjhn = this.f123946gxszxtbevo;
            }
            return new wkgbmnqykc(jOjitshcjhn, esjtqupxsvVar, this.f123951zoijcleaow, this.f123948lqeggnwhkg);
        }

        public final C3132iobyxmoadg ppxfxbqfkf(File file) {
            return zoijcleaow(esjtqupxsv.iobyxmoadg.wkgbmnqykc(esjtqupxsv.f16670yggfygwlhe, file, false, 1, null));
        }

        public final C3132iobyxmoadg zoijcleaow(esjtqupxsv esjtqupxsvVar) {
            this.f123947iobyxmoadg = esjtqupxsvVar;
            return this;
        }
    }

    public interface ppxfxbqfkf extends Closeable {
        esjtqupxsv getData();

        esjtqupxsv getMetadata();

        zoijcleaow x();
    }

    public interface zoijcleaow {
        esjtqupxsv getData();

        esjtqupxsv getMetadata();

        ppxfxbqfkf iobyxmoadg();

        void zoijcleaow();
    }

    zoijcleaow iobyxmoadg(String str);

    dxjokdxxww ppxfxbqfkf();

    ppxfxbqfkf zoijcleaow(String str);
}
