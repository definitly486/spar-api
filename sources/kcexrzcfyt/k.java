package kcexrzcfyt;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
abstract class k extends e.ppxfxbqfkf implements e, e.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private com.google.common.util.concurrent.wkgbmnqykc f54827btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54829dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ScheduledExecutorService f54830eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    e.ppxfxbqfkf f54832gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    zdlpuopuiu.lqeggnwhkg f54834lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    com.google.common.util.concurrent.wkgbmnqykc f54835nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Handler f54836ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final Executor f54838wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final zeieaojujs f54839zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Object f54833iobyxmoadg = new Object();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private List f54831gtknphoqwx = null;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f54828draadjrbmk = false;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f54837wflxmlrfwp = false;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f54826agtfadlqog = false;

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            k.this.eablkybsjg();
            k kVar = k.this;
            kVar.f54839zoijcleaow.dxjokdxxww(kVar);
        }
    }

    class zoijcleaow extends CameraCaptureSession.StateCallback {
        zoijcleaow() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            k.this.pmvmpeiblj(cameraCaptureSession);
            k kVar = k.this;
            kVar.agtfadlqog(kVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            k.this.pmvmpeiblj(cameraCaptureSession);
            k kVar = k.this;
            kVar.ojitshcjhn(kVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            k.this.pmvmpeiblj(cameraCaptureSession);
            k kVar = k.this;
            kVar.rgvfuqvkyq(kVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar;
            try {
                k.this.pmvmpeiblj(cameraCaptureSession);
                k kVar = k.this;
                kVar.vdvldrhtss(kVar);
                synchronized (k.this.f54833iobyxmoadg) {
                    u1.nufgyqmvbu.lqeggnwhkg(k.this.f54829dxjokdxxww, "OpenCaptureSession completer should not null");
                    k kVar2 = k.this;
                    iobyxmoadgVar = kVar2.f54829dxjokdxxww;
                    kVar2.f54829dxjokdxxww = null;
                }
            } finally {
                synchronized (k.this.f54833iobyxmoadg) {
                    u1.nufgyqmvbu.lqeggnwhkg(k.this.f54829dxjokdxxww, "OpenCaptureSession completer should not null");
                    k kVar3 = k.this;
                    iobyxmoadgVar = kVar3.f54829dxjokdxxww;
                    kVar3.f54829dxjokdxxww = null;
                    iobyxmoadgVar.gxszxtbevo(new IllegalStateException("onConfigureFailed"));
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar;
            try {
                k.this.pmvmpeiblj(cameraCaptureSession);
                k kVar = k.this;
                kVar.oxmwwwfdhm(kVar);
                synchronized (k.this.f54833iobyxmoadg) {
                    u1.nufgyqmvbu.lqeggnwhkg(k.this.f54829dxjokdxxww, "OpenCaptureSession completer should not null");
                    k kVar2 = k.this;
                    iobyxmoadgVar = kVar2.f54829dxjokdxxww;
                    kVar2.f54829dxjokdxxww = null;
                }
            } finally {
                synchronized (k.this.f54833iobyxmoadg) {
                    u1.nufgyqmvbu.lqeggnwhkg(k.this.f54829dxjokdxxww, "OpenCaptureSession completer should not null");
                    k kVar3 = k.this;
                    iobyxmoadgVar = kVar3.f54829dxjokdxxww;
                    kVar3.f54829dxjokdxxww = null;
                    iobyxmoadgVar.ppxfxbqfkf(null);
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            k.this.pmvmpeiblj(cameraCaptureSession);
            k kVar = k.this;
            kVar.kcexrzcfyt(kVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            k.this.pmvmpeiblj(cameraCaptureSession);
            k kVar = k.this;
            kVar.yggfygwlhe(kVar, surface);
        }
    }

    k(zeieaojujs zeieaojujsVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f54839zoijcleaow = zeieaojujsVar;
        this.f54836ppxfxbqfkf = handler;
        this.f54838wkgbmnqykc = executor;
        this.f54830eablkybsjg = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cdpycssgdh() {
        zdlpuopuiu(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iozdgvuglv(e eVar) {
        Objects.requireNonNull(this.f54832gxszxtbevo);
        this.f54832gxszxtbevo.zdlpuopuiu(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lmojexxdyd(List list, zdlpuopuiu.zynmafqrjb zynmafqrjbVar, yggfygwlhe.vdvldrhtss vdvldrhtssVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        String str;
        synchronized (this.f54833iobyxmoadg) {
            zynmafqrjb(list);
            u1.nufgyqmvbu.dxjokdxxww(this.f54829dxjokdxxww == null, "The openCaptureSessionCompleter can only set once!");
            this.f54829dxjokdxxww = iobyxmoadgVar;
            zynmafqrjbVar.iobyxmoadg(vdvldrhtssVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc wwaezpbzkn(List list, List list2) {
        lereixgezr.sopmlzcsov.iobyxmoadg("SyncCaptureSessionBase", "[" + this + "] getSurface done with results: " + list2);
        if (list2.isEmpty()) {
            return iozdgvuglv.gtknphoqwx.btonecajqb(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return list2.contains(null) ? iozdgvuglv.gtknphoqwx.btonecajqb(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null)))) : iozdgvuglv.gtknphoqwx.draadjrbmk(list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yadqdtsiqt(e eVar) {
        this.f54839zoijcleaow.lqeggnwhkg(this);
        zdlpuopuiu(eVar);
        if (this.f54834lqeggnwhkg != null) {
            Objects.requireNonNull(this.f54832gxszxtbevo);
            this.f54832gxszxtbevo.rgvfuqvkyq(eVar);
            return;
        }
        lereixgezr.sopmlzcsov.draadjrbmk("SyncCaptureSessionBase", "[" + this + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void agtfadlqog(e eVar) {
        Objects.requireNonNull(this.f54832gxszxtbevo);
        this.f54832gxszxtbevo.agtfadlqog(eVar);
    }

    @Override // kcexrzcfyt.e
    public int btonecajqb(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        u1.nufgyqmvbu.lqeggnwhkg(this.f54834lqeggnwhkg, "Need to call openCaptureSession before using this API.");
        return this.f54834lqeggnwhkg.iobyxmoadg(list, iobyxmoadg(), captureCallback);
    }

    @Override // kcexrzcfyt.e
    public void close() {
        u1.nufgyqmvbu.lqeggnwhkg(this.f54834lqeggnwhkg, "Need to call openCaptureSession before using this API.");
        this.f54839zoijcleaow.nufgyqmvbu(this);
        this.f54834lqeggnwhkg.ppxfxbqfkf().close();
        iobyxmoadg().execute(new Runnable() { // from class: kcexrzcfyt.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f54701zdlpuopuiu.cdpycssgdh();
            }
        });
    }

    @Override // kcexrzcfyt.e
    public zdlpuopuiu.lqeggnwhkg draadjrbmk() {
        u1.nufgyqmvbu.gxszxtbevo(this.f54834lqeggnwhkg);
        return this.f54834lqeggnwhkg;
    }

    @Override // kcexrzcfyt.e.iobyxmoadg
    public com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww(final List list, long j13) {
        synchronized (this.f54833iobyxmoadg) {
            try {
                if (this.f54837wflxmlrfwp) {
                    return iozdgvuglv.gtknphoqwx.btonecajqb(new CancellationException("Opener is disabled"));
                }
                iozdgvuglv.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = iozdgvuglv.wkgbmnqykc.zoijcleaow(androidx.camera.core.impl.gtknphoqwx.lqeggnwhkg(list, false, j13, iobyxmoadg(), this.f54830eablkybsjg)).gxszxtbevo(new iozdgvuglv.iobyxmoadg() { // from class: kcexrzcfyt.g
                    @Override // iozdgvuglv.iobyxmoadg
                    public final com.google.common.util.concurrent.wkgbmnqykc apply(Object obj) {
                        return this.f54690iobyxmoadg.wwaezpbzkn(list, (List) obj);
                    }
                }, iobyxmoadg());
                this.f54827btonecajqb = wkgbmnqykcVarGxszxtbevo;
                return iozdgvuglv.gtknphoqwx.zdlpuopuiu(wkgbmnqykcVarGxszxtbevo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kcexrzcfyt.e
    public void eablkybsjg() {
        ylkuphrtab();
    }

    @Override // kcexrzcfyt.e.iobyxmoadg
    public yggfygwlhe.vdvldrhtss gtknphoqwx(int i13, List list, e.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f54832gxszxtbevo = ppxfxbqfkfVar;
        return new yggfygwlhe.vdvldrhtss(i13, list, iobyxmoadg(), new zoijcleaow());
    }

    @Override // kcexrzcfyt.e
    public void gxszxtbevo(int i13) {
    }

    @Override // kcexrzcfyt.e.iobyxmoadg
    public Executor iobyxmoadg() {
        return this.f54838wkgbmnqykc;
    }

    boolean istkbnxepw() {
        boolean z13;
        synchronized (this.f54833iobyxmoadg) {
            z13 = this.f54835nufgyqmvbu != null;
        }
        return z13;
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void kcexrzcfyt(e eVar) {
        Objects.requireNonNull(this.f54832gxszxtbevo);
        this.f54832gxszxtbevo.kcexrzcfyt(eVar);
    }

    @Override // kcexrzcfyt.e
    public CameraDevice lqeggnwhkg() {
        u1.nufgyqmvbu.gxszxtbevo(this.f54834lqeggnwhkg);
        return this.f54834lqeggnwhkg.ppxfxbqfkf().getDevice();
    }

    @Override // kcexrzcfyt.e
    public int nufgyqmvbu(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        u1.nufgyqmvbu.lqeggnwhkg(this.f54834lqeggnwhkg, "Need to call openCaptureSession before using this API.");
        return this.f54834lqeggnwhkg.zoijcleaow(captureRequest, iobyxmoadg(), captureCallback);
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void ojitshcjhn(e eVar) {
        Objects.requireNonNull(this.f54832gxszxtbevo);
        this.f54832gxszxtbevo.ojitshcjhn(eVar);
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void oxmwwwfdhm(e eVar) {
        Objects.requireNonNull(this.f54832gxszxtbevo);
        this.f54839zoijcleaow.btonecajqb(this);
        this.f54832gxszxtbevo.oxmwwwfdhm(eVar);
    }

    void pmvmpeiblj(CameraCaptureSession cameraCaptureSession) {
        if (this.f54834lqeggnwhkg == null) {
            this.f54834lqeggnwhkg = zdlpuopuiu.lqeggnwhkg.wkgbmnqykc(cameraCaptureSession, this.f54836ppxfxbqfkf);
        }
    }

    @Override // kcexrzcfyt.e.iobyxmoadg
    public com.google.common.util.concurrent.wkgbmnqykc ppxfxbqfkf(CameraDevice cameraDevice, final yggfygwlhe.vdvldrhtss vdvldrhtssVar, final List list) {
        synchronized (this.f54833iobyxmoadg) {
            try {
                if (this.f54837wflxmlrfwp) {
                    return iozdgvuglv.gtknphoqwx.btonecajqb(new CancellationException("Opener is disabled"));
                }
                this.f54839zoijcleaow.gtknphoqwx(this);
                final zdlpuopuiu.zynmafqrjb zynmafqrjbVarZoijcleaow = zdlpuopuiu.zynmafqrjb.zoijcleaow(cameraDevice, this.f54836ppxfxbqfkf);
                com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: kcexrzcfyt.j
                    @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
                    public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                        return this.f54716iobyxmoadg.lmojexxdyd(list, zynmafqrjbVarZoijcleaow, vdvldrhtssVar, iobyxmoadgVar);
                    }
                });
                this.f54835nufgyqmvbu = wkgbmnqykcVarIobyxmoadg;
                iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVarIobyxmoadg, new iobyxmoadg(), yadqdtsiqt.iobyxmoadg.iobyxmoadg());
                return iozdgvuglv.gtknphoqwx.zdlpuopuiu(this.f54835nufgyqmvbu);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void rgvfuqvkyq(final e eVar) {
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar;
        synchronized (this.f54833iobyxmoadg) {
            try {
                if (this.f54828draadjrbmk) {
                    wkgbmnqykcVar = null;
                } else {
                    this.f54828draadjrbmk = true;
                    u1.nufgyqmvbu.lqeggnwhkg(this.f54835nufgyqmvbu, "Need to call openCaptureSession before using this API.");
                    wkgbmnqykcVar = this.f54835nufgyqmvbu;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        eablkybsjg();
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54684zdlpuopuiu.yadqdtsiqt(eVar);
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        }
    }

    @Override // kcexrzcfyt.e.iobyxmoadg
    public boolean stop() {
        boolean z13;
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = null;
        try {
            synchronized (this.f54833iobyxmoadg) {
                try {
                    if (!this.f54837wflxmlrfwp) {
                        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar2 = this.f54827btonecajqb;
                        wkgbmnqykcVar = wkgbmnqykcVar2 != null ? wkgbmnqykcVar2 : null;
                        this.f54837wflxmlrfwp = true;
                    }
                    z13 = !istkbnxepw();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.cancel(true);
            }
            return z13;
        } catch (Throwable th3) {
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.cancel(true);
            }
            throw th3;
        }
    }

    @Override // kcexrzcfyt.e
    public void stopRepeating() throws CameraAccessException {
        u1.nufgyqmvbu.lqeggnwhkg(this.f54834lqeggnwhkg, "Need to call openCaptureSession before using this API.");
        this.f54834lqeggnwhkg.ppxfxbqfkf().stopRepeating();
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void vdvldrhtss(e eVar) {
        Objects.requireNonNull(this.f54832gxszxtbevo);
        eablkybsjg();
        this.f54839zoijcleaow.dxjokdxxww(this);
        this.f54832gxszxtbevo.vdvldrhtss(eVar);
    }

    @Override // kcexrzcfyt.e
    public e.ppxfxbqfkf wkgbmnqykc() {
        return this;
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    public void yggfygwlhe(e eVar, Surface surface) {
        Objects.requireNonNull(this.f54832gxszxtbevo);
        this.f54832gxszxtbevo.yggfygwlhe(eVar, surface);
    }

    void ylkuphrtab() {
        synchronized (this.f54833iobyxmoadg) {
            try {
                List list = this.f54831gtknphoqwx;
                if (list != null) {
                    androidx.camera.core.impl.gtknphoqwx.ppxfxbqfkf(list);
                    this.f54831gtknphoqwx = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kcexrzcfyt.e.ppxfxbqfkf
    void zdlpuopuiu(final e eVar) {
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar;
        synchronized (this.f54833iobyxmoadg) {
            try {
                if (this.f54826agtfadlqog) {
                    wkgbmnqykcVar = null;
                } else {
                    this.f54826agtfadlqog = true;
                    u1.nufgyqmvbu.lqeggnwhkg(this.f54835nufgyqmvbu, "Need to call openCaptureSession before using this API.");
                    wkgbmnqykcVar = this.f54835nufgyqmvbu;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54695zdlpuopuiu.iozdgvuglv(eVar);
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        }
    }

    @Override // kcexrzcfyt.e
    public void zoijcleaow() {
        u1.nufgyqmvbu.lqeggnwhkg(this.f54834lqeggnwhkg, "Need to call openCaptureSession before using this API.");
        this.f54834lqeggnwhkg.ppxfxbqfkf().abortCaptures();
    }

    void zynmafqrjb(List list) {
        synchronized (this.f54833iobyxmoadg) {
            ylkuphrtab();
            androidx.camera.core.impl.gtknphoqwx.wkgbmnqykc(list);
            this.f54831gtknphoqwx = list;
        }
    }
}
