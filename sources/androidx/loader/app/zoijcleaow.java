package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.xrmfcynszj;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.pmvmpeiblj;
import androidx.lifecycle.vdvldrhtss;
import androidx.lifecycle.zynmafqrjb;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
class zoijcleaow extends androidx.loader.app.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static boolean f9588ppxfxbqfkf = false;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f9589iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f9590zoijcleaow;

    public static class iobyxmoadg extends pmvmpeiblj implements androidx.loader.content.zoijcleaow.InterfaceC0157zoijcleaow {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private final androidx.loader.content.zoijcleaow f9591agtfadlqog;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private final int f9592draadjrbmk;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private vdvldrhtss f9593ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private C0154zoijcleaow f9594rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private androidx.loader.content.zoijcleaow f9595vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private final Bundle f9596wflxmlrfwp;

        iobyxmoadg(int i13, Bundle bundle, androidx.loader.content.zoijcleaow zoijcleaowVar, androidx.loader.content.zoijcleaow zoijcleaowVar2) {
            this.f9592draadjrbmk = i13;
            this.f9596wflxmlrfwp = bundle;
            this.f9591agtfadlqog = zoijcleaowVar;
            this.f9595vdvldrhtss = zoijcleaowVar2;
            zoijcleaowVar.registerListener(i13, this);
        }

        @Override // androidx.lifecycle.cqumvgiudr
        public void agtfadlqog(zynmafqrjb zynmafqrjbVar) {
            super.agtfadlqog(zynmafqrjbVar);
            this.f9593ojitshcjhn = null;
            this.f9594rgvfuqvkyq = null;
        }

        @Override // androidx.lifecycle.cqumvgiudr
        protected void draadjrbmk() {
            if (zoijcleaow.f9588ppxfxbqfkf) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f9591agtfadlqog.stopLoading();
        }

        @Override // androidx.lifecycle.cqumvgiudr
        protected void gtknphoqwx() {
            if (zoijcleaow.f9588ppxfxbqfkf) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f9591agtfadlqog.startLoading();
        }

        @Override // androidx.loader.content.zoijcleaow.InterfaceC0157zoijcleaow
        public void iobyxmoadg(androidx.loader.content.zoijcleaow zoijcleaowVar, Object obj) {
            if (zoijcleaow.f9588ppxfxbqfkf) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ojitshcjhn(obj);
                return;
            }
            if (zoijcleaow.f9588ppxfxbqfkf) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            wflxmlrfwp(obj);
        }

        void kcexrzcfyt() {
            vdvldrhtss vdvldrhtssVar = this.f9593ojitshcjhn;
            C0154zoijcleaow c0154zoijcleaow = this.f9594rgvfuqvkyq;
            if (vdvldrhtssVar == null || c0154zoijcleaow == null) {
                return;
            }
            super.agtfadlqog(c0154zoijcleaow);
            dxjokdxxww(vdvldrhtssVar, c0154zoijcleaow);
        }

        @Override // androidx.lifecycle.pmvmpeiblj, androidx.lifecycle.cqumvgiudr
        public void ojitshcjhn(Object obj) {
            super.ojitshcjhn(obj);
            androidx.loader.content.zoijcleaow zoijcleaowVar = this.f9595vdvldrhtss;
            if (zoijcleaowVar != null) {
                zoijcleaowVar.reset();
                this.f9595vdvldrhtss = null;
            }
        }

        androidx.loader.content.zoijcleaow oxmwwwfdhm() {
            return this.f9591agtfadlqog;
        }

        androidx.loader.content.zoijcleaow rgvfuqvkyq(boolean z13) {
            if (zoijcleaow.f9588ppxfxbqfkf) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f9591agtfadlqog.cancelLoad();
            this.f9591agtfadlqog.abandon();
            C0154zoijcleaow c0154zoijcleaow = this.f9594rgvfuqvkyq;
            if (c0154zoijcleaow != null) {
                agtfadlqog(c0154zoijcleaow);
                if (z13) {
                    c0154zoijcleaow.wkgbmnqykc();
                }
            }
            this.f9591agtfadlqog.unregisterListener(this);
            if ((c0154zoijcleaow == null || c0154zoijcleaow.ppxfxbqfkf()) && !z13) {
                return this.f9591agtfadlqog;
            }
            this.f9591agtfadlqog.reset();
            return this.f9595vdvldrhtss;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder(64);
            sb3.append("LoaderInfo{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" #");
            sb3.append(this.f9592draadjrbmk);
            sb3.append(" : ");
            Class<?> cls = this.f9591agtfadlqog.getClass();
            sb3.append(cls.getSimpleName());
            sb3.append("{");
            sb3.append(Integer.toHexString(System.identityHashCode(cls)));
            sb3.append("}}");
            return sb3.toString();
        }

        public void vdvldrhtss(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f9592draadjrbmk);
            printWriter.print(" mArgs=");
            printWriter.println(this.f9596wflxmlrfwp);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f9591agtfadlqog);
            this.f9591agtfadlqog.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f9594rgvfuqvkyq != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f9594rgvfuqvkyq);
                this.f9594rgvfuqvkyq.zoijcleaow(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(oxmwwwfdhm().dataToString(gxszxtbevo()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(nufgyqmvbu());
        }

        androidx.loader.content.zoijcleaow zdlpuopuiu(vdvldrhtss vdvldrhtssVar, androidx.loader.app.iobyxmoadg.InterfaceC0153iobyxmoadg interfaceC0153iobyxmoadg) {
            C0154zoijcleaow c0154zoijcleaow = new C0154zoijcleaow(this.f9591agtfadlqog, interfaceC0153iobyxmoadg);
            dxjokdxxww(vdvldrhtssVar, c0154zoijcleaow);
            zynmafqrjb zynmafqrjbVar = this.f9594rgvfuqvkyq;
            if (zynmafqrjbVar != null) {
                agtfadlqog(zynmafqrjbVar);
            }
            this.f9593ojitshcjhn = vdvldrhtssVar;
            this.f9594rgvfuqvkyq = c0154zoijcleaow;
            return this.f9591agtfadlqog;
        }
    }

    static class ppxfxbqfkf extends ntlheqmsrt {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final crxdokpmqz.ppxfxbqfkf f9597ppxfxbqfkf = new iobyxmoadg();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private xrmfcynszj f9598iobyxmoadg = new xrmfcynszj();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f9599zoijcleaow = false;

        static class iobyxmoadg implements crxdokpmqz.ppxfxbqfkf {
            iobyxmoadg() {
            }

            @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
            public ntlheqmsrt create(Class cls) {
                return new ppxfxbqfkf();
            }
        }

        ppxfxbqfkf() {
        }

        static ppxfxbqfkf agtfadlqog(jlmebxxoox jlmebxxooxVar) {
            return (ppxfxbqfkf) new crxdokpmqz(jlmebxxooxVar, f9597ppxfxbqfkf).zoijcleaow(ppxfxbqfkf.class);
        }

        void draadjrbmk() {
            this.f9599zoijcleaow = false;
        }

        public void gtknphoqwx(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f9598iobyxmoadg.ojitshcjhn() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i13 = 0; i13 < this.f9598iobyxmoadg.ojitshcjhn(); i13++) {
                    iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f9598iobyxmoadg.rgvfuqvkyq(i13);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f9598iobyxmoadg.gtknphoqwx(i13));
                    printWriter.print(": ");
                    printWriter.println(iobyxmoadgVar.toString());
                    iobyxmoadgVar.vdvldrhtss(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        iobyxmoadg ojitshcjhn(int i13) {
            return (iobyxmoadg) this.f9598iobyxmoadg.eablkybsjg(i13);
        }

        @Override // androidx.lifecycle.ntlheqmsrt
        protected void onCleared() {
            super.onCleared();
            int iOjitshcjhn = this.f9598iobyxmoadg.ojitshcjhn();
            for (int i13 = 0; i13 < iOjitshcjhn; i13++) {
                ((iobyxmoadg) this.f9598iobyxmoadg.rgvfuqvkyq(i13)).rgvfuqvkyq(true);
            }
            this.f9598iobyxmoadg.zoijcleaow();
        }

        void oxmwwwfdhm() {
            int iOjitshcjhn = this.f9598iobyxmoadg.ojitshcjhn();
            for (int i13 = 0; i13 < iOjitshcjhn; i13++) {
                ((iobyxmoadg) this.f9598iobyxmoadg.rgvfuqvkyq(i13)).kcexrzcfyt();
            }
        }

        boolean vdvldrhtss() {
            return this.f9599zoijcleaow;
        }

        void yggfygwlhe() {
            this.f9599zoijcleaow = true;
        }

        void zdlpuopuiu(int i13, iobyxmoadg iobyxmoadgVar) {
            this.f9598iobyxmoadg.draadjrbmk(i13, iobyxmoadgVar);
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static class C0154zoijcleaow implements zynmafqrjb {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f9600jyumaefscl = false;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final androidx.loader.app.iobyxmoadg.InterfaceC0153iobyxmoadg f9601yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final androidx.loader.content.zoijcleaow f9602zdlpuopuiu;

        C0154zoijcleaow(androidx.loader.content.zoijcleaow zoijcleaowVar, androidx.loader.app.iobyxmoadg.InterfaceC0153iobyxmoadg interfaceC0153iobyxmoadg) {
            this.f9602zdlpuopuiu = zoijcleaowVar;
            this.f9601yggfygwlhe = interfaceC0153iobyxmoadg;
        }

        @Override // androidx.lifecycle.zynmafqrjb
        public void iobyxmoadg(Object obj) {
            if (zoijcleaow.f9588ppxfxbqfkf) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f9602zdlpuopuiu + ": " + this.f9602zdlpuopuiu.dataToString(obj));
            }
            this.f9600jyumaefscl = true;
            this.f9601yggfygwlhe.onLoadFinished(this.f9602zdlpuopuiu, obj);
        }

        boolean ppxfxbqfkf() {
            return this.f9600jyumaefscl;
        }

        public String toString() {
            return this.f9601yggfygwlhe.toString();
        }

        void wkgbmnqykc() {
            if (this.f9600jyumaefscl) {
                if (zoijcleaow.f9588ppxfxbqfkf) {
                    Log.v("LoaderManager", "  Resetting: " + this.f9602zdlpuopuiu);
                }
                this.f9601yggfygwlhe.onLoaderReset(this.f9602zdlpuopuiu);
            }
        }

        public void zoijcleaow(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f9600jyumaefscl);
        }
    }

    zoijcleaow(vdvldrhtss vdvldrhtssVar, jlmebxxoox jlmebxxooxVar) {
        this.f9589iobyxmoadg = vdvldrhtssVar;
        this.f9590zoijcleaow = ppxfxbqfkf.agtfadlqog(jlmebxxooxVar);
    }

    private androidx.loader.content.zoijcleaow eablkybsjg(int i13, Bundle bundle, androidx.loader.app.iobyxmoadg.InterfaceC0153iobyxmoadg interfaceC0153iobyxmoadg, androidx.loader.content.zoijcleaow zoijcleaowVar) {
        try {
            this.f9590zoijcleaow.yggfygwlhe();
            androidx.loader.content.zoijcleaow zoijcleaowVarOnCreateLoader = interfaceC0153iobyxmoadg.onCreateLoader(i13, bundle);
            if (zoijcleaowVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (zoijcleaowVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(zoijcleaowVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + zoijcleaowVarOnCreateLoader);
            }
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(i13, bundle, zoijcleaowVarOnCreateLoader, zoijcleaowVar);
            if (f9588ppxfxbqfkf) {
                Log.v("LoaderManager", "  Created new loader " + iobyxmoadgVar);
            }
            this.f9590zoijcleaow.zdlpuopuiu(i13, iobyxmoadgVar);
            this.f9590zoijcleaow.draadjrbmk();
            return iobyxmoadgVar.zdlpuopuiu(this.f9589iobyxmoadg, interfaceC0153iobyxmoadg);
        } catch (Throwable th2) {
            this.f9590zoijcleaow.draadjrbmk();
            throw th2;
        }
    }

    @Override // androidx.loader.app.iobyxmoadg
    public void iobyxmoadg(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f9590zoijcleaow.gtknphoqwx(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.iobyxmoadg
    public androidx.loader.content.zoijcleaow ppxfxbqfkf(int i13, Bundle bundle, androidx.loader.app.iobyxmoadg.InterfaceC0153iobyxmoadg interfaceC0153iobyxmoadg) {
        if (this.f9590zoijcleaow.vdvldrhtss()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        iobyxmoadg iobyxmoadgVarOjitshcjhn = this.f9590zoijcleaow.ojitshcjhn(i13);
        if (f9588ppxfxbqfkf) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (iobyxmoadgVarOjitshcjhn == null) {
            return eablkybsjg(i13, bundle, interfaceC0153iobyxmoadg, null);
        }
        if (f9588ppxfxbqfkf) {
            Log.v("LoaderManager", "  Re-using existing loader " + iobyxmoadgVarOjitshcjhn);
        }
        return iobyxmoadgVarOjitshcjhn.zdlpuopuiu(this.f9589iobyxmoadg, interfaceC0153iobyxmoadg);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb3.append("LoaderManager{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" in ");
        Class<?> cls = this.f9589iobyxmoadg.getClass();
        sb3.append(cls.getSimpleName());
        sb3.append("{");
        sb3.append(Integer.toHexString(System.identityHashCode(cls)));
        sb3.append("}}");
        return sb3.toString();
    }

    @Override // androidx.loader.app.iobyxmoadg
    public void wkgbmnqykc() {
        this.f9590zoijcleaow.oxmwwwfdhm();
    }
}
