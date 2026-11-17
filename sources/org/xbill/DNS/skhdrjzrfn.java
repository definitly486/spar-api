package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class skhdrjzrfn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static Thread f74506eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static Thread f74507gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static volatile Selector f74509lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static volatile boolean f74510nufgyqmvbu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final am.iobyxmoadg f74508iobyxmoadg = am.zoijcleaow.dxjokdxxww(skhdrjzrfn.class);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Runnable[] f74513zoijcleaow = new Runnable[2];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Runnable[] f74511ppxfxbqfkf = new Runnable[2];

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Runnable[] f74512wkgbmnqykc = new Runnable[2];

    interface iobyxmoadg {
        void iobyxmoadg(SelectionKey selectionKey);
    }

    static synchronized void btonecajqb(Runnable runnable, boolean z13) {
        zoijcleaow(f74511ppxfxbqfkf, runnable, z13);
    }

    static void draadjrbmk(String str, SocketAddress socketAddress, SocketAddress socketAddress2, byte[] bArr) {
        am.iobyxmoadg iobyxmoadgVar = f74508iobyxmoadg;
        if (iobyxmoadgVar.draadjrbmk()) {
            iobyxmoadgVar.lereixgezr(km.wkgbmnqykc.iobyxmoadg(str, bArr));
        }
    }

    static synchronized void dxjokdxxww(Runnable runnable, boolean z13) {
        zoijcleaow(f74512wkgbmnqykc, runnable, z13);
    }

    private static void eablkybsjg() {
        Iterator<SelectionKey> it = f74509lqeggnwhkg.selectedKeys().iterator();
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            ((iobyxmoadg) next.attachment()).iobyxmoadg(next);
        }
    }

    static synchronized void gtknphoqwx(Runnable runnable, boolean z13) {
        zoijcleaow(f74513zoijcleaow, runnable, z13);
    }

    static void gxszxtbevo() {
        int iIntValue = Integer.getInteger("dnsjava.nio.selector_timeout", 1000).intValue();
        if (iIntValue <= 0 || iIntValue > 1000) {
            throw new IllegalArgumentException("Invalid selector_timeout, must be between 1 and 1000");
        }
        while (f74510nufgyqmvbu) {
            try {
                if (f74509lqeggnwhkg.select(iIntValue) == 0) {
                    lqeggnwhkg(f74513zoijcleaow);
                }
                if (f74510nufgyqmvbu) {
                    lqeggnwhkg(f74511ppxfxbqfkf);
                    eablkybsjg();
                }
            } catch (IOException e13) {
                f74508iobyxmoadg.iobyxmoadg("A selection operation failed", e13);
            } catch (ClosedSelectorException unused) {
            }
        }
        f74508iobyxmoadg.wkgbmnqykc("dnsjava NIO selector thread stopped");
    }

    private static synchronized void lqeggnwhkg(Runnable[] runnableArr) {
        try {
            Runnable runnable = runnableArr[0];
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = runnableArr[1];
            if (runnable2 != null) {
                runnable2.run();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static Selector nufgyqmvbu() {
        if (f74509lqeggnwhkg == null) {
            synchronized (skhdrjzrfn.class) {
                try {
                    if (f74509lqeggnwhkg == null) {
                        f74509lqeggnwhkg = Selector.open();
                        f74508iobyxmoadg.wkgbmnqykc("Starting dnsjava NIO selector thread");
                        f74510nufgyqmvbu = true;
                        Thread thread = new Thread(new Runnable() { // from class: org.xbill.DNS.iwxlajgraz
                            @Override // java.lang.Runnable
                            public final void run() {
                                skhdrjzrfn.gxszxtbevo();
                            }
                        });
                        f74506eablkybsjg = thread;
                        thread.setDaemon(true);
                        f74506eablkybsjg.setName("dnsjava NIO selector");
                        f74506eablkybsjg.start();
                        Thread thread2 = new Thread(new Runnable() { // from class: org.xbill.DNS.dvvnrvtcbc
                            @Override // java.lang.Runnable
                            public final void run() {
                                skhdrjzrfn.ppxfxbqfkf(true);
                            }
                        });
                        f74507gxszxtbevo = thread2;
                        thread2.setName("dnsjava NIO shutdown hook");
                        Runtime.getRuntime().addShutdownHook(f74507gxszxtbevo);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f74509lqeggnwhkg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ppxfxbqfkf(boolean z13) {
        f74510nufgyqmvbu = false;
        if (!z13) {
            try {
                Runtime.getRuntime().removeShutdownHook(f74507gxszxtbevo);
            } catch (Exception unused) {
                f74508iobyxmoadg.cqumvgiudr("Failed to remove shutdown hook, ignoring and continuing close");
            }
        }
        try {
            lqeggnwhkg(f74512wkgbmnqykc);
        } catch (Exception e13) {
            f74508iobyxmoadg.ojitshcjhn("Failed to execute shutdown task, ignoring and continuing close", e13);
        }
        f74509lqeggnwhkg.wakeup();
        try {
            f74509lqeggnwhkg.close();
        } catch (IOException e14) {
            f74508iobyxmoadg.ojitshcjhn("Failed to properly close selector, ignoring and continuing close", e14);
        }
        try {
            try {
                f74506eablkybsjg.join();
                synchronized (skhdrjzrfn.class) {
                    f74509lqeggnwhkg = null;
                    f74506eablkybsjg = null;
                    f74507gxszxtbevo = null;
                }
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                synchronized (skhdrjzrfn.class) {
                    f74509lqeggnwhkg = null;
                    f74506eablkybsjg = null;
                    f74507gxszxtbevo = null;
                }
            }
        } catch (Throwable th2) {
            synchronized (skhdrjzrfn.class) {
                f74509lqeggnwhkg = null;
                f74506eablkybsjg = null;
                f74507gxszxtbevo = null;
                throw th2;
            }
        }
    }

    private static void zoijcleaow(Runnable[] runnableArr, Runnable runnable, boolean z13) {
        if (z13) {
            runnableArr[0] = runnable;
        } else {
            runnableArr[1] = runnable;
        }
    }
}
