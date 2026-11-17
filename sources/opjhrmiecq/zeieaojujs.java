package opjhrmiecq;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final weqkydbzbr f74083iobyxmoadg = new iobyxmoadg();

    public static final class iobyxmoadg implements weqkydbzbr {
        iobyxmoadg() {
        }

        @Override // opjhrmiecq.weqkydbzbr
        public opjhrmiecq iobyxmoadg(KeyEvent keyEvent) {
            opjhrmiecq opjhrmiecqVar = null;
            if (r.wkgbmnqykc.gxszxtbevo(keyEvent) && r.wkgbmnqykc.wkgbmnqykc(keyEvent)) {
                long jIobyxmoadg = r.wkgbmnqykc.iobyxmoadg(keyEvent);
                mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.f73813iobyxmoadg;
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.btonecajqb())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_LINE_LEFT;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.gtknphoqwx())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_LINE_RIGHT;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.draadjrbmk())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_HOME;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg, mhtqkkgtqmVar.dxjokdxxww())) {
                    opjhrmiecqVar = opjhrmiecq.SELECT_END;
                }
            } else if (r.wkgbmnqykc.wkgbmnqykc(keyEvent)) {
                long jIobyxmoadg2 = r.wkgbmnqykc.iobyxmoadg(keyEvent);
                mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.f73813iobyxmoadg;
                if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.btonecajqb())) {
                    opjhrmiecqVar = opjhrmiecq.LINE_LEFT;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.gtknphoqwx())) {
                    opjhrmiecqVar = opjhrmiecq.LINE_RIGHT;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.draadjrbmk())) {
                    opjhrmiecqVar = opjhrmiecq.HOME;
                } else if (r.iobyxmoadg.vdvldrhtss(jIobyxmoadg2, mhtqkkgtqmVar2.dxjokdxxww())) {
                    opjhrmiecqVar = opjhrmiecq.END;
                }
            }
            return opjhrmiecqVar == null ? lrnfpwlwnk.zoijcleaow().iobyxmoadg(keyEvent) : opjhrmiecqVar;
        }
    }

    public static final weqkydbzbr iobyxmoadg() {
        return f74083iobyxmoadg;
    }
}
