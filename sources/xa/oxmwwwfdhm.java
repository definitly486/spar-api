package xa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oxmwwwfdhm {

    static class iobyxmoadg implements vdvldrhtss, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        transient Object f121866iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        volatile transient boolean f121867jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final vdvldrhtss f121868yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private transient Object f121869zdlpuopuiu = new Object();

        iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
            this.f121868yggfygwlhe = (vdvldrhtss) draadjrbmk.btonecajqb(vdvldrhtssVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f121869zdlpuopuiu = new Object();
        }

        @Override // xa.vdvldrhtss
        public Object get() {
            if (!this.f121867jyumaefscl) {
                synchronized (this.f121869zdlpuopuiu) {
                    try {
                        if (!this.f121867jyumaefscl) {
                            Object obj = this.f121868yggfygwlhe.get();
                            this.f121866iwizpuwonk = obj;
                            this.f121867jyumaefscl = true;
                            return obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return nufgyqmvbu.iobyxmoadg(this.f121866iwizpuwonk);
        }

        public String toString() {
            Object obj;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Suppliers.memoize(");
            if (this.f121867jyumaefscl) {
                obj = "<supplier that returned " + this.f121866iwizpuwonk + ">";
            } else {
                obj = this.f121868yggfygwlhe;
            }
            sb3.append(obj);
            sb3.append(")");
            return sb3.toString();
        }
    }

    static class zoijcleaow implements vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final vdvldrhtss f121870iwizpuwonk = new vdvldrhtss() { // from class: xa.kcexrzcfyt
            @Override // xa.vdvldrhtss
            public final Object get() {
                return oxmwwwfdhm.zoijcleaow.zoijcleaow();
            }
        };

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Object f121871jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private volatile vdvldrhtss f121872yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f121873zdlpuopuiu = new Object();

        zoijcleaow(vdvldrhtss vdvldrhtssVar) {
            this.f121872yggfygwlhe = (vdvldrhtss) draadjrbmk.btonecajqb(vdvldrhtssVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void zoijcleaow() {
            throw new IllegalStateException();
        }

        @Override // xa.vdvldrhtss
        public Object get() {
            vdvldrhtss vdvldrhtssVar = this.f121872yggfygwlhe;
            vdvldrhtss vdvldrhtssVar2 = f121870iwizpuwonk;
            if (vdvldrhtssVar != vdvldrhtssVar2) {
                synchronized (this.f121873zdlpuopuiu) {
                    try {
                        if (this.f121872yggfygwlhe != vdvldrhtssVar2) {
                            Object obj = this.f121872yggfygwlhe.get();
                            this.f121871jyumaefscl = obj;
                            this.f121872yggfygwlhe = vdvldrhtssVar2;
                            return obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return nufgyqmvbu.iobyxmoadg(this.f121871jyumaefscl);
        }

        public String toString() {
            Object obj = this.f121872yggfygwlhe;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Suppliers.memoize(");
            if (obj == f121870iwizpuwonk) {
                obj = "<supplier that returned " + this.f121871jyumaefscl + ">";
            }
            sb3.append(obj);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public static vdvldrhtss iobyxmoadg(vdvldrhtss vdvldrhtssVar) {
        if ((vdvldrhtssVar instanceof zoijcleaow) || (vdvldrhtssVar instanceof iobyxmoadg)) {
            return vdvldrhtssVar;
        }
        return vdvldrhtssVar instanceof Serializable ? new iobyxmoadg(vdvldrhtssVar) : new zoijcleaow(vdvldrhtssVar);
    }
}
