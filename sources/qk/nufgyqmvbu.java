package qk;

import gg.wwaezpbzkn;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.jyumaefscl;
import lk.lereixgezr;
import lk.oxmwwwfdhm;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu implements lk.eablkybsjg, Cloneable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f79001cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final oxmwwwfdhm f79002cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ppxfxbqfkf f79003esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final CopyOnWriteArrayList f79004hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f79005iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private dxjokdxxww f79006istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final btonecajqb f79007iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f79008jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final AtomicBoolean f79009lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f79010lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private volatile qk.ppxfxbqfkf f79011pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private Object f79012pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f79013wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private qk.ppxfxbqfkf f79014yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zynmafqrjb f79015yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private volatile boolean f79016ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lereixgezr f79017zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private wkgbmnqykc f79018zynmafqrjb;

    public final class iobyxmoadg implements Runnable {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f79019jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private volatile AtomicInteger f79020yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final lk.gxszxtbevo f79021zdlpuopuiu;

        public iobyxmoadg(nufgyqmvbu nufgyqmvbuVar, lk.gxszxtbevo responseCallback) {
            zdlpuopuiu.btonecajqb(responseCallback, "responseCallback");
            this.f79019jyumaefscl = nufgyqmvbuVar;
            this.f79021zdlpuopuiu = responseCallback;
            this.f79020yggfygwlhe = new AtomicInteger(0);
        }

        public static /* synthetic */ void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, RejectedExecutionException rejectedExecutionException, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                rejectedExecutionException = null;
            }
            iobyxmoadgVar.zoijcleaow(rejectedExecutionException);
        }

        public final AtomicInteger eablkybsjg() {
            return this.f79020yggfygwlhe;
        }

        public final String gxszxtbevo() {
            return this.f79019jyumaefscl.vdvldrhtss().gtknphoqwx().dxjokdxxww();
        }

        public final void iobyxmoadg(ExecutorService executorService) {
            zdlpuopuiu.btonecajqb(executorService, "executorService");
            lk.rgvfuqvkyq rgvfuqvkyqVarAgtfadlqog = this.f79019jyumaefscl.draadjrbmk().agtfadlqog();
            if (mk.rgvfuqvkyq.f67370eablkybsjg && Thread.holdsLock(rgvfuqvkyqVarAgtfadlqog)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + rgvfuqvkyqVarAgtfadlqog);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e13) {
                    zoijcleaow(e13);
                    this.f79019jyumaefscl.draadjrbmk().agtfadlqog().gxszxtbevo(this);
                }
            } catch (Throwable th2) {
                this.f79019jyumaefscl.draadjrbmk().agtfadlqog().gxszxtbevo(this);
                throw th2;
            }
        }

        public final void lqeggnwhkg(iobyxmoadg other) {
            zdlpuopuiu.btonecajqb(other, "other");
            this.f79020yggfygwlhe = other.f79020yggfygwlhe;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z13;
            Throwable th2;
            IOException e13;
            lk.rgvfuqvkyq rgvfuqvkyqVarAgtfadlqog;
            String str = "OkHttp " + this.f79019jyumaefscl.iwizpuwonk();
            nufgyqmvbu nufgyqmvbuVar = this.f79019jyumaefscl;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                nufgyqmvbuVar.f79003esjtqupxsv.jyumaefscl();
                try {
                    try {
                        z13 = true;
                        try {
                            this.f79021zdlpuopuiu.ppxfxbqfkf(nufgyqmvbuVar, nufgyqmvbuVar.kcexrzcfyt());
                            rgvfuqvkyqVarAgtfadlqog = nufgyqmvbuVar.draadjrbmk().agtfadlqog();
                        } catch (IOException e14) {
                            e13 = e14;
                            if (z13) {
                                uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().btonecajqb("Callback failure for " + nufgyqmvbuVar.zynmafqrjb(), 4, e13);
                            } else {
                                this.f79021zdlpuopuiu.gxszxtbevo(nufgyqmvbuVar, e13);
                            }
                            rgvfuqvkyqVarAgtfadlqog = nufgyqmvbuVar.draadjrbmk().agtfadlqog();
                        } catch (Throwable th3) {
                            th2 = th3;
                            nufgyqmvbuVar.cancel();
                            if (!z13) {
                                IOException iOException = new IOException("canceled due to " + th2);
                                gg.lqeggnwhkg.iobyxmoadg(iOException, th2);
                                this.f79021zdlpuopuiu.gxszxtbevo(nufgyqmvbuVar, iOException);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        nufgyqmvbuVar.draadjrbmk().agtfadlqog().gxszxtbevo(this);
                        throw th4;
                    }
                } catch (IOException e15) {
                    z13 = false;
                    e13 = e15;
                } catch (Throwable th5) {
                    z13 = false;
                    th2 = th5;
                }
                rgvfuqvkyqVarAgtfadlqog.gxszxtbevo(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th6) {
                threadCurrentThread.setName(name);
                throw th6;
            }
        }

        public final nufgyqmvbu wkgbmnqykc() {
            return this.f79019jyumaefscl;
        }

        public final void zoijcleaow(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.f79019jyumaefscl.jyumaefscl(interruptedIOException);
            this.f79021zdlpuopuiu.gxszxtbevo(this.f79019jyumaefscl, interruptedIOException);
        }
    }

    public static final class ppxfxbqfkf extends bl.iobyxmoadg {
        ppxfxbqfkf() {
        }

        @Override // bl.iobyxmoadg
        protected void zynmafqrjb() {
            nufgyqmvbu.this.cancel();
        }
    }

    public static final class zoijcleaow extends WeakReference {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f79023iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(nufgyqmvbu referent, Object obj) {
            super(referent);
            zdlpuopuiu.btonecajqb(referent, "referent");
            this.f79023iobyxmoadg = obj;
        }

        public final Object iobyxmoadg() {
            return this.f79023iobyxmoadg;
        }
    }

    public nufgyqmvbu(lereixgezr client, zynmafqrjb originalRequest, boolean z13) {
        zdlpuopuiu.btonecajqb(client, "client");
        zdlpuopuiu.btonecajqb(originalRequest, "originalRequest");
        this.f79017zdlpuopuiu = client;
        this.f79015yggfygwlhe = originalRequest;
        this.f79008jyumaefscl = z13;
        this.f79007iwizpuwonk = client.gtknphoqwx().iobyxmoadg();
        this.f79002cqumvgiudr = client.rgvfuqvkyq().iobyxmoadg(this);
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        ppxfxbqfkfVar.lqeggnwhkg(client.lqeggnwhkg(), TimeUnit.MILLISECONDS);
        this.f79003esjtqupxsv = ppxfxbqfkfVar;
        this.f79009lereixgezr = new AtomicBoolean();
        this.f79013wwaezpbzkn = true;
        this.f79004hcddaimhww = new CopyOnWriteArrayList();
    }

    private final void eablkybsjg() {
        this.f79012pmvmpeiblj = uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().nufgyqmvbu("response.body().close()");
        this.f79002cqumvgiudr.eablkybsjg(this);
    }

    private final lk.iobyxmoadg lqeggnwhkg(jyumaefscl jyumaefsclVar) {
        SSLSocketFactory sSLSocketFactoryYlkuphrtab;
        HostnameVerifier hostnameVerifierJyumaefscl;
        lk.lqeggnwhkg lqeggnwhkgVarDxjokdxxww;
        if (jyumaefsclVar.btonecajqb()) {
            sSLSocketFactoryYlkuphrtab = this.f79017zdlpuopuiu.ylkuphrtab();
            hostnameVerifierJyumaefscl = this.f79017zdlpuopuiu.jyumaefscl();
            lqeggnwhkgVarDxjokdxxww = this.f79017zdlpuopuiu.dxjokdxxww();
        } else {
            sSLSocketFactoryYlkuphrtab = null;
            hostnameVerifierJyumaefscl = null;
            lqeggnwhkgVarDxjokdxxww = null;
        }
        return new lk.iobyxmoadg(jyumaefsclVar.dxjokdxxww(), jyumaefsclVar.rgvfuqvkyq(), this.f79017zdlpuopuiu.ojitshcjhn(), this.f79017zdlpuopuiu.wwaezpbzkn(), sSLSocketFactoryYlkuphrtab, hostnameVerifierJyumaefscl, lqeggnwhkgVarDxjokdxxww, this.f79017zdlpuopuiu.cdpycssgdh(), this.f79017zdlpuopuiu.istkbnxepw(), this.f79017zdlpuopuiu.zynmafqrjb(), this.f79017zdlpuopuiu.draadjrbmk(), this.f79017zdlpuopuiu.yadqdtsiqt());
    }

    private final IOException pmvmpeiblj(IOException iOException) {
        if (this.f79001cdpycssgdh || !this.f79003esjtqupxsv.iwizpuwonk()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private final IOException wkgbmnqykc(IOException iOException) {
        Socket socketCqumvgiudr;
        boolean z13 = mk.rgvfuqvkyq.f67370eablkybsjg;
        if (z13 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        dxjokdxxww dxjokdxxwwVar = this.f79006istkbnxepw;
        if (dxjokdxxwwVar != null) {
            if (z13 && Thread.holdsLock(dxjokdxxwwVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dxjokdxxwwVar);
            }
            synchronized (dxjokdxxwwVar) {
                socketCqumvgiudr = cqumvgiudr();
            }
            if (this.f79006istkbnxepw == null) {
                if (socketCqumvgiudr != null) {
                    mk.rgvfuqvkyq.lqeggnwhkg(socketCqumvgiudr);
                }
                this.f79002cqumvgiudr.gtknphoqwx(this, dxjokdxxwwVar);
            } else if (socketCqumvgiudr != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionPmvmpeiblj = pmvmpeiblj(iOException);
        if (iOException != null) {
            oxmwwwfdhm oxmwwwfdhmVar = this.f79002cqumvgiudr;
            zdlpuopuiu.lqeggnwhkg(iOExceptionPmvmpeiblj);
            oxmwwwfdhmVar.wkgbmnqykc(this, iOExceptionPmvmpeiblj);
        } else {
            this.f79002cqumvgiudr.ppxfxbqfkf(this);
        }
        return iOExceptionPmvmpeiblj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zynmafqrjb() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(btonecajqb() ? "canceled " : "");
        sb3.append(this.f79008jyumaefscl ? "web socket" : "call");
        sb3.append(" to ");
        sb3.append(iwizpuwonk());
        return sb3.toString();
    }

    public final oxmwwwfdhm agtfadlqog() {
        return this.f79002cqumvgiudr;
    }

    @Override // lk.eablkybsjg
    public boolean btonecajqb() {
        return this.f79016ylkuphrtab;
    }

    @Override // lk.eablkybsjg
    public void cancel() {
        if (this.f79016ylkuphrtab) {
            return;
        }
        this.f79016ylkuphrtab = true;
        qk.ppxfxbqfkf ppxfxbqfkfVar = this.f79011pkzmftpjix;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.zoijcleaow();
        }
        Iterator it = this.f79004hcddaimhww.iterator();
        while (it.hasNext()) {
            ((agtfadlqog.zoijcleaow) it.next()).cancel();
        }
        this.f79002cqumvgiudr.gxszxtbevo(this);
    }

    public final Socket cqumvgiudr() {
        dxjokdxxww dxjokdxxwwVar = this.f79006istkbnxepw;
        zdlpuopuiu.lqeggnwhkg(dxjokdxxwwVar);
        if (mk.rgvfuqvkyq.f67370eablkybsjg && !Thread.holdsLock(dxjokdxxwwVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dxjokdxxwwVar);
        }
        List listDxjokdxxww = dxjokdxxwwVar.dxjokdxxww();
        Iterator it = listDxjokdxxww.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (zdlpuopuiu.eablkybsjg(((Reference) it.next()).get(), this)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listDxjokdxxww.remove(i13);
        this.f79006istkbnxepw = null;
        if (listDxjokdxxww.isEmpty()) {
            dxjokdxxwwVar.jyumaefscl(System.nanoTime());
            if (this.f79007iwizpuwonk.ppxfxbqfkf(dxjokdxxwwVar)) {
                return dxjokdxxwwVar.cqumvgiudr();
            }
        }
        return null;
    }

    public final lereixgezr draadjrbmk() {
        return this.f79017zdlpuopuiu;
    }

    @Override // lk.eablkybsjg
    public zynmafqrjb dxjokdxxww() {
        return this.f79015yggfygwlhe;
    }

    public final boolean esjtqupxsv() {
        qk.ppxfxbqfkf ppxfxbqfkfVar = this.f79011pkzmftpjix;
        if (ppxfxbqfkfVar != null && ppxfxbqfkfVar.gtknphoqwx()) {
            wkgbmnqykc wkgbmnqykcVar = this.f79018zynmafqrjb;
            zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
            agtfadlqog agtfadlqogVarZoijcleaow = wkgbmnqykcVar.zoijcleaow();
            qk.ppxfxbqfkf ppxfxbqfkfVar2 = this.f79011pkzmftpjix;
            if (agtfadlqogVarZoijcleaow.gxszxtbevo(ppxfxbqfkfVar2 != null ? ppxfxbqfkfVar2.nufgyqmvbu() : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // lk.eablkybsjg
    public cdpycssgdh execute() {
        if (!this.f79009lereixgezr.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f79003esjtqupxsv.jyumaefscl();
        eablkybsjg();
        try {
            this.f79017zdlpuopuiu.agtfadlqog().zoijcleaow(this);
            return kcexrzcfyt();
        } finally {
            this.f79017zdlpuopuiu.agtfadlqog().lqeggnwhkg(this);
        }
    }

    @Override // lk.eablkybsjg
    public void f(lk.gxszxtbevo responseCallback) {
        zdlpuopuiu.btonecajqb(responseCallback, "responseCallback");
        if (!this.f79009lereixgezr.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        eablkybsjg();
        this.f79017zdlpuopuiu.agtfadlqog().iobyxmoadg(new iobyxmoadg(this, responseCallback));
    }

    public final void gtknphoqwx(boolean z13) {
        qk.ppxfxbqfkf ppxfxbqfkfVar;
        synchronized (this) {
            if (!this.f79013wwaezpbzkn) {
                throw new IllegalStateException("released");
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        if (z13 && (ppxfxbqfkfVar = this.f79011pkzmftpjix) != null) {
            ppxfxbqfkfVar.wkgbmnqykc();
        }
        this.f79014yadqdtsiqt = null;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public lk.eablkybsjg clone() {
        return new nufgyqmvbu(this.f79017zdlpuopuiu, this.f79015yggfygwlhe, this.f79008jyumaefscl);
    }

    public final String iwizpuwonk() {
        return this.f79015yggfygwlhe.gtknphoqwx().oxmwwwfdhm();
    }

    public final IOException jyumaefscl(IOException iOException) {
        boolean z13;
        synchronized (this) {
            try {
                z13 = false;
                if (this.f79013wwaezpbzkn) {
                    this.f79013wwaezpbzkn = false;
                    if (!this.f79005iozdgvuglv && !this.f79010lmojexxdyd) {
                        z13 = true;
                    }
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13 ? wkgbmnqykc(iOException) : iOException;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    public final cdpycssgdh kcexrzcfyt() throws Throwable {
        ArrayList arrayList = new ArrayList();
        hg.jyumaefscl.istkbnxepw(arrayList, this.f79017zdlpuopuiu.iwizpuwonk());
        arrayList.add(new rk.btonecajqb(this.f79017zdlpuopuiu));
        arrayList.add(new rk.iobyxmoadg(this.f79017zdlpuopuiu.wflxmlrfwp()));
        this.f79017zdlpuopuiu.gxszxtbevo();
        arrayList.add(new ok.iobyxmoadg(null));
        arrayList.add(qk.iobyxmoadg.f79000iobyxmoadg);
        if (!this.f79008jyumaefscl) {
            hg.jyumaefscl.istkbnxepw(arrayList, this.f79017zdlpuopuiu.esjtqupxsv());
        }
        arrayList.add(new rk.zoijcleaow(this.f79008jyumaefscl));
        boolean z13 = false;
        try {
            cdpycssgdh cdpycssgdhVarZoijcleaow = new rk.lqeggnwhkg(this, arrayList, 0, null, this.f79015yggfygwlhe, this.f79017zdlpuopuiu.btonecajqb(), this.f79017zdlpuopuiu.iozdgvuglv(), this.f79017zdlpuopuiu.hcddaimhww()).zoijcleaow(this.f79015yggfygwlhe);
            if (btonecajqb()) {
                mk.wflxmlrfwp.gxszxtbevo(cdpycssgdhVarZoijcleaow);
                throw new IOException("Canceled");
            }
            jyumaefscl(null);
            return cdpycssgdhVarZoijcleaow;
        } catch (IOException e13) {
            try {
                IOException iOExceptionJyumaefscl = jyumaefscl(e13);
                zdlpuopuiu.nufgyqmvbu(iOExceptionJyumaefscl, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionJyumaefscl;
            } catch (Throwable th2) {
                th = th2;
                z13 = true;
                if (!z13) {
                    jyumaefscl(null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (!z13) {
                jyumaefscl(null);
            }
            throw th;
        }
    }

    public final void lereixgezr() {
        if (this.f79001cdpycssgdh) {
            throw new IllegalStateException("Check failed.");
        }
        this.f79001cdpycssgdh = true;
        this.f79003esjtqupxsv.iwizpuwonk();
    }

    public final void nufgyqmvbu(zynmafqrjb request, boolean z13, rk.lqeggnwhkg chain) {
        zdlpuopuiu.btonecajqb(request, "request");
        zdlpuopuiu.btonecajqb(chain, "chain");
        if (this.f79014yadqdtsiqt != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f79010lmojexxdyd) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f79005iozdgvuglv) {
                throw new IllegalStateException("Check failed.");
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        if (z13) {
            gtknphoqwx gtknphoqwxVar = new gtknphoqwx(this.f79017zdlpuopuiu, lqeggnwhkg(request.gtknphoqwx()), this, chain);
            this.f79018zynmafqrjb = this.f79017zdlpuopuiu.vdvldrhtss() ? new gxszxtbevo(gtknphoqwxVar, this.f79017zdlpuopuiu.yggfygwlhe()) : new rgvfuqvkyq(gtknphoqwxVar);
        }
    }

    public final boolean ojitshcjhn() {
        return this.f79008jyumaefscl;
    }

    public final CopyOnWriteArrayList oxmwwwfdhm() {
        return this.f79004hcddaimhww;
    }

    public final void ppxfxbqfkf(dxjokdxxww connection) {
        zdlpuopuiu.btonecajqb(connection, "connection");
        if (!mk.rgvfuqvkyq.f67370eablkybsjg || Thread.holdsLock(connection)) {
            if (this.f79006istkbnxepw != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f79006istkbnxepw = connection;
            connection.dxjokdxxww().add(new zoijcleaow(this, this.f79012pmvmpeiblj));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final qk.ppxfxbqfkf rgvfuqvkyq() {
        return this.f79014yadqdtsiqt;
    }

    public final zynmafqrjb vdvldrhtss() {
        return this.f79015yggfygwlhe;
    }

    public final dxjokdxxww wflxmlrfwp() {
        return this.f79006istkbnxepw;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException yggfygwlhe(qk.ppxfxbqfkf exchange, boolean z13, boolean z14, IOException iOException) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        zdlpuopuiu.btonecajqb(exchange, "exchange");
        if (!zdlpuopuiu.eablkybsjg(exchange, this.f79011pkzmftpjix)) {
            return iOException;
        }
        synchronized (this) {
            z15 = false;
            if (z13) {
                try {
                    if (this.f79005iozdgvuglv) {
                        if (z13) {
                            this.f79005iozdgvuglv = false;
                        }
                        if (z14) {
                            this.f79010lmojexxdyd = false;
                        }
                        z17 = this.f79005iozdgvuglv;
                        if (z17) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (!z17) {
                            z15 = true;
                        }
                        z16 = z15;
                        z15 = z18;
                    } else if (z14 || !this.f79010lmojexxdyd) {
                        z16 = false;
                    } else {
                        if (z13) {
                            this.f79005iozdgvuglv = false;
                        }
                        if (z14) {
                            this.f79010lmojexxdyd = false;
                        }
                        z17 = this.f79005iozdgvuglv;
                        if (z17 || this.f79010lmojexxdyd) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        if (!z17 && !this.f79010lmojexxdyd && !this.f79013wwaezpbzkn) {
                            z15 = true;
                        }
                        z16 = z15;
                        z15 = z18;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (z14) {
                }
                z16 = false;
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        if (z15) {
            this.f79011pkzmftpjix = null;
            dxjokdxxww dxjokdxxwwVar = this.f79006istkbnxepw;
            if (dxjokdxxwwVar != null) {
                dxjokdxxwwVar.agtfadlqog();
            }
        }
        return z16 ? wkgbmnqykc(iOException) : iOException;
    }

    public final qk.ppxfxbqfkf zdlpuopuiu(rk.lqeggnwhkg chain) throws IOException {
        zdlpuopuiu.btonecajqb(chain, "chain");
        synchronized (this) {
            if (!this.f79013wwaezpbzkn) {
                throw new IllegalStateException("released");
            }
            if (this.f79010lmojexxdyd) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f79005iozdgvuglv) {
                throw new IllegalStateException("Check failed.");
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        wkgbmnqykc wkgbmnqykcVar = this.f79018zynmafqrjb;
        zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
        qk.ppxfxbqfkf ppxfxbqfkfVar = new qk.ppxfxbqfkf(this, this.f79002cqumvgiudr, wkgbmnqykcVar, wkgbmnqykcVar.iobyxmoadg().oxmwwwfdhm(this.f79017zdlpuopuiu, chain));
        this.f79014yadqdtsiqt = ppxfxbqfkfVar;
        this.f79011pkzmftpjix = ppxfxbqfkfVar;
        synchronized (this) {
            this.f79005iozdgvuglv = true;
            this.f79010lmojexxdyd = true;
        }
        if (this.f79016ylkuphrtab) {
            throw new IOException("Canceled");
        }
        return ppxfxbqfkfVar;
    }
}
