package org.xbill.DNS;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
abstract class ixidwrxhsl extends skhdrjzrfn {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int f74400btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final SecureRandom f74401draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final int f74403gtknphoqwx;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final am.iobyxmoadg f74402dxjokdxxww = am.zoijcleaow.dxjokdxxww(ixidwrxhsl.class);

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final Queue f74404wflxmlrfwp = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final Queue f74399agtfadlqog = new ConcurrentLinkedQueue();

    /* JADX INFO: Access modifiers changed from: private */
    static class iobyxmoadg implements skhdrjzrfn.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final DatagramChannel f74405eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final CompletableFuture f74406gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f74407iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f74408ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final long f74409wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final byte[] f74410zoijcleaow;

        public iobyxmoadg(int i13, byte[] bArr, int i14, long j13, DatagramChannel datagramChannel, CompletableFuture completableFuture) {
            this.f74407iobyxmoadg = i13;
            this.f74410zoijcleaow = bArr;
            this.f74408ppxfxbqfkf = i14;
            this.f74409wkgbmnqykc = j13;
            this.f74405eablkybsjg = datagramChannel;
            this.f74406gxszxtbevo = completableFuture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gxszxtbevo(Exception exc) {
            nufgyqmvbu();
            this.f74406gxszxtbevo.completeExceptionally(exc);
        }

        private void nufgyqmvbu() {
            try {
                this.f74405eablkybsjg.disconnect();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    this.f74405eablkybsjg.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                this.f74405eablkybsjg.close();
            } catch (IOException unused3) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void wkgbmnqykc(iobyxmoadg iobyxmoadgVar, Exception exc) {
            iobyxmoadgVar.gxszxtbevo(exc);
        }

        @Override // org.xbill.DNS.skhdrjzrfn.iobyxmoadg
        public void iobyxmoadg(SelectionKey selectionKey) {
            if (!selectionKey.isReadable()) {
                gxszxtbevo(new EOFException("Key for transaction " + this.f74407iobyxmoadg + " is not readable"));
                ixidwrxhsl.f74399agtfadlqog.remove(this);
                return;
            }
            DatagramChannel datagramChannel = (DatagramChannel) selectionKey.channel();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f74408ppxfxbqfkf);
            try {
                int i13 = datagramChannel.read(byteBufferAllocate);
                if (i13 <= 0) {
                    throw new EOFException();
                }
                byteBufferAllocate.flip();
                byte[] bArr = new byte[i13];
                System.arraycopy(byteBufferAllocate.array(), 0, bArr, 0, i13);
                skhdrjzrfn.draadjrbmk("UDP read: transaction id=" + this.f74407iobyxmoadg, datagramChannel.socket().getLocalSocketAddress(), datagramChannel.socket().getRemoteSocketAddress(), bArr);
                nufgyqmvbu();
                this.f74406gxszxtbevo.complete(bArr);
                ixidwrxhsl.f74399agtfadlqog.remove(this);
            } catch (IOException e13) {
                gxszxtbevo(e13);
                ixidwrxhsl.f74399agtfadlqog.remove(this);
            }
        }

        void lqeggnwhkg() throws IOException {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f74410zoijcleaow);
            skhdrjzrfn.draadjrbmk("UDP write: transaction id=" + this.f74407iobyxmoadg, this.f74405eablkybsjg.socket().getLocalSocketAddress(), this.f74405eablkybsjg.socket().getRemoteSocketAddress(), this.f74410zoijcleaow);
            DatagramChannel datagramChannel = this.f74405eablkybsjg;
            int iSend = datagramChannel.send(byteBufferWrap, datagramChannel.socket().getRemoteSocketAddress());
            if (iSend == 0) {
                throw new EOFException("Insufficient room for the datagram in the underlying output buffer for transaction " + this.f74407iobyxmoadg);
            }
            if (iSend >= this.f74410zoijcleaow.length) {
                return;
            }
            throw new EOFException("Could not send all data for transaction " + this.f74407iobyxmoadg);
        }
    }

    static {
        int i13;
        int i14;
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            i13 = 32768;
            i14 = 60999;
        } else {
            i13 = 49152;
            i14 = 65535;
        }
        int iIntValue = Integer.getInteger("dnsjava.udp.ephemeral.start", i13).intValue();
        f74400btonecajqb = iIntValue;
        f74403gtknphoqwx = Integer.getInteger("dnsjava.udp.ephemeral.end", i14).intValue() - iIntValue;
        if (Boolean.getBoolean("dnsjava.udp.ephemeral.use_ephemeral_port")) {
            f74401draadjrbmk = null;
        } else {
            f74401draadjrbmk = new SecureRandom();
        }
        skhdrjzrfn.btonecajqb(new Runnable() { // from class: org.xbill.DNS.fyldjkxazc
            @Override // java.lang.Runnable
            public final void run() {
                ixidwrxhsl.yggfygwlhe();
            }
        }, false);
        skhdrjzrfn.gtknphoqwx(new Runnable() { // from class: org.xbill.DNS.ipoelvxyzq
            @Override // java.lang.Runnable
            public final void run() {
                ixidwrxhsl.oxmwwwfdhm();
            }
        }, false);
        skhdrjzrfn.dxjokdxxww(new Runnable() { // from class: org.xbill.DNS.grlcpdaxtj
            @Override // java.lang.Runnable
            public final void run() {
                ixidwrxhsl.kcexrzcfyt();
            }
        }, false);
    }

    static CompletableFuture jyumaefscl(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, zfvoamnweg zfvoamnwegVar, byte[] bArr, int i13, Duration duration) {
        InetSocketAddress inetSocketAddress3;
        SecureRandom secureRandom;
        long jNanoTime = System.nanoTime() + duration.toNanos();
        CompletableFuture completableFuture = new CompletableFuture();
        DatagramChannel datagramChannel = null;
        try {
            Selector selectorNufgyqmvbu = skhdrjzrfn.nufgyqmvbu();
            DatagramChannel datagramChannelOpen = DatagramChannel.open();
            int i14 = 0;
            try {
                datagramChannelOpen.configureBlocking(false);
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(zfvoamnwegVar.ppxfxbqfkf().gxszxtbevo(), bArr, i13, jNanoTime, datagramChannelOpen, completableFuture);
                if (inetSocketAddress == null || inetSocketAddress.getPort() == 0) {
                    while (true) {
                        if (i14 >= 1024) {
                            iobyxmoadgVar.gxszxtbevo(new IOException("No available source port found"));
                            return completableFuture;
                        }
                        try {
                            if (inetSocketAddress == null) {
                                SecureRandom secureRandom2 = f74401draadjrbmk;
                                inetSocketAddress3 = secureRandom2 != null ? new InetSocketAddress(secureRandom2.nextInt(f74403gtknphoqwx) + f74400btonecajqb) : null;
                            } else {
                                int port = inetSocketAddress.getPort();
                                if (port == 0 && (secureRandom = f74401draadjrbmk) != null) {
                                    port = secureRandom.nextInt(f74403gtknphoqwx) + f74400btonecajqb;
                                }
                                inetSocketAddress3 = new InetSocketAddress(inetSocketAddress.getAddress(), port);
                            }
                            datagramChannelOpen.bind((SocketAddress) inetSocketAddress3);
                            break;
                        } catch (SocketException unused) {
                            i14++;
                        }
                    }
                }
                datagramChannelOpen.connect(inetSocketAddress2);
                f74399agtfadlqog.add(iobyxmoadgVar);
                f74404wflxmlrfwp.add(iobyxmoadgVar);
                selectorNufgyqmvbu.wakeup();
            } catch (IOException e13) {
                e = e13;
                datagramChannel = datagramChannelOpen;
                if (datagramChannel != null) {
                    try {
                        datagramChannel.close();
                    } catch (IOException unused2) {
                    }
                }
                completableFuture.completeExceptionally(e);
            }
        } catch (IOException e14) {
            e = e14;
        }
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kcexrzcfyt() {
        f74404wflxmlrfwp.clear();
        final EOFException eOFException = new EOFException("Client is closing");
        Queue queue = f74399agtfadlqog;
        queue.forEach(new Consumer() { // from class: org.xbill.DNS.mhtqkkgtqm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ixidwrxhsl.iobyxmoadg.wkgbmnqykc((ixidwrxhsl.iobyxmoadg) obj, eOFException);
            }
        });
        queue.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oxmwwwfdhm() {
        Iterator it = f74399agtfadlqog.iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) it.next();
            if (iobyxmoadgVar.f74409wkgbmnqykc - System.nanoTime() < 0) {
                iobyxmoadgVar.gxszxtbevo(new SocketTimeoutException("Query timed out"));
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yggfygwlhe() {
        while (true) {
            Queue queue = f74404wflxmlrfwp;
            if (queue.isEmpty()) {
                return;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) queue.remove();
            try {
                f74402dxjokdxxww.zdlpuopuiu("Registering OP_READ for transaction with id {}", Integer.valueOf(iobyxmoadgVar.f74407iobyxmoadg));
                iobyxmoadgVar.f74405eablkybsjg.register(skhdrjzrfn.nufgyqmvbu(), 1, iobyxmoadgVar);
                iobyxmoadgVar.lqeggnwhkg();
            } catch (IOException e13) {
                iobyxmoadgVar.gxszxtbevo(e13);
            }
        }
    }
}
