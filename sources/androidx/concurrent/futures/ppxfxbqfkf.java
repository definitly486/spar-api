package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        Object f7517iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private gxszxtbevo f7518ppxfxbqfkf = gxszxtbevo.kcexrzcfyt();

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f7519wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        wkgbmnqykc f7520zoijcleaow;

        iobyxmoadg() {
        }

        private void eablkybsjg() {
            this.f7517iobyxmoadg = null;
            this.f7520zoijcleaow = null;
            this.f7518ppxfxbqfkf = null;
        }

        protected void finalize() {
            gxszxtbevo gxszxtbevoVar;
            wkgbmnqykc wkgbmnqykcVar = this.f7520zoijcleaow;
            if (wkgbmnqykcVar != null && !wkgbmnqykcVar.isDone()) {
                wkgbmnqykcVar.wkgbmnqykc(new zoijcleaow("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f7517iobyxmoadg));
            }
            if (this.f7519wkgbmnqykc || (gxszxtbevoVar = this.f7518ppxfxbqfkf) == null) {
                return;
            }
            gxszxtbevoVar.ojitshcjhn(null);
        }

        public boolean gxszxtbevo(Throwable th2) {
            this.f7519wkgbmnqykc = true;
            wkgbmnqykc wkgbmnqykcVar = this.f7520zoijcleaow;
            boolean z13 = wkgbmnqykcVar != null && wkgbmnqykcVar.wkgbmnqykc(th2);
            if (z13) {
                eablkybsjg();
            }
            return z13;
        }

        public void iobyxmoadg(Runnable runnable, Executor executor) {
            gxszxtbevo gxszxtbevoVar = this.f7518ppxfxbqfkf;
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.iobyxmoadg(runnable, executor);
            }
        }

        public boolean ppxfxbqfkf(Object obj) {
            this.f7519wkgbmnqykc = true;
            wkgbmnqykc wkgbmnqykcVar = this.f7520zoijcleaow;
            boolean z13 = wkgbmnqykcVar != null && wkgbmnqykcVar.ppxfxbqfkf(obj);
            if (z13) {
                eablkybsjg();
            }
            return z13;
        }

        public boolean wkgbmnqykc() {
            this.f7519wkgbmnqykc = true;
            wkgbmnqykc wkgbmnqykcVar = this.f7520zoijcleaow;
            boolean z13 = wkgbmnqykcVar != null && wkgbmnqykcVar.zoijcleaow(true);
            if (z13) {
                eablkybsjg();
            }
            return z13;
        }

        void zoijcleaow() {
            this.f7517iobyxmoadg = null;
            this.f7520zoijcleaow = null;
            this.f7518ppxfxbqfkf.ojitshcjhn(null);
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public interface InterfaceC0128ppxfxbqfkf {
        Object iobyxmoadg(iobyxmoadg iobyxmoadgVar);
    }

    private static final class wkgbmnqykc implements com.google.common.util.concurrent.wkgbmnqykc {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final androidx.concurrent.futures.iobyxmoadg f7521yggfygwlhe = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final WeakReference f7522zdlpuopuiu;

        class iobyxmoadg extends androidx.concurrent.futures.iobyxmoadg {
            iobyxmoadg() {
            }

            @Override // androidx.concurrent.futures.iobyxmoadg
            protected String draadjrbmk() {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) wkgbmnqykc.this.f7522zdlpuopuiu.get();
                if (iobyxmoadgVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + iobyxmoadgVar.f7517iobyxmoadg + "]";
            }
        }

        wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
            this.f7522zdlpuopuiu = new WeakReference(iobyxmoadgVar);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z13) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f7522zdlpuopuiu.get();
            boolean zCancel = this.f7521yggfygwlhe.cancel(z13);
            if (zCancel && iobyxmoadgVar != null) {
                iobyxmoadgVar.zoijcleaow();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f7521yggfygwlhe.get();
        }

        @Override // com.google.common.util.concurrent.wkgbmnqykc
        public void iobyxmoadg(Runnable runnable, Executor executor) {
            this.f7521yggfygwlhe.iobyxmoadg(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f7521yggfygwlhe.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f7521yggfygwlhe.isDone();
        }

        boolean ppxfxbqfkf(Object obj) {
            return this.f7521yggfygwlhe.ojitshcjhn(obj);
        }

        public String toString() {
            return this.f7521yggfygwlhe.toString();
        }

        boolean wkgbmnqykc(Throwable th2) {
            return this.f7521yggfygwlhe.rgvfuqvkyq(th2);
        }

        boolean zoijcleaow(boolean z13) {
            return this.f7521yggfygwlhe.cancel(z13);
        }

        @Override // java.util.concurrent.Future
        public Object get(long j13, TimeUnit timeUnit) {
            return this.f7521yggfygwlhe.get(j13, timeUnit);
        }
    }

    static final class zoijcleaow extends Throwable {
        zoijcleaow(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static com.google.common.util.concurrent.wkgbmnqykc iobyxmoadg(InterfaceC0128ppxfxbqfkf interfaceC0128ppxfxbqfkf) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(iobyxmoadgVar);
        iobyxmoadgVar.f7520zoijcleaow = wkgbmnqykcVar;
        iobyxmoadgVar.f7517iobyxmoadg = interfaceC0128ppxfxbqfkf.getClass();
        try {
            Object objIobyxmoadg = interfaceC0128ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar);
            if (objIobyxmoadg != null) {
                iobyxmoadgVar.f7517iobyxmoadg = objIobyxmoadg;
            }
        } catch (Exception e13) {
            wkgbmnqykcVar.wkgbmnqykc(e13);
        }
        return wkgbmnqykcVar;
    }
}
