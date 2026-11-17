package h;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class tzroggbefp implements fmlbqenlif {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final PathMeasure f38969iobyxmoadg;

    public tzroggbefp(PathMeasure pathMeasure) {
        this.f38969iobyxmoadg = pathMeasure;
    }

    @Override // h.fmlbqenlif
    public float getLength() {
        return this.f38969iobyxmoadg.getLength();
    }

    @Override // h.fmlbqenlif
    public boolean iobyxmoadg(float f13, float f14, mhtqkkgtqm mhtqkkgtqmVar, boolean z13) {
        PathMeasure pathMeasure = this.f38969iobyxmoadg;
        if (mhtqkkgtqmVar instanceof wypolnanlu) {
            return pathMeasure.getSegment(f13, f14, ((wypolnanlu) mhtqkkgtqmVar).cqumvgiudr(), z13);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // h.fmlbqenlif
    public void zoijcleaow(mhtqkkgtqm mhtqkkgtqmVar, boolean z13) {
        Path pathCqumvgiudr;
        PathMeasure pathMeasure = this.f38969iobyxmoadg;
        if (mhtqkkgtqmVar == null) {
            pathCqumvgiudr = null;
        } else {
            if (!(mhtqkkgtqmVar instanceof wypolnanlu)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathCqumvgiudr = ((wypolnanlu) mhtqkkgtqmVar).cqumvgiudr();
        }
        pathMeasure.setPath(pathCqumvgiudr, z13);
    }
}
