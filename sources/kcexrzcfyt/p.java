package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class p extends e.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f54942iobyxmoadg;

    p(List list) {
        ArrayList arrayList = new ArrayList();
        this.f54942iobyxmoadg = arrayList;
        arrayList.addAll(list);
    }

    static e.ppxfxbqfkf jyumaefscl(e.ppxfxbqfkf... ppxfxbqfkfVarArr) {
        return new p(Arrays.asList(ppxfxbqfkfVarArr));
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void agtfadlqog(e eVar) {
        Iterator it = this.f54942iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((e.ppxfxbqfkf) it.next()).agtfadlqog(eVar);
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void kcexrzcfyt(e eVar) {
        Iterator it = this.f54942iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((e.ppxfxbqfkf) it.next()).kcexrzcfyt(eVar);
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void ojitshcjhn(e eVar) {
        Iterator it = this.f54942iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((e.ppxfxbqfkf) it.next()).ojitshcjhn(eVar);
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void oxmwwwfdhm(e eVar) {
        Iterator it = this.f54942iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((e.ppxfxbqfkf) it.next()).oxmwwwfdhm(eVar);
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void rgvfuqvkyq(e eVar) {
        Iterator it = this.f54942iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((e.ppxfxbqfkf) it.next()).rgvfuqvkyq(eVar);
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void vdvldrhtss(e eVar) {
        Iterator it = this.f54942iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((e.ppxfxbqfkf) it.next()).vdvldrhtss(eVar);
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void yggfygwlhe(e eVar, Surface surface) {
        Iterator it = this.f54942iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((e.ppxfxbqfkf) it.next()).yggfygwlhe(eVar, surface);
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    void zdlpuopuiu(e eVar) {
        Iterator it = this.f54942iobyxmoadg.iterator();
        while (it.hasNext()) {
            ((e.ppxfxbqfkf) it.next()).zdlpuopuiu(eVar);
        }
    }

    static class iobyxmoadg extends e.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f54943iobyxmoadg;

        iobyxmoadg(CameraCaptureSession.StateCallback stateCallback) {
            this.f54943iobyxmoadg = stateCallback;
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void agtfadlqog(e eVar) {
            this.f54943iobyxmoadg.onActive(eVar.draadjrbmk().ppxfxbqfkf());
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void kcexrzcfyt(e eVar) {
            this.f54943iobyxmoadg.onReady(eVar.draadjrbmk().ppxfxbqfkf());
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void ojitshcjhn(e eVar) {
            zdlpuopuiu.wkgbmnqykc.iobyxmoadg(this.f54943iobyxmoadg, eVar.draadjrbmk().ppxfxbqfkf());
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void oxmwwwfdhm(e eVar) {
            this.f54943iobyxmoadg.onConfigured(eVar.draadjrbmk().ppxfxbqfkf());
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void rgvfuqvkyq(e eVar) {
            this.f54943iobyxmoadg.onClosed(eVar.draadjrbmk().ppxfxbqfkf());
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void vdvldrhtss(e eVar) {
            this.f54943iobyxmoadg.onConfigureFailed(eVar.draadjrbmk().ppxfxbqfkf());
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void yggfygwlhe(e eVar, Surface surface) {
            zdlpuopuiu.zoijcleaow.iobyxmoadg(this.f54943iobyxmoadg, eVar.draadjrbmk().ppxfxbqfkf(), surface);
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        void zdlpuopuiu(e eVar) {
        }

        iobyxmoadg(List list) {
            this(okpsazkaxt.iobyxmoadg(list));
        }
    }
}
