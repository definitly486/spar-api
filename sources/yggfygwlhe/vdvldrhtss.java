package yggfygwlhe;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f124991iobyxmoadg;

    private interface ppxfxbqfkf {
        List eablkybsjg();

        Object gxszxtbevo();

        Executor iobyxmoadg();

        void lqeggnwhkg(btonecajqb btonecajqbVar);

        void nufgyqmvbu(CaptureRequest captureRequest);

        int ppxfxbqfkf();

        CameraCaptureSession.StateCallback wkgbmnqykc();

        btonecajqb zoijcleaow();
    }

    private static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private btonecajqb f124994eablkybsjg = null;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private CaptureRequest f124995gxszxtbevo = null;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f124996iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Executor f124997ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f124998wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f124999zoijcleaow;

        zoijcleaow(int i13, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f124998wkgbmnqykc = i13;
            this.f124996iobyxmoadg = Collections.unmodifiableList(new ArrayList(list));
            this.f124999zoijcleaow = stateCallback;
            this.f124997ppxfxbqfkf = executor;
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public List eablkybsjg() {
            return this.f124996iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof zoijcleaow) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                if (Objects.equals(this.f124994eablkybsjg, zoijcleaowVar.f124994eablkybsjg) && this.f124998wkgbmnqykc == zoijcleaowVar.f124998wkgbmnqykc && this.f124996iobyxmoadg.size() == zoijcleaowVar.f124996iobyxmoadg.size()) {
                    for (int i13 = 0; i13 < this.f124996iobyxmoadg.size(); i13++) {
                        if (!((gtknphoqwx) this.f124996iobyxmoadg.get(i13)).equals(zoijcleaowVar.f124996iobyxmoadg.get(i13))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public Object gxszxtbevo() {
            return null;
        }

        public int hashCode() {
            int iHashCode = this.f124996iobyxmoadg.hashCode() ^ 31;
            int i13 = (iHashCode << 5) - iHashCode;
            btonecajqb btonecajqbVar = this.f124994eablkybsjg;
            int iHashCode2 = (btonecajqbVar == null ? 0 : btonecajqbVar.hashCode()) ^ i13;
            return this.f124998wkgbmnqykc ^ ((iHashCode2 << 5) - iHashCode2);
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public Executor iobyxmoadg() {
            return this.f124997ppxfxbqfkf;
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public void lqeggnwhkg(btonecajqb btonecajqbVar) {
            if (this.f124998wkgbmnqykc == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f124994eablkybsjg = btonecajqbVar;
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public void nufgyqmvbu(CaptureRequest captureRequest) {
            this.f124995gxszxtbevo = captureRequest;
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public int ppxfxbqfkf() {
            return this.f124998wkgbmnqykc;
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public CameraCaptureSession.StateCallback wkgbmnqykc() {
            return this.f124999zoijcleaow;
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public btonecajqb zoijcleaow() {
            return this.f124994eablkybsjg;
        }
    }

    public vdvldrhtss(int i13, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f124991iobyxmoadg = new zoijcleaow(i13, list, executor, stateCallback);
        } else {
            this.f124991iobyxmoadg = new iobyxmoadg(i13, list, executor, stateCallback);
        }
    }

    static List dxjokdxxww(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gtknphoqwx.btonecajqb((OutputConfiguration) it.next()));
        }
        return arrayList;
    }

    public static List nufgyqmvbu(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((gtknphoqwx) it.next()).dxjokdxxww());
        }
        return arrayList;
    }

    public Object btonecajqb() {
        return this.f124991iobyxmoadg.gxszxtbevo();
    }

    public CameraCaptureSession.StateCallback eablkybsjg() {
        return this.f124991iobyxmoadg.wkgbmnqykc();
    }

    public boolean equals(Object obj) {
        if (obj instanceof vdvldrhtss) {
            return this.f124991iobyxmoadg.equals(((vdvldrhtss) obj).f124991iobyxmoadg);
        }
        return false;
    }

    public void gxszxtbevo(btonecajqb btonecajqbVar) {
        this.f124991iobyxmoadg.lqeggnwhkg(btonecajqbVar);
    }

    public int hashCode() {
        return this.f124991iobyxmoadg.hashCode();
    }

    public Executor iobyxmoadg() {
        return this.f124991iobyxmoadg.iobyxmoadg();
    }

    public void lqeggnwhkg(CaptureRequest captureRequest) {
        this.f124991iobyxmoadg.nufgyqmvbu(captureRequest);
    }

    public List ppxfxbqfkf() {
        return this.f124991iobyxmoadg.eablkybsjg();
    }

    public int wkgbmnqykc() {
        return this.f124991iobyxmoadg.ppxfxbqfkf();
    }

    public btonecajqb zoijcleaow() {
        return this.f124991iobyxmoadg.zoijcleaow();
    }

    private static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SessionConfiguration f124992iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f124993zoijcleaow;

        iobyxmoadg(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f124992iobyxmoadg = sessionConfiguration;
            this.f124993zoijcleaow = Collections.unmodifiableList(vdvldrhtss.dxjokdxxww(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public List eablkybsjg() {
            return this.f124993zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (obj instanceof iobyxmoadg) {
                return Objects.equals(this.f124992iobyxmoadg, ((iobyxmoadg) obj).f124992iobyxmoadg);
            }
            return false;
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public Object gxszxtbevo() {
            return this.f124992iobyxmoadg;
        }

        public int hashCode() {
            return this.f124992iobyxmoadg.hashCode();
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public Executor iobyxmoadg() {
            return this.f124992iobyxmoadg.getExecutor();
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public void lqeggnwhkg(btonecajqb btonecajqbVar) {
            this.f124992iobyxmoadg.setInputConfiguration((InputConfiguration) btonecajqbVar.iobyxmoadg());
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public void nufgyqmvbu(CaptureRequest captureRequest) {
            this.f124992iobyxmoadg.setSessionParameters(captureRequest);
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public int ppxfxbqfkf() {
            return this.f124992iobyxmoadg.getSessionType();
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public CameraCaptureSession.StateCallback wkgbmnqykc() {
            return this.f124992iobyxmoadg.getStateCallback();
        }

        @Override // yggfygwlhe.vdvldrhtss.ppxfxbqfkf
        public btonecajqb zoijcleaow() {
            return btonecajqb.zoijcleaow(this.f124992iobyxmoadg.getInputConfiguration());
        }

        iobyxmoadg(int i13, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i13, vdvldrhtss.nufgyqmvbu(list), executor, stateCallback));
        }
    }
}
